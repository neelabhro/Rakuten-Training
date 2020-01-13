package com.rakuten.prj.client;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.rakuten.prj.cfg.AppConfig;
import com.rakuten.prj.dao.CustomerDaoJpaImpl;
import com.rakuten.prj.dao.ProductDaoJpaImpl;
import com.rakuten.prj.entity.Customer;
import com.rakuten.prj.service.OrderService;

public class CustomerInsertClient {

	public static void main(String[] args) {
		// creates a Spring container
				AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
				
				// new ClassPathXMLApplicationContext("beans.xml")
		        ctx.register(OrderService.class);
		        ctx.register(CustomerDaoJpaImpl.class);
		        ctx.register(ProductDaoJpaImpl.class);
		        ctx.register(AppConfig.class);
		        ctx.refresh();
		        
		        OrderService os = ctx.getBean("orderService",OrderService.class);
		        
		        Customer[] customers = new Customer[3];
				customers[0] = new Customer("rahul@rakuten.com","Rahul Bhatia");
				customers[1] = new Customer("rohan@rakuten.com","Rohan");
				customers[2] = new Customer("johndoe@rakuten.com","John Doe");
				
		       for(Customer c:customers) {
		    	   os.insertCustomer(c);
		       }
		       
		       System.out.println("Customers inserted!");
			}


	}


