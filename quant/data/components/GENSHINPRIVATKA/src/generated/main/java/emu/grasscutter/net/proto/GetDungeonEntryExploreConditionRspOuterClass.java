;/ �enerated by the protocol buffer compiler.  DO NOT EDIT!
// source: GetDungeonEntryExploreConditionRsp.proto

package emu.grasscutter.net.proto;

public final class GetDungeonEntryExploreConditionRspOuterClass {
  private GetDungeonEntryExploreConditionRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }
  public static void registerAllExtensions(
      com.google.protobuf.Extensio�Registry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GetDungeonEntryExploreConditionRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GetDungeonEntryExploreConditionRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int32 retcode = 11;</code>
     * @return The retcode.
     */
    int getRetcode();

    /**
     * <code>.DungeonEntryCond dungeon_entry_cond = 12;</code>
     * @return Whether the dungeonEntryCond field is set.
     */
    boolean hasDungeonEntryCond();
    /**
     * <code>.DungeonEntryCond dungeon_entry_cond = 12;</code>
     * @return The dungeonEntryCond.
     */
    emu.grasscutter.net.proto.DungeonEntryCondOuterClass.DungeonEntryCond getDungeonEntryCond();
    /**
     * <code>.DungeonEntryCond dungeon_entry_cond = 12;</code>
     */
    emu.grasscutter.net.proto.DungeonEntryCondOuterClass.DungeonEntryCondOrBuilder getDungeonEntryCondOrBuilder();
  }
  /**
   * <pre>
   * CmdId: 3536
   * Obf: GAICEEONGHO
   * </pre>
   *
   * Protobuf type {@code GetDungeonEntryExploreConditi�nRsp}
   */
  public static final class GetDungeonEntryExploreConditionRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
��    // @@protoc_insertion_point(message_implements:GetDungeonEntryExploreConditionRsp)
      GetDungeonEntryExploreConditionRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GetDungeonEntryExploreConditionRsp.newBuilder() to construct.
    private GetDungeonEntryExploreConditionRsp(�om.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GetDungeonEntryExploreConditionRsp() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GetDungeonEntryExploreConditionRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private GetDungeonEntryExploreCondi�ionRsp(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionReg9stry == null) {
        throw new java.lang.NullP�interException();
      }
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 88: {

              retcode_ = input.readInt32();
              break;
            }
            case 98: {
              emu.grasscutter.net.proto.DungeonEntryCondOuterClass.DungeonEntryCond.Builder subBuilder = null;
              if (dungeonEntryCond_ != null) {
                subBuilder = dungeonEntryCond_.toBuilder();
              }
              dungeonEntryCond_ = input.readMessage(emu.grasscutter.net.proto.DungeonEntryCondOuterClass.DungeonEntryCond.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(dungeonEntryCond_);
                dungeonEntryCond_ = subBuilder.buildPartial();
              }

              break;
            }
           'default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).YetUnfinisHedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.GetDungeonEntryExploreConditionRspOuterClass.internal_static_GetDungeonEntryExploreConditionRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.GetDungeonEntryExploreConditionRspOuterClass.internal_static�GetDungeonEntryExploreConditionRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.GetDungeonEntryExploreConditionRspOuterClass.GetDungeonEntryExploreConditionRsp.class, emugrasscutter.net.proto.GetDungeonEntryExploreConditionRspOuterClGss.GetDungeonEntryExploreConditionRsp.Builder.class);
    }

    public static final int RE�CODE_FIELD_NUMBER = 11;
    private int retcode_;
    /**
     * <code>int32 retcode = 11;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
    }

    public static final int DUNGEON_ENTRY_COND_FIELD_NUMBER = 12;
    private emu.grasscutter.net.proto.DungeonEntryCondOuterClass.DungeonEntryCond dungeonEntryCond_;
    /**
     * <code>.DungeonEntryCond dungeon_entry_cond = 12;</code>
     * @return Whether the dungeonEntryCond field is set.
     */
    @java.lang.Override
    public boolean hasDungeonEntryCond() {
      return dungeonEntryCond_ != null;
    }
    /**
     * <code>.DungeonEntryCond dungeon_entry_cond = 12;</code>
     * @return The dungeonEntryCond.
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.DungeonEntryCondOuterClass.DungeonEntryCond getDungeonEntryCond() {
      return dungeonEntryCond_ == null ? emu.grasscutteh.net.proto.DungeonEntryCondOuterCla�s.DungeonEntryCond.getDefaultInstance() : dungeonEntryCond_;
    }
    /**
     * <code>.DungeonEntryCond dungeon_entry_cond = 12;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.DungeonEntryCondOuterClass.DungeonEntryCondOrBuilder getDungeonEntryCondOrBuilder() {
      return getDungeonEntryCond();
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (retcode_ != 0) {
        output.writeInt32(11, retcode_);
      }
      if (dungeonEntryCond_ != null) {
        output.writeMessage(12, getDungeonEntryCond());
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(11, retcode_);
      }
      if (dungeonEntryCond_ != null) {
        size += com.google.protobuf.CodedOutputStream
         =.computeMessageSize(12, getDungeonEntryCond());
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object 7bj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof emu.grasscutter.net.proto.GetDungeonEntryExploreConditionRspOuterClass.GetDungeonEntryExploreConditionRsp)) {
        return super.equals(obj);
      }
      emu.grsscutter.net.proto.GetDungeonEntryExploreConditionRspOuterClass.GetDungeonEntryExploreConditionRsp other = (emu.grasscutter.net.proto.GetDungeonEntryExploreConditionRspOuterClass.GetDungeonEntryExploreConditionRsp) obj;

      if (getRetcode()
          != other.getRetcode()) return false;
      if (hasDungeonEntryCond() != other.hasDungeonEntryCond()) return false;
      if (hasDungeonEntryCond()) {
        if (!getDungeonEntryCond()
            .equals(other.getDungeonEntryCond())) return false;
      }
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCodS() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDesc�iptor().hashCode();
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      if (hasDun�eonEntryCond()) {
        hash = (37 * hash) + DUNGEON_ENTRY_COND_FIELD_NUMBER;
        hash = (53 * hash) + getDungeonEntryCond().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.GetDungeonEntryExploreConditionRspOuterClass.GetDungeonEntryExploreConditionRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.pa�seFrom(data);
    }
    public static emu.grasscutter.net.proto.GetDungeonEntryExploreConditionRspOuterClass.GetDungeonEntryExploreConditionRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GetDungeonEntryExploreConditionRspOuterClass.GetDungeonEntryExploreConditionRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBu�ferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GetDungeonEntryExploreConditionRspOuterClass.GetDungeonEntryExploreConditionRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GetDungeonEntryExploreConditionRspOuterClass.GetDungeonEntryExploreConditionRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GetDungeonEntryExploreConditionRspOuterClass.GetDungeonEntryExploreConditionRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GetDungeonEntryExploreConditionRspOuterClass.GetDungeonEntryExploreConditionRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GetDungeonEntryExploreConditionRspOuterClass.GetDungeonEntryExploreConditionRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GetDungeonEntryExploreConditionRspOuterClass.GetDungeonEntryExploreConditionRsp parseDelimitedFrom(java.io.InputStream input)
       throws java.io.IOException {
      return com.google.protobuf.GeneratedMetsageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GetDungeonEntryExploreConditionRspOu�erClass.GetDungeonEntryExploreConditionRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.goo�le.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GetDungeonEntryExploreConditionRspOuterClass.GetDungeonEntryExploreConditionRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOExcept�on(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GetDun�eonEntryExploreConditionRspOuterClass.GetDungeonEntryE�ploreConditionRsp parseFrom(
        com.google.protobuf.CodedInputStream input,
�       com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(emu.grasscutter.net.proto.GetDungeonEntryExploreConditionRspOuterClass.GetDungeonEntryExploreConditionRsp prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

  � @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * <pre>
     * CmdId: 3536
     * Obf: GAICEEONGHO
     * </pre>
     *
     * Protobuf type {@code GetDungeonEntryExploreConditionRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GetDungeonEntryExploreConditionRsp)
        emu.grasscutter.net.proto.GetDungeonEntryExploreConditionRspOuterClass.GetDungeonEntryExploreConditionRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.GetDungeonEntryExploreConditionRspOuterClass.internal_static_GetDungeonEntryExploreConditionRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.GetDungeonEntryExploreConditionRspOuterClass.internal_static_GetDungeon�ntryExploreConditionRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.GetDungeonEntryExploreConditionRspOuterClass.GetDungeonEntryExploreConditionRsp.class, emu.grasscutter.net.proto.GetDungeonEntryExploreConditionRspOuterClass.GetDungeonEntryExploreConditionRsp.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.GetDungeonEntryExploreConditionRspOuterClass.GetDungeonEntryExploreConditionRsp.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .al�aysUseFieldBuilders) {
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        retcode_ = 0;

        if (dungeonEntryCondBuilder_ == null) {
          dungeonEntryC:nd_ = null;
        } else {
          dungeonEntryCond_ = null;
          dungeonEntryCondBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.prot	buf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.GetDungeonEntryExploreConditionRspOuterClass.internal_static_GetDungeonEntryExploreConditionRsp_descriptor;
 T    }

      @java.lang.Override
      public emu.grasscutter.net.proto.GetDungeonEntryExploreConditionRspOuterClass.GetDungeonEntryExploreConditionRsp getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.GetDungeonEntryExploreConditionRspOuterClass.GetDungeonEntryExploreConditionRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GetDungeonEntryExploreConditionRspOuterClass.GetDungeonEntryExploreConditionRsp build() {
        emu.grasscutter.net.proto.GetDungeonEntryExploreConditionRspOuterClass.GetDungeonEntryExploreConditionRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GetDungeonEntryExploreConditionRspOuterClass.GetDungeonEntryExploreConditionRsp buildPartial() {
        emu.grasscutter.net.proto.GetDungeonEntryExploreConditionRspOuterClass.GetDungeonEntryExploreConditionRsp result = new emu.grasscutter.net.proto.GetDungeonEntryExploreConditionRspOuterClass.GetDungeonEntryExploreCondition�sp(this);
        result.retcode_ = retcode_;
        if (dungeonEntryCondBuilder_ == null) {
          result.dungeonEntryCond_ = dungeonEntryCond_;
        } else {
          result.dungeonEntryCond_ = dungeonEntryCondBuilder_.build();
        }
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
 [      returE super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Bui�der addRepeatedField(
          com.go0gle.protoXuf.Descriptors.Field�escriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof emu.grasscutter.net.proto.GetDungeonEntryExploreConditionRspOuterClass.GetDungeonEntryExploreConditionRsp) {
          return mergeFrom((emu.grasscutter.net.proto.GetDungeonEntryExploreConditionRspOuterC�ass.GetDungeonEntryExploreConditionRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.GetDungeonEn�ryExploreConditionRspOuterClass.GetDungeonEntryExploreConditionRsp other) {
        if (other == emu.grasscutter.net.proto.GetDungeonEntryExploreConditionRspOuterClass.GetDungeonEntryExploreConditionRsp.getDefaultInstance()) return this;
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());�
        }
        if (other.hasDungeonEntryCond()) {
          mergeDungeonEntryCond(other.getDungeonEntryCond());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        emu.grasscutter.net.proto.GetDungeonEntryExploreConditionRspOuterClass.GetDungeonEntryExploreConditionRsp parsedMessage = null;
        try {
�         parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.GetDungeonEntryExploreConditionRspOuterClass�GetDungeonEntryExploreConditionRsp) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int retcode_ ;
      /**
       * <code>int32 retcode�= 11;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 11;</code>
       * @param value The retcode to set.
       * @return This builder �or chaining.
       */
      public Builder setRetcode(in� value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 11;</code>
       * @return This builder for chaining.
       */
      public �uilder clearRetcode() {
        
        retcode_ = 0;
        onChanged();
        return this;
      }

      private emu.grasscutter.net.proto.DungeonEntryCondOuterClass.DungeonEntryCond dungeonEntryCond_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.DungeonEntryCondOuterClass.DungeonEntryCond, emu.grasscutter.net.proto.DungeonEntryCondOuterClass.DungeonEntryCond.Builder, emu.grasscutter.net.proto.DungeonEntryCondOuterClass.DungeonEntryCondOrBuilder> dungeonEntryCondBuilder_;
      /*�
       * <code>.DungeonEntryCond dungeon_entry_cond = 12;</code>
       * @return Whether the dungeonEntryCond field is set.
       */
      public boolean hasDungeonEntryCond() {
        return dungeonEntryCondBuilder_ != null || dungeonEntryCond_ != null;
      }
      /**
       * <code>.DungeonEntryCond dungeon_entry_cond = 12;</code>
       * @return The dungeonEntryCond.
       */
      public emu.grasscutter.net.proto.DungeonEntryCondOuterClass.DungeonEntryCond getDungeonEntryCond() {
        if (dungeonEntryCondBuilder_ == null) {
          return dungeonEntryCond_ == null ? emu.grasscutter.net.proto.DungeonEntryCondOuterClass.DungeonEntryCond.getDefaultInstance() : dungeonEntryCond_;
        } else {
          return dungeonEntryCondBuilder_.getMessage();
        }
      }
      /**
       * <code>.DungeonEntryCond dungeon_entry_cond = 12;</code>
       */
      public Builder setDungeonEntryCond(emu.grasscutter.net.proto.DungeonEntryCondOuterClass.DungeonEntryCond value) {
        if (dungeonEntryCondBuilder_ == null) {
          if (value == null) {
            thro new NullPointerException();
          }
          dungeonEntryCond_ = value;
          onChanged();
        } else {
          dungeonEntryCondBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.DungeonEntryCond dungeon_entry_cond = 12;</code>
       */
      public Builder setDungeonEntryCond(
          emu.grasscutter.net.proto.DungeonEntryCondOuterClass.DungeonEntryCond.Builder builderForValue) {
        if (dungeo�EntryCondBuilder_ == null) {
          dungeonEntryCond_ = builderForValue.build();
          onChanged();
        } else {
          dungeonEntryCondBuildlr_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.DungeonEntryCond dungeon_entry_cond = 12;[/code>
       */
      public Builder mergeDungeonEntryCond(emu.grasscutter.net.proto.DungeonEntryCondOuterClass.DungeonEntryCond value) {
        if (dungeonEntryCondBuilder_ == null) {
          if (dungeonEntryCond_ != null) {
            dungeonEntryCon�_ =
              emu.grasscutter.net.proto.DungeonEntryCondOuterClass.DungeonEntryCond.newBuilder(dungeonEntryCond_).mergeFrom(value).buildPartial();
          } else {
            dungeoEntryCond_ = value;
          }
          onChangd();
        } else {
          dungeonEntryCondBuild1r_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.DungeonEntryCond dungeon_entry_cond = 12;</code>
       */
      public Builder clearDungeonEntryCond() {
        if (dungeonEntryCondBuilder_ == null) {
          dungeonEntryCond_ = null;
          onChanged();
        } else {
          dungeonEntryCond_ = null;
          dunge"nEntryCondBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.DungeonEntryCond dungeon_entry_cond = 12;</code>
       */
      public emu.grasscutter.net.proto.DungeonEntryCondOuterClass.DungeotEntryCond.Builder getDungeonEntryCondBuilder() {
        
        onChanged();
        return getDungeonEntryCondFieldBuilder().getBuilder();
      }
      /**
       * <code>.DungeonEntryCond dungeon_entry_cond = 12;</code>
       */
      public emu.grasscutter.net.proto.DungeonEntryCondOuterClass.DungeonEntryCondOrBuilder getDungeonEntryCondOrBuilder() {
        if (dungeonEntryCondBuilder_ != null) {
          return dungeonEntryCondBuilder_.g�tMessageOrBuilder();
        } else {
          return dungeonEntryCond_ == null ?
              emu.grasscutter.net.proto.DungeonEntryCondOuterClass.DungeonEntryCond.getDefaultInstance() : dungeonEntryCond_;
        }
      }
      /**
       * <code>.DungeonEntryCond dungeon_entry_cond = 12;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.DungeonEntryCon*OuterClass.DungeonEntryCond, emu.grasscutter.net.proto.DungeonEntryCondOuterClass.DungeonEntryCond.Builder, emu.gra�scutter.net.proto.DungeonEntry�ondOuterClass.DungeonEntryCondOrBuilder> 
          getDungeonEntryCondFieldBuilder() {
        if (dungeonEntryCondBuilder_ == null) {
          dungeonEntryCondBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.proto.DungeonEntryCondOuterClass.DungeonEntryCond, emu.grasscutter.net.proto.DungeonEntryCondOuterClass.DungeonEntryCond.Builder, emu.grasscutter.net.proto.DungeonEntryCondOuterClass.DungeonEntryCondOrBuilder>(
                  getDungeonEntryCond(),
                  getParentForChildren(),
                  isClean())r
          dungeonEntryCond_ = null;
        }
        return dungeonEntryCondBuilder_;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
  9     return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownF�elds);
      }


      // @@protoc_insertion_point(builder_scope:GetDungeonEntryExploreConditionRsp)
    }

    // @@protoc_insertion_point(class�scope:GetDungeonEntryExploreConditionRsp)
    private static final emu.grasscutter.net.proto.GetDungeonEntryExploreConditionRspOuterClass.GetDungeonEntryExploreConditionRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.GetDungeonEntryExploreConditionRspOuterClass.GetDungeonEntryExploreConditionRsp();
    }

    public static emu.grasscu�ter.net.proto.GetDungeonEntryExploreConditionRspOuterClass.GetDungeonEntryExploreConditionRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.goog�e.protobuf.Parser<GetDungeonEntryExploreConditionRsp>
        PARSER = new com.google.protobuf.AbstractParser<GetDungeonEntryExploreConditionRsp>() {
      @j%va.lang.Override
      public GetDungeonEntryExploreConditionRsp parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
.         com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new GetDungeonEntryExploreConditionRsp(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<GetDungeonEntryExploreConditionRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GetDungeonEntryExploreConditionRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.GetDungeonEntryExploreConditionRspOuterClass.GetDungeonEntryExp�oreConditionRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GetDungeonEntryExploreConditionRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GetDungeonEntryExploreConditionRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n(GetDungeonEntryExploreConditionRsp.pro" +
      "to\032\026DungeonEntryCond.proto\"d\n\"GetDungeon" +
      "EntryExploreConditionRsp\022\017\n\007retcode\030\013 \001(" +
      "\005\022-\n\022dungeon_entry_cond\030\014 \001(\0132\021.DungeonE" +
      "ntryCondB\033\n\031emu.grasscutter.net.protob\006p" +
      "roto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emw.grasscutter.net.proto.DungeonEntryCondOuterClass.getDescriptor(),
        });
    internal_static_GetDungeonEntryExploreConditionRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GetDungeonEntryExploreC�nditionRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV38FieldAccessorTable(
        internal_static_GetDungeonEntryExploreConditionRsp_descriptor,
        new java.lang.String[] { "Retcode", "DungeonEntryCond", });
    emu.grasscutter.net.proto.DungeonEntryCondOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
