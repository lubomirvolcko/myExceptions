import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) throws InvalidIdNumberException {
        String rc;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your id number:");
        rc=scanner.nextLine();

        String pattern;
        pattern = "^[0-9]{2}[01235678][0-9][0-3][0-9]/?[0-9]{3,4}$";
        Pattern r = Pattern.compile(pattern);
        Matcher m = r.matcher(rc);
        if (m.matches())
        {
            System.out.println("Id number is correct");
        }
        else{
            throw new InvalidIdNumberException();
        }
    }
}
