package com.antique.muzi.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class CmsArticle implements Serializable {
    private Integer id;

    @ApiModelProperty(value = "文章题目")
    private String title;

    @ApiModelProperty(value = "文章类容（链接）")
    private String contentUrl;

    @ApiModelProperty(value = "创建人")
    private String createAdmin;

    @ApiModelProperty(value = "文章浏览量")
    private String pageviews;

    @ApiModelProperty(value = "文章封面")
    private String cover;

    @ApiModelProperty(value = "删除状态 1-->删除 0-->未删除")
    private Integer deleteStatus;

    @ApiModelProperty(value = "文章类型 1->精选文章 2->发现页文章 3->发现和精选都显示，4->科室导航，5->孕育百问百答")
    private String type;

    @ApiModelProperty(value = "创建事件")
    private Date createTime;

    @ApiModelProperty(value = "排序字段")
    private Integer sort;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContentUrl() {
        return contentUrl;
    }

    public void setContentUrl(String contentUrl) {
        this.contentUrl = contentUrl;
    }

    public String getCreateAdmin() {
        return createAdmin;
    }

    public void setCreateAdmin(String createAdmin) {
        this.createAdmin = createAdmin;
    }

    public String getPageviews() {
        return pageviews;
    }

    public void setPageviews(String pageviews) {
        this.pageviews = pageviews;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public Integer getDeleteStatus() {
        return deleteStatus;
    }

    public void setDeleteStatus(Integer deleteStatus) {
        this.deleteStatus = deleteStatus;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", title=").append(title);
        sb.append(", contentUrl=").append(contentUrl);
        sb.append(", createAdmin=").append(createAdmin);
        sb.append(", pageviews=").append(pageviews);
        sb.append(", cover=").append(cover);
        sb.append(", deleteStatus=").append(deleteStatus);
        sb.append(", type=").append(type);
        sb.append(", createTime=").append(createTime);
        sb.append(", sort=").append(sort);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}