public class Order {
    private Customer customer;
    private MenuItem item1;
    private MenuItem item2;
    private MenuItem item3;
    private int itemCount;
    private String OrderID;

    public Order(String OrderID, Customer customer) {
        this.OrderID = OrderID;
        this.customer = customer;
    }

    public Order(Customer customer, MenuItem item1, MenuItem item2, MenuItem item3, int itemCount, String OrderID) {
        this.customer = customer;
        this.item1 = item1;
        this.item2 = item2;
        this.item3 = item3;
        this.itemCount = 0;
        this.OrderID = OrderID;
    }

    public boolean addItem(MenuItem item) {
        if (itemCount >= 3) {
            System.out.println("Order is full. Cannot add" + item.getDescription());
            return false;
        } if (item1 == null) {
            item1 = item;
        } else if (item2 == null) {
            item2 = item;
        } else if (item3 == null) {
            item3 = item;
        }
        itemCount++;
        return true;
    }

    public double computeSubtotal() {
        double subtotal = 0.0;
        if (item1 != null)
            subtotal += item1.computePrice();
        if (item2 != null)
            subtotal += item2.computePrice();
        if (item3 != null)
            subtotal += item3.computePrice();
        return subtotal;
    }

    public double computeTotal() {
        double subtotal = computeSubtotal();
        double total = subtotal;
        if (customer != null && customer.isStudent()) {
            total -= subtotal * 0.10;
        }
        return Math.max(total, 0.0);
    }

    public double computeTotal(double voucher) {
        double subtotal = computeSubtotal();
        double total = subtotal - voucher;
        return Math.max(total, 0.0);
    }

    public void printReceipt() {
        System.out.println("Order #" + OrderID + " - " + customer.getName() + (customer.isStudent() ? " (Student)" : ""));

        if (item1 != null) {
            System.out.println(item1.getDescription() + " .......................... " + item1.computePrice());
        }
        if (item2 != null) {
            System.out.println(item2.getDescription() + " .......................... " + item2.computePrice());
        }
        if (item3 != null) {
            System.out.println(item3.getDescription() + " ... " + item3.computePrice());
        }

        addItem(new Pastry(" Cookie", 25.0, "P-02", false));

        double subtotal = computeSubtotal();
        System.out.println(" Subtotal: " + subtotal);

        if (customer.isStudent()) {
            double discount = subtotal * 0.10;
            System.out.println(" Student discount (10%): -" + discount);
            System.out.println(" TOTAL: " + (subtotal - discount));
            customer.addPoints(subtotal - discount);
        }
        System.out.println(" Loyalty points: " + customer.getLoyaltyPoints());
        System.out.println();
    }

    public void printReceipt(double voucher) {
        System.out.println("Order #" + OrderID + " - " + customer.getName());

        if (item1 != null) {
            System.out.println(item1.getDescription() + " ......................... " + item1.computePrice());
        }
        if (item2 != null) {
            System.out.println(item2.getDescription() + " ... " + item2.computePrice());
        }
        if (item3 != null) {
            System.out.println(item3.getDescription() + " ...... " + item3.computePrice());
        }

        double subtotal = computeSubtotal();
        System.out.println(" Subtotal: " + subtotal);
        System.out.println(" Voucher: -" + voucher);
        System.out.println(" TOTAL: " + computeTotal(voucher));

        customer.addPoints(computeTotal(voucher));
        System.out.println(" Loyalty points: " + customer.getLoyaltyPoints());
        System.out.println();
    }
}