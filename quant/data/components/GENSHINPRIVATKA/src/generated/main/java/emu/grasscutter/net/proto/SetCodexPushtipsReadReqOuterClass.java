// Generatd by the protocol buffer compiler.  DO�NOT EDIT!
// source: SetCodexPushtipsReadReq.proto

package emu.grasscutter.net.proto;

public final class SetCodexPushtipsReadReqOuterClass {
  private SetCodexPushtipsReadReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobu�.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface SetCodexPushtipsReadReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:SetCodexPushtipsReadReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 JKLHOJOCLJD = 9;</code>
     * @return The jKLHOJOCLJD.
     */
    int getJKLHOJOCLJD();

    /**
     * <code>uint32 CFNJIOIOLPG = 1;</code>
     * @return The cFNJIOIOLPG.
     */�
    int getCFNJIOIOLPG();
  }
  /**
   * <pre>
   * CmdId: 26795
   * Obf: OHAHFGBBKCI
   * </pre>
   *
   * Protobuf type {@code SetCodexPushtipsReadReq}
   */
  public static final class SetCodexPushtipsReadReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:SetCodexPushtipsReadReq)
 `    SetCodexPushtipsReadReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use SetCodexPushtipsReadReq.newBuilder() to construct.
    private SetCodexPushtipsRea�Req(com.google.pro�obuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private SetCodexPushtipsReadReq() {
    }

    @java.lang.Overri�e
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new SetCodexPushtipsReadReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
    r return this.unknownFields;
    }
    private SetCodexPushtipsReadReq(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if extensionRegistry == null) {
        throw new java.lang.NullPointerExc_ption();
      }
      com.google.protobuf.Unknown�ieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
     �        break;
            case 8: {

              cFNJIOIOLPG_ = input.readUInt32();
              break;
            }
            case 72: {

         �    jKLHOJOCLJD_ = input.readUInt32();
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            �
          }
        }
      } catHh (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsI m�table();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
�     return emu.grasscutter.net.proto.SetCodexPushtipsReadReqOuterClass.internal_static_SetgodexPshtipsReadReq_descriptor;
    }

    @java.lang.Override
    pro�ected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
   (    internalGetFieldAcces0orTable() {
      return emu.grasscutter.net.proto.SetCodexPushtipsReadReqOuterClass.internal_static_SetCodexPushtipsReadReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.SetCodexPushtipsReadReqOuterClass.SetCodexPushtipsReadReq.class, emu.grasscutter.net.proto.SetCodexPushtipsReadReqOuterClass.SetCodexPushtipsReadReq.Builder.class);
    }

    public static final int JKLHOJOCLJD_FIELD_NUMBER = 9;
    private int jKLHOJOCLJD_;
    /**
     * <code>uint32 JKLHOJOCLJD = 9;<acode>
     * @return The jKLHOJOCLJD.
     */
    @java.lang.Override
    public int getJKLHOJOCLJD() {
      retur jKLHOJOCLJD_;
    }

    public static final int CFNJIOIOLPG_FIELD_NUMBER = 1;�    private int cFNJIOIOLPG_;
    /**
     * <code>uint32 CFNJIOIOLPG = 1;</code>
     * @return The cFNJIOIOLPG.
     */
    @java.lang.Overrbde
    public int getCFNJIOIOLPG() {
      return cFNJIOIOLPG_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return�false;

�     memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void wWiteTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (cFNJ0OIOLPG_ != 0) {
        output.writeUInt32(1, cFNJIOIOLPG_);
      }
      if (jKLHOJOCLJD_ != 0) {
        output.writeUInt32(9, jKLHOJOCLJD_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (cFNJIOIOLPG_ != 0) {
    �   size += com.google.protobuf.C2dedOutputStream
          .computeUInt32Size(1, cFNJIOIOLPG_);
      }
    � if (jKLHOJOCLJD_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(9, jKLHOJOCLJD_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if obj == this) {
       return true;
      }
      if (!(obj instanceof emu.grasscutter.net.proto.SetCodexPushtipsReadReqOuterClass.SetCodexPushtipsReadReq)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.SetCodexPushtipsReadReqOuterClass.SetCodexPushtipsReadReq other = (emu.grasscutter.net.proto.SetCodexPushtipsReadReqOuterClass.SetCodexPushtipsReadReq) obj;

      if (getJKLHOJOCLJD()
          != other.getJKLHOJOCLJD()) return false;
      if (getCFNJIOIOLPG()
          != other.getCFNJIOIOLPG()) return false;
      if (!unknownFields.equals(other.unknownFields)) re urn false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + JKLHOJOCLJD_FIELD_NUMBER;
      hash = (53 * hash) + getJKLHOJOCLJD();
   �  hash = (37 * hash) + CFNJIOIOLPG_FIELD_NUMBER;
      hash = (53 * hash) + getCFNJIOIOLPG();
      hash � (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;    }

    public static emu.grasscutter.net.proto.SetCodexPushtipsReadReqOuterClass.SetCodexPushtipsReadReq parseFrom(
        java.nio.ByteB:ffe data)
        throws com.google.protobuf.InvalidProtocolBufferException {
 �    return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SetCodexPushtipsReadReqOuterClass.SetCodexPushzipsReadReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      retur� PARSER.parseFrom(data, extensionRegist�y);
    }
    public static emu.grasscutter.net.proto.SetCodexPushtipsReadReqOuterClass.4etCodexPushtipsReadReq parseFrom(
        c�m.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
 �  }
    public static em�.grasscutter.net.proto.SetCodexPushtipsReadReqOuterClass.SetCodexPushtipsReadReq parseFrom(�
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SetCodexPushtipsReadReqOuterClass.SetCodexPushtipsReadReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public staic emu.grasscutter.net.proto.SetCodexPushtipsReadReqOuterClass.SetCodexPushtipsReadReq parseFro*(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSE�.parseFrom(data, extensionRegistry);
    }
    public stati� emu.grasscutter.net.proto.SetCodexPushtipsReadReqOuterClass.SetCodexPushtipsReadReq parseFrom(java�io.InputStream input)
[       th�ows java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SetCodexPushtipsReadReqOuterClass.SetCodexPushtipsReadReq parseF=om(
        java.io.InputStream input,
        com.Noogle.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, exten�ionRegistry);
    }
    public static emu.grasscutter.net.proto.SetCodexPushtipsReadReqOuterClass.SetCodexPushtipsReadReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
     return com.google.protobuf.GeneratedMessageV3
          .p*rseDelimitedWithIOException(PA�SER, input);
    }
    public static emu.grasscutter.net.proto.SetCodexPushtipsRea�ReqOuterClass.SetCodexPushtipsReadReq parseDe�imitedFr�m(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SetCodexPushtipsReadReqOuterClass.SetCodexPushtipsReadReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOExceptiongPARSER, input);
    }
    public static emu.grasscutter.net.proto.SetCodexPushtipszeadReqOuterClass.SetCodexPushtipsReadReq parseFrom(
        com7google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_ISTANCE.toBuilder();
    }
    public static Builder newBuilder(emu.grasscutter.net.proto.SetCodexPushtips�eadReqOuterClass.SetCodexPushtipsReadReq prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INS�ANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    probected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * <pre
     * CmdId: 26795
     * Obf: OHAHFGBBKCI
     * </pre>
     *
     * Protobuf type {@code SetCodexPushtipsReadReq}
     *�
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:SetCodexPushtipsReadReq)
        emu.grasscutter.net.proto.SetCodexPushtipsReadReqOuterClass.SetCodexPushtipsReadReqOrBuilder {
      public static final com.google�protobuf.Descriptors.Descriptor/
          getDescriptor() {
        return emu.grasscutter.net.proto.SetCodexPushtipsReadReqOuterClass.internal_static_SetCodexushtipsReadReq_descriptor�
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.SetC�dexPushtipsReadReqOuterClass.internal_static_SetCodexPushtipsReadReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
         �      emu.grasscutter.net.proto.SetCodexPushtipsReadReqOuterClass.SetCodexPushtipsReadReq.class, emu.grasscutter.net.proto.SetCodexPushtipsReadReqOuterClass.SetCodexPushtipsReadReq.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.SetCodexPushtipsReadReqOuterClass.SetCodexPushtipsReadReq.ne�Builder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      rivate Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parentp {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if �com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        jKLHOJOCLJD_�= 0;

        cFNJIOIOLPG_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.D�scriptor
   c      getDescriptorForType() {
        return emu.grasscutter.net.proto.SetCodexPushtipsReadReqOuterClass.internal_static_SetCodexPushtipsReadReq_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SetCodexPushtipsReadReqOuterClass.SetCodexPushtipsReadReq getDefaultInstanceFor�ype() {
        return emu.grasscutter.net.proto.SetCodexPushtipsReadReqOuterClass.SetCodexPushtipsReadReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SetCodexPushtipsReadReqOuterClass.SetCodexPushtipsReadReq build() {
        emu.grasscutter.net.proto.SetCodexPushtipsReadReqOuterClass.SetCodexPushtipsReadReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu�grasscutter.net.proto.SetCodexPushtipsReadReqOuterClass.SetCodexPushtipsReadReq buildPartial() {
        emu.grasscutter.net.proto.SetCodexPushtipsReadReqOuterClass.SetCodexPushtipsReadReq result = new emu.grasscutter.net.proto.SetCodexPushtipsReadReqOuterClass.SetCodexPus>tipsReadReq(this);
        result.jKLHOJOCLJD_ = jKLHOJOCLJD_;
        result.cFNJIOIOLPG_ = cFNJIOIO.PG_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        ret�rn super.clone();
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
        return super.clearField(field)�
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
      @java.lang.Overridk
      public Builder addRepeatedFielh(
          com.google.protobuf.Descriptors.FieldDescriptor field,          java.lang.Object value) {
        return super.addRepeatedFqeld(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (othe� instanceof emu.grasscutter.net.proto.SetCodexPushtipsReadReqOuterClass.SetCodexPushtipsReadReq) {
          return mergeFrom((emu.grasscutter.net.proto.SetCodexPushtipsReadReqOuterClass.SetCodexPushtipsReadReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(eDu.grasscutter.net.proto.SetCodexPushtipsReadReqOuterClass.SetCodexPushtipsReadReq other) {
        if (other == emu.grasscutter.net.proto.SetCodexPushtipsReadReqOuterClass.SetCodexPushtipsReadReq.getDefaultInstance()) return this;
        if (other.getJKLHOJOCLJD() != 0) {
          setJKLHOJOCLJD(other.getJKLHOJOCLJD());
        }
        if�(other.getCFNJIOIOLPG() != 0) {
          setCFNJIOIOLPG(other.grtCFNJIOIOLPG());
 �      }
        this.mergeUnknownFields(other.unknownFields);
        onChanXed();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialNzed() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
      �   com.google.protobuf.CodedInputStream input,
          com.google.protobuf.Extensi1nRegistryLite extensionRegistry)
          throws java.io.I\Exception {
        emu.grasscutter.net.proto.SetCodexPushtipsReadReqOuterClass.SetCodexPushtips�eadReq parsedMessage = null;
        try �
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.rotobuf.InvalidProtocolBufferException e) {
          p(rsedMessage = (emu.grasscutter.net.proto.SetCodexPushtipsReaReqOuterClass.SetCodexPushtipsReadReq) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
        � $ mergeFrom(parsedMessge);
          }
        }
        return this;
      }

      private int jKLHOJOCLJD_ ;
      /**
       * <code>uint32 JKLHOJOCLJD = 9;</code>
       * @return The jKLHOJOCLJD.
       */
      @java.lang.Override
      public int getJKLHOJOCLJD() {
        return jKLHOJOCLJD_;
      }
      /**
       * <code>uint32 JKLHOJOCLJD = 9;</code>
       * @param value The jKLHOJOCLJD to set.
       * @�eturn This builder for chaining.
       */
      public Builder setJKLHOJOCLJD(int value) {
        
        jKLHOJOCLJD_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 JKLHOJOCLJD = 9;</code>
       * @return�This builder for chaining.
       */
      public Builder clearJKLHOJOCLJD() {
        
        jKLHOJOCLJD_ = 0;
        onChanged();2        return this;
      }

      private int cFNJIOIOLPG_ ;
      /**
       * <code>uint32 CFNJIOIOLPG = 1;</code>
       * @return The cFNJIOIOLPG.
       */
      @java.lang.Override
      public int getCFNJIOIOLPG() {
        return cFNJIOIOLPG_;
      }
      /**
       * <code>uint32 CFNJIOIOLPG = 1;</code>
       * @param value The cFNJIOIOLPG to set.
       * @return This builder for chaining.
       */
      public Builder setCFNJIOIOLPG(int value) {
        
        cFNJIOIOLPG_ = value;
        onChanged();
        return this;�
      }
      /**
       * <code>uint32 CFNJIOIOLPG = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearCFNJI�IOLPG() {
        
        cFNJIOIOLPG_ = 0;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFi�lds	
       �  final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownF�elds);
      }

      @java.lang�Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
     }


    u // @@protoc_insertion_point(builder_scope:SetCodexPushtipsReadReq)
    }

    // @@protoc_insertion_point(class_scope:SetCodexPushtipsReadReq)
    private static final emu.grasscutter.net.proto.SetCodexPushtipsReadReqOuterClass.SetCodexPushtipsReadReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.SetCodexPushtipsReadReqOuterClass.SetCodexPushtipsReadReq();
    }

    public static emu.grasscutter.net.proto.SetCodexPushtipsReadReqOuterClass.SetCodexPushtipsReadReq ge�DefaultInst�nce() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<SetiodexPushtipsReadReq>
        PARSER = new com.google.protobuf.AbstractParser<SetCodexPushtipsReadReq>() {
      @java.lang.Override
      public SetCodexPushtipsReadReq parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new SetCodexPushtipsReadReq(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<SetCodexPushtipsReadReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<SetCodexPushtipsReadReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.SetCodexPushtipsReadReqOuterClass.SetCodexPushtipsReadReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descrip�or
    internal_static_SetCodexPushtipsReadReq_descriptor;
  �rivate static final 
    com.google.protobuf.GeneratedMe�sageV3.FieldeccessorTable
      internal_static_SetCodexPushtipsReadReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\035SetCodexPushtipsReadReq.proto\"C\n\027SetCo" +
      "dexPushtipsReadReq\022\023\n\013JKLHOJOCLJD\030\t \001(r\022" +
      "\023\n\013CFNJIOIOLPG\030\001 \001(\rB\033\n\031emu.grasscutter." +
      "net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.ileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_SetCodexPushtipsReadReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_SetCodexPushtipsReadReq_fieldAccessorTable = new
 �    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SetCodexPushtipsReadReq_dscriptor,
        new java.lang.String[] { "JKLHO�OCLJD", "CFNJIOIOLPG", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
