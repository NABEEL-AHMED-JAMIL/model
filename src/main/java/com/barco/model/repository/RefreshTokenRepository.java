package com.barco.model.repository;

import com.barco.model.pojo.RefreshToken;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import java.util.Optional;

/**
 * @author Nabeel Ahmed
 */
@Repository
@Transactional
public interface RefreshTokenRepository extends CrudRepository<RefreshToken, Long> {

    public Optional<RefreshToken> findByTokenAndStatus(String token, Long status);

}
