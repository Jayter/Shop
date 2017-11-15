package main.java.repository;

import main.java.domain.Item;

public interface ItemRepository {
    Item save(Item user);
    void get(Long userId);
    Item update(Item user);
    void delete(Long userId);
}
