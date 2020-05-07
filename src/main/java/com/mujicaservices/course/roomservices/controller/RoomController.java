package com.mujicaservices.course.roomservices.controller;

import com.mujicaservices.course.roomservices.domain.Room;
import com.mujicaservices.course.roomservices.repository.RoomRepository;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/rooms")
public class RoomController {
    private final RoomRepository repository;

    public RoomController(RoomRepository repository){
        super();
        this.repository = repository;
    }

    @RequestMapping(method = RequestMethod.GET, produces = "application/json")
    public Iterable<Room> getAllRooms(){
        return this.repository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}", produces = "application/json")
    public Room getRoom(@PathVariable("id")long id){
        return this.repository.findById(id).get();
    }
}
