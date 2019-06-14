package sistema;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.time.Period;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ClienteUnitTest {

	@Test
	@DisplayName("InstanciarClienteTest")
	public void InstanciarCliente_TodosLosAtributos_InstanciasCorrectas() throws ClienteIncompletoException, ClienteMenorDeEdadException, FechaIncorrectaException {
		
		LocalDate fechaNacimientoCliente = LocalDate.of(1970, 10, 2);
		
		LocalDate fechaDeHoy = LocalDate.of(2018, 10, 20);
		
		Cliente unCliente = Cliente.FactoryCliente(1,"20-26373646-2","Juan", "Perez","Arturo Illia 234", fechaNacimientoCliente,fechaDeHoy, "0382512312355");
		
		assertNotNull(unCliente);
	}
	
	@Test
	@DisplayName("InstanciarClienteIncompletoException")
	public void InstanciarCliente_FaltaAlgunAtributo_ClienteIncompletoException() {
		
		LocalDate fechaNacimientoCliente = LocalDate.of(1970, 10, 2);
		
		LocalDate fechaDeHoy = LocalDate.of(2018, 10, 20);
		
		assertThrows(ClienteIncompletoException.class, () -> Cliente.FactoryCliente(1, null,"Juan", "Perez","Arturo Illia 234", fechaNacimientoCliente,fechaDeHoy, null));
		assertThrows(ClienteIncompletoException.class, () -> Cliente.FactoryCliente(1, "","Juan", "Perez","Arturo Illia 234", fechaNacimientoCliente,fechaDeHoy, "0382512312355"));
		assertThrows(ClienteIncompletoException.class, () -> Cliente.FactoryCliente(1, "20-26373646-2","", "Perez","Arturo Illia 234", fechaNacimientoCliente,fechaDeHoy, "0382512312355"));
		assertThrows(ClienteIncompletoException.class, () -> Cliente.FactoryCliente(1, "20-26373646-2",null, "Perez","Arturo Illia 234", fechaNacimientoCliente,fechaDeHoy, "0382512312355"));
		assertThrows(ClienteIncompletoException.class, () -> Cliente.FactoryCliente(1, "20-26373646-2","Juan", null,"Arturo Illia 234", fechaNacimientoCliente,fechaDeHoy, "0382512312355"));
		assertThrows(ClienteIncompletoException.class, () -> Cliente.FactoryCliente(1, "20-26373646-2","Juan", "","Arturo Illia 234", fechaNacimientoCliente,fechaDeHoy, "0382512312355"));
		assertThrows(ClienteIncompletoException.class, () -> Cliente.FactoryCliente(1, "20-26373646-2","Juan", "Perez",null, fechaNacimientoCliente,fechaDeHoy, "0382512312355"));
		assertThrows(ClienteIncompletoException.class, () -> Cliente.FactoryCliente(1, "20-26373646-2","Juan", "Perez","", fechaNacimientoCliente,fechaDeHoy, "0382512312355"));
	
		
				
	}
	
	@Test
	@DisplayName("InstanciarClienteMenorDeEdadException")
	public void InstanciarCliente_MenorDeEdad_ClienteMenorDeEdadException() {
		
		LocalDate fechaNacimientoCliente = LocalDate.of(2002, 10, 2);
		
		LocalDate fechaDeHoy = LocalDate.of(2018, 10, 20);
		
		assertThrows(ClienteMenorDeEdadException.class, () ->  Cliente.FactoryCliente(1, "20-26373646-2","Juan", "Perez","Arturo Illia 234", fechaNacimientoCliente, fechaDeHoy,  "0382512312355"));
		
		
		
		System.out.println("La edad es : " + (fechaDeHoy.getYear() - fechaNacimientoCliente.getYear()));
		  
		
	}
	
	

}
