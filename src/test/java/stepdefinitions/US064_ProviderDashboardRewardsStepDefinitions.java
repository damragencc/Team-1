package stepdefinitions;

import org.junit.Assert;
import pages.components.HeaderComp;
import io.cucumber.java.en.Given;
import pages.components.ProviderDashboardRewards;
import pages.components.RegisterPage;
import utilities.ReusableMethods;

public class US064_ProviderDashboardRewardsStepDefinitions {
    HeaderComp headerComp = new HeaderComp();
    ProviderDashboardRewards providerDashboardRewards = new ProviderDashboardRewards();

    @Given("Dashboard linkinin gorunur oldugunu dogrular")
    public void dashboard_linkinin_gorunur_oldugunu_dogrular() {
        ReusableMethods.bekle(2);
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
        Assert.assertTrue(providerDashboardRewards.addRewardsFormCancelButton.isDisplayed());
        //Assert.assertTrue(providerDashboardRewards.addRewardsFormCancelButton.isEnabled());

        Assert.assertTrue(providerDashboardRewards.addRewardsFormAddButton.isDisplayed());
        //Assert.assertTrue(providerDashboardRewards.addRewardsFormAddButton.isEnabled());

        Assert.assertTrue(providerDashboardRewards.addRewardsFormDismissButton.isDisplayed());

        Assert.assertTrue(providerDashboardRewards.addRewardsFormService.isDisplayed());
        //Assert.assertTrue(providerDashboardRewards.addRewardsFormService.isEnabled());

        Assert.assertTrue(providerDashboardRewards.addRewardsFormRewardType.isDisplayed());
        //Assert.assertTrue(providerDashboardRewards.addRewardsFormRewardType.isEnabled());

        Assert.assertTrue(providerDashboardRewards.addRewardsFormDiscount.isDisplayed());
        //Assert.assertTrue(providerDashboardRewards.addRewardsFormDiscount.isEnabled());

        Assert.assertTrue(providerDashboardRewards.addRewardsFormMessages.isDisplayed());
        //Assert.assertTrue(providerDashboardRewards.addRewardsFormMessages.isEnabled());





    }
}