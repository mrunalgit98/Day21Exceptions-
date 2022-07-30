import org.junit.Assert;
import org.junit.Test;

public class ExceptionTest {

    Exception userRegistration=new Exception();

    @Test
    public void firstname() {
        try {

            boolean result = userRegistration.validateFirstName("Mrunal");
            Assert.assertTrue(result);
        } catch (Invalid e) {
            System.out.println(e.errorMessage);
        }
    }
}
