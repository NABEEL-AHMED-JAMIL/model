package com.barco.model.repository;

import com.barco.model.pojo.AppUser;
import com.barco.model.pojo.GenControl;
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
public interface GenControlRepository extends CrudRepository<GenControl, Long> {

    public List<GenControl> findAllByIdIn(List<Long> ids);

    public List<GenControl> findAllByIdInAndStatusNot(List<Long> ids, APPLICATION_STATUS status);

    Optional<GenControl> findByIdAndCreatedByAndStatusNot(Long id, AppUser createdBy, APPLICATION_STATUS status);

    public List<GenControl> findAllByDateCreatedBetweenAndCreatedByAndStatusNotOrderByDateCreatedDesc(
        Date startDate, Date endDate, AppUser createdBy, APPLICATION_STATUS status);

    public List<GenControl> findAllByDateCreatedBetweenAndCreatedByAndIdInAndStatusNotOrderByDateCreatedDesc(
        Date startDate, Date endDate, AppUser createdBy, List<Long> ids, APPLICATION_STATUS status);
}
