package com.barco.model.repository;

import com.barco.model.pojo.Key;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface KeyRepository extends JpaRepository<Key, Long> {
}
