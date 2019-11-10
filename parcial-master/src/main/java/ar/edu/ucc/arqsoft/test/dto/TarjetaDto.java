package ar.edu.ucc.arqsoft.test.dto;

import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;

import ar.edu.ucc.arqsoft.test.model.Usuario;

public class TarjetaDto {
	
	private Long numero;
	private Long saldo;
	private Usuario usuario;
	private Id id;
	
	
	
	public TarjetaDto() {
		
	}
	public TarjetaDto(Long nu, Long sa, Usuario us, Id id) {
		super();
		this.numero = nu;
		this.saldo = sa;
		this.usuario = us;
		this.id = id;
		
	}
	
	public Id getId() {
		return id;
	}
	public void setId(Id id) {
		this.id = id;
	}
	public Long getNumero() {
		return numero;
	}
	public void setNumero(Long numero) {
		this.numero = numero;
	}
	public Long getSaldo() {
		return saldo;
	}
	public void setSaldo(Long saldo) {
		this.saldo = saldo;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	

}
