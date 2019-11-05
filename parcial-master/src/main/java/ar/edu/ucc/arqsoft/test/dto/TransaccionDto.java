package ar.edu.ucc.arqsoft.test.dto;

import java.util.Date;

import ar.edu.ucc.arqsoft.test.model.Debito;
import ar.edu.ucc.arqsoft.test.model.Tarjeta;

public class TransaccionDto {
	
	private Date date;
	private Long monto;
	private Debito debito;
	private Tarjeta tarjeta;
	
	
	
	public TransaccionDto() {
		
	}
	public TransaccionDto(Date dt, Long  mt, Debito db, Tarjeta tr) {
		super();
		this.date= dt;
		this.debito= db;
		this.monto= mt;
		this.tarjeta= tr;
		
		
	}
	
	
	
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Long getMonto() {
		return monto;
	}
	public void setMonto(Long monto) {
		this.monto = monto;
	}
	public Debito getDebito() {
		return debito;
	}
	public void setDebito(Debito debito) {
		this.debito = debito;
	}
	public Tarjeta getTarjeta() {
		return tarjeta;
	}
	public void setTarjeta(Tarjeta tarjeta) {
		this.tarjeta = tarjeta;
	}
	
	
	

}
