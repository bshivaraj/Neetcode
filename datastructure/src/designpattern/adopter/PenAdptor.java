package designpattern.adopter;

public class PenAdptor implements Pen{
	
	PilotPen pilotPen=new PilotPen();

	@Override
	public void write(String str) {
		pilotPen.mark(str);
	}

}
