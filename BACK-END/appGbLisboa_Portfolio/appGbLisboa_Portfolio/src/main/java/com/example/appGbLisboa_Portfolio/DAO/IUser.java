package com.example.appGbLisboa_Portfolio.DAO;

import org.springframework.data.repository.CrudRepository;

import com.example.appGbLisboa_Portfolio.model.User;


public interface IUser extends CrudRepository<User, Integer> {//No parâmetro genérico da interface, eu passo o Objeto no qual vai ser trabalhado, e o tipo do seu identificador único PK, id
	
}
