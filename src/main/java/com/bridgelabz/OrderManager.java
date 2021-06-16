package com.bridgelabz;

import com.bridgelabs.Order;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OrderManager {
    List<Order>orderList = new ArrayList<>();

    public void placeOrder() {
        Scanner sc = new Scanner(System.in);
        Order order = new Order();
        System.out.println("Enter order id : ");
        String id = sc.nextLine();
        order.setOrderId(id);
        order.setOrderStatus(Order.Status.PLACED);
        order.setPaymentStatus(Order.PaymentStatus.PAID);
        System.out.println("Enter the food name");
        String foodName = sc.nextLine();
        System.out.println("Enter the food quantity");
        int foodQuantity = sc.nextInt();
        System.out.println("Enter the customer name");
        String customerName = sc.nextLine();
        String foodname = " ";
        while (!foodName.equalsIgnoreCase("stop")) {
            System.out.println("Enter the food name : ");
            foodName = sc.nextLine();
            if (!foodName.equalsIgnoreCase("stop")) {
                System.out.println("Enter the quantity : ");
                Integer quantity = sc.nextInt();
            }
            order.getListOfFoodName(foodName, foodQuantity);
            orderList.add(order);
        }
    }
}
