package com.att.treasurehunt.entity;

import org.springframework.data.mongodb.core.mapping.Field;
import java.util.Date;

public class ServiceSubscription {
    @Field("plan_details")
    private PlanDetails planDetails;

    @Field("service_id")
    private String serviceId;

    @Field("service_name")
    private String serviceName;

    private String status;

    @Field("subscription_date")
    private Date subscriptionDate;

    // Getters and setters

    public PlanDetails getPlanDetails() {
        return planDetails;
    }

    public void setPlanDetails(PlanDetails planDetails) {
        this.planDetails = planDetails;
    }

    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getSubscriptionDate() {
        return subscriptionDate;
    }

    public void setSubscriptionDate(Date subscriptionDate) {
        this.subscriptionDate = subscriptionDate;
    }

    
}
