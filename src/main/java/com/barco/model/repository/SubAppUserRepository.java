package com.barco.model.repository;

import com.barco.model.pojo.SubAppUser;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Nabeel Ahmed
 */
@Repository
public interface SubAppUserRepository extends CrudRepository<SubAppUser, Long> {
}
