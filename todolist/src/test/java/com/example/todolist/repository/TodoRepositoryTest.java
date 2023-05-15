package com.example.todolist.repository;

import com.example.todolist.domain.TodoEntity;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class TodoRepositoryTest {
    @Autowired
    private TodoRepository todoRepository;

    @AfterEach
    public void reset() {
        todoRepository.deleteAll();
    }

    @Test
    public void test() {
        TodoEntity entity = todoRepository.save(TodoEntity.builder()
                        .content("a content")
                        .completed(false)
                        .build());
        List<TodoEntity> all = todoRepository.findAll();
        assertEquals(all.get(0).getContent(), "a content");
        assertEquals(all.get(0).getCompleted(), false);
    }

}