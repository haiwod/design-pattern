package tech.zhangzy.creation.prototype;

import lombok.Data;
import lombok.ToString;

/**
 * 会员对象 浅拷贝
 *
 * @author : zhiyi.zhang@joymo.tech
 * @date : 2021/09/10
 */
@ToString
@Data
public class MemberDO implements Cloneable{
    private String memberNo;

    private String name;

    /**
     * 浅拷贝重写clone方法，引用类型拷贝引用地址
     * @return
     */
    @Override
    public MemberDO clone() {
        try {
            return (MemberDO) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
