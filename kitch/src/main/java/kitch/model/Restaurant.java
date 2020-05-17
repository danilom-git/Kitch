package kitch.model;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Restaurant {
	private String name;
	private String city;
	
	private List<Dish> dishes;
	
	private double silverThresh;
	private double silverDiscount;
	private double goldThresh;
	private double goldDiscount;
}
