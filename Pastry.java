public class Pastry extends MenuItem {
    private boolean Warmed;

    public Pastry() {
        super();
        this.Warmed = false;
    }

    public Pastry(String name, double Baseprice, String ItemCode, boolean Warmed) {
        super(name, Baseprice, ItemCode);
        setWarmed(Warmed);
    }

    @Override
    public double computePrice() {
        double finalPrice = Baseprice;
        if (Warmed) {
            finalPrice += 10;
        }
        return finalPrice;
    }

    @Override
    public String getDescription() {
        if (Warmed) {
            return super.getDescription() + " (Warmed)";
        } else {
            return super.getDescription();
        }
    }

    public boolean isWarmed() {
        return Warmed;
    }

    public void setWarmed(boolean Warmed) {
        this.Warmed = Warmed;
    }
}