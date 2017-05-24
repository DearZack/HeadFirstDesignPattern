package c04;

/**
 * Created by Zack on 2017/5/24.
 */
public interface PizzaIngredentFactory {
    Dough createDough();
    Sauce createSauce();
    Cheese createCheese();
    Veggies[] createVeggies();
    Pepperoni createPepperoni();
    Clams createClams();
}
