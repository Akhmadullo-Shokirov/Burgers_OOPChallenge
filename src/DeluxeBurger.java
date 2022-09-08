public class DeluxeBurger extends Hamburger {

    public DeluxeBurger(String breadRollType, String meat, int price) {
        super(breadRollType, meat, price);
    }

    @Override
    public void additions(String addition) {
        String input = addition;
        if(input.equalsIgnoreCase("0")) {
            System.out.println("Your burger is ready with chips and drinks. Total price is $" + this.getPrice());
        } else {
            System.out.println("You cannot add " + addition + " to this burger");
        }
    }
}
