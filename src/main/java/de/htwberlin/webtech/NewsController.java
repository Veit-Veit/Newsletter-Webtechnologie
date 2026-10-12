package de.htwberlin.webtech;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NewsController {

    @GetMapping(path = "/news")
    public ResponseEntity<News> getNews() {
        final News news = new News("Willkommen im Newsletter", "Webtech Team", "Der erste Newsletter ist online.");
        return ResponseEntity.ok(news);
    }
}