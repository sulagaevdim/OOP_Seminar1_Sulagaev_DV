import java.time.LocalDate;
import java.util.List;

/**
 * Класс животных для ветеринарной клиники
 */
public class Animal {
    protected String name;
    protected LocalDate birthday;
    protected List<LocalDate> vactinations;
    protected String Illness;
    protected String owner;

    public Animal(String name, LocalDate birthday, List<LocalDate> vactinations, String illness, String owner) {
        this.name = name;
        this.birthday = birthday;
        this.vactinations = vactinations;
        Illness = illness;
        this.owner = owner;
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public List<LocalDate> getVactinations() {
        return vactinations;
    }

    public String getIllness() {
        return Illness;
    }

    public String getOwner() {
        return owner;
    }

    public void eat(){
        System.out.println("Animal ate");
    }

    public void play() {
        System.out.println("Animal played");
    }

    public void sleep(){
        System.out.println("Animal sleeping");
    }

    public void toGo() { System.out.println("Animal going"); }
    public void fly() { System.out.println("Animal flies"); }
    public void swim() { System.out.println("Animal is swimming"); }
    private void wakeUp() {
        System.out.println("Animal is wakeup");
    }
    private void wakeUp(int time) {
        System.out.println("Animal is wakeup in" + time);
    }
    public void liveCircle(){
        wakeUp();
        eat();
        play();
        sleep();
    }

    @Override
    public String toString() {
        return "Animals{" +
                "name='" + name + '\'' +
                ", birthday=" + birthday +
                ", vactinations=" + vactinations +
                ", Illness='" + Illness + '\'' +
                ", owner='" + owner + '\'' +
                '}';
    }
}
