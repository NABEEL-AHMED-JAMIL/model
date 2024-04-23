package com.barco.model.repository;

import com.barco.model.pojo.AppUser;
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
public interface SourceTaskTypeRepository extends CrudRepository<SourceTaskType, Long> {

    public List<SourceTaskType> findAllByIdInAndStatusNot(List<Long> ids, APPLICATION_STATUS status);
    public List<SourceTaskType> findAllByIdIn(List<Long> ids);

    public Optional<SourceTaskType> findByIdAndCreatedByAndStatusNot(Long id, AppUser appUser, APPLICATION_STATUS status);

    public List<SourceTaskType> findAllByDateCreatedBetweenAndCreatedByAndStatusNotOrderByDateCreatedDesc(
            Date startDate, Date endDate, AppUser createdBy, APPLICATION_STATUS status);

    public List<SourceTaskType> findAllByDateCreatedBetweenAndCreatedByAndIdInAndStatusNotOrderByDateCreatedDesc(
            Date startDate, Date endDate, AppUser createdBy, List<Long> ids, APPLICATION_STATUS status);
}
