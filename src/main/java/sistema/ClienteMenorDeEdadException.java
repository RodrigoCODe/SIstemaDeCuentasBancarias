package sistema;

@SuppressWarnings("serial")

public class ClienteMenorDeEdadException extends Exception {

	@Override
    public String getMessage(){
    
        return "El Cliente es menor de Edad";
    }
	
}
