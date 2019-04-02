package com.example.yanyue.pojo;

import java.io.Serializable;
import java.util.List;
/**
 * @ClassName Resource
 * @Author yanyue
 * @Description 资源实体类
 * @Date 10:12 2019/3/25
 * @Version 1.0
 **/
public class Resource implements Serializable {
    private Integer resourceId;//资源id
    private String resourceName;//资源名
    private String url;//资源路径

    private Integer resourcePid;
    private List<Resource> resources;

    public Integer getResourceId() {
        return resourceId;
    }

    public void setResourceId(Integer resourceId) {
        this.resourceId = resourceId;
    }

    public String getResourceName() {
        return resourceName;
    }

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getResourcePid() {
        return resourcePid;
    }

    public void setResourcePid(Integer resourcePid) {
        this.resourcePid = resourcePid;
    }

    public List<Resource> getResources() {
        return resources;
    }

    public void setResources(List<Resource> resources) {
        this.resources = resources;
    }

    public Resource() {
    }

    public Resource(Integer resourceId, String resourceName, String url, Integer resourcePid, List<Resource> resources) {
        this.resourceId = resourceId;
        this.resourceName = resourceName;
        this.url = url;
        this.resourcePid = resourcePid;
        this.resources = resources;
    }

    @Override
    public String toString() {
        return "Resource{" + "resourceId=" + resourceId + ", resourceName='" + resourceName + '\'' + ", url='" + url + '\'' + ", resourcePid=" + resourcePid + ", resources=" + resources + '}';
    }
}