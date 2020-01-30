package com.barco.model.repository;

import com.barco.model.enums.Status;
import com.barco.model.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * @author Nabeel.amd
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {

     public Optional<User> findByUsernameAndStatus(String username, Status status);
}
