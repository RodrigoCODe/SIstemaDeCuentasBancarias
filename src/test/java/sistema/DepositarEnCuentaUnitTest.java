package sistema;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class DepositarEnCuentaUnitTest {

	@Test
	@DisplayName("DepositarEnCuentaTest")
	public void DepositarEnCuenta_TodosLosAtributos_InstanciasCorrectas() {
		
		Cliente elCliente = Cliente.FactoryCliente("20-26373646-2","Juan", "Perez","Arturo Illia 234", "21-12-1970", "0382512312355");
		
		Cuenta unaCuenta =  Cuenta.FactoryCuenta(1, "13-10-2010", elCliente);
		
		assertTrue(unaCuenta.Depositar(5000.0));
		
		assertEquals(5000.0,unaCuenta.ConsultarSaldo());
	}
	
	@Test
	@DisplayName("DepositarEnCuentaException")
	public void DepositarEnCuenta_ValorInCorrecto_DepositarEnCuentaException() {
		
		Cliente elCliente = Cliente.FactoryCliente("20-26373646-2","Juan", "Perez","Arturo Illia 234", "21-12-1970", "0382512312355");
		
		Cuenta unaCuenta =  Cuenta.FactoryCuenta(1, "13-10-2010", elCliente);
		
		assertThrows(DepositarEnCuentaException.class, () -> unaCuenta.Depositar(null));
		assertThrows(DepositarEnCuentaException.class, () -> unaCuenta.Depositar(0.0));
		assertThrows(DepositarEnCuentaException.class, () -> unaCuenta.Depositar(-1.0));
		
	}
	
	
}
