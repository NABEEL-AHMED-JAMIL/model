package com.barco.model.repository;

import com.barco.model.pojo.AppUser;
import com.barco.model.util.lookup.APPLICATION_STATUS;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

/**
 * @author Nabeel Ahmed
 */
@Repository
public interface AppUserRepository extends CrudRepository<AppUser, Long> {

    public Optional<AppUser> findByIdAndStatus(Long id, APPLICATION_STATUS status);
    public Optional<AppUser> findByUsernameAndStatus(String username, APPLICATION_STATUS status);
    public Optional<AppUser> findByEmailAndStatus(String email, APPLICATION_STATUS status);

    public Boolean existsByUsername(String username);

    public Boolean existsByEmail(String email);

}
