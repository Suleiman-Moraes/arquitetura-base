package br.com.suleimanmoraes.lojaservice.api.service.impl;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.suleimanmoraes.lojaservice.api.persistencia.repository.ClienteRepository;
import br.com.suleimanmoraes.lojaservice.api.service.ClienteService;
import lombok.Getter;

@Service
public class ClienteServiceImpl implements ClienteService{

	private static final Log logger = LogFactory.getLog(ClienteService.class);

	@Getter
	@Autowired
	private ClienteRepository repository;
	
	@Override
	public Log getLogger() {
		return logger;
	}
}
