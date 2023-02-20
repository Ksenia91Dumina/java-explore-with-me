package ru.practicum.server.service;

import ru.practicum.dto.NewHitDto;
import ru.practicum.dto.StatInfoDto;

import java.time.LocalDateTime;
import java.util.List;

public interface StatService {
    void addHitInfo(NewHitDto newHitDto);

    List<StatInfoDto> getStatInfo(LocalDateTime start, LocalDateTime end, List<String> uris, boolean unique);

}