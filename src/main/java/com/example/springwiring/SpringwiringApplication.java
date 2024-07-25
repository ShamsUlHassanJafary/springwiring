package com.example.springwiring;

import com.example.springwiring.example1.Parrot;
import com.example.springwiring.example1.Person;
import com.example.springwiring.example3.Car;
import com.example.springwiring.example3.Engine;
import com.example.springwiring.example4.Address;
import com.example.springwiring.example4.User;
import com.example.springwiring.example5.University;
import com.example.springwiring.example7.Book;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringwiringApplication {

	public static void main(String[] args) {

		var context = SpringApplication.run(SpringwiringApplication.class, args);

		/*
		example 1
		1- Wiring the beans using a direct method call between the @Bean methods
		 */

//		Parrot parrot = context.getBean("koko",Parrot.class);
//		Person person = context.getBean("person1",Person.class);
//
//		System.out.println("parrot Name " +parrot.getName());
//		System.out.println("Person name " + person.getName() + " and his Parrot name is "+person.getParrot().getName());



		/*
		example2
		// Wiring the beans using the @Bean annotated method’s parameters
		 */


//		Parrot parrot = context.getBean("miko",Parrot.class);
//		Person person = context.getBean("person2",Person.class);
//
//		System.out.println("parrot Name " +parrot.getName());
//		System.out.println("Person name " + person.getName() + " and his Parrot name is "+person.getParrot().getName());


		/*
		example 3
	Using @Autowired to inject the values through the class fields
	 */

//	Engine engine =	context.getBean(Engine.class);
//	System.out.println("Engine details "+ engine);
//	Car car = context.getBean(Car.class);
//	System.out.println("Car Details " + car);


		/*
		example 4
           Using @Autowired to inject the values through the constructor
           it is recommended.

	 */

//	User user =	context.getBean(User.class);
//	System.out.print("User details "+ user);


		/*
		example 5
		Using dependency injection through the setter
		it is not recommended.
		 */

//		University uni = context.getBean(University.class);
//		System.out.println(uni);



		/*
		example 7
		using @Qualifier for injecting a Bean from multiple beans of same type
		 */

		Book book = context.getBean(Book.class);
		System.out.println("Book Name "+ book.getName() + " Aurthor name " + book.getAuthor().getName());

	}

}
