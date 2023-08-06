package org.java_configuration.model;

public class City {
	
	private ElectricStation electricStation;
	private SubwayStation subwayStation;
	private Libraries libraries;
	
	public City() {
		
	}

	/**
	 * @param electricStation
	 * @param subwayStation
	 * @param libraries
	 */
	public City(ElectricStation electricStation, SubwayStation subwayStation, Libraries libraries) {
		super();
		this.electricStation = electricStation;
		this.subwayStation = subwayStation;
		this.libraries = libraries;
	}

	/**
	 * @return the electricStation
	 */
	public ElectricStation getElectricStation() {
		return electricStation;
	}

	/**
	 * @param electricStation the electricStation to set
	 */
	public void setElectricStation(ElectricStation electricStation) {
		this.electricStation = electricStation;
	}

	/**
	 * @return the subwayStation
	 */
	public SubwayStation getSubwayStation() {
		return subwayStation;
	}

	/**
	 * @param subwayStation the subwayStation to set
	 */
	public void setSubwayStation(SubwayStation subwayStation) {
		this.subwayStation = subwayStation;
	}

	/**
	 * @return the libraries
	 */
	public Libraries getLibraries() {
		return libraries;
	}

	/**
	 * @param libraries the libraries to set
	 */
	public void setLibraries(Libraries libraries) {
		this.libraries = libraries;
	}

	@Override
	public String toString() {
		return "City [electricStation=" + electricStation + ", subwayStation=" + subwayStation + ", libraries="
				+ libraries + "]";
	}

}
