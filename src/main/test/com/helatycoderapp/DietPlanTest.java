package com.helatycoderapp;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DietPlanTest {
private DietPlan dietPlan;
	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void argumentSetup() {
		dietPlan = new DietPlan();
		dietPlan.setCalories(100);
		dietPlan.setCarbohydrate(10);
		dietPlan.setFat(100);
		dietPlan.setProtein(100);
		System.out.println(dietPlan);
	}
	

}
