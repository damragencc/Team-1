package stepdefinitions;

import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.components.HeaderComp;
import io.cucumber.java.en.Given;
import pages.ProviderDashboardRewardsPage;
import utilities.Driver;
import utilities.ReusableMethods;

public class US064_ProviderDashboardRewardsStepDefinitions {
    HeaderComp headerComp = new HeaderComp();
    ProviderDashboardRewardsPage providerDashboardRewards = new ProviderDashboardRewardsPage();
    Actions actions=new Actions(Driver.getDriver());


    @Given("Dashboard linkinin gorunur oldugunu dogrular")
    public void dashboard_linkinin_gorunur_oldugunu_dogrular() {
        ReusableMethods.bekle(3);
        Assert.assertTrue(providerDashboardRewards.providerDashboard.isDisplayed());
    }

    @Given("Dashboard linkine tiklar")
    public void dashboard_linkine_tiklar() {
        providerDashboardRewards.providerDashboard.click();
        ReusableMethods.bekle(2);
    }

    @Given("Dashboard sol menüde Rewards linkinin gorunur ve tiklanabilir oldugunu dogrular")
    public void dashboard_sol_menüde_rewards_linkinin_gorunur_ve_tiklanabilir_oldugunu_dogrular() {
        Assert.assertTrue(providerDashboardRewards.providerDashboardRewards.isDisplayed());
        Assert.assertTrue(providerDashboardRewards.providerDashboardRewards.isEnabled());
    }

    @Given("Dashboard sol menüde Rewards linkine tiklar")
    public void dashboard_sol_menüde_rewards_linkine_tiklar() {
        providerDashboardRewards.providerDashboardRewards.click();
        ReusableMethods.bekle(2);
    }

    @Given("Listede siparişini tamamlamis musteri listesini goruntuledigini dogrular")
    public void listede_siparişini_tamamlamis_musteri_listesini_goruntuledigini_dogrular() {
        Assert.assertTrue(providerDashboardRewards.rewardsMusteriTable.isDisplayed());

    }

    @Given("Listede Action basliginin altindaki Add rewards butonunun ve view reward history linkinin goruntulendigini ve tiklanabilir oldugunu dogrular")
    public void listede_action_basliginin_altindaki_add_rewards_butonunun_ve_view_reward_history_linkinin_goruntulendigini_ve_tiklanabilir_oldugunu_dogrular() {

        for (int i = 0; i <providerDashboardRewards.addRewardsButtonList.size() ; i++) {
            Assert.assertTrue(providerDashboardRewards.addRewardsButtonList.get(i).isDisplayed());
        }
    Assert.assertTrue(providerDashboardRewards.rewardsHistoryViewLink.isDisplayed());
    Assert.assertTrue(providerDashboardRewards.rewardsHistoryViewLink.isEnabled());
    }

    @Given("Listede Action basliginin altindaki Add rewards butonuna tiklar")
    public void listede_action_basliginin_altindaki_add_rewards_butonuna_tiklar() {
        providerDashboardRewards.addRewardsButtonList.get(0).click();

    }
    @Given("Acilan formda Service,Reward type,Discount,Message box ve drop down menülerin goruntulendigi dogrulanir")
    public void acilan_formda_service_reward_type_discount_message_box_ve_drop_down_menülerin_goruntulendigi_dogrulanir() {
        ReusableMethods.bekle(3);
        Assert.assertTrue(providerDashboardRewards.addRewardsFormDiscount.isDisplayed());
        providerDashboardRewards.addRewardsFormDiscount.sendKeys("30");
        ReusableMethods.bekle(3);
        Assert.assertTrue(providerDashboardRewards.addRewardsFormMessages.isDisplayed());
        ReusableMethods.bekle(3);
        providerDashboardRewards.addRewardsFormMessages.sendKeys(" ");
        Assert.assertTrue(providerDashboardRewards.addRewardsFormCancelButton.isDisplayed());
        Assert.assertTrue(providerDashboardRewards.addRewardsFormAddButton.isDisplayed());
        Assert.assertTrue(providerDashboardRewards.addRewardsFormDismissButton.isDisplayed());
        Assert.assertTrue(providerDashboardRewards.addRewardsFormService.isDisplayed());
        Assert.assertTrue(providerDashboardRewards.addRewardsFormRewardType.isDisplayed());



    }
    @Given("formu kapatir")
    public void formu_kapatir() {

        providerDashboardRewards.addRewardsFormCancelButton.click();
    }

    @Given("Acilan formda discount boxı ve message boxu gecerli veri ile reward tanimlanir")
    public void acilan_formda_discount_boxı_ve_message_boxu_gecerli_veri_ile_reward_tanimlanir() {
        Select selectRewardType=new Select(providerDashboardRewards.addRewardsFormRewardType);
        selectRewardType.selectByVisibleText("Discount");
        providerDashboardRewards.addRewardsFormDiscount.sendKeys("20");
        providerDashboardRewards.addRewardsFormMessages.sendKeys("Here your present is ,have a good day!");
        ReusableMethods.bekle(4);
        providerDashboardRewards.addRewardsFormCancelButton.click();

    }

    @Given("Acilan formda discount boxı ve message boxu gecersiz veri ile reward tanimlanamadigi dogrulanir")
    public void acilan_formda_discount_boxı_ve_message_boxu_gecersiz_veri_ile_reward_tanimlanamadigi_dogrulanir() {
        Select selectRewardType=new Select(providerDashboardRewards.addRewardsFormRewardType);
        selectRewardType.selectByVisibleText("Discount");
        providerDashboardRewards.addRewardsFormDiscount.sendKeys("500");
        providerDashboardRewards.addRewardsFormMessages.sendKeys("Here your present is ,have a good day!");
        ReusableMethods.bekle(4);
        providerDashboardRewards.addRewardsFormCancelButton.click();
    }
    @Given("View Reward History butonuna tiklanir")
    public void view_reward_history_butonuna_tiklanir() {
       providerDashboardRewards.rewardsHistoryViewLink.click();
    }

    @Given("Next ve previous tuslarının aktif ve tiklanabilir oldugu dogrulanir")
    public void next_ve_previous_tuslarının_aktif_ve_tiklanabilir_oldugu_dogrulanir() {
    Assert.assertTrue(providerDashboardRewards.previousButton.isDisplayed());
    Assert.assertTrue(providerDashboardRewards.nextButton.isDisplayed());

    }

}