package com.crud.tasks.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;


public class Task {
    private Long id;
    private String string;
    private String  content;

    public Task(Long id, String string, String content) {
        this.id = id;
        this.string = string;
        this.content = content;
    }
}
