package com.bridgelabz;

import java.util.Scanner;

public class Application {

    public static void createSystemMenu() {
        int i = 0;
        while (i == 0) {
            FoodStore foodStore = FoodStore.getInstance();
            System.out.println("enter your choice");
            System.out.println("1. Add food item");
            System.out.println("2. print main course items");
            System.out.println("3. print starter items");
            System.out.println("4. print juice items");
            System.out.println("5. prepare food");
            System.out.println("6. delete food");
            System.out.println("7. print all items");
            System.out.println("8. place the order");
            System.out.println("9. exit");
            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    Application application = new Application();
                    application.addFoodItem();
                    break;
                case 2:
                    foodStore.printMainCourseItems();
                    break;
                case 3:
                    foodStore.printStarterItems();
                    break;
                case 4:
                    foodStore.printJuiceItems();
                    break;
                case 5:
                    foodStore.printPrepareItem();
                    break;
                case 6:
                    foodStore.printDeleteItem();
                    break;
                case 7:
                    foodStore.printAllItems();
                    break;
                case 8:
                    OrderManager orderManager = new OrderManager();
                    orderManager.placeOrder();
                case 9:
                    i = 1;
                    break;
            }
        }
    }

    private static void addFoodItem() {
        FoodStore foodStore = FoodStore.getInstance();
        FoodItems items = new FoodItems();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the foodName");
        String foodName = sc.nextLine();
        items.setFoodName(foodName);
        System.out.println("Enter the Price");
        int foodPrice = sc.nextInt();
        items.setPrice(foodPrice);
        foodTypeOption(items);
        foodTasteOption(items);
        foodCatagoryOption(items);
        System.out.println("ADDED FOOD ITEM");
        foodStore.foodItemsList.add(items);
    }

    public static void foodTypeOption(FoodItems items) {
        FoodStore foodStore = FoodStore.getInstance();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter FoodType");
        System.out.println("1.Veg");
        System.out.println("2.NonVeg");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                items.setFoodType(FoodType.VEG);
                break;
            case 2:
                items.setFoodType(FoodType.NONVEG);
                break;
        }
    }

    public static void foodTasteOption(FoodItems items) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Taste");
        System.out.println("1.SWEET");
        System.out.println("2.LESS_SPICY");
        System.out.println("3.HIGH_SPICY");
        System.out.println("4.SALTY");
        int tasteChoice = sc.nextInt();
        switch (tasteChoice) {
                case 1:
                    items.setTaste(Taste.SWEET);
                break;
                case 2:
                    items.setTaste(Taste.LESS_SPICY);
                    break;
                case 3:
                    items.setTaste(Taste.HIGH_SPICY);
                    break;
                case 4:
                    items.setTaste(Taste.SALTY);
                    break;
            }
    }

        private static void foodCatagoryOption(FoodItems items) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the Food Catagory");
            System.out.println("1.STARTER");
            System.out.println("2.MAIN_COURSE");
            System.out.println("3.JUICE");
            System.out.println("4.ICE_CREAM");
            int foodCatagoryChoice = sc.nextInt();
            switch (foodCatagoryChoice) {
                case 1:
                    items.setFoodCategories(FoodCategories.STARTER);
                    break;
                case 2:
                    items.setFoodCategories(FoodCategories.MAIN_COURSE);
                    break;
            }
        }

    public static void main(String[] args) {

        System.out.println("Welcome to food delivery system");
        createSystemMenu();
    }
}