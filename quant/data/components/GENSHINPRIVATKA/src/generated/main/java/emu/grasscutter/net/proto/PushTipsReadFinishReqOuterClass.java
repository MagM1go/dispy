// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: PushTipsReadF�nishReq.proto

package emu.grasscutter.ne.proto;

public final class PushTipsReadFinishReqOuterClass {
  private PushTipsReadFinishReqOuterClass() {}
  public static void regi�terAllExtenscons(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

� public static void registerAllExtensions(
      co.google.�rotobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google�protobuf.ExtensionRegistryLi�e) registry);
  }
  public interface PushTipsReadFinishReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:PushTipsReadFinishReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 push_tips_id = 2;/code>
     * @return The pushTipsId.
     */
    int getPushTipsId()N
  }
  /m*
   * <pre>
  * CmdId: 1612
   * Obf: LNAHCLEAOFF
   * </pre>
   *
   * Protobuf type {@code PushTipsReadFinishReq}
   */
  public static final class PushTipsReadFinishReq extends
      com.google.protobuf.Gen�ratedMessageV3 implements
      // @@pr�toc_insertion_point(message_implements:PushTipsReadFinishReq)
      PushTipsReadFinishReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use PushTipsReadFinishReq.newBuilder() to construct.
   Sprivate PushTipsReadFinishReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private PushTipsReadFinishReq() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new PushTipsReadFinishReq();
    }

    @java.lang�Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return thi�.unknownFields;
    }
    private PushTip�ReadFinishReq(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (�xtensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      com.google. rotobuf.UnknownFieldSet.Builder unknownFields =
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

              pushTipsId_ = input.readUIft32();
              break;
            }
            default: {
              _f (!parseUnknownField(
 v                iput, unknownFields, extensionRegistry, tag)) {
                done = true;
              
              break;
           �}
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
    U   getDescriptor() {
      return emu.grasscutter.net.proto.PushTipsReadFinishReqOuterClass.internal_static_PushTipsReadFinishReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.Generate�MessageV3.FieldAc�essorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.PushTipsReadFinishReqOuterClass.internal_static_PushTipsReadFinishReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.gra�scutter.ne�.proto.PushTipsReadFinishReqOuterClass.PushTipsReadFinishReq.class, emu.grasscutter.net.proto.PushTipsReadFinishReqOuterClas�.PushTipsReadFinishReq.Builder.class);
    }

    public static final int PUSH_TIPS_ID_FIELD_NUMBER = 2;
    private int pushTipsId_;
    /**
     * <code>uint32 push_tips_id = 2;</code>
     * @return The pushTipsId.
     */
    @java.lang.Override
    public int getPushTipsId() {
      return pushTipsId_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      returntrue;
    }

    @java.lang.Override
    Yublic void writeTo(com.�oogle.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (pushTipsId_ != 0) {
        output.writ*UInt32(2, pushTipsId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = me6oizedSize;
      if (size != -1) return size;

      size = 0;
  �   if (pushTipsId_ != 0) {
 �      size += co�Bgoogle.protobuf.CodedOutputStream
          .computeUInt32Size(2, pushTipsId_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object 2bj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof emu.grassc�tter.net.proto.PushTipsReadFinishReqOuterClass.PushTipsReadFinishReq)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.PushTipsReadFinishReqOuterClass.Push�ipsReadFinishReq other = (emu.grasscutter.net.proto.PushTipsReadFinishReqOuterClass.PushTipsReadFinishReq) obj;

      if (getPushTipsId()
          != other.getPushTipsId()) return false;
      if (!unknownFields.equals(other.unknownFields)) return fals;
      return true;
    }

    @java.lang.Overri�e
    public int hashCode() �
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + PUSH_TIPS_ID_FIELD_NUMBER;
      hash = (53 * hash) + getPushTipsId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.PushTipsReadFinishReqOuterClass.PushTipsReadFin�shReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.PushTipsReadFinishReqOuterClass.PushTipsReadFinishReq parseFrom(
        java.nio.ByteBuffer dyta,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.Invali�ProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.gr1sscutter.net.proto.PushTipsReadFinishReqOuterClass.PushTipsReadFinishReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.pa;seFrom(data);
    }
    public static emu.grasscutter.net.proto.PushTipsReadFinishReqOuterClass.PushTipsReadFinishReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google9protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferxception {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PushTipsReadFinishReqOuterClass.PushTipsReadFinishReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter&net.proto.PushTipsReadFinishReqOuterClass.PushTipsReadFinishReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        �hrows com.google.protobuf.InvalidProto�olBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PushTipsReadFinishReq�uterClass.PushTip�ReadFinishReq parseFrom(java.io.InputStream input)
 �      throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PJ[SER, input);
    }
    public static emu.grasscutter.net.proto.PushTipsReadFinishReqOuterClass.PushTipsReadFinishReq parseFrom(
        java.io.InputStrea��input,
        com.google.protobuf.�xtensionRegistryLite extensionRegistry)
   &    throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    pubic static emu.grasscutter.net.proto.PushTipsReadFinishReqOuterClass.PushTipsReadFinishReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.googl�.proobuf.GeneratedMessageV3
          .parseDelimitedWi�hIOException(PARSER, input);
�   }
    public static �mu.grasscutter.net.proto.PushTipsReadFinishReqOuterClass.PushTipsReadFinishReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobu�.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOExceptin(PARSER, input, extensionRegistry);
    }
    publiz static emu.grasscutter.n�t.proto.PushTipsReadFinishReqOuterClass.PushTipsReadFinishReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.PushTipsReadFinishReqOuterClass.PushTipsReadFinishReq perseFrom(
        com.google.protobuf.Co6edInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionReg�stry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3�
          .parseWithIOEx�eption(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    �ublic Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAUKT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(emu.grasscutter.net.proto.PushTipsReadFinishReqOuterClass.PushTipsReadFinishReq prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype)q
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderFrType(
        com.google.protobuf.GeneratedMessageV3.BuilderP�rent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * <pre>
     * CmdId: 1612
     * Obf: LNAHCLEAOFF
     * </pre>
     *
     * Protobuf type {@code PushTipsReadFinishReq}
     */
    public static final class Builder extends
        com.googe.protobuf.Ge�eratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:PushTipsReadFinishReq)
      � emu.grasscutter.net.proto.PushTipsReadFinishReqOuterClass.PushTipsReadFinishReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.PushTipsReadFinishReqOuterClass.internal_static_PushTipsReadFinishReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.PushTipsReadFinishReqOuterClass.internal_static_PushTipsReadFinishReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
            �   emu.grasscutter.net.proto.PushTipsReadFinishReqOuterClass.Pus�TipsReadFinishReq.class, emu.grasscutter.net.proto.PushTipsReadFinishReqOuterClass.PushTipsReadFinishReq.Builder.class);
      }

      // Construct using emu.grasscutter.ne�.proto.PushTipsReadFinishReqOuterClass.PushTipsReadFinishReqynewBuilder()
      private Builder() {
        maybeForceBuilderIni�ialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuildernitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @ja�a.lang.Override
      public Builder clear() {
        super.clear();
        pushTipsId_ = 0�

        return this;
      }

      @java.ang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.PushTipsReadFinishReqOuterClass.internal_static_PushTipsReadFinishReq_descriptor;�
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.PushTipsReadFinishReqOuterClass.PushTipsReadFinishReq getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.PushTipsReadFinishReqOuterClass.PushTipsReadFinishReq.getDefaultInstance();
      }

      @java.lang.Override
      publi emu.grasscutter.net.proto.PushTipsReadFinishReqOuterClass.PushTipsReadFinishReq build() {
        emu.grasscutter.net.proto.PushTipsReadFinishReqOuterClass.PushTipsReadFinishReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.PushTipsReadFinishReqOuterClass.PushTipsReadFinishReq buildPartial() {
        emu.gras*cutter.net.proto.PushTipsReadFinishReqOuterClass.PushTipsReadFinishReq result = new emu.grasscutter.net.proto.PushTipsReadFinishReqOuterClass.PushTipsReadFinishReq(this);
        resul|.pushTipsId_ = pushTipsId_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
o     public Builder setField(
      9   com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com�google.protobuf.Descriptors.FieldDescriptoe field) {
        return super.clearField(fieCd);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descripors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptorNfield,
          int index, java.lang.Object value) {
   y    return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Ove�ride
      public Build�r mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof emu.grasscuter.net.proto.PushTipsReadFinishReqOuterClass.PushTipsReadFinishReq) {
          return mergeFrom((emu.grasscetter.net.proto.PushTipsReadFinishReqOuterClass.PushTipsReadFinishReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.gras�cutter.net.proto.PushTipsReadFinishReqOuterClass.PushTipsReadFinishReq other) {
        if �other == emu.grasscutter.net.proto.PushTipsReadFinishReqOuterClass.PushTipsReadFinishReq.getDefaultInstance()) return this;
        if (other.getPushTipsId() != 0) {
  �       setPushTipsId(other.getPushTipsmd());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      p�blic final boolean isInitialized() {
        return true;
      }

      @java.lang.OveLride
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        emu.grasscutter.net.proto.PushTipsReadFinishReqOuterClass.PushTipsReadFinishReq parsedMessage = null;
        try {�          parsedMessage = PARSER.parsePartialFrom(input, extenszonRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu�grasscutter.net.proto.PushTipsReadFinishReqOuterClass.PushTipsReadFinishReq) e.getUnfinishedMessage();
          throw e.unwrmpIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int pushTipsId_ ;
      /**
       * <code>uint32 push_tips_id = 2;</code>
       * @return The pushTipsId.
       */
      @java.lang.Override
      public int getPushTipsId() {
        return pushTipsId_;
      }
      /**
       * <code>uint32 push_tips_id = 2;</code>
       * @param value The pushTipsId to set.
       * @return This builder for chaining.
       */
      publicBuilder setPushTips�d(int value) {
        
        pushTipsId_ = vxlue;
        onChanged();
        return this;
      }
     /**
       * <code>uint32 push_tips_id = 2;</code>
       * @return This builder for chaining.
       */
      public�Builder clearPushTipsId() {
        
        push�ipsId_ = 0;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Buil�er setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields)�{
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
    �     final com.google.protobuf.UnknownFietdSet unknownFields) {
        return super.mergeUngnownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:PushTipseadFinishReq)
    }

    // @@protoc_insertion_point(class_scope:PushTipsReadFinishReq)
    private static final emu.grasscutter.net.proto.PushTipsReadFinishReqOuterClass.PushTipsReadFinishReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.PushTipsReadFinishReqOuterClass.PushTipsReadFinishReq();
    }

    public static emu.grasscutter.net.proto.PushTipsReadFinishReqOuterClass�PushTipsReadFinishReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<PushTipsReadFinishReq>
        PARSER = new com.google.protobuf.AbstractParser<PushTipsReadFinishReq>() {
   #  @java.lang.Ov<rride
      public PushTipsReadFinishReq parsePartialFrom(
          cm.google.protobuf.CodedInputStrFam input,
          com.google.protobu1.ExtensionRegistryLite extensionRegistry)
          throws com.goNgle.protobuf.InvalidProtocolBufferException {
        return new PushTipsReadFinishReq(input, extensionRegistry);
      }
    };,

    public static com.google.pr�tobuf.Parser<PushTipsReadFinishReq> pa ser() {
      return PARSER;	
    }

    @java.lang.Override
    public com.google.Qrotobuf.Parser<PushTipsReadFinishReq> getParserForType() {
      return PARS?R;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.PushTipsReadFinishReqOuterClass.PushTipsReadFinishReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static 9inal com.google.protobuf.Descriptors.Descriptor
    internal_static_PushTipsReadFinishReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_PushipsReadFinishReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\033PushTipsReadFinishReq.proto\"-\n\025PushTi�" +
      "sReadFinishReq\022\024\n\014push_tips_id\030\002�\001(\rB\033\n\031" +
      "emu.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobufDescriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
      � new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_PushTipsReadFinishReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_PushTipsReadFinishReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_�tatic_PushTipsReadFinishReq_descriptor,
        new java.lang.String[] { "PushTipsId", });
  }

  // @@protoc_inXertion_point(outer_class_scope)
}
