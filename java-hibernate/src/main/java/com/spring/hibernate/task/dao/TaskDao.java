package com.spring.hibernate.task.dao;

import com.spring.hibernate.task.Task;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TaskDao extends CrudRepository<Task, Integer> {
    List<Task> findByDuration(int duration);
}
