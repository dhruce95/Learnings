package com.singleton;

public class Sample {
	static Sample sample;// = new Sample();
	private Sample(){
		
	}
	public static Sample getInstance() {
		if(sample == null)
			sample = new Sample();
		return sample;
	}
}
