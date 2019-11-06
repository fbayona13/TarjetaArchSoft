package ar.edu.ucc.arqsoft.test.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table (name= "TRANSACCION")
public class Transaccion extends ObjetoGenerico {


		@Column (name= "FECHA")
		private Date fecha;
		@Column (name= "MONTO", length= 300, nullable= false)
		private Long monto;
		@Column (name= "OPERACION", length= 300, nullable= false)
		private Debito operacion;
		
		@ManyToOne (fetch= FetchType.LAZY)
		@Column (name= "TARJETA", length= 300, nullable= false)
		private Tarjeta tarjeta;
		
		
		public Date getFecha() {
			return fecha;
		}
		public void setFecha(Date fecha) {
			this.fecha = fecha;
		}
		public Long getMonto() {
			return monto;
		}
		public void setMonto(Long monto) {
			this.monto = monto;
		}
		public Debito getOperacion() {
			return operacion;
		}
		public void setOperacion(Debito operacion) {
			this.operacion = operacion;
		}
		public Tarjeta getTarjeta() {
			return tarjeta;
		}
		public void setTarjeta(Tarjeta tarjeta) {
			this.tarjeta = tarjeta;
		}
		
		
}
