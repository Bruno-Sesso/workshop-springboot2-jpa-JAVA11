package br.com.brunosesso.workshopspring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.brunosesso.workshopspring.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}