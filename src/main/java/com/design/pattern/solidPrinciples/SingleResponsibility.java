package com.design.pattern.solidPrinciples;

public class SingleResponsibility {


    /***
     * A class has the single responsibility
     * it should be only for 1 reason to change
     */


    public static void main(String[] args) {
        // calculate Invoice amount
        Marker marker = new Marker("Marker 1","Red", 20.0, 2021);
        Invoice invoice = new Invoice(marker,10);
        System.out.println("invoice Amount: " +invoice.calculateTotalPrice());

        // Saved the invoice
        InvoiceDao dao = new InvoiceDao(invoice);
        dao.saveInvoice();
        // print invoice
        InvoicePrinter printer = new InvoicePrinter(invoice);
        printer.printInvoice();


    }




}
class Marker {
    String name;
    String color;
    Double price;
    int year;
    public Marker(String name, String color, Double price, int year) {
        this.name = name;
        this.color = color;
        this.price = price;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Marker{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", year=" + year +
                '}';
    }
}

class Invoice {
    private  Marker marker;
    private  int quantity;

    public Invoice(Marker marker, int quantity) {
        this.marker = marker;
        this.quantity = quantity;
    }

    public double calculateTotalPrice() {
        System.out.println( "Calculating total price ");
        return marker.price * quantity;
    }

    @Override
    public String toString() {
        return "Invoice{" +
                "marker=" + marker +
                ", quantity=" + quantity +
                '}';
    }
}
class InvoiceDao{
    private Invoice invoice;
    public InvoiceDao(Invoice invoice) {
        this.invoice = invoice;
    }
    public void saveInvoice(){
        // save to database
        System.out.println( "Invoice Saved IN DB: ");
    }
}
class InvoicePrinter {

    private Invoice invoice;
    public InvoicePrinter(Invoice invoice) {
        this.invoice = invoice;
    }

    public void printInvoice() {
        System.out.println("InvoicePrinter print");
    }
}
