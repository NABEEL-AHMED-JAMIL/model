package com.barco.model.repository;

import com.barco.model.pojo.AppUser;
import com.barco.model.pojo.SourceTask;
import com.barco.model.pojo.SourceTaskType;
import com.barco.model.util.lookup.APPLICATION_STATUS;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.Date;
import java.util.List;
import java.util.Optional;

/**
 * @author Nabeel Ahmed
 */
@Repository
public interface SourceTaskRepository extends CrudRepository<SourceTask, Long> {

    public List<SourceTask> findAllByIdIn(List<Long> ids);

    public Long countBySourceTaskTypeAndStatusNot(SourceTaskType sourceTaskType, APPLICATION_STATUS status);

    public Optional<SourceTask> findByIdAndCreatedByAndStatusNot(Long id, AppUser appUser, APPLICATION_STATUS status);

    public List<SourceTask> findAllByDateCreatedBetweenAndCreatedByAndStatusNotOrderByDateCreatedDesc(
        Date startDate, Date endDate, AppUser createdBy, APPLICATION_STATUS status);

}
