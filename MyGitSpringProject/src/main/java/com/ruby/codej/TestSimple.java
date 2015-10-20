package com.ruby.codej;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class TestSimple {

	public static void main(String[] args) {
		
		Long groupDeliveryTotal = null;
		Map<String, Long> deliveryCondTotal = new HashMap<>();
		deliveryCondTotal.put("3", 333L);
		
		Long freeDeliveryCount = Optional.ofNullable(deliveryCondTotal.get("0")).map(Long::longValue).orElse(0L).longValue();
		Long groupDeliveryTotalCount = Optional.ofNullable(groupDeliveryTotal).map(Long::longValue).orElse(0L).longValue();
		
		
		if(groupDeliveryTotalCount > 0){
			System.out.println("존재함: "+groupDeliveryTotal);
		}else{
			System.out.println("존재하지 않음");
		}
		
		
	} 
	
}
