package com.barco.model.repository;

import com.barco.model.enums.Status;
import com.barco.model.pojo.StorageDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface StorageDetailRepository extends JpaRepository<StorageDetail, Long> {

    Optional<StorageDetail> findByStorageKeyNameAndCreatedByAndStatus(String storageKeyName, Long appUserId, Status status);

    Optional<StorageDetail> findByIdAndCreatedByAndStatusNot(Long id, Long appUserId, Status status);

    StorageDetail findByIdAndStatus(Long id, Status status);

    Optional<StorageDetail> findByIdAndCreatedByAndStatus(Long storageId, Long appUserId, Status status);

}
