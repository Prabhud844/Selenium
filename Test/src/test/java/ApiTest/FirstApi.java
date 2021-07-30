package ApiTest;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class FirstApi {
	
	
	@Test
	public void makeSureThatGoogleIsUp() {
		 given().when().get("http://www.google.com").then().statusCode(200);
	}
	
	@Test
	public void test_NumberOfCircuitsFor2017Season_ShouldBe20() {
	        
	    given().
	    when().
	        get("http://ergast.com/api/f1/2017/circuits.json").
	    then().
	        assertThat().
	        body("MRData.CircuitTable.Circuits.circuitId",hasSize(20));
	}

	@Test
	public void test_ResponseHeaderData_ShouldBeCorrect() {
		given().
		when().get("http://ergast.com/api/f1/2017/circuits.json").
		then().assertThat().statusCode(200).and().contentType(ContentType.JSON).
		and().
		header("Content-Length",equalTo("4551"));
		
		
	}
	
	
	@Test
	public void test_NumberOfCircuits_ShouldBe20_Parameterized() {
	        
	    String season = "2017";
	    int numberOfRaces = 20;
	        
	    given().
	        pathParam("raceSeason",season).
	    when().
	        get("http://ergast.com/api/f1/{raceSeason}/circuits.json").
	    then().
	        assertThat().
	        body("MRData.CircuitTable.Circuits.circuitId",hasSize(numberOfRaces));
	}
	
}
