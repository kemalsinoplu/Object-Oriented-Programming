public class HourlyEmployee extends Employee {
    private double wage;
    private double hours;
    public HourlyEmployee(String ad, String soyad, String sosyalG�venlikNumarasi, double wage, double hours) {
        super(ad, soyad, sosyalG�venlikNumarasi);

        if (wage >= 0 && hours >= 0 && hours < 168) {
            this.wage = wage;
            this.hours = hours;
        } else {
            throw new IllegalArgumentException("�cret 0'dan b�y�k, �al��ma saati 0'dan b�y�k ve 168'den k���k olmal�d�r.");
        }
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        if (wage >= 0) {
            this.wage = wage;
        } else {
            throw new IllegalArgumentException("�cret 0'dan b�y�k olmal�d�r.");
        }
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        if (hours >= 0 && hours < 168) {
            this.hours = hours;
        } else {
            throw new IllegalArgumentException("�al��ma saati 0'dan b�y�k ve 168'den k���k olmal�d�r.");
        }
    }

    public double getPaymentAmount() {
        return wage * hours;
    }

    public String toString() {
        return super.toString() + String.format("\nSaatlik �cret: %.2f\nHaftal�k �al��ma Saati: %.2f", wage, hours);
    }
}
