package com.example.todolist.domain;

import com.example.todolist.controller.dto.TodoRequestDto;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor
public class TodoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 200)
    private String content;

    @Column(nullable = false)
    private Boolean completed;

    @Builder
    public TodoEntity(String content, Boolean completed) {
        this.content = content;
        this.completed = completed;
    }

    public Long updateData(TodoRequestDto requestDto) {
        this.content = requestDto.getContent();
        this.completed = requestDto.getCompleted();
        return this.id;
    }
}
