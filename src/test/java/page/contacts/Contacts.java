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
                $("[class='ContactDetailEdit__name__item'] input").setValue(TagsFaker.name());
        $("[class='ContactDetailEdit__footer__saveButton ']").click();
    }

    @Test
    public void AddContact1() {
        $("[name='username']").setValue(username);
        $("[name='password']").setValue(password);
        $("[name='login']").click();
        $x("//*[text()='Добавить контакт']").click();
        $("[class='ContactDetailEdit__name__item'] input").setValue(TagsFaker.name());
        $("[class=' react-tel-input '] input").setValue(TagsFaker.phone());
        $("[class='ContactDetailEdit__item__list__item__email'] input").setValue(TagsFaker.randomEmail());
        $("[class='ContactDetailEdit__footer__saveButton ']").click();

    }

    @Test
    public void AddContact2() {
        $("[name='username']").setValue(username);
        $("[name='password']").setValue(password);
        $("[name='login']").click();
        $x("//*[text()='Добавить контакт']").click();
        $("[class='ContactDetailEdit__name__item'] input").setValue(TagsFaker.name());
        $("[class=' react-tel-input '] input").setValue(TagsFaker.phone());
        $("[class='ContactDetailEdit__item__list__item__email'] input").setValue(TagsFaker.randomEmail());
        $("[class='createContact__addTags']").click();
        $("[class='contactDetail__tags__addTags__wrapper__itemWrapper']").click();
        $("[class='createContact__addTags']").click();
        $("[class='contactDetail__tags__addTags__wrapper__itemWrapper']").click();
        $("[class='ContactDetailEdit__footer__saveButton ']").click();
    }

    @Test
    public void AddContact3() {
        $("[name='username']").setValue(username);
        $("[name='password']").setValue(password);
        $("[name='login']").click();
        $x("//*[text()='Добавить контакт']").click();
        $("[class='ContactDetailEdit__name__item'] input").setValue(TagsFaker.name());
        $("[class=' react-tel-input '] input").setValue(TagsFaker.phone());
        $("[class='ContactDetailEdit__item__list__item__email'] input").setValue(TagsFaker.randomEmail());
        $("[class='createContact__addTags']").click();
        $("[class='contactDetail__tags__addTags__wrapper__itemWrapper']").click();
        $("[class='createContact__addTags']").click();
        $("[class='contactDetail__tags__addTags__wrapper__itemWrapper']").click();
        $x("//*[text()='Добавить заметку']").click();
        $("[class='createContact__addNotes__wrapperTextarea__textarea']").setValue(TagsFaker.pockemonName());
        $("[class='ContactDetailEdit__footer__saveButton ']").click();
    }



}
