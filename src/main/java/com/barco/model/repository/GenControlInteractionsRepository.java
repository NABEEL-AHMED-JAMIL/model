package com.barco.model.repository;

import com.barco.model.pojo.GenControlInteractions;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Nabeel Ahmed
 */
@Repository
public interface GenControlInteractionsRepository extends CrudRepository<GenControlInteractions, Long> {

}
