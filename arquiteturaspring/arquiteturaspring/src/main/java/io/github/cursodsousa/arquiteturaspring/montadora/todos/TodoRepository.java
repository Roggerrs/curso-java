package io.github.cursodsousa.arquiteturaspring.montadora.todos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepository extends JpaRepository<TodoEntity, Long> {
boolean existsByDescricao(String descricao);
}
