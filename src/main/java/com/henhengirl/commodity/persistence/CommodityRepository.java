package com.henhengirl.commodity.persistence;

import com.henhengirl.commodity.pojo.Commodity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by admin on 2017/5/1.
 */
@Repository
public interface CommodityRepository extends JpaRepository<Commodity,Integer> {

    Commodity findById(Integer id);

    long countById(Integer id);
}
