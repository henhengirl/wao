package com.henhengirl.commodity.controller;

import com.henhengirl.commodity.persistence.CommodityRepository;
import com.henhengirl.commodity.pojo.Commodity;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by admin on 2017/5/1.
 */
@SpringBootApplication
@RestController
@RequestMapping(value = "/commodity")
@Api("产品类")
public class CommodityController {

    private static final Logger LOGGER = LoggerFactory.getLogger(CommodityController.class);

    @Autowired
    private CommodityRepository commodityRepository ;

    @ApiOperation(value="获取商品列表", notes="获取商品列表")
    @RequestMapping(value = "" ,method = RequestMethod.GET)
    public List<Commodity> listCommodity(){
        return commodityRepository.findAll();
    }

    @ApiOperation(value="根据id获取商品", notes="根据id获取商品")
    @RequestMapping(value = "/{id}" ,method = RequestMethod.GET)
    public Commodity getCommodityById(@PathVariable(value = "id") Integer id){
        long result = commodityRepository.countById(id);
        LOGGER.info(String.valueOf(result));
        return commodityRepository.findById(id);
    }

    @ApiOperation(value="添加商品", notes="添加商品")
    @RequestMapping(value = "" ,method = RequestMethod.POST)
    public Commodity saveCommodity(@RequestBody Commodity commodity){
        return commodityRepository.save(commodity);
    }

    @ApiOperation(value="根据id修改商品", notes="根据id修改商品")
    @RequestMapping(value = "/{id}" ,method = RequestMethod.PUT)
    public Commodity updateCommodity(@PathVariable("id") Integer id,@RequestBody Commodity commodity){
        commodity.setId(id);
        return commodityRepository.save(commodity);
    }

    @ApiOperation(value="根据id删除商品", notes="根据id删除商品")
    @RequestMapping(value = "/{id}" ,method = RequestMethod.DELETE)
    public void removeCommodity(@PathVariable("id") Integer id){
        commodityRepository.delete(id);
    }
}
