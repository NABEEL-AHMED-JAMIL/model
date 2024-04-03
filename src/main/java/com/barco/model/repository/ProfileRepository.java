package com.barco.model.repository;

import com.barco.model.pojo.Profile;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

/**
 * @author Nabeel Ahmed
 */
@Repository
public interface ProfileRepository extends CrudRepository<Profile, Long> {

    public Optional<Profile> findProfileByProfileName(String profileName);
}
