package com.likelion.amusementpark.application;


import com.likelion.amusementpark.api.ridedto;
import com.likelion.amusementpark.domain.Ride;
import com.likelion.amusementpark.domain.rideRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class rideService {

    private final rideRepository rideRepository;

    private static Long sequence = 0L;

    public void saveItem(ridedto requestDto){
        Ride ride = Ride.builder();
                .id(++sequence)
                .name(requestDto.name())
                .count(requestDto.count())
                .build();
    }
}
