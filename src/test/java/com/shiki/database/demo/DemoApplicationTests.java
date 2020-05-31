package com.shiki.database.demo;

import com.shiki.database.demo.service.ICastService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

    @Autowired
    private ICastService castService;

    @Test
    public void page() {
        castService.list()
                .stream()
                .peek(cast->cast.setCreateTime(cast.getCreateTime()));
    }
}