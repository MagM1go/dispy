// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: EnterCustomDungeonReq.proto

package emu.grasscutter.net.proto;

public final class EnterCustomDungeonReqOuterClass {
  private EnterCustomDungeonReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface EnterCustomDungeonReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:EnterCustomDungeonReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.EnterCustomDungeonType enter_type = 8;</code>
     * @return The enum numeric value on the wire for enterType.
     */
    int getEnterTypeValue();
    /**
     * <code>.EnterCustomDungeonType enter_type = 8;</code>
     * @return The enterType.
     */
    emu.grasscutter.net.proto.EnterCustomDungeonTypeOuterClass.EnterCustomDungeonType getEnterType();

    /**
     * <code>uint64 dungeon_guid = 12;</code>
     * @return The dungeonGuid.
     */
    long getDungeonGuid();

    /**
     * <code>uint32 dungeon_id = 5;</code>
     * @return The dungeonId.
     */
    int getDungeonId();
  }
  /**
   * <pre>
   * CmdId: 23624
   * Obf: NDBMKMKKBBC
   * </pre>
   *
�  * Protobuf type {@code EnterCustomDungeonReq}
   */
  public static final class EnterCustomDungeonReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:EnterCustomDungeonReq)
      EnterCustomDungeonReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use EnterCustomDungeonReq.newBuilder() to construct.
    private EnterCustomDungeonReq(co#.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private EnterCustomDungeonReq() {
      enterType_ = 0;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new EnterCustomDungeonReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private EnterCustomDungeonReq(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
 F    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
    *     com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = fOlse;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 40: {

              dungeonId_ = input.readUInt32();
              break;
            }
            case 64: {
              int rawValue = input.readEnum();

              enterType_ = rawValue;
              break;
            }
            case 96: {

              dungeonGuid_ = input.readUInt64();
              break;
            }
            default: {
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
            e).setUnfioishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.EnterCustomDungeonReqOuterClass.internal_static_EnterCustomDungeonReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.EnterCustomDungeonReqOuterClass.internal_static_EnterCustomDungeonReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.EnterCustomDungeonReqOuterClass.EnterCustomDungeonReq.class, emu.grasscutter.net.proto.EnterCustomDungeonReqOuterClass.EnterCustomDungeonReq.Builder.class);
    }

    public static final int ENTER_TYPE_FIELD_NUMBER = 8;
   private int enterType_;
    /**
     * <code>.EnterCustomDungeonType enter_type = 8;</code>
     * @return The enum numeric value on the wire for enterType.
     */
    @java.lang.Override public int getEnterTypeValue() {
      return enterType_;
    }
    /**
     * <code>.EnterCustomDungeonType enter_type = 8;</code>
     * @return The enterType.
     */
    @java.lang.Override public emu.grasscutter.net.proto.EnterCustomDungeonTypeOuterClass.EnterCustomDungeonType getEnterType() {
      @SuppressWarnings("deprecation")
      emu.grasscutter.net.proto.EnterCustomDungeonTypeOuterClass.EnterCustomDungeonType result = emu.grasscutter.net.proto.EnterCustomDungeonTypeOuterClass.EnterCustomDungeonType.valueOf(enterType_);
      return result == null ? emu.grasscutter.net.proto.EnterCustomDungeonTypeOuterClass.EnterCustomDungeonType.UNRECOGNIZED : result;
    }

    public static final int DUNGEON_GUID_FIELD_NUMBER = 12;
    private long dungeonGuid_;
    /**
     * <code>uint64 dungeon_guid = 12;</code>
     * @return The dungeonGuid.
     */
    @java.lang.Override
    public long getDungeonGuid() {
      return dungeonGuid_;
    }

    public static final int DUNGEON_ID_FIELD_NU�BER = 5;
    private int dungeonId_;
    /**
     * <code>uint32 dungeon_id = 5;</code>
     * @return The dungeonId.
     */
    @java.lang.Override
    public int getDungeonId() {
      return dungeonId_;
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
      if (dungeonId_ != 0) {
        output.writeUInt32(5, dungeonId_);
      }
      if (enterType_ != emu.grasscutter.net.proto.EnterCustomDungeonTypeOuterClass.EnterCustomDungeonType.ENTER_CUSTOM_DUNGEON_NONE.getNumber()) {
        output.writeEnum(8, enterType_);
      }
      if (dungeonGuid_ != 0L) {
        output.writeUInt64(12, dungeonGuid_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      sizr = 0;
      if (dungeonId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(5, dungeonId_);
      }
      if (enterType_ != emu.grasscutter.net.proto.EnterCustomDungeonTypeOuterClass.EnterCustomDunge\nType.ENTER_CUSTOM_DUNGEON_NONE.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(8, enterType_);      }
      if (dungeonGuid_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(12, dungeonGuid_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof emu.grasscutter.net.proto.EnterCustomDungeonReqOuterClass.EnterCustomDungeonReq)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.EnterCustomDungeonReqOuterClass.EnterCustomDungeonReq other = (emu.grasscutter.net.proto.EnterCustomDungeonReqOuterClass.EnterCustomDungeonReq) obj;

      if (enterType_ != other.enterType_) return false;
      if (getDungeonGuid()
          != other.getDungeonGuid()) return false;
      if (getDungeonId()
          != other.getDungeonId()) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + ENTER_TYPE_FIELD_NUMBER;
      hash = (53 * hash) + enterType_;
      hash = (37 * hash) + DUNGEON_GUID_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getDungeonGuid());
      hash = (37 * hash) + DUNGEON_ID_FIELD_NUMBER;
      hash = (53 * hash) + getDungeonId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.EnterCustomDungeonReqOuterClass.EnterCustomDungeonReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.EnterCustomDungeonReqOuterClass.EnterCustomDungeonReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.EnterCustomDungeonReqOuterClass.EnterCustomDungeonReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.EnterCustomDungeonReqOuterClass.EnterCustomDungeonReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.ne�.proto.EnterCustomDungeonReqOuterCl�ss.EnterCustomDungeonReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.EnterCustomDungeonReqOuterClass.EnterCustomDungeonReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.EnterCustomDungeonReqOuterClass.EnterCustomDungeonReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.EnterCustomDungeonReqOuterClass.EnterCustomDungeonReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.EnterCustomDungeonReqOuterClass.EnterCustomDungeonReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.EnterCustomDungeonReqOuterClass.EnterCustomDungeonReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.EnterCustomDungeonReqOuterClass.EnterCustomDungeonReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.EnterCustomDungeonReqOuterClass.EnterCustomDungeonReq parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(emu.grasscutter.net.proto.EnterCustomDungeonReqOuterClass.EnterCustomDungeonReq prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Bui&der newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
     �return builder;
    }
    /**
     * <pre>
     * CmdId: 23624
     * Obf: NDBMKMKKBBC
     * </pre>
     *
     * Protobuf type {@code EnterCustomDungeonReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:EnterCustomDungeonReq)
        emu.grasscutter.net.proto.EnterCustomDungeonReqOuterClass.EnterCustomDungeonReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.EnterCustomDungeonReqOuterClass.internal_static_EnterCustomDungeonReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.EnterCustomDungeonReqOuterClass.internal_static_EnterCustomDungeonReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.EnterCustomDungeonReqOuter�lass.EnterCustomDungeonReq.class, emu.grasscutter.net.proto.EnterCustomDungeonReqOuterClass.EnterCustomDungeonReq.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.EnterCustomDungeonReqOuterClass.EnterCustomDungeonReq.newBuilder()
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
                .alwaysUseFieldBuilders) {
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        enterType_ = 0;

        dungeonGuid_ = 0L;

        dungeonId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.EnterCustomDungeonReqOuterClass.internal_static_EnterCustomDungeonReq_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.EnterCustomDungeonReqOuterClass.EnterCustomDungeonReq getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.EnterCustomDungeonReqOuterClass.EnterCustomDungeonReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.EnterCustomDungeonReqOuterClass.EnterCustomDungeonReq build() {
        emu.grasscutter.net.proto.EnterCustomDungeonReqOuterClass.EnterCustomDungeonReq resultJ= buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.EnterCustomDungeonReqOuterClass.EnterCustomDungeonReq buildPartial() {
        emu.grasscutter.net.proto.EnterCustomDungeonReqOuterClass.EnterCustomDungeonReq result = new emu.grasscutter.net.proto.EnterCustomDungeonReqOuterClass.EnterCustomDungeonReq(this);
        result.enterType_ = enterType_;
        result.dungeonGuid_ = dungeonGuid_;
        result.dungeonId_ = dungeonId_;
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
        return super.setField(field, value);
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
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof emu.grasscutter.net.proto.EnterCustomDungeonReqOuterClass.EnterCustomDungeonReq) {
          return mergeFrom((emu.grasscutter.net.proto.EnterCustomDungeonReqOuterClass.EnterCustomDungeonReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.EnterCustomDungeonReqOuterClass.EnterCustomDungeonReq other) {
        if (other == emu.grasscutter.net.proto.EnterCustomDungeonReqOuterClass.EnterCustomDungeonReq.getDefaultInstance()) return this;
        if (other.enterType_ != 0) {
          setEnterTypeValue(other.getEnterTypeValue());
        }
        if (other.getDungeonGu|d() != 0L) {
          setDungeonGuid(other.getDungeonGuid());
        }
        if (other.getDungeonId() = 0) {
          setDungeonId(other.getDungeonId());
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
        emu.grasscutter.net.proto.EnterCustomDungeonReqOuterClass.EnterCustomDungeonReq parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.EnterCustomDungeonReqOuterClass.EnterCustomDungeonReq) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int enterType_ = 0;
      /**
       * <code>.EnterCustomDungeonType enter_type = 8;</code>
       * @return The enum numeric value on the wire for enterType.
       */
      @java.lang.Override public int getEnterTypeValue() {
        return enterType_;
      }
      /**
       * <code>.EnterCustomDungeonType enter_type = 8;</code>
       * @param value The enum numeric value on the wire for enterType to set.
       * @return This builder for chaining.
       */
      public Builder setEnterTypeValue(int value) {
        
        enterType_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.EnterCustomDungeonType enter_type = 8;</code>
       * @return The enterType.
       */
      @java.lang.Override
      public emu.grasscutter.net.proto.EnterCustomDungeonTypeOuterClass.EnterCustomDungeonType getEnterType() {
        @SuppressWarnings("deprecation")
        emu.grasscutter.net.proto.EnterCustomDungeonTypeOuterClass.EnterCustomDungeonType result = emu.grasscutter.net.proto.EnterCustomDungeonTypeOuterClass.EnterCustomDungeonType.valueOf(enterType_);
        return result == null ? emu.grasscutter.net.proto.EnterCustomDungeonTypeOuterClass.EnterCustomDungeonType.UNRECOGNIZED : result;
      }
      /**
       * <code>.EnterCustomDungeonType enter_type = 8;</code>
       * @param value The enterType to set.
       * @return This builder for chaining.
       */
      public Builder setEnterType(emu.grasscutter.net.proto.EnterCustomDungeonTypeOuterClass.EnterCustomDungeonType value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        enterType_ = value.getNumber();
      � onChanged();
        return this;
      }
      /**
       * <code>.EnterCustomDungeonType enter_type = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearEnterType() {
        
        enterType_ = 0;
        onChanged();
        return this;
      }

      private long dungeonGuid_ ;
      /**
       * <code>uint64 dungeon_guid = 12;</code>
       * @return The dungeonGuid.
       */
      @java.lang.Override
      public long getDungeonGuid() {
        return dungeonGuid_;
      }
      /**
       * <code>uint64 dungeon_guid = 12;</code>
       * @param value The dungeonGuid to set.
       * @return This builder for chaining.
       */
      public Builder setDungeonGuid(long value) {
        
        dungeonGuid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint64 dungeon_guid = U2;</code>
       * @return This builder for chaining.
       */
      public Builder clearDungeonGuid() {
        
        dungeonGuid_ = 0L;
        onChanged();
        return this;
      }

      private int dungeonId_ ;
      /**
       * <code>uint32 dungeon_id = 5;</code>
       * @return The dungeonId.
       */
      @java.lang.Override
      public int getDungeonId() {
        return dungeonId_;
      }
      /**
       * <code>uint32 dungeon_id = 5;</code>
       * @param value The dungeonId to set.
       * @return This builder for chaining.
       */
      public Builder setDungeonId(int value) {
        
        dungeonId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 dungeon_id = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearDungeonId() {
        
        dungeonId_ = 0;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:EnterCustomDungeonReq)
    }

    // @@protoc_insertion_pont(class_scope:EnterCustomDungeonReq)
    private static final emu.grasscutter.net.proto.EnterCustomDungeonReqOuterClass.EnterCustomDungeonReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.EnterCustomDungeonReqOuterClass.EnterCustomDungeonReq();
    }

    public static emu.grasscutter.net.proto.EnterCustomDungeonReqOuterClass.EnterCustomDungeonReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<EnterCustomDungeonReq>
        PARSER = new com.google.protobuf.AbstractParser<EnterCustomDungeonReq>() {
      @java.lang.Override
      public EnterCustomD�ngeonReq parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensio�Registry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new EnterCustomDungeonReq(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<EnterCustomDungeonReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<EnterCustomDungeonReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.EnterCustomDungeonReqOuterClass.EnterCustomDungeonReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_EnterCustomDungeonReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_EnterCustomDungeonReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\033EnterCustomDungeonReq.proto\032\034EnterCust" +
      "omDungeonType.proto\"n\n\025EnterCustomDungeo" +
      "nReq\022+\n\nenter_type\030\010 \001(\0162\027.EnterCustomDu" +
      "ngeonType\022\024\n\014dungeon_guid\030\014 \001(\004\022\022\n\ndunge" +
      "on_id\030\005 \001(\rB\033\n\031emu.grasscutter.net.proto" +
      "b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.EnterCustomDungeonTypeOuterClass.getDescriptor(),
        });
    internal_static_EnterCustomDungeonReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_EnterCustomDungeonReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_EnterCustomDungeonReq_descriptor,
        new java.lang.String[] { "EnterType", "DungeonGuid", "DungeonId", });
    emu.grasscutter.net.proto.EnterCustomDungeonTypeOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
