package org.inter;

import java.util.HashMap;
import java.util.Map;

public class MultiPatten {
	private static final Map<String,MultiPatten> instances=new HashMap<String,MultiPatten>();
	private String value;
	private MultiPatten(String value) {
		// TODO Auto-generated constructor stub
		this.value=value;
	}
	public static MultiPatten getInstances(String key) {
		if (!instances.containsKey(key)) {
			instances.put(key,new MultiPatten(key));
			
		}
		return instances.get(key);
	}
	public String getValue() {
		return value;
	}

}
