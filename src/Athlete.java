// Define a class called Athlete to model athletes.
public class Athlete {
    // Attributes or properties of the Athlete class.
    // These represent the state of an athlete.
    private int id;                // Unique identifier for each athlete.
    private String name;           // Name of the athlete.
    private int age;               // Age of the athlete.
    private String sport;          // Sport in which the athlete participates.
    private String achievements;   // Notable achievements of the athlete.

    // Constructor: Initializes the attributes when an Athlete object is created.
    public Athlete(int id, String name, int age, String sport, String achievements) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.sport = sport;
        this.achievements = achievements;
    }

    // Getter methods allow other parts of the program to access the attributes.

    // Get the unique identifier of the athlete.
    public int getId() {
        return id;
    }

    // Get the name of the athlete.
    public String getName() {
        return name;
    }

    // Get the age of the athlete.
    public int getAge() {
        return age;
    }

    // Get the sport in which the athlete participates.
    public String getSport() {
        return sport;
    }

    // Get the notable achievements of the athlete.
    public String getAchievements() {
        return achievements;
    }

    // Setter methods allow other parts of the program to modify the attributes.

    // Set the name of the athlete.
    public void setName(String name) {
        this.name = name;
    }

    // Set the age of the athlete.
    public void setAge(int age) {
        this.age = age;
    }

    // Set the sport in which the athlete participates.
    public void setSport(String sport) {
        this.sport = sport;
    }

    // Set the notable achievements of the athlete.
    public void setAchievements(String achievements) {
        this.achievements = achievements;
    }

    // Override the toString() method to provide a custom string representation of an Athlete object.
    @Override
    public String toString() {
        return "Athlete [id=" + id + ", name=" + name + ", age=" + age + ", sport=" + sport + ", achievements=" + achievements + "]";
    }
}
