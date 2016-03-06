package net.keshen.base.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 时间工具类
 * @author shenke
 * @date 2016年2月23日下午10:23:55
 * @version 1.0
 */
public class TimeUtils {
	private static final SimpleDateFormat SDF = new SimpleDateFormat("hh:mm:ss");
	/**
	 * 获取符合
	 * @return
	 */
	public static String getCurrentTime2String(){
		return SDF.format(new Date(System.currentTimeMillis()));
	}
}
