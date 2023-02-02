package br.com.alex.invite.event;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

public interface EventRepository extends JpaRepository<Event, Integer> {
    Optional<Event> findByName(String name);

    @Transactional
    @Query("SELECT * FROM Event e WHERE e.user = ?1")
    List<Event> findByUser(Integer id);
}
