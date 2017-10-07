package br.ufrn.transporte.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Localizacao {
	
	@Column(name="tx_latitude")
	private String latitude;
	
	@Column(name="tx_longitude")
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
