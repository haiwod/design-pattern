package tech.zhangzy.behavior.pipeline.executor;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import tech.zhangzy.behavior.pipeline.context.IdentityContext;
import tech.zhangzy.behavior.pipeline.context.VerifyContext;

/**
 * 身份校验
 *
 * @author : zhiyi.zhang@joymo.tech
 * @date : 2021/9/1
 */
@Slf4j
@Component
public class IdentityVerifyExecutor implements AbstractVerifyExecutor {

    @Override
    public void verify(VerifyContext context) {
        log.info("-------身份校验通过-------");
    }

    @Override
    public VerifyTypeEnum getVerifyType() {
        return VerifyTypeEnum.IDENTITY;
    }
}
