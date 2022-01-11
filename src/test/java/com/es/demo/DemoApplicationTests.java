package com.es.demo;

import com.es.demo.one.BoolQueryService;
import com.es.demo.one.IndexService;
import com.es.demo.one.IndexService2;
import com.es.demo.one.MatchQueryService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

    @Autowired
    private IndexService2 indexService2;

    @Autowired
    private IndexService indexService;

    @Autowired
    private BoolQueryService boolQueryService;

    @Autowired
    private MatchQueryService matchQueryService;

    @Test
    void contextLoads() {
    }

    //创建索引
//    @Test
    void createIndexTest() {
        System.out.println("start");
        indexService2.createIndex();
        System.out.println("end");
    }

    // 插入、更新、删除文档
//    @Test
    void documentModify() {
        System.out.println("start");
//        indexService.addDocument();
        indexService.getDocument();
        System.out.println("end");
    }

//    @Test
    void boolQuery() {
        System.out.println("start");
//        indexService.addDocument();
        boolQueryService.boolQuery();
        System.out.println("end");
    }

    /**
     * 模糊查询
     */
    @Test
    void likeQuery() {
        System.out.println("start");
        matchQueryService.matchMultiQuery();
        System.out.println("match end");
    }

}
