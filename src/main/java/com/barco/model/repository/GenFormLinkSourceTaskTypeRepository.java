package com.barco.model.repository;

import com.barco.model.pojo.GenForm;
import com.barco.model.pojo.GenFormLinkSourceTaskType;
import com.barco.model.pojo.SourceTaskType;
import com.barco.model.util.lookup.APPLICATION_STATUS;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Nabeel Ahmed
 */
@Repository
public interface GenFormLinkSourceTaskTypeRepository extends CrudRepository<GenFormLinkSourceTaskType, Long> {

    public Long countByGenFormAndStatusNot(GenForm genForm, APPLICATION_STATUS status);
//    public Long countByGenSourceTaskTypeAndStatusNot(SourceTaskType sourceTaskType, APPLICATION_STATUS status);
}
