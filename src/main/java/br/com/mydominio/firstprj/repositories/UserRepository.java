package br.com.mydominio.firstprj.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.mydominio.firstprj.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

	
}
