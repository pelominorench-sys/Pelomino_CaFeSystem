public class Customer {

    private String name;
    private boolean Student;
    private int LoyaltyPoints;

    public Customer() {
        this.name = "Unnamed Customer";
        this.Student = false;
        this.LoyaltyPoints = 0;
    }

    public Customer(String name) {
        this.name = name;
        this.Student = false;
        this.LoyaltyPoints = 0;
    }

    public Customer(String name, boolean Student) {
        this.name = name;
        this.Student = Student;
        this.LoyaltyPoints = LoyaltyPoints;
    }

    public void addPoints(int points) {
        if (points > 0) {
            this.LoyaltyPoints += points;
        }
    }

    public void addPoints(double AmountSpent) {
        if (AmountSpent > 0) {
            int earnedPoints = (int) (AmountSpent / 50);
            this.LoyaltyPoints += earnedPoints;
        }
    }

    public String getName() {
        return name;
    }

    public boolean isStudent() {
        return Student;
    }
    public int getLoyaltyPoints(){
        return LoyaltyPoints;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setStudent(boolean Student) {
        this.Student = Student;
    }


    public void setLoyaltyPoints(int LoyaltyPoints) {
        if (LoyaltyPoints >= 0) {
            this.LoyaltyPoints = LoyaltyPoints;
        }
    }
}