package applicationWeb.jurgenvrapi.controllers;
import applicationWeb.jurgenvrapi.entities.Autore;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;

import java.util.List;

@RestController
@RequestMapping("/api/autori")
public class AutoreController {

    // GET: /api/autori
    @GetMapping
    public ResponseEntity<List<Autore>> getAllAutori() {
        // Implementazione del metodo per ottenere tutti gli autori
        return null;
    }

    // GET: /api/autori/{id}
    @GetMapping("/{id}")
    public ResponseEntity<Autore> getAutore(@PathVariable Long id) {
        // Implementazione del metodo per ottenere un singolo autore
        return null;
    }

    // PUT: /api/autori/{id}
    @PutMapping("/{id}")
    public ResponseEntity<Autore> updateAutore(@PathVariable Long id, @RequestBody Autore autore) {
        // Implementazione del metodo per aggiornare un autore
        return null;
    }

    // POST: /api/autori
    @PostMapping
    public ResponseEntity<Autore> createAutore(@RequestBody Autore autore) {
        // Implementazione del metodo per creare un nuovo autore
        return null;
    }
}
