package basepackage;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class BaseClass {
	
	@Before
	public void scenarioPreCondition(Scenario scenario) {
		System.out.println("Pre Condition");
		System.out.println(scenario.getName());
		System.out.println(scenario.getStatus());
		System.out.println(scenario.getLine());
		System.out.println(scenario.isFailed());
	}
	
	@After
	public void scenarioPostCondition() {
		System.out.println("Post Condition");
	}
	
	
}
