package sistema;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ExtraerDeCuentaUnitTest {

	@Test
	@DisplayName("ExtraerDeCuentaUnitTest")
	public void ExtraerDeCuenta_TodosLosAtributos_InstanciasCorrectas() {
		
		Cliente elCliente = Cliente.FactoryCliente("20-26373646-2","Juan", "Perez","Arturo Illia 234", "21-12-1970", "0382512312355");
		
		Cuenta unaCuenta =  Cuenta.FactoryCuenta(1, "13-10-2010", elCliente);
		
		unaCuenta.Depostiar(6000.0);
		
		assertTrue(unaCuenta.Extraer(3000.0));
	}
	
	@Test
	@DisplayName("ExtraerDeCuentaException")
	public void ExtraerDeCuenta_MontoIncorrecto_ExtraerDeCuentaException() {
		
		Cliente elCliente = Cliente.FactoryCliente("20-26373646-2","Juan", "Perez","Arturo Illia 234", "21-12-1970", "0382512312355");
		
		Cuenta unaCuenta =  Cuenta.FactoryCuenta(1, "13-10-2010", elCliente);
		
		unaCuenta.Depostiar(6000.0);
		
		assertThrows(ExtraerDeCuentaException.class, () -> unaCuenta.Extraer(6500.0));
		assertThrows(ExtraerDeCuentaException.class, () -> unaCuenta.Extraer(0.0));
		assertThrows(ExtraerDeCuentaException.class, () -> unaCuenta.Extraer(null));
	}
	
	
	
}
