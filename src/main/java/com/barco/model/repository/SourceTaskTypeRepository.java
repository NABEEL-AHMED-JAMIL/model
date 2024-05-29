package com.barco.model.repository;

import com.barco.model.pojo.AppUser;
import com.barco.model.pojo.Credential;
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

    public List<SourceTaskType> findAllByIdIn(List<Long> ids);

    public List<SourceTaskType> findAllByIdInAndStatusNot(List<Long> ids, APPLICATION_STATUS status);

    public Long countByCredentialAndStatusNot(Credential credential, APPLICATION_STATUS status);

    public Optional<SourceTaskType> findByIdAndCreatedByAndStatusNot(Long id, AppUser appUser, APPLICATION_STATUS status);

    public List<SourceTaskType> findAllByCreatedByAndStatusNotOrderByDateCreatedDesc(AppUser createdBy, APPLICATION_STATUS status);

    public List<SourceTaskType> findAllByDateCreatedBetweenAndCreatedByAndStatusNotOrderByDateCreatedDesc(
            Date startDate, Date endDate, AppUser createdBy, APPLICATION_STATUS status);
}
