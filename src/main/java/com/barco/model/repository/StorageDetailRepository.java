package com.barco.model.repository;

import com.barco.model.enums.Status;
import com.barco.model.pojo.StorageDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface StorageDetailRepository extends JpaRepository<StorageDetail, Long> {

    Optional<StorageDetail> findByStorageKeyNameAndStatus(String storageKeyName, Status status);

    Optional<StorageDetail> findByIdAndStatusNot(Long id, Status status);

    StorageDetail findByIdAndStatus(Long id, Status status);

    Optional<StorageDetail> findByIdAndCreatedByAndStatus(Long storageId, Long appUserId, Status status);

}
