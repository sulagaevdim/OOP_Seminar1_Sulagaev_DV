import java.time.LocalDate;
import java.util.List;
/**
 * Семейство пауков
 */
public class Spider extends Animal{
    private String classification;

    public Spider(String name, LocalDate birthday, List<LocalDate>
            vactinations, String illness, String owner, String classification) {
        super(name, birthday, vactinations, illness, owner);
        this.classification = classification;
    }
    public String getLegsClassification() {
        return classification;
    }
    public void fly() { System.out.println("This animal can't fly"); }
    public void swim() { System.out.println("This Animal can't swim"); }
}
