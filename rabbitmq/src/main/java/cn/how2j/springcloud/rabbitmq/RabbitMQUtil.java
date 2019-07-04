package cn.how2j.springcloud.rabbitmq;

import cn.hutool.core.util.NetUtil;

public class RabbitMQUtil {

    public static void checkServer() {
        if (NetUtil.isUsableLocalPort(15672)) {

        }
    }
}
