package br.ufrn.transporte.model;

public class Localizacao {
	
	private String latitude;
	
	private String longitude;
	
	public Localizacao() {}

	public Localizacao(String latitude, String longitude) {
		this.latitude = latitude;
		this.longitude = longitude;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	
}
