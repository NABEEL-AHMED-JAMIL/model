package com.barco.model.repository;

import com.barco.model.pojo.Organization;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Nabeel Ahmed
 */
@Repository
public interface OrganizationRepository extends CrudRepository<Organization, Long> {
}
