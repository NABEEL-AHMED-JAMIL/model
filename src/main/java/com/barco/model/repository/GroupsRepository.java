package com.barco.model.repository;

import com.barco.model.pojo.AppUser;
import com.barco.model.pojo.Groups;
import com.barco.model.util.lookup.APPLICATION_STATUS;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;

/**
 * @author Nabeel Ahmed
 */
@Repository
public interface GroupsRepository extends CrudRepository<Groups, Long> {

    public Optional<Groups> findByIdAndStatusNot(Long id, APPLICATION_STATUS status);

    public Optional<Groups> findByNameAndStatusNot(String name, APPLICATION_STATUS status);

    public List<Groups> findAllByStatusNot(APPLICATION_STATUS status);

    public List<Groups> findAllByCreatedByAndStatusNot(AppUser createdBy, APPLICATION_STATUS status);

}
