package com.example.demo;

public class Affiliate {

private Long affiliateId;
    private AffiliateType affiliateType;
    private String affiliateCode;
    private String description;
    private Long channelId;
    private String password;




    public Long getAffiliateId() {
        return affiliateId;
    }

    public void setAffiliateId(Long affiliateId) {
        this.affiliateId = affiliateId;
    }

    public AffiliateType getAffiliateType() {
        return affiliateType;
    }

    public void setAffiliateType(AffiliateType affiliateType) {
        this.affiliateType = affiliateType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAffiliateCode() {
        return affiliateCode;
    }

    public void setAffiliateCode(String affiliateCode) {
        this.affiliateCode = affiliateCode;
    }

    public Long getChannelId() {
        return channelId;
    }

    public void setChannelId(Long channelId) {
        this.channelId = channelId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }



    public boolean validatePassword(String affiliatePassword) {
        return affiliatePassword.equals(password);
    }



    @Override
    public String toString() {
        return "Affiliate{" +
          "affiliateId=" + affiliateId +
          ", affiliateType=" + affiliateType +
          ", affiliateCode='" + affiliateCode + '\'' +
          ", description='" + description + '\'' +
          ", channelId=" + channelId +
          ", password='" + password  +
          '}';
    }

}