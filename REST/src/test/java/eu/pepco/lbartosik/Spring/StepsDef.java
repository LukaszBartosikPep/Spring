package eu.pepco.lbartosik.Spring;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class StepsDef {
    Calc calc;
    Integer result;
    @Given("I test Calc")
    public void i_test_calc() {
        // Write code here that turns the phrase above into concrete actions
       calc= new Calc();
    }
    @When("I add {int} and {int}")
    public void i_add_and(Integer int1, Integer int2) {
        // Write code here that turns the phrase above into concrete actions
       result= int1+int2;
    }
    @Then("Result is {int}")
    public void result_is(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertEquals(int1, result);
    }

}
