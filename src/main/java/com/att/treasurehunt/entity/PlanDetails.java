package com.att.treasurehunt.entity;

import org.springframework.data.mongodb.core.mapping.Field;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PlanDetails {
    @Field("data_limit")
    private String dataLimit;

    @Field("devices_supported")
    private String devicesSupported;

    @Field("international_calls")
    private String internationalCalls;

    @Field("monthly_cost")
    private Double monthlyCost;

    @Field("package_type")
    private String packageType;

    @Field("plan_name")
    private String planName;

    private String speed;

    @Field("storage_capacity")
    private String storageCapacity;

    // Getters and setters

    public String getDataLimit() {
        return dataLimit;
    }

    public void setDataLimit(String dataLimit) {
        this.dataLimit = dataLimit;
    }

    public String getDevicesSupported() {
        return devicesSupported;
    }

    public void setDevicesSupported(String devicesSupported) {
        this.devicesSupported = devicesSupported;
    }

    public String getInternationalCalls() {
        return internationalCalls;
    }

    public void setInternationalCalls(String internationalCalls) {
        this.internationalCalls = internationalCalls;
    }

    public Double getMonthlyCost() {
        return monthlyCost;
    }

    public void setMonthlyCost(Double monthlyCost) {
        this.monthlyCost = monthlyCost;
    }

    public String getPackageType() {
        return packageType;
    }

    public void setPackageType(String packageType) {
        this.packageType = packageType;
    }

    public String getPlanName() {
        return planName;
    }

    public void setPlanName(String planName) {
        this.planName = planName;
    }

    public String getSpeed() {
        return speed;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }

    public String getStorageCapacity() {
        return storageCapacity;
    }

    public void setStorageCapacity(String storageCapacity) {
        this.storageCapacity = storageCapacity;
    }
}
