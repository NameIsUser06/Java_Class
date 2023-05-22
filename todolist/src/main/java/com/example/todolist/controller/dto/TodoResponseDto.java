package com.example.todolist.controller.dto;

import com.example.todolist.domain.TodoEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class TodoResponseDto {
    private Long id;
    private String content;
    private Boolean completed;

    public TodoResponseDto(TodoEntity entity) {
        this.content = entity.getContent();
        this.completed = entity.getCompleted();
        this.id = entity.getId();
    }
}
