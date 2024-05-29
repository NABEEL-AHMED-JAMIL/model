package com.barco.model.repository;

import com.barco.model.pojo.AppUser;
import com.barco.model.pojo.Credential;
import com.barco.model.pojo.EventBridge;
import com.barco.model.util.lookup.APPLICATION_STATUS;
import com.barco.model.util.lookup.EVENT_BRIDGE_TYPE;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;

/**
 * @author Nabeel Ahmed
 */
@Repository
public interface EventBridgeRepository extends CrudRepository<EventBridge, Long> {

    public List<EventBridge> findAllByIdIn(List<Long> ids);

    public Long countByCredentialAndStatusNot(Credential credential, APPLICATION_STATUS status);

    public Optional<EventBridge> findByIdAndStatusNot(Long id, APPLICATION_STATUS status);

    public Optional<EventBridge> findByIdAndCreatedByAndStatusNot(Long id, AppUser appUser, APPLICATION_STATUS status);

    public List<EventBridge> findAllByCreatedByAndStatusNotOrderByDateCreatedDesc(AppUser appUser, APPLICATION_STATUS status);

    public List<EventBridge> findAllByBridgeTypeAndCreatedByAndStatusNotOrderByDateCreatedDesc(EVENT_BRIDGE_TYPE bridgeType, AppUser appUser, APPLICATION_STATUS status);

}
