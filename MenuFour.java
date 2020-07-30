/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author johnnyjiang
 */
public class MenuFour {
    
    private String food;
    private double sizeOne;
    private double sizeTwo;
    private double sizeThree;
    private double sizeFour;
    
    public String getFoodName(){
        return food;
    }
    
    public double getSizeOne(){
        return sizeOne;
    }
    
    public double getSizeTwo(){
        return sizeTwo;
    }
    
    public double getSizeThree(){
        return sizeThree;
    }
    
    public double getSizeFour() {
        return sizeFour;
    }
    
    public String toString(){
        return String.format("%s\t %d\t %d%\t %d\t %d\n",
                getFoodName(), getSizeOne(), getSizeTwo(), getSizeThree(), getSizeFour());
    }

    public MenuFour(String food, double sizeOne, double sizeTwo, double sizeThree, double sizeFour) {
        this.food = food;
        this.sizeOne = sizeOne;
        this.sizeTwo = sizeTwo;
        this.sizeThree = sizeThree;
        this.sizeFour = sizeFour;
    }
}
