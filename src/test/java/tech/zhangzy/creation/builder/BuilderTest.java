package tech.zhangzy.creation.builder;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

/**
 * 建造者模式测试
 *
 * @author : zhiyi.zhang@joymo.tech
 * @date : 2021/9/6
 */
@Slf4j
class BuilderTest {

    @Test
    void test() {
        Computer computer = new Computer.ComputerBuilder()
                .cpu("M1")
                .gpu("Apple Inc")
                .soundCard("Apple Inc")
                .keyboard("巧克力键盘")
                .crate("无")
                .build();
        log.info("computer:{}",computer.toString());
    }

}