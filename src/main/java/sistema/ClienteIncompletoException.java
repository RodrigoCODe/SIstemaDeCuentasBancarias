package sistema;

@SuppressWarnings("serial")

public class ClienteIncompletoException extends Exception {

	@Override
    public String getMessage(){
    
        return "El Cliente está Incompleto";
    }
	
}
