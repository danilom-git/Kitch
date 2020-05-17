package kitch.model;

import java.time.LocalDateTime;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Dish {
	private String name;
	private String description;
	
	private DishType dishType;
	private List<Ingredient> ingredients;
	private List<Tag> tags;
	
	private double price;
	private Integer quantityThresh;
	private double quantityDiscount;
	private LocalDateTime promoStart;
	private LocalDateTime promoEnd;
	private Double promoDiscount;  
}
