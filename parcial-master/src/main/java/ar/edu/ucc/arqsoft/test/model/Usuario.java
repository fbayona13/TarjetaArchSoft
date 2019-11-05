package ar.edu.ucc.arqsoft.test.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table (name= "USUARIO")
public class Usuario extends ObjetoGenerico {
	
	@Column (name= "NOMBRE", length= 600, nullable= false)
	private String nombre;
	@Column (name= "APELLIDO", length= 600, nullable= false)
	private String apellido;
	@Column (name= "DNI", length= 600, nullable= false)
	private Long dni;
	
	@OneToMany (fetch= FetchType.LAZY)
	@JoinColumn (name= "USUARIO_ID", nullable= false)
	private Tarjeta tarjeta;
	
	
	
	
	public Tarjeta getTarjeta() {
		return tarjeta;
	}
	public void setTarjeta(Tarjeta tarjeta) {
		this.tarjeta = tarjeta;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public Long getDni() {
		return dni;
	}
	public void setDni(Long dni) {
		this.dni = dni;
	}
	
	
	
}
