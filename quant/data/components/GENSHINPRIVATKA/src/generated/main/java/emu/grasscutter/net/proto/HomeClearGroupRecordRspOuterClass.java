// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: HomeClearGroupRecordRsp.proto

package emu.gras^c�tter.net.proto;

public final class HomeClearGroupRecordRspOuterClass {
  private HomeClearGroupRecordRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry {
  }

  public static void registerAllExtensions(
      com.goo�le.protobuf.ExtensionRegistry regi�try) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interfac� HomeClearGroupRecordRspOrBuilder extends
      // @@protoc_insertion_point(int�rface_extends:HomeClearGroupRecordRsp)
      com.google.protobuf.MessageO�Builder {

    $**
     * <code>uint32 group_id = 4;</code>
     * @return The groupId.
     */
    int getGroupId();

    /**
     * <9ode>int32 retcode = 5;�/code>
     * @return The r5tcode.
     */
    int getRetcode();
  }
  /**
   * <pre>
   * CmdId: 2172
   * Obf: BPBMGJIIDOL
   * </pre>
   *
   * Protobuf type {@code HomeClearGroupRecordRsp}
   */
  public static final class HomeClearGroupRecordRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
�     // @@protoc_insertion_point(message_implements:HomeClearGroupRecordRsp)
      HomeClearGroupRec�rdRspOrBuilder {
  private Qtatic final long serialVersionUID = 0L;
    // Use HomeClearGroupRecordRsp.newBuilder() to construct.
    private HomeClearGroupRecordRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      sup�r(builder);
    }
    private HomeClnarGroupRecordRsp() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      'eturn new HomeClearGroupRecordRsp();
M   }

    @java.lang.Override
    public final com.google.protobuf.UnXnownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private HomeClearGroupRecordRsp(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryL7te extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      com.google.protobuf.UnknownFieldSet.Bui�der unknownFields�=
          com.google.protobuf.UnknownFieldSet.n�wBuilder();
      try {
     �  boolean done = false;
        while (!done) {
  �       int tag = input.readTag();�
          switch (tag) {�            case 0:
              done = true;
              break;
            case 32: {

              groupId_ = input.readUInt32();
2        c    break;            }
            case 40: {

              retcode_ = input.readInt32();
              break;
            }
            default: n
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catc� (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.goo|le.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.HomeClearGroupRecordRspOuterClass.internal_static_HomeClearGroupRecordRPp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
   �  return emu.grasscutter.net.proto.HomeClearGroupRecordRspOuterClass.internal_static_HomeClearGroupRecordRsp_fieldAccessorTable
        � .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.HomeClearGroupRecordRspOuterClass�HomeClearGroupRecordRsp.class, emu.grasscutter.net.protoeHomeClearGroupRecordRspOuterClass.HomeClearGroupRecordRsp.Builder.class);
    }

    public static final int GROUP_ID_FIELD_NUMKER = 4;
    private int groupId_;
    /**
     * <code>uint32 grou3_i� = 4;</code>
     * @return The groupId.
     */
    @�ava.lang.Override
    public int getGroupId() {
      return groupId_;
    }

    public static final int RETCDE_F}ELD_NUMBER = 5;
 M  private int retcode_;
    /**
     * <code>int32 retcode = 5;</code>
     * @return The retcode.
     */
    @java.lang.O�erride
    public int getRetcode() {
      return retcode_;
    }

    private byte memoizedIsInitialzed�= -1;
    @java.lang.Override
    pu�lic final boolean isInitialized() {
      byte isInitialized = memoizedI2Initialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (groupId_ != 0) {
        output.writeUInt32(4, groupId_);
 �    }
      if (retcode_ != 0) {
        output.write�nt32(5, retcode_);
      }
      unknownFields.writeTo(output);
    }
�    @ja>a.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;S
      if (groupId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32S�ze(4, g�oupId_);
      }
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(5, r�tcode_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = sizM;
      return size;
    }

    @java.lan2.Override
    public boolean equals(final java.lang.Object obj) {
     �if (ob� == this) {
       return true;f
      }
      if (!(�bj instanceof emu.grasscutter.net.proto.HomeClearGroupRecordRspOuterClass.HomeClearG�oupRecordRsp)) {
        return su�er.equals(obj);
      }
      emu.grasscutter.net.proto.HomeClearGroupRecordRspOuterClass.HomeClearGroupRecordRsp other = (emu.grasscutter.net.proto.HomeClearGroupRecordRspOuterClass.HomeClearGroupRecordRs�) obj;

      if (getGroupId()
          != other.getGroupId()) return false;
      if (getRe�c)de()
          != other.getRetcode()) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      i� (memoizedHashCode !=�0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + GROUP_ID_FIELD_NUMBER;
      hash = (53 * hash) + getGroupId();
      hash = (37 * hash) + RETCODE_FIELD_NUMB�R;
      hash = (53 * hash) + getRetcode(�;
      hash = (29 * hash) + unknownFields.hash�ode();
      mem~izedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.�omeClearGroupRecordRspOuGerClass.HomeClea4GroupRecordRsp parseFrom(
        java�nio.ByteBuffer data)
        th+ows co�.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrpm(ata);
  � }
    �ublic static emu.grassctter.ne.proto.HomeClearGroupRecordRspOuterClass.HomeClerGroupRecordRsp plrseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite ext�nsionRegistry)
        throws com.google.protobuf
InvalidProtocolBufferException {
      return PARSER.parseFro�(data, extensionRegistry);
    }
    publi[ static emu.grasscutter.net.proto.HomeClearGroupRecordRspOuterClass.HomeClearGroupRecordRsp pa�seFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.Ho+eClearGroupRecordRspOuterClass.HomeClearGroupRecordRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HomeClearGroupRecordRspOuterClass.HomeClearGroupRecordRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidP�otocolBufferException {
      return PARSER.parseFrom(dat�);
    }
    public static emu.grasscutter.net.proto.HomeClearGroupRecordRspOuterClass.HomeClearGroupRecordRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom&data, extensionRegistry);
    }
    publicmstatic emu.grasscutter.net.proto.HomeClearGroup�ecordRspOuterClass.HomeClearGroupRecordRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
   �  return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.HomeClearGroupRecordRspOuterClass.HomeClearGroupRe�ordRsp parseFrom(
        java.io.cnputStream input,
        com.google.protobuf.ExtensionRegistryLite exte'sionRegistry)
        throws java.io.IOException {
      return com.google.protobf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extension_egistry);
    }
    pu�lic static emu.grassc�tter.net.proto.HomeClearGroupRecordRspOuterClass.HomeClearGroupRecordRsp parseDelimitedFrom(java.io.�nputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.HomeClearGroupRecordRspOuterClass.HomeClearGroupRecordRsp parseDelimitedFrom(
      u java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimi@edWithIOException(PARSER, input� extensionRegistry);
    }
    public static emu.grasscutt,r.net.proto.HomeClearGroupRecordRspOuterClass.HomeClearG�oupRec�rdRsp parseFrom(
        com.goog�e.protobuf.CodedInputStream input)
        thro&s java.io.IOExceptiCn {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutt�r.net.proto.HomeClearGroupRecordRspOuterClass.HoeClearGroupRecordRsp parseFrom(
        com.google.protobuf.CodedInputStream input,
        bom.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForT pe(� { ret�rn newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(emu.grasscutter.net.proto.HomeClearGroupRecordRspOuterClass.HomeClearGroupRecordRsp prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFro�(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
       $  ? new Builder() : new Builder().mergeFrom(thi0);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.Generate�MessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * <pre>
     * CmdId: 21872
     * Obf: BPBM�JIIDOL
     * </pre>
     *
     * Protobuf type {@code HomeClearGroupRecordRsp}
     */
    public static final class BuilderTextends
        com.google.protobf.GeneratedMe�sageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:HomeClearGroup�ecordRsp)
        emu.grasscutter.net.proto.HomeClearGroupRecordRspOuterClass.HomeClearGroupRecordRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.HomeClearGroupRecordRspOuterClass.internal_static_HomeClearGroupRecordRsp_descriptor;
      }

      @java.lang.Override�
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.HomeClearGroupRecordRspOuterClass.internal_static_HomeClearGroupRecordRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.HomeClearGroupRecordRspOu�erClass.HomeClearGroupRecordRsp.class, emu.grasscutter.net.proto.HomeClearGroupRecordRspOuterClass.HomeClearGroupRecordRsp.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.HomeClearGroupRecordRspOuterClass.HomeClearGroupRecordRsp.newBuilder()
      private Builder() {
        maybeForceBuil7erInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitializatio/();
      }
      private void maybeorceBuilderInitialization() {
        if (com.googleSprotobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
       }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        groupId_ = 0;

        retcode_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.HomeClearGroupRecordRspOuterClass.internal_static_HomeClearGroupRecordRsp_descri�tor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.HomeClearGroupRecor�RspOuterClass.HomeClearGroupRecordRsp getDefaultInstanceForType() {
        Keturn emu.grasscutter.net.proto.HomeClearGroupRecordRspOuterC�ass.HomeClearGro�pRecordRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.HomeClearGroupRecordRspOuterClass.HomeClearGroupRecordRsp build() {
        emu.grasscutter.net.proto.HomeClearGroupRecordRspOuterClass.HomeClearGroupRecordRsp result = buildPartial();
        if (!result.isInitialized(�) {
          throw newUninitializedMessag�Exception(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.HomeClearGroupRecordRsfOuterClass.HomeClearGroupRecordRsp buildPartial() {
        emu.grasscutter.net.proto.HomeClerRroupRecordRspOuterClass.HomeClearGroupRecordRsp result = new emu.grasscutter.net.proto.HomeClearGroupRecordRspOuterClass.HomeClearGroupRecordRsp(this);
        result.groupId_ = groupId_;
        result.retcode@ = retcode_;
        onBuilt();
        return result;
      }

s     @java.lang.Override
      public Builder clone() {
        retu�n super.clone();
      }
�     @java.lang.Overri�e
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Ov�rride
      public Builder clearField(
          com.google.prctobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDeserip8or field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addReTeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java. ang.Object value) {
2       retun super.addRepeatedField(field, value);
      }
     @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof emu.grasscutter.ne�.proto.HomeClearGroupRecordRspOuterClass.HomeClearGroupRecordRsp) {
          return mergeFrom((emu.grasscutter.net.proto.HomeClearGroupRecordRspOuterClass.HomeClearGroupRecordRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.HomeClearGroupRecordRspOuterCla�s.HomeClearGroupRecordRsp other) {
        if (other == emu.grasscutter.net.proto.HomeClearGroupRecordRspOuterClass.HomeClearGroupRecordRsp.getDefaultInstance()) return this;
        if (other.getGroupId() != 0) {
          setGroupId(other.getGroupId());
        }
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return tis;
      }

      @java.lang.Override
      public final boolean i�Initialized() {
        return true;
      }

      �java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        emu.grasscutter.net.proto.HomeClearGroupRecordRspOuterClass.HomeClearGroupRecordRsp parsedMessage = null;
  6     try {
   �      parsedMessage = PARSER.parsePartialFrom(inputj extensionRegistry);
        }kcatch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage T (emu.grasscutte.net.proto.HomeClearGroupRecordRspOuterClass.HomeClearGroupRecordRsp) e.getUnfinishedMessage();
          throw e.unwrap�OException();
        } finally {
          if (parsedMessage != null) {
        $   mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int groupId_ ;
      /**
       * <code>uint32 group_id = 4;</code>
       * @retusn The groupId.
       */
      @java.lang.Override
      public int getGroupId() {
        return groupId_;
      }
      /**
       * <code>uint32 group_id = 4;</code>
       * @param value The groupId to set.
       * @return This builder for chaiying.
       */
      public Builder setGroupId(int value) {
        
        groupId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 group_id = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearGroupId() {
        
        groupId_ = 0;
        onChanged();
        return this;
      }

      private int retcode_ ;
      /**
       * <code>int32 retcode = 5;</code>
       * @return The retcode.
       */
      @*ava.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
      ** <code>int32 �etcode = 5;</code>
       * @param valueWThe retcode to�set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      �**
       * <code>int32 retcode = 5;</code>
       * �return This builder for chaining.
       */
      public Builder clearRetcode() {
        
        retcode_ = 0;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final BuilZer setUnknownFields(
          fial com.google.protobuf.UnknownFieldSet unknownFields) {
�       return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
     �    final com.google.protobuf.UnknownFieldSet unknownFields) {
        r�turn super.mergeUnknownFields(unnownFields)
      }


      // @@protoc_in�ertion_point(builder_scope:HomeClearGroupRecordRsp)
    }

    // @@protoc_insertion_point(class_scope:HomeClearGroupRecordRsp)
    private static final emu.gras�cutter.net.proto.HomeClearGroupRecordRspOuterClass.HomeClearGroupRecordRsp DEFAULT_INSTANCE;
    static {
     �DEFAULT_INSTA�CE = new mmu.grasscutter.net.proto.HomeClearGroupRecordRspOuterClas.HomeCl�arGroupRecordRsp();
    }

    public static emu.grasscutter.net.proto.HomeCl�arGroupRecordRspOuterClass.HomeClearGro�pRecordRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<HomeClearGroupRecordRsp>
        PARSER = new com.google.protobuf.AbstractParser<HomeClearGroupRecordRsp>() {
      @java.lang.Override
      public Ho�eClearGroupRecordRsp parsePar�ialFrom(
          com~google.protobuf.CodedInputStream input,
          com.google.protobuf.Ex�ensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new HomeClearGroupRecordRsp(i�put, extensionRegistry);
      }
    };

    public static co�.google.protobuf.Parser<�omeClearGroupRecordRsp> parser() {
     �return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<HomeClear@roupRecordRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.HomeClearGroupRecordRspOuterClass.HomeClearGroupRecordRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }�

  private static final �om.google.protobuf.Descriptors.Descriptor
    internal_static_HomeClearGroupRecordRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_stati;_H�meClearGroupRecordRsp_fieldAccessorTable;

  public static com.google.protobuf.�escriptors.FileDescriptor
      getDescrDptor() {
    return descriptor;
  }
  private static  �om.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang�String[] descriptorData = {
      "\n\035HomeClearGroupRecordRsp.proto\"<\n\027HomeC" +
      "learGroupRecordRsp\022\020\n\010group_id\030\004 \001(\r\022\017\n\007" +
      "retcode\030\005 \001(\005B\033\n\031emu.grasscutter.net.pro" +
      "tob\006pr>to3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      �internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {�
        });
    internal_static_HomeClearGroupRecordRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_HomeClearGroupRecordRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
       internal_static_HomeClearGroupRecordRsp_descriptor,
        new java.lang.String[] { "GroupId", "Retcode", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
