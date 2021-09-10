package tech.zhangzy.creation.prototype;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import tech.zhangzy.construction.bridge.*;

import java.io.IOException;
import java.util.function.LongFunction;

/**
 * 原型模式测试
 *
 * @author : zhiyi.zhang@joymo.tech
 * @date : 2021/9/6
 */
@Slf4j
class PrototypeTest {

    @Test
    void cloneTest() {
        MemberDO memberDO = new MemberDO();
        memberDO.setMemberNo("299020011");
        memberDO.setName("member-test");
        log.info("member:{}",memberDO.toString());
        log.info("memberClone:{}",memberDO.clone().toString());
    }

    @Test
    void deepCloneTest() throws IOException, ClassNotFoundException {
        Member member=new Member();
        member.setMemberNo("3009983");
        member.setName("member-deep");
        member.getBindPlatform().add("小程序");
        member.getBindPlatform().add("IOS");
        Member memberClone = member.deepClone();
        memberClone.getBindPlatform().add("Android");
        log.info("member.bindPlatform:{}",member.getBindPlatform());
        log.info("memberClone.bindPlatform:{}",memberClone.getBindPlatform());
    }
}