package com.likelion.amusementpark.domain;

import java.util.List;

public interface rideRepository{

    void save(Ride item);
    Ride findById(Long id);
    List<Ride> findAll();
    void updateById(Long id, Ride item);
    void deleteById(Long id);

}