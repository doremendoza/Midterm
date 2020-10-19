import acm.graphics.*;
import acm.program.GraphicsProgram;
import java.awt.event.MouseEvent;

public class Frogger extends GraphicsProgram {
	
	private static final int SQSIZE = 75;
	private static final int NCOLS = 7;
	private static final int NROWS = 3;
	public static final int APPLICATION_WIDTH = NCOLS * SQSIZE;
	public static final int APPLICATION_HEIGHT = NROWS * SQSIZE;
	private static int fX = 3;
	private static int fY = 2;
	private static GImage frog = new GImage("frog.jpg", SQSIZE * fX, SQSIZE * fY);
	
	public void run() {
		add(frog);
		println(frog.getX() + SQSIZE / 2);
		addMouseListeners();
	}
	
	private double getXLocation(GImage image) {
		return image.getX() + SQSIZE / 2;
	}
	private double getYLocation(GImage image) {
		return image.getY() + SQSIZE / 2;
	}

	private void jumpNorth() {
		if (fY > 0) {
			frog.move(0, -SQSIZE);
			fY--;
		}
	}
	private void jumpSouth() {
		if (fY < NROWS - 1) {
			frog.move(0, SQSIZE);
			fY++;
		}
	}
	private void jumpEast() {
		if (fX < NCOLS - 1) {
			frog.move(SQSIZE, 0);
			fX++;
		}
	}
	private void jumpWest() {
		if (fX > 0) {
			frog.move(-SQSIZE, 0);
			fX--;
		}
	}
	public void mouseClicked(MouseEvent e) {
		double mouseX = e.getX();
		double mouseY = e.getY();
		
		if (mouseX <= SQSIZE * NCOLS && mouseY <= SQSIZE * NROWS) {
			if (Math.abs(mouseX - getXLocation(frog)) > Math.abs(mouseY - getYLocation(frog))) {
				if (mouseX > getXLocation(frog)) jumpEast();
				else jumpWest();
			} else {
				if (mouseY > getYLocation(frog)) jumpSouth();
				else jumpNorth();
			}
		}
	}
}