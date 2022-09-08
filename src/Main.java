import java.util.Scanner;

public class Main {
    Scanner scanner = new Scanner(System.in);
    Hamburger normalHamburger = new Hamburger("Round bread", "beef", 7);
    HealthyBurger healthyBurger = new HealthyBurger("chicken", 6);
    DeluxeBurger deluxeBurger = new DeluxeBurger("round bread", "beef", 14);
    public static void main(String[] args) {
        Main main = new Main();
        main.displayAction();

    }

    public void displayAction() {
        System.out.println("Please choose your favorite burger: Normal, Healthy Burger, Deluxe Burger");
        switch (scanner.nextLine().toLowerCase()) {
            case "normal":
                System.out.println("Making you a " + normalHamburger.getClass().getSimpleName());
                cookBurger(normalHamburger);
                break;
            case "healthy burger":
                System.out.println("Making you a " + healthyBurger.getClass().getSimpleName());
                cookBurger(healthyBurger);
                break;
            case "deluxe burger":
                System.out.println("Making you a " + deluxeBurger.getClass().getSimpleName());
                cookBurger(deluxeBurger);
                break;
        }
    }

    public void cookBurger(Hamburger hamburger) {
        System.out.println("Would you like to add something else? type: tomato, lettuce, cheese, cucumber, sous, carrot, and 0 for no additions.");
        String input = scanner.nextLine();
        if(input.equalsIgnoreCase("0")) {
            if(hamburger.getClass().getSimpleName().equalsIgnoreCase(deluxeBurger.getClass().getSimpleName())) {
                hamburger.additions(input);
            } else {
                System.out.println("Your burger is ready. Total price is $" + hamburger.getPrice());
            }
        } else {
            hamburger.additions(input);
            cookBurger(hamburger);
        }
    }
}
