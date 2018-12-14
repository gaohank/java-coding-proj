package cn.program.gaohank.javase.design.design_19_observer;

public class ConcreteSubject extends Subject {
	private int state;
	
	public int getState() {
		return state;
	}
	
	public void setState(int state) {
		this.state = state;
		this.notifyAllObservers();
	}
}
