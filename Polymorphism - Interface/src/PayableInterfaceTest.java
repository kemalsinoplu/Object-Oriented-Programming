public class PayableInterfaceTest {
    public static void main(String[] args) {
        Payable payableObjects[] = new Payable[6];
        payableObjects[0] = new Invoice("123", "Ürün A", 2, 25.0);
        payableObjects[1] = new Invoice("456", "Ürün B", 3, 15.5);
        payableObjects[2] = new SalariedEmployee("Kemal", "Sinoplu", "231-80-5083", 1000.0);
        payableObjects[3] = new HourlyEmployee("Kemal", "Sinoplu", "231-80-5083", 20.0, 40.0);
        payableObjects[4] = new CommissionEmployee("Kemal", "Sinoplu", "231-80-5083", 5000.0, 0.1);
        payableObjects[5] = new BasePlusCommissionEmployee("Kemal", "Sinoplu", "231-80-5083", 7000.0, 0.08, 1500.0);
        for (Payable payable : payableObjects) {
            System.out.printf("Ödeme Miktarý: %.2f\n", payable.getPaymentAmount());
        }
    }
}
