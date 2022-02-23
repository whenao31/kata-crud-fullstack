package co.com.sofka.demo.katacrud.controller;

import co.com.sofka.demo.katacrud.model.Todo;
import co.com.sofka.demo.katacrud.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/api")
public class TodoController {

    @Autowired
    private TodoService serviceTodo;

    @GetMapping("/todos")
    public List<Todo> findAllTodos(){
        return serviceTodo.findAllTodo();
    }

    @PostMapping("/todo")
    public Todo saveTodo(@RequestBody Todo todo){
        return serviceTodo.saveTodo(todo);
    }

    @PutMapping("/todo")
    public Todo updateTodo(@RequestBody Todo todo){
        if (todo.getId() != null){
            return serviceTodo.saveTodo(todo);
        }
        throw new RuntimeException("No existe el id para actualizar");
    }

    @GetMapping("/todo/{id}")
    public Todo findTodoById(@PathVariable("id") Long id){
        return serviceTodo.findTodoById(id);
    }

    @DeleteMapping("/todo/{id}")
    public void deleteTodoById(@PathVariable("id") Long id){
        serviceTodo.deleteTodo(id);
    }
}
