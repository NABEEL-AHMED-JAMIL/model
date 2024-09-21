package com.barco.model.repository;

import com.barco.model.pojo.Organization;
import com.barco.model.util.lookup.APPLICATION_STATUS;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;

/**
 * @author Nabeel Ahmed
 */
@Repository
public interface OrganizationRepository extends CrudRepository<Organization, Long> {

    public Optional<Organization> findByUuidAndStatusNot(String uuid, APPLICATION_STATUS status);

    public Optional<Organization> findByIdAndStatusNot(Long id, APPLICATION_STATUS status);

    public List<Organization> findAllByIdIn(List<Long> ids);

    public Optional<Organization> findAllByUuidIn(List<String> uuIds);

    public List<Organization> findAllByStatusNotOrderByDateCreatedDesc(APPLICATION_STATUS status);

}
