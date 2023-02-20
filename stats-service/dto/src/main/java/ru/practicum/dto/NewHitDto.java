package ru.practicum.dto;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class NewHitDto {
    private String app;
    private String uri;
    private String ip;
}