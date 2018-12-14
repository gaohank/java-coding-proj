package cn.program.gaohank.javase.design.design_01_factory;

public class StudentWorkFactory implements IWorkFactory {

	@Override
	public Work getWork() {
		return new StudentWork();
	}

}
