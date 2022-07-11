package page.banks;


import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.Duration;

import static com.codeborne.selenide.Condition.appear;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.*;
import static page.LoginPage.getPassword;
import static page.LoginPage.getUsername;

public class BanksSettingsPK {
    final String username = getUsername();
    final String password = getPassword();
    final SelenideElement name = $x("//*[text()='paykeeper+amo radistonlinewidgets.amocrm.ru']");
    final SelenideElement save = $(withText("Изменения были успешно сохранены"));

    @BeforeEach
    public void setUp() {
        open("https://app-rc.int.radist.online/companies/5/settings/integrations");
    }

    @Test
    public void shouldSettingsPKType() {
        name.click();
        $("[class='BankCustomIntegration_content__extraFields__item']").click();
        $("[data-value='excise']").click();
        $x("//*[text()='Сохранить изменения']").click();
        save.shouldBe(appear, Duration.ofSeconds(2));

    }

    @Test
    public void shouldSettingsPKType1() {
        name.click();
        $("[class='BankCustomIntegration_content__extraFields__item']").click();
        $x("//*[text()='Иной']").click();
        $x("//*[text()='Сохранить изменения']").click();
        save.shouldBe(appear, Duration.ofSeconds(2));
    }

    @Test
    public void shouldSettingsPKType2() {
        name.click();
        $("[class='BankCustomIntegration_content__extraFields__item']").click();
        $x("//*[text()='Товар']").click();
        $x("//*[text()='Сохранить изменения']").click();
        save.shouldBe(appear, Duration.ofSeconds(2));
    }

    @Test
    public void shouldSettingsPKType4() {
        name.click();
        $("[class='BankCustomIntegration_content__extraFields__item']").click();
        $x("//*[text()='Работа']").click();
        $x("//*[text()='Сохранить изменения']").click();
        save.shouldBe(appear, Duration.ofSeconds(2));
    }

    @Test
    public void shouldSettingsPKType5() {
        name.click();
        $("[class='BankCustomIntegration_content__extraFields__item']").click();
        $x("//*[text()='Услуга']").click();
        $x("//*[text()='Сохранить изменения']").click();
        save.shouldBe(appear, Duration.ofSeconds(2));
    }

    @Test
    public void shouldSettingsPKType6() {
        name.click();
        $("[class='BankCustomIntegration_content__extraFields__item']").click();
        $x("//*[text()='Ставка азартной игры']").click();
        $x("//*[text()='Сохранить изменения']").click();
        save.shouldBe(appear, Duration.ofSeconds(2));
    }

    @Test
    public void shouldSettingsPKType7() {
        name.click();
        $("[class='BankCustomIntegration_content__extraFields__item']").click();
        $x("//*[text()='Выигрыш азартной игры']").click();
        $x("//*[text()='Сохранить изменения']").click();
        save.shouldBe(appear, Duration.ofSeconds(2));
    }

    @Test
    public void shouldSettingsPKType8() {
        name.click();
        $("[class='BankCustomIntegration_content__extraFields__item']").click();
        $x("//*[text()='Лотерейный билет']").click();
        $x("//*[text()='Сохранить изменения']").click();
        save.shouldBe(appear, Duration.ofSeconds(2));
    }

    @Test
    public void shouldSettingsPKType9() {
        name.click();
        $("[class='BankCustomIntegration_content__extraFields__item']").click();
        $x("//*[text()='Выигрыш лотереи']").click();
        $x("//*[text()='Сохранить изменения']").click();
        save.shouldBe(appear, Duration.ofSeconds(2));
    }

    @Test
    public void shouldSettingsPKType10() {
        name.click();
        $("[class='BankCustomIntegration_content__extraFields__item']").click();
        $x("//*[text()='Предоставление РИД']").click();
        $x("//*[text()='Сохранить изменения']").click();
        save.shouldBe(appear, Duration.ofSeconds(2));
    }

    @Test
    public void shouldSettingsPKType11() {
        name.click();
        $("[class='BankCustomIntegration_content__extraFields__item']").click();
        $x("//*[text()='Платеж']").click();
        $x("//*[text()='Сохранить изменения']").click();
        save.shouldBe(appear, Duration.ofSeconds(2));
    }

    @Test
    public void shouldSettingsPKType12() {
        name.click();
        $("[class='BankCustomIntegration_content__extraFields__item']").click();
        $x("//*[text()='Агентское вознаграждение']").click();
        $x("//*[text()='Сохранить изменения']").click();
        save.shouldBe(appear, Duration.ofSeconds(2));
    }

    @Test
    public void shouldSettingsPKType13() {
        name.click();
        $("[class='BankCustomIntegration_content__extraFields__item']").click();
        $x("//*[text()='Составной предмет расчета']").click();
        $x("//*[text()='Сохранить изменения']").click();
        save.shouldBe(appear, Duration.ofSeconds(2));
    }

    @Test
    public void shouldSettingsPKTax() {
        name.click();
        $("[class='BankCustomIntegration__content__extraFields__item']").click();
        $x("//*[text()='Без НДС']").click();
        $x("//*[text()='Сохранить изменения']").click();
        save.shouldBe(appear, Duration.ofSeconds(2));
    }


    @Test
    public void shouldSettingsPKTax0() {
        name.click();
        $("[class='BankCustomIntegration__content__extraFields__item']").click();
        $x("//*[text()='0%']").click();
        $x("//*[text()='Сохранить изменения']").click();
        save.shouldBe(appear, Duration.ofSeconds(2));
    }

    @Test
    public void shouldSettingsPKTax10() {
        name.click();
        $("[class='BankCustomIntegration__content__extraFields__item']").click();
        $x("//*[text()='10%']").click();
        $x("//*[text()='Сохранить изменения']").click();
        save.shouldBe(appear, Duration.ofSeconds(2));
    }

    @Test
    public void shouldSettingsPKTax20() {
        name.click();
        $("[class='BankCustomIntegration__content__extraFields__item']").click();
        $x("//*[text()='20%']").click();
        $x("//*[text()='Сохранить изменения']").click();
        save.shouldBe(appear, Duration.ofSeconds(2));
    }

    @Test
    public void shouldSettingsPKTax110() {
        name.click();
        $("[class='BankCustomIntegration__content__extraFields__item']").click();
        $x("//*[text()='10/110']").click();
        $x("//*[text()='Сохранить изменения']").click();
        save.shouldBe(appear, Duration.ofSeconds(2));
    }

    @Test
    public void shouldSettingsPKTax120() {
        name.click();
        $("[class='BankCustomIntegration__content__extraFields__item']").click();
        $x("//*[text()='20/120']").click();
        $x("//*[text()='Сохранить изменения']").click();
        save.shouldBe(appear, Duration.ofSeconds(2));
    }

    @Test
    public void shouldSettingsPKPay2() {
        name.click();
        $$("[class='BankCustomIntegration__content__extraFields__item']").last().click();
        $x("//*[text()='Аванс']").click();
        $x("//*[text()='Сохранить изменения']").click();
        save.shouldBe(appear, Duration.ofSeconds(2));
    }

    @Test
    public void shouldSettingsPKPay() {
        name.click();
        $$("[class='BankCustomIntegration__content__extraFields__item']").last().click();
        $("[data-value='full_prepayment']").click();
        $x("//*[text()='Сохранить изменения']").click();
        save.shouldBe(appear, Duration.ofSeconds(2));
    }

    @Test
    public void shouldSettingsPKPay3() {
        name.click();
        $$("[class='BankCustomIntegration__content__extraFields__item']").last().click();
        $x("//*[text()='Полный расчет']").click();
        $x("//*[text()='Сохранить изменения']").click();
        save.shouldBe(appear, Duration.ofSeconds(2));
    }

    @Test
    public void shouldSettingsPKPay1() {
        name.click();
        $$("[class='BankCustomIntegration__content__extraFields__item']").last().click();
        $x("//*[text()='Предоплата']").click();
        $x("//*[text()='Сохранить изменения']").click();
        save.shouldBe(appear, Duration.ofSeconds(2));
    }

    @Test
    public void shouldSettingsPKPay5() {
        name.click();
        $$("[class='BankCustomIntegration__content__extraFields__item']").last().click();
        $x("//*[text()='Передача в кредит']").click();
        $x("//*[text()='Сохранить изменения']").click();
        save.shouldBe(appear, Duration.ofSeconds(2));
    }

    @Test
    public void shouldSettingsPKPay4() {
        name.click();
        $$("[class='BankCustomIntegration__content__extraFields__item']").last().click();
        $x("//*[text()='Частичный расчет и кредит']").click();
        $x("//*[text()='Сохранить изменения']").click();
        save.shouldBe(appear, Duration.ofSeconds(2));
    }


    @Test
    public void shouldSettingsPKPay6() {
        name.click();
        $$("[class='BankCustomIntegration__content__extraFields__item']").last().click();
        $("[data-value='credit_payment']").click();
        $x("//*[text()='Сохранить изменения']").click();
        save.shouldBe(appear, Duration.ofSeconds(2));
    }

    @Test
    public void shouldUpDownPK() {
        name.click();
        $("[aria-label='controlled']").click();
        $x("//*[text()='Сохранить изменения']").click();
        save.shouldBe(appear, Duration.ofSeconds(2));

    }

    @Test
    public void shouldFieldsPK() {
        $("[name='username']").setValue(username);
        $("[name='password']").setValue(password);
        $("[name='login']").click();

        name.click();
        $("[type='checkbox']").click();
        $x("//*[text()='Сохранить изменения']").click();
        save.shouldBe(appear, Duration.ofSeconds(2));

    }

    @Test
    public void shouldTerminalPK() {
        name.click();
        $("[class='BankSettingsTerminal__item__useByDefault']").click();
        $x("//*[text()='Сохранить изменения']").click();
        save.shouldBe(appear, Duration.ofSeconds(2));

    }
    @Test
    public void shouldSettingsPKTaxDisabled() {
        name.click();
        $("[class='BankCustomIntegration__content__extraFields__item']").click();
        $x("//*[text()='20%']").click();
        $x("//*[text()='Сохранить изменения']").click();
        save.shouldBe(appear, Duration.ofSeconds(2));
    }
    BankCustomIntegration__footer__saveChanges__button disabled
}


