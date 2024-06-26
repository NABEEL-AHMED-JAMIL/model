package com.barco.model.security;

import com.barco.model.pojo.AppUser;
import com.barco.model.repository.AppUserRepository;
import com.barco.model.util.MessageUtil;
import com.barco.model.util.lookup.APPLICATION_STATUS;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;
import java.util.Optional;

/**
 * @author Nabeel Ahmed
 */
@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    private Logger logger = LoggerFactory.getLogger(UserDetailsServiceImpl.class);

    @Autowired
    private AppUserRepository appUserRepository;

    /**
     * loadUserByUsername method provide the auth user detail
     * user can Log in with email or username
     * @param username
     * @return UserDetails
     * */
    @Override
    @Transactional
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<AppUser> appUser = this.appUserRepository.findByUsernameAndStatus(username, APPLICATION_STATUS.ACTIVE);
        if (appUser.isPresent()) {
            return UserSessionDetail.build(appUser.get());
        }
        appUser = this.appUserRepository.findByEmailAndStatus(username, APPLICATION_STATUS.ACTIVE);
        if (appUser.isPresent()) {
            return UserSessionDetail.build(appUser.get());
        }
        throw new UsernameNotFoundException(String.format(MessageUtil.USER_NOT_FOUND, username));
    }
}
