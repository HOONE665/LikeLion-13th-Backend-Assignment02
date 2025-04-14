package com.likelion.amusementpark.ride.domain;

import java.util.List;

public interface riderepository {

    void save(ride ride);
    ride findById(Long id);
    List<ride> findAll();
    void updateById(long id, ride ride);
    void deleteById(long id);
}
