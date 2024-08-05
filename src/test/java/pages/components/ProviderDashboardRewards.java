package pages.components;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class ProviderDashboardRewards {
    public ProviderDashboardRewards(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy (xpath = "//a[text()='Dashboard']")
    public WebElement providerDashboard;
    @FindBy(xpath = "//span[text()='Rewards']")
    public WebElement providerDashboardRewards;
    @FindBy(xpath = "//tr")
    public WebElement rewardsMusteriTable;
    @FindBy(xpath = "//a[text()='Add Rewards']")
    public List<WebElement> addRewardsButtonList;
    @FindBy(xpath = "//*[text()=' View Rewards History']")
    public WebElement rewardsHistoryViewLink;

    @FindBy(xpath = "//span[%23'select2-r_service_id-container']")
    public WebElement addRewardsFormService;

    @FindBy(xpath = "//select[@id='reward_type']")
    public WebElement addRewardsFormRewardType;

    @FindBy(xpath = "//input[@id='reward_discount']")
    public WebElement addRewardsFormDiscount;
    @FindBy(xpath = "//textarea[@id='rdescription']")
    public WebElement addRewardsFormMessages;
    @FindBy(xpath = "//button[@id='submit_reward']")
    public WebElement addRewardsFormAddButton;
    @FindBy(xpath = "//button[text()='Cancel']")
    public WebElement addRewardsFormCancelButton;

    @FindBy(xpath = "(//button[@aria-label='Close'])[2]")
    public WebElement addRewardsFormDismissButton;






}
