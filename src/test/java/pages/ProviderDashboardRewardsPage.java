package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class ProviderDashboardRewardsPage {
    public ProviderDashboardRewardsPage(){
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
    @FindBy(xpath = "//div[@class='table-responsive']")
    public WebElement slider;
    @FindBy(xpath = "//*[@id='order-summary_previous']")
    public WebElement previousButton;
    @FindBy(xpath = "//*[@id='order-summary_next']")
    public  WebElement nextButton;
    @FindBy(xpath = "//thead/tr/th[1]")
    public WebElement serviceTableBaslik;
    @FindBy(xpath = "//input[@class='form-control form-control-sm']")
    public WebElement searchBox;
    @FindBy(xpath = "//h2[text()='Service Reward History']")
    public WebElement header;

    @FindBy(xpath = "//span[@id='select2-r_service_id-container']")
    public WebElement addRewardsFormService;

    @FindBy(xpath = "//div[@id='paymentModal']")
    public WebElement addRewardsForm;

    @FindBy(xpath = "//select[@id='reward_type']")
    public WebElement addRewardsFormRewardType;


    @FindBy(xpath = "//input[@id='reward_discount']")
    public WebElement addRewardsFormDiscount;

    @FindBy(id = "rdescription")
    public WebElement addRewardsFormMessages;
    @FindBy(xpath = "//button[@id='submit_reward']")
    public WebElement addRewardsFormAddButton;
    @FindBy(xpath = "//button[text()='Cancel']")
    public WebElement addRewardsFormCancelButton;

    @FindBy(xpath = "(//button[@aria-label='Close'])[2]")
    public WebElement addRewardsFormDismissButton;
    @FindBy(xpath = "//iframe[@name='__privateStripeMetricsController6420']")
    public WebElement iframe;






}
