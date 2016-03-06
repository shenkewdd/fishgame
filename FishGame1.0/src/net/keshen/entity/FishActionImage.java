package net.keshen.entity;

import java.awt.image.BufferedImage;

public class FishActionImage {

	private String name;
	private BufferedImage fishActionImages;
	private int actionNum;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public BufferedImage getFishActionImages() {
		return fishActionImages;
	}
	public void setFishActionImages(BufferedImage fishActionImages) {
		this.fishActionImages = fishActionImages;
	}
	public int getActionNum() {
		return actionNum;
	}
	public void setActionNum(int actionNum) {
		this.actionNum = actionNum;
	}
}
