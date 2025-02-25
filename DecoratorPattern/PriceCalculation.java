package DecoratorPattern;

// abstract class BasePizza {
//     abstract Double price();
// }


// class Toppings extends BasePizza{
//     BasePizza pizza;
//     public Toppings(BasePizza pizza){
//         this.pizza = pizza;
//     }
//     @Override
//     Double price(){
//         return 10.0;
//     }
// }

// class MargarittaPizza extends Toppings{

//     public MargarittaPizza(Toppings pizza){
//         super(pizza);
//     }

//     @Override
//     Double price(){
//         return 15+pizza.price();
//     }
// }

// class AlphenoPizza extends Toppings{

//     public AlphenoPizza(Toppings pizza){
//         super(pizza);
//     }

//     @Override
//     Double price(){
//         return 12+pizza.price();
//     }
// }

// public class PriceCalculation {
//     public static void main(String[] args) {
//         System.out.println(new AlphenoPizza(new MargarittaPizza(new Toppings(null))).price());
//     }
// }


// Decorator design pattern is used to prevent the class explosion
// In the given use case, we can add as many toppings as we want and each time after adding the toppings creates the new object of pizza and we can't create every time 
// class- that will lead to class explosion.
// Some of examples are Base car class + Fog light + power wheels + seat covers
// Structural Design pattern


abstract class BasePizza{
    abstract Double Price();
}

class ThickCrost extends BasePizza{
    @Override
    Double Price(){
        return 15.0;
    }
}

class ThinCrost extends BasePizza{
    @Override
    Double Price(){
        return 10.0;
    }
}

class Toppings extends BasePizza{
    BasePizza pizza;
    public Toppings(BasePizza pizza){
        this.pizza = pizza;
    }

    @Override
    Double Price(){
        return pizza.Price();
    }
}

class AlphenoToppings extends Toppings{
    public AlphenoToppings(BasePizza pizza){
        super(pizza);
    }

    @Override
    Double Price(){
        return 12.0+pizza.Price();
    }
}

class ChilliToppings extends Toppings{
    public ChilliToppings(BasePizza pizza){
        super(pizza);
    }

    @Override
    Double Price(){
        return 10.0+pizza.Price();
    }
}

class PineappleToppings extends Toppings{
    public PineappleToppings(BasePizza pizza){
        super(pizza);
    }

    @Override
    Double Price(){
        return 15.0+pizza.Price();
    }
}

public class PriceCalculation{
    public static void main(String[] args){
        System.out.println(new ChilliToppings(new ThickCrost()).Price());
        System.out.println(new PineappleToppings(new ChilliToppings(new ThickCrost())).Price());
    }
}