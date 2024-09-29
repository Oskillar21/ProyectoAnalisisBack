package com.beatfinder.proyecto.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.beatfinder.proyecto.Domain.Membership;

public interface MembershipRepository extends JpaRepository<Membership, Long> {
}
