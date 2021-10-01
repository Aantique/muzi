package com.antique.muzi.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class CmsHospitalInfo implements Serializable {
    private Integer id;

    @ApiModelProperty(value = "医院名称")
    private String name;

    @ApiModelProperty(value = "医院图标（oss_url）")
    private String icon;

    @ApiModelProperty(value = "医院轮播图（url）")
    private String swiperlist;

    private String swiperlist1;

    private String swiperlist2;

    private String address;

    private String info;

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

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getSwiperlist() {
        return swiperlist;
    }

    public void setSwiperlist(String swiperlist) {
        this.swiperlist = swiperlist;
    }

    public String getSwiperlist1() {
        return swiperlist1;
    }

    public void setSwiperlist1(String swiperlist1) {
        this.swiperlist1 = swiperlist1;
    }

    public String getSwiperlist2() {
        return swiperlist2;
    }

    public void setSwiperlist2(String swiperlist2) {
        this.swiperlist2 = swiperlist2;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", icon=").append(icon);
        sb.append(", swiperlist=").append(swiperlist);
        sb.append(", swiperlist1=").append(swiperlist1);
        sb.append(", swiperlist2=").append(swiperlist2);
        sb.append(", address=").append(address);
        sb.append(", info=").append(info);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}