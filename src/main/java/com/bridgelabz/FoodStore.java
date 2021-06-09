package com.bridgelabz;

import java.util.ArrayList;

public class FoodStore
{
    public ArrayList<FoodItems> foodStore = new ArrayList<>();

    public void prepare(FoodItems foodItems) {
        foodStore.add(foodItems);
    }

    public void deliver(FoodItems foodItems) {
        foodStore.remove(foodItems);
    }

    public void printFood() {
        for(FoodItems foodItems : foodStore) {
            System.out.println(foodItems);
        }
    }
    public void printStarterItems() {
        for (FoodItems foodItems : foodStore)  {
            if((foodItems.getFoodCategories()) == (FoodCategories.STARTER)) {
                System.out.println("Starter items : "  + foodItems);
            }
        }
    }

    public void printMainCourseItems() {
        for (FoodItems foodItems : foodStore) {
            if ((foodItems.getFoodCategories()) == FoodCategories.MAIN_COURSE) {
                System.out.println("Main course items : " + foodItems);
            }
        }
    }

    public void printPrepareFood() {
        printMainCourseItems();
    }

    public void printDeliverFood() {
        printMainCourseItems();
    }
}
