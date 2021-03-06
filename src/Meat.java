import java.time.LocalDate;

public class Meat extends Material implements Discount{
    private double weight;

    public Meat() {
    }

    public Meat(String id, String name, LocalDate manufacturingDate, int cost, double weight) {
        super(id, name, manufacturingDate, cost);
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public double getAmount() {
        return weight*getCost();
    }

    @Override
    public LocalDate getExpiryDate() {
        return getManufacturingDate().plusDays(7);
    }

    @Override
    public double getRealMoney() {
        LocalDate now = LocalDate.now();
        double a = (getAmount() - getAmount()*10/100);
        if (getExpiryDate().equals(now.plusDays(3)) ||
                getExpiryDate().isBefore(now.plusDays(3))) {
            return a/2;
        }
        else {
            if (getExpiryDate().equals(now.plusDays(5)) ||
                    getExpiryDate().isBefore(now.plusDays(5))){
                return a*70/100;
            }
            return a;
        }
    }

    @Override
    public String toString() {
        return "Meat{" +
                super.toString() +
                " price: " +getRealMoney()+
                "weight=" + weight +
                '}';
    }
}
