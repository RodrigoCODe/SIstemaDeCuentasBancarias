package sistema;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ConsultarSaldoUnitTest {

	@Test
	@DisplayName("ConsultarSaldoTest")
	public void ConsultarSaldo_TodosLosAtributos_InstanaciasCorrectas() {
		
		Cliente elCliente = Cliente.FactoryCliente("20-26373646-2","Juan", "Perez","Arturo Illia 234", "21-12-1970", "0382512312355");
		
		Cuenta unaCuenta =  Cuenta.FactoryCuenta(1, "13-10-2010", elCliente);
		
		assertEquals(0.0,   unaCuenta.ConsultarSaldo());
				
	}
	
	@Test
	@DisplayName("ConsultarSaldoException")
	public void ConsultarSaldo_FaltaElAtributo_ConsultarSaldoExcpetion() {
		
		assertThrows(ConsultarSaldoException.class, () -> unaCuenta.ConsultarSaldo());
				
	}
	
	
}
