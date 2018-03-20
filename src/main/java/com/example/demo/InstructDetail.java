package com.example.demo;

import java.util.Date;

public class InstructDetail  implements Comparable<InstructDetail> {
    private String code;
    private String name;
    private Long instructDetailId;
    private Long instructHeaderId;

    private String profitCode;
    private Integer sortOrder;
    private Integer instructHeaderSortOrder;
    private Long lastUpdatedBy;
    private Date lastUpdateTimestamp;



    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public Long getInstructDetailId() {
        return instructDetailId;
    }

    public String getProfitCode() {
        return profitCode;
    }

    public Integer getSortOrder() {
        return sortOrder;
    }

     public Integer getInstructHeaderSortOrder() {
         return instructHeaderSortOrder;
     }

    public Long getInstructHeaderId() {
         return instructHeaderId;
     }

    public Long getLastUpdatedBy() {
          return lastUpdatedBy;
      }


    public void setInstructHeaderSortOrder(Integer myInt) {
          instructHeaderSortOrder = myInt;
     }
    public Date getLastUpdateTimestamp() {
           return lastUpdateTimestamp;
     }

     public void setLastUpdateTimestamp(Date date) {
           this.lastUpdateTimestamp = date;
     }

    /**
     * compares the instruct header sort order first, if they are equal,
     * then compare the instruct detail sort order
     *
     * @param o
     * @return
     */
    public int compareTo(InstructDetail o) {
        int comparison = this.instructHeaderSortOrder.compareTo(o.instructHeaderSortOrder);

        return (0 == comparison) ? this.sortOrder.compareTo(o.sortOrder) : comparison;
    }

}