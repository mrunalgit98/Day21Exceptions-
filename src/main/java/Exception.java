

import java.util.ArrayList;
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
    public boolean validateEmailId() throws  Invalid {
        String Email1 = "abc@yahoo.com";
        String Email2 = "abc-100@yahoo.com";
        String Email3 = "abc.100@yahoo.com";
        String Email4 = "abc111@abc.com";
        String Email5 = "abc-100@abc.net";
        String Email6 = "abc.100@abc.com.au";
        String Email7 = "abc@1.com";
        String Email8 = "abc@gmail.com.com";
        String Email9 = "abc+100@gmail.com";
        //Creating arrayList
        ArrayList<String> emailIdList = new ArrayList<String>();
        emailIdList.add(Email1);
        emailIdList.add(Email2);
        emailIdList.add(Email3);
        emailIdList.add(Email4);
        emailIdList.add(Email5);
        emailIdList.add(Email6);
        emailIdList.add(Email7);
        emailIdList.add(Email8);
        emailIdList.add(Email9);
        for (String emailId : emailIdList) {
            if (Pattern.matches(emailPattern, emailId)) {
                System.out.println(emailId + " - valid ");
                return true;
            }
            else {
                System.out.println(emailId + " - Invalid ");
            }
        }
        return false;
    }
}