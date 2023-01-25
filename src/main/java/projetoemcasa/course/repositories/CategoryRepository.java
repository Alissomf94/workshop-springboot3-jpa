package projetoemcasa.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import projetoemcasa.course.entities.Category;


public interface CategoryRepository extends JpaRepository <Category,Long>{
	
}
