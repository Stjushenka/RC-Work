package page.payment;

import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Keys;
import page.tags.TagsFaker;

import java.time.Duration;

import static com.codeborne.selenide.Condition.appear;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.*;
import static page.LoginPage.getPassword;
import static page.LoginPage.getUsername;

public class paymentLink {

    final String username = getUsername();
    final String password = getPassword();

    @BeforeEach
    public void setUp() {
        open("https://app-rc.int.radist.online/companies/5/chats");
    }

    @Test
    public void emptyFieldBePaid() {
        $("[name='username']").setValue(username);
        $("[name='password']").setValue(password);
        $("[name='login']").click();
        //$x("//*[text()='Добавить контакт']").click();
        $("[class='conversation__content undefined']").click();
        $("[class='GlobalButton  white small']").click();
        $("[class='dropdownContainer__dropdown']").click();
        $x("//*[text()='test FAKE']").click();
        $("[class='GlobalButton  orange regular']").click();
        $("[class = 'chatBillContainer__content__productContainer_content_error']").shouldBe(appear, Duration.ofSeconds(5));
    }

    @Test
    public void AddContact() {
        $("[name='username']").setValue(username);
        $("[name='password']").setValue(password);
        $("[name='login']").click();
        //$x("//*[text()='Добавить контакт']").click();
        $("[class='conversation__content undefined']").click();
        $("[class='GlobalButton  white small']").click();
        $("[class='dropdownContainer__dropdown']").click();
        $x("//*[text()='test FAKE']").click();
        $("[class='inputContainer__input'] input").setValue(TagsFaker.name());
        $("[class='inputContainer__input']").setValue("0.5");
        $("[class='inputContainer__input']").setValue("0.5");
        $("[class='GlobalButton  orange regular']").click();
    }
}
