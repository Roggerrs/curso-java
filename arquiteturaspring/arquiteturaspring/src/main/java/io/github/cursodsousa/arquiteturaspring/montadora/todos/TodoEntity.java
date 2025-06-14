package io.github.cursodsousa.arquiteturaspring.montadora.todos;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_todo")
public class TodoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;           // <- Long em vez de String

    @Column(name = "descricao")
    private String descricao;

    @Column(name = "fl_concluido")
    private Boolean concluido;

    /* getters e setters */

    public Long getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {   // se quiser criar pelo JSON
        this.descricao = descricao;
    }

    public Boolean getConcluido() {
        return concluido;
    }
    public void setConcluido(Boolean concluido) {
        this.concluido = concluido;
    
    }

    public void setId(Integer id) {
    }
}