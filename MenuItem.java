public abstract class MenuItem {
    protected String name;
    protected double Baseprice;
    private String ItemCode;


    public MenuItem() {
        this.name = "Unnamed Item";
        this.Baseprice = 0.0;
        this.ItemCode = "N/A";
    }

    public MenuItem(String name, double Baseprice, String ItemCode) {
        this.name = name;
        this.Baseprice = Baseprice;
        this.ItemCode = ItemCode;
    }

    public abstract double computePrice();

    public String getDescription() {
        return name + " [" + ItemCode + "]";
    }

    public String getName() {
        return name;
    }

    public double getBaseprice() {
        return Baseprice;
    }

    public String getItemCode() {
        return ItemCode;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setItemCode(String ItemCode) {
        this.ItemCode = ItemCode;
    }

    public void setBaseprice(double Baseprice) {
        if (Baseprice < 0) {
            System.out.println("\n Error: base price cannot be negative.");
        } else {
            this.Baseprice = Baseprice;
        }
    }
}