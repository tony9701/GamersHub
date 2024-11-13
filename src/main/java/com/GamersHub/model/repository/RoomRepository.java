package com.GamersHub.model.repository;

import com.GamersHub.model.entity.Room;
import jdk.jfr.Registered;
import org.springframework.data.jpa.repository.JpaRepository;

@Registered
public interface RoomRepository extends JpaRepository<Room, Long> {
}
