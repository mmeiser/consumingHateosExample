package com.example.demo;

import java.math.BigDecimal;
import java.util.Set;

public class Location {

    private Long locationId;
     private LocationUnitType locationUnitType;
     private Boolean primaryFlag;
     private String locationName;
     private String address1;
     private String address2;
     private String address3;
     private String address4;
     private String city;
     private String postalCode;
     private String state;
     private String county;
     private String country;
     private String phone;
     private String email;
     private String deliveryRemarks;
     private BigDecimal latitude;
     private BigDecimal longitude;
     private Integer deliveryStoreId;
     private Integer carryoutStoreId;
     private String geocodeQuality;




     public Long getLocationId() {
         return locationId;
     }

     public void setLocationId(Long locationId) {
         this.locationId = locationId;
     }



     public LocationUnitType getLocationUnitType() {
         return locationUnitType;
     }

     public void setLocationUnitType(LocationUnitType locationUnitType) {
         this.locationUnitType = locationUnitType;
     }

     public Boolean isPrimaryFlag() {
         return primaryFlag;
     }

     public void setPrimaryFlag(Boolean primaryFlag) {
         this.primaryFlag = primaryFlag;
     }

     public String getLocationName() {
         return locationName;
     }

     public void setLocationName(String locationName) {
         this.locationName = locationName;
     }

     public String getAddress1() {
         return address1;
     }

     public void setAddress1(String address1) {
         this.address1 = address1;
     }

     public String getAddress2() {
         return address2;
     }

     public void setAddress2(String address2) {
         this.address2 = address2;
     }

     public String getAddress3() {
         return address3;
     }

     public void setAddress3(String address3) {
         this.address3 = address3;
     }

     public String getAddress4() {
         return address4;
     }

     public void setAddress4(String address4) {
         this.address4 = address4;
     }

     public String getCity() {
         return city;
     }

     public void setCity(String city) {
         this.city = city;
     }

     public String getPostalCode() {
         return postalCode;
     }

     public void setPostalCode(String postalCode) {
         this.postalCode = postalCode;
     }

     public String getState() {
         return state;
     }

     public void setState(String state) {
         this.state = state;
     }

     public String getCounty() {
         return county;
     }

     public void setCounty(String county) {
         this.county = county;
     }

     public String getCountry() {
         return country;
     }

     public void setCountry(String country) {
         this.country = country;
     }

     public String getPhone() {
         return phone;
     }

     public void setPhone(String phone) {
         this.phone = phone;
     }

     public String getEmail() {
         return email;
     }

     public void setEmail(String email) {
         this.email = email;
     }

     public String getDeliveryRemarks() {
         return deliveryRemarks;
     }

     public void setDeliveryRemarks(String deliveryRemarks) {
         this.deliveryRemarks = deliveryRemarks;
     }

     public BigDecimal getLatitude() {
         return latitude;
     }

     public void setLatitude(BigDecimal latitude) {
         this.latitude = latitude;
     }

     public BigDecimal getLongitude() {
         return longitude;
     }

     public void setLongitude(BigDecimal longitude) {
         this.longitude = longitude;
     }

     public Integer getDeliveryStoreId() {
         return deliveryStoreId;
     }

     public void setDeliveryStoreId(Integer deliveryStoreId) {
         this.deliveryStoreId = deliveryStoreId;
     }

     public Integer getCarryoutStoreId() {
         return carryoutStoreId;
     }

     public void setCarryoutStoreId(Integer carryoutStoreId) {
         this.carryoutStoreId = carryoutStoreId;
     }


     /**
      * @return the geocodeQuality
      */
     public String getGeocodeQuality() {
       return geocodeQuality;
     }


     /**
      * @param geocodeQuality the geocodeQuality to set
      */
     public void setGeocodeQuality(String geocodeQuality) {
       this.geocodeQuality = geocodeQuality;
     }


}