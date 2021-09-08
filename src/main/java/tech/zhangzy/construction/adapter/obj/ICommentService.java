package tech.zhangzy.construction.adapter.obj;

import java.util.List;

/**
 * 评价接口
 *
 * @author : zhiyi.zhang@joymo.tech
 * @date : 2021/9/8
 */
public interface ICommentService {
    /**
     * 查询评价接口
     * @param param
     * @return
     */
    List<QueryCommentListDTO> queryCommentList(QueryCommentListParam param);
}
