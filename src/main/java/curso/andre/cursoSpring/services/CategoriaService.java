package curso.andre.cursoSpring.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import curso.andre.cursoSpring.domain.Categoria;
import curso.andre.cursoSpring.repositories.CategoriaRepository;
import curso.andre.cursoSpring.services.exceptions.ObjectNotFoundException;

//A anotação @service indica que a classe trazer a regra de negócio ou seja a lógica do sistema
@Service
public class CategoriaService {

	@Autowired
	private CategoriaRepository repo;
	
	public Categoria buscar(Integer id) {
		Optional<Categoria> obj = repo.findById(id);
			return obj.orElseThrow(() -> new ObjectNotFoundException(
					"Objeto não encontrado! Id: " + id
					+ "Tipo: " + Categoria.class.getName()));
	}	
	
}
