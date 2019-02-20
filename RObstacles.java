import processing.core.PApplet;

class RObstacles {
	private float x;
	private float y;
	PApplet canvas;
	private float speed = 7;
	
	
	public RObstacles(PApplet np, float nx, float ny) {
		x = nx;
		y = ny;
		canvas = np;
	}
		
		
	public void display() {
		canvas.fill(225);
		canvas.stroke(150);
		canvas.ellipse(x, y, 20, 20);
	}

		
	public void move() {
		x = x-speed;
		if (x<-50) {
			x = canvas.random(550,1050);
			y = canvas.random(300,400);
		}
	}
	
	public float giveox() {
		return x;
	}
	
	public float giveoy() {
		return y;
	}
}