package com.barco.model.service;


import com.barco.model.enums.Status;
import com.barco.model.pojo.Authority;
import com.barco.model.pojo.User;
import com.barco.model.repository.AuthorityRepository;
import com.barco.model.repository.UserRepository;
import com.barco.model.repository.UserVerificationRepository;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * @author Nabeel.amd
 */
@Service
@Scope("prototype")
public class UserService {

    public Logger logger = LogManager.getLogger(UserService.class);

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private UserVerificationRepository userVerificationRepository;
    @Autowired
    private AuthorityRepository authorityRepository;

    public Optional<User> findByUsernameAndStatus(String username) {
        logger.info("Finding User By Username and Status");
        return this.userRepository.findByUsernameAndStatus(username, Status.Active);
    }

    public User saveUserProfile(User user) {
        logger.info("Save New User");
        return this.userRepository.save(user);
    }

    public Authority saveAuthority(Authority authority) {
        logger.info("Save New Authority");
        return this.authorityRepository.save(authority);
    }

    public List<Authority> getAllAuthority() {
        logger.info("Get All Authority");
        return this.authorityRepository.findAll();
    }

    public Authority getAuthorityByRoleName(String roleName) {
        logger.info("Get Authority By RoleName");
        return this.authorityRepository.findByRole(roleName).get();
    }

    public Authority getAuthorityById(Long id) {
        logger.info("Get Authority By Id");
        return this.authorityRepository.findById(id).get();
    }
}