import processing.core.PApplet;

class Dust {
	private float x;
	private float y;
	private float speed = 7;
	PApplet canvas;
	
	
	public Dust(PApplet np, float nx, float ny) {
		x = nx;
		y = ny;
		canvas = np;
	}
		
	@SuppressWarnings("static-access")
	public void display() {
		canvas.stroke(153, 122, 33);
		canvas.fill(153, 122, 33);
		canvas.strokeWeight(4);
		canvas.point(x, y);
		canvas.strokeWeight(canvas.NORMAL);
	}

		
	public void move() {
		x = x-speed;
		if (x<-50) {
			x = canvas.random(550,1500);
			y = canvas.random(0,250);
		}
	}
}