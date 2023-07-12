package com.barco.model.service;

import com.barco.model.dto.request.TokenRefreshRequest;
import com.barco.model.dto.response.AppResponse;
import com.barco.model.util.lookuputil.APPLICATION_STATUS;
import com.barco.model.pojo.RefreshToken;
import com.barco.model.repository.AppUserRepository;
import com.barco.model.repository.RefreshTokenRepository;
import com.barco.model.util.ProcessUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import java.time.Instant;
import java.util.Optional;
import java.util.UUID;

/**
 * @author Nabeel Ahmed
 */
@Service
public class RefreshTokenService {

    @Value("${app.jwtRefreshExpirationMs}")
    private Long refreshTokenDurationMs;
    @Autowired
    private RefreshTokenRepository refreshTokenRepository;
    @Autowired
    private AppUserRepository appUserRepository;

    /**
     * findByToken use for get the refresh token from db
     * @param token
     * @return Optional<RefreshToken>
     * */
    public Optional<RefreshToken> findByToken(String token) {
        return this.refreshTokenRepository.findByTokenAndStatus(
            token, APPLICATION_STATUS.ACTIVE.getLookupCode());
    }

    /**
     * createRefreshToken use to create refresh token into db
     * @param userId
     * @return RefreshToken
     * */
    public RefreshToken createRefreshToken(Long userId, String ip) {
        RefreshToken refreshToken = new RefreshToken();
        refreshToken.setAppUser(this.appUserRepository.findById(userId).get());
        refreshToken.setExpiryDate(Instant.now().plusMillis(this.refreshTokenDurationMs));
        refreshToken.setToken(UUID.randomUUID().toString());
        refreshToken.setIpAddress(ip);
        refreshToken.setStatus(APPLICATION_STATUS.ACTIVE.getLookupCode());
        refreshToken = this.refreshTokenRepository.save(refreshToken);
        return refreshToken;
    }

    /**
     * verifyExpiration use to create refresh token into db
     * @param token
     * @return AppResponse
     * */
    public AppResponse verifyExpiration(RefreshToken token) {
        if (token.getExpiryDate().compareTo(Instant.now()) < 0) {
            token.setStatus(APPLICATION_STATUS.DELETE.getLookupCode());
            this.refreshTokenRepository.save(token);
            return new AppResponse(ProcessUtil.ERROR, "Refresh token was expired." +
                "Please make a new signing request" ,token);
        }
        return new AppResponse(ProcessUtil.SUCCESS, "Token valid and can be use." ,token);
    }

    /**
     * deleteRefreshToken use to delete refresh token from db
     * @param tokenRefreshRequest
     * @return AppResponse
     * */
    public AppResponse deleteRefreshToken(TokenRefreshRequest tokenRefreshRequest) {
        Optional<RefreshToken> refreshToken = this.findByToken(tokenRefreshRequest.getRefreshToken());
        if (refreshToken.isPresent()) {
            refreshToken.get().setStatus(APPLICATION_STATUS.DELETE.getLookupCode());
            this.refreshTokenRepository.save(refreshToken.get());
        }
        return new AppResponse(ProcessUtil.SUCCESS, "Token delete." ,tokenRefreshRequest);
    }

}