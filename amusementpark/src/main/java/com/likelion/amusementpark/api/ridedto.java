package com.likelion.amusementpark.api;

import lombok.Builder;

@Builder
public record ridedto(
        Long id,
        String name,
        Long count

) {
}