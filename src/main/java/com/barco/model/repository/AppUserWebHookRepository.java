package com.barco.model.repository;

import com.barco.model.pojo.AppUserWebHook;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * @author Nabeel Ahmed
 */
@Repository
public interface AppUserWebHookRepository extends CrudRepository<AppUserWebHook, Long> {

    public Optional<AppUserWebHook> findByTokenId(String tokenId);
}
