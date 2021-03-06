package com.jifenke.lepluslive.Address.domain.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.jifenke.lepluslive.lejiauser.domain.entities.LeJiaUser;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * Created by wcg on 16/3/20.
 */
@Entity
@Table(name = "Address")
public class Address {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  @JsonIgnore
  @OneToOne
  private LeJiaUser leJiaUser;

  private String name;

  private String location;

  private String phoneNumber;

  private String province;

  private String city;

  private String county;

  private Integer state = 0;  //1=默认地址  0=非默认  2=已失效，前端不展示

  public Integer getState() {
    return state;
  }

  public void setState(Integer state) {
    this.state = state;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public String getCounty() {
    return county;
  }

  public void setCounty(String county) {
    this.county = county;
  }

  public String getProvince() {
    return province;
  }

  public void setProvince(String province) {
    this.province = province;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public LeJiaUser getLeJiaUser() {
    return leJiaUser;
  }

  public void setLeJiaUser(LeJiaUser leJiaUser) {
    this.leJiaUser = leJiaUser;
  }
}
