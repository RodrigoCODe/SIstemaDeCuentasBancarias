package sistema;

@SuppressWarnings("serial")

public class FechaIncorrectaException extends Exception {

	@Override
    public String getMessage(){
    
        return "La Fecha es Incorrecta";
    }
}