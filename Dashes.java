import processing.core.PApplet;

class Dashes {
	private float x;
	PApplet canvas;
	private float speed = 7;
	
	
	public Dashes(PApplet np, float nx) {
		x = (50*nx)-50;
		canvas = np;
	}
		
		
	@SuppressWarnings("static-access")
	public void display() {
		canvas.fill(255, 255, 0);
		canvas.rect(x, 345, 30, 10);
		
	}

		
	public void move() {
		x = x-speed;
		if (x<-100) {
			x = 550;
		}
	}
}