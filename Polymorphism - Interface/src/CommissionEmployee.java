public class CommissionEmployee extends Employee {
    private double grossSales;
    private double commissionRate;
    
    public CommissionEmployee(String ad, String soyad, String sosyalGüvenlikNumarasi, double grossSales, double commissionRate) {
        super(ad, soyad, sosyalGüvenlikNumarasi);

        if (grossSales >= 0 && commissionRate > 0 && commissionRate < 1) {
            this.grossSales = grossSales;
            this.commissionRate = commissionRate;
        } else {
            throw new IllegalArgumentException("Brüt satýþ 0'dan büyük, komisyon oraný 0 ile 1 arasýnda olmalýdýr.");
        }
    }

    public double getGrossSales() {
        return grossSales;
    }

    public void setGrossSales(double grossSales) {
        if (grossSales >= 0) {
            this.grossSales = grossSales;
        } else {
            throw new IllegalArgumentException("Brüt satýþ 0'dan büyük olmalýdýr.");
        }
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        if (commissionRate > 0 && commissionRate < 1) {
            this.commissionRate = commissionRate;
        } else {
            throw new IllegalArgumentException("Komisyon oraný 0 ile 1 arasýnda olmalýdýr.");
        }
    }

    public double getPaymentAmount() {
        return grossSales * commissionRate;
    }

    public String toString() {
        return super.toString() + String.format("\nBrüt Satýþ: %.2f\nKomisyon Oraný: %.2f", grossSales, commissionRate);
    }
}
