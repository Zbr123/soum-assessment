import io.cucumber.testng.CucumberOptions;
import org.junit.runner.RunWith;
@RunWith(io.cucumber.junit.Cucumber.class)
@CucumberOptions(features = {"src/test/resources/features/app/android/"},
        glue = {"src/test/java/step_defination"},
        monochrome = true,
        tags = "@Login")

public class MobileRunner {
}