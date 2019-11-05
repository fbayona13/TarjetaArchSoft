package ar.edu.ucc.arqsoft.test.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table (name= "TARJETA")
public class Tarjeta extends ObjetoGenerico{
	
	@Column (name= "NUMERO", length= 600, nullable= false)
	private Long numero;
	@Column (name= "SALDO", length= 600, nullable= false)
	private Long saldo;
	
	@OneToOne (fetch= FetchType.LAZY)
	@JoinColumn (name= "TARJETA_ID")
	private Usuario usuario;
	
	
	
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
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
	
	

}
