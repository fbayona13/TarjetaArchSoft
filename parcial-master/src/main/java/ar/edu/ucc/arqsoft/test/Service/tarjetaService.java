package ar.edu.ucc.arqsoft.test.Service;

import org.apache.log4j.Logger;

import ar.edu.ucc.arqsoft.test.dao.DaoGenerico;
import ar.edu.ucc.arqsoft.test.dto.TarjetaDto;
import ar.edu.ucc.arqsoft.test.model.Tarjeta;

public class tarjetaService {
	
	private Logger log = Logger.getLogger(this.getClass());
	
	DaoGenerico <Tarjeta, Long> TarjetaDao;
	
	public TarjetaDto mostrarSaldo (TarjetaDto dto) {
		Tarjeta tarjeta = new Tarjeta();
		
		TarjetaDao.load(tarjeta.getSaldo());
		log.info ("EL SALDO ES DE: " + dto.getSaldo());
		
		return dto;
	}
	
	public void cargaSaldo (TarjetaDto dto) {
		Tarjeta tarjeta = TarjetaDao.load(dto.getSaldo());
		
		tarjeta.setSaldo(dto.getSaldo());
		
		TarjetaDao.update(tarjeta);
		log.info("SE LE CARGO SALDO " + dto.getSaldo());
		
	}
	
	// verifica que el usuario no exista antes de darle el alta a la tarjeta
	public void altaTarjeta (TarjetaDto dto) {
		Tarjeta tarjeta = TarjetaDao.load(dto.getUsuario());
		
		if (dto.getUsuario() != null) {
			log.info("EL USUARIO YA EXISTE");
		}
		
		if (dto.getUsuario() == null) {
			tarjeta.setNumero(dto.getNumero());
			tarjeta.setSaldo(dto.getSaldo());
			tarjeta.setUsuario(dto.getUsuario());
			
			TarjetaDao.update(tarjeta);
			log.info("ALTA TARJETA USUARIO");
		}
	}

}
