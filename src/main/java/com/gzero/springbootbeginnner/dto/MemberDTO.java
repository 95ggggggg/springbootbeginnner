package com.gzero.springbootbeginnner.dto;

public class MemberDTO {

    private String name;
    private String address;
    private String organization;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getOrganization() {
        return organization;
    }

    public void setOrganization(String organization) {
        this.organization = organization;
    }

    @Override
    public String toString() {
        return "MemberDTO{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", organization='" + organization + '\'' +
                '}';
    }
}
