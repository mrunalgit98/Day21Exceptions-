

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exception {
    String namePattern = "^[A-Z][a-z]{3,}$";
    String emailPattern = "[0-9a-zA-Z]+([._+-][0-9a-zA-Z]+)*[@][0-9A-Za-z]+([.][a-zA-Z]{2,4})*$";
    String PhonePattern = "(91-)[0-9]{10}$";

    String Password = "[A-Z]+[0-9]+[~!@#$%^&*]{1}[a-zA-Z0-9!@#$%]{5}";

    public boolean validateFirstName(String name)throws Invalid {
        Pattern pattern = Pattern.compile(namePattern);
        Matcher matcher = pattern.matcher(name);
        try
        {
            boolean result = matcher.matches();
            if (!result)
                throw new Invalid("Wrong Input");
        }
        catch (Invalid e) {
            System.out.println(e.errorMessage);

        }
        return true;
    }

    public boolean validateLastName(String name) throws Invalid {
        Pattern pattern = Pattern.compile(namePattern);
        Matcher matcher = pattern.matcher(name);
        try
        {
            boolean result = matcher.matches();
            if (!result)
                throw new Invalid("Wrong Input");
        }
        catch (Invalid e) {
            System.out.println(e.errorMessage);

        }
        return true;
    }
    public boolean validateEmail(String name) throws Invalid {
        Pattern pattern = Pattern.compile(emailPattern);
        Matcher matcher = pattern.matcher(name);
        try
        {
            boolean result = matcher.matches();
            if (!result)
                throw new Invalid("Wrong Input");
        }
        catch (Invalid e) {
            System.out.println(e.errorMessage);


        }
        return true;
    }
    public boolean validatePhone(String name) throws Invalid {
        Pattern pattern = Pattern.compile(PhonePattern);
        Matcher matcher = pattern.matcher(name);
        try
        {
            boolean result = matcher.matches();
            if (!result)
                throw new Invalid("Wrong Input");
        }
        catch (Invalid e) {
            System.out.println(e.errorMessage);


        }
        return true;
    }

    public boolean validatePassword(String name1) throws Invalid {
        Pattern pattern = Pattern.compile(Password);
        Matcher matcher = pattern.matcher(name1);
        try
        {
            boolean result = matcher.matches();
            if (!result)
                throw new Invalid("Wrong Input");
        }
        catch (Invalid e) {
            System.out.println(e.errorMessage);


        }
        return true;
    }
}