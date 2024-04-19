import java.time.LocalDate;
import java.util.List;
/**
 * Семейство рыб
 */
public class Fish extends Animal {
    private String fishType;

    public Fish(String name, LocalDate birthday, List<LocalDate>
            vactinations, String illness, String owner, String fishType) {
        super(name, birthday, vactinations, illness, owner);
        this.fishType = fishType;
    }
    public String getLegsFishType() {
        return fishType;
    }
    public void fly() { System.out.println("This animal can't fly"); }
    public void toGo() { System.out.println("This Animal can't walk"); }
}