package ar.edu.ucc.arqsoft.test.Service;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ar.edu.ucc.arqsoft.test.dao.DaoGenerico;
import ar.edu.ucc.arqsoft.test.dto.TransaccionDto;
import ar.edu.ucc.arqsoft.test.model.Transaccion;

@Service
@Transactional
public class transaccionService {
	
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
}
