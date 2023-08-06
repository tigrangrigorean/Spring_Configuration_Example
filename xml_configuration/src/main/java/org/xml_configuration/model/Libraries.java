package org.xml_configuration.model;

public class Libraries {
	
	private int readingRooms;
	
	public Libraries() {
		
	}

	/**
	 * @param readingRooms
	 */
	public Libraries(int readingRooms) {
		super();
		this.readingRooms = readingRooms;
	}

	/**
	 * @return the readingRooms
	 */
	public int getReadingRooms() {
		return readingRooms;
	}

	/**
	 * @param readingRooms the readingRooms to set
	 */
	public void setReadingRooms(int readingRooms) {
		this.readingRooms = readingRooms;
	}

	@Override
	public String toString() {
		return "Libraries [readingRooms=" + readingRooms + "]";
	}

}
