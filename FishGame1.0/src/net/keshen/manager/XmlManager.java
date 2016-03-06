package net.keshen.manager;

import java.util.HashMap;
import java.util.Map;

import net.keshen.constant.FishGameConstant;
import net.keshen.info.FishInfo;
import net.keshen.utils.StringUtils;
import net.keshen.utils.XmlUtils;

import org.xmlpull.v1.XmlPullParser;

/**
 * 配置文件管理器
 * @author shenke
 * @date 2016-3-2 下午6:26:02
 */
public class XmlManager {
	
	/**
	 * 获取Fish的相关配置文件的路径</br>
	 * 鱼的动作图片fishActConfig 和 基本配置信息fishInfoConfig
	 * @return
	 */
	public static Map<String,String> getFishConfigPath(){
		
		Map<String,String> configMap = new HashMap<String, String>();
		XmlPullParser xml = XmlUtils.getXmlPullParser(FishGameConstant.FISH_CONFIG_PATH, FishGameConstant.FISH_CONFIG_ENCODE);
		String key = StringUtils.EMPTY;
		String configInfo = StringUtils.EMPTY;
		
		while(XmlUtils.goTagByName(xml, "key")){
			key = XmlUtils.getCurrentTagValue(xml);
			XmlUtils.goTagByName(xml, "string");
			configInfo = XmlUtils.getCurrentTagValue(xml);
			configMap.put(key, configInfo);
		}
		return configMap;
	}
	
	/**
	 * 获取鱼的配置信息:速度、旋转角度等</br>
	 * 以Map形式返回
	 * @return
	 */
	public static Map<String,FishInfo> getFishInfo(){
		Map<String,FishInfo> fishInfoMap = new HashMap<String, FishInfo>();
		String fishInfoPath = getFishConfigPath().get(FishGameConstant.KEY_FISH_INFO_CONFIG);
		XmlPullParser xml = XmlUtils.getXmlPullParser(fishInfoPath, FishGameConstant.FISH_CONFIG_ENCODE);
		try {
			while(XmlUtils.goTagByName(xml, "key")){
				FishInfo fishInfo = new FishInfo();
				XmlUtils.goTagByName(xml, "String");
				String fishName = XmlUtils.getCurrentTagValue(xml);
				//解析相关参数
				XmlUtils.goTagByName(xml, "Integer");
				int maxRotate = Integer.parseInt(XmlUtils.getCurrentTagValue(xml));
				fishInfo.setMaxRotate(maxRotate);
				XmlUtils.goTagByName(xml, "Integer");
				int runSpeed = Integer.parseInt(XmlUtils.getCurrentTagValue(xml));
				fishInfo.setRunSpeed(runSpeed);
				XmlUtils.goTagByName(xml, "Integer");
				int actSpeed = Integer.parseInt(XmlUtils.getCurrentTagValue(xml));
				fishInfo.setActSpeed(actSpeed);
				XmlUtils.goTagByName(xml, "Integer");
				int fishShoalMax = Integer.parseInt(XmlUtils.getCurrentTagValue(xml));
				fishInfo.setFishShoalMax(fishShoalMax);
				XmlUtils.goTagByName(xml, "Integer");
				int fishInLayer = Integer.parseInt(XmlUtils.getCurrentTagValue(xml));
				fishInfo.setFishInLayer(fishInLayer);
				XmlUtils.goTagByName(xml, "Integer");
				int worth = Integer.parseInt(XmlUtils.getCurrentTagValue(xml));
				fishInfo.setWorth(worth);
				XmlUtils.goTagByName(xml, "Integer");
				int catchProbability = Integer.parseInt(XmlUtils.getCurrentTagValue(xml));
				fishInfo.setCatchProbability(catchProbability);
				//
				fishInfoMap.put(fishName, fishInfo);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return fishInfoMap;
	}
}
