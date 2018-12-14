package cn.program.gaohank.javase.design.design_09_decorator;

public class ManDecoratorB extends Decorator {
	public void eat() {
        super.eat();
        System.out.println("===============");
        System.out.println("ManDecoratorB类");
    }
}
