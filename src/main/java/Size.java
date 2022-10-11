//Class done

public enum Size {

    S("Size small"), M("Size medium"), L("Size large"), X("Size extra large");

    private final String description;

    Size(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Description of size: " + description + '\'' +
                '}';
    }

    public String getDescription() {
        return description;
    }
}
