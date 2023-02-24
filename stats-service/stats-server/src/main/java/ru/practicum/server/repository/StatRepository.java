package ru.practicum.server.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import ru.practicum.dto.StatInfoDto;
import ru.practicum.server.model.EndpointHit;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface StatRepository extends JpaRepository<EndpointHit, Long> {
    @Query(nativeQuery = true)
    List<StatInfoDto> getUniqueStat(LocalDateTime start, LocalDateTime end);

    @Query(nativeQuery = true)
    List<StatInfoDto> getNoUniqueStat(LocalDateTime start, LocalDateTime end);
}