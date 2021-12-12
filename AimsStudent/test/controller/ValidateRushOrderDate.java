package controller;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class ValidateRushOrderDate {
	
	private PlaceRushOrderController mPlaceRushOrderController;
	
	@BeforeEach
	void setUp() throws Exception {
		mPlaceRushOrderController = new PlaceRushOrderController();
	}

	@ParameterizedTest
	@CsvSource({
		"02/05/2000,true",
		"31/02/2022,false",
		",false",
	})
	void test(String date,boolean expected) {
		boolean isValided = mPlaceRushOrderController.validateRushOrderDate(date);
		assertEquals(expected,isValided);
	}

}
