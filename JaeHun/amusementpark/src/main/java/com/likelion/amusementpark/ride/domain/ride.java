package com.likelion.amusementpark.ride.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class ride {
    private Long id;
    private String name;
    private Long count;

    @Builder
    public ride (Long id, String name, Long count) {
        this.id = id;
        this.name = name;
        this.count = count;
    }

    public void update (String name , Long count ) {
        this.name = name;
        this.count = count;
    }
}
