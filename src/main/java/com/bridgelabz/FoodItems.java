package com.bridgelabz;

enum Taste{
    SWEET, SPICY, LITTLE_SPICY, SALTY;
}

enum FoodCategories{
    STARTER, DRINK, MAIN_COURSE;
}

public class FoodItems
{
    private String foodName;
    private Integer price;
    private  Taste taste;
    private FoodCategories foodCategories;

    public Taste getTaste() {
        return taste;
    }

    public void setTaste(Taste taste) {
        this.taste = taste;
    }

    public void setFoodName(String foodName){
        this.foodName = foodName;
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
                ", foodCategories=" + foodCategories +
                '}';
    }
}
