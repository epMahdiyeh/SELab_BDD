package calculator;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class MyStepdefs {
    private Calculator calculator;
    private int a;
    private int b;
    private double result;

    @Before
    public void before() {
        calculator = new Calculator();
    }

    @Given("Two input values, {int} and {int}")
    public void twoInputValues(int value1, int value2) {
        a = value1;
        b = value2;
    }

    @When("I calculate the square root of a divided by b")
    public void calculateSquareRoot() {
        result = calculator.calculateSquareRoot(a, b);
    }

    @Then("I expect the result to be {double}")
    public void expectResult(double expectedResult) {
        Assert.assertEquals(expectedResult, result, 0.001);
    }
}

