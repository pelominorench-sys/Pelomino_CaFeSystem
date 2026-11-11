public class Meal extends MenuItem {
    private boolean Upsized;
    private int ExtraSides;

    public Meal() {
        super();
        this.Upsized = false;
        this.ExtraSides = 0;
    }

    public Meal(String name, double Baseprice, String ItemCode, boolean Upsized, int ExtraSides) {
        super(name, Baseprice, ItemCode);
        setUpsized(Upsized);
        setExtraSides(ExtraSides);
    }

    @Override
    public String getDescription() {
        String upsizeText = Upsized ? " Upsized" : " Regular size ";
        return super.getDescription() + " " + upsizeText + ",  " + ExtraSides + " side";
    }

    @Override
    public double computePrice() {
        double upsizeFee = Upsized ? 20 : 0;
        return Baseprice + upsizeFee + (12 * ExtraSides);
    }

    public boolean isUpsized() {
        return Upsized;
    }

    public int getExtraSides() {
        return ExtraSides;
    }

    public void setUpsized(boolean Upsized) {
        this.Upsized = Upsized;
    }

    public void setExtraSides(int ExtraSides) {
        if (ExtraSides >= 0) {
            this.ExtraSides = ExtraSides;
        }
    }
}