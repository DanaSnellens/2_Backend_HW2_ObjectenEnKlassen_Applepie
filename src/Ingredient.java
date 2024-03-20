public class Ingredient {
    private float amount;
    private String unit;
    private String name;

    public Ingredient() {
    }

    @Override
    public String toString() {
        return " - " + amount + " " + unit + " " + name;
    }

    public Ingredient(float amount, String unit, String name) {
        this.amount = amount;
        this.unit = unit;
        this.name = name;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
