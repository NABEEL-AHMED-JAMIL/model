package com.barco.model.repository;

import com.barco.model.pojo.Authority;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * @author Nabeel.amd
 */
@Repository
public interface AuthorityRepository extends JpaRepository<Authority, Long> {

    public Optional<Authority> findByRole(String role);

}
