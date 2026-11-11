public class CafeApp {

    public static void main(String[] args) {
        Customer Rench = new Customer("Rench Pelomino", true);
        Customer Justine = new Customer("Justine Bacasmas", false);

        Beverage cokeFloat = new Beverage(" Coke Float", 95.0, "B-01", "L");
        Pastry ensaymada = new Pastry(" Ensaymada", 45.0, "P-01", true);
        Meal adobo = new Meal(" Chicken Adobo w/ rice", 110.0, "M-01", true, 1);
        Pastry extraCookie = new Pastry(" Cookie", 25.0, "P-02", false);

        Order order1 = new Order("1001", Rench);
        order1.addItem(cokeFloat);
        order1.addItem(ensaymada);
        order1.addItem(adobo);

        order1.printReceipt();

        Beverage testBeverage = new Beverage();
        testBeverage.setBaseprice(-5);
        testBeverage.setBaseprice(80.0);

        Beverage MilkTea = new Beverage();
        MilkTea.setName(" Milk Tea");
        MilkTea.setItemCode("B-02");
        MilkTea.setBaseprice(80.0);
        MilkTea.setSize("M");

        Meal TinulangManok = new Meal(" Tinulang Manok", 130.0, "M-02", false, 0);

        Order order2 = new Order("1002", Justine);
        order2.addItem(MilkTea);
        order2.addItem(TinulangManok );

        order2.printReceipt(20.0);
    }
}