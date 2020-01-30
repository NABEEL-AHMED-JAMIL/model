package com.barco.model.repository;

import com.barco.model.pojo.UserVerification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Nabeel.amd
 */
@Repository
public interface UserVerificationRepository  extends JpaRepository<UserVerification, Long> {

}
