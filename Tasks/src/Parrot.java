import java.time.LocalDate;
import java.util.List;
/**
 * Семейство попугаев
 */
public class Parrot extends Animal {
    private String parrotView;

    public Parrot(String name, LocalDate birthday, List<LocalDate>
            vactinations, String illness, String owner, String parrotView) {
        super(name, birthday, vactinations, illness, owner);
        this.parrotView = parrotView;
    }
    public String getLegsCountParrotView() {
        return parrotView;
    }
    public void swim() { System.out.println("This Animal can't swim"); }
}
