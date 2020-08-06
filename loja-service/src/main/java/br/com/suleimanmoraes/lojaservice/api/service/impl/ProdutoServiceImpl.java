package br.com.suleimanmoraes.lojaservice.api.service.impl;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.suleimanmoraes.lojaservice.api.persistencia.repository.ProdutoRepository;
import br.com.suleimanmoraes.lojaservice.api.service.ProdutoService;
import lombok.Getter;

@Service
public class ProdutoServiceImpl implements ProdutoService{

	private static final Log logger = LogFactory.getLog(ProdutoService.class);

	@Getter
	@Autowired
	private ProdutoRepository repository;
	
	@Override
	public Log getLogger() {
		return logger;
	}
}
