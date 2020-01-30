package com.barco.model.service;


import com.barco.model.enums.Status;
import com.barco.model.pojo.User;
import com.barco.model.repository.AuthorityRepository;
import com.barco.model.repository.UserRepository;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
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
    private AuthorityRepository authorityRepository;

    public Optional<User> findByUsernameAndStatus(String username) {
        logger.info("Finding User By Username and Status");
        return this.userRepository.findByUsernameAndStatus(username, Status.Active);
    }
}