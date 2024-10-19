package ex3;

public class Discount implements ICloneable {
    private String description;
    private double percentage;

    public Discount(String description, double percentage) {
        this.description = description;
        this.percentage = percentage;
    }

    public String getDescription() {
        return description;
    }

    public double getPercentage() {
        return percentage;
    }

    @Override
    public Object clone() {
        return new Discount(description, percentage);
    }

    @Override
    public String toString() {
        return "Discount{description='" + description + "', percentage=" + percentage + "}";
    }
}
