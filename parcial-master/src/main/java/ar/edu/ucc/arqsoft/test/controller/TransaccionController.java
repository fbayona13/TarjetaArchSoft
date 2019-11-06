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
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@RequestMapping(value = "/transaccion", method = RequestMethod.POST, produces = "application/json")
	public ResponseEntity<?> addTransaccion(@RequestBody TransaccionDto dto) throws Exception {

		transaccionService.addTransaccion(dto);

		return new ResponseEntity(dto, HttpStatus.CREATED);
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@RequestMapping(value = "/transaccion", method = RequestMethod.POST, produces = "application/json")
	public ResponseEntity<?> GetTransaccionById(@RequestBody TransaccionDto dto) throws Exception {

		transaccionService.GetTransaccionById(dto);

		return new ResponseEntity(dto, HttpStatus.CREATED);
	}
	
}
