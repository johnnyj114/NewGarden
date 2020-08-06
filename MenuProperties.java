package NewGarden;


public class MenuProperties {
    
    private final String food;
    private final double sizeOne;
    private final double sizeTwo;
    private final double sizeThree;
    private final double sizeFour;
    private final int amount;
    private final String categ;
    
    public String getName(){
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
    
    public int getAmount() {
        return amount;
    }
    
    public String getCateg() {
        return categ;
    }
    
    @Override
    public String toString(){
        return String.format("%s\t %d\t %d%\t %d\t %d\t %d\t %s\n",
                getName(), getSizeOne(), getSizeTwo(), getSizeThree(), getSizeFour(), getAmount(), getCateg());
    }

    public MenuProperties(String food, double sizeOne, double sizeTwo, double sizeThree, double sizeFour, int amount, String categ) {
        this.food = food;
        this.sizeOne = sizeOne;
        this.sizeTwo = sizeTwo;
        this.sizeThree = sizeThree;
        this.sizeFour = sizeFour;
        this.amount = amount;
        this.categ = categ;
    }
}
