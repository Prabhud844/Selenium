package ApiTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class Secondapi {
	
	@DataProvider(name="seasonsAndNumberOfRaces")
	public Object[][]createTestDataRecords() {
		return new Object[][] {
			{"2017",20},
			{"2016",21},
			{"1966",9}
			
			
		};
		
		
	}
	
	@Test(dataProvider ="seasonsAndNumberOfRaces")
	public void test_NumberOfCircuits_ShouldBe_DataDriven(String season, int numberOfRaces) {
		given().pathParam("raceSeason", season).
		when().get("http://ergast.com/api/f1/{raceSeason}/circuits.json").
		then().assertThat().body("MRData.CircuitTable.Circuits.circuitId", hasSize(numberOfRaces));
	}

}
