package com.aprakash.grocerymongodb;

import com.aprakash.grocerymongodb.model.GroceryItem;
import com.aprakash.grocerymongodb.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import java.util.List;

@SpringBootApplication
@EnableMongoRepositories(basePackages = "com.aprakash.grocerymongodb")
public class GrocerymongodbApplication {

	public static void main(String[] args) {
		SpringApplication.run(GrocerymongodbApplication.class, args);
	}

}
