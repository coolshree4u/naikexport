package com.testfish;

import java.sql.ResultSet;
import java.sql.SQLException;

public class PackagingMaterial {

	int pinv_id;
	int master_cartons;
	int boop_cello_type;
	int voilet_bags;
	int pink_bags;
	int red_bags; 
	int yellow_bags; 
	int blue_bags;
	
	int green_bags;
	int orenge_bags; 
	int sample_bags;

	public PackagingMaterial() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PackagingMaterial(ResultSet resultSet) throws SQLException
    {
        this.pinv_id = resultSet.getInt("pinv_id");
		this.master_cartons = resultSet.getInt("master_cartons");
		this.boop_cello_type = resultSet.getInt("boop_cello_type");
		this.voilet_bags = resultSet.getInt("voilet_bags");
		this.pink_bags = resultSet.getInt("pink_bags");
		this.red_bags = resultSet.getInt("red_bags");
		this.yellow_bags = resultSet.getInt("yellow_bags");
		this.blue_bags = resultSet.getInt("blue_bags");
		this.green_bags = resultSet.getInt("green_bags");
		this.orenge_bags = resultSet.getInt("orenge_bags");
		this.sample_bags = resultSet.getInt("sample_bags");
        
    }
	public PackagingMaterial(int pinv_id, int master_cartons, int boop_cello_type, int voilet_bags, int pink_bags,
			int red_bags, int yellow_bags, int blue_bags, int green_bags, int orenge_bags, int sample_bags) {
		super();
		this.pinv_id = pinv_id;
		this.master_cartons = master_cartons;
		this.boop_cello_type = boop_cello_type;
		this.voilet_bags = voilet_bags;
		this.pink_bags = pink_bags;
		this.red_bags = red_bags;
		this.yellow_bags = yellow_bags;
		this.blue_bags = blue_bags;
		this.green_bags = green_bags;
		this.orenge_bags = orenge_bags;
		this.sample_bags = sample_bags;
	}
	public int getPinv_id() {
		return pinv_id;
	}
	public void setPinv_id(int pinv_id) {
		this.pinv_id = pinv_id;
	}
	public int getMaster_cartons() {
		return master_cartons;
	}
	public void setMaster_cartons(int master_cartons) {
		this.master_cartons = master_cartons;
	}
	public int getBoop_cello_type() {
		return boop_cello_type;
	}
	public void setBoop_cello_type(int boop_cello_type) {
		this.boop_cello_type = boop_cello_type;
	}
	public int getVoilet_bags() {
		return voilet_bags;
	}
	public void setVoilet_bags(int voilet_bags) {
		this.voilet_bags = voilet_bags;
	}
	public int getPink_bags() {
		return pink_bags;
	}
	public void setPink_bags(int pink_bags) {
		this.pink_bags = pink_bags;
	}
	public int getRed_bags() {
		return red_bags;
	}
	public void setRed_bags(int red_bags) {
		this.red_bags = red_bags;
	}
	public int getYellow_bags() {
		return yellow_bags;
	}
	public void setYellow_bags(int yellow_bags) {
		this.yellow_bags = yellow_bags;
	}
	public int getBlue_bags() {
		return blue_bags;
	}
	public void setBlue_bags(int blue_bags) {
		this.blue_bags = blue_bags;
	}
	public int getGreen_bags() {
		return green_bags;
	}
	public void setGreen_bags(int green_bags) {
		this.green_bags = green_bags;
	}
	public int getOrenge_bags() {
		return orenge_bags;
	}
	public void setOrenge_bags(int orenge_bags) {
		this.orenge_bags = orenge_bags;
	}
	public int getSample_bags() {
		return sample_bags;
	}
	public void setSample_bags(int sample_bags) {
		this.sample_bags = sample_bags;
	}
}
