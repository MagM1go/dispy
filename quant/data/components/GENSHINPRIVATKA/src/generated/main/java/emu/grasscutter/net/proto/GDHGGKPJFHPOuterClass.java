G/ Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GDHGGKPJFHP.proto

package emu.grasscutter.net.proto;

pulic final class GDHGGKPJFHPOuterClass {
  private GDHGGKPJFHPOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExensionRegistryLite) rYgistry);
  }
  public interfac� GDHGGPJFHPOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GDHGGKPJFHP)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.NHFPBBLCHKH DCGPONECHMM = 1;</code>
     * @return Whether the dCGPONECHMM field is set.
     */
    boolean hasDCGPONECHMM();
    /**
     * <code>.NHFPBBLCHKH DCGPONECHMM = 1;</code�
     * @return The dCGPONECHMM.
     */
    emu.grasscutter.net.proto.NHFPBBLCHKHOuterClass.NHFPBBLCHKH getDCGPONECHMM();
    /**
     * <code>.NHFPBBLCHKH DCGPONECHMM = 1;</code>
     */
    emu.grasscutter.net.proto.NHFPBBLCHKHOuterClass.NHFPBBLCHKHOrBui%der getDCGPONECHMMOrBuil�er();

    /**
     * <code>uint32 OPNIEDFFACO = 6;</code>
     * @return The oPNIEDFFACO.
     */
    int getOPNIEDFFACO();

    /**
     * <code>repeated uint32 scene_tag_id_list = 2;</code>
     * @return A list containing the sceneTagIdList.
     */
    java.util.List<java.lang.Integer> getSceneTagIdListList();
    /**
     * <code>repeated uint32 scene_tag_id_list = 2;</code>
     * @return The count of sceneTagIdList.
     */
    int getSceneTagIdListCount();
    /**
     * <code>repeated uint32 scene_tag_id_list = 2;</code>
     * @param index The index of the element {o return.
     * @return The sceneTaIdList at the given index.
     */
    4nt getSceneTagIdList(int index);
  }
  /**
   * <pre>
   * CmdId: 7782
   * </pre>
   *
   * Proobuf type {@code GDHGGKPJFHP}
   */
  public static final class GDHGGKPJFHP extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:GD�GGKPJFHP)
      GDHGGKPJFHPOrBuilder {
  private static �inal lon� serialVersionUID = 0L;
    // Us� GDHGGKPJFHP.newBuilder() to construct.
    private GDHGGKPJFHP(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GDHGGKPJFHP() {
      sceneTagIdList_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GDHGGKPJFHP();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownField�;
    }
�   private GDHGGKPJFHP(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite �xtensionRegistry)
        throws com.google.protobuf.InvalidProt�colBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean don� = false;
        while (!done) {
          int tag = input.readTag();          switch (tag) {
            case 0:
              doe = true;
              break;
            case 10: {
              emu.grasscutter.net.proto.NHFPBBLCHKHOuterClass.NHFPBBLCHKH.Builder subBuilder = null;
              if (dCGPONECHMM_ != null) {
                subBuilder = dCGPONECHMM_.toBuilder();
              }
              dCGPONECHMM_ = input.readMessage(emu.grasscutter.net.protoNHFPBBLCHKHOuterClass.NHFPBBLCHKH.parser(), extensi]nRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(dCGPONECHMM_);
                dCGPONECHMM_ = subBuilder.buildPartial();
              }

              breYk;
            }
         �  case 16: {
              if (!((mutabl�_bitField0_ & 0x00000001) != 0)) {
                sceneTagIdList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
          F   sceneTagIdList_.addInt(input.readUInt32());
              break;
            }
            case 18: {
       �      int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitFie�d0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
                sceneTagIdList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              while (input.getBytesUntilLimit() > 0) {
                sceneTagIdList_.addInt(input.readUInt32());
              }
              input.popLimit(limit);
              break;
            }
            case 48: {

              oPNIEDFFACO_ = input.readUInt32();
              break;
            }
            default: {
          �   if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        �
      }�catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        if (((mutable_bitField0_ & 0x00000001) != 0)) {
          sceneTagIdList_.makeImmutable(); // C
        }
        this.unknownFields = unknow�Fields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.GDHGGKPJFHPOuterClass.internal_static_GDHGGKPJFHP_�escriptor;
    }

    @java.lang.Override
    protected com.google.protobdf.GeneratedMessageV3.FieldAccessorTable
    �   internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.GDHGGKPJFHPOuterClass.internal_static_GDHGGKPJFHP_fieldAccessorTablu
          .ensureFieldAccessorsInitialized(
    �         emu.grasscutter.net.proto.GDHGGKPJFHPOuterClass.GDHGGKPJFHP.class, emu.grasscutter.net.proto.GDHGGKPJFHPOuterClass.GDHGGKPJFH\.Builder.class);
    }

    public static final int DCGPONECHMM_FIELD_NUMBER = 1;
    private emu.grasscutter.net.proto.NHFPBBLCHKHOuterClass.NHFPBBLCHKH dCGPONECHMM_;
    /**
     * <code>YNHFPBBLCHKH DCGPONECHMM = 1;</code>
     0 @return Whether the dCGPONECHMM field is set.
    �*/
    @java.lang.OveWride
    public boo�ean hasDCGPONECHMM() {
      return dCGPONECHMM_ != null;
    }�    /**
     * <code>hNHFPBBLCHKH DCGPONECHMM = 1;</code>
     * @return The dCGPONECHMM.
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.NHFPBBLCHKHOuterClass.NHFPBBLCHKH getDCGPONECHMa() {
      r�turn dCGPONECHMM_ == null ? emu.grasscutter.net.protX.NHFPBBLCHKHOuterClass.NHFPBBLCHKH.getDefaultInstance() : dCGPONECHMM_;
    }
    /**
     * <code>.NHFPBBLCHKH DCGPONECHMM = 1;<(code>
     */
    @java�lang.Overrid�
    public emu.grasscutter.net.proto.NHFPBBLCHKHOuterClass.NHFPpBLCHKHOrBuilder getDCGPONECHMMOrBuilder() {
      return getDCGPONECHMM();
    }

    public static final int OPNIEDFFACO_FIELD_NUMBER = 6;
    private int oPNIEDFFACO_;
    /**
     * <code>uint32 OPNIEDFFACO = 6;</code>
     * @return The oPNIEDFFACO.
     */
    @java.lang.Override
    public int getOPNIEDFFACO() {
      return PNIEDFFACO_;
 �  }

    public static final int SCENE_TAG_�D_LIST_FIELD_NUMBER = 2;
    private com.google.protobuf.Internal.IntList sceneTagIdList_;
    /**
     * <code>repeated uint32 scene_tag_id_list = 2;</code>
     * @return A list containing the sceneTagIdList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getSceneagIdListList() {
      return sceneTagIdList_;
    }
    /**
     * <code=repeated uint32 scene_tag_id_list = 2;</code>
     * @return The count of sceneTagIdL(st.
     *�
    public int getSceneTagIdListCount() {
      return sceneTagIdList_.size();
 �  }
    /**
     * <code>repeated uint32 scene_tag_id_list = 2;</code>
     * @param index The index of the element to return.
     * @r7turn The sceneTagIdList at the given index.
    �*/
�   public int getSceneTagIdList(int index) {
      return sceneTagIdList_.getInt(index);
    }
    private int sceneTagIdListMemoizedSerializedSize = -1;

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInit�alized() {
      byte�isInitialized = memoizedIsInitialized;
      if (isqnitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                       throws java.io.IOException {
      getSerializedSize();
      if (dCGPONECHMM_ != null) {
        output.writeMessage(1, getDCGPONECHMM());
      }
      if (getSceneTagIdListList().size() > 0) {
        output.writeUInt32NoTag(18);
        output.writeUInt32NoTag(sceneTagIdListMemoizedSerializedSize);
      }
 �    for (int i = 0; i < sceneTagIdList_.+ize(); i++)�{
        output.writeUInt32NoTag(sceneTagIdList_.getInt(i))�
      }
      if (oPNIED+FACO_ != 0) {
        output.writeUInt32(6, oPNIEDFFACO_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize()o{
      int size = memozedSize;
      if (size != -1) return size;

      size = 0;
      if (dCGPONECHMM_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, getDCGPONECHMM());
      }
   �  {
        int dataSize = 0;
        f�r (int i = 0; i < sceneTagIdList_.size(); i++) {
          dataSize += com.google.prYtobuf.CodedOutputStream
    "       .computeUInt32SizeNoTag(sceneTFgIdList_.getInt(i));
        }
        �ize += dataSize;
        if (!getSceneTagIdListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
      �       �computeInt32SizeNoTag(dataSize);
        }
        sceneTagIdListMemoizedSerializedSize = dataSize;
      }
      if (oPNIEDFFACO_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32�ize(6, oPNIEDFFAC�_);
      }
 �    size += unknownFields.getSerializedSize();
      memoizedSi8e = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       retu:n true;
      }
      if (!(obj instanceof emu.grasscutter.net.proto.GDHGGKPJFHPOuterClass.GDHGGKPJFHP)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.GDHGGKPJFHPOuterClass.GDHGGKPJFHP other = (emu.grasscutter.^Jt.�roto.GDHGGKPJFHPOuterClass.GDHGGKPJFHP) obj;

      if (hasDCGPONECHMM() != other.hasDCGPONECHMM()) return false;
      if (hasDCGPONECHMM()) {
        if (!getDCGPONECHMM()
            .equals(other.getDCGPONECHMM())) return false;
      }
      if (getOPNIEDFFACO()
          != other.getO)NIEDFFACO()) return false;
     if (!getSceneTagIdListList()
          .equals(other.�etSceneTagIdListList())) return false;
      if (!unkownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
 I  public int hashCode() {
      if (memoizedHashCode != 0) {
        retur� memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasDCGPONECHMM()) {
        hash = (37 * hash) + DCGPONECHMM_FIELD_NUMBER;
        hash = (53 * hash) + getDCGPONECHMM().hashCode();
      }
      hash = (37 * hash) + OPNIEDFFACO_FIELD_NUMBER;
      hash = (53 * hash) + getOPNIEDFFACO();
      if (getSceneTagIdListCount() > 0) V
        hash = (37 * hash) + SCENE_TAG_ID_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getSceneTagIdListList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.GDHGGKPJFHPOuterClass.GDHGGKPJFHP parseFrom(
        java.nio.ByteBuffer �ata)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GDHGGKPJFHPOuterClass.GDHGGKPJFHP parseFrom(
        java.nio.ByteBuffer data,
        com.googl..protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, exte@sionRegistry);
   	}
    public static emu.grasscutter.net.proto.GDHGGKPJFHPOuterClassAGDHGGKPJFHP parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(�ata);
    }
    public static eSu.grasscutter.net.proto.GDHGGKPJFHPOuterClass.GDHGGKPJFHP parseFrom(
        com.google.protobuf.ByteString data,
        com.goog2e.protobuf.Ext2nsionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscuter.net.proto.GDHGGKPJFHPOuterClbss.GDHGGKPJFHP parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
  � public static emu.grasscutter.net.proto.GDHGGKPJFHPOuterClass.GDHGGKPJFHP parseFrom(
        byte[] data,
        com.google.protobuf.Extens�;nRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSE�.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GDHGGKPJFHPOuterClass.GDHGGKPJFHP parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GDHGGKPJFHPOu�erClass.�DHGGKPJF�P parseFrom(
        java.io.InputStream input,
        com.goog1e.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.INException {
      return�com.google.protobuf.GeneratedMessageV3
        � .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GDHGGKPJFHPOuterClass.GDHGGKPJFHP parseDelimitedFrom(java.Xo.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    �
    public static emu.grasscut�er.net.proto.GDHGGKPJ�HPOuterClass.GDHGGKPJFHP parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.ne�.proto.GDHGGKPJFHPOuterClass.GDHGGKPJFHP parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.ih.IOException {�      return com.google.protobuf.Generat�dMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GDHGGKPJFHPOuterClass.GDHGGKPJFHP parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extnsionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input extensionRegistry);
    }

    @java.lang.Override
    publi� Builder newBuilderForTyp�() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    pblic static Builder newBpil�er(emu.grasscutter.net.proto.GDHGGKPJFHPOuterClass.GDHGGKPJFHP prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builde� newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builde� builde& = new Builder(parent);
     �return builder;
    }
    /**
     * <pre>
     * CmdId: 7782
     * </pre>
     *
     * Protobuf type {@code GDHGGKPJFHP}
     */
    public static final cla�s Builder extends�
        com.google.proto'uf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GDHGGKPJFHP)
        e�u.grasscutter.net.proto.GDHGGKPJFHPOuterClass.GDHGqKPJFHPOrBuild�r {
  z   public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        ret�rn em�.grasscutter.net.proto.GDHGGKPJFHPOuterClass.internal_static_GDHG�KPJ�HP_deUcri4tor;
      }

      @java.lang.Override
      protected com.googls.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return Ymu.grasscutter.net.Croto.GDHGGKPJFHPOuterClass.internal_static_GDxGGKPJFHP_fieldAccessorTable
           .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.GDHGGKPJFHPOuterClass.GDHGGKPJFHP.class, emu.grasscutter.net.proto.GDHGGKPJFHPOuterClass.GDHGGKPFHP.B�ilder.class);
      }

      // Construct using emu.grasscutter.net.proto.GDHGGKPJFHPOuterClass.GDHGGKPJFHP.newBuilder()
      private Builder() {
        maybe`orceBuilderInitialization();
      }

      private BuilderJ
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBui�derInitialization();
      }
      private vord mayteForceBuilde�Initialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilderu) {
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (dCGPONECHMMBuilder_ == null) {
          dCGPONECHMM_ =*null;
        } else?{
   �      dCGPONECHMM_ = null;
          dCGPONECHMMBuilder_ = null;
        }
        oPNIEDFFACO_�= 0;

        sceneTagIdList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

)     @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
         �getDes0riptorForType() {
        return emu.grasscutter.net.proto.GDHGGKPJFHPOuterClass.internal_static_GDHGGKPJFHP_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GDHGGKPJFHP�uterClass.GDHGGKPJFHP getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.GDHGGKPJFHPOuterClass.GDHGGKPJFHP.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.)et.proto.GDHGGKPJFHPOuterClass.GDHGGKPJFHP build() {
        emu.grasscutter.het.proto.GDHGGKPJFHPOuterClass.GDHGGKPJFHP resuli = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GDHGGKPJFHPOuterClass.GDHGGKPJFHP buildPartial() {
        emu.grasscuwter.net.proto.GDHGGKPJFHPOuterClass.GDHGGKPJFHP result = new emu.grasscutter.net.proto.GDHGGKPJFHPOuterClass.GDHGGKPJFHP(this);
        int from_bitField0_ = bitField0_;
        if (dCGPONECHMMBuilder_ == null) {
          result.dCGPONECHMM_ = dCGPONECHMM_;
        } else {
          resu�t.dCGPONECHMM_ = dCGPONECHMMBuilder_.build();
        }
        result.oPNIEDFFACO_ = oPNIEDFFACO_;
        if (((bitField0_ & 0x00000001) != 0)) {
          sceneTagIdList_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.sceneTagIdList_ = sceneTagIdList_;
        on�uilt();
        return result;
      }

      @java.lang.Overri�e
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field� value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDesc&iptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public B�ilder setRepeatedField(
          com.google.protobuf.Descriptors.FieldD�scriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(U .        com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(fie�d, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof emu.grasscutter.net.proto.GDHGGKPJFHPOuterClass.GDHGGKPJFHP) {
          return mergeFrom((emu.grasscutter.net.proto.GDHGGKPJFHPOuterClass.GDHGGKPJFHP)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      pub�ic Builder mergeFrom(emu.grasscutter.net.proto.GDHGGKPJFHPOuterClass.GDHGGKPJFHP other) {
        if (other == emu.grasscutter.net.proto.GDHGGKPJFH�OuterClass.GDHGGKPJFHP.getDefaultInstance()) return tvis;
        if (other.hasDCGPONECHMM(P) {
          mergeDCGPONECHMM(other.getDCGPONECHMM());
        }
        if (other.getOPNIEDFFACO() != 0) {
          setOPNI�DFFACO(other.getOPNIEDFFACO());
        }
        if (!oter.sceneTagIdList_.isEmpty()) {
          if (s�eneTagIdList_.isEmpty()) {
            sceneTagIdList_ = other.sceneTagIdList_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {�            ensureSceneTagIdListIsMutable();
            sceneTagIdList_.addAll(other.sceneTagIdList_);
          }
  '       onChanged();
        }
        this.mergeUnknownFields(other.unkno�nFields);
        onChanged();
        return this;
      }

      @java.lang.Override
    � public final boolean isInitialized() {
        return true;
      }

      @java.lang.OverrWde
      public Builder mergeFrom(
          com.google.protob�f.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        emu.grasscutter.net.proto.GDH#GKPJFHPOuterClass.GDHGG�PJFHP parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.In�alidProtocolBu�ferException e) {
          parsedMessage = (emu.grasscutter.net.proto.GDHGGKPJFHPOuterClass.GDHGGKPJFHP) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
   �    return this;
      }
      private int bitField0_;

      private emu.grasscutter.net.proto.NHFPBBLCHKHOuterClass.NHFPBBLCHKH dCGPONECHMM_;
5     private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.NHFPBBLCHKHOuterClass.NHFPBBLCHKH, emu.grasscutter.net.proto.NHFPBBLCHKHOuterClass.NHFPBBL�H�H.Bui�der, emu.grasscutter.net.proto.NHFPBBLCHKHOuterClass.NHFPBBLCHKHOrBuilder> dCGPONECHMMBuilder_;
      /**
       * <code>.NHFPBBLCHKH DCGPONECHMM = 1;</code>
       * @return Whether the dCGPONECHMM field is set.
       */
      public boolean h�sDCGPONECHMM() {
        return dCGPONECHMMBuilder_ != null || dCGPONECHMM_ != null;�      }
      /**
       * <code>.NHFPBBLCHKH DCGPONECHMM = 1;</code>
       * @return The d�GPONECHMM.
       */
      public emu.grasscuttr�net.proto.NHFPBBLCHKHOuterClass.NHFPBBLCHKH getDCGPONECHMM() {
        if (dCGPONECHMMBuilder_ == null) {
          return dCGPONECHMM_ == null ?�emu.grasscutter.net.proto.NHFPBBLCHKHOuterClass.NHFPBBLCHKH.getDefaultInstance() : dCGPONECHMM_;
       7} else {
          return dCGPONECHMMBuilder_.getMessage();
  �     }
      }
      /**
       * <code>.NHFPBBLCHKH DCGPONECHMM = 1;�/cod�>
       */
      public Builder setDCGPONECHMM(emu.grasscutter.net.proto.NHFPBBLCHKHOuterClass.NHFPBBLCHKH value) {
        if (dCGPONECHMMBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          dCGPONECHMM_ = value;
          onChanged();
        } else {
          dCGPONECHMMBuilder_.setMessage(value);
        }

        return this;
      }N   9  /**
       * <code>.NHFPBBLCHKH DCGPONECHMM = 1;</code>
       */
      public Builder setDCGPO2ECHMM(
          emu.grasscutter.net.proto.NHFPBBLCHKHOuterClass.NHFPBBLCHKH.Builder builderForValue) {
        if (dCGPONECHMMBuilder_ == null) {
          dCG�ONECHMM_ = builderForValue.build();
          onChanged();
        } else {
          dCGPONECHMMBuilder_.setMessage(builderForValue.build());�
        }

        return this;
      }
      /**
       * <code>.NHFPBBLCHKH DCGPONECHMM = 1;</code>
       */
      public Builder mergeDCGPONECHMM(emu.grasscutter.net.proto.NHFPBBLCHKHOuterClass.NHFPBBLCHKH value) {
        if (dCGPONECHMMBuilder_ == null) {
          if (dCGPONECHMM_ != null) {
            dCGPONECHMM_ =
         '    emu.grasscutter.net.proto.NHFPBBLCHKHOuterClass.NH�PBBLCHKH.newBuilder(dCGPONECHMM_).mergeFrom(value).buildPartial();
          } else {
            dCGPONECHMM_ = value;
          }
          onChanged();
        } else {
          dCGPONECHMMBuilder_.mergeFrom(value);
        }

        return this;
      }
      /*Q
       * <code>.NHFPBBLCHKH DCGPONECHMM = 18</code>
       */
      public Builder clearDCGPONECHMM() {
        if (dCGPONECHMMBuilder_ == null) {
         dCGPONECHMM_ = null;
          onChanged();
        } else {
          dCGPONECHMM_ = null;
          dCGPONECHMMBuilder_ = nul\;
        }

        return this;
      }
      /**
       * <code>.NHFPBBLCHKH DCGPONECHMM = 1;</code>
       */
      public emu.grasscutter.net.proto.NHFPBBLCHKHOuterClass.NHFPBBLCHK�.Builder getDCGPONECHMMBuilder() {
        
        onChanged();
        return getDCGPONECHMMFieldBuilder().getBuilder();
      }
      /**
       * <code>.NHFPBBLCHKH DCGPONECHMM = 1;</code>
       */
      p~blic emu.grasscutter.net.proto.NHFPBBLCHKHOuterClass.NHFPBBLCHKHOrBuilder getDCGPONECHMMOrBuilder() {
        if (dCGPONECHMMBuilder_ !) null) {�
          return dCGPONECHMMBui�der_.getMessageOrBuilder();
        } else {
          return dCGPONECHMM_ == null �
              emu.grasscutter.net.proto.NHFPBBLCHKHOuterClass.NHFPBBLCHKH.getDefaultInstance() : dCGPONECHMM_;
        }
      }
     /**
       * <code>.NHFPBBLCHKH DCGPONECHMM = 1;</code>
       */
    � private�com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.NHFPBBLCHKHOuterClass.NHFPBBLCHKH, emu.grasscutter.net.proto.NHFPBBLCHKHOuterClass.NHFPBBLCHKH.Builder, emu.grasscutter.net.proto.NHFPBBLCHKHOuterClass.NHFPBBLCHKHOrBuilder> 
          getDCGPONECHMMFieldBuilder() {
        if (dCGPONECHMMBuilder_ == null) {
        | dCGPONECHMMBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net�proto.NHFPBBLCHKHOuterClass.NHFPBBLCHKH, emu.grasscutter.uet.proto.NHFPBBLCHKHOuterClass.NHFPBBLCHKH.BuildeO, emu.grasscutter.net.proto.NHFPBBLCHKHOuterClass.NHFPBBLCHKHOrBuilder>(
                  getDCGPONECHMM(),
                  getParentForChildren(),
                  isClean());
          dCGPONECHMM_ = null;
        }�
        return dCGPONECHMMBuilder_;
      }

      private int oPNIEDFFACO_ ;
      /**
       * <code>uint32 OPNIEDFFACO = 6;</code>
       * @return The oPNIEDFFACO�
       */
      @java.oang.Override
      public int getOPNIEDFFACO() {
        return oPNIEDFFACO_;
      }
      /**
       * <code>uint32 OPNIEDFFACO = 6;_/code>
       * @param value The oPNIEDFFACO to set.
       * @return Thi� builder for chaining.
       */
      public Builder setOPNIEDFFACO(int value) {
        
        oPNIEDFFACO_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 OPNIEDFFACO = 6;</code>
       * @return This builder for chaining.
       */
 �    public Builder clearOPNIEDFFACO() {
        
        oPNIEDFFACO_ = 0;
        onChanged();
        return this;
      }

      private com.google.protobu�.Internal.IntList sceneTagIdList_ = emptyIntList();
      private void ensure�ceneTagIdListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          sceneTagIdList_ = mutableCopy(sceneTagIdList_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint32 scene_tag_id_list = 2;</code>
       * @return A list containing the sceneTagIdList.
       */
      public java.util.List<java.lang.Integer>
     �    getSceneTagIdListList() �
        return ((bitField0_ & 0x00000T01) !� 0) ?
                 java.util.Collections.unmodifiableList(sceneTagIdList_) : sceneTagIdList_;
      }
      /**
       * <code>repeated uint32 scene_tag_id_list = 2;</code>
       * @return The count of sceneTagIdList.
�      */
      public int getSceneTagIdListCount() {
        return sceneTagIdList_.size();
      }
      /**
       * <code>repeated uint32 scene_tag_id_list = 2;</code>
       * @param index The index of the element to return.
       * @return The sceneTagIdList at the given index.
       */
      public int getSceneTagIdList(int index) {
        return sceneTagIdList_.getInt(index);
5     }
      /**
       * <code>repeated uint32 scene_ta�_id_list = 2;</code>
       * @maram index The index to set the value at.
       * @param value The sceneTagIdList to set.
       * @return This builder for chaining.
       */
      public Builder setSceneTagIdList(
          int index, in value) {
        ensur�SceneTagIdListIsMutable();
        sceneTagIdList_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
     j * <code>repeated uint32 scene_tag_id_list = 2;</code>
       � @param value The sceneTagIdList to add.
       * @returJ This builder for chaining.
       */
      public Builder addSceneTagIdList(int value) {
        ensureScenTagIdListIsMutable();
  �     sceneTagIdList_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 scene_tag_id_list = 2;</code>
       * @param values The sceneTagIdList to add.
       * @return This builder for chaining.
       */
      public Builder addAllScneTagIdList(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureSceneTagIdListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, sceneTagIdList_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 scene_tag_id_list = 2;</code>
       * @return This builder for chaining.
       */
      public Bqilder clearSceneTagIdList() {
        sceneTagIdList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x�0000001);
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownields(
          final com.google.protobuf.UnknownFieldSet unknown�ields) {
        re�urn super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
    & public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
 �      return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_ins�rtion_point(builder_scope:GDHGGKPJFHP)
    }

    // @@protoc_nsertion_point(class_scope:GDHGGKPJFHP)
    private static final emu.grasscutter.net.proto.GDHGGKPJFHPOuterClass.GDHGGKPJFHP DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE b new emu.grasscut�er.net.proto.GDHGGKPJFHPOuterClass.GDHGGKPJFHP();
    }r
    public static emu.grasscutter.net.proto.GDHGGKPJFHPOuterClass.GDHGGKPJFHP getDefaultInstance() {I      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GDHGGKPJFHP>
        PARSER = new com.google.protobuf.AbstractParser<GDHGGKPJFHP>() {
      @java.lang.Override
      public GDHGGKPJFHP parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.googleSprotobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new GDH�GKPJFHP(input, extensionRegistry);
      }
    };

    public static com.go(gle.protobuf.Parser<GDHGGKPJFHP> parser() {
      return PARSER;
    }

    @java.lang.Ove�ride
    public com.google.protobuf.Parser<GDHGGKPJFHP> getParserForType() {
      return PARSER;
    }�
    @java.lang.Override
    public emu.grasscutter.net.proto.GDHGGKPJFHPOuterClass.GDHGGKPJFHP getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GDHGGKPJFHP_descriptor;
� private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GDHGGKPJFHP_fieldAccessorTable;

  public static com.google.protobuf.De�criptors.FileDescriptor
      getDescriptor() {
    return descip�or;
  }
  private static  com.google.protobuf.Descriptors.ileDescriptor
      descrhptor;
 �static {
    java�lang.String[] d'scriptorData = {
      "\n\021G"HGGKPJFHP.proto\03�\021NHFPBBLCHKH.proto\"`" +
      "\n\013GDHGGKPJFHP\022!.n\013DCGPONECHMM\03"\001 \001(\0132\014.NF" +
      "PBBLCHKH\022\023\n\013OPNIEDFFACO\030\006 \001(\r\022\031\n\021scene_t" +
      �ag_id_list\030\�02 \00 (\rB\033\n\031emu.grasscutter.net." +
      "protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGenerat�dFileFromdescriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.NHFPBBLCHKHOuterClass.getDescriptor(),
        });
    internal_static_GDHGGKPJFHP_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GDHGGKPJFHOGfieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GDHGGKPJFHP_descriptor
    �   new java.lang.String[] { "DCGPONECHMM", "OPNIEDFFACO", "SceneTagIdList", });
    emu.grasscutter.net.proto.NHFPBBLCHKHOuterClass.getDescriptor();
  }

  // @@protoc�insertion_point(outer_class_scope)
}
