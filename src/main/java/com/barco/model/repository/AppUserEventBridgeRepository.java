package com.barco.model.repository;

import com.barco.model.pojo.AppUserEventBridge;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

/**
 * @author Nabeel Ahmed
 */
@Repository
public interface AppUserEventBridgeRepository extends CrudRepository<AppUserEventBridge, Long> {

    public Optional<AppUserEventBridge> findByTokenId(String tokenId);
}
