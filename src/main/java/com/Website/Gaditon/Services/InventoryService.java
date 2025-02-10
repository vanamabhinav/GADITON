package com.Website.Gaditon.Services;

import com.Website.Gaditon.Models.Inventory;
import com.Website.Gaditon.Repositories.InventoryRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InventoryService {
    private final InventoryRepository inventoryRepository;

    public InventoryService(InventoryRepository inventoryRepository) {
        this.inventoryRepository = inventoryRepository;
    }

    public List<Inventory> getAllInventory() {
        return inventoryRepository.findAll();
    }

    public Inventory updateInventory(Inventory inventory) {
        return inventoryRepository.save(inventory);
    }
}
