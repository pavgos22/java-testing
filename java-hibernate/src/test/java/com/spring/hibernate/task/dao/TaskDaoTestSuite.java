package com.spring.hibernate.task.dao;

import com.spring.hibernate.task.Task;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class TaskDaoTestSuite {

    @Autowired
    private TaskDao taskDao;
    private static final String DESCRIPTION = "Test: Learn Hibernate";

    @Test
    void testTaskDaoSave() {
        Task task = new Task(DESCRIPTION, 7);

        taskDao.save(task);

        int id = task.getId();
        Optional<Task> readTask = taskDao.findById(id);
        assertTrue(readTask.isPresent());

        taskDao.deleteById(id);
    }
}