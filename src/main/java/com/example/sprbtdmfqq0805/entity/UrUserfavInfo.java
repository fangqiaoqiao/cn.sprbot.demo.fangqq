package com.example.sprbtdmfqq0805.entity;


public class UrUserfavInfo {

  private String favinsId;
  private String favObjectType;
  private String favObjectValue;
  private String opsourType;
  private String opsourValue;
  private String favType;
  private String favtempId;
  private java.sql.Date effDate;
  private java.sql.Date expDate;
  private java.sql.Date createTime;
  private String orderState;
  private String loginNo;
  private String loginAccept;
  private String servOrderId;
  private java.sql.Date opTime;
  private String opCode;


  public String getFavinsId() {
    return favinsId;
  }

  public void setFavinsId(String favinsId) {
    this.favinsId = favinsId;
  }


  public String getFavObjectType() {
    return favObjectType;
  }

  public void setFavObjectType(String favObjectType) {
    this.favObjectType = favObjectType;
  }


  public String getFavObjectValue() {
    return favObjectValue;
  }

  public void setFavObjectValue(String favObjectValue) {
    this.favObjectValue = favObjectValue;
  }


  public String getOpsourType() {
    return opsourType;
  }

  public void setOpsourType(String opsourType) {
    this.opsourType = opsourType;
  }


  public String getOpsourValue() {
    return opsourValue;
  }

  public void setOpsourValue(String opsourValue) {
    this.opsourValue = opsourValue;
  }


  public String getFavType() {
    return favType;
  }

  public void setFavType(String favType) {
    this.favType = favType;
  }


  public String getFavtempId() {
    return favtempId;
  }

  public void setFavtempId(String favtempId) {
    this.favtempId = favtempId;
  }


  public java.sql.Date getEffDate() {
    return effDate;
  }

  public void setEffDate(java.sql.Date effDate) {
    this.effDate = effDate;
  }


  public java.sql.Date getExpDate() {
    return expDate;
  }

  public void setExpDate(java.sql.Date expDate) {
    this.expDate = expDate;
  }


  public java.sql.Date getCreateTime() {
    return createTime;
  }

  public void setCreateTime(java.sql.Date createTime) {
    this.createTime = createTime;
  }


  public String getOrderState() {
    return orderState;
  }

  public void setOrderState(String orderState) {
    this.orderState = orderState;
  }


  public String getLoginNo() {
    return loginNo;
  }

  public void setLoginNo(String loginNo) {
    this.loginNo = loginNo;
  }


  public String getLoginAccept() {
    return loginAccept;
  }

  public void setLoginAccept(String loginAccept) {
    this.loginAccept = loginAccept;
  }


  public String getServOrderId() {
    return servOrderId;
  }

  public void setServOrderId(String servOrderId) {
    this.servOrderId = servOrderId;
  }


  public java.sql.Date getOpTime() {
    return opTime;
  }

  public void setOpTime(java.sql.Date opTime) {
    this.opTime = opTime;
  }


  public String getOpCode() {
    return opCode;
  }

  public void setOpCode(String opCode) {
    this.opCode = opCode;
  }

  @Override
  public String toString() {
    return "UrUserfavInfo{" +
            "favinsId='" + favinsId + '\'' +
            ", favObjectType='" + favObjectType + '\'' +
            ", favObjectValue='" + favObjectValue + '\'' +
            ", opsourType='" + opsourType + '\'' +
            ", opsourValue='" + opsourValue + '\'' +
            ", favType='" + favType + '\'' +
            ", favtempId='" + favtempId + '\'' +
            ", effDate=" + effDate +
            ", expDate=" + expDate +
            ", createTime=" + createTime +
            ", orderState='" + orderState + '\'' +
            ", loginNo='" + loginNo + '\'' +
            ", loginAccept='" + loginAccept + '\'' +
            ", servOrderId='" + servOrderId + '\'' +
            ", opTime=" + opTime +
            ", opCode='" + opCode + '\'' +
            '}';
  }
}
