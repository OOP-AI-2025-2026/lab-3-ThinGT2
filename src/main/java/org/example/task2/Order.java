package org.example.task2;

public class Order {

    public long id;
    public String customer;

    public Order(long id, String customer) {
        this.id = id;
        this.customer = customer;
    }

    public String formOrderBill(Cart cart) {

        StringBuilder builder = new StringBuilder();
        builder.append("Order number ").append(this.id)
            .append(" for customer ").append(this.customer)
            .append("\n------------------\n");

        double total = 0;

        for (int i = 0; i < cart.getSize(); i++) {

            Item item = cart.getItem(i);

            builder.append("Item id: ").append(item.getId());
                    .append(" name: ").append(item.getName())
                    .append(" price: ").append(item.getPrice())
                    .append("\n");
        }

        builder.append("------------------\n");
        builder.append("Total sum: ").append(total);


        return builder.toString();
    }
}
