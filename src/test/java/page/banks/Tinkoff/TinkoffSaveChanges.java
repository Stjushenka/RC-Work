package page.banks.Tinkoff;


import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.Duration;

import static com.codeborne.selenide.Condition.appear;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.*;
import static page.LoginPage.getPassword;
import static page.LoginPage.getUsername;

public class TinkoffSaveChanges {
    final String username = getUsername();
    final String password = getPassword();
    final SelenideElement name = $x("//*[text()='tinkoff+amo radistonlinewidgets.amocrm.ru']");
    final SelenideElement save = $(withText("Изменения были успешно сохранены"));

    @BeforeEach
    public void setUp() {
        open("https://app-rc.int.radist.online/companies/5/settings/integrations");


    }


    @Test
    public void shouldSettingsTinkoffType() {
        name.click();
        $("[class='BankCustomIntegration_content__extraFields__item']").click();
        $x("//*[text()='Подакцизный товар']").click();
        $x("//*[text()='Сохранить изменения']").click();
        save.shouldBe(appear, Duration.ofSeconds(2));

    }

    @Test
    public void shouldSettingsTinkoffType1() {
        name.click();
        $("[class='BankCustomIntegration_content__extraFields__item']").click();
        $x("//*[text()='Иной']").click();
        $x("//*[text()='Сохранить изменения']").click();
        save.shouldBe(appear, Duration.ofSeconds(2));
    }

    @Test
    public void shouldSettingsTinkoffType2() {
        name.click();
        $("[class='BankCustomIntegration_content__extraFields__item']").click();
        $x("//*[text()='Товар']").click();
        $x("//*[text()='Сохранить изменения']").click();
        save.shouldBe(appear, Duration.ofSeconds(2));
    }

    @Test
    public void shouldSettingsTinkoffType4() {
        name.click();
        $("[class='BankCustomIntegration_content__extraFields__item']").click();
        $x("//*[text()='Работа']").click();
        $x("//*[text()='Сохранить изменения']").click();
        save.shouldBe(appear, Duration.ofSeconds(2));
    }

    @Test
    public void shouldSettingsTinkoffType5() {
        name.click();
        $("[class='BankCustomIntegration_content__extraFields__item']").click();
        $x("//*[text()='Услуга']").click();
        $x("//*[text()='Сохранить изменения']").click();
        save.shouldBe(appear, Duration.ofSeconds(2));
    }

    @Test
    public void shouldSettingsTinkoffType6() {
        name.click();
        $("[class='BankCustomIntegration_content__extraFields__item']").click();
        $x("//*[text()='Ставка азартной игры']").click();
        $x("//*[text()='Сохранить изменения']").click();
        save.shouldBe(appear, Duration.ofSeconds(2));
    }

    @Test
    public void shouldSettingsTinkoffType7() {
        name.click();
        $("[class='BankCustomIntegration_content__extraFields__item']").click();
        $x("//*[text()='Выигрыш азартной игры']").click();
        $x("//*[text()='Сохранить изменения']").click();
        save.shouldBe(appear, Duration.ofSeconds(2));
    }

    @Test
    public void shouldSettingsTinkoffType8() {
        name.click();
        $("[class='BankCustomIntegration_content__extraFields__item']").click();
        $x("//*[text()='Лотерейный билет']").click();
        $x("//*[text()='Сохранить изменения']").click();
        save.shouldBe(appear, Duration.ofSeconds(2));
    }

    @Test
    public void shouldSettingsTinkoffType9() {
        name.click();
        $("[class='BankCustomIntegration_content__extraFields__item']").click();
        $x("//*[text()='Выигрыш лотереи']").click();
        $x("//*[text()='Сохранить изменения']").click();
        save.shouldBe(appear, Duration.ofSeconds(2));
    }

    @Test
    public void shouldSettingsTinkoffType10() {
        name.click();
        $("[class='BankCustomIntegration_content__extraFields__item']").click();
        $x("//*[text()='Предоставление РИД']").click();
        $x("//*[text()='Сохранить изменения']").click();
        save.shouldBe(appear, Duration.ofSeconds(2));
    }

    @Test
    public void shouldSettingsTinkoffType11() {
        name.click();
        $("[class='BankCustomIntegration_content__extraFields__item']").click();
        $x("//*[text()='Платеж']").click();
        $x("//*[text()='Сохранить изменения']").click();
        save.shouldBe(appear, Duration.ofSeconds(2));
    }

    @Test
    public void shouldSettingsTinkoffType12() {
        name.click();
        $("[class='BankCustomIntegration_content__extraFields__item']").click();
        $x("//*[text()='Агентское вознаграждение']").click();
        $x("//*[text()='Сохранить изменения']").click();
        save.shouldBe(appear, Duration.ofSeconds(2));
    }

    @Test
    public void shouldSettingsTinkoffType13() {
        name.click();
        $("[class='BankCustomIntegration_content__extraFields__item']").click();
        $x("//*[text()='Составной предмет расчета']").click();
        $x("//*[text()='Сохранить изменения']").click();
        save.shouldBe(appear, Duration.ofSeconds(2));
    }

    @Test
    public void shouldSettingsTinkoffTax() {
        name.click();
        $("[class='BankCustomIntegration__content__extraFields__item']").click();
        $x("//*[text()='Без НДС']").click();
        $x("//*[text()='Сохранить изменения']").click();
        save.shouldBe(appear, Duration.ofSeconds(2));
    }


    @Test
    public void shouldSettingsTinkoffTax0() {
        name.click();
        $("[class='BankCustomIntegration__content__extraFields__item']").click();
        $x("//*[text()='0%']").click();
        $x("//*[text()='Сохранить изменения']").click();
        save.shouldBe(appear, Duration.ofSeconds(2));
    }

    @Test
    public void shouldSettingsTinkoffTax10() {
        name.click();
        $("[class='BankCustomIntegration__content__extraFields__item']").click();
        $x("//*[text()='10%']").click();
        $x("//*[text()='Сохранить изменения']").click();
        save.shouldBe(appear, Duration.ofSeconds(2));
    }

    @Test
    public void shouldSettingsTinkoffTax20() {
        name.click();
        $("[class='BankCustomIntegration__content__extraFields__item']").click();
        $x("//*[text()='20%']").click();
        $x("//*[text()='Сохранить изменения']").click();
        save.shouldBe(appear, Duration.ofSeconds(2));
    }

    @Test
    public void shouldSettingsTinkoffTax110() {
        name.click();
        $("[class='BankCustomIntegration__content__extraFields__item']").click();
        $x("//*[text()='10/110']").click();
        $x("//*[text()='Сохранить изменения']").click();
        save.shouldBe(appear, Duration.ofSeconds(2));
    }

    @Test
    public void shouldSettingsTinkoffTax120() {
        name.click();
        $("[class='BankCustomIntegration__content__extraFields__item']").click();
        $x("//*[text()='20/120']").click();
        $x("//*[text()='Сохранить изменения']").click();
        save.shouldBe(appear, Duration.ofSeconds(2));
    }


    @Test
    public void shouldSettingsTinkoffPay() {
        $("[name='username']").setValue(username);
        $("[name='password']").setValue(password);
        $("[name='login']").click();
        name.click();
        $$("[class='BankCustomIntegration__content__extraFields__item']").last().click();
        $("[data-value='full_prepayment']").click();
        $x("//*[text()='Сохранить изменения']").click();
        save.shouldBe(appear, Duration.ofSeconds(2));
    }


    @Test
    public void shouldSettingsTinkoffPay1() {
        name.click();
        $$("[class='BankCustomIntegration__content__extraFields__item']").last().click();
        $x("//*[text()='Предоплата']").click();
        $x("//*[text()='Сохранить изменения']").click();
        save.shouldBe(appear, Duration.ofSeconds(2));
    }

    @Test
    public void shouldSettingsTinkoffPay2() {
        name.click();
        $$("[class='BankCustomIntegration__content__extraFields__item']").last().click();
        $x("//*[text()='Аванс']").click();
        $x("//*[text()='Сохранить изменения']").click();
        save.shouldBe(appear, Duration.ofSeconds(2));
    }

    @Test
    public void shouldSettingsTinkoffPay3() {
        name.click();
        $$("[class='BankCustomIntegration__content__extraFields__item']").last().click();
        $x("//*[text()='Полный расчет']").click();
        $x("//*[text()='Сохранить изменения']").click();
        save.shouldBe(appear, Duration.ofSeconds(2));
    }

    @Test
    public void shouldSettingsTinkoffPay4() {
        name.click();
        $$("[class='BankCustomIntegration__content__extraFields__item']").last().click();
        $x("//*[text()='Частичный расчет и кредит']").click();
        $x("//*[text()='Сохранить изменения']").click();
        save.shouldBe(appear, Duration.ofSeconds(2));
    }

    @Test
    public void shouldSettingsTinkoffPay5() {

        name.click();
        $$("[class='BankCustomIntegration__content__extraFields__item']").last().click();
        $x("//*[text()='Передача в кредит']").click();
        $x("//*[text()='Сохранить изменения']").click();
        save.shouldBe(appear, Duration.ofSeconds(2));
    }


    @Test
    public void shouldSettingsTinkoffPay6() {
        name.click();
        $$("[class='BankCustomIntegration__content__extraFields__item']").last().click();
        $("[data-value='credit_payment']").click();
        $x("//*[text()='Сохранить изменения']").click();
        save.shouldBe(appear, Duration.ofSeconds(2));
    }

    @Test
    public void shouldUpDownTinkoff() {
        name.click();
        $("[aria-label='controlled']").click();
        $x("//*[text()='Сохранить изменения']").click();
        save.shouldBe(appear, Duration.ofSeconds(2));

    }

    @Test
    public void shouldFieldsTinkoff() {
        name.click();
        $("[type='checkbox']").click();
        $x("//*[text()='Сохранить изменения']").click();
        save.shouldBe(appear, Duration.ofSeconds(2));

    }

    @Test
    public void shouldTerminalTinkoff() {
        name.click();
        $("[class='BankSettingsTerminal__item__useByDefault']").click();
        $x("//*[text()='Сохранить изменения']").click();
        save.shouldBe(appear, Duration.ofSeconds(2));

    }
}


