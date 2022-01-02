package controller;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

/**
 * This class tests for checking location support rush order 
 * @author Nam Anh - 20183482
 */
public class LocationSupportRushOrderTest {

    private PlaceRushOrderController placeRushOrderController;

    @BeforeEach
    void setUp() throws Exception {
        placeRushOrderController = new PlaceRushOrderController();
    }

    @ParameterizedTest
    @CsvSource({
            "Ha Noi,true",
            "HaNoi,false",
            "Thai Binh,false",
            "New York,false",
            "Nghe An,false",
            "Quang Ninh,false"
    })
    void test(String province, boolean expected) {
    	// when
        boolean isValid = placeRushOrderController.isLocationSupportRushOrder(province);
        
        // then
        Assertions.assertEquals(isValid, expected);
    }
}
