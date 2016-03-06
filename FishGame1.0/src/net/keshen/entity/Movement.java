package net.keshen.entity;

import java.awt.image.BufferedImage;
import java.io.Serializable;
import java.util.List;

/**
 * 所有移动物体的抽象类
 * @author shenke
 *
 */
public abstract class Movement implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -935145279645105774L;
	/**运动方向 上*/
	public static final String MOVE_DIRECTION_UP = "U";
	/**运动方向 下*/
	public static final String MOVE_DIRECTION_DOWN = "D";
	/**运动方向 左*/
	public static final String MOVE_DIRECTION_LEFT = "L" ;
	/**运动方向 右*/
	public static final String MOVE_DIRECTION_RIGHT = "R" ;
	/**运动方向 右上*/
	public static final String MOVE_DIRECTION_RU = "RU";
	/**运动方向 左上*/
	public static final String MOVE_DIRECTION_LU = "LU";
	/**运动方向 右下*/
	public static final String MOVE_DIRECTION_RD = "RD";
	/**运动方向 左下*/
	public static final String MOVE_DIRECTION_LD = "LD";
	
	private double x;//x坐标
	private double y;//y坐标
	private double speed;//移动速度
	private boolean out;//是否超出屏幕
	
	private List<BufferedImage> images;
	
	private BufferedImage currentImage;
	
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	public double getSpeed() {
		return speed;
	}
	public void setSpeed(double speed) {
		this.speed = speed;
	}
	public boolean isOut() {
		return out;
	}
	public void setOut(boolean out) {
		this.out = out;
	}
	public List<BufferedImage> getImages() {
		return images;
	}
	public void setImages(List<BufferedImage> images) {
		this.images = images;
	}
	public BufferedImage getCurrentImage() {
		return currentImage;
	}
	public void setCurrentImage(BufferedImage currentImage) {
		this.currentImage = currentImage;
	}
	
}
