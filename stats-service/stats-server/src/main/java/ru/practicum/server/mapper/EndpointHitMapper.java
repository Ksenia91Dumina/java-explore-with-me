package ru.practicum.server.mapper;

import ru.practicum.dto.HitDto;
import ru.practicum.dto.NewHitDto;
import ru.practicum.server.model.EndpointHit;
import java.time.LocalDateTime;

public class EndpointHitMapper {

    public static HitDto toEndpointHit(EndpointHit endpointHit) {
        return HitDto.builder()
                .app(endpointHit.getApp())
                .uri(endpointHit.getUri())
                .ip(endpointHit.getIp())
                .timestamp(endpointHit.getTimestamp())
                .build();
    }

    public static EndpointHit toEndpointHitFromNewHitDto(NewHitDto newHitDto) {
        return new EndpointHit(0,
                newHitDto.getApp(),
                newHitDto.getUri(),
                newHitDto.getIp(),
                LocalDateTime.now()
        );
    }
}