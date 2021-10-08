public abstract  class Duck {
    IFlyBehavior _flyBehavior;
    IQuackBehavior _quackBehavior;

    public Duck() {

    }

    public  abstract  void display();

    public  void performFly() {
        _flyBehavior.fly();
    }

    public  void performQuack() {
        _quackBehavior.quack();
    }

    public  void swim() {
        System.out.println("All ducks float, even decoys!");
    }

    public void setFlyBehavior(IFlyBehavior flyBehavior) {
        _flyBehavior = flyBehavior;
    }

    public  void setQuackBehavior(IQuackBehavior quackBehavior) {
        _quackBehavior = quackBehavior;
    }
}