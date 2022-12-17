package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    private int cheesePrice;
    private int toppingsPrice;

    private int takeAwayPrice;
    boolean isToppingsAdded;
    boolean isCheeseAdded;
    boolean isTakeAwayAdded;
    boolean isBillGenerated;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;

        if(isVeg){
            this.price = 300;
            this.toppingsPrice = 70;
        }
        else{
            this.price = 400;
            this.toppingsPrice = 120;
        }
        //Extra cheese & TakeAway Charges
        this.cheesePrice = 80;
        this.takeAwayPrice = 20;

        this.isTakeAwayAdded = false;
        this.isCheeseAdded = false;
        this.isToppingsAdded = false;
        this.isBillGenerated = false;

        this.bill = "Base price of the pizza: "+this.price +"\n";
    }

    public int getPrice(){
        return this.price;
    }


    public void addExtraCheese(){
        // your code goes here
        if(isCheeseAdded == false){
            this.price = this.price + this.cheesePrice;
            isCheeseAdded = true;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(isToppingsAdded == false){
            if (isVeg){
                this.price = this.price + this.toppingsPrice;
            }
            else{
                this.price = this.price + this.toppingsPrice;
            }
            isToppingsAdded = true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if (isTakeAwayAdded == false){
            this.price = this.price + this.takeAwayPrice;
            isTakeAwayAdded = true;
        }
    }

    public String getBill(){
        // your code goes here
        if(isBillGenerated == false){

            if(isCheeseAdded == true){
                this.bill = this.bill + "Extra Cheese added: "+this.cheesePrice + "\n";
            }
            if(isToppingsAdded == true){
                this.bill = this.bill + "Extra Toppings Added: "+this.toppingsPrice + "\n";
            }
            if(isTakeAwayAdded == true){
                this.bill = this.bill + "Paper bag Added: "+this.takeAwayPrice + "\n";
            }

            this.bill = this.bill + "Total price: "+this.price + "\n";

            isBillGenerated = true;
        }
        return this.bill;
    }
}
