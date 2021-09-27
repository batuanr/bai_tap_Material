import java.time.LocalDate;

public class CrispyFlour extends Material implements Discount{
    private double quantity;

    public CrispyFlour() {
    }

    public CrispyFlour(String id, String name, LocalDate manufacturingDate, int cost, double quantity) {
        super(id, name, manufacturingDate, cost);
        this.quantity = quantity;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    @Override
    public double getAmount() {
        return quantity*getCost();
    }

    @Override
    public LocalDate getExpiryDate() {
        return getManufacturingDate().plusYears(1);
    }

    @Override
    public double getRealMoney() {
        LocalDate now = LocalDate.now();
        double a = (getAmount() - getAmount()*5/100);
        if (getExpiryDate().equals(now.plusMonths(2)) ||
        getExpiryDate().isBefore(now.plusMonths(2))) {
            return a*60/100;
        }
        else {
            if (getExpiryDate().equals(now.plusMonths(4)) ||
                    getExpiryDate().isBefore(now.plusMonths(4))){
                return a*80/100;
            }
            return a;
        }

    }

    @Override
    public String toString() {
        return "CrispyFlour{" +
                super.toString() +
                " price: " +getRealMoney()+
                "quantity=" + quantity +
                '}';
    }
}
