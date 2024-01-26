package Week10;

class A {
    public void Output(){
    }
}

class Aa extends A {
    @Override
    public void Output() {
        System.out.println("QUESTION");
        super.Output();
    }
}

class Ab extends A {

}

class Aaa extends Aa {

}

class Aba extends Ab {
    @Override
    public void Output() {
        System.out.println("QUESTION");
        super.Output();
    }
}

class Aab extends Aa {
    @Override
    public void Output() {
        System.out.println("ANSWER");
        super.Output();
    }
}
