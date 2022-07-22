package page.payment;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import page.LoginPage;
import page.faker;

import java.time.Duration;

import static com.codeborne.selenide.Condition.appear;
import static com.codeborne.selenide.Selenide.*;
import static page.LoginPage.getLogin;



public class paymentLink {


    LoginPage.getLogin();


    @BeforeEach
    public void setUp() {
        open("https://app-rc.int.radist.online/companies/5/chats");
    }

    @Test
    public void emptyFieldBePaidError() {

        //$x("//*[text()='Добавить контакт']").click();
        $("[class='conversation__content undefined']").click();
        $("[class='GlobalButton  white small']").click();
        $("[class='dropdownContainer__dropdown']").click();
        $x("//*[text()='test FAKE']").click();
        $("[class='GlobalButton  orange regular']").click();
        $("[class = 'chatBillContainer__content__productContainer_content_error']").shouldBe(appear, Duration.ofSeconds(5));
    }

    @Test
    public void emptyFieldBePaid() {

        $("[class='conversation__content undefined']").click();
        $("[class='GlobalButton  white small']").click();
        $("[class='dropdownContainer__dropdown']").click();
        $x("//*[text()='test amocrm']").click();
        $$("[class='inputContainer__input']").get(2).setValue(faker.pockemonName());
        $$("[class='inputContainer__input']").get(3).setValue("0.5");
        $$("[class='inputContainer__input']").get(4).setValue("0.5");
        $$("[class='GlobalButton  white small']").get(1).click();
        $$("[class='inputContainer__input']").get(5).setValue(faker.pockemonName());
        $$("[class='inputContainer__input']").get(6).setValue("1");
        $$("[class='inputContainer__input']").get(7).setValue("0");
        $$("[class='GlobalButton  white small']").get(1).click();
        $$("[class='inputContainer__input']").get(8).setValue(faker.pockemonName());
        $$("[class='inputContainer__input']").get(9).setValue("545");
        $$("[class='inputContainer__input']").get(10).setValue("3");
        $("[class='GlobalButton  orange regular']").click();
        $("[class = 'ModalPaymentInvoiceLink']").shouldBe(appear, Duration.ofSeconds(30));
    }

    @Test
    public void emptyFieldPhoneTinkoff() {

        $("[class='conversation__content undefined']").click();
        $("[class='GlobalButton  white small']").click();
        $("[class='dropdownContainer__dropdown']").click();
        $x("//*[text()='11Продажа']").click();
        $("[class='form-control inputContainer__input_phone']").setValue(faker.phone());
        $$("[class='inputContainer__input']").get(2).setValue(faker.pockemonName());
        $$("[class='inputContainer__input']").get(3).setValue("0.5");
        $$("[class='inputContainer__input']").get(4).setValue("0.5");
        $$("[class='GlobalButton  white small']").get(1).click();
        $$("[class='inputContainer__input']").get(5).setValue(faker.pockemonName());
        $$("[class='inputContainer__input']").get(6).setValue("1");
        $$("[class='inputContainer__input']").get(7).setValue("0");
        $$("[class='GlobalButton  white small']").get(1).click();
        $$("[class='inputContainer__input']").get(8).setValue(faker.pockemonName());
        $$("[class='inputContainer__input']").get(9).setValue("545");
        $$("[class='inputContainer__input']").get(10).setValue("3");
        $("[class='GlobalButton  orange regular']").click();
        $("[class = 'ModalPaymentInvoiceLink']").shouldBe(appear, Duration.ofSeconds(30));
    }

    @Test
    public void emptyFieldMailTinkoff() {

        $("[class='conversation__content undefined']").click();
        $("[class='GlobalButton  white small']").click();
        $("[class='dropdownContainer__dropdown']").click();
        $x("//*[text()='11Продажа']").click();
        $("[name='receipt.client_email']").setValue(faker.randomEmail());
        $$("[class='inputContainer__input']").get(2).setValue(faker.pockemonName());
        $$("[class='inputContainer__input']").get(3).setValue("0.5");
        $$("[class='inputContainer__input']").get(4).setValue("0.5");
        $$("[class='GlobalButton  white small']").get(1).click();
        $$("[class='inputContainer__input']").get(5).setValue(faker.pockemonName());
        $$("[class='inputContainer__input']").get(6).setValue("1");
        $$("[class='inputContainer__input']").get(7).setValue("0");
        $$("[class='GlobalButton  white small']").get(1).click();
        $$("[class='inputContainer__input']").get(8).setValue(faker.pockemonName());
        $$("[class='inputContainer__input']").get(9).setValue("545");
        $$("[class='inputContainer__input']").get(10).setValue("3");
        $("[class='GlobalButton  orange regular']").click();
        $("[class = 'ModalPaymentInvoiceLink']").shouldBe(appear, Duration.ofSeconds(30));
    }



}
