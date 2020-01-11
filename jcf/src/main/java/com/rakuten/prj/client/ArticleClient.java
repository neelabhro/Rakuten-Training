package com.rakuten.prj.client;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.rakuten.prj.entity.Article;

public class ArticleClient {

	public static void main(String[] args) {
	    List<Article> articles = new ArrayList<>();
        articles.add(new Article("NoDBA",561,"bliki",Arrays.asList("nosql","people","orm")));
        articles.add(new Article("Infodesk",1145,"bliki",Arrays.asList("nosql","writing")));
        articles.add(new Article("OrmHate",1718,"bliki",Arrays.asList("nosql","orm")));
        articles.add(new Article("ruby",1313,"article",Arrays.asList("ruby")));
        articles.add(new Article("DDD_Aggregate",482,"bliki",Arrays.asList("nosql","ddd")));
    
        
        int wordCount = articles.stream()
        				.map(a->a.getWords())
        				.reduce(0,(a1,a2)->a1+a2);
        
        System.out.println(wordCount);
        
        articles.stream()
        		.map(a->a.getTags())
        		.forEach(System.out::println);
        				
        articles.stream()
		.flatMap(a->a.getTags().stream()).distinct()
		.forEach(System.out::println);
				
	}

}
