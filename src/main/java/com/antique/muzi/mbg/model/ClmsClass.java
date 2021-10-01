package com.antique.muzi.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class ClmsClass implements Serializable {
    private Integer id;

    @ApiModelProperty(value = "课名")
    private String name;

    @ApiModelProperty(value = "课程开启日期，线上不过期，线下手动下线")
    private Date startDate;

    @ApiModelProperty(value = "讲师")
    private String teacher;

    @ApiModelProperty(value = "课程内容:线上则网址，线下则地址")
    private String contentUrl;

    @ApiModelProperty(value = "课程简介")
    private String info;

    @ApiModelProperty(value = "课程封面")
    private String pic;

    @ApiModelProperty(value = "0-->线上；1-->线下")
    private Integer classType;

    @ApiModelProperty(value = "开课地点")
    private String address;

    @ApiModelProperty(value = "创建时间")
    private Date createTime;

    @ApiModelProperty(value = "排序字段")
    private Integer sort;

    @ApiModelProperty(value = "0 未删除 ；1删除；2过期")
    private Integer deleteStatus;

    @ApiModelProperty(value = "0 未预约 ；1预约")
    private Integer isSubscribe = 0;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public String getContentUrl() {
        return contentUrl;
    }

    public void setContentUrl(String contentUrl) {
        this.contentUrl = contentUrl;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public Integer getClassType() {
        return classType;
    }

    public void setClassType(Integer classType) {
        this.classType = classType;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public Integer getDeleteStatus() {
        return deleteStatus;
    }

    public void setDeleteStatus(Integer deleteStatus) {
        this.deleteStatus = deleteStatus;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", startDate=").append(startDate);
        sb.append(", teacher=").append(teacher);
        sb.append(", contentUrl=").append(contentUrl);
        sb.append(", info=").append(info);
        sb.append(", pic=").append(pic);
        sb.append(", classType=").append(classType);
        sb.append(", address=").append(address);
        sb.append(", createTime=").append(createTime);
        sb.append(", sort=").append(sort);
        sb.append(", deleteStatus=").append(deleteStatus);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}