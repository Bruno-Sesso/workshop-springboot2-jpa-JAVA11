package br.com.brunosesso.workshopspring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.brunosesso.workshopspring.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}