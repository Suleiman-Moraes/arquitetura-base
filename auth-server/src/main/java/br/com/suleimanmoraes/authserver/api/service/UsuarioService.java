package br.com.suleimanmoraes.authserver.api.service;

import org.springframework.stereotype.Component;

import br.com.suleimanmoraes.authserver.api.model.Usuario;

@Component
public interface UsuarioService {

	Usuario findByLogin(String login);
}
