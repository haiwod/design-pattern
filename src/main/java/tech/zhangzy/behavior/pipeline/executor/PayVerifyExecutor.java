package tech.zhangzy.behavior.pipeline.executor;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import tech.zhangzy.behavior.pipeline.context.IdentityContext;

/**
 * 支付校验
 *
 * @author : zhiyi.zhang@joymo.tech
 * @date : 2021/9/1
 */
@Slf4j
@Component
public class PayVerifyExecutor implements AbstractVerifyExecutor<IdentityContext> {
    @Override
    public void verify(IdentityContext context) {
        log.info("-------支付校验通过-------");
    }

    @Override
    public VerifyTypeEnum getVerifyType() {
        return VerifyTypeEnum.PAY;
    }
}
