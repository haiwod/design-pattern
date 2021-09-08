package tech.zhangzy.construction.adapter.obj;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

/**
 * 美团接口适配器（对象适配）
 *
 * @author : zhiyi.zhang@joymo.tech
 * @date : 2021/9/8
 */
@Slf4j
public class MeituanCommentServiceAdapter implements ICommentService {

    private MeituanCommentService meituanCommentService;

    public MeituanCommentServiceAdapter(MeituanCommentService meituanCommentService) {
        this.meituanCommentService = meituanCommentService;
    }

    @Override
    public List<QueryCommentListDTO> queryCommentList(QueryCommentListParam param) {
        List<QueryCommentListDTO> commentList= new ArrayList<>();
        log.info("-----------美团适配器开始适配-------------");
        //模拟接口适配
        MeituanRequst meituanRequst = new MeituanRequst();
        MeituanResult meituanResult = meituanCommentService.queryComment(meituanRequst);
        log.info("-----------美团适配器适配结束-------------");
        return commentList;
    }
}
