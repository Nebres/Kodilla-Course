package collection.sets.task2;

public class Order {

    private final String item;
    private final int orderId;

    public Order(String item, int orderId) {
        this.item = item;
        this.orderId = orderId;
    }

    public String getItem() {
        return this.item;
    }

    public int getOrderId() {
        return this.orderId;
    }

    public String toString(){
        return "Item: \"" + item + "\", order ID: " + orderId;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {return true;}
        if (obj == null) {return false;}

        if (obj instanceof Order) {
            Order otherOrder = (Order) obj;
            return item.equals(otherOrder.item) &&
                    orderId == otherOrder.orderId;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return 17*getItem().hashCode() + 31*getOrderId();
    }

}

