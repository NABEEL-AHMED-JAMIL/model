package com.barco.model.repository;

import com.barco.model.pojo.Role;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;
import java.util.Set;

/**
 * @author Nabeel Ahmed
 */
@Repository
public interface RoleRepository extends CrudRepository<Role, Long> {

    public Optional<Role> findByRoleNameAndStatus(String roleName, Long status);

    public Set<Role> findAllRoleByRoleIdInAndStatus(List<Long> role, Long status);
}
