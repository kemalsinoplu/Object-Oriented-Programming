public class BasePlusCommissionEmployee extends CommissionEmployee {
    private double baseSalary;
    
    public BasePlusCommissionEmployee(String ad, String soyad, String sosyalGüvenlikNumarasi, double grossSales, double commissionRate, double baseSalary) {
        super(ad, soyad, sosyalGüvenlikNumarasi, grossSales, commissionRate);

        if (baseSalary >= 0) {
            this.baseSalary = baseSalary;
        } else {
            throw new IllegalArgumentException("Taban maaþ 0'dan büyük olmalýdýr.");
        }
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        if (baseSalary >= 0) {
            this.baseSalary = baseSalary;
        } else {
            throw new IllegalArgumentException("Taban maaþ 0'dan büyük olmalýdýr.");
        }
    }
    
    public double getPaymentAmount() {
        return super.getPaymentAmount() + baseSalary;
    }

    public String toString() {
        return super.toString() + String.format("\nTaban Maaþ: %.2f", baseSalary);
    }
}