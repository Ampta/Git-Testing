package com.ampta.teamgit;

import com.ampta.teamgit.entity.Order;
import com.ampta.teamgit.entity.Product;

public class Demo {
    public static void main(String[] args) {
        Order order = new Order();
        order.setId(1);
        order.setName("PRO");
        order.setPrice(200.22);

        System.out.println(order.toString());

        Product product = new Product();

        product.setId(1L);
        product.setName("slkdfj");
        product.setPrice(23);

        System.out.println(product.toString());

        System.out.println("Working");
    }
}
