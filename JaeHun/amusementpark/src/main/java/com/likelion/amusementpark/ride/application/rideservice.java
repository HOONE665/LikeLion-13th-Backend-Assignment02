package com.likelion.amusementpark.ride.application;

import com.likelion.amusementpark.ride.domain.ride;
import com.likelion.amusementpark.ride.domain.riderepository;
import com.likelion.amusementpark.ride.api.dto.RideDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class rideservice {

    private final riderepository riderepository;

    private static Long sequence = 0L;

    public void saveride(RideDto requestDto) {
        ride Ride = ride.builder()
                .id(++sequence)
                .name(requestDto.name())
                .count(requestDto.count())
                .build();

        riderepository.save(Ride);
    }

    public RideDto findrideById(Long id) {
        ride ride = riderepository.findById(id);
        if (ride == null) {
            throw new IllegalArgumentException("해당하는 놀이기구가 없습니다. id = " + id);
        }
        return toDto(ride);
    }

    public List<RideDto> findAllrides() {
        return riderepository.findAll().stream()
                .map(this::toDto)
                .collect(Collectors.toList());
    }

    public ride updaterideById(Long id, RideDto requestDto) {
        ride ride = riderepository.findById(id);
        if (ride == null) {
            throw new IllegalArgumentException("해당하는 놀이기구가 없습니다. id = " + id);
        }

        ride.update(requestDto.name(), requestDto.count());
        riderepository.updateById(id, ride);
        return ride;
    }

    public void deleterideById(Long id) {
        riderepository.deleteById(id);
    }

    private RideDto toDto(ride ride) {
        return RideDto.builder()
                .id(ride.getId())
                .name(ride.getName())
                .count(ride.getCount())
                .build();
    }
}
