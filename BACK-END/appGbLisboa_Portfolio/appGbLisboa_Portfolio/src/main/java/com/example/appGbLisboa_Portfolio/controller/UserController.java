package com.example.appGbLisboa_Portfolio.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.appGbLisboa_Portfolio.DAO.IUser;
import com.example.appGbLisboa_Portfolio.model.User;

@RestController
@CrossOrigin("*")
@RequestMapping("/contact")//pegue desse endpoint, dessa localização /contact
public class UserController {
	@Autowired //injeção de dependência dos métodos CRUD;
	private IUser dao; //propriedade da classe onde vou ter uma referência da interface que está extendendo do CrudRepository onde terá os nossos métodos CRUD
	
	@GetMapping
	public List <User> listUsers() {
		return (List<User>) dao.findAll() ;
	}
	
	@PostMapping
	public User createUser(@RequestBody User user) { //no corpo da requisição que eu vou fazer é um objeto do tipo User
		User newUser = dao.save(user); //novo usuário é o método de salvar = save(usuário que foi passado no corpo da requisição);
		return newUser;
	}
	
	@PutMapping
	public User updateUser(@RequestBody User user) {
		User userUpdate = dao.save(user);
		return userUpdate;
	}
	
	@DeleteMapping("/{id}") 
	public Optional<User> deleteUser(@PathVariable Integer id){
		Optional<User> userExclud = dao.findById(id);
		dao.deleteById(id);
		return userExclud;
	}
}
