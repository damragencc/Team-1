package stepdefinitions;

import io.cucumber.java.en.*;
import net.bytebuddy.asm.Advice;
import org.w3c.dom.html.HTMLInputElement;
import pages.components.HeaderComp;
import utilities.ConfigReader;
import utilities.Driver;

public class US012_UserCompanyFollow {
    HeaderComp headerComp = new HeaderComp();


    @Given("User goes to {string}")
    public void kullanici_gider(String istenenUrlAdi) {
        Driver.getDriver().get(ConfigReader.getProperty(istenenUrlAdi));
    }

    @Then("User clicks on the {string} tab in the header section")
    public void user_clicks_on_the_tab_in_the_header_section(String headerCategories) {
        HeaderComp.headerCategories.click();
    }

    @Then("User that the {string} element is visible")
    public void user_that_the_element_is_visible(String events) {
        HeaderComp.headerEvents.isDisplayed();
    }

    @Then("User click on the {string} element")
    public void user_click_on_the_element(String events) {
        HeaderComp.headerEvents.click();
    }

    @Then("User verifies that the {string} and {string} elements are visible")
    public void user_verifies_that_the_and_elements_are_visible(String shops, String service) {
        HeaderComp.eventsShops.isDisplayed();
        HeaderComp.eventsService.isDisplayed();
    }

    @Then("User click on the {string} button, it is tested that the {string} text is visible")
    public void user_click_on_the_button_it_is_tested_that_the_text_is_visible(String shop, String ShopsFound) {
        HeaderComp.eventsShops.click();
        HeaderComp.shopsFoundText.isDisplayed();
    }

    @Then("User confirmed that the first company that appears when clicking on the {string} element has a {string} icon")
    public void user_confirmed_that_the_first_company_that_appears_when_clicking_on_the_element_has_a_icon(String shops, String visitStore) {
        HeaderComp.visitStoreText.isDisplayed();
        HeaderComp.visitStoreText.click();
    }

    @Then("User click on the {string} icon, the company information page should open")
    public void user_click_on_the_icon_the_company_information_page_should_open(String visitStore) {
        HeaderComp.shopDetails.isDisplayed();
    }

    @Then("User {string}, {string} and {string} elements should be visible on the page that opens")
    public void user_and_elements_should_be_visible_on_the_page_that_opens(String shopDetails, String shopAvailability, String services) {
        HeaderComp.shopDetailsServices.isDisplayed();
        HeaderComp.shopAvailability.isDisplayed();
        HeaderComp.shopDetails.isDisplayed();
    }

    @Then("User click on the {string} button, the services should be visible")
    public void user_click_on_the_button_the_services_should_be_visible(String string) {
        HeaderComp.shopDetailsServices.click();
        HeaderComp.services.isDisplayed();
    }

    @Then("User address and fee information should be displayed when any of the service cards is clicked")
    public void user_address_and_fee_information_should_be_displayed_when_any_of_the_service_cards_is_clicked() {
        HeaderComp.servicesAddress.isDisplayed();
        HeaderComp.labelAmount.isDisplayed();
        Driver.quitDriver();
    }

    @Then("User filter icon on the page containing the {string} and {string} elements must be visible")
    public void user_filter_icon_on_the_page_containing_the_and_elements_must_be_visible(String shops, String service) {
        HeaderComp.filterIcon.isDisplayed();
        HeaderComp.filterIcon.click();
    }
    @Then("User {string}, {string}, {string}, {string} and {string} elements should be visible on the form screen that opens when you click on the filter icon")
    public void user_and_elements_should_be_visible_on_the_form_screen_that_opens_when_you_click_on_the_filter_icon(String location, String sortBy, String keyword, String categories, String subCategory) {
        HeaderComp.location.isDisplayed();
        HeaderComp.sortBy.isDisplayed();
        HeaderComp.keyword.isDisplayed();
        HeaderComp.categories.isDisplayed();
        HeaderComp.subCategory.isDisplayed();
    }
    @Then("User there should be a {string} button on the filter screen")
    public void user_there_should_be_a_button_on_the_filter_screen(String string) {
        HeaderComp.filterSearch.isDisplayed();
    }
    @Then("User searches can be made by sending values to the filtering screen that opens")
    public void user_searches_can_be_made_by_sending_values_to_the_filtering_screen_that_opens() {

        HeaderComp.searchLocation.click();
        HeaderComp.searchLocation.sendKeys("Turkey");

    }
}
