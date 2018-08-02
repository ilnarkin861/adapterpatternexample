package com.company.inheritance;

public class Adapter extends Adaptee implements Target {
    @Override
    public void foo() {
        bar();
    }
}
