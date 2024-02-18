public class Programmer extends Person {
    private String name2;
    private String designation2;
    private String companyName;

    public Programmer(String name, String designation, String name2, String designation2, String companyName) {
        super(name, designation);
        this.name2 = name2;
        this.designation2 = designation2;
        this.companyName = companyName;
    }

    @Override
    public String toString() {
        return "Programmer{" +
                "name2='" + name2 + '\'' +
                ", designation2='" + designation2 + '\'' +
                ", companyName='" + companyName + '\'' +
                "} " + super.toString();
    }
}

