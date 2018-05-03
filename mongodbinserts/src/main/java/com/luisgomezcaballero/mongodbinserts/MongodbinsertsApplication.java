package com.luisgomezcaballero.mongodbinserts;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MongodbinsertsApplication implements CommandLineRunner {

	@Autowired
	private MyEntityRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(MongodbinsertsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		repository.deleteAll();

		repository.save(new MyEntity("text1", "user1", "active"));
		repository.save(new MyEntity("text2", "user1", "active"));
		repository.save(new MyEntity("text3", "user2", "disabled"));
		repository.save(new MyEntity("text4", "user2", "active"));
		repository.save(new MyEntity("text5", "user2", "disabled"));
		repository.save(new MyEntity("text6", "user2", "active"));
		repository.save(new MyEntity("text7", "user2", "disabled"));
		repository.save(new MyEntity("text8", "user2", "active"));
		repository.save(new MyEntity("text9", "user3", "active"));

		System.out.println("findAll():");
		for (MyEntity myEntity : repository.findAll()) {
			System.out.println(myEntity);
		}

	}
}
