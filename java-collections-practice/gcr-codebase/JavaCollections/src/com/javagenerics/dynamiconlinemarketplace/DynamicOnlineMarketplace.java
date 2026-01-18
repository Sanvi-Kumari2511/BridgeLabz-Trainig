package com.javagenerics.dynamiconlinemarketplace;
import java.util.ArrayList;
import java.util.List;

public class DynamicOnlineMarketplace {
	public static void main(String[] args) {

        //Different product types
        Product<BookCategory> book =
                new Product<>("Java Book", 700, new BookCategory());

        Product<ClothingCategory> shirt =
                new Product<>("T-Shirt", 500, new ClothingCategory());

        Product<GadgetCategory> phone =
                new Product<>("Smartphone", 20000, new GadgetCategory());

        //Same catalog for all products
        List<Product<?>> catalog = new ArrayList<>();
        catalog.add(book);
        catalog.add(shirt);
        catalog.add(phone);

        //Applying discount
        DiscountUtil.applyDiscount(book, 10);
        DiscountUtil.applyDiscount(phone, 5);

        //Displaying catalog
        for (Product<?> p : catalog) {
            System.out.println(p);
        }
    }
}
