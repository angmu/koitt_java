
public class Area {
	int horiz;
	int vert;
	int height;
	
	int square() {
		return horiz*horiz;
	}
	
	
	int rect() {
		return horiz*vert;
	}
	
	double rhom() {
		return 0.5*4*horiz*height;
	}
	
	
}
