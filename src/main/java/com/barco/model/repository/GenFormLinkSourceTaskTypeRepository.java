package com.barco.model.repository;

import com.barco.model.pojo.GenForm;
import com.barco.model.pojo.GenFormLinkSourceTaskType;
import com.barco.model.pojo.SourceTaskType;
import com.barco.model.util.lookup.APPLICATION_STATUS;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Nabeel Ahmed
 */
@Repository
public interface GenFormLinkSourceTaskTypeRepository extends CrudRepository<GenFormLinkSourceTaskType, Long> {

    public Long countByGenFormAndStatusNot(GenForm genForm, APPLICATION_STATUS status);

    public Long countBySourceTaskTypeAndStatusNot(SourceTaskType sourceTaskType, APPLICATION_STATUS status);

    public List<GenFormLinkSourceTaskType> findAllByIdInAndStatusNot(List<Long> ids, APPLICATION_STATUS status);

}
