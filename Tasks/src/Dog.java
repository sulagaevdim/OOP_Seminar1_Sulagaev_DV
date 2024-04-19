import java.time.LocalDate;
import java.util.List;
/**
 * Семейство собачьих
 */
public class Dog extends Animal{

    public Dog(String name, LocalDate birthday, List<LocalDate> vactinations, String illness, String owner) {
        super(name, birthday, vactinations, illness, owner);
    }
    public void fly() { System.out.println("This animal can't fly"); }
}
