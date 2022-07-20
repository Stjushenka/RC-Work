package page.contacts;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Keys;
import page.faker;

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
        //$("[name='username']").setValue(username);
        //$("[name='password']").setValue(password);
        //$("[name='login']").click();
        $x("//*[text()='Добавить контакт']").click();
        $("[class='ContactDetailEdit__name__item'] input").setValue(faker.name());
        $("[class='ContactDetailEdit__footer__saveButton ']").click();
    }

    @Test
    public void AddContact1() {
        $x("//*[text()='Добавить контакт']").click();
        $("[class='ContactDetailEdit__name__item'] input").setValue(faker.name());
        $("[class=' react-tel-input '] input").setValue(faker.phone());
        $("[class='ContactDetailEdit__item__list__item__email'] input").setValue(faker.randomEmail());
        $("[class='ContactDetailEdit__footer__saveButton ']").click();

    }

    @Test
    public void AddContact2() {
        $x("//*[text()='Добавить контакт']").click();
        $("[class='ContactDetailEdit__name__item'] input").setValue(faker.name());
        $("[class=' react-tel-input '] input").setValue(faker.phone());
        $("[class='ContactDetailEdit__item__list__item__email'] input").setValue(faker.randomEmail());
        $("[class='createContact__addTags']").click();
        $("[class='contactDetail__tags__addTags__wrapper__itemWrapper']").click();
        $("[class='createContact__addTags']").click();
        $("[class='contactDetail__tags__addTags__wrapper__itemWrapper']").click();
        $("[class='ContactDetailEdit__footer__saveButton ']").click();
    }

    @Test
    public void AddContact3() {
        $x("//*[text()='Добавить контакт']").click();
        $("[class='ContactDetailEdit__name__item'] input").setValue(faker.name());
        $("[class=' react-tel-input '] input").setValue(faker.phone());
        $("[class='ContactDetailEdit__item__list__item__email'] input").setValue(faker.randomEmail());
        $("[class='createContact__addTags']").click();
        $("[class='contactDetail__tags__addTags__wrapper__itemWrapper']").click();
        $("[class='createContact__addTags']").click();
        $("[class='contactDetail__tags__addTags__wrapper__itemWrapper']").click();
        $x("//*[text()='Добавить заметку']").click();
        $("[class='createContact__addNotes__wrapperTextarea__textarea']").setValue(faker.pockemonName());
        $("[class='ContactDetailEdit__footer__saveButton ']").click();
    }

    @Test
    public void RefactorContact() {
        $("[class='contacts__footer__pagination__wrapper__setting__wrapper__setting__text__numberIcon']").click();
        $x("//*[text()='100']").click();
        $x("//*[text()='Сергей Белов']").click();
        $("[class='contactDetail__editButton']").click();
        $("[class='ContactDetailEdit__name__item'] input").sendKeys(Keys.chord(Keys.SHIFT, Keys.HOME), Keys.BACK_SPACE);
        $("[class='ContactDetailEdit__name__item'] input").setValue("Сергей Белов");
        $x("//*[text()='Добавить адрес электронной почты']").click();
        $("[class='ContactDetailEdit__item__list__item__email'] input").setValue(faker.randomEmail());
        $("[class='ContactDetailEdit__footer__saveButton ']").click();
        $("[class='ContactDetailEdit__footer__resetButton']").click();
        $x("//*[text()='Добавить теги']").click();
        $x("//*[text()='Выбрать']").click();
        $("[class='contactDetail__tags__addTags__wrapper__itemWrapper']").click();
        $x("//*[text()='Добавить']").click();
        $x("//*[text()='Добавить заметку']").click();
        $("[name='createNote']").setValue(faker.pockemonName());
        $("[class='useModalContact__footer__add ']").click();
        $x("//*[text()='Добавить заметку']").click();
        $("[name='createNote']").setValue(faker.pockemonName());
        $("[class='useModalContact__footer__add ']").click();
        $x("//*[text()='Добавить заметку']").click();
        $("[name='createNote']").setValue(faker.pockemonName());
        $("[class='useModalContact__footer__add ']").click();
        $("[class='contactDetail__notes__item__EditRemove__item__edit']").click();

        $("[name='editNote']").setValue(faker.pockemonName());
        $("[type='submit']").click();

    }

    @Test
    public void ContactDelNote() {
        $("[name='username']").setValue(username);
        $("[name='password']").setValue(password);
        $("[name='login']").click();
        $("[class='contacts__footer__pagination__wrapper__setting__wrapper__setting__text__numberIcon']").click();
        $x("//*[text()='100']").click();
        $x("//*[text()='Сергей Белов']").click();
        $("[class='contactDetail__notes__item__EditRemove__item__remove']").doubleClick();

    }


}
