public class UserValidator {
    public static void main(String[] args) {
        UserValidator userValidator = new UserValidator();
        userValidator.validateFirstName("Kadali");
        userValidator.validateLastName("Shirisha");
        userValidator.validateEmailId("babyshirisha363@gmail.com");
        userValidator.validatePhoneNumber("7893883473");

    }
    public CharSequence validateFirstName(String firstName){
        return firstName;
    }
    public CharSequence validateLastName(String lastName) {
        return lastName;
    }
    public CharSequence validateEmailId(String eMail){
        return eMail;
    }
    public CharSequence validatePhoneNumber(String phoneNumber){
        return phoneNumber;
    }
}
