package page.contacts;

import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import page.tags.TagsFaker;

import java.time.Duration;

import static com.codeborne.selenide.Condition.appear;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.*;
import static page.LoginPage.getPassword;
import static page.LoginPage.getUsername;

public class Contacts {

    final String username = getUsername();
    final String password = getPassword();

    final SelenideElement save = $(withText("Изменения были успешно сохранены"));

    @BeforeEach
    public void setUp() {
        open("https://app-rc.int.radist.online/companies/5/contacts");
    }

    @Test
    public void AddContact() {
        $("[name='username']").setValue(username);
        $("[name='password']").setValue(password);
        $("[name='login']").click();
        $x("//*[text()='Добавить контакт']").click();
        $("[class='ContactDetailEdit__name__item']").click();
        $("[class='ContactDetailEdit__name__item']").setValue(TagsFaker.name());
        $("[class='ContactDetailEdit__footer__saveButton ']").click();
        save.shouldBe(appear, Duration.ofSeconds(2));

    }
}
