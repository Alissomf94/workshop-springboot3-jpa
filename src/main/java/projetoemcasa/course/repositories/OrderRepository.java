package projetoemcasa.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import projetoemcasa.course.entities.Order;


public interface OrderRepository extends JpaRepository <Order,Long>{
	
}
