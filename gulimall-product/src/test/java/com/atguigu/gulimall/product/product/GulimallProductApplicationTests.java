package com.atguigu.gulimall.product.product;

import com.atguigu.gulimall.product.entity.BrandEntity;
import com.atguigu.gulimall.product.service.BrandService;
import com.atguigu.gulimall.product.service.impl.BrandServiceImpl;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;


@SpringBootTest
public class GulimallProductApplicationTests {

    @Autowired
    BrandService brandService ;

    @Test
    public void contextLoads() {
        BrandEntity brandEntity = new BrandEntity();
        brandEntity.setDescript("123");
        brandEntity.setName("測試333");
        brandEntity.setFirstLetter("1");
        brandEntity.setLogo("1");
        brandEntity.setShowStatus(1);
        brandEntity.setSort(1);
        brandEntity.setBrandId(13L);
        try  {
            brandService.updateById(brandEntity);
        }catch (Exception ce){
            System.out.println(ce.getMessage());
        }

        System.out.println("成功");
    }

}
