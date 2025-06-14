package io.github.cursodsousa.arquiteturaspring;

import io.github.cursodsousa.arquiteturaspring.montadora.todos.TodoEntity;
import io.github.cursodsousa.arquiteturaspring.montadora.todos.TodoValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Lazy
@Component
@Scope("singleton")
public class BeanGerenciado {

@Autowired
    private TodoValidator validator;

@Autowired
private AppProperties properties;

@Autowired
public BeanGerenciado(TodoValidator validator){
    this.validator = validator;

}

public void  utulizar(){
    var todo = new TodoEntity();
    validator.validar(todo);
}

@Autowired
    public void  setValidator(TodoValidator validator){
    this.validator = validator;
}

}
