package com.meuportifolio.course.config;

import com.meuportifolio.course.entities.Category;
import com.meuportifolio.course.entities.Order;
import com.meuportifolio.course.entities.User;
import com.meuportifolio.course.entities.enums.OrderStatus;
import com.meuportifolio.course.repositories.CategoryRepository;
import com.meuportifolio.course.repositories.OrderRepository;
import com.meuportifolio.course.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.time.Instant;
import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired // independence injection of user
    private UserRepository userRepository;

    @Autowired // independence injection of category
    private CategoryRepository categoryRepository;

    @Autowired // independence injection of order
    private OrderRepository orderRepository;


    @Override
    public void run(String... args) throws Exception {

        // users lists
        User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
        User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456");

        // orders lists
        Order o1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), OrderStatus.PAID, u1);
        Order o2 = new Order(null, Instant.parse("2019-07-21T03:42:10Z"), OrderStatus.DELIVERED, u2);
        Order o3 = new Order(null, Instant.parse("2019-07-22T15:21:22Z"), OrderStatus.DELIVERED, u1);

        // categories lists
        Category cat1 = new Category(null, "Electronics");
        Category cat2 = new Category(null, "Books");
        Category cat3 = new Category(null, "Computers");

        // add users in list
        userRepository.saveAll(Arrays.asList(u1, u2));

        // add orders in list
        orderRepository.saveAll(Arrays.asList(o1, o2, o3));

        // add categories in list
        categoryRepository.saveAll(Arrays.asList(cat1, cat2, cat3));
    }


}
