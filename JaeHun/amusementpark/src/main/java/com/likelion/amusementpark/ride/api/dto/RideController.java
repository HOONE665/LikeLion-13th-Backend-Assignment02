package com.likelion.amusementpark.ride.api.dto;

import com.likelion.amusementpark.ride.api.dto.RideDto;
import com.likelion.amusementpark.ride.application.rideservice;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class RideController {

    private final rideservice rideService;

    @PostMapping("/rides")
    public void save(@RequestBody RideDto rideDto) {
        rideService.saveride(rideDto);
    }

    @GetMapping("/rides/{id}")
    public RideDto findRideById(@PathVariable Long id) {
        return rideService.findrideById(id);
    }

    @GetMapping("/rides")
    public List<RideDto> findAllRides() {
        return rideService.findAllrides();
    }

    @PatchMapping("/rides/{id}")
    public void updateRideById(@PathVariable Long id, @RequestBody RideDto rideDto) {
        rideService.updaterideById(id, rideDto);
    }

    @DeleteMapping("/rides/{id}")
    public void deleteRideById(@PathVariable Long id) {
        rideService.deleterideById(id);
    }
}
