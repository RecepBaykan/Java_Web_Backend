package com.nontius.proje.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nontius.proje.entityDTO.EventDTO;
import com.nontius.proje.entityDTO.PatchDTO;
import com.nontius.proje.service.EventService;
import com.nontius.proje.service.PatchService;

@RestController
@RequestMapping("/api/event")
@CrossOrigin("*")
public class EventController {

    private final EventService service;

    public EventController(EventService service) {
        this.service = service;
    }

    @GetMapping("{id}")
    public ResponseEntity<?> getModel(@PathVariable("id") Long id) {
        EventDTO modelDTO = service.getModel(id);
        if (modelDTO != null) {
            return ResponseEntity.ok(modelDTO);
        } else {
            return new ResponseEntity<>("Not found content by id: " + id, HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping
    public ResponseEntity<?> createModel(@RequestBody EventDTO dto) {
    	EventDTO model = service.createModel(dto);
        if (model != null) {
            return ResponseEntity.ok(model);
        } else {
            return new ResponseEntity<>("Not create content", HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping
    public ResponseEntity<?> getAllNews() {
        List<EventDTO> dtoList = service.getAll();
        if (dtoList != null && !dtoList.isEmpty()) {
            return ResponseEntity.ok(dtoList);
        } else {
            return new ResponseEntity<>("Contents Not Found", HttpStatus.NOT_FOUND);
        }
    }

    @PutMapping("{id}")
    public ResponseEntity<?> updateNews(@PathVariable("id") Long id,
                                        @RequestBody EventDTO modelDTO) {
    	EventDTO model = service.updateModel(id, modelDTO);
        if (model != null) {
            return ResponseEntity.ok(model);
        } else {
            return new ResponseEntity<>("Contents Not Found", HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("{id}")
    public ResponseEntity<?> deleteNews(@PathVariable("id") Long id) {
        try {
            service.delete(id);
            return new ResponseEntity<>("Content deleted successfully", HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>("Content not found", HttpStatus.NOT_FOUND);
        }
    }
}
