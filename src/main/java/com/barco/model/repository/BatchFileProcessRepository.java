package com.barco.model.repository;

import com.barco.model.pojo.BatchFileProcess;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Nabeel Ahmed
 */
@Repository
public interface BatchFileProcessRepository extends JpaRepository<BatchFileProcess, Long> {
}
