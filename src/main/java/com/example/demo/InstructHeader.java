package com.example.demo;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class InstructHeader {
    private Long instructHeaderId;
      private String name;
      private String description;
      private String label;
      private String mark;
      private Set<InstructDetail> instructDetails = new HashSet<InstructDetail>();
      private String defaultCode;
      private String requiredProduct;
      private Long sortOrder;
      private Long lastUpdatedBy;
      private Date lastUpdateTimestamp;



      public Long getInstructionHeaderId()
      {
        return instructHeaderId;
      }

    public void setInstructionHeaderId(Long id)
    {
       instructHeaderId = id;
    }


      public String getName()
      {
        return name;
      }

    public String getMark()
    {
      return mark;
    }


    public String getLabel()
    {
      return label;
    }

    public String getRequiredProduct()
    {
      return name;
    }

      public String getDescription()
      {
        return description;
      }

      public Set<InstructDetail> getInstructDetails()
      {
        return instructDetails;
      }

      public String getDefaultCode()
      {
        return defaultCode;
      }

    public Long getSortOrder()
    {
      return sortOrder;
    }

    public Long getLastUpdatedBy()
    {
      return lastUpdatedBy;
    }

    public Date getLastUpdateTimestamp() {
           return lastUpdateTimestamp;
     }

     public void setLastUpdateTimestamp(Date date) {
           this.lastUpdateTimestamp = date;
     }

    @Override
              public String toString() {
                  return "InstructHeader{" +
                          "instructionHeaderId='" + instructHeaderId + '\'' +
                          ", description=" + description +
                          ", name=" + name +
                          ", defaultCode=" + defaultCode +
                          ", lastUpdateBy=" + lastUpdatedBy +
                          ", lastUpdateTimestamp=" + lastUpdateTimestamp +
                          '}';
              }
}