package io.github.cursodsousa.arquiteturaspring.montadora.todos;

import org.springframework.stereotype.Service;

@Service
public class TodoService {

    private final TodoRepository repository;
    private TodoValidator validator;
    private MailSender mailSender;

    // Spring injeta automaticamente porque o construtor é público
    public TodoService(TodoRepository repository,
                       TodoValidator validator,
                       MailSender mailSender) {
        this.repository = repository;
        this.validator = validator;
        this.mailSender = mailSender;
    }

    public TodoEntity salvar(TodoEntity novoTodo) {
    validator.validar(novoTodo);
        return repository.save(novoTodo);

    }

    public void atualizarStatus(TodoEntity todo){
        repository.save(todo);
        String status  = todo.getConcluido() == Boolean.TRUE ? "Concluido" : "Não concluido";
        mailSender.enviar("Todo " + todo.getDescricao() + "foi atualizado para" + status);
    }

    public TodoEntity buscarPorId(Integer id){
        return repository.findById(Long.valueOf(id)).orElse(null);
    }
}