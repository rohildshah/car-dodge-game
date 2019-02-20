import processing.core.PApplet;

class Bush {
	private float x;
	private float y;
	PApplet canvas;
	private float speed = 7;
	
	
	public Bush(PApplet np, float nx, float ny) {
		x = nx;
		y = ny;
		canvas = np;
	}
		
		
	@SuppressWarnings("static-access")
	public void display() {
		canvas.fill(39, 150, 15);
		canvas.rectMode(canvas.CENTER);
		canvas.stroke(39,150,15);
		
		canvas.rect(x, y, 10, 50);
		
		canvas.rect(x-10, y+5, 15, 10);
		canvas.rect(x+10, y+5, 15, 10);
				
		canvas.rect(x-17, y, 10, 20);
		canvas.rect(x+17, y-4, 10, 28);

		
	}

		
	public void move() {
		x = x-speed;
		if (x<-100) {
			x = 550;
			y = canvas.random(0,250);
		}
	}
}