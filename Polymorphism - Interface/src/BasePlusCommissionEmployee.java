public class BasePlusCommissionEmployee extends CommissionEmployee {
    private double baseSalary;
    
    public BasePlusCommissionEmployee(String ad, String soyad, String sosyalG�venlikNumarasi, double grossSales, double commissionRate, double baseSalary) {
        super(ad, soyad, sosyalG�venlikNumarasi, grossSales, commissionRate);

        if (baseSalary >= 0) {
            this.baseSalary = baseSalary;
        } else {
            throw new IllegalArgumentException("Taban maa� 0'dan b�y�k olmal�d�r.");
        }
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        if (baseSalary >= 0) {
            this.baseSalary = baseSalary;
        } else {
            throw new IllegalArgumentException("Taban maa� 0'dan b�y�k olmal�d�r.");
        }
    }
    
    public double getPaymentAmount() {
        return super.getPaymentAmount() + baseSalary;
    }

    public String toString() {
        return super.toString() + String.format("\nTaban Maa�: %.2f", baseSalary);
    }
}