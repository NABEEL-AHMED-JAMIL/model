package com.barco.model.repository;

import com.barco.model.pojo.AppUserLinkSourceTaskType;
import com.barco.model.pojo.SourceTaskType;
import com.barco.model.util.lookup.APPLICATION_STATUS;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Nabeel Ahmed
 */
@Repository
public interface AppUserLinkSourceTaskTypeRepository extends CrudRepository<AppUserLinkSourceTaskType, Long> {

    public Long countBySourceTaskTypeAndStatusNot(SourceTaskType sourceTaskType, APPLICATION_STATUS status);
}
