package com.test1;

public class BeanStackData {
	private String stackCode;
	private String stackName;
	private String localenvironment;
	private String tradeenvironment;
	private String shortDescription;
	private String multiStackOption;
	private String stackParams;
	private Integer uploadVersion;
	private String launchEnvironment;
	private String manageEnvironment;
	private String status;

	public BeanStackData() {

	}

	public BeanStackData(String stackCode, String stackName, String localenvironment, String tradeenvironment,
			String shortDescription, String multiStackOption, String stackParams, Integer uploadVersion,
			String launchEnvironment, String manageEnvironment, String status) {
		super();
		this.stackCode = stackCode;
		this.stackName = stackName;
		this.localenvironment = localenvironment;
		this.tradeenvironment = tradeenvironment;
		this.shortDescription = shortDescription;
		this.multiStackOption = multiStackOption;
		this.stackParams = stackParams;
		this.uploadVersion = uploadVersion;
		this.launchEnvironment = launchEnvironment;
		this.manageEnvironment = manageEnvironment;
		this.status = status;
	}

	public String getStackCode() {
		return stackCode;
	}

	public void setStackCode(String stackCode) {
		this.stackCode = stackCode;
	}

	public String getStackName() {
		return stackName;
	}

	public void setStackName(String stackName) {
		this.stackName = stackName;
	}

	public String getLocalenvironment() {
		return localenvironment;
	}

	public void setLocalenvironment(String localenvironment) {
		this.localenvironment = localenvironment;
	}

	public String getTradeenvironment() {
		return tradeenvironment;
	}

	public void setTradeenvironment(String tradeenvironment) {
		this.tradeenvironment = tradeenvironment;
	}

	public String getShortDescription() {
		return shortDescription;
	}

	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}

	public String getMultiStackOption() {
		return multiStackOption;
	}

	public void setMultiStackOption(String multiStackOption) {
		this.multiStackOption = multiStackOption;
	}

	public String getStackParams() {
		return stackParams;
	}

	public void setStackParams(String stackParams) {
		this.stackParams = stackParams;
	}

	public Integer getUploadVersion() {
		return uploadVersion;
	}

	public void setUploadVersion(Integer uploadVersion) {
		this.uploadVersion = uploadVersion;
	}

	public String getLaunchEnvironment() {
		return launchEnvironment;
	}

	public void setLaunchEnvironment(String launchEnvironment) {
		this.launchEnvironment = launchEnvironment;
	}

	public String getManageEnvironment() {
		return manageEnvironment;
	}

	public void setManageEnvironment(String manageEnvironment) {
		this.manageEnvironment = manageEnvironment;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
