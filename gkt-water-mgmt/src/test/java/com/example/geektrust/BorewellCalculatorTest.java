package com.example.geektrust;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import com.example.geektrust.RateSummary;

class BorewellCalculatorTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testGetCost() {
		IRateCalculator boreCalculator = new BorewellCalculator();
		Apartment apt=new Apartment(2,0.5,0);
		RateSummary rate = boreCalculator.getCost(apt);
		RateSummary exp = new RateSummary(450.0,675.0);
		assertAll("Checking rate Summaries ",
				() -> assertEquals(rate.getCost(),exp.getCost(),1.0e-6),
				() -> assertEquals(rate.getLitres(),exp.getLitres(),1.0e-6)
				);
				
				
	}

	@Test
	void testBorewellCalculator() {
		IRateCalculator boreCalculator = new BorewellCalculator();
		assertNotEquals(boreCalculator, null);
	}

}
