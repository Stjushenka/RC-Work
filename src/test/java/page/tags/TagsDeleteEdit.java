package page.tags;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Keys;
import page.LoginPage;
import page.faker;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TagsDeleteEdit {

    @BeforeEach
    public void setUp() {
        open("https://app-rc.int.radist.online/companies/5/settings/tags");
    }

    @BeforeAll
    public static void profileLogin() {
        open("https://app-rc.int.radist.online/companies/5/settings/tags");
        LoginPage log = new LoginPage();
        var login = log.getLogin();
    }

    @Test
    public void DeleteTag() {
        $("[class='tagsContainer_table_tags_button_delete']").click();


    }

    @Test
    public void editTag() {
        $("[class='tagsContainer_table_tags_button_edit']").click();
        $("[id='name']").sendKeys(Keys.chord(Keys.SHIFT, Keys.HOME), Keys.BACK_SPACE);
        $("[id='name']").setValue(faker.phone());
        $("[id='description']").setValue(faker.name());
        $("[class='GlobalButton  orange small']").click();

    }


}
