package tech.zhangzy.construction.adapter.obj;

/**
 * 美团提供的接口
 *
 * @author : zhiyi.zhang@joymo.tech
 * @date : 2021/9/8
 */
public interface MeituanCommentService {

    /**
     * 查询评价
     *
     * @param requst
     * @return
     */
    MeituanResult queryComment(MeituanRequst requst);
}
