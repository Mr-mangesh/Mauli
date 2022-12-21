package pomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateAccount {
@FindBy(xpath="(//a[text()='Create an Account'])[1]")private WebElement create;
@FindBy(xpath="//input[@name='firstname']")private WebElement name;
@FindBy(xpath="//input[@name='lastname']")private WebElement lastname;
@FindBy(xpath="//input[@name='is_subscribed']")private WebElement tik;
@FindBy(xpath="(//input[@name='email'])[1]")private WebElement email;
@FindBy(xpath="(//input[@name='password'])[1]")private WebElement psw;
@FindBy(xpath="	//input[@name='password_confirmation']")private WebElement cmpsw;
@FindBy(xpath="//button[@title='Create an Account']")private WebElement creatbtn;

 public CreateAccount(WebDriver driver){
	PageFactory.initElements(driver, this);
}
public void CreateA() {
	create.click();
}
public void firstname(String a) {
	name.sendKeys(a);
}
public void lastname(String b) {
	lastname.sendKeys(b);
}
public void tik() {
	tik.click();
}
public void email(String c) {
	email.sendKeys(c);
}
public void pass(String d) {
	psw.sendKeys(d);
}
public void confpass(String e) {
	cmpsw.sendKeys(e);
}
public void createaccount() {
	creatbtn.click();
}
}
