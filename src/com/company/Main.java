package com.company;

import com.company.inheritance.*;
import com.company.composition.*;

public class Main {

    public static void main(String[] args) {
        Target target = new Adapter();
        target.foo();

        TargetComp targetComp = new AdapterComp();
        targetComp.foo();

    }
}
