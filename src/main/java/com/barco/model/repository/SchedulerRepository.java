package com.barco.model.repository;

import com.barco.model.pojo.Scheduler;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface SchedulerRepository extends JpaRepository<Scheduler, Long> {
}
