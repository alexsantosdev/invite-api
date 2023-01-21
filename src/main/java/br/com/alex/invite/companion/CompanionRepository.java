package br.com.alex.invite.companion;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CompanionRepository extends JpaRepository<Companion, Integer> {
    Optional<Companion> findByName(String name);
}
