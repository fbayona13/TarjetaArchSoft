package ar.edu.ucc.arqsoft.test.Service;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ar.edu.ucc.arqsoft.test.dao.DaoGenerico;
import ar.edu.ucc.arqsoft.test.dto.TarjetaDto;
import ar.edu.ucc.arqsoft.test.dto.TransaccionDto;
import ar.edu.ucc.arqsoft.test.model.Transaccion;

@Service
@Transactional
public class transaccionService extends tarjetaService {
	
	private Logger log = Logger.getLogger(this.getClass());
	
	@Autowired
	DaoGenerico<Transaccion, Long> TransaccionDao;
	
	
	public void addTransaccion (TransaccionDto dto) {
		Transaccion transaccion = new Transaccion();
		
		transaccion.setFecha(dto.getDate());
		transaccion.setMonto(dto.getMonto());
		transaccion.setOperacion(dto.getDebito());
		transaccion.setTarjeta(dto.getTarjeta());
		
		TransaccionDao.saveOrUpdate(transaccion);
		
		log.info("se cargo la transaccion");
	}
	
	//pedido de utilizacion por un monto xx
	public void PedidoUtilizacion (tarjetaService ser) {
		TarjetaDto dto2 = new TarjetaDto();
		
		ser.mostrarSaldo(dto2);
		
		if (dto2.getSaldo()<0) {
			log.info("RECHAZADA" + dto2.getSaldo());
		}
		if (dto2.getSaldo()>0){
			log.info("OK");
		}
		
	}
	
		
	public TransaccionDto GetTransaccionById (Long id) {
		Transaccion transaccion = TransaccionDao.load(id);
		
		TransaccionDto dto = new TransaccionDto();
		
		dto.setMonto(transaccion.getMonto());
		dto.setId(transaccion.getId());
		
		
		return dto;
		
	}
	
	// obtiene todos las transacciones por ID
	public List <TransaccionDto> getAll(){
		List <Transaccion> transaccions;
		transaccions = TransaccionDao.getAll();
		
		List <TransaccionDto> TransaccionDtos = new ArrayList <TransaccionDto>();
		
		for (Transaccion t : transaccions) {
			TransaccionDtos.add(new TransaccionDto(t.getFecha(), t.getMonto(), t.getOperacion(), t.getTarjeta(), t.getId()));
		}
		
		return TransaccionDtos;
	}

}
