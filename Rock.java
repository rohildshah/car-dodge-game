import processing.core.PApplet;

class Rock {
	private float x;
	private float y;
	PApplet canvas;
	private float speed = 7;
	
	
	public Rock(PApplet np, float nx, float ny) {
		x = nx;
		y = ny;
		canvas = np;
	}
		
		
	public void display() {
		canvas.fill(200);
		canvas.stroke(150);
		canvas.rect(x, y, 40, 40, 30, 30, 10, 10);
	}

		
	public void move() {
		x = x-speed;
		if (x<-50) {
			x = 550;
			y = canvas.random(0,250);
		}
	}
}