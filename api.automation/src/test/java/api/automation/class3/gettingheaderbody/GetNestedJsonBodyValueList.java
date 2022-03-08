package api.automation.class3.gettingheaderbody;

import java.io.File;
import java.util.List;

import io.restassured.path.json.JsonPath;

public class GetNestedJsonBodyValueList {

	public static void main(String[] args) {
		File file = new File("response2.json");
		JsonPath jpath = new JsonPath(file);
		
		List<String> firstNameList = jpath.getList("data.first_name");
			
		for (String str : firstNameList) {
			System.out.println(str);
		}
		System.out.println("--------------------------");
		for (int i = 0; i < firstNameList.size(); i++) {
			System.out.println(firstNameList.get(i));
		}
	}
}