package page;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class LoginPage {

    public SelenideElement username = $("[data-test-id=login] input");
    public SelenideElement password = $("[data-test-id=password] input");
    public SelenideElement login = $("[data-test-id=action-login]");

    public LoginPage() {
    }
    public static String getUsername() {
        String username = "zhuravleva@radist.online";
        return username;
    }

    public static String getPassword() {
        String passwordUser = "kQE-53h-U96-n5q";
        return passwordUser;
    }


    public void getLogin (String getUsername, String password) {
        username.setValue(getUsername);
        password.setValue(getPassword);
        login.click();
    }




}
