package com.demo.demonstration;

import java.util.Arrays;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.demo.demonstration.model.CategoryProductMap;
import com.demo.demonstration.model.Product;

/**
 * Hello world!
 *
 */
@SpringBootApplication
public class MainClass 
{

	@Autowired
	CategoryProductMap categoryProductMap;

	
    public static void main( String[] args )
    {
        SpringApplication.run(MainClass.class, args);
    }

	@PostConstruct
	public void abcd() {
		Product obj1 = new Product();
		obj1.setId(1);
		obj1.setName("reebok");
		obj1.setDescription("It is a new shoe of Rebook");
		obj1.setImageUrl("url1");
		obj1.setRelatedProducts(Arrays.asList("laces","shoe-polish"));
		categoryProductMap.addObj("shoes", obj1);
		
		
		
		Product obj2 = new Product();
		obj2.setId(2);
		obj2.setName("adidas");
		obj2.setDescription("It is a new shoe of Adidas");
		obj2.setImageUrl("url2");
		obj2.setRelatedProducts(Arrays.asList("laces","shoe-polish"));
		categoryProductMap.addObj("shoes", obj2);
		
		
		Product obj3 = new Product();
		obj3.setId(3);
		obj3.setName("Redmi Note 4");
		obj3.setDescription("It is a new mobile of Redmi");
		obj3.setImageUrl("urlRedmi");
		obj3.setRelatedProducts(Arrays.asList("BackCover","Tempered Glass"));
		categoryProductMap.addObj("mobiles", obj3);
		
	}
}
