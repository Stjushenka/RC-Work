package page;


import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;


public class LoginPage {

    public LoginPage() {
    }

    public static String getUsername() {
        String username = "zhuravleva@radist.online";
        return username;
    }

    public static String getPassword() {
        String password = "kQE-53h-U96-n5q";
        return  password;
    }

    public SelenideElement user = $("[name='username']");
    public SelenideElement password = $("[name='password']");
    public SelenideElement button = $("[name='login']");

    public LoginPage getLogin() {
        user.setValue(getUsername());
        password.setValue(getPassword());
        button.click();
        return new LoginPage();
    }

}
