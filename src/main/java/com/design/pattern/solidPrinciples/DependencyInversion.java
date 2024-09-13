package com.design.pattern.solidPrinciples;

public class DependencyInversion {
    /**
     * Depdency inversion principle
     *
     * Class should depend of interface rather than concrete class
     **/
    public static void main(String[] args) {

    }
}
// Bad Code Example
interface Keyword {

}
interface Mouse {

}
class WiredKeyword implements Keyword{

}
class WiredMouse implements Mouse{

}

class MackBook {

    private final WiredKeyword  wiredKeyword;
    private final WiredMouse wiredMouse;

    public MackBook(){
        wiredKeyword = new WiredKeyword();
        wiredMouse = new WiredMouse();
    }
}

// Good code Example

class MackBook2 {
    private final Keyword keyword;
    private final Mouse mouse;

    public  MackBook2(Keyword keyword, Mouse mouse) {
        this.keyword = keyword;
        this.mouse = mouse;
    }
}