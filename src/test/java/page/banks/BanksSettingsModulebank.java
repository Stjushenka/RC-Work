package page.banks;


import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.*;
import static page.LoginPage.getPassword;
import static page.LoginPage.getUsername;

public class BanksSettingsModulebank {
    private String username = getUsername();
    private String password = getPassword();
    private SelenideElement name = $x("//*[text()='modulbank+amo radistonlinewidgets.amocrm.ru']");

    @BeforeEach
    public void setUp() {
        open("https://app-rc.int.radist.online/companies/5/settings/integrations");


    }


    @Test
    public void shouldSettingsMBType() {
        name.click();
        $("[class='BankCustomIntegration_content__extraFields__item']").click();
        $x("//*[text()='Подакцизный товар']").click();
        $x("//*[text()='Сохранить изменения']").click();
        $(withText("Изменения были успешно сохранены"));

    }

    @Test
    public void shouldSettingsMBType1() {
        name.click();
        $("[class='BankCustomIntegration_content__extraFields__item']").click();
        $x("//*[text()='Иной']").click();
        $x("//*[text()='Сохранить изменения']").click();
        $(withText("Изменения были успешно сохранены"));
    }

    @Test
    public void shouldSettingsMBType2() {
        name.click();
        $("[class='BankCustomIntegration_content__extraFields__item']").click();
        $x("//*[text()='Товар']").click();
        $x("//*[text()='Сохранить изменения']").click();
        $(withText("Изменения были успешно сохранены"));
    }

    @Test
    public void shouldSettingsMBType4() {
        name.click();
        $("[class='BankCustomIntegration_content__extraFields__item']").click();
        $x("//*[text()='Работа']").click();
        $x("//*[text()='Сохранить изменения']").click();
        $(withText("Изменения были успешно сохранены"));
    }

    @Test
    public void shouldSettingsMBType5() {
        name.click();
        $("[class='BankCustomIntegration_content__extraFields__item']").click();
        $x("//*[text()='Услуга']").click();
        $x("//*[text()='Сохранить изменения']").click();
        $(withText("Изменения были успешно сохранены"));
    }

    @Test
    public void shouldSettingsMBType6() {
        name.click();
        $("[class='BankCustomIntegration_content__extraFields__item']").click();
        $x("//*[text()='Ставка азартной игры']").click();
        $x("//*[text()='Сохранить изменения']").click();
        $(withText("Изменения были успешно сохранены"));
    }

    @Test
    public void shouldSettingsMBType7() {
        name.click();
        $("[class='BankCustomIntegration_content__extraFields__item']").click();
        $x("//*[text()='Выигрыш азартной игры']").click();
        $x("//*[text()='Сохранить изменения']").click();
        $(withText("Изменения были успешно сохранены"));
    }

    @Test
    public void shouldSettingsMBType8() {
        name.click();
        $("[class='BankCustomIntegration_content__extraFields__item']").click();
        $x("//*[text()='Лотерейный билет']").click();
        $x("//*[text()='Сохранить изменения']").click();
        $(withText("Изменения были успешно сохранены"));
    }

    @Test
    public void shouldSettingsMBType9() {
        name.click();
        $("[class='BankCustomIntegration_content__extraFields__item']").click();
        $x("//*[text()='Выигрыш лотереи']").click();
        $x("//*[text()='Сохранить изменения']").click();
        $(withText("Изменения были успешно сохранены"));
    }

    @Test
    public void shouldSettingsMBType10() {
        name.click();
        $("[class='BankCustomIntegration_content__extraFields__item']").click();
        $x("//*[text()='Предоставление РИД']").click();
        $x("//*[text()='Сохранить изменения']").click();
        $(withText("Изменения были успешно сохранены"));
    }

    @Test
    public void shouldSettingsMBType11() {
        name.click();
        $("[class='BankCustomIntegration_content__extraFields__item']").click();
        $x("//*[text()='Платеж']").click();
        $x("//*[text()='Сохранить изменения']").click();
        $(withText("Изменения были успешно сохранены"));
    }

    @Test
    public void shouldSettingsMBType12() {
        name.click();
        $("[class='BankCustomIntegration_content__extraFields__item']").click();
        $x("//*[text()='Агентское вознаграждение']").click();
        $x("//*[text()='Сохранить изменения']").click();
        $(withText("Изменения были успешно сохранены"));
    }

    @Test
    public void shouldSettingsMBType13() {
        name.click();
        $("[class='BankCustomIntegration_content__extraFields__item']").click();
        $x("//*[text()='Составной предмет расчета']").click();
        $x("//*[text()='Сохранить изменения']").click();
        $(withText("Изменения были успешно сохранены"));
    }

    @Test
    public void shouldSettingsMBTax() {
        name.click();
        $("[class='BankCustomIntegration__content__extraFields__item']").click();
        $x("//*[text()='Без НДС']").click();
        $x("//*[text()='Сохранить изменения']").click();
        $(withText("Изменения были успешно сохранены"));
    }


    @Test
    public void shouldSettingsMBTax0() {
        name.click();
        $("[class='BankCustomIntegration__content__extraFields__item']").click();
        $x("//*[text()='0%']").click();
        $x("//*[text()='Сохранить изменения']").click();
        $(withText("Изменения были успешно сохранены"));
    }

    @Test
    public void shouldSettingsMBTax10() {
        name.click();
        $("[class='BankCustomIntegration__content__extraFields__item']").click();
        $x("//*[text()='10%']").click();
        $x("//*[text()='Сохранить изменения']").click();
        $(withText("Изменения были успешно сохранены"));
    }

    @Test
    public void shouldSettingsMBTax20() {
        name.click();
        $("[class='BankCustomIntegration__content__extraFields__item']").click();
        $x("//*[text()='20%']").click();
        $x("//*[text()='Сохранить изменения']").click();
        $(withText("Изменения были успешно сохранены"));
    }

    @Test
    public void shouldSettingsMBTax110() {
        name.click();
        $("[class='BankCustomIntegration__content__extraFields__item']").click();
        $x("//*[text()='10/110']").click();
        $x("//*[text()='Сохранить изменения']").click();
        $(withText("Изменения были успешно сохранены"));
    }

    @Test
    public void shouldSettingsMBTax120() {
        name.click();
        $("[class='BankCustomIntegration__content__extraFields__item']").click();
        $x("//*[text()='20/120']").click();
        $x("//*[text()='Сохранить изменения']").click();
        $(withText("Изменения были успешно сохранены"));
    }


    @Test
    public void shouldSettingsMBPay() {
        name.click();
        $$("[class='BankCustomIntegration__content__extraFields__item']").last().click();
        $("[data-value='full_prepayment']").click();
        $x("//*[text()='Сохранить изменения']").click();
        $(withText("Изменения были успешно сохранены"));
    }


    @Test
    public void shouldSettingsMBPay1() {
        name.click();
        $$("[class='BankCustomIntegration__content__extraFields__item']").last().click();
        $x("//*[text()='Предоплата']").click();
        $x("//*[text()='Сохранить изменения']").click();
        $(withText("Изменения были успешно сохранены"));
    }

    @Test
    public void shouldSettingsMBPay2() {
        name.click();
        $$("[class='BankCustomIntegration__content__extraFields__item']").last().click();
        $x("//*[text()='Аванс']").click();
        $x("//*[text()='Сохранить изменения']").click();
        $(withText("Изменения были успешно сохранены"));
    }

    @Test
    public void shouldSettingsMBPay3() {
        name.click();
        $$("[class='BankCustomIntegration__content__extraFields__item']").last().click();
        $x("//*[text()='Полный расчет']").click();
        $x("//*[text()='Сохранить изменения']").click();
        $(withText("Изменения были успешно сохранены"));
    }

    @Test
    public void shouldSettingsMBPay4() {
        name.click();
        $$("[class='BankCustomIntegration__content__extraFields__item']").last().click();
        $x("//*[text()='Частичный расчет и кредит']").click();
        $x("//*[text()='Сохранить изменения']").click();
        $(withText("Изменения были успешно сохранены"));
    }

    @Test
    public void shouldSettingsMBPay5() {

        name.click();
        $$("[class='BankCustomIntegration__content__extraFields__item']").last().click();
        $x("//*[text()='Передача в кредит']").click();
        $x("//*[text()='Сохранить изменения']").click();
        $(withText("Изменения были успешно сохранены"));
    }


    @Test
    public void shouldSettingsMBPay6() {
        name.click();
        $$("[class='BankCustomIntegration__content__extraFields__item']").last().click();
        $("[data-value='credit_payment']").click();
        $x("//*[text()='Сохранить изменения']").click();
        $(withText("Изменения были успешно сохранены"));
    }

    @Test
    public void shouldUpDownMB() {
        name.click();
        $("[aria-label='controlled']").click();
        $x("//*[text()='Сохранить изменения']").click();
        $(withText("Изменения были успешно сохранены"));

    }

    @Test
    public void shouldFieldsMB() {
        $("[name='username']").setValue(username);
        $("[name='password']").setValue(password);
        $("[name='login']").click();
        name.click();
        $("[type='checkbox']").click();
        $x("//*[text()='Сохранить изменения']").click();
        $(withText("Изменения были успешно сохранены"));

    }

    @Test
    public void shouldTerminalMB() {
        name.click();
        $("[class='BankSettingsTerminal__item__useByDefault']").click();
        $x("//*[text()='Сохранить изменения']").click();
        $(withText("Изменения были успешно сохранены"));

    }
}


