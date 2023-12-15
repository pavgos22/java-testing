package com.functional.stream;

import com.functional.stream.beautifier.PoemBeautifier;
import com.functional.stream.beautifier.PoemDecorator;
import com.functional.stream.iterate.NumbersGenerator;
import com.functional.stream.lambda.*;
import com.functional.stream.reference.FunctionalCalculator;

import static java.lang.Character.toUpperCase;

public class StreamMain {

    public static void main(String[] args) {
        ExpressionExecutor expressionExecutor = new ExpressionExecutor();
        PoemBeautifier poemBeautifier = new PoemBeautifier();

        System.out.println("Calculating expressions with lambdas");
        expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);

        System.out.println("Calculating expressions with method references");
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subBFromA);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);

        System.out.println("Beautifying texts");
        poemBeautifier.beautify("Boat", (s) -> s.toUpperCase());
        poemBeautifier.beautify("Apple", (s) -> s.repeat(2));
        poemBeautifier.beautify("Bulb", s -> s.substring(0, 1).toUpperCase() + s.substring(1));
        poemBeautifier.beautify("Table", (s) -> "ABC" + s.concat("ABC"));

        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);
    }
}
