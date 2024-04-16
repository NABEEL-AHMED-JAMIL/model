package com.barco.model.repository;

import com.barco.model.pojo.NotificationAudit;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Nabeel Ahmed
 */
@Repository
public interface NotificationAuditRepository extends CrudRepository<NotificationAudit, Long>,
    JpaSpecificationExecutor<NotificationAudit> {
}
