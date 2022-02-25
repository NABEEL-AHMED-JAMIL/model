package com.barco.model.repository;

import com.barco.model.enums.Status;
import com.barco.model.pojo.AccessService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;

/**
 * @author Nabeel Ahmed
 */
@Repository
public interface AccessServiceRepository extends JpaRepository<AccessService, Long> {

    public Optional<AccessService> findByServiceName(String serviceName);

    public List<AccessService> findAllByStatus(Status status);

}