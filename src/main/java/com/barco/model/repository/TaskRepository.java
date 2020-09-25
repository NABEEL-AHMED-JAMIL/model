package com.barco.model.repository;

import com.barco.model.enums.Status;
import com.barco.model.pojo.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.Optional;


@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {

    Task findByIdAndStatus(Long id, Status status);

    Optional<Task> findByIdAndStatusNot(Long id, Status status);

    Optional<Task> findByTaskNameAndStatus(String taskName, Status status);

    Optional<Task> findByIdAndCreatedByAndStatus(Long taskId, Long appUserId, Status status);

    @Transactional
    @Query(value = "select count(tk.id) as total_task from task as tk\n" +
        "inner join storage_detail as sd on\n" +
        "sd.id = tk.storage_id and tk.status = 1 and tk.storage_id = ?", nativeQuery = true)
    // query give the total count for storage with the active task
    Long countByStorageId(Long storageId);

}
