package com.mujicaservices.course.roomservices.repository;

import com.mujicaservices.course.roomservices.domain.Room;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomRepository extends CrudRepository<Room, Long> {
}
