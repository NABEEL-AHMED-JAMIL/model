package com.barco.model.repository;

import com.barco.model.lookup.APPLICATION_STATUS;
import com.barco.model.pojo.aoe.OrganizationJwtKey;
import com.barco.model.repository.projection.OrganizationKeyProjection;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;

/**
 * @author Nabeel Ahmed
 */
@Repository
@Transactional
public interface OrganizationJwtKeyRepository extends CrudRepository<OrganizationJwtKey, Long> {

    // Find OrganizationJwtKey by keyId (kid) and application status
    @Query("SELECT o.keyId AS keyId, o.privateKey AS privateKey, o.publicKey AS publicKey " +
           "FROM OrganizationJwtKey o " +
           "WHERE o.keyId = :keyId AND o.status = :status")
    Optional<OrganizationKeyProjection> findByKeyIdAndStatus(String keyId, APPLICATION_STATUS status);

    @Query("SELECT o.keyId AS keyId, o.privateKey AS privateKey, o.publicKey AS publicKey " +
           "FROM OrganizationJwtKey o " +
           "WHERE o.organization.id = :orgId AND o.status = :status")
    Optional<OrganizationKeyProjection> findProjectedByOrganizationIdAndStatus(@Param("orgId") Long orgId, @Param("status") APPLICATION_STATUS status);

    // New: fetch all active projected keys for warmup
    @Query("SELECT o.keyId AS keyId, o.privateKey AS privateKey, o.publicKey AS publicKey " +
           "FROM OrganizationJwtKey o " +
           "WHERE o.status = :status")
    List<OrganizationKeyProjection> findAllProjectedByStatus(@Param("status") APPLICATION_STATUS status);

    // Update keyId, privateKey and publicKey by entity id
    @Modifying
    @Query("UPDATE OrganizationJwtKey o SET o.keyId = :keyId, o.privateKey = :privateKey, o.publicKey = :publicKey WHERE o.id = :id")
    int updateKeysById(@Param("id") Long id, @Param("keyId") String keyId, @Param("privateKey") byte[] privateKey, @Param("publicKey") byte[] publicKey);

}
