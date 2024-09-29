package com.beatfinder.proyecto.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.beatfinder.proyecto.Domain.Inventory;


public interface InventoryRepository extends JpaRepository<Inventory, Long> {
}