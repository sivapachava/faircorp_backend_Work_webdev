package com.emse.spring.faircorp.dao;

import com.emse.spring.faircorp.model.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface RoomDao extends JpaRepository<Room, Long> {
    @Modifying
    @Query("delete from Room r where r.building.id =:buildingId")
    void deleteRoomsByBuilding(@Param("buildingId") Long id);

    Optional<Room> findRoomByName(String name);

   }
