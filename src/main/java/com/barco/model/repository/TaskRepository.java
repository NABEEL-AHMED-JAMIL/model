package com.barco.model.repository;

import com.barco.model.enums.Status;
import com.barco.model.pojo.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {

    Optional<Task> findByTaskNameAndStatus(String taskName, Status status);
    Optional<Task> findByIdAndCreatedByAndStatus(Long taskId, Long appUserId, Status status);
}
