package cn.program.gaohank.javase.design.design_13_chainofresponsibility.program;

public class QA implements Chain {

	private Chain nextChain = null;
	private String responsibility = "Test";
	
	@Override
	public void addChain(Chain c) {
		nextChain = c;
	}

	@Override
	public void sendToChain(String mesg) {
		if (mesg.equals(responsibility)) {
			System.out.println("QA ----> Test");
		} else {
			if (nextChain != null) {
				nextChain.sendToChain(mesg);
			}
		}
	}

	@Override
	public Chain getChain() {
		return nextChain;
	}

}
