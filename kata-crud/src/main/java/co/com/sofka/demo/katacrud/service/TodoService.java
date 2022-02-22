package co.com.sofka.demo.katacrud.service;

import co.com.sofka.demo.katacrud.model.Todo;
import co.com.sofka.demo.katacrud.repository.ITodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoService {

    @Autowired
    private ITodoRepository repoTodo;

    public List<Todo> findAllTodo(){
        return repoTodo.findAll();
    }

    public Todo saveTodo(Todo todo){
        return repoTodo.save(todo);
    }

    public void deleteTodo(Long id){
        repoTodo.delete(findTodoById(id));
    }

    public Todo findTodoById(Long id){
        return repoTodo.findById(id).orElseThrow();
    }
}
