package com.company.composition;

public class AdapterComp implements TargetComp {

    private AdapteeComp adapteeComp;

    public AdapterComp() {
        adapteeComp = new AdapteeComp();
    }

    @Override
    public void foo() {
        adapteeComp.bar();
    }
}
