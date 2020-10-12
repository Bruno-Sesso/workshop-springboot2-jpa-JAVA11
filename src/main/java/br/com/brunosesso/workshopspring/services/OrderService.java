package br.com.brunosesso.workshopspring.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.brunosesso.workshopspring.entities.Order;
import br.com.brunosesso.workshopspring.repositories.OrderRepository;

@Service
public class OrderService {
	
	@Autowired
	private OrderRepository repository;
	
	public List<Order> findAll() {
		return repository.findAll();
	}
	
	public Order findById (Long id) {
		Optional<Order> opt = repository.findById(id);
		return opt.get();
	}
}