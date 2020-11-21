package com.barco.model.repository;


import com.barco.model.pojo.NotificationClient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * @author Nabeel Ahmed
 */
@Repository
public interface NotificationClientRepository extends JpaRepository<NotificationClient, Long> {

    Optional<NotificationClient> findByClientPath(String clientPath);

    Optional<NotificationClient> findByTopicId(String topicId);

    NotificationClient findByCreatedBy(Long appUserId);

}
