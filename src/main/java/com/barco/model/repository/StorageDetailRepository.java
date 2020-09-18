package com.barco.model.repository;

import com.barco.model.pojo.StorageDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface StorageDetailRepository extends JpaRepository<StorageDetail, Long> {
}
