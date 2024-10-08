package com.barco.model.repository;

import com.barco.model.pojo.Permission;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;

/**
 * @author Nabeel Ahmed
 */
@Repository
public interface PermissionRepository extends CrudRepository<Permission, Long> {

    public Optional<Permission> findByUuid(String uuids);

    public Optional<Permission> findPermissionByPermissionName(String permissionName);

    public List<Permission> findAllByIdIn(List<Long> ids);

    public List<Permission> findAllByUuidIn(List<String> uuids);

}
