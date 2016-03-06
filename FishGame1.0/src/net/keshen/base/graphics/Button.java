package net.keshen.base.graphics;
/**
 * 按钮接口
 * @author shenke
 * @date 2016年2月21日下午12:23:42
 * @version 1.0
 */
public interface Button {

	/**
	 * 按钮是否可用
	 * @return
	 */
	public boolean isEnable();
	
	/**
	 * 当按钮被点击
	 */
	public void onClick();
}
