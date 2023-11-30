package calculator;
import cucumber.api.CucumberOptions;
import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;

@CucumberOptions(features = "src/test/resources/features")
@RunWith(Cucumber.class)
public class RunnerTest {
}
