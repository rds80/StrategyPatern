public class ModelDuck extends Duck {


    public ModelDuck() {
        _flyBehavior = new FlyNoWay();
        _quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm a model duck");
    }
}