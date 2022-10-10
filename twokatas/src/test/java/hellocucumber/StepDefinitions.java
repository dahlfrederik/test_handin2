package hellocucumber;

import io.cucumber.java.en.*;


import static org.junit.jupiter.api.Assertions.assertEquals;


public class StepDefinitions {
    private String input;
    private String actualAnswer;

    @Given("an input string {string}")
    public void an_input_string(String cucumberInput) {
        input = cucumberInput;
    }

    @Given("no input string")
    public void no_input_string() {
        input = "";
    }

    @When("I reverse the string")
    public void i_reverse_the_string() {
        actualAnswer = MyOwnStringBuilder.reverseString(input);
    }

    @When("I capitalize the string")
    public void i_capitalize_the_string() {
        actualAnswer = MyOwnStringBuilder.capitalizeString(input);
    }

    @When("I lowercase the string")
    public void i_lowercase_the_string() {
        actualAnswer = MyOwnStringBuilder.lowerCaseString(input);
    }



    @Then("I should return the string {string}")
    public void i_should_return_the_string_reversed(String expectedAnswer) {
        assertEquals(expectedAnswer, actualAnswer);
    }


}
