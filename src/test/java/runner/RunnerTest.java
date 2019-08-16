package runner;

import cucumber.api.testng.TestNGCucumberRunner;
import org.testng.annotations.*;

public class RunnerTest {
	@DataProvider(name = "test1",parallel=true)
	public Object[] [] createData1() {
		return new Object[][] {
			{new runnerClass().getClass()}
		};
	}
	
	@Test(dataProvider = "test1")
	public void runTest(Class<?> NameOfClass) {
		new TestNGCucumberRunner(NameOfClass).runCukes();
	}

}
