/*
 *Copyright (c) 2015 Len Isac
 *Copyright (c) 2013 Costco, RGS
 *See the file license.txt for copying permission.
 */


package com.moded.extendedchoiceparameter;

import java.util.Map;
import java.util.LinkedHashMap;
import java.util.List;

import org.kohsuke.stapler.DataBoundConstructor;
import hudson.model.StringParameterValue;

public class ExtendedChoiceParameterValue extends StringParameterValue {
	private static final long serialVersionUID = 7993744779892775177L;
	private Map<Integer, String> allCols;
	private Map<Integer, List<String>> allColsList;
	private int multiLevelColumns;

	@DataBoundConstructor
	public ExtendedChoiceParameterValue(String name, String value) {
		super(name, value);
	}

	public ExtendedChoiceParameterValue(String name, String value,
			int multiLevelColumns, Map<Integer, String> allCols) {
		super(name, value);
		this.allCols = allCols;
		this.multiLevelColumns = multiLevelColumns;
		System.out.println("######## Moded ExtendedChoiceParameterValue (4 param) ########");		
		System.out.println("Name: " + name);
		System.out.println("Value: " + value);
		System.out.println("multiLevelColumns: " + this.multiLevelColumns);
		System.out.println("allCols: ");
		for (int i = 1; i < this.multiLevelColumns + 1; i++) {
			System.out.println(i + ": " + this.allCols.get(i));
		}
	}

	public ExtendedChoiceParameterValue(String name, String value,
			Map<Integer, List<String>> eachCol) {
		super(name, value);
		this.allColsList = eachCol;
		System.out
				.println("### ExtendedChoiceParameterValue(String name, String value, LinkedHashMap<Integer, List<String>> eachCol) ###");
		System.out.println("Name: " + name);
		System.out.println("Value: " + value);
		System.out.println("allCols: " + this.allColsList.get(this.multiLevelColumns));
	}
}
