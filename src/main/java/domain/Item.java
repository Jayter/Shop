package main.java.domain;

import java.io.Serializable;

public class Item implements Serializable {

    private Long id;
    private String description;

    public Item() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
