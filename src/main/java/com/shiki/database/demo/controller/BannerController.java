package com.shiki.database.demo.controller;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.shiki.database.demo.common.core.util.R;
import com.shiki.database.demo.entity.Banner;
import com.shiki.database.demo.entity.User;
import com.shiki.database.demo.service.IBannerService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

import static java.time.LocalDateTime.now;
import static java.util.stream.Collectors.toList;

/**
 * <p>
 * 首页轮播图 前端控制器
 * </p>
 *
 * @author shiki
 * @since 2020-05-28
 */
@Slf4j
@RestController
@RequestMapping("/banner")
@AllArgsConstructor
public class BannerController {

    private IBannerService bannerService;

    @GetMapping("/page")
    public R<IPage<Banner>> selectPage(Page<Banner> iPage, HttpSession session) {
        IPage<Banner> page = bannerService.getBanner(iPage);

        Map<String, User> sessionInfoMap = new HashMap<>(1);
        session.setAttribute("user", User.builder().userName("shiki").build());

        return R.<IPage<Banner>>builder().data(page).build();
    }

    @GetMapping("/save")
    public R save() {
        bannerService.saveBatch(IntStream
                .range(1, 20)
                .mapToObj((i) -> Banner.builder()
                        .bannerId(i)
                        .bannerImg("i")
                        .bannerUrl("1")
                        .createTime(now())
                        .build()
                ).collect(toList()));
        return R.builder().msg("数据生成成功").build();
    }

    @GetMapping("/hello")
    public R hello() {
        return R.<String>builder().data(bannerService.hello()).build();
    }


    @GetMapping("/login")
    public R login(HttpSession session) {

        session.setAttribute("user", User.builder().userId(1).userName("shiki").build());

        return R.builder().msg("登录成功").build();
    }


    @GetMapping("/check")
    public R check(User user) {
        System.out.println("user = " + user);
        return R.builder().data(user).build();
    }
}

