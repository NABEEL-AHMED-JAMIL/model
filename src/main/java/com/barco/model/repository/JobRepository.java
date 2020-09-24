package com.barco.model.repository;

import com.barco.model.enums.Status;
import com.barco.model.pojo.Job;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.Optional;


@Repository
public interface JobRepository extends JpaRepository<Job, Long> {

    Optional<Job> findByJobNameAndStatus(String jobName, Status status);

    Job findByIdAndStatus(Long id, Status status);

    Optional<Job> findByIdAndCreatedByAndStatus(Long taskId, Long appUserId, Status status);

    @Transactional
    @Query(value = "select count(jb.id) as total_job from job as jb\n" +
            "inner join task as tk on\n" +
            "tk.id = jb.task_id and jb.status = 1 and jb.task_id = ?", nativeQuery = true)
    // query give the total count for storage with the active task
    Long countByTaskId(Long taskId);

}
