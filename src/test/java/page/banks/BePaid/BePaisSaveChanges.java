package page.banks.BePaid;

import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import page.LoginPage;

import java.time.Duration;

import static com.codeborne.selenide.Condition.appear;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.*;


public class BePaisSaveChanges {

    final SelenideElement name = $x("//*[text()='bepaid+amo radistonlinewidgets.amocrm.ru']");
    final SelenideElement save = $(withText("Изменения были успешно сохранены"));

    @BeforeEach
    public void setUp() {
        open("https://app-rc.int.radist.online/companies/5/settings/integrations");
    }

    @BeforeAll
    public  static void profileLogin() {
        open("https://app-rc.int.radist.online/companies/5/settings/integrations");
        LoginPage log = new LoginPage();
        var login = log.getLogin();
    }

    @Test
    public void shouldSettingsBePaidType() {
        name.click();
        $("[class='BankCustomIntegration_content__extraFields__item']").click();
        $("[data-value='excise']").click();
        $x("//*[text()='Сохранить изменения']").click();
        save.shouldBe(appear, Duration.ofSeconds(2));

    }

    @Test
    public void shouldSettingsBePaidType1() {
        name.click();
        $("[class='BankCustomIntegration_content__extraFields__item']").click();
        $x("//*[text()='Иной']").click();
        $x("//*[text()='Сохранить изменения']").click();
        save.shouldBe(appear, Duration.ofSeconds(2));
    }

    @Test
    public void shouldSettingsBePaidType2() {
        name.click();
        $("[class='BankCustomIntegration_content__extraFields__item']").click();
        $x("//*[text()='Товар']").click();
        $x("//*[text()='Сохранить изменения']").click();
        save.shouldBe(appear, Duration.ofSeconds(2));
    }

    @Test
    public void shouldSettingsBePaidType4() {
        name.click();
        $("[class='BankCustomIntegration_content__extraFields__item']").click();
        $x("//*[text()='Работа']").click();
        $x("//*[text()='Сохранить изменения']").click();
        save.shouldBe(appear, Duration.ofSeconds(2));
    }

    @Test
    public void shouldSettingsBePaidType5() {
        name.click();
        $("[class='BankCustomIntegration_content__extraFields__item']").click();
        $x("//*[text()='Услуга']").click();
        $x("//*[text()='Сохранить изменения']").click();
        save.shouldBe(appear, Duration.ofSeconds(2));
    }

    @Test
    public void shouldSettingsBePaidType6() {
        name.click();
        $("[class='BankCustomIntegration_content__extraFields__item']").click();
        $x("//*[text()='Ставка азартной игры']").click();
        $x("//*[text()='Сохранить изменения']").click();
        save.shouldBe(appear, Duration.ofSeconds(2));
    }

    @Test
    public void shouldSettingsBePaidType7() {
        name.click();
        $("[class='BankCustomIntegration_content__extraFields__item']").click();
        $x("//*[text()='Выигрыш азартной игры']").click();
        $x("//*[text()='Сохранить изменения']").click();
        save.shouldBe(appear, Duration.ofSeconds(2));
    }

    @Test
    public void shouldSettingsBePaidType8() {
        name.click();
        $("[class='BankCustomIntegration_content__extraFields__item']").click();
        $x("//*[text()='Лотерейный билет']").click();
        $x("//*[text()='Сохранить изменения']").click();
        save.shouldBe(appear, Duration.ofSeconds(2));
    }

    @Test
    public void shouldSettingsBePaidType9() {
        name.click();
        $("[class='BankCustomIntegration_content__extraFields__item']").click();
        $x("//*[text()='Выигрыш лотереи']").click();
        $x("//*[text()='Сохранить изменения']").click();
        save.shouldBe(appear, Duration.ofSeconds(2));
    }

    @Test
    public void shouldSettingsBePaidType10() {
        name.click();
        $("[class='BankCustomIntegration_content__extraFields__item']").click();
        $x("//*[text()='Предоставление РИД']").click();
        $x("//*[text()='Сохранить изменения']").click();
        save.shouldBe(appear, Duration.ofSeconds(2));
    }

    @Test
    public void shouldSettingsBePaidType11() {
        name.click();
        $("[class='BankCustomIntegration_content__extraFields__item']").click();
        $x("//*[text()='Платеж']").click();
        $x("//*[text()='Сохранить изменения']").click();
        save.shouldBe(appear, Duration.ofSeconds(2));
    }

    @Test
    public void shouldSettingsBePaidType12() {
        name.click();
        $("[class='BankCustomIntegration_content__extraFields__item']").click();
        $x("//*[text()='Агентское вознаграждение']").click();
        $x("//*[text()='Сохранить изменения']").click();
        save.shouldBe(appear, Duration.ofSeconds(2));
    }

    @Test
    public void shouldSettingsBePaidType13() {
        name.click();
        $("[class='BankCustomIntegration_content__extraFields__item']").click();
        $x("//*[text()='Составной предмет расчета']").click();
        $x("//*[text()='Сохранить изменения']").click();
        save.shouldBe(appear, Duration.ofSeconds(2));
    }

    @Test
    public void shouldSettingsBePaidTax() {
        name.click();
        $("[class='BankCustomIntegration__content__extraFields__item']").click();
        $x("//*[text()='Без НДС']").click();
        $x("//*[text()='Сохранить изменения']").click();
        save.shouldBe(appear, Duration.ofSeconds(2));
    }

    @Test
    public void shouldSettingsBePaidTax25() {
        name.click();
        $("[class='BankCustomIntegration__content__extraFields__item']").click();
        $x("//*[text()='25%']").click();
        $x("//*[text()='Сохранить изменения']").click();
        save.shouldBe(appear, Duration.ofSeconds(2));
    }


    @Test
    public void shouldSettingsBePaidTax0() {
        name.click();
        $("[class='BankCustomIntegration__content__extraFields__item']").click();
        $x("//*[text()='0%']").click();
        $x("//*[text()='Сохранить изменения']").click();
        save.shouldBe(appear, Duration.ofSeconds(2));
    }

    @Test
    public void shouldSettingsBePaidTax10() {
        name.click();
        $("[class='BankCustomIntegration__content__extraFields__item']").click();
        $x("//*[text()='10%']").click();
        $x("//*[text()='Сохранить изменения']").click();
        save.shouldBe(appear, Duration.ofSeconds(2));
    }

    @Test
    public void shouldSettingsBePaidTax20() {
        name.click();
        $("[class='BankCustomIntegration__content__extraFields__item']").click();
        $x("//*[text()='20%']").click();
        $x("//*[text()='Сохранить изменения']").click();
        save.shouldBe(appear, Duration.ofSeconds(2));
    }

    @Test
    public void shouldSettingsBePaidTax110() {
        name.click();
        $("[class='BankCustomIntegration__content__extraFields__item']").click();
        $x("//*[text()='10/110']").click();
        $x("//*[text()='Сохранить изменения']").click();
        save.shouldBe(appear, Duration.ofSeconds(2));
    }

    @Test
    public void shouldSettingsBePaidTax120() {
        name.click();
        $("[class='BankCustomIntegration__content__extraFields__item']").click();
        $x("//*[text()='20/120']").click();
        $x("//*[text()='Сохранить изменения']").click();
        save.shouldBe(appear, Duration.ofSeconds(2));
    }

    @Test
    public void shouldSettingsBePaidPay2() {
        name.click();
        $$("[class='BankCustomIntegration__content__extraFields__item']").last().click();
        $x("//*[text()='Аванс']").click();
        $x("//*[text()='Сохранить изменения']").click();
        save.shouldBe(appear, Duration.ofSeconds(2));
    }

    @Test
    public void shouldSettingsBePaidPay() {
        name.click();
        $$("[class='BankCustomIntegration__content__extraFields__item']").last().click();
        $("[data-value='full_prepayment']").click();
        $x("//*[text()='Сохранить изменения']").click();
        save.shouldBe(appear, Duration.ofSeconds(2));
    }

    @Test
    public void shouldSettingsBePaidPay3() {
        name.click();
        $$("[class='BankCustomIntegration__content__extraFields__item']").last().click();
        $x("//*[text()='Полный расчет']").click();
        $x("//*[text()='Сохранить изменения']").click();
        save.shouldBe(appear, Duration.ofSeconds(2));
    }

    @Test
    public void shouldSettingsBePaidPay1() {
        name.click();
        $$("[class='BankCustomIntegration__content__extraFields__item']").last().click();
        $x("//*[text()='Предоплата']").click();
        $x("//*[text()='Сохранить изменения']").click();
        save.shouldBe(appear, Duration.ofSeconds(2));
    }

    @Test
    public void shouldSettingsBePaidPay5() {
        name.click();
        $$("[class='BankCustomIntegration__content__extraFields__item']").last().click();
        $x("//*[text()='Передача в кредит']").click();
        $x("//*[text()='Сохранить изменения']").click();
        save.shouldBe(appear, Duration.ofSeconds(2));
    }

    @Test
    public void shouldSettingsBePaidPay4() {
        name.click();
        $$("[class='BankCustomIntegration__content__extraFields__item']").last().click();
        $x("//*[text()='Частичный расчет и кредит']").click();
        $x("//*[text()='Сохранить изменения']").click();
        save.shouldBe(appear, Duration.ofSeconds(2));
    }


    @Test
    public void shouldSettingsBePaidPay6() {
        name.click();
        $$("[class='BankCustomIntegration__content__extraFields__item']").last().click();
        $("[data-value='credit_payment']").click();
        $x("//*[text()='Сохранить изменения']").click();
        save.shouldBe(appear, Duration.ofSeconds(2));
    }

    @Test
    public void shouldUpDownBePaid() {
        name.click();
        $("[aria-label='controlled']").click();
        $x("//*[text()='Сохранить изменения']").click();
        save.shouldBe(appear, Duration.ofSeconds(2));

    }

    @Test
    public void shouldFieldsBePaid() {
        name.click();
        $("[type='checkbox']").click();
        $x("//*[text()='Сохранить изменения']").click();
        save.shouldBe(appear, Duration.ofSeconds(2));

    }

    @Test
    public void shouldTerminalBePaid() {
        name.click();
        $("[class='BankSettingsTerminal__item__useByDefault']").click();
        $x("//*[text()='Сохранить изменения']").click();
        save.shouldBe(appear, Duration.ofSeconds(2));

    }


}