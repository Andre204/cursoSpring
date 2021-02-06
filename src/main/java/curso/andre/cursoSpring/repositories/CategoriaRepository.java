package curso.andre.cursoSpring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import curso.andre.cursoSpring.domain.Categoria;

@Repository	
public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {

}
