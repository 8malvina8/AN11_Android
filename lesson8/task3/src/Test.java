import java.io.FileNotFoundException;
import java.net.URISyntaxException;

public class Test extends Exception{
    public void test() throws NullPointerException,ArithmeticException, FileNotFoundException, URISyntaxException {
        throw new NullPointerException();

    }

    public void main(String[] args) throws URISyntaxException {

       try {
            test();
        }
        catch (FileNotFoundException ex) {
            ex.printStackTrace();
            System.out.println("Error");
        } catch (NullPointerException ex) {
            ex.printStackTrace();
            System.out.println("Error");

       }
    }
}
