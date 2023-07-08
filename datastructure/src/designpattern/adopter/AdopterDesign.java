package designpattern.adopter;

public class AdopterDesign {

	public static void main(String[] args) {
       Assignment assignment=new Assignment();
       PenAdptor pilotPen=new PenAdptor();
       assignment.setPen(pilotPen);
       assignment.writeAssignment("Hello");
	}

}
