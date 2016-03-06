package net.keshen.entity;

import java.util.List;

import net.keshen.enumration.FishType;

/**
 * 实体：fish
 * @author shenke
 *
 */
public class Fish extends Movement{

	/**
	 * 
	 */
	private static final long serialVersionUID = 838864693331708181L;

	private List<FishActionImage> fishActionImages;
	private List<FishActionImage> fishCatchActionImages;
	
	private FishType fishType;		//鱼的种类
	private String moveDirection;	//运动方向
	
}
