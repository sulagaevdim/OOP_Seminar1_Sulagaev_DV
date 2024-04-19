import java.time.LocalDate;
import java.util.List;
/**
 * Семейство кошачьих
 */
public class Cat extends Animal{
    private int legsCount;
    public Cat(String name, LocalDate birthday, List<LocalDate> vactinations,
               String illness, String owner, int legsCount) {
        super(name, birthday, vactinations, illness, owner);
        this.legsCount = legsCount;
    }

    public int getLegsCount() {
        return legsCount;
    }
    public void fly() { System.out.println("This animal can't fly"); }
}
