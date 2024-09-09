package com.barco.model.repository;

import com.barco.model.pojo.NotificationAudit;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * @author Nabeel Ahmed
 */
@Repository
public interface NotificationAuditRepository extends CrudRepository<NotificationAudit, Long>,
    JpaSpecificationExecutor<NotificationAudit> {

    public Optional<NotificationAudit> findByUuid(String uuid);
}
