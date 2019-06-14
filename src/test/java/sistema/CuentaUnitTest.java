package sistema;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CuentaUnitTest {

	@Test
	@DisplayName("CrearCuentaTest")
	public void CrearCuenta_TodosLosAtributos_InstanciaCorrecta() {
		
		Cliente elCliente = Cliente.FactoryCliente("20-26373646-2","Juan", "Perez","Arturo Illia 234", LocalDate.of(1970,12, 21), "0382512312355");
		
		Cuenta unaCuenta =  Cuenta.FactoryCuenta(1, LocalDate.of(2010, 10, 13), elCliente);
		
		assertNotNull(unaCuenta);
	}
	
	@Test
	@DisplayName("CrearCuentaExcpetion")
	public void CrearCuenta_FaltaAlgunAtributo_CuentaIncompletaException() {
		
		Cliente elCliente = Cliente.FactoryCliente("20-26373646-2","Juan", "Perez","Arturo Illia 234", "21-12-1970", "0382512312355");
		
		assertThrows(CuentaIncompletaException.class, () -> Cuenta.FactoryCuenta(null, LocalDate.of(2010, 10, 13), elCliente));
		assertThrows(CuentaIncompletaException.class, () -> Cuenta.FactoryCuenta(0, LocalDate.of(2010, 10, 13), elCliente));
		assertThrows(CuentaIncompletaException.class, () -> Cuenta.FactoryCuenta(-1, LocalDate.of(2010, 10, 13), elCliente));
		assertThrows(CuentaIncompletaException.class, () -> Cuenta.FactoryCuenta(1, null, elCliente));
		assertThrows(CuentaIncompletaException.class, () -> Cuenta.FactoryCuenta(1, LocalDate.of(2010, 10, 13), null));
		
	}
	

}
