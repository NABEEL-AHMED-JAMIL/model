package com.barco.model.repository;

import com.barco.model.pojo.AccessScreenForm;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Nabeel Ahmed
 */
@Repository
public interface AccessServiceFormRepository extends JpaRepository<AccessScreenForm, Long> {
}
