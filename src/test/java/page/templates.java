package page;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.File;

import java.time.Duration;

import static com.codeborne.selenide.Condition.appear;
import static com.codeborne.selenide.Selenide.*;
//import static page.LoginPage.getPassword;
//import static page.LoginPage.getUsername;

public class templates {
    //final String username = getUsername();
    //final String password = getPassword();

    @BeforeEach
    public void setUp() {
        open("https://app-rc.int.radist.online/companies/5/templates");
    }

    @BeforeAll
    public  static void profileLogin() {
        open("https://app-rc.int.radist.online/companies/5/settings/templates");
        LoginPage log = new LoginPage();
        var login = log.getLogin();
    }


    @Test
    public void addTemplate() {
        $("[class='templatesList__item_content']").click();
        $("[class='createTemplateButton']").click();
        $("[id='name']").setValue(faker.pockemonName());
        $("[id='text']").setValue(String.valueOf(faker.number()));
        $("[class='addTemplateView__saveButton false']").click();
    }
    @Test
    public void addTemplate1() {
        $("[class='templatesList__item_content']").click();
        $("[class='createTemplateButton']").click();
        $("[id='name']").setValue("111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111");
        $("[id='text']").setValue(String.valueOf(faker.number()));
        $("[class='addTemplateView__saveButton false']").click();
    }
    @Test
    public void addTemplateErr() {
        $("[class='templatesList__item_content']").click();
        $("[class='createTemplateButton']").click();
        $("[id='text']").setValue(String.valueOf(faker.number()));
        $("[class='addTemplateView__saveButton false']").click();
        $("[class = 'validationError']").shouldBe(appear, Duration.ofSeconds(5));
    }

    @Test
    public void addTemplateErr2() {
        $("[class='templatesList__item_content']").click();
        $("[class='createTemplateButton']").click();
        $("[id='name']").setValue(String.valueOf(faker.number()));
        $("[class='addTemplateView__saveButton false']").click();
        $("[class = 'validationError']").shouldBe(appear, Duration.ofSeconds(5));
    }


    @Test
    public void addTemplateInterTextButtons() {
        $x("//*[text()='Интерактивные сообщения']").click();
        $("[class='createTemplateButton']").click();
        $("[name='name']").sendKeys("11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111");
        $("[name='waba_interactive.header.text']").sendKeys(String.valueOf(faker.number()));
        $("[name='waba_interactive.body']").sendKeys(faker.pockemonName());
        $("[name='waba_interactive.footer']").sendKeys(faker.pockemonName());
        $("[name='waba_interactive.action.buttons.0.reply.title']").sendKeys(faker.pockemonName());
        $("[name='waba_interactive.action.buttons.1.reply.title']").sendKeys(faker.pockemonName());
        $("[class='interactiveMessageSettings__footer_saveButton false']").click();
    }


    @Test
    public void addTemplateInterTextList() {
        $x("//*[text()='Интерактивные сообщения']").click();
        $("[class='createTemplateButton']").click();
        $("[name='name']").sendKeys("11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111");
        $("[name='waba_interactive.header.text']").sendKeys(String.valueOf(faker.number()));
        $("[name='waba_interactive.body']").sendKeys(faker.pockemonName());
        $("[name='waba_interactive.footer']").sendKeys(faker.pockemonName());
        $("[id='list']").click();
        $("[name='waba_interactive.action.sections.button']").sendKeys(String.valueOf(faker.number()));
        $("[name='waba_interactive.action.sections.sections.0.rows.0.title']").sendKeys(String.valueOf(faker.number()));
        $("[name='waba_interactive.action.sections.sections.0.rows.0.description']").sendKeys(String.valueOf(faker.number()));
        $("[class='interactiveMessageSettings__footer_saveButton false']").click();
    }

    @Test
    public void addTemplateInterPicButtons() {
        $x("//*[text()='Интерактивные сообщения']").click();
        $("[class='createTemplateButton']").click();
        $("[id='image']").click();
        $("[name='name']").sendKeys("1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111");
        $("[name='waba_interactive.body']").sendKeys(faker.pockemonName());
        $("[name='waba_interactive.footer']").sendKeys(faker.pockemonName());
        $("[name='waba_interactive.action.buttons.0.reply.title']").sendKeys(faker.pockemonName());
        $("[name='waba_interactive.action.buttons.1.reply.title']").sendKeys(faker.pockemonName());
        $("[class='interactiveMessageSettings__footer_saveButton false']").click();
        $("[class = 'filePayloadContent__dropzone_errorMessage']").shouldBe(appear, Duration.ofSeconds(5));
    }

    @Test
    public void addTemplateInterVideoButtons() {
        $x("//*[text()='Интерактивные сообщения']").click();
        $("[class='createTemplateButton']").click();
        $("[id='video']").click();
        $("[name='name']").sendKeys("11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111");
        $("[name='waba_interactive.body']").sendKeys(faker.pockemonName());
        $("[name='waba_interactive.footer']").sendKeys(faker.pockemonName());
        $("[name='waba_interactive.action.buttons.0.reply.title']").sendKeys(faker.pockemonName());
        $("[name='waba_interactive.action.buttons.1.reply.title']").sendKeys(faker.pockemonName());
        $("[class='interactiveMessageSettings__footer_saveButton false']").click();
        $("[class = 'filePayloadContent__dropzone_errorMessage']").shouldBe(appear, Duration.ofSeconds(5));
    }

    @Test
    public void addTemplateInterDocumentButtons() {
        $x("//*[text()='Интерактивные сообщения']").click();
        $("[class='createTemplateButton']").click();
        $("[id='document']").click();
        $("[name='name']").sendKeys("111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111");
        $("[name='waba_interactive.body']").sendKeys(faker.pockemonName());
        $("[name='waba_interactive.footer']").sendKeys(faker.pockemonName());
        $("[name='waba_interactive.action.buttons.0.reply.title']").sendKeys(faker.pockemonName());
        $("[name='waba_interactive.action.buttons.1.reply.title']").sendKeys(faker.pockemonName());
        $("[class='interactiveMessageSettings__footer_saveButton false']").click();
        $("[class = 'filePayloadContent__dropzone_errorMessage']").shouldBe(appear, Duration.ofSeconds(5));

    }

    @Test
    public void addTemplateInterWithoutAttachmentButtons() {
        $x("//*[text()='Интерактивные сообщения']").click();
        $("[class='createTemplateButton']").click();
        $("[id='withoutAttachment']").click();
        $("[name='name']").sendKeys("11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111");
        $("[name='waba_interactive.body']").sendKeys(faker.pockemonName());
        $("[name='waba_interactive.footer']").sendKeys(faker.pockemonName());
        $("[name='waba_interactive.action.buttons.0.reply.title']").sendKeys(faker.pockemonName());
        $("[name='waba_interactive.action.buttons.1.reply.title']").sendKeys(faker.pockemonName());
        $("[class='interactiveMessageSettings__footer_saveButton false']").click();
    }
    @Test
    public void addTemplateInterWithoutAttachmentList() {
        $x("//*[text()='Интерактивные сообщения']").click();
        $("[class='createTemplateButton']").click();
        $("[id='withoutAttachment']").click();
        $("[name='name']").sendKeys("11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111");
        $("[name='waba_interactive.body']").sendKeys(faker.pockemonName());
        $("[name='waba_interactive.footer']").sendKeys(faker.pockemonName());
        $("[id='list']").click();
        $("[name='waba_interactive.action.sections.button']").sendKeys(String.valueOf(faker.number()));
        $("[name='waba_interactive.action.sections.sections.0.rows.0.title']").sendKeys(String.valueOf(faker.number()));
        $("[name='waba_interactive.action.sections.sections.0.rows.0.description']").sendKeys(String.valueOf(faker.number()));
        $("[class='interactiveMessageSettings__footer_saveButton false']").click();

    }
    @Test
    public void addTemplateInterTextButtonsWithoutFooter() {
        $x("//*[text()='Интерактивные сообщения']").click();
        $("[class='createTemplateButton']").click();
        $("[name='name']").sendKeys("11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111");
        $("[name='waba_interactive.header.text']").sendKeys(String.valueOf(faker.number()));
        $("[name='waba_interactive.body']").sendKeys(faker.pockemonName());

        $("[name='waba_interactive.action.buttons.0.reply.title']").sendKeys(faker.pockemonName());
        $("[name='waba_interactive.action.buttons.1.reply.title']").sendKeys(faker.pockemonName());
        $("[class='interactiveMessageSettings__footer_saveButton false']").click();
    }


    @Test
    public void addTemplateInterTextListWithoutFooter() {
        $x("//*[text()='Интерактивные сообщения']").click();
        $("[class='createTemplateButton']").click();
        $("[name='name']").sendKeys("11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111");
        $("[name='waba_interactive.header.text']").sendKeys(String.valueOf(faker.number()));
        $("[name='waba_interactive.body']").sendKeys(faker.pockemonName());

        $("[id='list']").click();
        $("[name='waba_interactive.action.sections.button']").sendKeys(String.valueOf(faker.number()));
        $("[name='waba_interactive.action.sections.sections.0.rows.0.title']").sendKeys(String.valueOf(faker.number()));
        $("[name='waba_interactive.action.sections.sections.0.rows.0.description']").sendKeys(String.valueOf(faker.number()));
        $("[class='interactiveMessageSettings__footer_saveButton false']").click();
    }

    @Test
    public void addTemplateInterPicButtonsWithoutFooter() {
        $x("//*[text()='Интерактивные сообщения']").click();
        $("[class='createTemplateButton']").click();
        $("[id='image']").click();
        $("[name='name']").sendKeys("1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111");
        $("[name='waba_interactive.body']").sendKeys(faker.pockemonName());
        $("[name='waba_interactive.footer']").sendKeys(faker.pockemonName());
        $("[name='waba_interactive.action.buttons.0.reply.title']").sendKeys(faker.pockemonName());
        $("[name='waba_interactive.action.buttons.1.reply.title']").sendKeys(faker.pockemonName());
        $("[class='interactiveMessageSettings__footer_saveButton false']").click();
        $("[class = 'filePayloadContent__dropzone_errorMessage']").shouldBe(appear, Duration.ofSeconds(5));
    }

    @Test
    public void addTemplateInterVideoButtonsWithoutFooter() {
        $x("//*[text()='Интерактивные сообщения']").click();
        $("[class='createTemplateButton']").click();
        $("[id='video']").click();
        $("[name='name']").sendKeys("11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111");
        $("[name='waba_interactive.body']").sendKeys(faker.pockemonName());
        $("[name='waba_interactive.action.buttons.0.reply.title']").sendKeys(faker.pockemonName());
        $("[name='waba_interactive.action.buttons.1.reply.title']").sendKeys(faker.pockemonName());
        $("[class='interactiveMessageSettings__footer_saveButton false']").click();
        $("[class = 'filePayloadContent__dropzone_errorMessage']").shouldBe(appear, Duration.ofSeconds(5));
    }

    @Test
    public void addTemplateInterDocumentButtonsWithoutFooter() {
        $x("//*[text()='Интерактивные сообщения']").click();
        $("[class='createTemplateButton']").click();
        $("[id='document']").click();
        $("[name='name']").sendKeys("111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111");
        $("[name='waba_interactive.body']").sendKeys(faker.pockemonName());
        $("[name='waba_interactive.action.buttons.0.reply.title']").sendKeys(faker.pockemonName());
        $("[name='waba_interactive.action.buttons.1.reply.title']").sendKeys(faker.pockemonName());
        $("[class='interactiveMessageSettings__footer_saveButton false']").click();
        $("[class = 'filePayloadContent__dropzone_errorMessage']").shouldBe(appear, Duration.ofSeconds(5));

    }

    @Test
    public void addTemplateInterWithoutAttachmentButtonsWithoutFooter() {
        $x("//*[text()='Интерактивные сообщения']").click();
        $("[class='createTemplateButton']").click();
        $("[id='withoutAttachment']").click();
        $("[name='name']").sendKeys("11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111");
        $("[name='waba_interactive.body']").sendKeys(faker.pockemonName());
        $("[name='waba_interactive.action.buttons.0.reply.title']").sendKeys(faker.pockemonName());
        $("[name='waba_interactive.action.buttons.1.reply.title']").sendKeys(faker.pockemonName());
        $("[class='interactiveMessageSettings__footer_saveButton false']").click();
    }
    @Test
    public void addTemplateInterWithoutAttachmentListWithoutFooter() {
        $x("//*[text()='Интерактивные сообщения']").click();
        $("[class='createTemplateButton']").click();
        $("[id='withoutAttachment']").click();
        $("[name='name']").sendKeys("11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111");
        $("[name='waba_interactive.body']").sendKeys(faker.pockemonName());
        $("[id='list']").click();
        $("[name='waba_interactive.action.sections.button']").sendKeys(String.valueOf(faker.number()));
        $("[name='waba_interactive.action.sections.sections.0.rows.0.title']").sendKeys(String.valueOf(faker.number()));
        $("[name='waba_interactive.action.sections.sections.0.rows.0.description']").sendKeys(String.valueOf(faker.number()));
        $("[class='interactiveMessageSettings__footer_saveButton false']").click();

    }

    @Test
    public void addTemplateInterUpPicButtons() {
        $x("//*[text()='Интерактивные сообщения']").click();
        $("[class='createTemplateButton']").click();
        $("[id='image']").click();
        $("[class='filePayloadContent__dropzone_input']").uploadFile(new File("C:\\Users\\Люцик\\Downloads\\kartinki-vulkany-27.jpg"));
        $("[name='name']").sendKeys("Hello");
        $("[name='waba_interactive.body']").sendKeys(faker.pockemonName());
        $("[name='waba_interactive.footer']").sendKeys(faker.pockemonName());
        $("[name='waba_interactive.action.buttons.0.reply.title']").sendKeys(faker.pockemonName());
        $("[name='waba_interactive.action.buttons.1.reply.title']").sendKeys(faker.pockemonName());
        //$("[class='filePayloadContent__dropzone_text']").uploadFromClasspath(String.valueOf(new File("C:\\Users\\Lucik\\kartinki-vulkany-27.jpg")));
        $("[class='interactiveMessageSettings__footer_saveButton false']").click();
    }

    @Test
    public void addTemplateInterUpVideoButtons() {
        $x("//*[text()='Интерактивные сообщения']").click();
        $("[class='createTemplateButton']").click();
        $("[id='video']").click();
        $("[name='name']").sendKeys(faker.pockemonName());
        $("[class='filePayloadContent__dropzone_input']").uploadFile(new File("C:\\Users\\Люцик\\Downloads\\Test Image - 2141.mp4"));
        $("[name='waba_interactive.body']").sendKeys(faker.pockemonName());
        $("[name='waba_interactive.action.buttons.0.reply.title']").sendKeys(faker.pockemonName());
        $("[name='waba_interactive.action.buttons.1.reply.title']").sendKeys(faker.pockemonName());
        $("[class='interactiveMessageSettings__footer_saveButton false']").click();
    }

    @Test
    public void addTemplateInterUpDocumentButtons() {
        $x("//*[text()='Интерактивные сообщения']").click();
        $("[class='createTemplateButton']").click();
        $("[id='document']").click();
        $("[class='filePayloadContent__dropzone_input']").uploadFile(new File("C:\\Users\\Люцик\\Downloads\\Инструменты_тестирования_для_работы_с_документацией.pdf"));
        $("[name='name']").sendKeys(faker.pockemonName());
        $("[name='waba_interactive.body']").sendKeys(faker.pockemonName());
        $("[name='waba_interactive.action.buttons.0.reply.title']").sendKeys(faker.pockemonName());
        $("[name='waba_interactive.action.buttons.1.reply.title']").sendKeys(faker.pockemonName());
        $("[class='interactiveMessageSettings__footer_saveButton false']").click();
    }
    @Test
    public void addTemplateInterDelete() {
        $x("//*[text()='Интерактивные сообщения']").click();
        $("[class='customTemplateCard__buttonGroup_deleteButton']").click();
    }

}
