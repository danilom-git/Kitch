package kitch.model;

import java.time.LocalDateTime;
import java.util.Map;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Order {
	private Customer customer;
	private Restaurant restaurant;
	private LocalDateTime time;
	
	private Map<Dish, Integer> dishes;
	private Map<Dish, Integer> ratings;
	
	private Double cost;
	private Double effectiveCost;
}
