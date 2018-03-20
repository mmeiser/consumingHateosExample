package com.example.demo;

import java.util.Date;

public class LocationUnitType {

    private Long locationUnitTypeId;
    private String code;
    private String name;
    private Long lastUpdateBy;
    private Date lastUpdateTimestamp;





    public Long getLocationUnitTypeId() {
        return locationUnitTypeId;
    }

    public void setLocationUnitTypeId(Long locationUnitTypeId) {
        this.locationUnitTypeId = locationUnitTypeId;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getLastUpdateBy() {
          return lastUpdateBy;
    }

    public void setLastUpdateBy(Long by) {
          this.lastUpdateBy = by;
    }


    public Date getLastUpdateTimestamp() {
          return lastUpdateTimestamp;
    }

    public void setLastUpdateTimestamp(Date date) {
          this.lastUpdateTimestamp = date;
    }

    @Override
            public String toString() {
                return "LocationUnitType{" +
                        "locationUnitTypeId='" + locationUnitTypeId + '\'' +
                        ", code=" + code +
                        ", name=" + name +
                        ", lastUpdateBy=" + lastUpdateBy +
                        ", lastUpdateTimestamp=" + lastUpdateTimestamp +
                        '}';
            }

}
