package com.netty.client;

import com.netty.common.protobuf.Command;
import com.netty.common.protobuf.Message;
import io.netty.channel.Channel;

import java.util.Scanner;

public class MessageService {
  private Channel channel;

  public void setChannel(Channel channel) {
    this.channel = channel;
  }

  public void init() {
    new Thread() {
      @Override
      public void run() {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
          //利用nextXXX()方法输出内容
          String str = sc.next();
          if (channel == null || !channel.isWritable()) {
            System.out.println("不能发送消息");
            continue;
          }
          System.out.println("客户端说：" + str);
          Message.MessageBase.Builder authMsg = Message.MessageBase.newBuilder();
          authMsg.setClientId("");
          authMsg.setCmd(Command.CommandType.CHAT);
          authMsg.setData(str);
          channel.writeAndFlush(authMsg.build());
        }
      }
    }.start();
  }
}
