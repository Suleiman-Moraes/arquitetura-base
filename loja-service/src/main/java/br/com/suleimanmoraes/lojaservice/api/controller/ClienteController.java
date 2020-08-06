package br.com.suleimanmoraes.lojaservice.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.suleimanmoraes.lojaservice.api.controller.abstracts.ControllerBasic;
import br.com.suleimanmoraes.lojaservice.api.model.Cliente;
import br.com.suleimanmoraes.lojaservice.api.service.ClienteService;
import lombok.Getter;

@RestController
@RequestMapping("/cliente")
public class ClienteController extends ControllerBasic<Cliente>{

	@Getter
	@Autowired
	private ClienteService service;
}
