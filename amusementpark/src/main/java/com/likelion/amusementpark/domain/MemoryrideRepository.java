package com.likelion.amusementpark.domain;

import com.likelion.amusementpark.domain.Ride;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MemoryrideRepository implements rideRepository{

    private static Map<Long, Ride> database = new HashMap<>();

    @Override
    public void save(Ride item) {
        database.put(item.getId(), item);

    }

    @Override
    public Ride findById(Long id) {
        return database.get(id);

    }

    @Override
    public List<Ride> findAll() {
        return database.values().stream().toList();

    }

    @Override
    public void updateById(Long id, Ride item) {
        database.put(id, item);

    }

    @Override
    public void deleteById(Long id) {
        database.remove(id);

    }
}