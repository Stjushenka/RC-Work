package page;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.*;



public class Settings {

    @BeforeAll
    public  static void profileLogin() {
        open("https://app-rc.int.radist.online/companies/5/settings/integrations");
        LoginPage log = new LoginPage();
        var login = log.getLogin();
    }

    @BeforeEach
    public void setUp() {
        open("https://app-rc.int.radist.online/companies/5/settings/integrations");
    }

    @Test
    public void shouldAddNumberRetie() {
        $x("//*[text()='wa+amo radistonlinewidgets.amocrm.ru']").click();
        $x("//*[text()='Добавить номер телефона']").click();
        $x("//*[text()='Выбрать номер телефона']").click();
        $x("//*[text()='номер 22']").click();
        $x("//*[text()='Добавить']").click();
        $x("//*[text()='Сохранить изменения']").click();

        $(withText("Изменения были успешно сохранены"));

    }



    @Test
    public void shouldAddNumberWA() {
        $x("//*[text()='radist test']").click();
        $x("//*[text()='Добавить номер телефона']").click();
        $x("//*[text()='Выбрать номер телефона']").click();
        $("[data-value='5656']").click();
        $x("//*[text()='Добавить']").click();
        $x("//*[text()='Выбрать номер телефона']").click();
        $("[data-value='5762']").click();
        $x("//*[text()='Добавить']").click();
        $x("//*[text()='Сохранить изменения']").click();

        $(withText("Изменения были успешно сохранены"));

    }

    @Test
    public void shouldAddNumberWaba() {
        $("[name='login']").click();
        $x("//*[text()='waba+amocrm']").click();
        $x("//*[text()='Добавить номер телефона']").click();
        $x("//*[text()='Выбрать номер телефона']").click();
        $("[data-value='5362']").click();
        $x("//*[text()='Добавить']").click();
        $x("//*[text()='Сохранить изменения']").click();

        $(withText("Изменения были успешно сохранены"));

    }

    @Test
    public void shouldAddTerminalBePaid() {

        $x("//*[text()='bepaid+amo']").click();
        $x("//*[text()='Добавить подключения']").click();
        $x("//*[text()='Выберите подключение']").click();
        $$("[aria-haspopup='listbox']").last().click();
        $x("//*[text()='5393']").click();
        $x("//*[text()='Добавить']").click();
        $x("//*[text()='Сохранить изменения']").click();

        $(withText("Изменения были успешно сохранены"));

    }

    @Test
    public void shouldAddTerminalPayKeeper() {

        $x("//*[text()='PK+AMO1']").click();
        $x("//*[text()='Добавить подключения']").click();
        $x("//*[text()='Выберите подключение']").click();
        $$("[aria-haspopup='listbox']").last().click();
        $("[data-value='5417']").click();
        $x("//*[text()='Добавить']").click();
        $x("//*[text()='Сохранить изменения']").click();

        $(withText("Изменения были успешно сохранены"));

    }

    @Test
    public void shouldAddTerminalSber() {

        $x("//*[text()='sber+amo3']").click();
        $x("//*[text()='Добавить подключения']").click();
        $x("//*[text()='Выберите подключение']").click();
        $$("[aria-haspopup='listbox']").last().click();
        $("[data-value='5418']").click();
        $x("//*[text()='Добавить']").click();
        $x("//*[text()='Сохранить изменения']").click();

        $(withText("Изменения были успешно сохранены"));

    }

    @Test
    public void shouldAddTerminalModulBank() {

        $x("//*[text()='modul+amos1']").click();
        $x("//*[text()='Добавить подключения']").click();
        $x("//*[text()='Выберите подключение']").click();
        $$("[aria-haspopup='listbox']").last().click();
        $("[data-value='5416']").click();
        $x("//*[text()='Добавить']").click();
        $x("//*[text()='Сохранить изменения']").click();

        $(withText("Изменения были успешно сохранены"));

    }

    @Test
    public void shouldAddTerminalTinkoff() {

        $x("//*[text()='test tinkoff+dsadas']").click();
        $x("//*[text()='Добавить подключения']").click();
        $x("//*[text()='Выберите подключение']").click();
        $$("[aria-haspopup='listbox']").last().click();
        $("[data-value='5435']").click();
        $x("//*[text()='Добавить']").click();
        $x("//*[text()='Сохранить изменения']").click();

        $(withText("Изменения были успешно сохранены"));

    }




}
