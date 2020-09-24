package com.barco.model.repository;

import com.barco.model.enums.Status;
import com.barco.model.pojo.Job;
import com.barco.model.pojo.Scheduler;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface SchedulerRepository extends JpaRepository<Scheduler, Long> {

    List<Scheduler> findAllByJobIdAndCreatedByAndStatus(Job jobId, Long appUserId, Status status);

}
