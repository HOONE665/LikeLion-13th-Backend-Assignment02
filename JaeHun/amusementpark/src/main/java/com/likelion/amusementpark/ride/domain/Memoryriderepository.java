package com.likelion.amusementpark.ride.domain;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Repository;

@Repository
public class Memoryriderepository implements riderepository {

    private static Map<Long, ride> database = new HashMap<>();

    @Override
    public void save(ride ride) {
        database.put(ride.getId(), ride);

    }

    @Override
    public ride findById(Long id) {
        return database.get(id);
    }

    @Override
    public List<ride> findAll() {
        return database.values().stream().toList();

    }

    @Override
    public void updateById(long id, ride ride) {
        database.put(id, ride);

    }

    @Override
    public void deleteById(long id) {
        database.remove(id);

    }
}
