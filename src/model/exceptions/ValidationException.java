package model.exceptions;

import java.util.HashMap;
import java.util.Map;

public class ValidationException extends RuntimeException{
	//Exceção para validar um formulário

	private static final long serialVersionUID = 1L;

	//O primeiro string vai indicar o nome do campo, o segundo string vai indicar a msg de erro;
	private Map<String, String> errors = new HashMap<>();
	
	public ValidationException(String msg) {
		super(msg);
	}
	
	public Map<String, String> getErrors(){
		return errors;
	}
	
	public void addError(String fieldName, String errorMessage) {
		errors.put(fieldName, errorMessage); 
	}
}
