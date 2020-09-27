package com.barco.model.repository;


import com.barco.model.pojo.AppUser;
import com.barco.model.pojo.NotificationClient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface NotificationClientRepository extends JpaRepository<NotificationClient, Long> {

    Optional<NotificationClient> findByClientPath(String clientPath);

    Optional<NotificationClient> findByTopicId(String topicId);

    NotificationClient findByAppUser(AppUser appUser);
    
}
