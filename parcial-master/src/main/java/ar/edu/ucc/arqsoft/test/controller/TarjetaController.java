package ar.edu.ucc.arqsoft.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import ar.edu.ucc.arqsoft.test.dto.TransaccionDto;

@Controller
public class TarjetaController {
	
	@Autowired
	TarjetaController tarjetaService;
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@RequestMapping(value = "/transaccion", method = RequestMethod.POST, produces = "application/json")
	public ResponseEntity<?> mostrarSaldo(@RequestBody TransaccionDto dto) throws Exception {

		tarjetaService.mostrarSaldo(dto);

		return new ResponseEntity(dto, HttpStatus.CREATED);
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@RequestMapping(value = "/transaccion", method = RequestMethod.POST, produces = "application/json")
	public ResponseEntity<?> cargaSaldo(@RequestBody TransaccionDto dto) throws Exception {

		tarjetaService.cargaSaldo(dto);

		return new ResponseEntity(dto, HttpStatus.CREATED);
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@RequestMapping(value = "/transaccion", method = RequestMethod.POST, produces = "application/json")
	public ResponseEntity<?> altaTarjeta(@RequestBody TransaccionDto dto) throws Exception {

		tarjetaService.altaTarjeta(dto);

		return new ResponseEntity(dto, HttpStatus.CREATED);
	}



}
