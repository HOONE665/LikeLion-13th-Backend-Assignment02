package com.likelion.amusementpark.ride.api.dto;


import lombok.Builder;

@Builder
public record RideDto(
        Long id,
        String name,
        Long count
) {
}
