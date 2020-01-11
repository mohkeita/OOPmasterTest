package exo.test;

public class Main {

    public static void main(String[] args) {

        Hamburger hamburger = new Hamburger("Basic", "Sauce", 3.56, "White");
        double price = hamburger.itemizeHamburger();
        hamburger.addHamburgerAddition1("Tomato", 0.27);
        hamburger.addHamburgerAddition2("Lettuce", 0.75);
        hamburger.addHamburgerAddition3("Cheese", 1.12);
        System.out.println("Total Burger price is " + hamburger.itemizeHamburger()+ "\n");


        HealthyBurger healthyBurger =  new HealthyBurger("Bacon", 5.67);
        healthyBurger.addHamburgerAddition1("Egg", 5.43);
        healthyBurger.itemizeHamburger();

    }
}
