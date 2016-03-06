package net.keshen.base.model;

import net.keshen.base.adapter.DrawableAdapter;

/**
 * 基本组件
 * @author shenke
 * @date 2016年2月21日下午7:31:25
 * @version 1.0
 */
public abstract class Componet extends DrawableAdapter{

	private double layout_x;
	private double layout_y;
	/**
	 * 获取组件在屏幕上的x坐标
	 * @return
	 */
	public double getLayout_x() {
		return layout_x;
	}
	/**
	 * 设置组件在屏幕上的y坐标
	 * @param layout_x
	 */
	public void setLayout_x(double layout_x) {
		this.layout_x = layout_x;
	}
	/**
	 * 获取组件在屏幕上的y坐标
	 * @return
	 */
	public double getLayout_y() {
		return layout_y;
	}
	/**
	 * 设置左键在屏幕上的y坐标
	 * @param layout_y
	 */
	public void setLayout_y(double layout_y) {
		this.layout_y = layout_y;
	}
	
}
