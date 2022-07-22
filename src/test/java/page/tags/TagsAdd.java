package page.tags;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import page.LoginPage;
import page.faker;

import static com.codeborne.selenide.Selenide.*;


public class TagsAdd {


    int min = '1';
    String aver = "yedgfgfehdfeydyuggdfhedgedf123";
    String maxTag = "999999999999999";



    @BeforeEach
    public void setUp() {
        open("https://app-rc.int.radist.online/companies/5/settings/tags");
    }



    @BeforeAll
    public  static void profileLogin() {
        open("https://app-rc.int.radist.online/companies/5/settings/tags");
        LoginPage log = new LoginPage();
        var login = log.getLogin();
    }


    @Test
    public void AddTag() {
        $("[class='GlobalButton  orange regular']").click();
        $("[id='name']").setValue(faker.name());
        $("[id='description']").setValue(faker.name());
        $("[style='background: rgb(250, 187, 188);']").click();
        $("[class='GlobalButton  orange small']").click();
    }

        @Test
        public void AddTag2() {
            $("[class='GlobalButton  orange regular']").click();
            $("[id='name']").setValue(maxTag);
            $("[id='description']").setValue("udkysdgysdhiuywyutghuiiyug");
            $("[style='background: rgb(246, 248, 197);']").click();
            $("[class='GlobalButton  orange small']").click();

    }

    @Test
    public void AddTag3() {
        $("[class='GlobalButton  orange regular']").click();
        $("[id='name']").setValue(faker.name());
        $("[id='description']").setValue("99999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999");
        $("[style='background: rgb(153, 215, 204);']").click();
        $("[class='GlobalButton  orange small']").click();

    }
    @Test
    public void AddTag4() {
        $("[class='GlobalButton  orange regular']").click();
        $("[id='name']").setValue(faker.name());
        $("[id='description']").setValue(String.valueOf(min));
        $("[style='background: rgb(255, 183, 214);']").click();
        $("[class='GlobalButton  orange small']").click();

    }

    @Test
    public void AddTag5() {
        $("[class='GlobalButton  orange regular']").click();
        $("[id='name']").setValue(faker.city());
        $("[id='description']").setValue("999999999999999999999999999999999999999999999999999999999999999999999999999999999999999");
        $("[style='background: rgb(255, 213, 171);']").click();
        $("[class='GlobalButton  orange small']").click();

    }

    @Test
    public void AddTag6() {
        $("[class='GlobalButton  orange regular']").click();
        $("[id='name']").setValue(faker.city());
        $("[id='description']").setValue(aver);
        $("[style='background: rgb(255, 213, 171);']").click();
        $("[class='GlobalButton  orange small']").click();

    }

    @Test
    public void AddTag7() {
        $("[class='GlobalButton  orange regular']").click();
        $("[id='name']").setValue(faker.city());
        $("[id='description']").setValue(aver);
        $("[style='background: rgb(210, 210, 210);']").click();
        $("[class='GlobalButton  orange small']").click();

    }

    @Test
    public void AddTag8() {
        $("[class='GlobalButton  orange regular']").click();
        $("[id='name']").setValue(faker.city());
        $("[id='description']").setValue(aver);
        $("[style='background: rgb(211, 229, 244);']").click();
        $("[class='GlobalButton  orange small']").click();

    }

    @Test
    public void AddTag9() {
        $("[class='GlobalButton  orange regular']").click();
        $("[id='name']").setValue(faker.city());
        $("[id='description']").setValue(aver);
        $("[style='background: rgb(211, 229, 244);']").click();
        $("[class='GlobalButton  orange small']").click();

    }

    @Test
    public void AddTag10() {
        $("[class='GlobalButton  orange regular']").click();
        $("[id='name']").setValue(faker.pockemonName());
        $("[id='description']").setValue(aver);
        $("[style='background: rgb(159, 226, 235);']").click();
        $("[class='GlobalButton  orange small']").click();

    }

    @Test
    public void AddTag11() {
        $("[class='GlobalButton  orange regular']").click();
        $("[id='name']").setValue(faker.city());
        $("[id='description']").setValue(aver);
        $("[style='background: rgb(246, 248, 197);']").click();
        $("[class='GlobalButton  orange small']").click();

    }

    @Test
    public void AddTag12() {
        $("[class='GlobalButton  orange regular']").click();
        $("[id='name']").setValue(faker.city());
        $("[id='description']").setValue(aver);
        $("[style='background: rgb(230, 249, 212);']").click();
        $("[class='GlobalButton  orange small']").click();

    }

    @Test
    public void AddTag13() {
        $("[class='GlobalButton  orange regular']").click();
        $("[id='name']").setValue(faker.city());
        $("[id='description']").setValue(aver);
        $("[style='background: rgb(255, 206, 212);']").click();
        $("[class='GlobalButton  orange small']").click();

    }

    @Test
    public void AddTag14() {
        $("[class='GlobalButton  orange regular']").click();
        $("[id='name']").setValue(faker.city());
        $("[id='description']").setValue(aver);
        $("[style='background: rgb(208, 192, 227);']").click();
        $("[class='GlobalButton  orange small']").click();

    }

    @Test
    public void AddTag15() {
        $("[class='GlobalButton  orange regular']").click();
        $("[id='name']").setValue(faker.city());
        $("[id='description']").setValue(aver);
        $("[style='background: rgb(236, 236, 236);']").click();
        $("[class='GlobalButton  orange small']").click();

    }


}
