package com.helatycoderapp;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

class DietPlannerTest {
	private DietPlanner dietPlanner;

	@BeforeEach
	void setUp() throws Exception {
dietPlanner = new DietPlanner(20, 30, 50);
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("A unit test was finished.");
	}

	@RepeatedTest(value = 10, name = RepeatedTest.LONG_DISPLAY_NAME)
	@DisplayName("DietPlantest")
	void should_ReturnCorrectDietPlan_When_CorrectCoder() {
		Coder coder = new Coder(1.82, 75.0, 26, Gender.MALE);
		DietPlan expected = new DietPlan(2202, 110, 73, 275);

		// when
		DietPlan actual = dietPlanner.calculateDiet(coder);

		// then
		assertAll(() -> assertEquals(expected.getCalories(), actual.getCalories()),
				() -> assertEquals(expected.getProtein(), actual.getProtein()),
				() -> assertEquals(expected.getFat(), actual.getFat()),
				() -> assertEquals(expected.getCarbohydrate(), actual.getCarbohydrate())
		);
	}
	@Test
	void should_ReturnCorrectDietPlan_When_FEMALEGENDER() {
		Coder coder = new Coder(1.82, 75.0, 26, Gender.FEMALE);
		DietPlan expected = new DietPlan(1918, 96, 64, 240);

		// when
		DietPlan actual = dietPlanner.calculateDiet(coder);

		// then
		assertAll(() -> assertEquals(expected.getCalories(), actual.getCalories()),
				() -> assertEquals(expected.getProtein(), actual.getProtein()),
				() -> assertEquals(expected.getFat(), actual.getFat()),
				() -> assertEquals(expected.getCarbohydrate(), actual.getCarbohydrate())
		);
		
		

	}
	@Test
	
	void should_ReturnCorrectDietPlan_Exception() throws Exception {
		
		
		assertThrows(RuntimeException.class,()->new DietPlanner(30, 30, 100));
		
	}
	
	
}
