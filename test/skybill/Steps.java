package skybill;

import com.fasterxml.jackson.databind.JsonNode;

import utils.JsonReader;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import static org.fest.assertions.Assertions.assertThat;

/**
 * @author kinmanli
 *
 * BDD Steps for testing the Web front end for the bill
 */
public class Steps {
	
	private String endPoint;
	private JsonNode jsonResponse;

    @Given("^JSON data is available from an endpoint http://safe-plains-(\\d+)\\.herokuapp\\.com/bill\\.json$")
    public void json_data_is_available_from_an_endpoint_http_safe_plains_herokuapp_com_bill_json(int arg1) throws Throwable {
    	endPoint = "http://safe-plains-5453.herokuapp.com/bill.json";
    	jsonResponse = JsonReader.read(endPoint);
    }

    @When("^I go to the bill page$")
    public void i_go_to_the_bill_page() throws Throwable {
        GlobalHooks.TEST_BROWSER.goTo("http://localhost:" + GlobalHooks.PORT);
    }

    @Then("^I should see my sky bill with title \"(.*?)\"$")
    public void i_should_see_my_sky_bill_with_title(String title) throws Throwable {
        assertThat(GlobalHooks.TEST_BROWSER.title()).isEqualTo(title);
    }

    @Then("^the section heading one be \"(.*?)\"$")
    public void the_section_heading_one_be(String title) throws Throwable {
        assertThat(GlobalHooks.TEST_BROWSER.findFirst("#subscription-link").getText()).isEqualTo(title);
    }

    @Then("^the subscriptions should have a total of \"(.*?)\"$")
    public void the_subscriptions_should_have_a_total_of(String total) throws Throwable {
        assertThat(GlobalHooks.TEST_BROWSER.findFirst("#subscriptions-total").getText()).isEqualTo(total);
    }

    @Then("^the section heading two be \"(.*?)\"$")
    public void the_section_heading_two_be(String title) throws Throwable {
        assertThat(GlobalHooks.TEST_BROWSER.findFirst("#call-charges-link").getText()).isEqualTo(title);
    }

    @Then("^the section heading three be \"(.*?)\"$")
    public void the_section_heading_three_be(String title) throws Throwable {
        assertThat(GlobalHooks.TEST_BROWSER.findFirst("#sky-store-link").getText()).isEqualTo(title);
    }

    @Then("^the complete total is \"(.*?)\"$")
    public void the_complete_total_is(String total) throws Throwable {
        assertThat(GlobalHooks.TEST_BROWSER.findFirst("#complete-total").getText()).isEqualTo(total);
    }    
}
