package page.messenger;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.*;
import static page.LoginPage.getPassword;
import static page.LoginPage.getUsername;


public class IntegrationSettingsAddNumber {

    private String username = getUsername();
    private String password = getPassword();

    @BeforeEach
    public void setUp() {
        open("https://app-rc.int.radist.online/companies/5/settings/integrations");

    }

    @Test
    public void shouldAddNumberRetie() {

        $("[name='username']").setValue(username);
        $("[name='password']").setValue(password);
        $("[name='login']").click();

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
        $("[data-value='2']").click();
        $x("//*[text()='Добавить']").click();
        $x("//*[text()='Выбрать номер телефона']").click();
        $("[data-value='13711']").click();
        $x("//*[text()='Добавить']").click();
        $x("//*[text()='Сохранить изменения']").click();

        $(withText("Изменения были успешно сохранены"));

    }

    @Test
    public void shouldAddNumberWaba() {

        $("[name='username']").setValue(username);
        $("[name='password']").setValue(password);
        $("[name='login']").click();
        $x("//*[text()='radistonlinewidgets.amocrm.ru']").click();
        $x("//*[text()='Добавить номер телефона']").click();
        $x("//*[text()='Выбрать номер телефона']").click();
        $("[data-value='16549']").click();
        $x("//*[text()='Добавить']").click();
        $x("//*[text()='Сохранить изменения']").click();

        $(withText("Изменения были успешно сохранены"));

    }




}
