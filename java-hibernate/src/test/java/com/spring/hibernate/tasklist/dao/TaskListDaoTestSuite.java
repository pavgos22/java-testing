package com.spring.hibernate.tasklist.dao;


import com.spring.hibernate.tasklist.TaskList;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class TaskListDaoTestSuite {

    @Autowired
    private TaskListDao taskListDao;

    private TaskList taskList;

    @Test
    public void testFindByListName() {
        taskList = new TaskList();
        taskList.setListName("Test list");
        taskList.setDescription("Test description");
        taskListDao.save(taskList);

        String listName = "Test list";
        int foundLists = taskListDao.findByListName(listName).size();

        assertEquals(1, foundLists);
        taskListDao.delete(taskList);
    }
}