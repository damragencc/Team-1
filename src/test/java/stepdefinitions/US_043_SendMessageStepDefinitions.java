package stepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.PageChat;
import pages.components.HeaderComp;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.UserReader;

import java.util.List;

public class US_043_SendMessageStepDefinitions {

	HeaderComp headerComp;

	PageChat pageChat;

	@Then("Sign in with email {string} and password {string}")
	public void sign_in_with_email_and_password(String mail, String password) {
		headerComp = new HeaderComp();

		headerComp.performLogIn(UserReader.getUser(mail),
								UserReader.getUser(password));
	}

	@Then("Click on the profile icon in the upper right corner")
	public void click_on_the_profile_icon_in_the_upper_right_corner() {
		pageChat = new PageChat();

		pageChat.iconUser.click();
	}

	@Then("Should see the chat link visible and active")
	public void should_see_the_chat_link_visible_and_active() {
		boolean displayed = pageChat.linkChats.isDisplayed();

		Assert.assertTrue(displayed);
	}

	@And("Click on the chat icon")
	public void clickOnTheChatIcon() {
		pageChat = new PageChat();

		pageChat.linkChats.click();
	}

	@Then("Should be redirected to the chat page")
	public void should_be_redirected_to_the_chat_page(DataTable dataTable) {
		List<List<String>> data = dataTable.asLists(String.class);

		String expectedUrl = data.get(0).get(0);
		String actualUrl = Driver.getDriver().getCurrentUrl();

		Assert.assertEquals(expectedUrl, actualUrl);
	}

	@Then("Should see the chat text box visible and active")
	public void shouldSeeTheChatTextBoxVisibleAndActive() {
		pageChat = new PageChat();

		boolean displayed = pageChat.fieldMessage.isDisplayed();
		boolean enabled = pageChat.fieldMessage.isEnabled();

		Assert.assertTrue(displayed);
		Assert.assertTrue(enabled);
	}


	@Then("Should see the submit button visible and active")
	public void shouldSeeTheSubmitButtonVisibleAndActive() {
		pageChat = new PageChat();

		boolean displayed = pageChat.buttonSubmit.isDisplayed();
		boolean enabled = pageChat.buttonSubmit.isEnabled();

		Assert.assertTrue(displayed);
		Assert.assertTrue(enabled);
	}


	@Then("Should see the search box visible and active")
	public void shouldSeeTheSearchBoxVisibleAndActive() {
		pageChat = new PageChat();

		boolean displayed = pageChat.searchBox.isDisplayed();
		boolean enabled = pageChat.searchBox.isEnabled();

		Assert.assertTrue(displayed);
		Assert.assertTrue(enabled);
	}

}
