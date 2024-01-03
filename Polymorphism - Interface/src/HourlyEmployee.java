public class HourlyEmployee extends Employee {
    private double wage;
    private double hours;
    public HourlyEmployee(String ad, String soyad, String sosyalGüvenlikNumarasi, double wage, double hours) {
        super(ad, soyad, sosyalGüvenlikNumarasi);

        if (wage >= 0 && hours >= 0 && hours < 168) {
            this.wage = wage;
            this.hours = hours;
        } else {
            throw new IllegalArgumentException("Ücret 0'dan büyük, çalışma saati 0'dan büyük ve 168'den küçük olmalıdır.");
        }
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        if (wage >= 0) {
            this.wage = wage;
        } else {
            throw new IllegalArgumentException("Ücret 0'dan büyük olmalıdır.");
        }
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        if (hours >= 0 && hours < 168) {
            this.hours = hours;
        } else {
            throw new IllegalArgumentException("Çalışma saati 0'dan büyük ve 168'den küçük olmalıdır.");
        }
    }

    public double getPaymentAmount() {
        return wage * hours;
    }

    public String toString() {
        return super.toString() + String.format("\nSaatlik Ücret: %.2f\nHaftalık Çalışma Saati: %.2f", wage, hours);
    }
}
