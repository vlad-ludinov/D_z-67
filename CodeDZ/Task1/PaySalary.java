package Task1;

public class PaySalary {
    
    private int baseSalary;


    public PaySalary(int baseSalary) {
        this.baseSalary = baseSalary;
    }

    public int calculateNetSalary() {
        int tax = (int) (baseSalary * 0.25);//calculate in otherway
        return baseSalary - tax;
    }
}
