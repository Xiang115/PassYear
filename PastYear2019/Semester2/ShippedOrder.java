
package pastyear_2019_2;

public class ShippedOrder extends Order {

    public ShippedOrder(String a, String b, int c, int d) {
        super(a, b, c, d);
    }

    @Override
    public double computeTotalPrice() {
        return getQuantity() * getunitPrice() + 4;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
