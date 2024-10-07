import java.time.LocalDate;

public class Employée {
    //attributes
    private int id ;
    private String name ;
    private String familyName;
    //public String name ;
    //public String familyName;
    private LocalDate birthday;
    private double salary;

    public String getName() {
        return name;
    }

    public String getFamilyName() {
        return familyName;

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }
}
