package com.gherard.rest;


import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.gherard.model.ModelData;

@RestController
@RequestMapping(path = "/rest/dataGC")

public class RestData {
	
	//Funciones
	
	@GetMapping(path = "/obtenDatos", produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody ModelData getData(@RequestParam(name = "msg") String message) {
		ModelData response = new ModelData();
		if(message.equals("GC")) {
			response.setCode(200);
			response.setStatus(true);
			response.setMensaje("Mensaje Succes:. . . ");
		} else {
			response.setCode(402);
			response.setStatus(false);
			response.setMensaje("Mensaje Fallido: "+message);
		}
		return response;
	}
}
