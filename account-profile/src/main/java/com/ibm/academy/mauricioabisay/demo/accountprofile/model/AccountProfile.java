package com.ibm.academy.mauricioabisay.demo.accountprofile.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class AccountProfile {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String mainUsage;

    @Column
    private double monthlyIncomeLower;

    @Column
    private double monthlyIncomeUpper;

    @Column
    private int ageLower;

    @Column
    private int ageUpper;

    @Column
    private String creditCardProfile;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getMainUsage() {
        return mainUsage;
    }
    public void setMainUsage(String mainUsage) {
        this.mainUsage = mainUsage;
    }
    public double getMonthlyIncomeLower() {
        return monthlyIncomeLower;
    }
    public void setMonthlyIncomeLower(double monthlyIncomeLower) {
        this.monthlyIncomeLower = monthlyIncomeLower;
    }
    public double getMonthlyIncomeUpper() {
        return monthlyIncomeUpper;
    }
    public void setMonthlyIncomeUpper(double monthlyIncomeUpper) {
        this.monthlyIncomeUpper = monthlyIncomeUpper;
    }
    public int getAgeLower() {
        return ageLower;
    }
    public void setAgeLower(int ageLower) {
        this.ageLower = ageLower;
    }
    public int getAgeUpper() {
        return ageUpper;
    }
    public void setAgeUpper(int ageUpper) {
        this.ageUpper = ageUpper;
    }
    public String getCreditCardProfile() {
        return creditCardProfile;
    }
    public void setCreditCardProfile(String creditCardProfile) {
        this.creditCardProfile = creditCardProfile;
    }
}
