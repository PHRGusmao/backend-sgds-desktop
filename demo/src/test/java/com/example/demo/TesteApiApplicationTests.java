package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.db.controller.ApiService;
import com.example.demo.entidade.Usuario;

import java.util.List;

@SpringBootTest
class TesteApiApplicationTests {

	@Autowired
	private ApiService apiService;

	@Test
	public void testGetUser() {
		
	}

}
