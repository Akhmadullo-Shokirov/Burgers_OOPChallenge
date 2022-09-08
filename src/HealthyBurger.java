public class HealthyBurger extends Hamburger {

    private int cucumber;
    private int sous;

    public HealthyBurger(String meat, int price) {

        super("Brown Rye Bread", meat, price);
    }

    public int addCucumber() {
        int cucumberPrice = 2;
        this.setPrice(this.getPrice() + cucumberPrice);
        System.out.println("Cucumber added to your burger at price " + cucumberPrice + "$");
        System.out.println("Total price is $" + this.getPrice());
        return cucumber;
    }

    public int addSous() {
        int sousPrice = 2;
        this.setPrice(this.getPrice() + sousPrice);
        System.out.println("Sous added to your burger at price " + sousPrice + "$");
        System.out.println("Total price is $" + this.getPrice());
        return sous;
    }

    @Override
    public void additions(String addition) {
        super.additions(addition);
        switch (addition) {
            case "cucumber":
                this.addCucumber();
                break;
            case "sous":
                this.addSous();
                break;
        }
    }
}
