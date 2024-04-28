package com.barco.model.repository;

import com.barco.model.pojo.AppUser;
import com.barco.model.pojo.GenForm;
import com.barco.model.util.lookup.APPLICATION_STATUS;
import com.barco.model.util.lookup.FORM_TYPE;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.Date;
import java.util.List;
import java.util.Optional;

/**
 * @author Nabeel Ahmed
 */
@Repository
public interface GenFormRepository extends CrudRepository<GenForm, Long> {

    public List<GenForm> findAllByIdIn(List<Long> ids);

    public List<GenForm> findAllByIdInAndStatusNot(List<Long> ids, APPLICATION_STATUS status);
    public List<GenForm> findAllByFormTypeAndStatusNot(FORM_TYPE formType, APPLICATION_STATUS status);
    public Optional<GenForm> findByIdAndCreatedByAndStatusNot(Long id, AppUser createdBy, APPLICATION_STATUS status);

    public List<GenForm> findAllByDateCreatedBetweenAndCreatedByAndStatusNotOrderByDateCreatedDesc(Date startDate, Date endDate, AppUser createdBy, APPLICATION_STATUS status);

    public List<GenForm> findAllByDateCreatedBetweenAndCreatedByAndIdInAndStatusNotOrderByDateCreatedDesc(
        Date startDate, Date endDate, AppUser createdBy, List<Long> ids, APPLICATION_STATUS status);

}
