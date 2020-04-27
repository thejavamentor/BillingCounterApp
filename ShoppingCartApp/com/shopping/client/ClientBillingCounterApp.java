package com.shopping.client;

import com.shopping.bill.BillingCalcVisitor;
import com.shopping.bill.PremiumCustomer;
import com.shopping.bill.RegularCustomer;
import com.shopping.bill.Visitor;

public class ClientBillingCounterApp {
    public static void main(String[] args) {
        PremiumCustomer primiumCustormers[] = {
                new PremiumCustomer(4000,"Mukesh","1000001"),
                new PremiumCustomer(8000,"Suresh","1000002"),
                new PremiumCustomer(12000,"Sharddha","1000003"),
                new PremiumCustomer(20000,"Nitin","1000004")
        };

        RegularCustomer regularCustormers[] = {
                new RegularCustomer(5000,"John","1000005"),
                new RegularCustomer(10000,"Ritesh","1000006"),
                new RegularCustomer(15000,"Sujata","1000007")
        };

        System.out.println("Premium customer discounted billings are ");
        for (PremiumCustomer customer:primiumCustormers ) {
            Visitor visitor = new BillingCalcVisitor();
            int discountedPrice = visitor.visit(customer);
            System.out.println(" customer " + customer.getCustomerName() + " got discount of "+
                    (customer.getPrice() - customer.getDiscountedPrice()) + " and final price is "
                    + customer.getDiscountedPrice());


        }

        System.out.println("Regular customer discounted billings are ");
        for (RegularCustomer customer:regularCustormers ) {
            Visitor visitor = new BillingCalcVisitor();
            int discountedPrice = visitor.visit(customer);
            System.out.println(" customer " + customer.getCustomerName() + " got discount of "+
                    (customer.getPrice() - customer.getDiscountedPrice()) + " and final price is "
                    + customer.getDiscountedPrice());


        }
    }
}
