package uk.ac.bbk.REx.settings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;

/**
 * A class to hold the scoring settings for the reaction extraction algorithm. The class is generated
 * from a JSON file holding the settings.
 */
public class ScoringSettings
{	
	private double entity;
	private double keyword;
	private double bonus;
	private double and;
	private double phraseBetweenPenalty;
	private double enzymeDistancePenalty;
	private double threshold;

	//Object is generated by GSON
	private ScoringSettings(){}
	
	public static ScoringSettings build(String settingsJSON) throws JsonSyntaxException, JsonIOException, IOException
	{
		Gson gson = new Gson();
		
		ScoringSettings s = gson.fromJson(new BufferedReader(new InputStreamReader(ScoringSettings.class.getResourceAsStream(settingsJSON))), ScoringSettings.class);
		return s;
	}
	
	public double getEntity()
	{
		return entity;
	}
	
	public double getKeyword()
	{
		return keyword;
	}

	public double getBonus()
	{
		return bonus;
	}

	public double getAnd()
	{
		return and;
	}

	public double getPhraseBetweenPenalty()
	{
		return phraseBetweenPenalty;
	}
	
	public double getEnzymeDistancePenalty()
	{
		return enzymeDistancePenalty;
	}
	
	public double getThreshold()
	{
		return threshold;
	}
}
