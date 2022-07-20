package page.tags;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;


import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.Keys;
import page.faker;

import static com.codeborne.selenide.Selenide.*;
import static page.LoginPage.getPassword;
import static page.LoginPage.getUsername;

public class TagsDeleteEdit {

    final String username = getUsername();
    final String password = getPassword();

    @BeforeEach
    public void setUp() {
        open("https://app-rc.int.radist.online/companies/5/settings/tags");
    }

    @Test
    public void DeleteTag() {
        $("[name='username']").setValue(username);
        $("[name='password']").setValue(password);
        $("[name='login']").click();
        $("[class='tagsContainer_table_tags_button_delete']").click();


    }

    @Test
    public void editTag() {
        $("[name='username']").setValue(username);
        $("[name='password']").setValue(password);
        $("[name='login']").click();
        $("[class='tagsContainer_table_tags_button_edit']").click();
        $("[id='name']").sendKeys(Keys.chord(Keys.SHIFT, Keys.HOME), Keys.BACK_SPACE);
        $("[id='name']").setValue(faker.phone());
        $("[id='description']").setValue(faker.name());
        $("[class='GlobalButton  orange small']").click();

    }


}
