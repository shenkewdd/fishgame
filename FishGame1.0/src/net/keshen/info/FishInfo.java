package net.keshen.info;

import net.keshen.enumration.FishType;

/**
 * 鱼对应的配置信息：
 * 速度、旋转角度、动作速度等
 * @author shenke
 * @date 2016-3-3 上午9:49:04
 */
public class FishInfo {
	
	/**
	 * 最大旋转角度
	 */
	private int maxRotate;	
	/**
	 * 游动速度
	 */
	private int runSpeed;
	/**
	 * 动作速度
	 */
	private int actSpeed;
	/**
	 * 最大鱼群数
	 */
	private int fishShoalMax;
	/**
	 * 所在图层位置
	 */
	private int fishInLayer;
	/**
	 * 价值
	 */
	private int worth;
	/**
	 * 捕捉概率
	 */
	private int catchProbability;
	
	private FishType type;
	
	
	/**
	 * 获取最大旋转角度
	 * @return
	 */
	public int getMaxRotate() {
		return maxRotate;
	}
	/**
	 * 设置最大旋转角度
	 * @return
	 */
	public void setMaxRotate(int maxRotate) {
		this.maxRotate = maxRotate;
	}
	public int getRunSpeed() {
		return runSpeed;
	}
	public void setRunSpeed(int runSpeed) {
		this.runSpeed = runSpeed;
	}
	public int getActSpeed() {
		return actSpeed;
	}
	public void setActSpeed(int actSpeed) {
		this.actSpeed = actSpeed;
	}
	public int getFishShoalMax() {
		return fishShoalMax;
	}
	public void setFishShoalMax(int fishShoalMax) {
		this.fishShoalMax = fishShoalMax;
	}
	public int getFishInLayer() {
		return fishInLayer;
	}
	public void setFishInLayer(int fishInLayer) {
		this.fishInLayer = fishInLayer;
	}
	public int getWorth() {
		return worth;
	}
	public void setWorth(int worth) {
		this.worth = worth;
	}
	public int getCatchProbability() {
		return catchProbability;
	}
	public void setCatchProbability(int catchProbability) {
		this.catchProbability = catchProbability;
	}
	public FishType getType() {
		return type;
	}
	public void setType(FishType type) {
		this.type = type;
	}
}
