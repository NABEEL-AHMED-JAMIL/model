package com.barco.model.service;

import com.barco.model.enums.Status;
import com.barco.model.pojo.AppUser;
import com.barco.model.repository.AppUserRepository;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@Scope("prototype")
public class CustomUserDetailsService implements UserDetailsService {

    public Logger logger = LogManager.getLogger(CustomUserDetailsService.class);

    @Autowired
    private AppUserRepository appUserRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<AppUser> user = this.appUserRepository.findByUsernameAndStatus(username, Status.Active);
        if (!user.isPresent()) {
            throw new UsernameNotFoundException(String.format("No user found with username '%s'.", username));
        } else {
            return user.get();
        }
    }

}
