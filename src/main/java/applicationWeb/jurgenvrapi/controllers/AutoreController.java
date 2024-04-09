package applicationWeb.jurgenvrapi.controllers;
import applicationWeb.jurgenvrapi.entities.Autore;
import applicationWeb.jurgenvrapi.services.AutoreServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;

import java.util.List;

@RestController
@RequestMapping("/autori")
public class AutoreController {


    private final AutoreServices autoreServices;

    @Autowired
    public AutoreController(AutoreServices autoreServices) {
        this.autoreServices= autoreServices;
    }


    @GetMapping
    public ResponseEntity<List<Autore>> getAllAutori() {
        List<Autore> autori = autoreServices.getAllAutori();
        return new ResponseEntity<>(autori, HttpStatus.OK);
    }


    @GetMapping("/{id}")
    public ResponseEntity<Autore> getAutore(@PathVariable Long id) {
        Autore autroe = autoreServices.getBlogAutori(id);
        if (autroe == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            return new ResponseEntity<>(autroe, HttpStatus.OK);
        }
    }


    @PutMapping("/{id}")
    public ResponseEntity<Autore> createAutore(@RequestBody Autore autore) {
        Autore createdAutore = autoreServices.createAutore(autore);
        return new ResponseEntity<>(createdAutore, HttpStatus.CREATED);
    }


    @PostMapping
    public ResponseEntity<Autore> updateAutore(@PathVariable Long id,@RequestBody Autore autore) {
        Autore updatedAutore = autoreServices.updateAutore(id, autore);
        if (updatedAutore == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            return new ResponseEntity<>(updatedAutore, HttpStatus.OK);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteAutore(@PathVariable Long id) {
        autoreServices.deleteAutore(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
