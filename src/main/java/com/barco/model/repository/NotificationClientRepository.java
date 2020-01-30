package com.barco.model.repository;

import com.barco.model.enums.Status;
import com.barco.model.pojo.NotificationClient;
import com.barco.model.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * @author Nabeel.amd
 */
@Repository
public interface NotificationClientRepository extends JpaRepository<NotificationClient, Long> {

    public Optional<NotificationClient> findByMemberIdAndStatus(User user, Status status);
}
