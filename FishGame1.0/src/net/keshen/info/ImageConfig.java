package net.keshen.info;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author shenke
 * @date 2016-3-3 上午9:48:56
 */
public class ImageConfig {

	private String srcFileName;	//原图片的名称
	private int srcWidth;		//源图片的宽度
	private int srcHeight;		//原图片的高度
	private Map<String,ActImageConfig> allActs = new HashMap<String, ActImageConfig>();
	
	public class ActImageConfig{
		
		private int x;				//图片在源图片的x坐标
		private int y;				//图片在源图片的Y坐标
		private int width;			//图片在源图片内的宽度
		private int height;			//图片在源图片内的高度
		private double offsetX;		//x偏移量
		private double offsetY;		//y偏移量
		private int originalWidth;	//图片的原始宽度
		private int originalHeight;	//图片的原始高度
		
		private String imageName;	//图片名
		
		private ImageConfig config;
		/**
		 * 获取图片在源图片的x坐标
		 * @return
		 */
		public int getX() {
			return x;
		}
		/**
		 * 设置图片在源图片的y坐标
		 * @return
		 */
		public void setX(int x) {
			this.x = x;
		}
		public int getY() {
			return y;
		}
		public void setY(int y) {
			this.y = y;
		}
		public int getWidth() {
			return width;
		}
		public void setWidth(int width) {
			this.width = width;
		}
		public int getHeight() {
			return height;
		}
		public void setHeight(int height) {
			this.height = height;
		}
		public double getOffsetX() {
			return offsetX;
		}
		public void setOffsetX(double offsetX) {
			this.offsetX = offsetX;
		}
		public double getOffsetY() {
			return offsetY;
		}
		public void setOffsetY(double offsetY) {
			this.offsetY = offsetY;
		}
		public int getOriginalWidth() {
			return originalWidth;
		}
		public void setOriginalWidth(int originalWidth) {
			this.originalWidth = originalWidth;
		}
		public int getOriginalHeight() {
			return originalHeight;
		}
		public void setOriginalHeight(int originalHeight) {
			this.originalHeight = originalHeight;
		}
		public String getImageName() {
			return imageName;
		}
		public void setImageName(String imageName) {
			this.imageName = imageName;
		}
		public ImageConfig getConfig() {
			return config;
		}
		public void setConfig(ImageConfig config) {
			this.config = config;
		}
		
	}

	public String getSrcFileName() {
		return srcFileName;
	}

	public void setSrcFileName(String srcFileName) {
		this.srcFileName = srcFileName;
	}

	public int getSrcWidth() {
		return srcWidth;
	}

	public void setSrcWidth(int srcWidth) {
		this.srcWidth = srcWidth;
	}

	public int getSrcHeight() {
		return srcHeight;
	}

	public void setSrcHeight(int srcHeight) {
		this.srcHeight = srcHeight;
	}

	public Map<String, ActImageConfig> getAllActs() {
		return allActs;
	}

	public void setAllActs(Map<String, ActImageConfig> allActs) {
		this.allActs = allActs;
	}
	
}
