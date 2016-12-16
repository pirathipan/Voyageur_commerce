package model;

public class Ville {

	private String name;
	private float lat ;
	private float lon;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getlat () {
		return lat ;
	}
	public void setlat (float lat ) {
		this.lat  = lat ;
	}
	public float getlon() {
		return lon;
	}
	public void setlon(float lon) {
		this.lon = lon;
	}
	@Override
	public String toString() {
		return "Ville [name=" + name + ", latitude=" + lat + ", longitude=" + lon + "]";
	}
}
