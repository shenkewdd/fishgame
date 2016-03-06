package net.keshen.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Map;

import net.keshen.constant.FishGameConstant;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/**
 * 解析Xml工具类，利用dom4j解析xml
 * 
 * @author shenke
 * @date 2016-3-2 上午9:31:51
 */
public final class XmlUtils {

	/**
	 * 获取鱼的配置文件路径的配置信息 多个配置文件路径以‘;’分割
	 * 
	 * @return
	 */
	public static final Map<String,String> getFishConfigPath() {
		XmlPullParser xml = getXmlPullParser(FishGameConstant.FISH_CONFIG_PATH
				+ FishGameConstant.IMAGE_CONFIG_SUFFIX,
				FishGameConstant.FISH_CONFIG_ENCODE);
		
		return null;
	}

	public static final void getFishInfo() {

	}

	public static final void getFishRowMapper() {

	}

	public static final String getCurrentTagValue(XmlPullParser xml){
		try {
			int eventType = xml.next();
			while (true) {
				if (eventType == XmlPullParser.TEXT) {
					return xml.getText();
				} else if (eventType == XmlPullParser.END_DOCUMENT) {
					break;
				}
				eventType = xml.next();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	/**
	 * 
	 * @param xml
	 * @param tagName
	 * @return
	 */
	public static final boolean goTagByName(XmlPullParser xml, String tagName) {
		try {
			String key = StringUtils.EMPTY;
			int evnentType = xml.next();
			while (true) {
				if (evnentType == XmlPullParser.START_TAG) {
					key = xml.getName();
					if (key.trim().equals(tagName)) {
						return true;
					}
				} else if (evnentType == XmlPullParser.END_DOCUMENT) {
					break;
				}
				evnentType = xml.next();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	/**
	 * 
	 * @param fileName
	 * @param encode
	 * @return
	 */
	public static final XmlPullParser getXmlPullParser(String fileName,
			String encode) {

		try {
			XmlPullParserFactory factory = XmlPullParserFactory.newInstance();
			factory.setNamespaceAware(true);
			XmlPullParser parser = factory.newPullParser();
			parser.setInput(new FileInputStream(fileName
					+ FishGameConstant.IMAGE_CONFIG_SUFFIX), encode);
			return parser;
		} catch (XmlPullParserException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public static void main(String[] args) {
		XmlPullParser xml = getXmlPullParser("fish/FishConfig", "UTF-8");
		try {
			int eventType = xml.next();
			while (true) {
				if (eventType == XmlPullParser.START_DOCUMENT) {
					System.out.println(xml.getName());
				}
				if (eventType == XmlPullParser.TEXT) {
					// System.out.println(xml.getText().trim());
				} else if (eventType == XmlPullParser.END_DOCUMENT) {
					break;
				}
				eventType = xml.next();
			}
		} catch (Exception e) {

		}
	}
}
