package com.design.pattern.solidPrinciples;

public class OpenClosed {

    /**
     *
     * Open for extention Closed for modification
     */

    public static void main(String[] args) {
        Marker marker = new Marker("Marker 1","Red", 20.0, 2021);
        Invoice invoice = new Invoice(marker,10);
        System.out.println("invoice Amount: " +invoice.calculateTotalPrice());

        InvoiceDao2 sqldao = new MySqlInvoiceDao();
        sqldao.SaveInvoice(invoice);
        InvoiceDao2 filedao = new FileInvoiceDao();
        filedao.SaveInvoice(invoice);

    }
}


// Good Code Example
interface InvoiceDao2 {
    public void SaveInvoice(Invoice invoice);
}

class MySqlInvoiceDao implements InvoiceDao2 {




    @Override
    public void SaveInvoice(Invoice invoice) {
        System.out.println("MySqlInvoiceDao: "+invoice.toString());
    }
}

class FileInvoiceDao implements InvoiceDao2{

    @Override
    public void SaveInvoice(Invoice invoice) {
        System.out.println( " FileInvoiceDao: "+invoice.toString());
    }
}


// Bad Code Example
//class InvoiceDao2{
//    private Invoice invoice;
//    public InvoiceDao2(Invoice invoice) {
//        this.invoice = invoice;
//    }
//    public void saveInvoice(){
//        // save to database
//        System.out.println( "Invoice Saved IN DB: ");
//    }
//}
