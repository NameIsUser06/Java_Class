package com.example.todolist.controller;

import com.example.todolist.controller.dto.TodoRequestDto;
import com.example.todolist.controller.dto.TodoResponseDto;
import com.example.todolist.service.TodoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class TodoController {
    private final TodoService todoService;

    @PostMapping("/todo/api")
    public Long create(@RequestBody TodoRequestDto requestDto) {
        return todoService.save(requestDto);
    }

    @GetMapping("/todo/api")
    public List<TodoResponseDto> readAll() {
        return todoService.findAll();
    }

    @GetMapping("/todo/api/{id}")
    public TodoResponseDto readOne(@PathVariable Long id) {
        return todoService.findById(id);
    }

    @PutMapping("/todo/api/{id}")
    public Long update(@PathVariable Long id,
                       @RequestBody TodoRequestDto requestDto) {
        return todoService.update(id, requestDto);
    }

    @DeleteMapping("/todo/api")
    public void deleteAll() {
        todoService.deleteAll();
    }

    @DeleteMapping("/todo/api/{id}")
    public Long deleteOne(@PathVariable Long id) {
        return todoService.deleteById(id);
    }
}
