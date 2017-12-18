package RNDLW_AUTH.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.


public class auth {
 public auth (WebDriver driver){
     PageFactory.initElements(driver, page: this);
     this.driver = driver;
 }
public WebDriver driver;

   @FindBy(id="name");
   private WebElement firstName;

   @FindBy(id="surname");
   private WebElement surName;

   @FindBy(id="email");
   private WebElement emailField;

   @FindBy(id="password");
   private WebElement password;

   @FindBy(className="button_box");
   private WebElement button;

   public void inputName(String name){
    firstName.sendKeys(name);
}

    public void inputSurname (String surname){
       surName.sendKeys(surname);
    }

    public void inputEmail (String email);



}

