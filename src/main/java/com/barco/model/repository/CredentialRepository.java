package com.barco.model.repository;

import com.barco.model.pojo.AppUser;
import com.barco.model.pojo.Credential;
import com.barco.model.util.lookup.APPLICATION_STATUS;
import com.barco.model.util.lookup.CREDENTIAL_TYPE;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.Set;

/**
 * @author Nabeel Ahmed
 */
@Repository
public interface CredentialRepository extends CrudRepository<Credential, Long> {

    public Optional<Credential> findByIdAndCreatedByAndStatusNot(Long id, AppUser appUser, APPLICATION_STATUS status);

    public List<Credential> findAllByDateCreatedBetweenAndCreatedByAndStatusNot(Date startDate, Date endDate, AppUser appUser, APPLICATION_STATUS status);

    public List<Credential> findAllByCreatedByAndStatusNot(AppUser appUser, APPLICATION_STATUS status);

    public List<Credential> findAllByCreatedByAndTypeInAndStatusNot(AppUser appUser, Set<CREDENTIAL_TYPE> types, APPLICATION_STATUS status);

    public List<Credential> findAllByIdIn(List<Long> ids);

}
