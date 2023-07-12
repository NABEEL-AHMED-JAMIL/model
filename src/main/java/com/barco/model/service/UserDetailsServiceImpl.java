package com.barco.model.service;

import com.barco.model.util.lookuputil.APPLICATION_STATUS;
import com.barco.model.pojo.AppUser;
import com.barco.model.repository.AppUserRepository;
import com.barco.model.repository.LookupDataRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


/**
 * @author Nabeel Ahmed
 */
@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    private Logger logger = LoggerFactory.getLogger(UserDetailsServiceImpl.class);

    @Autowired
    private AppUserRepository appUserRepository;
    @Autowired
    private LookupDataRepository lookupDataRepository;

    /**
     * loadUserByUsername method provide the auth user detail
     * @param username
     * @return UserDetails
     * */
    @Override
    @Transactional
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        AppUser appUser = this.appUserRepository.findByUsernameAndStatus(username, APPLICATION_STATUS.ACTIVE.getLookupCode())
            .orElseThrow(() -> new UsernameNotFoundException("User Not Found with username: " + username));
        return UserDetailsImpl.build(appUser);
    }
}
