package br.com.apsinformatica.deliveryauthserver.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.apsinformatica.deliveryauthserver.model.Authority;


public interface AuthorityRepository extends JpaRepository<Authority, String>{
	
	Authority findByName(String name);
}
