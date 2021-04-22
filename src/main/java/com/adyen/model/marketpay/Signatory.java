package com.adyen.model.marketpay;

import com.adyen.model.Address;
import com.adyen.model.Name;
import com.google.gson.annotations.SerializedName;

import java.util.Objects;

import static com.adyen.util.Util.toIndentedString;

public class Signatory {
  @SerializedName("address")
  private Address address = null;

  @SerializedName("email")
  private String email = null;

  @SerializedName("fullPhoneNumber")
  private String fullPhoneNumber = null;

  @SerializedName("jobTitle")
  private String jobTitle = null;

  @SerializedName("name")
  private Name name = null;

  @SerializedName("personalData")
  private PersonalData personalData = null;

  @SerializedName("phoneNumber")
  private PhoneNumber phoneNumber = null;

  @SerializedName("signatoryCode")
  private String signatoryCode = null;

  @SerializedName("signatoryReference")
  private String signatoryReference = null;

  @SerializedName("webAddress")
  private String webAddress = null;

  public Signatory address(Address address) {
    this.address = address;
    return this;
  }

  /**
   * Get address
   * @return address
   **/
  public Address getAddress() {
    return address;
  }

  public void setAddress(Address address) {
    this.address = address;
  }

  public Signatory email(String email) {
    this.email = email;
    return this;
  }

  /**
   * The e-mail address of the contact.
   * @return email
   **/
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public Signatory fullPhoneNumber(String fullPhoneNumber) {
    this.fullPhoneNumber = fullPhoneNumber;
    return this;
  }

  /**
   * The phone number of the contact provided as a single string.  It will be handled as a landline phone. **Examples:** \&quot;0031 6 11 22 33 44\&quot;, \&quot;+316/1122-3344\&quot;, \&quot;(0031) 611223344\&quot;
   * @return fullPhoneNumber
   **/
  public String getFullPhoneNumber() {
    return fullPhoneNumber;
  }

  public void setFullPhoneNumber(String fullPhoneNumber) {
    this.fullPhoneNumber = fullPhoneNumber;
  }

  public Signatory name(Name name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   **/
  public Name getName() {
    return name;
  }

  public void setName(Name name) {
    this.name = name;
  }

  public Signatory personalData(PersonalData personalData) {
    this.personalData = personalData;
    return this;
  }

  /**
   * Get personalData
   * @return personalData
   **/
  public PersonalData getPersonalData() {
    return personalData;
  }

  public void setPersonalData(PersonalData personalData) {
    this.personalData = personalData;
  }

  public Signatory phoneNumber(PhoneNumber phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

  /**
   * Get phoneNumber
   * @return phoneNumber
   **/
  public PhoneNumber getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(PhoneNumber phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public Signatory signatoryCode(String signatoryCode) {
    this.signatoryCode = signatoryCode;
    return this;
  }

  /**
   * The unique identifier (UUID) of the Signatory. &gt;**If, during an Account Holder create or update request, this field is left blank (but other fields provided), a new Signatory will be created with a procedurally-generated UUID.**  &gt;**If, during an Account Holder create request, a UUID is provided, the creation of the Signatory will fail while the creation of the Account Holder will continue.**  &gt;**If, during an Account Holder update request, a UUID that is not correlated with an existing Signatory is provided, the update of the Signatory will fail.**  &gt;**If, during an Account Holder update request, a UUID that is correlated with an existing Signatory is provided, the existing Signatory will be updated.**
   * @return signatoryCode
   **/
  public String getSignatoryCode() {
    return signatoryCode;
  }

  public void setSignatoryCode(String signatoryCode) {
    this.signatoryCode = signatoryCode;
  }

  public Signatory signatoryReference(String signatoryReference) {
    this.signatoryReference = signatoryReference;
    return this;
  }

  /**
   * Merchant reference to the Signatory.
   * @return signatoryReference
   **/
  public String getSignatoryReference() {
    return signatoryReference;
  }

  public void setSignatoryReference(String signatoryReference) {
    this.signatoryReference = signatoryReference;
  }

  public Signatory webAddress(String webAddress) {
    this.webAddress = webAddress;
    return this;
  }

  /**
   * The URL of the website of the contact.
   * @return webAddress
   **/
  public String getWebAddress() {
    return webAddress;
  }

  public void setWebAddress(String webAddress) {
    this.webAddress = webAddress;
  }

  public Signatory jobTitle(String jobTitle) {
    this.jobTitle = jobTitle;
    return this;
  }

  public String getJobTitle() {
    return jobTitle;
  }

  public void setJobTitle(String jobTitle) {
    this.jobTitle = jobTitle;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Signatory signatory = (Signatory) o;
    return Objects.equals(this.address, signatory.address) &&
            Objects.equals(this.email, signatory.email) &&
            Objects.equals(this.fullPhoneNumber, signatory.fullPhoneNumber) &&
            Objects.equals(this.name, signatory.name) &&
            Objects.equals(this.personalData, signatory.personalData) &&
            Objects.equals(this.phoneNumber, signatory.phoneNumber) &&
            Objects.equals(this.signatoryCode, signatory.signatoryCode) &&
            Objects.equals(this.signatoryReference, signatory.signatoryReference) &&
            Objects.equals(this.webAddress, signatory.webAddress) &&
            Objects.equals(this.jobTitle, signatory.jobTitle);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, email, fullPhoneNumber, name, personalData, phoneNumber, signatoryCode, signatoryReference, webAddress, jobTitle);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Signatory {\n");

    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    fullPhoneNumber: ").append(toIndentedString(fullPhoneNumber)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    personalData: ").append(toIndentedString(personalData)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    signatoryCode: ").append(toIndentedString(signatoryCode)).append("\n");
    sb.append("    signatoryReference: ").append(toIndentedString(signatoryReference)).append("\n");
    sb.append("    webAddress: ").append(toIndentedString(webAddress)).append("\n");
    sb.append("    jobTitle: ").append(toIndentedString(jobTitle)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
