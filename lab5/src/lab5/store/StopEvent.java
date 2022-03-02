package lab5.store;

import lab5.general.Event;
import lab5.general.State;
import lab5.general.View;

public class StopEvent{
	
	private State state;
	private View view;
	
	public void StopEvent(State state, View view){
		this.state=state;
		this.view=view;
		
	}
	
	public void doMe(){
		state.setSimOff();
    }
	
	public String getString(){
		return "Stop";
	}
}
