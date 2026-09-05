package com.sv.grupo10.tienda.model;
/**
 * Represents a sales receipt issued to a customer upon completing a purchase.
 */
public class Receipt {

    /** Unique identifier for the receipt. */
    String ID;

    /** Full name of the customer who made the purchase. */
    String customerName;

    /** The purchased product details. */
    Producto productName;

    /** Total monetary amount billed for the purchase. */
    double total;

    /**
     * Constructs a new {@code Receipt} with the specified transaction details.
     *
     * @param ID           the unique identifier for the receipt
     * @param customerName the name of the customer
     * @param product      the product being purchased
     * @param total        the total amount charged
     */
    public Receipt(String ID, String customerName, Producto product, double total) {
        this.ID = ID;
        this.customerName = customerName;
        this.productName = product;
        this.total = total;
    }


    public String getID() {
        return ID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public Producto getProductName() {
        return productName;
    }

    public double getTotal() {
        return total;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setProductName(Producto productName) {
        this.productName = productName;
    }

    public void setTotal(double total) {
        this.total = total;
    }
}
