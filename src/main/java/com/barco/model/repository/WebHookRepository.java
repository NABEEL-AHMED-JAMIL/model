package com.barco.model.repository;

import com.barco.model.pojo.AppUser;
import com.barco.model.pojo.Credential;
import com.barco.model.pojo.WebHook;
import com.barco.model.util.lookup.APPLICATION_STATUS;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;

/**
 * @author Nabeel Ahmed
 */
@Repository
public interface WebHookRepository extends CrudRepository<WebHook, Long> {

    public List<WebHook> findAllByIdIn(List<Long> ids);

    public Long countByCredentialAndStatusNot(Credential credential, APPLICATION_STATUS status);

    public List<WebHook> findAllByIdInAndStatusNot(List<Long> ids, APPLICATION_STATUS status);

    public Optional<WebHook> findByIdAndStatusNot(Long id, APPLICATION_STATUS status);

    public Optional<WebHook> findByIdAndCreatedByAndStatusNot(Long id, AppUser appUser, APPLICATION_STATUS status);

    public List<WebHook> findAllByStatusNotOrderByDateCreatedDesc(APPLICATION_STATUS status);


}
