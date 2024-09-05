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

import com.nontius.proje.entityDTO.NewsDTO;
import com.nontius.proje.service.NewsService;

@RestController
@RequestMapping("/api/news")
@CrossOrigin("*")
public class NewsController {

    private final NewsService service;

    public NewsController(NewsService service) {
        this.service = service;
    }

    @GetMapping("{id}")
    public ResponseEntity<?> getNews(@PathVariable("id") Long id) {
        NewsDTO newsDTO = service.getNews(id);
        if (newsDTO != null) {
            return ResponseEntity.ok(newsDTO);
        } else {
            return new ResponseEntity<>("Not found content by id: " + id, HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping
    public ResponseEntity<?> createNews(@RequestBody NewsDTO dto) {
        NewsDTO news = service.createNews(dto);
        if (news != null) {
            return ResponseEntity.ok(news);
        } else {
            return new ResponseEntity<>("Not create content", HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping
    public ResponseEntity<?> getAllNews() {
        List<NewsDTO> dtoList = service.getAll();
        if (dtoList != null && !dtoList.isEmpty()) {
            return ResponseEntity.ok(dtoList);
        } else {
            return new ResponseEntity<>("Contents Not Found", HttpStatus.NOT_FOUND);
        }
    }

    @PutMapping("{id}")
    public ResponseEntity<?> updateNews(@PathVariable("id") Long id,
                                        @RequestBody NewsDTO newsDTO) {
        NewsDTO news = service.updateNews(id, newsDTO);
        if (news != null) {
            return ResponseEntity.ok(news);
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
