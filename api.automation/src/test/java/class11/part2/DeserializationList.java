package class11.part2;

import io.restassured.RestAssured;

public class DeserializationList {

	public static void main(String[] args) {
		 Root rootList = RestAssured.given().
					when().
						get("https://reqres.in/api/users?page=2").
					then().
					statusCode(200).extract().as(Root.class);
					
			String eMail = rootList.getData().get(0).getEmail();		
			System.out.println(eMail);
	}
}