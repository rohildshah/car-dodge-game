import processing.core.PApplet;

class Car {
	public float y;
	PApplet canvas;
	
	
	public Car(PApplet np, float nc, float ny) {
		y = ny;
		canvas = np;
	}
		
		
	@SuppressWarnings("static-access")
	public void display() {
		canvas.rectMode(canvas.CENTER);
		canvas.stroke(0);

		canvas.fill(0);
		canvas.rect(85, y+8, 15, 10);
		canvas.rect(115, y+8, 15, 10);
	
		canvas.fill(0);
		canvas.rect(85, y-8, 15, 10);
		canvas.rect(115, y-8, 15, 10);
		
		canvas.fill(175);
		canvas.rect(100, y, 50, 20);

	}
	
		
		
	@SuppressWarnings("static-access")
	public void move() {
		if(canvas.keyPressed == true) {
			if(canvas.keyCode == canvas.DOWN) {
				y = y + 2;
			}
			
			if(canvas.keyCode == canvas.UP) {
				y = y - 2;
			}
			
		if(y > 400) {
			y = 400;
			
		}
		
		if(y < 300) {
			y = 300;
		}
		
		}
	}
	
	public float givecy() {
		return y;
	}
}