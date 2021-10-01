package com.antique.muzi.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class UmsMemberDetail implements Serializable {
    private Integer id;

    @ApiModelProperty(value = "微信用户id")
    private Long memId;

    @ApiModelProperty(value = "孕妇姓名")
    private String pName;

    @ApiModelProperty(value = "孕妇电话")
    private String pPhone;

    @ApiModelProperty(value = "预产期")
    private Date childbirth;

    @ApiModelProperty(value = "地址")
    private String pAddress;

    @ApiModelProperty(value = "孕妇年龄")
    private String pAge;

    private Date createTime;

    private Date updateTime;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Long getMemId() {
        return memId;
    }

    public void setMemId(Long memId) {
        this.memId = memId;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public String getpPhone() {
        return pPhone;
    }

    public void setpPhone(String pPhone) {
        this.pPhone = pPhone;
    }

    public Date getChildbirth() {
        return childbirth;
    }

    public void setChildbirth(Date childbirth) {
        this.childbirth = childbirth;
    }

    public String getpAddress() {
        return pAddress;
    }

    public void setpAddress(String pAddress) {
        this.pAddress = pAddress;
    }

    public String getpAge() {
        return pAge;
    }

    public void setpAge(String pAge) {
        this.pAge = pAge;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", memId=").append(memId);
        sb.append(", pName=").append(pName);
        sb.append(", pPhone=").append(pPhone);
        sb.append(", childbirth=").append(childbirth);
        sb.append(", pAddress=").append(pAddress);
        sb.append(", pAge=").append(pAge);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}