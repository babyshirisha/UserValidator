import org.junit.Assert;
import org.junit.Test;

import java.util.regex.Pattern;

public class UserValidatorTest {
    UserValidator userValidator = new UserValidator();

    @Test
    public void givenFirstName_WhenProper_ShouldReturnTrue(){
        boolean result = Pattern.matches("^[A-Z]{1}[a-z]{2,}", userValidator.validateFirstName("Kadali"));
        //boolean firstName = Pattern.matches("^[A-Z]{1}[a-z]{2,}","Kadali");
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenLastName_WhenProper_ShouldReturnTrue() {
        //UserValidator userValidator = new UserValidator();
        boolean result = Pattern.matches("^[A-Z]{1}[a-z]{2,}", userValidator.validateLastName("Shirisha"));
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenEmailId_WhenProper_ShouldReturnTrue() {
        boolean result = Pattern.matches("^[a-zA-Z0-9_!#$%&’*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$", userValidator.validateEmailId("babyshirisha363@gmail.com"));
        Assert.assertEquals(true,result);
    }

    @Test
    public void givenPhoneNumber_WhenProper_ShouldReturnTrue() {
        boolean result = Pattern.matches("^d{10}$" , userValidator.validatePhoneNumber("7893883474"));
    }
}
