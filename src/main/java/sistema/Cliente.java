package sistema;

import java.time.LocalDate;
import java.time.Period;

public class Cliente {
	
	private Integer idCliente;
	private String cuiCLiente;
	private String nombres;
	private String apellido;
	private String direccion;
	private LocalDate fechaDeNacimiento;
	private LocalDate fechaDeHoy;
	private String telefono;
	
	
	private Cliente(Integer idCliente, String cuilCliente, String nombres, String apellido, String direccion,
			LocalDate fechaDeNacimiento, String telefono) {
		
			this.idCliente = idCliente;
			this.cuiCLiente = cuilCliente;
			this.nombres = nombres;
			this.apellido = apellido;
			this.direccion = direccion;
			this.fechaDeNacimiento = fechaDeNacimiento;
			this.telefono = telefono;
	}
	
	
	public static Cliente FactoryCliente(Integer idCliente, String cuilCliente, String nombres, String apellido, String direccion,
			LocalDate fechaDeNacimiento, LocalDate fechaDeHoy, String telefono) throws ClienteIncompletoException, ClienteMenorDeEdadException, FechaIncorrectaException {
		
			if(idCliente == null || idCliente <= 0 || cuilCliente == null || cuilCliente == "" || nombres == null || 
				nombres == "" || apellido == null || apellido == "" || direccion == null || direccion == "" || telefono == null ||
				telefono == "") {
					throw new ClienteIncompletoException();
			}else {
				  
				if(fechaDeNacimiento.isAfter(fechaDeHoy)){  
					throw new FechaIncorrectaException(); 
				}else {
					if(fechaDeHoy.getYear()-fechaDeNacimiento.getYear() < 18) {
						throw new ClienteMenorDeEdadException();	
					}else {
						return new Cliente(idCliente, cuilCliente, nombres, apellido, direccion, fechaDeNacimiento, telefono);
					}
				}
			}
	}


	public Integer getIdCliente() {
		return idCliente;
	}


	public String getCuiCLiente() {
		return cuiCLiente;
	}


	public String getNombres() {
		return nombres;
	}


	public String getApellido() {
		return apellido;
	}


	public String getDireccion() {
		return direccion;
	}


	public LocalDate getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}


	public LocalDate getFechaDeHoy() {
		return fechaDeHoy;
	}


	public String getTelefono() {
		return telefono;
	}
	
	
	
	
	
	
}