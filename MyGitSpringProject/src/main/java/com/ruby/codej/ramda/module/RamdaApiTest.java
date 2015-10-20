package com.ruby.codej.ramda.module;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class RamdaApiTest {
	public static void main(String[] args) {
		
		//testStreamApi();
		testStreamApi2();
	}
	
	
	public static void testRamdaApi(){
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6);
		
		//Java 7
		for(int number : numbers){
			System.out.print(number);
		}
		
		System.out.println("\n-------------------------------------");
		
		//Java8
		numbers.forEach((Integer value) -> 
			System.out.print(value)
		);
		System.out.println("\n-------------------------------------");

		System.out.print("짝수값은 : ");
		//Java8
		numbers.forEach((Integer value) -> {
			//짝수
			if(value % 2 == 0){
				System.out.print(value);
			}
		});
	}
	
	public static void testStreamApi(){
		
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6);
		long count = numbers.stream().filter(num-> num%2 ==0).count();
		System.out.println(count);
		
	}
	
	public static void testStreamApi2(){
		Stream<Integer> numbers = Stream.of(1,2,3,4,5);
		numbers.map(num->num*2).forEach(num->System.out.println(num));
	}
	
	
}
