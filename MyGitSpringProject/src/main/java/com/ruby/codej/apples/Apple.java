package com.ruby.codej.apples;

import java.util.Arrays;
import java.util.List;

public class Apple {
	private String color;
	private Integer	weight;
	
	public Apple(String color, Integer weight) {
		this.color = color;
		this.weight	= weight;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public Integer getWeight() {
		return weight;
	}
	
	public void setWeight(Integer weight) {
		this.weight = weight;
	}
	
	
	public static void main(String[] args) {
		
		List<Apple> inventory = Arrays.asList(new Apple("Red", 100), new Apple("Green", 150), new Apple("Blue", 200));
		
	} 
	
	public static void preetyPrintApple(List<Apple> inventory, AppleFormatter formatter){
		
		
		return;
	}
	
}
