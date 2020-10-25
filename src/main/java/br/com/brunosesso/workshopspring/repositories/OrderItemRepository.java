package br.com.brunosesso.workshopspring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.brunosesso.workshopspring.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}