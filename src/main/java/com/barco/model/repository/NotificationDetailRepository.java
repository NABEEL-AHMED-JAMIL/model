package com.barco.model.repository;

import com.barco.model.pojo.NotificationDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Nabeel.amd
 */
@Repository
public interface NotificationDetailRepository extends JpaRepository<NotificationDetail, Long> {
}