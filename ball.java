

import java.awt.Color;
import java.awt.Graphics;

public class Ball {
	private int x, y, height, width;
	private Color color;

	public Ball(int x, int y, int width, int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}

	public void drawOn(Graphics g) {
		g.setColor(Color.BLUE);
		g.fillOval(x, y, width, height);
	}

	public void move(int x, int y) {
		this.x += x;
		this.y += y;

	}
	public void setX(int y) {
		this.y = y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

}
