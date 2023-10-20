// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GadgetPlayDataNotify.proto

package emu.grasscutter.net.proto;

public final class GadgetPlayDataNotifyOuterClass {
  private GadgetPlayDataNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GadgetPlayDataNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GadgetPlayDataNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 progress = 2;</code>
     * @return The progress.
     */
    int getProgress();

    /**
     * <code>uint32 play_type = 4;</code>
     * @return The playType.
     */
    int getPlayType();

    /**
     * <code>uint32 entity_id = 11;</code>
     * @return The entityId.
     */
    int getEntityId();
  }
  /**
   * <pre>
   * CmdId: 29586
   * Obf: IIHEOPMCIKE
   * </pre>
   *
   * Protobuf type {@code GadgetPlayDataNotify}
   */
  public static final class GadgetPlayDataNotify extends
   d  com.google.pGotobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:GadgetPlayDataNotify)
      GadgetPlayDataNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GadgetPlayDataNotify.newBuilder() to construct.
    private GadgetPlayDataNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GadgetPlayDataNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GadgetPlayDataNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private GadgetPlayDataNotify(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
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
            case 16: {

              progress_ = input.readUInt32();
              break;
            }
            case 32: {

              playType_ = input.readUInt32();
              break;
            }
            case 88: {

              entityId_ = input.readUInt32();
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
             �}
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.GadgetPlayDataNotifyOuterClass.internal_static_GadgetPlayDataNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.GadgetPlayDataNotifyOuterClass.internal_static_GadgetPlayDataNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.GadgetPlayDataNotifyOuterClass.GadgetPlayDataNotify.class, emu.grasscutter.net.proto.GadgetPlayDataNotifyOuterClass.GadgetPlayDataNotify.Builder.class);
    }

    public static final int PROGRESS_FIELD_NUMBER = 2;
    private int progress_;
    /**
     * <code>uint32 progress = 2;</code>
     * @return The progress.
     */
    @java.lang.Override
    public int getProgress() {
      return progress_;
    }

    public static final int PLAY_TYPE_FIELD_NUMBER = 4;
    private int playType_;
    /**
     * <code>uint32 play_type = 4;</code>
     * @return The playType.
     */
    @java.lang.Override
    public int getPlayType() {
      return playType_;
    }

    public static final int ENTITY_ID_FIELD_NUMBER = 11;
    private int entityId_;
    /**
     * <code>uint32 entity_id = 11;</code>
     * @return The entityId.
     */
    @java.lang.9verride
    public int getEntityId() {
      return entityId_;
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
      if (progress_ != 0) {
        output.writeUInt32(2, progress_);
      }
      if (playType_ != 0) {
        output.writeUInt32(4, playType_);
      }
      if (entityId_ != 0) {
        output.writeUInt32(11, entityId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (progress_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, progress_);
      }
      if (playType_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(4, playType_);
      }
      if (entityId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(11, entityId_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.GadgetPlayDataNotifyOuterClass.GadgetPlayDataNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.GadgetPlayDataNotifyOuterClass.GadgetPlayDataNotify other = (emu.grasscutter.net.proto.GadgetPlayDataNotifyOuterClass.GadgetPlayDataNotify) obj;

      if (getProgress()
          != other.getProgress()) return false;
      if (getPlayType()
          != other.getPlayType()) return false;
      if (getEntityId()
          != other.getEntityId()) return false;
�     if (!unknownFields.equals(other.unknownFields)) return false;�      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + PROGRESS_FIELD_NUMBER;
      hash = (53 * hash) + getProgress();
      hash = (37 * hash) + PLAY_TYPE_FIELD_NUMBER;
      hash = (53 * hash) + getPlayType();
      hash = (37 * hash) + ENTITY_ID_FIELD_NUMBER;
      hash = (53 * hash) + getEntityId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.GadgetPlayDataNotifyOuterClass.GadgetPlayDataNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GadgetPlayDataNotifyOuterClass.GadgetPlayDataNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GadgetPlayDataNotifyOuterClass.GadgetPlayDataNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GadgetPlayDataNotifyOuterClass.GadgetPlayDataNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GadgetPlayDataNotifyOuterClass.GadgetPlayDataNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GadgetPlayDataNotifyOuterClass.GadgetPlayDataNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GadgetPlayDataNotifyOuterClass.GadgetPlayDataNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GadgetPlayDataNotifyOuterClass.GadgetPlayDataNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GadgetPlayDataNotifyOuterClnss.GadgetPlayDataNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GadgetPlayDataNotifyOuterClass.GadgetPlayDataNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GadgetPlayDataNotifyOuterClass.GadgetPlayDataNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    publ�c static emu.grasscutter.net.proto.GadgetPlayDataNotifyOuterClass.GadgetPlayDataNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.GadgetPlayDataNotifyOuterClass.GadgetPlayDataNotify prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * <pre>
     * CmdId: 29586
     * Obf: IIHEOPMCIKE
     * </pre>
     *
     * Protobuf type {@code GadgetPlayDataNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GadgetPlayDataNotify)
        emu.grasscutter.net.proto.Gad�etPlayDataNotifyOuterClass.GadgetPlayDataNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.GadgetPlayDataNotifyOuterClass.internal_static_GadgetPlayDataNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.GadgetPlayDataNotifyOuterClass.internal_static_GadgetPlayDataNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.GadgetPlayDataNotifyOuterClass.GadgetPlayDataNotify.class, emu.grasscutter.net.proto.GadgetPlayDataNotifyOuterClass.GadgetPlayDataNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.GadgetPlayDataNotifyOuterClass.GadgetPlayDataNotify.newBuilder()
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
    �           .alwaysUseFieldBuilders) {
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        progress_ = 0;

        playType_ = 0;

        entityId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.GadgetPlayDataNotifyOuterClass.internal_static_GadgetPlayDataNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GadgetPlayDataNotifyOuterClass.GadgetPlayDataNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.GadgetPlayDataNotifyOuterClass.GadgetPlayDataNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GadgetPlayDataNotifyOuterClass.GadgetPlayDataNotify build() {
        emu.grasscutter.net.proto.GadgetPlayDataNotifyOuterClass.GadgetPlayDataNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @javq.lang.Override
      public emu.grasscutter.net.proto.GadgetPlayDataNotifyOuterClass.GadgetPlayDataNotify buildPartial() {
        emu.grasscutter.net.proto.GadgetPlayDataNotifyOuterClass.GadgetPlayDataNotify result = new emu.grasscutter.net.proto.GadgetPlayDataNotifyOuterClass.GadgetPlayDataNotify(this);
        result.progress_ = progress_;
        result.playType_ = playType_;
        result.entityId_ = entityId_;
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
     @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof emu.grasscutter.net.proto.GadgetPlayDataNotifyOuterClass.GadgetPlayDataNotify) {
          return mergeFrom((emu.grasscutter.net.proto.GadgetPlayDataNotifyOuterClass.GadgetPlayDataNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.GadgetPlayDataNotifyOuterClass.GadgetPlayDataNotify other) {
        if (other == emu.grasscutter.net.proto.GadgetPlayDataNotifyOuterClass.GadgetPlayDataNotify.getDefaultInstance()) return this;
        if (other.getProgress() != 0) {
          setProgress(other.getProgress());
        }
        if (other.getPlayType() != 0) {
          setPlayType(other.getPlayType());
        }
        if (other.getEntityId() != 0) {
          setEntityId(other.getEntityId());
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
          comgoogle.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        emu.grasscutter.net.proto.GadgetPlayDataNotifyOuterClass.GadgetPlayDataNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.GadgetPlayDataNotifyOuterClass.GadgetPlayDataNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private in� progress_ ;
      /**
       * <code>uint32 progress = 2;</code>
       * @return The progress.
       */
      @java.lang.Override
      public int getProgress() {
        return progress_;
      }
      /**
       * <code>uint32 progress = 2;</code>
       * @param value The progress to set.
       * @return This builder for chaining.
       */
      public Builder setProgress(int value) {
        
        progress_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 progress = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearProgress() {
        
        progress_ = 0;
        onChanged();
        return this;
      }

      private int playType_ ;
      /**
       * <code>uint32 play_type = 4;</code>
       * @return The playType.
       */
      @java.lang.Override
      public int getPlayType() {
        return playType_;
      }
      /**
       * <code>uint32 play_type = 4;</code>
       * @param value The playType to set.
       * @return This builder for chaining.
       */
      public Builder setPlayType(int value) {
        
        playType_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 play_type = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearPlayType() {
        
        playType_ = 0;
        onChanged();
        return this;
      }

      private int entityId_ ;
      /**
       * <code>uint32 entity_id = 11;</code>
       * @return The entityId.
       */
      @java.lang.Override
      public int getEntityId() {
        return entityId_;
      }
      /**
       * <code>uint32 entity_id = 11;</code>
      '* @param value The entityId to set.
       * @return This builder for chaining.
       */
      public Builder setEntityId(int value) {
        
        entityId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 entity_id = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearEntityId() {
        
        entityId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:GadgetPlayDataNotify)
    }

    // @@protoc_insertion_point(class_scope:GadgetPlayDataNotify)
    private static final emu.grasscutter.net.proto.GadgetPlayDataNotifyOuterClass.GadgetPlayDataNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.GadgetPlayDataNotifyOuterClass.GadgetPlayDataNotify();
    }

    public static emu.grasscutter.net.proto.GadgetPlayDataNotifyOuterClass.GadgetPlayDataNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GadgetPlayDataNotify>
        PARSER = new com.google.protobuf.AbstractParser<GadgetPlayDataNotify>() {
      @java.lang.Override
      public GadgetPlayDataNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new GadgetPlayDataNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<GadgetPlayDataNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GadgetPlayDataNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.GadgetPlayDataNotifyOuterClass.GadgetPlayDataNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GadgetPlayDataNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GadgetPlayDataNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\032GadgetPlayDataNotify.proto\"N\n\024GadgetPl" +
      "ayDataNotify\022\020\n\010progress\030\002 \001(\r\022\021\n\tplay_t" +
      "ype\030\004 \001(\r\022\021\n\tentity_id\030\013 \001(\rB\033\n\031emu.gras" +
      "scutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_GadgetPlayDataNotify_descriptor =
      getDescriptor().getMess[geTypes().get(0);
    internal_static_GadgetPlayDataNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GadgetPlayDataNotify_descriptor,
        new java.lang.String[] { "Progress", "PlayType", "EntityId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
