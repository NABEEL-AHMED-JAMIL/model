package com.barco.model.repository;

import com.barco.model.pojo.STTControl;
import com.barco.model.pojo.STTForm;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Nabeel Ahmed
 */
@Repository
@Transactional
public interface STTControlRepository extends CrudRepository<STTControl, Long> {
}
