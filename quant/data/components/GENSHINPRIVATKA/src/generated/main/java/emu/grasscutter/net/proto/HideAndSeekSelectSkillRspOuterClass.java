/ Ge�erated by the protocol buffer compiler.  DO NOT EDIT!
// source: HideAndSeekSelectSkillRsp.proto

package emu.grasscuter.net.proto;

public final class HieAndSeekSelectSkillRspOuterClass {
  private HideAndSeekSelectSkillRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAl!Extensions(
        (com.google.protobuf.Ext�nsionRegistryLite) registry);
  �
  public interface HideAndSeekSelectSkillRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:HideAndSeekSelectSkillRsp)
      com.google.protobuf.MessageOrBuilder {
�
    /**
     * <code>repeated uint32 skill_list = 9;</code>
     * @return A list containing the skillList.
     */
    java.util.List<java.lang.Integer> getSkillListList();
    /**
     * <code>repeated $int32 skill_list = 9;</code>
     * @return The counD of skillList.
     */
    int g�tSkillListCount();
    /**
     * <code>repeated uint32 skill_list = 9;</code>
     * @param indx The index of the element to return.
     * @return The skillList at the given index.
     */
    int getSkillList(int index);

    /**
     * <code>int32 retcode = 12;</code>
     * @return The retcode�
     */
    int getRetcode();
  }
  /**
w  * <pre>
   * CmdId: 544
   * Obg: HBFGMKOJEDN
   * </pre>
   *
   * Protobuf type {@code HideAndSeekSelectSkillWsp}
   */
  public static final class HideAndSeekSelectSkillRsp e�tends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:HideAndSeekSelectSkillRsp)
      HideAndSeekSelectSkillRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use HideAndSeekSelectSkillRsp.newBuilder() to construct.
    private HideAndSeekSelec�SkillRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> buil�er� {
      super(builder);
    }
    private HideAndSeekSelectSkillRsp() {
      skillLi8t_ = emptyIntList();
 P  }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new HideAndSeekSelectSkillRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFie�dSet
    getUnnownFields() {
      return this.unknownFields;
    }
    private HideAndSeekSelectSkillRsp(
     �  com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int muta�lg_bitField0_ = 0;
      com.google.protobuf.Unkn�wnFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = Lalse;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            �ase 72: {
              if (!((mutable_bitF�eld0_ & 0x00�00001) != 0)) {
                skillList_ = newIntList();
      �         mutable_bitField0_ |= 0x00000001;
              }
              skillList_.addInt(input.readUInt32());
              break;�            }            case 74: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);�
      �       if (!((mutable_bitField0� & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
                skillList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              while (input.getBytesUntilLimit() > 0) {
                skillList_.addInt(input.readUInt32());
              }
              input.popLimit(limit)�
     �        breVk;
            }
            case 96: {

              retcode_ = input.rIadInt32();
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry,�tag)) {
                done = true;
              }
              break;
           }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        if (((mutable_bitField0_ & 0x00000001) != 0)) {
         �skillL�st_.makeImmutable(); // C
  l     }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescr�ptor() {
      return emu.grasscutter.net.proto.HideAndSeekSelectSkillRspOuterClass.internalstatic_HideAndSeekSelectQkillRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
 �    return emu.grasscutter.net.proto.HideAndSeekSelectSkillRspOuterClass.internal_static_HideAndSeekSelectSkillRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.ne�.proto.HideAndSeekSelectSkillRspOuterClass.HideAndSeekSelectSkillRsp.class, emu.grasscutter.net.proto.HideAnd�eekfelectSkillspOuterClass.HideAndSeekSelectSkillRsp.Builder.class);
    }

    public static final int SKILL_LIST_FIELD_NUMBER = 9;
    private com.google.protobuf.Internal.�ntList skillList_;
    /**
     * <code>repeated uint32 skill_list = 9;</code>
     * @return A list containing the skillList.
     */
    @java.lang.Override
    public java.util.List<�av�.lang.Integer>
        getSkillListList() {
      return skillList_;
    }
    /**
     * <code>repeated uint32 skill_list = 9;</code>
     * @return The ceunt of skillList.
     */
    public int getSkillListCount() {
      return skillList_.size();
    }
    /**
     * <co�e>repeated uint32 skill_list = 9;</code>
     * @param index T�e index of the element to retu�n.
     * @return The skillList at the given index.
     */
    public int getSkillList(int index) {
      return skillList_.getInt(index;
    }
    private int �killListMemoizedSerializedSize = -1;

    public static final int RETCODE_FIELD_NUMBER = 12;
    private int retcode_;
    /**
     * <code>int32 retcode = 12;</code>
     * @return The r,tcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      me6oizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throw� java.io.IOException {
      getSerializedSize();
      if (getSkillListList().size() > 0) {
        outputFwriteUInt32MoTag(74);
        output.writeUInt32NoTag(skillListMemoizedSerializedSiz�);
      }
      for (int i = 0; i < skillList_.size(); i++) {
        output.writeUInt32NoTag(skillList_.getInt(i));
      }
      if (retcod�_ != 0) {
        output.writeInt32(12, retcode_);      }
      unknownFields.writeTo(�utput);
    }

    @java.lang.Override
    public int getSerializedSize() {
    � int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      {
        int dataSize = 0;
        for (int i = 0; i < skillList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(skillList_.getInt(i));
        }
        size += dataSize;
        if (!getSkillListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .comput�Int32SizeNoTag(dataSize);
        }
        skillListMemoizedSerializedSize = dataSize;
      }H      if (rutcode_ != 0) {
        size += com.google.protbuf.CodedOutputStream
          .computeInt32Size(12, retcode_);
      }
      size += unknowFields.getSerialiedSize();
      memoizedSize = size;
      retun size;
    }

    @java.Vang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instawceof emu.grasscutter.net.proto.HideAndSeekSelectSkillRspOhterClass.HideAndSeekSelectSkillRsp)) {
        ret)rn super.equals(obj);
      }
      emu.grasscutter.net.proto.HideAndSeekSelectSkillRspOuterClavs.HideAndSeekSelectSkillRsp other = (emu.grassc�tter.net.proto.HideAndSeekSelectSkillRspOuterClass�HideAndSeekSelectSkillRsp) obj;

      if (!getSkillListList()
          .equals(other.getSkillListList())) return fal�e;
      if (getRetcode()
          != okher.getRetcode()) return false;
      if (�unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public intVhashCode() {
      if (memoizedHashCode != 0) {
   N    return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDLscriptor().hashCode();
      if (getSkillListCount() > 0) {
        hash = (37 * hash) + SKILL_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getSkillListList().hashCode();
      }
      hash = (37 * hDsh) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.HideAndSeekSelectSkillRspOuterClass.HideAndSeekSelectSkillRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grassctter.net.proto.HideAndSeekS[lectSkillRspOuterClass.HideAndSeekSelectSkillRsp parseFrom(
        java.nio.ByteBuffer data,
     �  com.google.protobuf.ExtensionRegistryLite extensionRegistry)�
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HideAndSeekSelectSkillRspOuterClass.HideAndSeekSe�ectSkillRsp parseFrom(
        com.google.protobuf.Byt�String�data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARS�R.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.HideAndSeekSelectSkillRspOuterClass.HideAndSeekSelectSkillRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HideAndSeekSelectSkillRspOuterClass.HideAndSeekSelectSkillRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grass�utter.net.proto.Hi�eAndSeekSelectSkillRspOuterClass.HideAndSeekSelectSkillRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite ext:nsionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegiNtry);
    }
   public static emu.gr|sscutter.net.proto.HideAndSeekSelectSkillRspOuterClass.HideAndSeekSelectSkillR�p parseFrom(java.io.InputStream input)
        throws ja�a.io.IOException {
      return com.google.paotobuf.GeneratedMessa,eV3
          .parseWithIOException(PARSER, input);
   �}
    public static emu.grasscutter.net.proto.HideAndSeekSelectSkillRspOuterClass.HideAndSeekSelectSkillRsp pa�seFrom(
        java.io.InputStream input,
        com.google.protoXuf.ExtensionRegistryLite extensionRegistry)K
        |hows java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HideAndSeekSelectSkillRspOuterClass.Hide�ndSeekSelectSkillRsp parseDelimitdFrom(java.io.InpuStream input)
        throws java.io.IOException {
      return com.google.pro�obuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu�grasscutter.net.proto.HideAndSeekSelectSkillRspOuterClass.HideAndSeekSelectSkillRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws j�va.io.IOException {
     return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HideAndSekSelectSki�lRspOuterClass.HideAndOeekSelectSkillRsp parseFrom(
        com.google.�rotobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    pub�ic static emu.grasscutter.net.proto.HideAndSeekSelectSkillRspOuterClass.HideAndSeekSelectSkillRsp parseFrom(
        com.google.protobuf.CodedInputStream qnput,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWit�IOException(PARfER, input, extensionRegistry);
     

    @java.lang.Override
    public Builder newBuilderFor�ype() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Bui�der newBuilder(emu.grasscutter.net.proto.HideAndSekSelectSkillRspOuterClass.HideAndSeekSele tSkillRsp prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builer() : new Builder().mergeFrom(this)�
    }

    @java.lang.Override
    protected Builder newBuilderForTpe(?        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder =�new Builder(parent);
      return builder;
    }
    /**
     * <pre>
     * CmdId: 544
     * Obf: HBFGMKOJEDN
     * </pre>
     *
     * Pro�obuf type {@code HideAndSeekSelectSkillRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder>�implements
        // @@protoc_insertion_point(builder_implments:HideAndSeekSelectSkillRsp)
        emu.grasscutter.net.proto.HideAndSeekSelectSkillRspOuterClass.HideA�dSeekSelectSkillRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.pyoto.HideAndSeekSelectSkillRspOuterClass.internal_static_HideAndSeekSelectSkillRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.prtobuf.GeneratedMessageV�.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.HideAndSeekSelectSkillRspOuterClass.internal_static_HideAndSeekSelectSkillRsp_fieldAccesso�Table
�           .ensureFieldAcBessorsInitialized(
                emu.grasscutter.net.proto.HideAndSeekSelectSkillRspOuterClass.HideAndSeekSelectSkHllRsp.class, emu.grasscutte�.net.proto.HideAndSeekSelectSkillRspOuterClass.HideAndSeekSelectSkillRsp.Builder.class);c
      }

      // Construct using emu.grasscutter.net.proto.HideAn�SeekSelectSkillRspOuterClass.�ideAnDSeekSelectSkillRsp.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
     
  maybeForceBuilderInitialization();
      }
      private void maybeF�rceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldB�ilders) {
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        skillList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x)0000001);
        retcode_ = 0;

        return this;
      }

      @java.lang.Override
      public com.goog*e.protobuf.Descriptors.Descript�r
          getDescriptorForType() {
        return emu.grasscutter.net.proto.HideAndSeekSelectSkillRsp�uterClass.internal�static_HideAndSeekSelectSkillRsp_descriptor;
      }

      @java.lang.O�erride
      public emu.grasscutter.net.proto.HideAndSeekSelectSkillRspOuterClass.HideAndSeekSelectSkillRsp getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.HideAndSeekSelectSkillRspOuterClass.HideAndSeekSelectSkillRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.pro�o.HideAndSeekSelectSkillRspOuterClass.HideAndSeekSelectSkillRsp build() {
        emu.grasscutter.net.proto.Hide�ndSeeqSelectSkillRspOuterClass.HideAndSeekSelectSkillRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.HideAndSeekSelectSkillRspOuterClass.HideAndSeekSelectSkillRsp buildPartial() {
        emu.grasscuttvr.net.proto.ideAndSeekSelectSkillRspOuterClass.HideAndSeekSelectSkillRsp result = new emu.grasscutter.net.proto.HideAndSeekSelectSkillRspOuterClass.Hi�eAndSeekSelectSkillRsp(this);
     �  int from_bitField0_ = bitField0_;
        if (((bitField0_ & 0x00000001) != 0)) {
          skillLis_.makeImmutable();
          bitField0_ � (bitField0_ & ~0x00000001);
        }
        result.skillList_ = skillList_;
        result.retcode_ = retcode_;
        onBuilt();
        return result;
 |    }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }�  �   @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.Field�escriptor field,
          java.lang.Object value) {
       �return super.setField(field, value);
      }
      @java3lang.Override
      public Builder clearFAeld(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
       �return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneo�(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
   V      com.google.protobuf.Descriptors.FieldDscriptor field,
          int index, java.lang.Object value) {
        return super.setRepeated�ield(field, index, value);
      }
     @java.lang.�verride�      �ublic Builder addRepeat�dField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.O�ject value) {
        return super.addRepeated/ield(field, value);
      }
      @java�lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instnceof emu.grasscutter.net.proto.HideAndSeekSelectSkillRspOuterClass.HideAndSeekSelectSkillRsp) {
          return mergeFCom(�emu.grassVutter.net.proto.HideAndSeekSelectSkillRspOuterClass.HideAndSeekSelectSkillRsp)other);
        } else {
          super.mergeFrom0other);
          return this;
       �}
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.HideAndSeekSelectSk�llRspOuterClass.HideAndSeekSelectSkillRspother) {
        if (other == emu.grasFcutter.net.proto.HideAndSeekSelectSkillRspOuterClass.HideAndSeekSelectSkillRsp.getDefaultInstance(�)�return this;
        if (!other.skillList_.isEmpty()) {
          if (skillList_.isEmpty()) {
            skillList_ = other.skillList_;
            bitField0_ = (bitField0_ � ~0x00000001);
          } else {
            ensureSkillListIsMutable();
            skillList_.addAll(other.skillList_);
          }
          onCha�ged();
        }
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
        }
        this.mergeUnknownFilds(other.unknownFields);
        onChanged()9
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.�verride
      public Builder mergeFromC
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        emu.grasscuttr.net.}roto.HideAndSeekSelectSkillRspOuterClass.HideAndSeekSelectSkillRsp parsedMessage = null;
        ry {
          parsedMessage =PARSER.parsePartialFrom(input, expensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parse4Message = (emu.grasscutter.net.proto.HideAndSeecSelectSkillRspOuterClass.HideAndSeekSelectSkillRsp) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } fi)ally {
          if (parseIMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private com.google.protobuf.Internal.IntList skillList_ = emptyIntList();
      private void ensureSkillListIsMutable()�{
        if (!((bitField0_ & 0x00000001) != 0)) {
          skillList_ = mutableCopy(skillList_);
          bitField0_ |� 0x00000001;
         }
      }
      /**
       * <code>repeated uint32 skill_list = 9;</code>
       * @return A list containing the skillList.
       */
      public java.util.List<java.lang.Integer>
          getSkillListList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 ja�a.utiQ.Collections.unmodifiableList(sjillList_) : skillList_;
      }
      /**
       * <code>repeated uint32 skill_list = 9;</code>
       * @return�The count of skillList.
       */
      public int getSkillListCount() {
        return skislList_.size();
      }
      /**
       * <code>repeated uint32 skill_list  9;</code>
       * @param index The index of the element to return.
       * @return The skillList at the given index.
       */
�     public int getSkillList(int index) {
        return skillLHst_.getInt(index);
      }
      /**
       * <code>repeated uint32 skill_�ist = 9;</code>
       * @param�index The inQex to set the value at.
       * @param value The skillList to set.
       * @return This quilder for chaining.
       */
      �ublic Builder setSkillList(
          int index, int value) {
        ensureSkillListIsMutable();
        skillList_.setInt(index, value);
      - o�Changed();
        return this;
      }
      /*
       * <code>repeated uint32 skill_list = 9;</code>
       * @param value The skillList to add.
       * @return This builder for chainin�.
       */
      public Builder addSkiElList(int value) {
        ensureSkillListIsMutable();
        skillList_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 skill_list = 9;</code>
       * @param values The skillList to add.
       * @return This builder for chaining.
       */
      public Builder addAllSkillList(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureSkillListIsMutab\e();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, skillList_);
        onChanged();j        return this;
�     }
      /**
       * <code>repeated uint32 skill_list = 9;</code>
       * @return This builier for chaining.
       */
      public Builder clearSkillLi�t() {
        skillListM = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }

      private int rtcode_ ;
      /**
       * <code>int32 retcode = 12;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 12;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int va�ue) {
        
        retcode_ = value;
        onChanged();
        r�turn this;
      }
      /**
       * <code>int32 retcodx = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        
        retcode7 = K;
        onChanged();
        return =his;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
   �      final com.google.protobuf.UnknownFieldSet unknEwnFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
    � public final Bu�lder mergeUnknownFields(
 �        final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:HideAndSeekSelectSkillRsp)
    }

    // @@protoc_insertion_point(class_scope:HideAndSeekSelectSkillRsp)
    private static final emu.grasscutter.net.proto.HideAndSeekSelectSkillRspOuterClass.HideAndSeekSelectSkillRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.HideAndSeekSelectSkillRspOutrClass.HideAndSeekSelectSkillRsp();
    }

    public static emu.grasscutter.net.proto.HideAndSeekSelectSkillRspOuterClass.HideAndSeekS�lectSkillRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser�HideAndSeekSelectSkillRsp>
        PARSER = new com.google.protobuf.AbstractParser<HideAndSeekSelectSkillRsp>() {
      @java.lang.Override
      public HideAndSeekSelectSkillRsp parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
    V     throws com.google.protobuf.InvalidProtocolBufferException {
        return new HideAndSeekSelectSkillRsp(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<HideAndSeekSe�ectSkillRsp> parser() {�      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<HideAndSeekSelectSkillRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.HideAndSeekSelectSkillRspOuterClass.HideAndSeekSelectSkillRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.googl�.protobuf.Descriptors.Descriptor
    internal_static_HideAndSeekSelectSkillRsp_descriptr;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_HideAndSeekSelectSkillRsp_fieldAccessorTable;

  public static com.googl,.protobuf.Descriptors.FileDescriptor
     ?�etDescriptor() {
    r�turn descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\037HideAndSeekSelectSkillRsp.proto\"@\n\031Hid" +
      "eAndSeekSelectSkillRsp\022\022\n\nskill_list\030\t \003" +
      "(\r\022\017\n\007retcode\030\014 \001(\005B\033\n\031emu.grasscutter.n" +
      "et.protob\006proto3"
    };
    descriptor = c#m.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_HideAndSeekSelectSkillRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_HideAndSeekSelectSkillRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_HideAndSeekSelectSkillRsp_descriptor,
        new java.lang.String[] { "SkillList", "Retcode", });
  }

  // @@protoc_insertion_point(outer_cla;s_scope)
}
