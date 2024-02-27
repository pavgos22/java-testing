package com.spring.hibernate.invoice.dao;

import com.spring.hibernate.invoice.Invoice;
import com.spring.hibernate.invoice.Item;
import com.spring.hibernate.invoice.Product;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;



@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    private InvoiceDao invoiceDao;

    @Test
    void testInvoiceDaoSave() {
        List<Item> itemList = new ArrayList<>();
        Product product1 = new Product("product 1");
        Product product2 = new Product("product 2");

        Item item1 = new Item("Item1", BigDecimal.valueOf(4), 100, BigDecimal.valueOf(2));
        Item item2 = new Item("Item2", BigDecimal.valueOf(3), 200, BigDecimal.valueOf(1.5));

        item1.setProduct(product1);
        item2.setProduct(product2);

        itemList.add(item1);
        itemList.add(item2);

        Invoice invoice1 = new Invoice("ABCDEF", itemList);

        invoiceDao.save(invoice1);

        //invoiceDao.deleteById(invoice1.getId());
    }
}
