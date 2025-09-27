package com.api.models.request;

import com.api.models.request.SignUpRequest.Builder;

public class ProfileRequest 
{
	private String firstName;
	private String lastName;
	private String email;
	private String mobileNumber;
	
	public ProfileRequest(String firstName, String lastName, String email, String mobileNumber) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.mobileNumber = mobileNumber;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	@Override
	public String toString() {
		return "ProfileRequest [firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", mobileNumber=" + mobileNumber + "]";
	}
	
	//Builder Design Pattern - Inner class
	public static class Builder
	{
		private String firstName;
		private String lastName;
		private String email;
		private String mobileNumber;
		
		public Builder firstName(String firstName)
		{
			this.firstName = firstName;
			return this; // return current object
		}
		
		public Builder lastName(String lastName)
		{
			this.lastName = lastName;
			return this; // return current object
		}
		
		public Builder email(String email)
		{
			this.email = email;
			return this; // return current object
		}
		
		public Builder mobileNumber(String mobileNumber)
		{
			this.mobileNumber = mobileNumber;
			return this; // return current object
		}
		
		public ProfileRequest build()
		{
			ProfileRequest profileRequest = new ProfileRequest(firstName, lastName, email, mobileNumber);
			return profileRequest;
		}
		
	}
	

	

}
