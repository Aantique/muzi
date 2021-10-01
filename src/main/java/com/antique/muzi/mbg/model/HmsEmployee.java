package com.antique.muzi.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class HmsEmployee implements Serializable {
    @ApiModelProperty(value = "人员id")
    private Integer id;

    @ApiModelProperty(value = "人员名字")
    private String name;

    @ApiModelProperty(value = "人员简介")
    private String info;

    @ApiModelProperty(value = "所属部门id")
    private Integer deptId;

    @ApiModelProperty(value = "角色id")
    private Integer roleId;

    @ApiModelProperty(value = "网址")
    private String picInfo;

    @ApiModelProperty(value = "职能名")
    private String roleName;

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

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public Integer getDeptId() {
        return deptId;
    }

    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public String getPicInfo() {
        return picInfo;
    }

    public void setPicInfo(String picInfo) {
        this.picInfo = picInfo;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", info=").append(info);
        sb.append(", deptId=").append(deptId);
        sb.append(", roleId=").append(roleId);
        sb.append(", picInfo=").append(picInfo);
        sb.append(", roleName=").append(roleName);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}