package io.github.cursodsousa.libraryapi.controller;

import io.github.cursodsousa.libraryapi.model.Livro;
import io.github.cursodsousa.libraryapi.repository.LivroRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;



import java.net.URI;
import java.util.List;
import java.util.UUID;
//teste
@RestController
@RequestMapping("/api/livros")
public class LivroController {

    private final LivroRepository repo;

    public LivroController(LivroRepository repo) {
        this.repo = repo;
    }

    @GetMapping
    public List<Livro> listar() {
        return repo.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Livro> porId(@PathVariable UUID id) {
        return repo.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Livro> criar(@RequestBody Livro livro) {
        Livro salvo = repo.save(livro);
        return ResponseEntity
                .created(URI.create("/api/livros/" + salvo.getId()))
                .body(salvo);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Livro> atualizar(
            @PathVariable UUID id,
            @RequestBody Livro livro) {

        if (!repo.existsById(id)) {
            return ResponseEntity.notFound().build();
        }
        livro.setId(id);
        Livro atualizado = repo.save(livro);
        return ResponseEntity.ok(atualizado);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> excluir(@PathVariable UUID id) {
        if (!repo.existsById(id)) {
            return ResponseEntity.notFound().build();
        }
        repo.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}