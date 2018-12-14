package cn.program.gaohank.javase.design.design_14_command;

public class Invoker {
	private Command command;
	
	public void setCommand(Command command) {
		this.command = command;
	}
	
	public void execute() {
		command.execute();
	}
}
