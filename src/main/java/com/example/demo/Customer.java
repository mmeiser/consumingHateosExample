package com.example.demo;

import java.util.*;

public class Customer {


        private Long customerId;
        private String firstname;
        private String middlename;
        private String lastname;
        private String title;
        private String phone;
        private String email;
        private String password;
        private String taxExemptId;
        private Integer homeStoreId;
        private Integer lastStoreId;
        private Location lastLocation;
        private String lastOrderType;
        private String lastPaymentType;
        private Boolean allowEmailFlag;
        private Boolean allowCheckFlag;
        private String lastOrder;
        private Integer statusId;
        private String comments;
        private String cellphone;
        private Boolean allowSmsFlag;
        private Date lastOrderTimestamp;
        private Date lastLogonTimestamp;
        private Date undeliverableTimestamp;
        private Date unsubscribeTimestamp;
        private Date firstOrderTimestamp;
        private Boolean testCustomerFlag;
        private Date subscribeTimestamp;  // email subscription activity timestamp
        private Integer birthMonth;
        private Integer birthDayOfMonth;
        private Long lastOrderHeaderId;

        private Set<Location> locations = new HashSet<Location>();

        public Set<Location> getLocations()
        {
            return locations;
        }

        public Location getLastLocation() {
            return lastLocation;
        }


        public Long getCustomerId() {
            return customerId;
        }

        public void setCustomerId(Long customerId) {
            this.customerId = customerId;
        }

        public String getFirstname() {
            return firstname;
        }

        public void setFirstname(String firstname) {
            this.firstname = firstname;
        }

        public String getMiddlename() {
            return middlename;
        }

        public void setMiddlename(String middlename) {
            this.middlename = middlename;
        }

        public String getLastname() {
            return lastname;
        }

        public void setLastname(String lastname) {
            this.lastname = lastname;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
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

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public String getTaxExemptId() {
            return taxExemptId;
        }

        public void setTaxExemptId(String taxExemptId) {
            this.taxExemptId = taxExemptId;
        }

        public Integer getHomeStoreId() {
            return homeStoreId;
        }

        public void setHomeStoreId(Integer homeStoreId) {
            this.homeStoreId = homeStoreId;
        }

        public Integer getLastStoreId() {
            return lastStoreId;
        }

        public void setLastStoreId(Integer lastStoreId) {
            this.lastStoreId = lastStoreId;
        }


        public String getLastOrderType() {
            return lastOrderType;
        }

        public void setLastOrderType(String lastOrderType) {
            this.lastOrderType = lastOrderType;
        }

        public String getLastPaymentType() {
            return lastPaymentType;
        }

        public void setLastPaymentType(String lastPaymentType) {
            this.lastPaymentType = lastPaymentType;
        }

        public Boolean isAllowEmailFlag() {
            return allowEmailFlag;
        }

        public void setAllowEmailFlag(Boolean allowEmailFlag) {
            this.allowEmailFlag = allowEmailFlag;
        }

        public Boolean isAllowCheckFlag() {
            return allowCheckFlag;
        }

        public void setAllowCheckFlag(Boolean allowCheckFlag) {
            this.allowCheckFlag = allowCheckFlag;
        }

        public String getLastOrder() {
            return lastOrder;
        }

        public void setLastOrder(String lastOrder) {
            this.lastOrder = lastOrder;
        }

        public Integer getStatusId() {
            return statusId;
        }

        public void setStatusId(Integer statusId) {
            this.statusId = statusId;
        }

        public String getComments() {
            return comments;
        }

        public void setComments(String comments) {
            this.comments = comments;
        }

        public String getCellphone() {
            return cellphone;
        }

        public void setCellphone(String cellphone) {
            this.cellphone = cellphone;
        }

        public Boolean isAllowSmsFlag() {
            return allowSmsFlag;
        }

        public void setAllowSmsFlag(Boolean allowSmsFlag) {
            this.allowSmsFlag = allowSmsFlag;
        }



        public Date getLastOrderTimestamp() {
            return lastOrderTimestamp;
        }

        public void setLastOrderTimestamp(Date lastOrderTimestamp) {
            this.lastOrderTimestamp = lastOrderTimestamp;
        }





        public Date getFirstOrderTimestamp() {
            return firstOrderTimestamp;
        }

        public void setFirstOrderTimestamp(Date firstOrderTimestamp) {
            this.firstOrderTimestamp = firstOrderTimestamp;
        }


        public Date getLastLogonTimestamp() {
            return lastLogonTimestamp;
        }

        public void setLastLogonTimestamp(Date lastLogonTimestamp) {
            this.lastLogonTimestamp = lastLogonTimestamp;
        }

        public Date getUndeliverableTimestamp() {
            return undeliverableTimestamp;
        }

        public void setUndeliverableTimestamp(Date undeliverableTimestamp) {
            this.undeliverableTimestamp = undeliverableTimestamp;
        }

        public Date getUnsubscribeTimestamp() {
            return unsubscribeTimestamp;
        }

        public void setUnsubscribeTimestamp(Date unsubscribeTimestamp) {
            this.unsubscribeTimestamp = unsubscribeTimestamp;
        }

        public Boolean getTestCustomerFlag() {
            return testCustomerFlag;
        }

        public void setTestCustomerFlag(Boolean testCustomerFlag) {
            this.testCustomerFlag = testCustomerFlag;
        }

        public Date getSubscribeTimestamp() {
            return subscribeTimestamp;
        }

        public void setSubscribeTimestamp(Date subscribeTimestamp) {
            this.subscribeTimestamp = subscribeTimestamp;
        }


        /**
         * @return birth month as Integer
         */
        public Integer getBirthMonth() {
            return birthMonth;
        }

        /**
         * set birth month
         *
         * @param birthMonth
         */
        public void setBirthMonth(Integer birthMonth) {
            this.birthMonth = birthMonth;
        }

        /**
         * @return birth day of month as Integer
         */
        public Integer getBirthDayOfMonth() {
            return birthDayOfMonth;
        }

        /**
         * set birth day of month
         *
         * @param birthDayOfMonth
         */
        public void setBirthDayOfMonth(Integer birthDayOfMonth) {
            this.birthDayOfMonth = birthDayOfMonth;
        }


}