package com.ruby.codej;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJacksonHttpMessageConverter;
import org.springframework.web.client.RestTemplate;

public class RestTemplateTest {
	public static void main(String[] args) {
		RestTemplate restTemplate = new RestTemplate();

		String url = "http://searchapi.qa.tmon.co.kr/api/search/ac/tmxkzm";

		List<HttpMessageConverter<?>> messageConverters = new ArrayList<HttpMessageConverter<?>>();
		MappingJacksonHttpMessageConverter map = new MappingJacksonHttpMessageConverter();
		messageConverters.add(map);
		restTemplate.setMessageConverters(messageConverters);

		Object bean = restTemplate.getForObject(url, Object.class);
		System.out.println("The object received from REST call : " + bean);

	}
}
