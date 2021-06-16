package com.bridgelabz;

enum Taste {
    SWEET, HIGH_SPICY, LESS_SPICY, SALTY;
}

enum FoodCategories {
    STARTER, JUICE, MAIN_COURSE;
}

enum FoodType {
    VEG, NONVEG;
}

public class FoodItems
{
    private String foodName;
    private Integer price;
    private Taste taste;
    private FoodType foodType;
    private FoodCategories foodCategories;

    public Taste getTaste() {
        return taste;
    }

    public void setTaste(Taste taste) {
        this.taste = taste;
    }

    public FoodType getFoodType() {
        return foodType;
    }

    public void setFoodType(FoodType foodType) {
        this.foodType = foodType;
    }

    public String setFoodName(String foodName){
        this.foodName = foodName;
        return foodName;
    }
    public String getFoodName() {
        return foodName;
    }

    public void setPrice(Integer price ) {
            this.price = price;
    }

    public Integer getPrice() {
            return price;
    }

    public FoodCategories getFoodCategories() {
        return foodCategories;
    }

    public void setFoodCategories(FoodCategories foodCategories) {
        this.foodCategories = foodCategories;
    }

    @Override
    public String toString() {
        return "FoodItems{" +
                "foodName='" + foodName + '\'' +
                ", price=" + price +
                ", taste=" + taste +
                ", foodType=" + foodType +
                ", foodCategories=" + foodCategories +
                '}';
    }
}
