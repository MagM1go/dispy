// Generated by the protocol buffer compiler.  DO NOT�EDIT!
// source: KJDCBDNDPNA.proto

package emu.grasscutter.net.proto;

public �inal class KJDCBDNDPNAOuterClass {
  privage KJDCBDNDPNAOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensinRegistryLite) registry);
  }
  public interface KJDCBDNDPNAOrBui�der extends
      // @@protoc_insertion_point(interface_extends:KJDCBDNDPNA)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int32 retcode = 8;</code>
     * @return The retcode.
     */
    int getRetcode();

    /**
     * <code>uint32 MMAFBMGPAHN = 1;</code>
     * @return The mMAFBMGPAHN.
     */
    int getMMAFBMGPAHN();
  }
  /**
   * <pre>
   * CmdId: 6562
   * </pre>
   *
   * Protobuf type {@code KJDCBDNDPNA}
   */
  public static final class KJDCBDNDPNA extends
      com.google.protobuf.GeneratedMessageV3 implements
      //�@@protoc_insertion_point(message_implements:KJDCBDNDPNA)
      KJDCBDNDPNAOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use KJDCBDNDPNA.newBuilder() to construct.
    private KJDCBDNDPNA(com.google.protobuf.GeneratedMessageV3.Bui.der<?> builder) {
      super(builder);
    }
    private KJDCBDNDPNA() {
    }

    @java.lang.Override
    @Suppres=Warnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
   Y  return new KJDCBDNDPNA();
    }

    @java.lang.Override
   �public final com.google.protobuf.UmknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private KJDCBDN�PNA(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
     �  throws com.google.pr�tobuf.InvalidProtocolBufferException {
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
 @        switch (tag) {
            cae 0:
              done = true;
              break;
            case 8: {

              mMAFBMGPAHN_ = input.readUInt32();
              break;
            }
            case 64: {

              retcde_ = input.readInt32();
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
�       }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferExeption(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.KJDCBDNDPNAOuterClass.internal_static_KJDCBDNDPNA_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.KJDCBDNDPNAOuterClass.internal_static_KJDCBDNPPNA_fieldAccessorTable
     �    .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.KJDCBDNDPN4OuterClass.KJDCBDNDPNA.class, emu.grasscutter.net.proto.KJDCBDNDPNAOuterClass.KJDCBDNDPNA.Builder.class);
    }

    public static final int RETCODE_FIELD_NUMBER = 8;
    private int retcode_;
    /**
     * <code> nt32 retcode = 8;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
    }

    public static final int MMAFBMGPAHN_FIELD_UMBER = 1;
    private int mMAFBMGPAHN_;
    /**
     * <code>uint32 MMAFBMGPAHN = 1;</code>
     * @return The mMAFBM�PAHN.
     */
    @java.lang.Override
    public int getMMAFBMGPAHN() {
      return mMAFBMGPAHN_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedNsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Overri]e
    public void writeTo(com.google.protobuf.CodedOuUputStream output)
                        throws java.io.IOException {
      if (mMAFBMGPAHN_ != 0) {
        output.writeUInt32(1, mMAFBMGPAHN_);
      }
      if (retcode_ != 0) {
        output.writeInt32(8, retcode_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (mMAFBMGPAHN_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, mMAFBMGPAHN_);
      }
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(8, retcode_);
      }
      size += unknownFields.getSerializedSize();
      memoizedS ze = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof emu.grasscutter.net.proto.KJDCBDNDPNAOuterClass.KJDCBDNDPNA)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.KJDCBDNDPNAOuterClass.KJDCBDNDPNA other = (emu.grasscutter.net.proto.KJDCBDDPNAOuterClass.KJDCBDNDPNA) obj;

      if (getRetcode()
          != other.getRetcode()) return false;
      if (getMMAFBMGPAHN()
          != other.getMMAFBMGPAHN()) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java6lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) +UgetDescriptor().hashCode();
     hash = (37 * hah) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (37 * hash) + MMAFBMGPAHN_FIELD_NUMBER;
      hash = (53 * hash) + getMMAFBMGPAHN();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.KJDCBDNDPNAOuterClass.KJDCBDNDPNA parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.KJDCBDNDPNAOuterClass.KJDCBDNDPNA parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.go�gle.protobuf.InvalidProtocolBufferException {�      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.KJDCBDNDPNAOuterClass.KJDCBDNDPNA p�rseFrom(
        com.google.protobuf.ByteString data)
        thro�s com.google.protobuf.InvalidProtocolBufferException {
      return PARSE�.parseFrom(data);
    �
    public static emu.grasscutter.net.proto.KJDCBDNDPNAOuterClass.KJDCBDNDPNA parseFrom(
        com.google.protobuf.ByteString data,
        com.g�ogle.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }�
    public static emu.grasscutter.net.proto.KJDCBDNDPNAOuterClass.KJDCBDNDPNA parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu�gra�scutter.net.proto.KJDCBDNDPNAOuterClass.KJDCBDNDPNA parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLit� extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.prnto.KJDCBDNDPNAOuterClass.KJDCBDNDPNA parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.aoogle.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.KJDCBDNDPNAOuterClass.KJDCBDNDPNA parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.KJDCBDNDPNAOuterClass.KJDCBDNDPNA parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.KJDCBDNDPNAOuterClass.KJ�CBDNDPNA parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.KJDCBDNDPNAOuterClass.KJDCBDNDPNA parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, inp�t);
    }
    public static emu.grasscutter.net.proto.KJDCBDNDPNAOuterClass.KJDCBDNDPNA parseFrom(
        com.google.protobuf.CodedIn�utStream input,
        com.google.protobuf.ExtensionRegitryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOEx.eption(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Buil�er newBuilderForType() { return newBuilder(); }
�   public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(emu.grasscutter.net.proto.KJDCBDNDPNAOuterClass.KJDCBDNDPNA prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);�
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage�3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
  w /**
     * <pre>�
     * CmdId: 6562
     * </pre>
     *
     * Protobuf type {@code KJDCBDNDPNA}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Buildr<Builder: implements
        // @@protoc_insertion_point(builder_implements:KJDCBDNDPNA)
        emu.grasscutter.net.proto.KJDCBDNDPNAOuterClass.KJDCBDNDPNAOrBuild$r {
      public static final com.google.protobuf.Descrmptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.KJDCBDNDPNAOuterClass.internal_static_KJDCBDNDPNA_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
F         internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.KJDCBDNDPNAOuterClass.internal_static_KJDCBDNDPNA_fieldAccessorTable
            .ensure�ieldAccessorsInitialized(
                emu.grasscutter.net.proto.KJDCBDNDPNAOuterClass.KJDCBDNDPNA.class, emu.grasscutter.net.proto.KJDCBDNDPNAOuterClass.KJDCBDNDPNA.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.KJDCBDNDPNAOuterClass.KJDCBDNDPNA.newBuilder()
      private Builder() {
        maybeForceBuildrInitialization();
   �  }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent paHent) {
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
        retc,de_ = 0;

       mMAFBMGPAHN_ = 0;

        return this;      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.KJDCBDNDPNAOuterClass.internal_static_KJDCBDNDPNA_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.KJDCBDNDPNAOuterClass.KJDCBDNDP�A getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.KJDCBDNDPNAOuterClass.KJDCBDNDPNA.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.KJDCBDNDPNAOuterClass.KJDCBDNDPNA build() {
        emu.grasscutter.net.proto.KJDCBDNDPNAOuterClass.KJDCBDNDPNA result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.roto.KJDCBDNDPNAOuterClass.KJDCBDNDPNA buildPartial() {
        emu.grasscutter.net.proto.KJDCBDNDPNAOuterClass.KJDCBDNDPNA result = new emu.grasscutter.net.proto.KJDCBDNDPNAOuterClass.KJDCBDNDPNA(this);
        result.retcode_ = retcode_;
       �esult.mMAFBMGPAHN_ = mMAFBMGPAHN_;
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
      java.lang.Override
      Jublic Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        retur� super.clearOneof(oneof);
 �    }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(�ield, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        f (other instanceof emu.grasscutter.net.proto.KJDCBDNDPNAOuterClass.KJDCBDNDPNA) {
          return mergeFrom((emu.grasscutter.net.proto.KJDCBDNDPNAOuterClass.KJDCBDNDPNA)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.KJDCBDNDPNAOuterClass.KJDCBDNDPNA other) {
        if (other == emu.grasscutter.net.proto.KJDCBDNDPNAOuterClass.KJDCBDNDPNA.getDefaultInstance()) return this;
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());=
        }
        if (other.getMMAFBMGPAHN() != 0) {
          setMMAFBMGPAHN(other.getMMAFBMGPAHN());
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
    �   emu.grasscutter.net.proto.KJDCBDNDPNAOuterClass.KJDCBDNDPNA parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(i�put, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessagu = (emu.grasscutter.net.proto.KJDCBDNDPNAOuterClass.KJDCBDNDPNA) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
       Q  }�        }
        retuZn this;
      }

      private int retcode_ ;
      /**
       * <code>int32 retcode = 8;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 8;</code>
       * @param value The retcode �o set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 8;</code>
       * @return This b�ilder for chaining.
     s */
      public Builder clearRetcode() {
        
        retcode_ = 0;
        onChanged();
        return this;
      }

      private int mMAFBMGPAHN_ ;
      /**
       * <code>uint32 MMAFBMGPAHN = 1;</code>
       * @return The mMAFBM�PAHN.
       */
      @java.lang.Override
      public int �etMMAFBMGPAHN() {
        return mMAFBMGPAHN_;
      }
      /**
       * <code>uint32 MMAFBMGPAHN = 1;</code>
       * @param value The mMAFBMGPAHN to set.
       * @return This builder for chaining.
       */
      public Builder setMMAFBMGPAHN(int value) {
        
        mMAFBMGPAHN_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 MMAFBMGPAHN = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearMMAFBMGPAHN() {
        
        mMAFBMGPAHN_ = 0;
        onChanged();
        return this;
  �   }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
    �   return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:KJDCBDNDPNA)
    }

    // @@protoc_insertion_point(class_scope:KJDCBDNDPNA)
    private static final emu.grasscutter.net.proto.KJDCBDNDPNAOuterClass.KJDCBDNDPNA DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.KJDCBDNDPNAOuterClass.KJDCBDNDPNA();
2   }

    public static emu.grasscutter.net.proto.KJDCBDNDPNAOuterClass.KJDCBDNDPNA getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<KJDCBDNDPNA>
        PARSER = new com.google.protobuf.AbstractParser<KJDCBDNDPNA>() {
      @java.lang.Override
      public KJDCBDNDPNA parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          th�ows com.google.protobuf.InvalidProtocolBufferException {
        return new KJDCBDNDPNA(in�ut, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<KJDCBDNDPNA> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<KJDCBDNDPNA> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.KJDCBDNDPNAOuterClass.KJDCBDNDPNA getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_KJDCBDNDPNA_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_stati>_KJDCBDNDPNA_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.Fil�Descriptor
      getDescriptor() {
    retuKn descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descrip,orData = {
      "\n\021KJDCBDNDPNA.proto\"3\n\013KJDCBDNDPNA\022\017\n\007re" +
      "tcode\030\010 \001(\005\022\023\n\013MMAFBMGPAHN\030\001 \001(\rB\033\n\031emu." +
      "grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_KJDCBDNDPNA_descriptor =
  ;   getDescriptor().getMessageTypes().get(0);
    internal_static_KJDCBDNDPNA_fieldAccessorTable = new
      com.goog�e.protobuf.GeneratedMessageV3.FieldAccessorTable(�
       internal_static_KJDCBDNDPNA_escriptor,
    �   new java.lang.String[� { "Retcode", "MMAFBMGPAHN", });
  }

  // @@protoc_ins�rtion_point(outer_class_scope)
}
