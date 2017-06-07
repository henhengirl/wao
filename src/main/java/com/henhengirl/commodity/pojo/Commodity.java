package com.henhengirl.commodity.pojo;


import io.swagger.annotations.ApiModelProperty;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by admin on 2017/5/1.
 */
@Entity
public class Commodity {

    @Id
    @GeneratedValue
    private Integer id ;

    @ApiModelProperty(position = 1, required = true, value = "商品名称")
    private String commodityName ;

    @ApiModelProperty(position = 2, required = true, value = "商品描述")
    private String commodityDscription ;

    @ApiModelProperty(position = 3, required = true, value = "商品库存")
    private Long commodityRepertory ;

    @ApiModelProperty(position = 4, required = true, value ="商品状态 1：销售中，2：下架，4：预售")
    private Integer commodityStatus ;

    @ApiModelProperty(position = 5, required = true, value ="商品产地")
    private String commodityHabitat ;

    @ApiModelProperty(position = 6, required = true, value ="商品图片地址")
    private String commodityUrl ;

    @ApiModelProperty(position = 7, required = true, value = "商品保质期，单位‘月’")
    private Integer commodityExpiration ;

    public Commodity() {
        //无参构造函数
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCommodityName() {
        return commodityName;
    }

    public void setCommodityName(String commodityName) {
        this.commodityName = commodityName;
    }

    public String getCommodityDscription() {
        return commodityDscription;
    }

    public void setCommodityDscription(String commodityDscription) {
        this.commodityDscription = commodityDscription;
    }

    public Long getCommodityRepertory() {
        return commodityRepertory;
    }

    public void setCommodityRepertory(Long commodityRepertory) {
        this.commodityRepertory = commodityRepertory;
    }

    public Integer getCommodityStatus() {
        return commodityStatus;
    }

    public void setCommodityStatus(Integer commodityStatus) {
        this.commodityStatus = commodityStatus;
    }

    public String getCommodityHabitat() {
        return commodityHabitat;
    }

    public void setCommodityHabitat(String commodityHabitat) {
        this.commodityHabitat = commodityHabitat;
    }

    public String getCommodityUrl() {
        return commodityUrl;
    }

    public void setCommodityUrl(String commodityUrl) {
        this.commodityUrl = commodityUrl;
    }

    public Integer getCommodityExpiration() {
        return commodityExpiration;
    }

    public void setCommodityExpiration(Integer commodityExpiration) {
        this.commodityExpiration = commodityExpiration;
    }
}
