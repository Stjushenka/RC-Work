package page.banks.PK;


import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import page.LoginPage;

import java.time.Duration;

import static com.codeborne.selenide.Condition.appear;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.*;


public class PKSaveChangesDisable {

    final SelenideElement name = $x("//*[text()='paykeeper+amo radistonlinewidgets.amocrm.ru']");
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
    public void shouldPKDisabledType() {
        name.click();
        $("[class='BankCustomIntegration_content__extraFields__item']").click();
        $x("//*[text()='excise']").click();
        $x("//*[text()='Сохранить изменения']").click();
        save.shouldBe(appear, Duration.ofSeconds(15));
        $("[class='BankCustomIntegration_content__extraFields__item']").click();
        $x("//*[text()='Услуга']").click();
        $("[class='BankCustomIntegration_content__extraFields__item']").click();
        $x("//*[text()='excise']").click();
        $("[class = 'BankCustomIntegration__footer__saveChanges__button disabled']").shouldBe(appear, Duration.ofSeconds(15));
    }

    @Test
    public void shouldPKDisabledType2() {
        name.click();
        $("[class='BankCustomIntegration_content__extraFields__item']").click();
        $x("//*[text()='Иной']").click();
        $x("//*[text()='Сохранить изменения']").click();
        save.shouldBe(appear, Duration.ofSeconds(2));
        $("[class='BankCustomIntegration_content__extraFields__item']").click();
        $x("//*[text()='Услуга']").click();
        $("[class='BankCustomIntegration_content__extraFields__item']").click();
        $x("//*[text()='Иной']").click();
        $("[class = 'BankCustomIntegration__footer__saveChanges__button disabled']").shouldBe(appear, Duration.ofSeconds(15));
    }

    @Test
    public void shouldPKDisabledType3() {
        name.click();
        $("[class='BankCustomIntegration_content__extraFields__item']").click();
        $x("//*[text()='Товар']").click();
        $x("//*[text()='Сохранить изменения']").click();
        save.shouldBe(appear, Duration.ofSeconds(2));
        $("[class='BankCustomIntegration_content__extraFields__item']").click();
        $x("//*[text()='Услуга']").click();
        $("[class='BankCustomIntegration_content__extraFields__item']").click();
        $x("//*[text()='Товар']").click();
        $("[class = 'BankCustomIntegration__footer__saveChanges__button disabled']").shouldBe(appear, Duration.ofSeconds(15));
    }

    @Test
    public void shouldPKDisabledType4() {
        name.click();
        $("[class='BankCustomIntegration_content__extraFields__item']").click();
        $x("//*[text()='Работа']").click();
        $x("//*[text()='Сохранить изменения']").click();
        save.shouldBe(appear, Duration.ofSeconds(2));
        $("[class='BankCustomIntegration_content__extraFields__item']").click();
        $x("//*[text()='Услуга']").click();
        $("[class='BankCustomIntegration_content__extraFields__item']").click();
        $x("//*[text()='Работа']").click();
        $("[class = 'BankCustomIntegration__footer__saveChanges__button disabled']").shouldBe(appear, Duration.ofSeconds(15));
    }

    @Test
    public void shouldPKDisabledType5() {
        name.click();
        $("[class='BankCustomIntegration_content__extraFields__item']").click();
        $x("//*[text()='Услуга']").click();
        $x("//*[text()='Сохранить изменения']").click();
        save.shouldBe(appear, Duration.ofSeconds(2));
        $("[class='BankCustomIntegration_content__extraFields__item']").click();
        $x("//*[text()='Товар']").click();
        $("[class='BankCustomIntegration_content__extraFields__item']").click();
        $x("//*[text()='Услуга']").click();
        $("[class = 'BankCustomIntegration__footer__saveChanges__button disabled']").shouldBe(appear, Duration.ofSeconds(15));
    }

    @Test
    public void shouldPKDisabledType6() {
        name.click();
        $("[class='BankCustomIntegration_content__extraFields__item']").click();
        $x("//*[text()='Ставка азартной игры']").click();
        $x("//*[text()='Сохранить изменения']").click();
        save.shouldBe(appear, Duration.ofSeconds(2));
        $("[class='BankCustomIntegration_content__extraFields__item']").click();
        $x("//*[text()='Услуга']").click();
        $("[class='BankCustomIntegration_content__extraFields__item']").click();
        $x("//*[text()='Ставка азартной игры']").click();
        $("[class = 'BankCustomIntegration__footer__saveChanges__button disabled']").shouldBe(appear, Duration.ofSeconds(15));
    }

    @Test
    public void shouldPKDisabledType7() {
        name.click();
        $("[class='BankCustomIntegration_content__extraFields__item']").click();
        $x("//*[text()='Выигрыш азартной игры']").click();
        $x("//*[text()='Сохранить изменения']").click();
        save.shouldBe(appear, Duration.ofSeconds(2));
        $("[class='BankCustomIntegration_content__extraFields__item']").click();
        $x("//*[text()='Товар']").click();
        $("[class='BankCustomIntegration_content__extraFields__item']").click();
        $x("//*[text()='Выигрыш азартной игры']").click();
        $("[class = 'BankCustomIntegration__footer__saveChanges__button disabled']").shouldBe(appear, Duration.ofSeconds(15));
    }

    @Test
    public void shouldPKDisabledType8() {
        name.click();
        $("[class='BankCustomIntegration_content__extraFields__item']").click();
        $x("//*[text()='Лотерейный билет']").click();
        $x("//*[text()='Сохранить изменения']").click();
        save.shouldBe(appear, Duration.ofSeconds(2));
        $("[class='BankCustomIntegration_content__extraFields__item']").click();
        $x("//*[text()='Товар']").click();
        $("[class='BankCustomIntegration_content__extraFields__item']").click();
        $x("//*[text()='Лотерейный билет']").click();
        $("[class = 'BankCustomIntegration__footer__saveChanges__button disabled']").shouldBe(appear, Duration.ofSeconds(15));
    }

    @Test
    public void shouldPKDisabledType9() {
        name.click();
        $("[class='BankCustomIntegration_content__extraFields__item']").click();
        $x("//*[text()='Выигрыш лотереи']").click();
        $x("//*[text()='Сохранить изменения']").click();
        save.shouldBe(appear, Duration.ofSeconds(2));
        $("[class='BankCustomIntegration_content__extraFields__item']").click();
        $x("//*[text()='Услуга']").click();
        $("[class='BankCustomIntegration_content__extraFields__item']").click();
        $x("//*[text()='Выигрыш лотереи']").click();
        $("[class = 'BankCustomIntegration__footer__saveChanges__button disabled']").shouldBe(appear, Duration.ofSeconds(15));
    }

    @Test
    public void shouldPKDisabledType10() {
        name.click();
        $("[class='BankCustomIntegration_content__extraFields__item']").click();
        $x("//*[text()='Предоставление РИД']").click();
        $x("//*[text()='Сохранить изменения']").click();
        save.shouldBe(appear, Duration.ofSeconds(2));
        $("[class='BankCustomIntegration_content__extraFields__item']").click();
        $x("//*[text()='Услуга']").click();
        $("[class='BankCustomIntegration_content__extraFields__item']").click();
        $x("//*[text()='Предоставление РИД']").click();
        $("[class = 'BankCustomIntegration__footer__saveChanges__button disabled']").shouldBe(appear, Duration.ofSeconds(15));
    }

    @Test
    public void shouldPKDisabledType11() {
        name.click();
        $("[class='BankCustomIntegration_content__extraFields__item']").click();
        $x("//*[text()='Платеж']").click();
        $x("//*[text()='Сохранить изменения']").click();
        save.shouldBe(appear, Duration.ofSeconds(2));
        $("[class='BankCustomIntegration_content__extraFields__item']").click();
        $x("//*[text()='Услуга']").click();
        $("[class='BankCustomIntegration_content__extraFields__item']").click();
        $x("//*[text()='Платеж']").click();
        $("[class = 'BankCustomIntegration__footer__saveChanges__button disabled']").shouldBe(appear, Duration.ofSeconds(15));
    }

    @Test
    public void shouldPKDisabledType12() {
        name.click();
        $("[class='BankCustomIntegration_content__extraFields__item']").click();
        $x("//*[text()='Агентское вознаграждение']").click();
        $x("//*[text()='Сохранить изменения']").click();
        save.shouldBe(appear, Duration.ofSeconds(2));
        $("[class='BankCustomIntegration_content__extraFields__item']").click();
        $x("//*[text()='Услуга']").click();
        $("[class='BankCustomIntegration_content__extraFields__item']").click();
        $x("//*[text()='Агентское вознаграждение']").click();
        $("[class = 'BankCustomIntegration__footer__saveChanges__button disabled']").shouldBe(appear, Duration.ofSeconds(15));
    }

    @Test
    public void shouldPKDisabledType13() {
        name.click();
        $("[class='BankCustomIntegration_content__extraFields__item']").click();
        $x("//*[text()='Составной предмет расчета']").click();
        $x("//*[text()='Сохранить изменения']").click();
        save.shouldBe(appear, Duration.ofSeconds(2));
        $("[class='BankCustomIntegration_content__extraFields__item']").click();
        $x("//*[text()='Услуга']").click();
        $("[class='BankCustomIntegration_content__extraFields__item']").click();
        $x("//*[text()='Составной предмет расчета']").click();
        $("[class = 'BankCustomIntegration__footer__saveChanges__button disabled']").shouldBe(appear, Duration.ofSeconds(15));

    }

    @Test
    public void shouldPKDisabledTax() {
        name.click();
        $("[class='BankCustomIntegration__content__extraFields__item']").click();
        $x("//*[text()='Без НДС']").click();
        $x("//*[text()='Сохранить изменения']").click();
        save.shouldBe(appear, Duration.ofSeconds(2));
        $("[class='BankCustomIntegration__content__extraFields__item']").click();
        $x("//*[text()='10%']").click();
        $("[class='BankCustomIntegration__content__extraFields__item']").click();
        $x("//*[text()='Без НДС']").click();
        $("[class = 'BankCustomIntegration__footer__saveChanges__button disabled']").shouldBe(appear, Duration.ofSeconds(15));
    }


    @Test
    public void shouldPKDisabledTax0() {
        name.click();
        $("[class='BankCustomIntegration__content__extraFields__item']").click();
        $x("//*[text()='0%']").click();
        $x("//*[text()='Сохранить изменения']").click();
        save.shouldBe(appear, Duration.ofSeconds(2));
        $("[class='BankCustomIntegration__content__extraFields__item']").click();
        $x("//*[text()='10%']").click();
        $("[class='BankCustomIntegration__content__extraFields__item']").click();
        $x("//*[text()='0%']").click();
        $("[class = 'BankCustomIntegration__footer__saveChanges__button disabled']").shouldBe(appear, Duration.ofSeconds(15));
    }

    @Test
    public void shouldPKDisabledTax10() {
        name.click();
        $("[class='BankCustomIntegration__content__extraFields__item']").click();
        $x("//*[text()='10%']").click();
        $x("//*[text()='Сохранить изменения']").click();
        save.shouldBe(appear, Duration.ofSeconds(2));
        $("[class='BankCustomIntegration__content__extraFields__item']").click();
        $x("//*[text()='20%']").click();
        $("[class='BankCustomIntegration__content__extraFields__item']").click();
        $x("//*[text()='10%']").click();
        $("[class = 'BankCustomIntegration__footer__saveChanges__button disabled']").shouldBe(appear, Duration.ofSeconds(15));
    }

    @Test
    public void shouldPKDisabledTax20() {
        name.click();
        $("[class='BankCustomIntegration__content__extraFields__item']").click();
        $x("//*[text()='20%']").click();
        $x("//*[text()='Сохранить изменения']").click();
        save.shouldBe(appear, Duration.ofSeconds(2));
        $("[class='BankCustomIntegration__content__extraFields__item']").click();
        $x("//*[text()='10%']").click();
        $("[class='BankCustomIntegration__content__extraFields__item']").click();
        $x("//*[text()='20%']").click();
        $("[class = 'BankCustomIntegration__footer__saveChanges__button disabled']").shouldBe(appear, Duration.ofSeconds(15));
    }

    @Test
    public void shouldPKDisabledTax110() {
        name.click();
        $("[class='BankCustomIntegration__content__extraFields__item']").click();
        $x("//*[text()='10/110']").click();
        $x("//*[text()='Сохранить изменения']").click();
        save.shouldBe(appear, Duration.ofSeconds(2));
        $("[class='BankCustomIntegration__content__extraFields__item']").click();
        $x("//*[text()='10%']").click();
        $("[class='BankCustomIntegration__content__extraFields__item']").click();
        $x("//*[text()='10/110']").click();
        $("[class = 'BankCustomIntegration__footer__saveChanges__button disabled']").shouldBe(appear, Duration.ofSeconds(15));
    }

    @Test
    public void shouldPKDisabledTax120() {
        name.click();
        $("[class='BankCustomIntegration__content__extraFields__item']").click();
        $x("//*[text()='20/120']").click();
        $x("//*[text()='Сохранить изменения']").click();
        save.shouldBe(appear, Duration.ofSeconds(2));
        $("[class='BankCustomIntegration__content__extraFields__item']").click();
        $x("//*[text()='10%']").click();
        $("[class='BankCustomIntegration__content__extraFields__item']").click();
        $x("//*[text()='20/120']").click();
        $("[class = 'BankCustomIntegration__footer__saveChanges__button disabled']").shouldBe(appear, Duration.ofSeconds(15));
    }

    @Test
    public void shouldPKDisabledPay() {
        name.click();
        $$("[class='BankCustomIntegration__content__extraFields__item']").last().click();
        $("[data-value='full_prepayment']").click();
        $x("//*[text()='Сохранить изменения']").click();
        save.shouldBe(appear, Duration.ofSeconds(2));
        $$("[class='BankCustomIntegration__content__extraFields__item']").last().click();
        $x("//*[text()='Предоплата']").click();
        $$("[class='BankCustomIntegration__content__extraFields__item']").last().click();
        $("[data-value='full_prepayment']").click();
        $("[class = 'BankCustomIntegration__footer__saveChanges__button disabled']").shouldBe(appear, Duration.ofSeconds(15));
    }

    @Test
    public void shouldPKDisabledPay1() {
        name.click();
        $$("[class='BankCustomIntegration__content__extraFields__item']").last().click();
        $x("//*[text()='Предоплата']").click();
        $x("//*[text()='Сохранить изменения']").click();
        save.shouldBe(appear, Duration.ofSeconds(2));
        $$("[class='BankCustomIntegration__content__extraFields__item']").last().click();
        $x("//*[text()='Аванс']").click();
        $$("[class='BankCustomIntegration__content__extraFields__item']").last().click();
        $x("//*[text()='Предоплата']").click();
        $("[class = 'BankCustomIntegration__footer__saveChanges__button disabled']").shouldBe(appear, Duration.ofSeconds(15));
    }

    @Test
    public void shouldPKDisabledPay2() {
        name.click();
        $$("[class='BankCustomIntegration__content__extraFields__item']").last().click();
        $x("//*[text()='Аванс']").click();
        $x("//*[text()='Сохранить изменения']").click();
        save.shouldBe(appear, Duration.ofSeconds(2));
        $$("[class='BankCustomIntegration__content__extraFields__item']").last().click();
        $x("//*[text()='Предоплата']").click();
        $$("[class='BankCustomIntegration__content__extraFields__item']").last().click();
        $x("//*[text()='Аванс']").click();
        $("[class = 'BankCustomIntegration__footer__saveChanges__button disabled']").shouldBe(appear, Duration.ofSeconds(15));
    }

    @Test
    public void shouldPKDisabledPay3() {
        name.click();
        $$("[class='BankCustomIntegration__content__extraFields__item']").last().click();
        $x("//*[text()='Полный расчет']").click();
        $x("//*[text()='Сохранить изменения']").click();
        save.shouldBe(appear, Duration.ofSeconds(2));
        $$("[class='BankCustomIntegration__content__extraFields__item']").last().click();
        $x("//*[text()='Предоплата']").click();
        $$("[class='BankCustomIntegration__content__extraFields__item']").last().click();
        $x("//*[text()='Полный расчет']").click();
        $("[class = 'BankCustomIntegration__footer__saveChanges__button disabled']").shouldBe(appear, Duration.ofSeconds(15));
    }

    @Test
    public void shouldPKDisabledPay5() {
        name.click();
        $$("[class='BankCustomIntegration__content__extraFields__item']").last().click();
        $x("//*[text()='Передача в кредит']").click();
        $x("//*[text()='Сохранить изменения']").click();
        save.shouldBe(appear, Duration.ofSeconds(2));
        $$("[class='BankCustomIntegration__content__extraFields__item']").last().click();
        $x("//*[text()='Предоплата']").click();
        $$("[class='BankCustomIntegration__content__extraFields__item']").last().click();
        $x("//*[text()='Передача в кредит']").click();
        $("[class = 'BankCustomIntegration__footer__saveChanges__button disabled']").shouldBe(appear, Duration.ofSeconds(15));
    }

    @Test
    public void shouldPKDisabledPay4() {
        name.click();
        $$("[class='BankCustomIntegration__content__extraFields__item']").last().click();
        $x("//*[text()='Частичный расчет и кредит']").click();
        $x("//*[text()='Сохранить изменения']").click();
        save.shouldBe(appear, Duration.ofSeconds(2));
        $$("[class='BankCustomIntegration__content__extraFields__item']").last().click();
        $x("//*[text()='Предоплата']").click();
        $$("[class='BankCustomIntegration__content__extraFields__item']").last().click();
        $x("//*[text()='Частичный расчет и кредит']").click();
        $("[class = 'BankCustomIntegration__footer__saveChanges__button disabled']").shouldBe(appear, Duration.ofSeconds(15));
    }


    @Test
    public void shouldPKDisabledPay6() {
        name.click();
        $$("[class='BankCustomIntegration__content__extraFields__item']").last().click();
        $("[data-value='credit_payment']").click();
        $x("//*[text()='Сохранить изменения']").click();
        save.shouldBe(appear, Duration.ofSeconds(2));
        $$("[class='BankCustomIntegration__content__extraFields__item']").last().click();
        $x("//*[text()='Предоплата']").click();
        $$("[class='BankCustomIntegration__content__extraFields__item']").last().click();
        $("[data-value='credit_payment']").click();
        $("[class = 'BankCustomIntegration__footer__saveChanges__button disabled']").shouldBe(appear, Duration.ofSeconds(15));
    }

    @Test
    public void shouldUpDownPK() {
        name.click();
        $("[aria-label='controlled']").click();
        $("[aria-label='controlled']").click();
        $x("//*[text()='Сохранить изменения']").click();
        $("[class = 'BankCustomIntegration__footer__saveChanges__button disabled']").shouldBe(appear, Duration.ofSeconds(15));
    }

    @Test
    public void shouldFieldsPK() {
        name.click();
        $("[type='checkbox']").click();
        $("[type='checkbox']").click();
        $("[class = 'BankCustomIntegration__footer__saveChanges__button disabled']").shouldBe(appear, Duration.ofSeconds(15));
    }
}
