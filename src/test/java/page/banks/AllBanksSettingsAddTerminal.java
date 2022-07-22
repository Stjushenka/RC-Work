package page.banks;

import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import page.LoginPage;

import java.time.Duration;

import static com.codeborne.selenide.Condition.appear;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.*;
import static page.LoginPage.getLogin;

public class AllBanksSettingsAddTerminal {

    LoginPage.getLogin();
    final String password = LoginPage.getPassword();
    final SelenideElement save = $(withText("Изменения были успешно сохранены"));

    @BeforeEach
    public void setUp() {
        open("https://app-rc.int.radist.online/companies/5/settings/integrations");

    }

    @Test
    public void shouldAddTerminalBePaid() {

        $("[name='username']").setValue(username);
        $("[name='password']").setValue(password);
        $("[name='login']").click();
        $x("//*[text()='bepaid+amo radistonlinewidgets.amocrm.ru']").click();
        $x("//*[text()='Добавить подключения']").click();
        $x("//*[text()='Выберите подключение']").click();
        $$("[aria-haspopup='listbox']").last().click();
        $x("//*[text()='test FAKE']").click();
        $x("//*[text()='Добавить']").click();
        $x("//*[text()='Сохранить изменения']").click();

        save.shouldBe(appear, Duration.ofSeconds(2));

    }

    @Test
    public void shouldAddTerminalPayKeeper() {
        $("[name='username']").setValue(username);
        $("[name='password']").setValue(password);
        $("[name='login']").click();
        $x("//*[text()='paykeeper+amo radistonlinewidgets.amocrm.ru']").click();
        $x("//*[text()='Добавить подключения']").click();
        $x("//*[text()='Выберите подключение']").click();
        $$("[aria-haspopup='listbox']").last().click();
        $("[data-value='19184']").click();
        $x("//*[text()='Добавить']").click();
        $x("//*[text()='Сохранить изменения']").click();

        save.shouldBe(appear, Duration.ofSeconds(2));

    }

    @Test
    public void shouldAddTerminalSber() {

        $x("//*[text()='sberbank+amo radistonlinewidgets.amocrm.ru']").click();
        $x("//*[text()='Добавить подключения']").click();
        $x("//*[text()='Выберите подключение']").click();
        $$("[aria-haspopup='listbox']").last().click();
        $("[data-value='14905']").click();
        $x("//*[text()='Добавить']").click();
        $x("//*[text()='Сохранить изменения']").click();

        save.shouldBe(appear, Duration.ofSeconds(2));

    }

    @Test
    public void shouldAddTerminalModulBank() {

        $x("//*[text()='modulbank+amo radistonlinewidgets.amocrm.ru']").click();
        $x("//*[text()='Добавить подключения']").click();
        $x("//*[text()='Выберите подключение']").click();
        $$("[aria-haspopup='listbox']").last().click();
        $("[data-value='17222']").click();
        $x("//*[text()='Добавить']").click();
        $x("//*[text()='Сохранить изменения']").click();

        save.shouldBe(appear, Duration.ofSeconds(2));

    }

    @Test
    public void shouldAddTerminalTinkoff() {

        $x("//*[text()='tinkoff+amo radistonlinewidgets.amocrm.ru']").click();
        $x("//*[text()='Добавить подключения']").click();
        $x("//*[text()='Выберите подключение']").click();
        $$("[aria-haspopup='listbox']").last().click();
        $("[data-value='14745']").click();
        $x("//*[text()='Добавить']").click();
        $x("//*[text()='Сохранить изменения']").click();

        save.shouldBe(appear, Duration.ofSeconds(2));

    }

    @Test
    public void shouldTerminalPK() {
        $x("//*[text()='paykeeper+amo radistonlinewidgets.amocrm.ru']").click();
        $("[class='BankSettingsTerminal__item__useByDefault']").click();
        $x("//*[text()='Сохранить изменения']").click();
        save.shouldBe(appear, Duration.ofSeconds(2));

    }
}
