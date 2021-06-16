package com.bridgelabs;

import com.bridgelabz.Customer;

import java.util.HashMap;
import java.util.Map;

public class Order {

    public enum Status {
        PLACED, DELIVERED;
    }
    public enum PaymentStatus {
        PAID, NOT_PAID;
    }
    private String orderId;
    private Status orderStatus;
    private PaymentStatus paymentStatus;
    private String totalAmount;
    private Map<String, Integer>listOfFoodName = new HashMap<>();
    private Customer customer;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public Status getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Status orderStatus) {
        this.orderStatus = orderStatus;
    }

    public PaymentStatus getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(PaymentStatus paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public String getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(String totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Map<String, Integer> getListOfFoodName(String foodName, int foodQuantity) {
        return listOfFoodName;
    }

    public void setListOfFoodName(Map<String, Integer> listOfFoodName) {
        this.listOfFoodName = listOfFoodName;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId='" + orderId + '\'' +
                ", typeStatus=" + orderStatus +
                ", paymentStatus=" + paymentStatus +
                ", totalAmount='" + totalAmount + '\'' +
                ", listOfFoodName=" + listOfFoodName +
                ", customer=" + customer +
                '}';
    }
}
