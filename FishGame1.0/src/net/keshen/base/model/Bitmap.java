package net.keshen.base.model;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.Serializable;
/**
 * 
 * @author shenke
 *
 */
public class Bitmap implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6011471659911115345L;
	
	private BufferedImage image;
	
	
	
	public Bitmap(BufferedImage image) {
		super();
		this.image = image;
	}
	public BufferedImage getImage(){
		return this.image;
	}
	/**
	 * 获取宽度
	 * @return
	 */
	public int getWidth(){
		return image.getWidth();
	}
	
	/**
	 * 获取高度
	 * @return
	 */
	public int getHeight(){
		return image.getHeight();
	}
	
	/**
	 * 缩放图片
	 * @param src
	 * @param width
	 * @param height
	 * @param tf
	 * @return
	 */
	public static Bitmap createScaledBitmap(Bitmap src,int width,int height,boolean tf){
		
		BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_4BYTE_ABGR);
		Graphics g = image.getGraphics();
		g.drawImage(image, 0, 0, width, height, null);
		
		return new Bitmap(image);
	}
	/**
	 * 复制图片
	 * @param src
	 * @return
	 */
	public static Bitmap createBitmap(Bitmap src){
		return src.copy();
	}
	
	public Bitmap copy(){
		BufferedImage image = new BufferedImage(this.getWidth(), this.getHeight(), BufferedImage.TYPE_4BYTE_ABGR);
		Graphics g = image.getGraphics();
		g.drawImage(image, 0, 0, this.getWidth(), this.getHeight(), null);
		
		return new Bitmap(image);
	}

	/**
	 * 获取像素颜色
	 * @return
	 */
	public int getPixel(int x,int y){
		
		return image.getRGB(x, y);
	}
	/**
	 * 设置像素颜色
	 * @param x
	 * @param y
	 * @param rgb
	 */
	public void setPixel(int x,int y,int rgb){
		image.setRGB(x, y, rgb);
	}
	/**
	 * 设置像素颜色
	 * @param x
	 * @param y
	 * @param color 
	 */
	public void setPixel(int x,int y,Color color){
		image.setRGB(x, y, color.getRGB());
	}
}
