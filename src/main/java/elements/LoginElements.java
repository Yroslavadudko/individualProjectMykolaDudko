package elements;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.*;

public class LoginElements {
    public static SelenideElement userField() {
        return $("#form-username");
    }
    public static SelenideElement passwordField() {
        return $("#form-password");
    }
    public static SelenideElement rememberMyField(){
        return $x("//body[1]/div[1]/form[1]/label[3]");
    }
    public static SelenideElement signInButton(){
        return $x("//button[contains(text(),'Sign in')]");
    }
    public static SelenideElement badUsernamePasswordField(){
        return $x("//p[contains(text(),'Bad username or password')]");
    }
    public static SelenideElement logOutButton(){
        return $x("//body/div[@id='dropdown']/ul[1]/li[10]/a[1]");
    }
    public static SelenideElement dropdownUserField(){
        return $x("//header/div[3]/div[2]/a[1]/i[1]");
    }
    public static SelenideElement activationUsernameField(){
        return $x("//body/div[@id='dropdown']/ul[1]/li[1]/strong[1]");
    }
}
