package Apitesting.Apitesting;

import org.json.simple.JSONObject;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class ap2 {
	int statusCode;

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		ap2 meth = new ap2();
		//meth.getUserDetailsTest();
		meth.postuserdetails();

	}
	
	
	public void getUserDetailsTest() {
		//RestAssured.baseURI = "https://demoqa.com/utilities/weather/city/Hyderabad";
		RestAssured.baseURI = "https://reqres.in/api/users/";
		//https://reqres.in/api/users/
		RequestSpecification httprequest =RestAssured.given();
		//Response response = httprequest.request(Method.GET,"/Hyderabad");
		Response response = httprequest.request(Method.GET,"2");
		String responsebody = response.getBody().asString();
		System.out.println("Response body is :: "+responsebody);
		statusCode = response.getStatusCode();
		System.out.println("Status code is  :: " +statusCode);
 
    }
	
	public void postuserdetails() {
		
		 RestAssured.baseURI = "https://reqres.in/api/users/";

	        RequestSpecification httpRequest = RestAssured.given();

	        JSONObject requestParams = new JSONObject();
	        requestParams.put("name", "Aadya");
	        requestParams.put("job", "student");

	        httpRequest.header("Content-Type", "application/json");

	        httpRequest.body(requestParams.toJSONString());

	        Response response = httpRequest.request(Method.POST);

	        statusCode = response.getStatusCode();
			System.out.println("Status code is  :: " +statusCode);
		
	}
	

}
