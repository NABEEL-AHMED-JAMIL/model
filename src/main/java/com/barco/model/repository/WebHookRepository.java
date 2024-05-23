package com.barco.model.repository;

import com.barco.model.pojo.Credential;
import com.barco.model.pojo.WebHook;
import com.barco.model.util.lookup.APPLICATION_STATUS;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Nabeel Ahmed
 */
@Repository
public interface WebHookRepository extends CrudRepository<WebHook, Long> {

    public Long countByCredentialAndStatusNot(Credential credential, APPLICATION_STATUS status);
}
