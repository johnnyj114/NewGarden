/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author johnnyjiang
 */
public class MenuTwo {
    
    private String food;
    private double sizeOne;
    private double sizeTwo;
    
    public String getFoodName(){
        return food;
    }
    
    public double getSizeOne(){
        return sizeOne;
    }
    
    public double getSizeTwo(){
        return sizeTwo;
    }
    
    public String toString(){
        return String.format("%s\t %d\t %d%\n",
                getFoodName(), getSizeOne(), getSizeTwo());
    }

    public MenuTwo(String food, double sizeOne, double sizeTwo) {
        this.food = food;
        this.sizeOne = sizeOne;
        this.sizeTwo = sizeTwo;
    }
}
