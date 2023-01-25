package projetoemcasa.course.resources;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import projetoemcasa.course.entities.Category;
import projetoemcasa.course.repositories.CategoryRepository;


@RestController
@RequestMapping(value = "/categories")
public class CategoryResources {
	
	@Autowired
	private CategoryRepository service;
	
	@GetMapping
	public ResponseEntity <List<Category>> findAll (){
		
		List <	Category> list = service.findAll();
		
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping (value = "/{id}")
	public ResponseEntity<Optional<Category>> findById (@PathVariable Long id){
		Optional<Category> obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
}
