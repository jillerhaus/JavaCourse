class Burger {
    int fatness;
    public Burger() {
        this.fatness = 10;
    }
    // fields, methods
}
class HealthyBurger extends Burger {
    // fields, methods
    public HealthyBurger() {
        super();
        this.fatness = 5;
    }
}

class BurgerFactory {
    public Burger createBurger() {
        return new Burger();
    }
}

class HealthyBugerFactory extends BurgerFactory {
    @Override
    public HealthyBurger createBurger() {
        return new HealthyBurger();
    }
}