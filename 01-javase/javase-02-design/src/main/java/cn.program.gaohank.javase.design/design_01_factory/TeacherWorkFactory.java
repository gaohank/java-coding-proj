package cn.program.gaohank.javase.design.design_01_factory;

public class TeacherWorkFactory implements IWorkFactory {

	@Override
	public Work getWork() {
		return new TeacherWork();
	}

}
