package org.java_configuration.model;

public class SubwayStation {
	
	private int ticketBooths;
	private int platforms;
	
	public SubwayStation() {
		
	}

	/**
	 * @param ticketBooths
	 * @param platforms
	 */
	public SubwayStation(int ticketBooths, int platforms) {
		super();
		this.ticketBooths = ticketBooths;
		this.platforms = platforms;
	}

	/**
	 * @return the ticketBooths
	 */
	public int getTicketBooths() {
		return ticketBooths;
	}

	/**
	 * @param ticketBooths the ticketBooths to set
	 */
	public void setTicketBooths(int ticketBooths) {
		this.ticketBooths = ticketBooths;
	}

	/**
	 * @return the platforms
	 */
	public int getPlatforms() {
		return platforms;
	}

	/**
	 * @param platforms the platforms to set
	 */
	public void setPlatforms(int platforms) {
		this.platforms = platforms;
	}

	@Override
	public String toString() {
		return "SubwayStation [ticketBooths=" + ticketBooths + ", platforms=" + platforms + "]";
	}

}
