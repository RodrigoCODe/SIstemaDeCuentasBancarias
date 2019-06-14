package sistema;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.util.ArrayList;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ConsultarMovientosEntreFechasTest {

	@Test
	@DisplayName("ConsultarMovientosEntreFechasTest")
	public void ConsultarMivientosEntreFechas_TodosLosAtributos_InstanciasCorrectas() {
		
		Cliente elCliente = Cliente.FactoryCliente("20-26373646-2","Juan", "Perez","Arturo Illia 234", "21-12-1970", "0382512312355");
		
		Cuenta unaCuenta =  Cuenta.FactoryCuenta(1, "13-10-2010", elCliente);
		
		unaCuenta.Depositar(4000.0);
		
		unaCuenta.Depositar(2000.0);
		
		unaCuenta.Depositar(500.0);
		
		unaCuenta.Extraer(3500.0);
		
		unaCuenta.Extraer(1000.0);
		
		ArrayList<Movimiento> losMovimientos = unaCuenta.ObtenerMovimientosEntreFechas(LocalDate.of(2018, 5, 15),LocalDate.of(2019, 5, 20));
		
		assertEquals(5, losMovimientos.size());
		
				
	}
	
	@Test
	@DisplayName("")
	

}
