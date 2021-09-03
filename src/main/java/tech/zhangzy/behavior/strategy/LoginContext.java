package tech.zhangzy.behavior.strategy;

import com.sun.org.apache.bcel.internal.generic.NEW;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.EnumMap;
import java.util.List;
import java.util.Map;

/**
 * 登录策略处理上下文
 *
 * @author : zhiyi.zhang@joymo.tech
 * @date : 2021/9/3
 */
@Component
public class LoginContext {
    private static final Map<LoginTypeEnum, LoginStrategy> LOGIN_STRATEGY_MAP = new EnumMap<>(LoginTypeEnum.class);

    @Autowired
    public void setLoginStrategyMap(List<LoginStrategy> list) {
        list.forEach(strategy -> LOGIN_STRATEGY_MAP.put(strategy.getLoginType(), strategy));
    }

    public boolean handler(LoginVerifyParam param) {
        return LOGIN_STRATEGY_MAP.get(LoginTypeEnum.getLoginTypeEnum(param.getLoginType())).login(param);
    }

}
