public class CommissionEmployee extends Employee {
    private double grossSales;
    private double commissionRate;
    
    public CommissionEmployee(String ad, String soyad, String sosyalG�venlikNumarasi, double grossSales, double commissionRate) {
        super(ad, soyad, sosyalG�venlikNumarasi);

        if (grossSales >= 0 && commissionRate > 0 && commissionRate < 1) {
            this.grossSales = grossSales;
            this.commissionRate = commissionRate;
        } else {
            throw new IllegalArgumentException("Br�t sat�� 0'dan b�y�k, komisyon oran� 0 ile 1 aras�nda olmal�d�r.");
        }
    }

    public double getGrossSales() {
        return grossSales;
    }

    public void setGrossSales(double grossSales) {
        if (grossSales >= 0) {
            this.grossSales = grossSales;
        } else {
            throw new IllegalArgumentException("Br�t sat�� 0'dan b�y�k olmal�d�r.");
        }
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        if (commissionRate > 0 && commissionRate < 1) {
            this.commissionRate = commissionRate;
        } else {
            throw new IllegalArgumentException("Komisyon oran� 0 ile 1 aras�nda olmal�d�r.");
        }
    }

    public double getPaymentAmount() {
        return grossSales * commissionRate;
    }

    public String toString() {
        return super.toString() + String.format("\nBr�t Sat��: %.2f\nKomisyon Oran�: %.2f", grossSales, commissionRate);
    }
}
