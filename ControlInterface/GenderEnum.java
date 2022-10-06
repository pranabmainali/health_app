package ControlInterface;

public enum GenderEnum {
    MALE("Male"),
    FEMALE("Female");

    public final String label;

    private GenderEnum(String label) {
        this.label = label;
    }
}
