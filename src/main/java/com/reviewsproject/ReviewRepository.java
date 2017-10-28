package com.reviewsproject;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

@Component
public class ReviewRepository {
	
	protected Map<Long, Review> reviews = new HashMap<Long, Review> ();
	
	public ReviewRepository() {
		
		Review review1 = new Review(00000,"Pangolins","/images/Pangolin.jpg", "Endangered Animal", "This animal is too cute do die."
				+ " I think it's gonna make it.");
		Review review2 = new Review(11111, "PhillipineEagles", "/images/PhillipineEagles.jpg", "Endangered Animal", "This animal is a pretty boy."
				+ "and is destined to die because it never stops looking in the mirror");
		Review review3 = new Review(22222,"Yunnan Snub-Nosed Monkey", "/images/YunnanSnubNosedMonkey.jpg", "Enangered Animal", "This monkey is so ugly it's cute. It'll rebound.");
		Review review4 = new Review(33333, "Saiga", "/images/Saiga.jpg", "Endangered Animal", "Apparently mankind is responsible for it's endangered status."
				+ "Given the future prospects of humans, I'd say this animal is bound to recover.");
		
		reviews.put(review1.getId(), review1);
		reviews.put(review2.getId(), review2);
		reviews.put(review3.getId(), review3);
		reviews.put(review4.getId(), review4);
	}
	
	public Collection<Review> findAll(){
		return reviews.values();
	}
	
	public Review findOne(Long id) {
		return reviews.get(id);
	}

}
