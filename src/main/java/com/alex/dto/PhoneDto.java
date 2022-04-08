package com.alex.dto;

public class PhoneDto {
    private Long id;

    private String phoneNumber;

    private HumanDto humanDto;

    public PhoneDto() {
    }

    public PhoneDto(String phoneNumber, HumanDto humanDto) {
        this.phoneNumber = phoneNumber;
        this.humanDto = humanDto;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public HumanDto getHumanDto() {
        return humanDto;
    }

    public void setHumanDto(HumanDto humanDto) {
        this.humanDto = humanDto;
    }
}
