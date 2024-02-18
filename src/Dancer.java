public class Dancer extends Person {
    private String name3;
    private String designation3;
    private String groupName;

    public Dancer(String name, String designation, String name3, String designation3, String groupName) {
        super(name, designation);
        this.name3 = name3;
        this.designation3 = designation3;
        this.groupName = groupName;
    }

    @Override
    public String toString() {
        return "Dancer{" +
                "name3='" + name3 + '\'' +
                ", designation3='" + designation3 + '\'' +
                ", groupName='" + groupName + '\'' +
                "} " + super.toString();
    }
}

