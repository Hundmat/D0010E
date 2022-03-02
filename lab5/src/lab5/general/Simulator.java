package lab5.general;


public class Simulator {
	private State state;
	private View view;
	
	public void Simulator(State state,View view) {
		this.state=state;
		this.view=view;
	}
	public void run() {
		while(state.simState()) {
			
		}
	}
}
