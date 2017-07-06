package org.lhl.builder;

/**
 * 具体建造者
 * 
 * @author datatoucher
 *
 */
public class HeroBuilder extends ActorBuilder {

	@Override
	public void buildType() {
		actor.setType("hero");

	}

	@Override
	public void buildSex() {
		actor.setSex("M");

	}

	@Override
	public void buildFace() {
		actor.setFace("beauty");

	}

	@Override
	public void buildCostume() {
		actor.setCostume("sunny");

	}

	@Override
	public void buildHairstyle() {
		actor.setHairstyle("Red");

	}

}
