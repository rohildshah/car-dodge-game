import processing.core.PApplet;

class Animal {
	private float x;
	private float y;
	PApplet canvas;
	private float speed = 3;
	
	
	public Animal(PApplet np, float nx, float ny) {
		x = nx;
		y = ny;
		canvas = np;
	}
		
		
	@SuppressWarnings("static-access")
	public void display() {
		canvas.fill(255);
		canvas.stroke(0);
		for (int i = 1; i < 9; i++) {
			canvas.fill(173, 105, 60);
			canvas.arc(x, y, 50, 50, canvas.QUARTER_PI*(i-1), canvas.QUARTER_PI*i, canvas.PIE);
			canvas.fill(255, 243, 28);
			canvas.arc(x, y, 40, 40, canvas.QUARTER_PI*(i-1), canvas.QUARTER_PI*i, canvas.PIE);
			
		canvas.fill(216, 49, 49);
		canvas.ellipse(x+5, y+14, 5, 5);
		canvas.ellipse(x+5, y-14, 5, 5);
		canvas.ellipse(x+14, y-5, 5, 5);
		canvas.ellipse(x+14, y+5, 5, 5);
			
		canvas.ellipse(x-5, y-14, 5, 5);
		canvas.ellipse(x-5, y+14, 5, 5);
		canvas.ellipse(x-14, y+5, 5, 5);
		canvas.ellipse(x-14, y-5, 5, 5);
			
		canvas.	fill(0, 0, 0);
		canvas.	ellipse(x+20, y+23, 10, 10);
		canvas.ellipse(x-20, y+23, 10, 10);
			
		canvas.fill(255,255,255);
		canvas.strokeWeight(2);
		canvas.line(x-30, y-10, x-50, y-10);
		canvas.line(x-30, y+10, x-50, y+10);
		canvas.line(x-30, y, x-40, y);
		canvas.strokeWeight(1);

		}


	}
		
		
	public void move() {
		x = x+speed;
		if (x>600) {
			x = -500;
			y = canvas.random(100,250);
			speed = canvas.random(3,8);
		}
	}
}