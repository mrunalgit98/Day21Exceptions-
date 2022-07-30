

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exception {
    String namePattern = "^[A-Z][a-z]{3,}$";

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
}