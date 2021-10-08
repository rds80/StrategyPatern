public class MallardDuck extends  Duck {
    public MallardDuck() {
        _quackBehavior = new Quack();
        _flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("I'm a real Mallard duck!");
    }


}