package cn.how2j.springcloud.rabbitmq;

import cn.hutool.core.util.NetUtil;

import javax.swing.*;

public class RabbitMQUtil {

    public static void checkServer() {
        if (NetUtil.isUsableLocalPort(15672)) {
            JOptionPane.showMessageDialog(null, "RabbitMQ服务为启动");
            System.exit(1);
        }
    }
}
