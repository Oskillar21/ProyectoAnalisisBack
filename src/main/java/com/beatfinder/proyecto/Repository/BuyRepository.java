package com.beatfinder.proyecto.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.beatfinder.proyecto.Domain.Buy;  

public interface BuyRepository extends JpaRepository<Buy, Long> {
}
