package main.java.repository;

import main.java.domain.Purchase;

public interface PurchaseRepository {
    Purchase save(Purchase user);
    void get(Long userId);
    Purchase update(Purchase user);
    void delete(Long userId);
}
