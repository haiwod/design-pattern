package tech.zhangzy.construction.adapter;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import tech.zhangzy.Application;
import tech.zhangzy.construction.adapter.api.WxService;
import tech.zhangzy.construction.adapter.api.WxServiceAdapter;
import tech.zhangzy.construction.adapter.clazz.WxAppLoginService;
import tech.zhangzy.construction.adapter.clazz.WxAppLoginServiceAdapter;
import tech.zhangzy.construction.adapter.obj.ICommentService;
import tech.zhangzy.construction.adapter.obj.MeituanCommentServiceAdapter;
import tech.zhangzy.construction.adapter.obj.MeituanCommentServiceImpl;
import tech.zhangzy.construction.adapter.obj.QueryCommentListParam;
import tech.zhangzy.construction.bridge.*;

/**
 * 适配器模式测试
 *
 * @author : zhiyi.zhang@joymo.tech
 * @date : 2021/9/6
 */
@SpringBootTest(classes = Application.class)
@Slf4j
class AdapterTest {

    @Test
    void apiAdapter() {
        //接口适配
        WxServiceAdapter wxServiceAdapter = new WxServiceAdapter();
        wxServiceAdapter.login();
        wxServiceAdapter.register();
    }

    @Test
    void clazzAdapter() {
        //类适配
        WxAppLoginService wxAppLoginService = new WxAppLoginServiceAdapter();
        wxAppLoginService.login("18859983999", "80993");
    }

    @Test
    void objAdapter() {
        //对象适配
        ICommentService commentService = new MeituanCommentServiceAdapter(new MeituanCommentServiceImpl());
        QueryCommentListParam param = new QueryCommentListParam();
        param.setPlatform(1);
        param.setShopCode(200001L);
        param.setPageNum(1);
        param.setPageSize(20);
        commentService.queryCommentList(param);
    }
}