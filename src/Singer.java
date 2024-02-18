public class Singer extends Person {
    private String name4;
    private String designation4;
    private String bandName;


    public Singer(String name, String designation, String name4, String designation4, String bandName) {
        super(name, designation);
        this.name4 = name4;
        this.designation4 = designation4;
        this.bandName = bandName;
    }

    @Override
    public String toString() {
        return "Singer{" +
                "name4='" + name4 + '\'' +
                ", designation4='" + designation4 + '\'' +
                ", bandName='" + bandName + '\'' +
                "} " + super.toString();
    }
}
