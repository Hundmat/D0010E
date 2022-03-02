package lab5.general;

public class State {
	private boolean simState =true;
	
	public static void State() {
		
	}

	public boolean simState() {
		return simState;
	}
	
	public void setSimOff() {
		this.simState=false;
	}
}
