import processing.core.PApplet;

public class Main extends PApplet{

	
	public static void main(String[] args) {
		PApplet.main("Main");
	}
	
	public float hitcounter;

	Animal an1;
	Animal an2;

	Car player;
	
	Bush b1;
	Bush b2;
	Bush b3;
	
	Rock r1;
	Rock r2;
	
	RObstacles ob1;
	RObstacles ob2;
	RObstacles ob3;
	
	Score sc1;

	Dashes [] dasharray;
	
	Dust [] darray;
	

	public void settings() {
		size(500,500);
	}
	

	public void setup() {
		stroke(255);
		an1 = new Animal(this,-2000,100);
		an2 = new Animal(this,-4000,250);

		player = new Car(this,255,350);
		
		b1 = new Bush(this, 500, 250);
		b2 = new Bush(this,850, 205);
		b3 = new Bush(this,650, 70);
		
		r1 = new Rock(this, 600, 100);
		r2 = new Rock(this, 1000, 250);
		
		ob1 = new RObstacles(this, random(550,1050), random(300,400));
		ob2 = new RObstacles(this, random(550,1050), random(300,400));
		ob3 = new RObstacles(this, random(550,1050), random(300,400));

		
		sc1 = new Score(this);
		
		darray = new Dust[40];
		for (int i = 1; i < darray.length; i++) {
			darray[i] = new Dust(this, random(550,1500), random(0,250));
		}
		
		dasharray = new Dashes[15];
		for (int i = 1; i < dasharray.length; i++) {
			dasharray[i] = new Dashes(this, i);
		}
		
	}


	public void draw() {
		background(239, 191, 50);
		stroke(200);
		rectMode(CORNER);
		fill(200);
		rect(-1,286,500,128);
		fill(100);
		rect(-1,300,501,100);

		
		for (int i = 1; i < darray.length; i++) {
			darray[i].move();
			darray[i].display();
		}
		
		for (int i = 1; i < dasharray.length; i++) {
			dasharray[i].move();
			dasharray[i].display();
		}
		
		if(dist(100, player.givecy(), ob1.giveox(), ob1.giveoy()) < 10) {
			sc1.score--;
			hitcounter++;
		}
		
		if(dist(100, player.givecy(), ob2.giveox(), ob2.giveoy()) < 10) {
			sc1.score--;
			hitcounter++;
		}
		
		if(dist(100, player.givecy(), ob3.giveox(), ob3.giveoy()) < 10) {
			sc1.score--;
			hitcounter++;
		}
		
		if(hitcounter == 8) {
			exit();
		}
		
		player.move();
		player.display();
		
		b1.move();
		b1.display();
		b2.move();
		b2.display();
		b3.move();
		b3.display();
		
		r1.move();
		r1.display();
		r2.move();
		r2.display();
		
		an1.move();
		an1.display();
		an2.move();
		an2.display();
		
		ob1.move();
		ob1.display();
		ob2.move();
		ob2.display();
		ob3.move();
		ob3.display();
		
		sc1.update();
		sc1.draw();
		}
}