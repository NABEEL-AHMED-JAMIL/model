package com.barco.model.repository;

import com.barco.model.pojo.AppUser;
import com.barco.model.pojo.GenSection;
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
public interface GenSectionRepository extends CrudRepository<GenSection, Long> {

    public List<GenSection> findAllByIdIn(List<Long> ids);

    public List<GenSection> findAllByIdInAndStatusNot(List<Long> ids, APPLICATION_STATUS status);

    public Optional<GenSection> findByIdAndCreatedByAndStatusNot(Long id, AppUser createdBy, APPLICATION_STATUS status);

    public List<GenSection> findAllByDateCreatedBetweenAndCreatedByAndStatusNot(Date startDate, Date endDate, AppUser createdBy, APPLICATION_STATUS status);

    public List<GenSection> findAllByDateCreatedBetweenAndCreatedByAndIdInAndStatusNot(
        Date startDate, Date endDate, AppUser createdBy, List<Long> ids, APPLICATION_STATUS status);
}
