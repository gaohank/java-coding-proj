package cn.program.gaohank.javase.design.design_02_abstract_factory;

/*
 * 
 * ConcreteFactory
 * 实现创建具体产品对象的操作
 * 
 */
public class WhiteAnimalFactory implements IAnimalFactory {

	@Override
	public ICat createCat() {
		return new WhiteCat();
	}

	@Override
	public IDog CreateDog() {
		return new WhiteDog();
	}

}
