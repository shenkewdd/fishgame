package net.keshen.manager;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.util.List;

import org.xmlpull.v1.XmlPullParser;

import net.keshen.base.model.Bitmap;
import net.keshen.enumration.FishType;
import net.keshen.info.ImageConfig;
import net.keshen.info.ImageConfig.ActImageConfig;
import net.keshen.utils.StringUtils;
import net.keshen.utils.XmlUtils;

/**
 * 图片管理器
 * 
 * @author shenke
 * @date 2016-3-2 上午9:31:13
 */
public class ImageManager {

	public static final List<Bitmap> getBitmapsByFishType(FishType type) {
		switch (type) {
		case SNAPPER:
			break;
		}
		return null;
	}
		/**
	 * 
	 * @param fileName
	 * @param encode
	 * @return
	 */
	public ImageConfig createImageConfig(String fileName,String encode){
		try {
			if(StringUtils.isEmpty(fileName)){
				throw new Exception("文件名为空！");
			}
			ImageConfig imageConfig = new ImageConfig();
			imageConfig.setSrcFileName(fileName);
			XmlPullParser xml = XmlUtils.getXmlPullParser(fileName, encode);
			while(true){
				XmlUtils.goTagByName(xml, "key");
				if("textrue".equals(XmlUtils.getCurrentTagValue(xml))){
					getSrcImageInfo(xml, imageConfig);
				}
				else if("frames".equals(XmlUtils.getCurrentTagValue(xml))){
					XmlUtils.goTagByName(xml, "dict");
					getCutImageConfig(xml,imageConfig);
					break;
				}
			}
			return imageConfig;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	

	/**
	 * 获取源图片的基本信息
	 * @param xml
	 * @param config
	 */
	private void getSrcImageInfo(XmlPullParser xml,ImageConfig config){
		XmlUtils.goTagByName(xml, "key");
		String attribute = XmlUtils.getCurrentTagValue(xml);
		if("width".equals(attribute)){
			XmlUtils.goTagByName(xml, "Integer");
			int srcWidth = Integer.parseInt(XmlUtils.getCurrentTagValue(xml));
			config.setSrcWidth(srcWidth);
		}
		else if("height".equals(attribute)){
			XmlUtils.goTagByName(xml, "Integer");
			int srcHeight = Integer.parseInt(XmlUtils.getCurrentTagValue(xml));
			config.setSrcHeight(srcHeight);
		}
		XmlUtils.goTagByName(xml, "key");
		attribute = XmlUtils.getCurrentTagValue(xml);
		if("width".equals(attribute)){
			XmlUtils.goTagByName(xml, "Integer");
			int srcWidth = Integer.parseInt(XmlUtils.getCurrentTagValue(xml));
			config.setSrcWidth(srcWidth);
		}
		else if("height".equals(attribute)){
			XmlUtils.goTagByName(xml, "Integer");
			int srcHeight = Integer.parseInt(XmlUtils.getCurrentTagValue(xml));
			config.setSrcHeight(srcHeight);
		}
	}
	
	/**
	 * 获取源图片内每个动作图片的详细配置数据
	 * @param xml
	 * @param imageConfig
	 */
	private void getCutImageConfig(XmlPullParser xml, ImageConfig imageConfig) {
		try {
			while(XmlUtils.goTagByName(xml, "key")){
				ActImageConfig actConfig = imageConfig.new ActImageConfig();
				String imageName = XmlUtils.getCurrentTagValue(xml);
				imageConfig.getAllActs().put(imageName, actConfig);
				actConfig.setImageName(imageName);
				actConfig.setConfig(imageConfig);
				XmlUtils.goTagByName(xml, "dict");
				getActImageConfig(xml, actConfig);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	/**
	 * 获取源图片每个动作图片的详细配置信息
	 * @param xml
	 */
	private void getActImageConfig(XmlPullParser xml,ActImageConfig actConfig){
		try {
			//X坐标
			XmlUtils.goTagByName(xml, "Integer");
			int x = Integer.parseInt(XmlUtils.getCurrentTagValue(xml));
			actConfig.setX(x);
			//y坐标
			XmlUtils.goTagByName(xml, "Integer");
			int y = Integer.parseInt(XmlUtils.getCurrentTagValue(xml));
			actConfig.setY(y);
			//图片在源图片中的跨度
			XmlUtils.goTagByName(xml, "Integer");
			int width = Integer.parseInt(XmlUtils.getCurrentTagValue(xml));
			actConfig.setWidth(width);
			//在原图片中高度
			XmlUtils.goTagByName(xml, "Integer");
			int height = Integer.parseInt(XmlUtils.getCurrentTagValue(xml));
			actConfig.setHeight(height);
			//offsetX
			XmlUtils.goTagByName(xml, "real");
			double offsetX = Double.parseDouble(XmlUtils.getCurrentTagValue(xml));
			actConfig.setOffsetX(offsetX);
			//offsetY
			XmlUtils.goTagByName(xml, "real");
			double offsetY = Double.parseDouble(XmlUtils.getCurrentTagValue(xml));
			actConfig.setOffsetY(offsetY);
			//图片实际的宽度
			XmlUtils.goTagByName(xml, "Integer");
			int originalWidth = Integer.parseInt(XmlUtils.getCurrentTagValue(xml));
			actConfig.setOriginalWidth(originalWidth);
			//
			XmlUtils.goTagByName(xml, "Integer");
			int originalHeight = Integer.parseInt(XmlUtils.getCurrentTagValue(xml));
			actConfig.setOriginalHeight(originalHeight);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 根据配置信息裁剪图片
	 * @param actConfig		需要裁剪图片的配置信息
	 * @param srcImage 		源图片
	 * @return
	 */
	public Bitmap getBitmapByActImageConfig(ActImageConfig actConfig,BufferedImage srcImage){
		BufferedImage cutImage = new BufferedImage(actConfig.getWidth(), actConfig.getHeight(), BufferedImage.TYPE_4BYTE_ABGR);
		Graphics g = cutImage.getGraphics();
		g.drawImage(srcImage,
			(int)(actConfig.getOriginalWidth() / 2 + actConfig.getOffsetX() - actConfig.getWidth()/ 2), 
			(int)(actConfig.getOriginalHeight() / 2 - actConfig.getOffsetY() - actConfig.getHeight() / 2), 
			(int)(actConfig.getOriginalWidth() / 2 + actConfig.getOffsetX() - actConfig.getWidth()/ 2)+actConfig.getWidth(), 
			(int)(actConfig.getOriginalHeight() / 2 - actConfig.getOffsetY() - actConfig.getHeight() / 2)+actConfig.getHeight(), 
			actConfig.getX(),
			actConfig.getY(), 
			actConfig.getX()+actConfig.getWidth(), 
			actConfig.getY()+actConfig.getHeight(), 
			null
		);
		return new Bitmap(cutImage);
	}
}
