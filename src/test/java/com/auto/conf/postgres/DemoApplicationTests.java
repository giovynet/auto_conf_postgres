package com.auto.conf.postgres;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.auto.conf.postgres.dao.CitiesDao;

@SpringBootTest
class DemoApplicationTests {
	
	@Autowired
	CitiesDao citiesDao;

	@Test
	void testDataAccess() {
		try {			
			List<String> list = citiesDao.selectCities();
			list.forEach(System.out::println);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	

}
