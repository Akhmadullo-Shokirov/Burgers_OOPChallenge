import java.util.Scanner;

public class Hamburger {

    Scanner scanner = new Scanner(System.in);

    private String breadRollType;
    private String meat;
    private int price;
    private int lettuce;
    private int tomato;
    private int cheese;
    private int carrot;

    public Hamburger(String breadRollType, String meat, int price) {
        this.breadRollType = breadRollType;
        this.meat = meat;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int addLettuce() {
        int lettucePrice = 1;
        this.setPrice(this.getPrice() + lettucePrice);
        System.out.println("Lettuce added to your burger at price " + lettucePrice + "$");
        System.out.println("Total price is $" + this.getPrice());
        return lettucePrice;
    }

    public int addTomato() {
        int tomatoPrice = 2;
        this.setPrice(this.getPrice() + tomatoPrice);
        System.out.println("Tomato added to your burger at price " + tomatoPrice + "$");
        System.out.println("Total price is $" + this.getPrice());
        return tomatoPrice;
    }

    public int addCheese() {
        int cheesePrice = 2;
        this.setPrice(this.getPrice() + cheesePrice);
        System.out.println("Cheese added to your burger at price " + cheesePrice + "$");
        System.out.println("Total price is $" + this.getPrice());
        return cheesePrice;
    }

    public int addCarrot() {
        int carrotPrice = 1;
        this.setPrice(this.getPrice() + carrotPrice);
        System.out.println("Carrot added to your burger at price " + carrotPrice + "$");
        System.out.println("Total price is $" + this.getPrice());
        return carrotPrice;
    }

    public void additions(String addition) {
        switch (addition.toLowerCase()) {
            case "lettuce":
                this.addLettuce();
                break;
            case "tomato":
                this.addTomato();
                break;
            case "cheese":
                this.addCheese();
                break;
            case "carrot":
                this.addCarrot();
                break;
            default:
                System.out.println("You cannot add " + addition + " to this burger.");
                break;
        }
    }


}
