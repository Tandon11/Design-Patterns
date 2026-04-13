package org.example;

import org.example.concreteComponent.PlainCoffee;
import org.example.decorator.concrete.MilkDecorator;
import org.example.decorator.concrete.SugarDecorator;
import org.example.interfaces.Coffee;

public class DecoratorDemo {
    static void main() {
        Coffee myCoffee = new PlainCoffee();
        System.out.println("Order: " + myCoffee.getDescription());
        System.out.println("Total Cost: $" + myCoffee.getCost());

        // Wrap iot with Milk
        myCoffee = new MilkDecorator(myCoffee);

        System.out.println("Order: " + myCoffee.getDescription());
        System.out.println("Total Cost: $" + myCoffee.getCost());

        // Wrap it with Sugar
        myCoffee = new SugarDecorator(myCoffee);

        System.out.println("Order: " + myCoffee.getDescription());
        System.out.println("Total Cost: $" + myCoffee.getCost());

        Coffee specialCoffee = new PlainCoffee();
        specialCoffee = new MilkDecorator(new MilkDecorator(new SugarDecorator(specialCoffee)));
        System.out.println("Order: " + specialCoffee.getDescription());
        System.out.println("Total Cost: $" + specialCoffee.getCost());
    }
}
