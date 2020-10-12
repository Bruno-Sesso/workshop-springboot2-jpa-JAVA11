package br.com.brunosesso.workshopspring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.brunosesso.workshopspring.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
