package testRunners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\Asus-2024\\eclipse-workspace\\CodeControllers\\src\\test\\resources\\feature\\login.feature",
glue = "stepDefinitions")

public class TestRunnerlogin {

}
