package com.bridgelabz;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class FoodStore {
    private static FoodStore instance;
    public HashSet<FoodItems> foodItemsList = new HashSet<>();

    private static FoodStore instance() {
        return instance;
    }

    static synchronized FoodStore getInstance() {
        if (instance() == null) {
            instance = new FoodStore();
        }
        return instance;
    }

    public void printPrepareItem() {
        for (FoodItems foodItem : foodItemsList) {
            System.out.println("Prepared Item : " + foodItem);
        }
    }

    public void printDeleteItem() {
        System.out.println("Enter the item should be deleted");
        Scanner sc = new Scanner(System.in);
        String choice = sc.nextLine();
        for (FoodItems foodItem : foodItemsList) {
            System.out.println(foodItem.getFoodName());
            if (choice.equals(foodItem.getFoodName())) {
                foodItemsList.remove(foodItem);
            }
        }
    }

    public void printStarterItems() {
        foodItemsList.stream().filter(s1 -> s1.getFoodCategories().equals(FoodCategories.STARTER)).forEach(System.out::println);
    }

    public void printMainCourseItems() {
        foodItemsList.stream().filter(s1 -> s1.getFoodCategories().equals(FoodCategories.MAIN_COURSE)).forEach(System.out::println);
    }

    public void printJuiceItems() {
        foodItemsList.stream().filter(s1 -> s1.getFoodCategories().equals(FoodCategories.JUICE)).forEach(System.out::println);
    }

    public void printAllItems() {
        foodItemsList.stream().forEach(System.out::println);
    }
}