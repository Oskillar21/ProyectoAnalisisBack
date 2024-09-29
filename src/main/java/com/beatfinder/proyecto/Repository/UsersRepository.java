package com.beatfinder.proyecto.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.beatfinder.proyecto.Domain.Users;


public interface UsersRepository extends JpaRepository<Users, Long> {
}