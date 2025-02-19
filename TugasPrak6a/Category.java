package TugasPrak6a;

public class Category {
    private String name;
    private String generalDescription;

    public Category(String name, String generalDescription) {
        this.name = name;
        this.generalDescription = generalDescription;
    }

    public String getName() {
        return name;
    }

    public String getGeneralDescription() {
        return generalDescription;
    }
}