package curso.andre.cursoSpring.resources.exception;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import curso.andre.cursoSpring.resources.StandardError;
import curso.andre.cursoSpring.services.exceptions.ObjectNotFoundException;

//Implementação de uma classe auxiliar que vai interceptar as exceções 
@ControllerAdvice
public class RessourceExceptionHandler {

	@ExceptionHandler(ObjectNotFoundException.class)
	//Assinatura obrigatória para o @ControllerAdvice
	public ResponseEntity<StandardError> objectNotFound (ObjectNotFoundException e, HttpServletRequest request){
		
		StandardError err = new StandardError(HttpStatus.NOT_FOUND.value(), e.getMessage(), System.currentTimeMillis());
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(err);
	}
	
}
