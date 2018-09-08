package com.abirami.fp4j.module1.original;

public class FixedCosts extends PolynomialQuantity {

    public FixedCosts(double constant) {
        super(new double[] {constant} );
    }

    @Override
    public String getName() {
        return "Fixed Costs";
    }
}
