package knu.ac.kr.passwordvalidator;

public class PasswordValidator {

    private int minLength;
    private int maxLength;

    public PasswordValidator(int minLength, int maxLength) {
        this.minLength = minLength;
        this.maxLength = maxLength;
    }

    public boolean validate (String password) {
        if (password == null || password == "" || password.equals("ADMIN"))
            return false;

        int passwordLength = password.length();
        if (passwordLength < minLength || passwordLength > maxLength) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        PasswordValidator passwordValidator = new PasswordValidator(5, 10);
        boolean result = passwordValidator.validate( "abc" );
        System.out.println(result);
    }
}

