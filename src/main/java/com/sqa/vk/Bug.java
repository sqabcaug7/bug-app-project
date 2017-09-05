package com.sqa.vk;
public class Bug {

	private int bugid;

	private String reporterName;

	private String bugName;

	private char bugCategory;

	private String operatingSystem;

	private String date;

	private String bugDetails;

	private double frequency;

	private boolean isActive;

	/**
	 * @param bugid
	 * @param reporterName
	 * @param bugName
	 * @param bugCategory
	 * @param operatingSystem
	 * @param date
	 * @param bugDetails
	 * @param frequency
	 * @param isActive
	 */
	public Bug(int bugid, String reporterName, String bugName, char bugCategory, String operatingSystem, String date,
			String bugDetails, double frequency, boolean isActive) {
		super();
		this.bugid = bugid;
		this.reporterName = reporterName;
		this.bugName = bugName;
		this.bugCategory = bugCategory;
		this.operatingSystem = operatingSystem;
		this.date = date;
		this.bugDetails = bugDetails;
		this.frequency = frequency;
		this.isActive = isActive;
	}

	public Bug(String reporterName, String bugName) {
		super();
		this.reporterName = reporterName;
		this.bugName = bugName;
	}

	public Bug(String reporterName, String bugName, String date, boolean isActive) {
		super();
		this.reporterName = reporterName;
		this.bugName = bugName;
		this.date = date;
		this.isActive = isActive;
	}

	public void applyBugFix() {
		System.out.println("This is applyBugFix method");
	}

	public void findSimilarBugs() {
		System.out.println("This is findSimilarBugs method");
	}

	/**
	 * @return the bugCategory
	 */
	public char getBugCategory() {
		return this.bugCategory;
	}

	/**
	 * @return the bugDetails
	 */
	public String getBugDetails() {
		return this.bugDetails;
	}

	/**
	 * @return the bugid
	 */
	public int getBugid() {
		return this.bugid;
	}

	/**
	 * @return the bugName
	 */
	public String getBugName() {
		return this.bugName;
	}

	/**
	 * @return the date
	 */
	public String getDate() {
		return this.date;
	}

	/**
	 * @return the frequency
	 */
	public double getFrequency() {
		return this.frequency;
	}

	/**
	 * @return the operatingSystem
	 */
	public String getOperatingSystem() {
		return this.operatingSystem;
	}

	/**
	 * @return the reporterName
	 */
	public String getReporterName() {
		return this.reporterName;
	}

	/**
	 * @return the isActive
	 */
	public boolean isActive() {
		return this.isActive;
	}

	public void recreateBugActivity() {
		System.out.println("This is recreateBugActivity method");
	}

	/**
	 * @param isActive
	 *            the isActive to set
	 */
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	/**
	 * @param bugCategory
	 *            the bugCategory to set
	 */
	public void setBugCategory(char bugCategory) {
		this.bugCategory = bugCategory;
	}

	/**
	 * @param bugDetails
	 *            the bugDetails to set
	 */
	public void setBugDetails(String bugDetails) {
		this.bugDetails = bugDetails;
	}

	/**
	 * @param bugid
	 *            the bugid to set
	 */
	public void setBugid(int bugid) {
		this.bugid = bugid;
	}

	/**
	 * @param bugName
	 *            the bugName to set
	 */
	public void setBugName(String bugName) {
		this.bugName = bugName;
	}

	/**
	 * @param date
	 *            the date to set
	 */
	public void setDate(String date) {
		this.date = date;
	}

	/**
	 * @param frequency
	 *            the frequency to set
	 */
	public void setFrequency(double frequency) {
		this.frequency = frequency;
	}

	/**
	 * @param operatingSystem
	 *            the operatingSystem to set
	 */
	public void setOperatingSystem(String operatingSystem) {
		this.operatingSystem = operatingSystem;
	}

	/**
	 * @param reporterName
	 *            the reporterName to set
	 */
	public void setReporterName(String reporterName) {
		this.reporterName = reporterName;
	}

	/**
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Bug [bugid=" + this.bugid + ", reporterName=" + this.reporterName + ", bugName=" + this.bugName
				+ ", bugCategory=" + this.bugCategory + ", operatingSystem=" + this.operatingSystem + ", date="
				+ this.date + ", bugDetails=" + this.bugDetails + ", frequency=" + this.frequency + ", isActive="
				+ this.isActive + "]";
	}
}
