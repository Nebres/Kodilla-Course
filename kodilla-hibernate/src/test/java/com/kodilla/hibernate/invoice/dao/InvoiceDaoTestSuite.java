package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {

    @Autowired
    private InvoiceDao invoiceDao;
    @Autowired
    private ProductDao productDao;
    @Autowired
    private ItemDao itemDao;

    @Test
    public void testInvoiceDaoSave() {
        //Given
        Product product = new Product("Tv");
        Product product1 = new Product("Hi-FI");
        Product product2 = new Product("Notebook");
        Product product3 = new Product("Camera");
        Item item = new Item(new BigDecimal("5000"), 20);
        Item item1 = new Item(new BigDecimal("2200"), 10);
        Item item2 = new Item(new BigDecimal("9000"), 15);
        Item item3 = new Item(new BigDecimal("1250"), 50);
        Item item4 = new Item(new BigDecimal("1000"), 5);
        Invoice invoice = new Invoice("12345678");
        product.getItems().add(item);
        product.getItems().add(item1);
        product.getItems().add(item2);
        product.getItems().add(item3);
        product.getItems().add(item4);
        item.setProduct(product);
        item1.setProduct(product1);
        item2.setProduct(product2);
        item3.setProduct(product3);
        item4.setProduct(product);
        item.setInvoice(invoice);
        item1.setInvoice(invoice);
        item2.setInvoice(invoice);
        item3.setInvoice(invoice);
        item4.setInvoice(invoice);
        invoice.getItems().add(item);
        invoice.getItems().add(item1);
        invoice.getItems().add(item2);
        invoice.getItems().add(item3);
        invoice.getItems().add(item4);
        invoice.getItems().add(item3);
        int unexpected = 0;
        //When
        productDao.save(product);
        productDao.save(product1);
        productDao.save(product2);
        productDao.save(product3);
        itemDao.save(item);
        itemDao.save(item1);
        itemDao.save(item2);
        itemDao.save(item3);
        itemDao.save(item4);
        invoiceDao.save(invoice);
        int actual = invoice.getId();
        //Then
        Assert.assertNotEquals(unexpected, actual);
        //CleanUp
        try {
            productDao.delete(product);
            productDao.delete(product1);
            productDao.delete(product2);
            productDao.delete(product3);
            itemDao.delete(item);
            itemDao.delete(item1);
            itemDao.delete(item2);
            itemDao.delete(item3);
            itemDao.delete(item4);
            invoiceDao.delete(invoice);
        } catch (Exception e) {
            //no action
        }
    }

}
