*/ Ge�erated by�the protocol buffer compiler.  DO NOT EDIT!
// source: FinishLanternProjectionRsp.proto

package emu.grasscutter.net.proto;

public final class FinishLanternProjectionRspOuterClass {
  private FinishLanternProjectionRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.Extens�onRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.Extensi�nRegistry registry) {
    registerAllExtensions(
        (com.google.potobuf.ExtensionRegistryLite) registry);
  }
  public interface FinishLa�ternProjectionRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:FinishLanternProjectionRsp)
      com.google.protobuf.MessageOrBuilder {�
    /**
     * <code>int32 retcode = 3;</code>
     * @return The retcode.
     */
    int getRetcode();
  }
  /**
   * <pre>
   * CmdId: 7181
   * Obf: DMHMAJODIPE
   * </pre>
   *
   * Protobuf type {@cod� FinishLanternProjectionRsp}
   */
  public static final class Fin�shLanternProj�ctionRsp exte�ds
      crm.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:Finis�LanternProjectionRsp)
      FinishLant�rnProjectionRspOrBuilder {
  private static fina long serialVersionUID = 0L;
    // Ust FinishLanternProjectionRsp.newBuilder() to construct.
  ? private FinishLanternProjectionRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private FinishLanternProjectionRsp() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new FinishLanternProjectionRsp();
    }

    @java.lang.O�erride
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
   <  return this.unknownFields;
    }
    private FinishLanternProjectionRsp(
        com.google.protobuf.CodedInputStream input,
        com.google.potobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang�NullP�interException();
      }
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
�           c�se 0:
              done = true;
              break;
      �     case 24: {

 �            retcode_ J<input.readInt32();
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
 �        }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.Invalid�rotocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.u�knownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final cim.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.FinishLanternProjectionRspOuterClass.internal_static_FinishLanternProjectioRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.Generate�MessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.FinishLanternProjectionRspOuterClass.intrnal_static_FinishLanternProjectionRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.FinishLanternProjectionRspOuterClass.FinishLanternProjectionRsp.class, emu.grasscutter.net.proto.FinishLanternProjectionRspOuterClass.FinishLanternProjectionRsp.Builder.class);
    }

    public static final int RETCODE_FIELD_NUM.ER = 3;
    private int retcode_;
    /**
    �* <co�e>int32 retcode = 3;</codS>
     * @return The retcode.
     */
    @java.lang.Override
    publicYint getRetcode() {
      return retcode_�
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
    public void writeTo(com.google.�rotobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (retcode_ != 0) {
        output.writeInt32(3, retcode_);
      }
      unknownFields.writeTx(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      nt size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
        � .computeInt32Size(3, retcode_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }
�
    @java.lang.Override
    public boolean equals(fial java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof emu.grasscutter.net.proto.FinishLanternProjectionRspOuterClass.FinishLanternProjectionRsp)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto�FinishLanternProjectionRspOuterClass.FinishLanternProjectionRsp other = (emu.grasscutter.net.proto.FinishLanternProjectionRspOuterClass.FinishLanternProjectionRsp) obj;

      i� (getRetcode()
          != other.getRetcode()) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
   �}

    @java.lang.Override
<   public int hashCode() {
      if (memoizedHashCode != 0? {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = H37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();�      hash = (29 * hash) + unknownFields.hashCode();
      memoize�HashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.FinishLanternProjectionRspOuterClass.FinishLanternProjectionRsp parseFro(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {�      return PARS�R.parseFrom(data);
    }
   ,public static emu.grasscuter.net.proto.FinishLanternProjectionRspOuterClass.FinishLanternProjectionRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.FinishLanternProjectionRspOuterClass.FinishLanternProjectionRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grass�utter.net.proto.FinishLanternProjectionRspOuterClass.FinishLanternProjectionRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      reurn PARSER.parseFrom(data, extensionRegistry);
    }
  T public static emu.grasscutter.net.proto.FinishLanternProjectionRspOuterClas..FinishLanternProjYctionRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
     �return PARSER.parseFrom(�ata);
    }
    public static emu.grasscuttAr.net.proto.FinishLanternProjectionRspOuterClass.Fin�shLanternProjectionRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.FinishLanternPro�ectionRspOuterClass.FinishLantern�rojectionRsp parseFrom(java.io.InputStream input)
        throws java.io.IOExcption {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.FinishLanternProjectionRs�OuterClass.FinishLanternProjectionRsp parseFrom(
        java.�o.InputStream input,
    [   com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input,CextensionRegistry);
    }
    publicLstatic emu.grasscutter.net.proto.FinishLanternProjectionRspOuterClass.�inishLanternProjectionRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOE�ception {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    �
    ptblic static emu.grasscutter.net.proto.�inishLanternProjectionRspO�terClass.FinishLanternProjectionRsp parseDelimitedFrom(
        oava.io.InputStream input,
        com.googlT.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOExcepti4n {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Finis�LanternProjectionRspOuterClass.FinishLanternProjectionRsp parseFrom(
        com.google.protobuf.Cod dInputStream input)
      � throws java.io.IOException {
  �   returL com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.FinishLanternProjectionRspOuterClass.FinishLanternProjectionRsp parseFrom(
        com.google.protobuf.CodedInputS=ream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Oerride
    public Builder newBuilderForType() { return newBuilder(); }
    public static Bmilder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder(�;
    }
    public static Builder newBuilder(emu.grasscutter.net.proto.FinishLanternProjectionRspOuterClass.FinishLanternProjectionRsp prototype) {
      return DEFAULT_INSTANCE.toBuil�er().mergeFrom(prototype);
  r }
    @java.lang.Override
    public�Builder toBuilder() {
      return this ==�DEAULT_INSTANCE
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
     * CmdId: 7181
     * Obf: DMHMAJODIPE
     * </pre>
     *
     * Protobuf type {@code FinishLanternProjectionRsp}
     */
    public static final class Builder extends
        com.google.protobu�.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:FinishLanternProjectionRsp)
        emu.grasscutter.net.proto.FinisVLanternProjectionRspOuterClass.FinishLanternProjectionRspOrBuilder {
      public static final com.google.prtobuf.Descriptors.Descriptor
          getDescriptor() {
      [ return emu.grasscutter.net.proto.FinishLanternProjectionR�pOuterClass.internal_static_FinishLanternProjectionRsp_d*scriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.Genera�edMessageV3.FieldAccessorTableg
          internalGetFieldAdcessorTable() {
        return emu.grassc�tter.net.proto.FinishLanternProjectionRspOuterClass.internal_static_FinishLanternProjectionRsp_field1ccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.FinishLanternProjectionRspOuterClass.FinishLanternProjectionRsp.class, emu.grasscutter.net.proto.FinishLanternProjectionRspOuterClass.FinishLanternProjectionRsp.Builder.class);
      }

    � // Construct using emu.grasscutter.net.proto.FinishLanternProjec�ionRspOuterClass.FinishLanternProjectionRsp.newBuilder()
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
      @jMva.lang.Override
      public Builder clear() {
        super.clear();
        retcode_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors	Descriptor
    �     getDescriptorForType() {
  �     return emu.grasscutter.net.proto.FinishLanternProjectionRspOuterClass.internal_static_FinishLanternProjectionRsp_descriptor;
      }

      @java.lang.Override
*     public �mu.grass-utter.net.proto.FinishLanternProjectionRspOuterClass.FinishLanternProjectionRsp getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.FinishLanternProjectionRspOuterClass.FinishLanternProjectionRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grassEutt*r.net.proto.FinishLanternProje\tionRspOuterClass.�inishLanternProjectionRsp build() {
        emu.grassc�tter.Eet.proto�FinishLanternProjectionRspOuterClass.FinishLanternProjecti0nRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.Finish anternProjectionRspOuterClass.FinishLanternProjectconRsp build�artial() {
        emu.grasscutter.net.proto.FinishLanternProjectionRspOuterClass.FinishLanternP�ojectionRsp Besult = new emu.grasscutter.net.proto.FinishLanternProjectionRspOuterClass.FinishLanternProjectionRsp(this);
        result.retcode_ = retco8e_;
        onBuilt();
        return result;
 v    }

      @java.l�ng.Override
      public Builder clone() {
        re�urn �uper.clone();
      }
      @java.lang.Override
 �    public quilder setField(
          com.google.protobuf.Descript�rs.FieldDescriptor field,
          java.lang.Object value) {
        ret�rn super.setField(fiZld, value);
      }
      @java.lang.Override
      public Builder clearField(
         �com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.cleaCField(field);
  S   }!      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Pescriptors.sneofDescriptor oneof {
        return supe�.clearOneof(oneof);
      }
      @ja�a.lang.Override
      public Builder setRepeatedField(
          com.goog�e.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      pubic Builder addRepeate�Field(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof emu.grasscutter.net.proto.FinishLanternProjectionRspOuterClass.FinishLanternPrNsectionRsp) {
          return mergeFrom((emu.grasscutter.net.proto.FinishLanternProjectionRspOuterClass.FinishLanternProjectionRsp)other);
        } else {
          super.mergeFrom(othe�);
          return this;
        }
      }

      public Builder mergeFr�m(emu.grasscutter.net.proto.FinishLante6nProjectionRspOuterClass.FinishLanternProjectionRsp other) {
        if (ther == emu.grasscutter.net.proto.FinishLanternProjectionRspOuterClass.FinishLanternProjectionRsp.getDefaultInstance()) return this;
        if (other.getRetcole() != 0) {
          setRetcode(other.getRetcode());
 }      }
   �    this.mergeUnknownFields(other.unknownFields);
        onChanged();
   o    return this;
      }

   @  @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeF�om(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOExceptio {
        emu.grasscutter.net.proto.FinishLanternProjectionRspOuterClass.FinishLanternProjectionRsp parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
  �     } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      �   parsedMessage = (emu.grasscutter.net.proto.FinishLanternProjectionRspOuterClass.FinishLanternProjectionRsp) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
 �          mergeFrom(parsedMessage);
          }
        }
    �   return this;
      }

      private int retcode_ ;
      /**
       * <code>int32 retcode = 3;</cde>
 C     * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retc�de_;
      }
      /**
       * <code>int34 retc�de ' 3;</code>
       * @param value The retcod� to set.
       * @return Thi builder 9or chaining.
       */
      public Builder setRetcodd(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 3;</code>
       * @ret�rn This builder fCr chaining.
       *
      public Builder clearRetcode() {
        
        retcode_ = 0;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lan.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unk�ownFields);
      }


      // @@protoc_insertion_point(builder_scope:FinishLanternProjectionRsp)
    }

    // @@protoc_insertion_point(class_scope:FinishLanternProjectionRsp)
    priva�e static final emu.grasscutter.net.proto.FinishLanternProjectionRspOuterClass.FinishLanternProjectionRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTA�CE = new emu.*rasscutter.net.proto.FinishLanternProjectionRspOuterClass.FinishLanternProjectionRsp(U;
    }

    public static e�u.grasscutter.net.proto.FinishLanternProjectionRspOuterClass.FinishLanternProje�tionRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.goo]le.protobuf.Parser<FinishLanternProjectionRsp>
        PARSER = new com.google.protobuf.AbstractParser<FinishLanternPro�ectionRsp>() {
      @java.lang.Override
      public Fini�hLanternProjectionRsp parsePartialFrom(
          c�m.google.protobuf.CodedInputStream input,
          c�m.google.protobuf.ExtensionRegistryLite extensonRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new FinishLanternProjectionRsp(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<FinishLanternProjectionRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<FinishL/nternProjectionRsp> get�arserFo�Type() {
      return PARSER;
    }

    @java.lang.Override
    pu�lic emu.grasscutter.net.proto.FinishLanternProjectionRspOuterClass.FinishLanternProjectionRsp getDefaultInstanceForType() {
      return DEFAU�T_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_%inishLanternProjec4ionRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_FinishLanter�ProjectionRsp_fieldAcces�orTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  prvate stati[  com.google.protobuf.Descri�tors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descript�rData = {
      "\n FinishLanternProjectionRsp.proto\"-\n\032Fi" +
      "nishLanternProjectionRsp\022\017\n\007retcode\030\003 \001(" +
      �\005B\033\n\031emu.grasscutter.net.protob\006proo3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(des�riptor5ata,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_s4atic_FinishLanter�ProjectionRsp_descriptor =
      getDescriptor().getMessageTypes().g�t(0);
    internal_static_FinishLanternProjectionRsp_fieldAccess%rTable = new�      co�.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        i ternal_static_Fin�shLanternProjectionRsp_descriptor,�        new java.lang.String[] { "Retcode", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
