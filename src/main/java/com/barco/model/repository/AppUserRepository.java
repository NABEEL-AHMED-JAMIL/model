package com.barco.model.repository;

import com.barco.model.pojo.AppUser;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

/**
 * @author Nabeel Ahmed
 */
@Repository
public interface AppUserRepository extends CrudRepository<AppUser, Long> {

    public Optional<AppUser> findByAppUserIdAndStatus(Long appUserId, Long status);

    public Optional<AppUser> findByUsernameAndStatus(String username, Long status);

    public Optional<AppUser> findFirstByUsernameAndStatusNot(String username, Long status);

    public Optional<AppUser> findByEmailAndStatus(String email, Long status);

    public Boolean existsByUsername(String username);

    public Boolean existsByEmail(String email);

}
