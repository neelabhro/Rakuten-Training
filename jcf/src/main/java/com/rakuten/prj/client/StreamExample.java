package com.rakuten.prj.client;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.rakuten.prj.entity.Product;

public class StreamExample {
	public static void main(String[] args) {
		List<Product> products = new ArrayList<>();
		products.add(new Product(645, "Hp Laptop", 135000.00, "computer"));
        products.add(new Product(224, "iPhone", 98000.00, "mobile"));
        products.add(new Product(834, "Logitech Mouse", 600.00, "computer"));
        products.add(new Product(5, "Sony Bravia", 125000.00, "tv"));
        products.add(new Product(912, "One Plus", 32000.00, "mobile"));
        products.add(new Product(88, "HP Printer", 19000.00, "computer"));
        
		
		List<Product> mobiles = 
				products.stream()
				.filter(p->p.getCategory().equalsIgnoreCase("mobile"))
				.collect(Collectors.toList());
		
		
//		mobiles.forEach(p->System.out.println(p));
		mobiles.forEach(System.out::println); // method reference
		
		products.stream()
		.map(p->p.getName())
		.forEach(System.out::println);
			  
		double sum = products.stream()
					 .map(p->p.getPrice())
					 .reduce(0.0, (v1,v2)->v1+v2);
		
		System.out.println(sum);
		
		Map<String,List<Product>> productCat = products.stream().collect(Collectors.groupingBy(p->p.getCategory()));
		
		List<Product> computers = productCat.get("computer");
		for(Product p : computers) {
			System.out.println(p);
		}
		
		
		System.out.println("*************");
		// Task
		String str = "Java is OOP, Java is great, hail Java";
		String[] wordArray = str.split("[, ]");
		 Map<String, Integer> hm = new HashMap<String, Integer>();
		    int x;
		    for (int i = 0; i < wordArray.length; i++) {
		        if (hm.containsKey(wordArray[i])) {
		            x = hm.get(wordArray[i]);
		            hm.put(wordArray[i], x + 1);
		        } else {
		            hm.put(wordArray[i], 1);
		        }
		    }
		    for (String key : hm.keySet()) {
		        System.out.println(key + " " + hm.get(key));
		    }
	}
}
