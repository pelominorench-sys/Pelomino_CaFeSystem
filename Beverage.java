public class Beverage extends MenuItem {
    private String Size;

    public Beverage() {
        super();
        this.Size = "S";
    }

    public Beverage (String name, double Baseprice, String ItemCode, String Size) {
        super(name, Baseprice, ItemCode);
        setSize(Size);
    }

    @Override
    public double computePrice() {
        if (Size.equals("M")) {
            return Baseprice + 15;
        } else if (Size.equals("L")) {
            return Baseprice + 25;
        } else {
            return Baseprice;
        }
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " Size: " + Size;
    }

    public String getSize() {
        return Size;
    }

    public void setSize(String Size) {
        if (Size != null && (Size.equals("S") || Size.equals("M") || Size.equals("L"))) {
            this.Size = Size;
        }
    }
}