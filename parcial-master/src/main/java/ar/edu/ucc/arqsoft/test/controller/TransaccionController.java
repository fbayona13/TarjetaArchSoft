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
public class TransaccionController {
	
	@Autowired 
	TransaccionController transaccionService;
	
	//Carga de saldo a la tarjeta
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@RequestMapping(value = "/addTransaccion", method = RequestMethod.POST, produces = "application/json")
	public ResponseEntity<?> addTransaccion(@RequestBody TransaccionDto dto) throws Exception {

		transaccionService.addTransaccion(dto);

		return new ResponseEntity(dto, HttpStatus.CREATED);
	}
	
	// Realiza una busqueda del monto de la tarjeta, si el monto es menor da RECHADA, si el monto mayor OK
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@RequestMapping(value = "/pedidoUtilizacion", method = RequestMethod.POST, produces = "application/json")
	public ResponseEntity<?> PedidoUtilizacion(@RequestBody TransaccionDto dto) throws Exception {

		transaccionService.PedidoUtilizacion(dto);

		return new ResponseEntity(dto, HttpStatus.OK);
	}
	
	
	//Busqueda de transacciones por ID
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@RequestMapping(value = "/GetById", method = RequestMethod.POST, produces = "application/json")
	public ResponseEntity<?> GetTransaccionById(@RequestBody TransaccionDto dto) throws Exception {

		transaccionService.GetTransaccionById(dto);

		return new ResponseEntity(dto, HttpStatus.OK);
	}
	
	//Devuelve todas las transacciones por ID
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@RequestMapping(value = "/All", method = RequestMethod.POST, produces = "application/json")
	public ResponseEntity<?> getAll(@RequestBody TransaccionDto dto) throws Exception {

		transaccionService.getAll(dto);

		return new ResponseEntity(dto, HttpStatus.OK);
	}
	
}
