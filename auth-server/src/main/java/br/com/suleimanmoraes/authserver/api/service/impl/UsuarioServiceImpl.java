package br.com.suleimanmoraes.authserver.api.service.impl;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.suleimanmoraes.authserver.api.model.Usuario;
import br.com.suleimanmoraes.authserver.api.repository.UsuarioRepository;
import br.com.suleimanmoraes.authserver.api.service.UsuarioService;

@Service
public class UsuarioServiceImpl implements UsuarioService{

	private static final Log logger = LogFactory.getLog(UsuarioService.class);

	@Autowired
	private UsuarioRepository repository;
	
	@Override
	public Usuario findByLogin(String login) {
		try {
			return repository.findTopByLogin(login);
		} catch (Exception e) {
			logger.warn("findByLogin " + e.getMessage());
			return null;
		}
	}
}
