package org.annotation_configuration.model;

import org.springframework.stereotype.Component;

@Component
public class ElectricStation {
	
	private int chargingPoints;
	private String energyStoragePoints;
	
	public ElectricStation() {
		
	}

	/**
	 * @param chargingPoints
	 * @param energyStoragePoints
	 */
	public ElectricStation(int chargingPoints, String energyStoragePoints) {
		super();
		this.chargingPoints = chargingPoints;
		this.energyStoragePoints = energyStoragePoints;
	}

	/**
	 * @return the chargingPoints
	 */
	public int getChargingPoints() {
		return chargingPoints;
	}

	/**
	 * @param chargingPoints the chargingPoints to set
	 */
	public void setChargingPoints(int chargingPoints) {
		this.chargingPoints = chargingPoints;
	}

	/**
	 * @return the energyStoragePoints
	 */
	public String getEnergyStoragePoints() {
		return energyStoragePoints;
	}

	/**
	 * @param energyStoragePoints the energyStoragePoints to set
	 */
	public void setEnergyStoragePoints(String energyStoragePoints) {
		this.energyStoragePoints = energyStoragePoints;
	}

	@Override
	public String toString() {
		return "ElectricStation [chargingPoints=" + chargingPoints + ", energyStoragePoints=" + energyStoragePoints
				+ "]";
	}

}
