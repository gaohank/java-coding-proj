package cn.program.gaohank.javase.design.design_06_adapter;

public class Client {
	public static void main(String[] args) {
        Target target = new Adapter(new Adaptee());
        target.adapteeMethod();
        
        target.adapterMethod();
    }
}
