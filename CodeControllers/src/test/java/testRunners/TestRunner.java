package testRunners;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "C:\\Users\\Asus-2024\\eclipse-workspace\\CodeControllers\\src\\test\\resources\\feature\\register.feature", // Path to the feature file
        glue = "Register", // Package containing the step definition classes
        plugin = {"pretty", "html:target/cucumber-reports"} // Optional: to generate reports
)

public class TestRunner {

}
