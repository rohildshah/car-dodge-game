import processing.core.PApplet;

class Score {
	public float score;
	private int timer;
	PApplet canvas;
	
	
	public Score(PApplet np) {
		canvas = np;
	}
		
		
	@SuppressWarnings("static-access")
	public void update() {
		if (canvas.millis() - timer >= 2000) {
			score = score + 2;
			timer = canvas.millis();
		}
		System.out.println(canvas.second());
	}
	
	
	public void draw() {
		canvas.textSize(17);
		canvas.fill(0);
		canvas.text("Score: " + score, 400, 495);
	}
}