package com.barco.model.repository;

import com.barco.model.pojo.JobQueue;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface JobQueueRepository extends JpaRepository<JobQueue, Long> {
}
