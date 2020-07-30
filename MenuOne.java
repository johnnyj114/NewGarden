/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author johnnyjiang
 */
public class MenuOne {
    
    private String food;
    private double sizeOne;
    
    public String getFoodName(){
        return food;
    }
    
    public double getSizeOne(){
        return sizeOne;
    }
    
    public String toString(){
        return String.format("%s\t %d\n",
                getFoodName(), getSizeOne());
    }

    public MenuOne(String food, double sizeOne) {
        this.food = food;
        this.sizeOne = sizeOne;
    }
}
