package cn.program.gaohank.javase.design.design_07_bridge;

public class Lady extends Person {

	public Lady() {
		setType("女人");
	}
	
	@Override
	public void dress() {
		Clothing clothing = getClothing();
        clothing.personDressCloth(this);
	}

}
