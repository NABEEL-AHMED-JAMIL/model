package com.barco.model.repository;

import com.barco.model.pojo.EtlAccountRole;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Nabeel Ahmed
 */
@Repository
public interface EtlAccountRoleRepository extends CrudRepository<EtlAccountRole, Long> {
}
