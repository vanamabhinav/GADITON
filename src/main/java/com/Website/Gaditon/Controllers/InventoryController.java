package com.Website.Gaditon.Controllers;

import com.Website.Gaditon.Models.Inventory;
import com.Website.Gaditon.Services.InventoryService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/inventory")
public class InventoryController {
    private final InventoryService inventoryService;

    public InventoryController(InventoryService inventoryService) {
        this.inventoryService = inventoryService;
    }

    @GetMapping
    public List<Inventory> getAllInventory() {
        return inventoryService.getAllInventory();
    }

    @PostMapping
    public Inventory updateInventory(@RequestBody Inventory inventory) {
        return inventoryService.updateInventory(inventory);
    }
}
