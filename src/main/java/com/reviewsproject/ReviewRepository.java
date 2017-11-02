package com.reviewsproject;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

@Component
public class ReviewRepository {
	
	protected Map<Long, Review> reviews = new HashMap<Long, Review> ();
	
	public ReviewRepository() {
			
		Review review1 = new Review(00000,"	Star Trek: The Motion Picture (1979)","/images/StarTrek1large.jpg", "Series: TOS", "Lorem ipsum dolor sit amet, consectetur adipiscing elit."
				+ "Nullam vehicula augue ac pulvinar blandit. In nec dictum ligula, ut bibendum eros. In egestas pulvinar velit eu accumsan."
				+ "Cras ut diam vitae mauris auctor pharetra."
			+"Aenean id tortor ut mauris blandit ultrices. Aenean malesuada placerat libero nec imperdiet.");
	Review review2 = new Review(11111, "Star Trek II: The Wrath of Khan (1982)", "/images/StarTrek2Large.jpg", "Series: TOS", "Lorem ipsum dolor sit amet, consectetur adipiscing elit."
				+ "Nullam vehicula augue ac pulvinar blandit. In nec dictum ligula, ut bibendum eros. In egestas pulvinar velit eu accumsan."
				+ "Cras ut diam vitae mauris auctor pharetra."
				+"Aenean id tortor ut mauris blandit ultrices. Aenean malesuada placerat libero nec imperdiet.");
		Review review3 = new Review(22222,"Star Trek IV: The Voyage Home (1986)", "/images/StarTrek3Large.jpg", "Series: TOS", "Lorem ipsum dolor sit amet, consectetur adipiscing elit."
				+ "Nullam vehicula augue ac pulvinar blandit. In nec dictum ligula, ut bibendum eros. In egestas pulvinar velit eu accumsan."
				+ "Cras ut diam vitae mauris auctor pharetra."
				+"Aenean id tortor ut mauris blandit ultrices. Aenean malesuada placerat libero nec imperdiet.");
		Review review4 = new Review(33333, "Star Trek Generations (1994)", "/images/StarTrek4Large.jpg", "TNG", "Lorem ipsum dolor sit amet, consectetur adipiscing elit."
				+ "Nullam vehicula augue ac pulvinar blandit. In nec dictum ligula, ut bibendum eros. In egestas pulvinar velit eu accumsan."
				+ "Cras ut diam vitae mauris auctor pharetra."
				+"Aenean id tortor ut mauris blandit ultrices. Aenean malesuada placerat libero nec imperdiet.");
		Review review5 = new Review(44444, "Star Trek: First Contact (1996)", "/images/StarTrek5Large.jpg", "TNG", "Lorem ipsum dolor sit amet, consectetur adipiscing elit."
				+ "Nullam vehicula augue ac pulvinar blandit. In nec dictum ligula, ut bibendum eros. In egestas pulvinar velit eu accumsan."
				+ "Cras ut diam vitae mauris auctor pharetra."
				+"Aenean id tortor ut mauris blandit ultrices. Aenean malesuada placerat libero nec imperdiet.");
		Review review6 = new Review(55555, "Star Trek: Insurrection (1998)", "/images/StarTrek6Large.jpg", "TNG", "Lorem ipsum dolor sit amet, consectetur adipiscing elit."
				+ "Nullam vehicula augue ac pulvinar blandit. In nec dictum ligula, ut bibendum eros. In egestas pulvinar velit eu accumsan."
				+ "Cras ut diam vitae mauris auctor pharetra."
				+"Aenean id tortor ut mauris blandit ultrices. Aenean malesuada placerat libero nec imperdiet.");
		
		
		reviews.put(review1.getId(), review1);
		reviews.put(review2.getId(), review2);
		reviews.put(review3.getId(), review3);
		reviews.put(review4.getId(), review4);
		reviews.put(review5.getId(), review5);
		reviews.put(review6.getId(), review6);
	}
	
	public Collection<Review> findAll(){
		return reviews.values();
	}
	
	public Review findOne(Long id) {
		return reviews.get(id);
	}

}
