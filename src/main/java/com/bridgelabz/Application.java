package com.bridgelabz;

import java.util.Scanner;

public class Application
{

    public static void createSystemMenu(FoodStore foodStore) {
        System.out.println("enter your choice");
        System.out.println("1. print starters");
        System.out.println("2. print main course");
        System.out.println("3. prepare food");
        System.out.println("4. deliver food");

        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    foodStore.printStarterItems();
                    break;
                case 2:
                    foodStore.printMainCourseItems();
                    break;
                case 3:
                    foodStore.printPrepareFood();
                    break;
                case 4:
                    foodStore.printDeliverFood();
                    break;
                default:
                    break;
                }
//        System.out.println("Enter 0 to quit, Any other number to continue");
//        choice = sc.nextInt();
//        while (choice != 0){

    }

    public static void main(String[] args) {

        System.out.println("Welcome to food delivery system");
        ChickenCurry chickenCurry = new ChickenCurry();
        chickenCurry.setFoodName("Chicken Curry");
        chickenCurry.setPrice(500);
        chickenCurry.setTaste(Taste.SPICY);

        MasalaPapad masalaPapad = new MasalaPapad();
        masalaPapad.setFoodName("Masala Papad");
        masalaPapad.setPrice(50);
        masalaPapad.setTaste(Taste.SALTY);

        FishCurry fishCurry = new FishCurry();
        fishCurry.setFoodName("Fish Curry");
        fishCurry.setPrice(250);
        fishCurry.setTaste(Taste.SPICY);

        MuttonCurry muttonCurry = new MuttonCurry();
        muttonCurry.setFoodName("Mutton Curry");
        muttonCurry.setPrice(200);
        muttonCurry.setTaste(Taste.SPICY);

        FoodStore foodStore = new FoodStore();

        foodStore.prepare(masalaPapad);
        foodStore.prepare(chickenCurry);
        foodStore.prepare(fishCurry);
        foodStore.prepare(muttonCurry);

        foodStore.printFood();

        foodStore.deliver(chickenCurry);

        System.out.println("--------------Food Items After Delivery---------------");

        foodStore.printFood();

        createSystemMenu(foodStore);

    }
}
