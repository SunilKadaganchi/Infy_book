package com.Infy.InfyBook.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.UUID;


public class CategoryResponseDTO {
    private UUID id;
    private String name;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
