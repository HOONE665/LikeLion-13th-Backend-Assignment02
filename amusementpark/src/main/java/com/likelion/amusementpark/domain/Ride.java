package com.likelion.amusementpark.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class Ride {
    private Long id;           // 놀이기구 고유 id
    private String name;       // 놀이기구 이름
    private int capacity;      // 수용 인원

    @Builder
    public Ride(Long id, String name, int capacity) {
        this.id = id;
        this.name = name;
        this.capacity = capacity;
    }

    public void update(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }
}
