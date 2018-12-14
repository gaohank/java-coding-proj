package cn.program.gaohank.javase.design.design_01_factory;

public class Test {
	public static void main(String[] args) {
		IWorkFactory studentWorkFactory = new StudentWorkFactory();
		studentWorkFactory.getWork().doWork();
		
		IWorkFactory teacherWorkFactory = new TeacherWorkFactory();	
		teacherWorkFactory.getWork().doWork();
	}
}
