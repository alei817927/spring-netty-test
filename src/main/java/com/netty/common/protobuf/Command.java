// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Command.proto

package com.netty.common.protobuf;

public final class Command {
  private Command() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  /**
   * <pre>
   **
   * 指令类型
   * </pre>
   *
   * Protobuf enum {@code CommandType}
   */
  public enum CommandType
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <pre>
     **
     * 验证
     * </pre>
     *
     * <code>AUTH = 0;</code>
     */
    AUTH(0),
    /**
     * <pre>
     **
     * ping
     * </pre>
     *
     * <code>PING = 1;</code>
     */
    PING(1),
    /**
     * <pre>
     **
     * pong
     * </pre>
     *
     * <code>PONG = 2;</code>
     */
    PONG(2),
    /**
     * <pre>
     **
     * 上传数据
     * </pre>
     *
     * <code>UPLOAD_DATA = 3;</code>
     */
    UPLOAD_DATA(3),
    /**
     * <pre>
     **
     * 推送数据
     * </pre>
     *
     * <code>PUSH_DATA = 4;</code>
     */
    PUSH_DATA(4),
    /**
     * <pre>
     **
     * 验证返回
     * </pre>
     *
     * <code>AUTH_BACK = 5;</code>
     */
    AUTH_BACK(5),
    /**
     * <code>UPLOAD_DATA_BACK = 6;</code>
     */
    UPLOAD_DATA_BACK(6),
    /**
     * <code>PUSH_DATA_BACK = 7;</code>
     */
    PUSH_DATA_BACK(7),
    /**
     * <code>CHAT = 8;</code>
     */
    CHAT(8),
    UNRECOGNIZED(-1),
    ;

    /**
     * <pre>
     **
     * 验证
     * </pre>
     *
     * <code>AUTH = 0;</code>
     */
    public static final int AUTH_VALUE = 0;
    /**
     * <pre>
     **
     * ping
     * </pre>
     *
     * <code>PING = 1;</code>
     */
    public static final int PING_VALUE = 1;
    /**
     * <pre>
     **
     * pong
     * </pre>
     *
     * <code>PONG = 2;</code>
     */
    public static final int PONG_VALUE = 2;
    /**
     * <pre>
     **
     * 上传数据
     * </pre>
     *
     * <code>UPLOAD_DATA = 3;</code>
     */
    public static final int UPLOAD_DATA_VALUE = 3;
    /**
     * <pre>
     **
     * 推送数据
     * </pre>
     *
     * <code>PUSH_DATA = 4;</code>
     */
    public static final int PUSH_DATA_VALUE = 4;
    /**
     * <pre>
     **
     * 验证返回
     * </pre>
     *
     * <code>AUTH_BACK = 5;</code>
     */
    public static final int AUTH_BACK_VALUE = 5;
    /**
     * <code>UPLOAD_DATA_BACK = 6;</code>
     */
    public static final int UPLOAD_DATA_BACK_VALUE = 6;
    /**
     * <code>PUSH_DATA_BACK = 7;</code>
     */
    public static final int PUSH_DATA_BACK_VALUE = 7;
    /**
     * <code>CHAT = 8;</code>
     */
    public static final int CHAT_VALUE = 8;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static CommandType valueOf(int value) {
      return forNumber(value);
    }

    public static CommandType forNumber(int value) {
      switch (value) {
        case 0: return AUTH;
        case 1: return PING;
        case 2: return PONG;
        case 3: return UPLOAD_DATA;
        case 4: return PUSH_DATA;
        case 5: return AUTH_BACK;
        case 6: return UPLOAD_DATA_BACK;
        case 7: return PUSH_DATA_BACK;
        case 8: return CHAT;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<CommandType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        CommandType> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<CommandType>() {
            public CommandType findValueByNumber(int number) {
              return CommandType.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return com.netty.common.protobuf.Command.getDescriptor().getEnumTypes().get(0);
    }

    private static final CommandType[] VALUES = values();

    public static CommandType valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private CommandType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:CommandType)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\rCommand.proto*\216\001\n\013CommandType\022\010\n\004AUTH\020" +
      "\000\022\010\n\004PING\020\001\022\010\n\004PONG\020\002\022\017\n\013UPLOAD_DATA\020\003\022\r" +
      "\n\tPUSH_DATA\020\004\022\r\n\tAUTH_BACK\020\005\022\024\n\020UPLOAD_D" +
      "ATA_BACK\020\006\022\022\n\016PUSH_DATA_BACK\020\007\022\010\n\004CHAT\020\010" +
      "B$\n\031com.netty.common.protobufB\007Commandb\006" +
      "proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
  }

  // @@protoc_insertion_point(outer_class_scope)
}
