package com.barco.model.repository;

import com.barco.model.pojo.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface TriggerRepository extends JpaRepository<Task, Long> {
}
