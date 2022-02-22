package co.com.sofka.demo.katacrud.repository;

import co.com.sofka.demo.katacrud.model.Todo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITodoRepository extends JpaRepository<Todo, Long> {
}
