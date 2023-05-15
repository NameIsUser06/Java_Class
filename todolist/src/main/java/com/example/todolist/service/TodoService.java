package com.example.todolist.service;

import com.example.todolist.controller.dto.TodoRequestDto;
import com.example.todolist.controller.dto.TodoResponseDto;
import com.example.todolist.domain.TodoEntity;
import com.example.todolist.repository.TodoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class TodoService {
    private final TodoRepository todoRepository;

    @Transactional
    public Long save(TodoRequestDto requestDto) {
        return todoRepository.save(requestDto.toEntity()).getId();
    }

    @Transactional(readOnly = true)
    public List<TodoResponseDto> findAll() {
        List<TodoEntity> result = todoRepository.findAll();
        List<TodoResponseDto> responseDtos = new ArrayList<>();

        for (TodoEntity entity : result) {
            responseDtos.add(new TodoResponseDto(entity));
        }

        return responseDtos;
    }

    @Transactional(readOnly = true)
    public TodoResponseDto findById(Long id) {
        return new TodoResponseDto(todoRepository.findById(id).orElse(new TodoEntity()));
    }

    @Transactional
    public Long update(Long id, TodoRequestDto requestDto) {
        TodoEntity entity = todoRepository.findById(id).orElse(new TodoEntity());
        return entity.updateData(requestDto);
    }
}
