package ru.practicum.server.mapper;

import ru.practicum.dto.HitDto;
import ru.practicum.dto.NewHitDto;
import ru.practicum.server.model.EndpointHit;

public class EndpointHitMapper {

    public static HitDto toHitDto(EndpointHit endpointHit) {
        return HitDto.builder()
                .app(endpointHit.getApp())
                .uri(endpointHit.getUri())
                .ip(endpointHit.getIp())
                .timestamp(endpointHit.getTimestamp())
                .build();
    }

    public static EndpointHit toEndpointHit(HitDto hitDto) {
        return EndpointHit.builder()
                .app(hitDto.getApp())
                .uri(hitDto.getUri())
                .ip(hitDto.getIp())
                .timestamp(hitDto.getTimestamp())
                .build();
    }

    public static EndpointHit toEndpointHitFromNewDto(NewHitDto hitDto) {
        return EndpointHit.builder()
                .app(hitDto.getApp())
                .uri(hitDto.getUri())
                .ip(hitDto.getIp())
                .build();
    }

}