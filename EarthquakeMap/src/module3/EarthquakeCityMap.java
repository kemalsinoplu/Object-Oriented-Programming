package module3;

import processing.core.PApplet;
import de.fhpotsdam.unfolding.UnfoldingMap;
import de.fhpotsdam.unfolding.marker.Marker;
import de.fhpotsdam.unfolding.data.PointFeature;
import de.fhpotsdam.unfolding.marker.SimplePointMarker;
import de.fhpotsdam.unfolding.providers.Google;
import de.fhpotsdam.unfolding.providers.MBTilesMapProvider;
import de.fhpotsdam.unfolding.utils.MapUtils;
import de.fhpotsdam.unfolding.data.ParseFeed;

import java.util.ArrayList;
import java.util.List;


public class EarthquakeCityMap extends PApplet {
	private static final long serialVersionUID = 1L;
	
	private static final boolean offline = false;
	
	public static final float THRESHHOLD_MODERATE = 5;
	
	public static final float THRESHHOLD_LÝGHT = 4;
	
	public static String mbTilesString = "blankLight-1-3.mbtiles";
	
	private UnfoldingMap map;
	
	private String earthquakesURL = "https://earthquake.usgs.gov/earthquakes/feed/v1.0/summary/2.5_week.atom";
	
	public void setup() {
		size(950, 600, OPENGL);
		
		if(offline) {
			map = new UnfoldingMap(this, 200, 50, 700, 500, new MBTilesMapProvider(mbTilesString));
			earthquakesURL = "2.5_week.atom";
			
		}
		else {
			map = new UnfoldingMap(this, 200, 50, 700, 500, new Google.GoogleMapProvider());
			
		}
		
		map.zoomToLevel(2);
		MapUtils.createDefaultEventDispatcher(this, map);
		
		List<Marker> markers = new ArrayList<Marker>();
		
		List<PointFeature> earthquakes = ParseFeed.parseEarthquake(this,earthquakesURL);
		
		if(earthquakes.size()>0){
			PointFeature f = earthquakes.get(0);
			System.out.println(f.getProperties());
			Object magObj = f.getProperty("magnitude");
			float mag = Float.parseFloat(magObj.toString());
			
		}
		int yellow = color(255, 255, 0);
		
		
		
	}
	
	private SimplePointMarker createMarker(PointFeature feature){
		
		return new SimplePointMarker(feature.getLocation());
		
	}
	public void draw(){
		background(10);
		map.draw();
		addKey();
	}
	private void addKey(){
		//fsþdlfösdþlf
	}
	
	
}
