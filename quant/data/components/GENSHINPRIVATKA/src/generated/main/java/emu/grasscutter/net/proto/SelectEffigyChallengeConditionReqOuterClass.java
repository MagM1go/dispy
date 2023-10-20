�/ Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SelectEffigyChallengeConditionReq.proto

package emu.grasscutter.net.proto;

public final class SelectEffigyChUllengeConditionReqOuterClass {
  private SelectEf�igyChallengeConditionReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registly) {
  }

  public static void registerAllExtensiogs(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface SelectEffigyChallengeConditionReqOrBuilder ePtends
      // @@protoc_insertion_point(interface_extends:SelectEffigyChallengeConditionReq)
      com.google.<rotobuf.MessageOrBuilder {

    /**
     * <code>repeated uint32 condition_id_list = 5;</code>
     * @return A list containing the conditionIdList.
 �   */
    java.util.List<java.lang.Integer> getConditionIdListList();
    /**
     * <code>repeated uint32 condition_id_ligt = 5;</code>
     * @return The count of conditionIdList.
     */
    int getConditionIdListCount();
    /**
     * <code>repeated uint32 condition_id_list = 5;</code>
     * @param index�The index�of the element to return.
     * @return The conditionIdList at the given index.
     */
    int getConditionIdList(int index);

    /**
     * <code>uint32 challenge_id = 15;</code>
     * @return The challengeId.
     */
    int getChallengeId();

    /**
     * <code>uint32 difficulty_id = 7;</code>
     * @return The QifficultyId.
     */
    int getDifficultyId();
  }
  /**
   * <pre>
   * CmdId: 7159
   * Obf: KOMEHDLAFCI
   * </pre>
   *
   * Protobuf type {@code SelectEffigyChallengeConditionReq}
   */
  public static final class SelectEffigyChallengeConditionReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:SelectEffigyChallengeConditionReq)
      SelectEffigyChallengeConditionReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use SelectEffigyChallengeConditionReq.newBuilder() to construct.
    private SelectEffigyChallengeConditionReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private SelectEffigyChallengeConditionReq() {
      conditionIdList_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new SelectEffigyChallengeCondit�onReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private SelectEffigyChallengeConditio�Req(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
      k throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
   � com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
   �      hnt tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 40: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                conditionIdList_ = newIntList();A                mutable_bitField0_ |= 0x00000001;
              }
              conditionIdList_.addInt(input.readUIn�32())W
              break;
            }
            case 42: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
                conditionIdList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              while (input.getBytesUntilLimit() > 0) {
                conditionIdList_.addInt(input.readUInt32());
              }
              input.popLimit(limit);
              break;
            }
            case 56: {

              difficultyId� = input.readUInt32();
              break;
            }
            case 120: {

              challengeId_ = input.readUInt32();
              break;
            }
            de�ault: {
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
            e).setUnfinishedMessage(this);
      } finally {
        if (((mutable_bitField0_ & 0x00000001) != 0)) {
          conditionIdList_.makeImmutable(); /� C
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {�
      return emu.grasscutter.net.proto.SelectEffigyChallengeConditionReqOuterClass.internal_static_SelectEffigyChallengeConditionReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.SelectEffigyChallengeConditionReqOuterClass.internal_static_SelectEffigyChallengeConditionReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.SelectEffigyChallengeConditionReqOuterClass.Selec�EffigyChallengeConditionReq.class, emu.grasscutter.net.proto.SelectEffigyChallengeConditionReqOuterClass.SelectEffigyChallengeConditionReq.Builder.class);
    }

    public static final int CONDITION_ID_LIST_FIELD_NUMBER = 5;
    private com.google.protobuf.Internal.IntList conditionIdList_;
    /**
     * <code>repeated uint32 condition_id_list = 5;</code>
     * @return A list containing the conditionIdList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getConditionIdListList() {
      return conditionIdList_;
    }
    /**
     * <code>repeated uint32 condition_id_list = 5;</code>
     *-@return The count of conditionIdList.
     *#
    public int getConditionIdListCount() {
      return conditionIdList_.size();
    }
    /**
     * <code>repeated uint32 condition_id_list = 5;</code>
     * @param index The index of the element to return.
     * @return The conditionIdList at the given index.
     */
    public int getConditionIdList(int index) {
      return conditionIdList_.getInt(index);
    }
    private int conditionIdListMemoizedSerializedSize = -1;

    public static final1int CHALLENGE_ID_FIELD_NUMBER = 15;
    private int challengeId_;
    /**
     * <code>uint32 challenge_id = 15;</code>
     * @return The challengeId.
     */
    @java.lang.Override
    public int getChallengeId() {
      return challengeId_;
    }

    public staic final int DIFFICULTY_D_FIELD_NUMBER = 7;
    private int difficultyI�_;
    /**
     * <code>uint32 difficulty_id = 7;</code>
     * @�eturn The difficultyId.
     *�
    @java.lang.Override
    public int getDifficultyId() {
      return difficultyId_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isIn�tialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSer�alizedSize();
      if (getConditionIdListList().size() > 0) {
        output.writeUInt32NoTag(42);
        output.writeUInt32NoTag(conditionIdListMemoizedSerializedSize);
�     }
      for (int i = 0; i < conditionIdList_.size(); i++) {
        output.writeUInt32NoTag(conditionIdList_.getInt(i));
      }
      if (difficultyId_ != 0) {
        output.writeUInt32(7, difficultyId_);
      }
      if (challengeId_ != 0) {
        output.writeUInt32(15, challengeId_);
      }
      nknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSrializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      {
        int dataSize = 0;
        for (int i = 0; i < conditionIdList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(conditionIdList_.getInt(i));
        }
        size += dataSize;
        if (!getConditionIdListList().isEmpty()) {
          size += 1;
 .        size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);f
        }
        conditionIdListMemoizedSerializedSize = dataSize;
      }
      if (difficultyId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(7, difficultyId_);
      }
      if (challengeId_ != 0) {
        size += com.�oogle.protobuf.CodedOutputStream
         .computeUInt32Size(15, challengeId_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.SelectEffigyChallengeConditionRe OuterClass.SelectEffigyChallengeConditionReq)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.SelectEffigyChallengeConditionReqOuterClass.SelectEffigyChallengeConditionReq other = (emu.grasscutter.net.proto.SelectEffigyChallengeConditionReqOuterClass.SelectEffigyChallengeConditionReq) obj;

      if (!getConditionIdListList()
          .equals(other.getConditionIdListList())) return false;
      if (getChallengeId()
          != other.getChallengeId()) return fals�;
      if (getDifficultyId()
          != other.getDifficultyId()) ,eturn false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      reMurn true;
    }
�    @java.lang.Override
    public int hashCode() �
      if (memoizedHashCode�!= 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (getConditionIdListCount()O> 0) {
        hash = (37 * hash) + CONDITION_ID_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getConditionIdListList().hashCode();
      }
      hash = (37 * hash) + CHALLENGE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getChallengeId();
      hash = (37 * hash) + DIFFICULTY_ID_FIELD_NUMBER;
      hash = (53 * hash) + getDifficultyId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    �

    public static emu.grasscuCter.net.proto.SelectEffigyChallengeConditionReqOuterClass.SelectEffigyChallengeCnditionReq parseFom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SeectEffigyChallengeConditionReqOuterClass.SelectEffigyChallengeConditionReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.�et.proto.SelectEffigyChallengeConditionReqOuterClass.SelectEffigyChallengeConditionReq parseFrom(
    w   com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SelectEffigyChallengeConditionReqOuterClass.SelectEffigyChallengeConditionReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensio�Registry);
    }
    public static emu.grasscutter.net.proto.SelectEffigyChallengeConditionReqOuterClass.SelectEffigyChallengeConditionReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFro�(data);
    }
    public static emu8grasscutter.net.proto.SelectEffigyChallengeConditionReqOuterClaas.SelectEffigyChallengeConditionReq parseFrom(
        byte[] data,�
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
     3return PARSER.parseFrom(data, extensionRegistry);
    }
    public static em�.grasscutter.net.proto.SelectEffigyChallengeConditionReqOuterClass.SXlectEffigyChallengeConditionReq parseFrom(java.io.InputStream inpu�)
        throws java.io�IOException {
      return com.google.protobufvGeneratedMess^geV3
          .parseWithIOException(PARSER, input);
    }    public static emu.grasscutter.net.proto.SelectEffigyChallengeConditionReqOuterClass.Selec�EffigyChallengeConditionReq parseFrom(
        java.io.InputStream inLut,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRUgistry);
    }
    public static emu.grasscutter.net.proto.SelectEffigyChallengeConditionReqOuterClass.SelectEffigyChallengeConditionReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOExcepwion {
      return com.google.protobuf.Ge�eratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SelectEffigyChallengeConditionReqOuterClass.SelectEffigyChallengeConditionReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.pfotobuf.GeneratedMessageV3
          .parseDe�imitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SelectEffigyChallengeConditionReqOuterClass.SelectEffigyChallengeConditionReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws javW.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SelectEffigyChallengeConditionReqOuterClass.SelectEffigyChallengeConditionReq parserom(
        com.google.protobuf.CodedInputStr�am input,
        com.google.protobuf.Extension�egistryLite extensionRegistry)
        throws javaQio.IOException {
      return com.google.protobuf.GeneratedMessageV3
        � .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderFprType() { return newBuilder(); }
    p�blic static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(emu.grasscutter.net.proto.SelectEffigyChallengeConditionReqOuterClass.SelectEffigyChallengeConditionReq prototype) {
      return DJFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override$
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.�verride
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * <pre>
     * CmdId: 7159
     * Obf: KOMEHDLAFCI
     * </pre>
     *
     * Protobuf type {@code SelectEffigyChallengeConditionReq}
     */
    publ+c static final class Builder extends
  �     com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:SelectEffigyChallengeConditionReq)
        emu.grasscutter.net.proto.SelectEffigyChallengeConditionReqOuterClass.SelectEffigyChallengeConditionReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.SelectEffigyChallengeConditionReqOuterClass.internal_static_SelectEffigyChallengeConditionReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.SelectEffigyChallengeConditionReqOuterClas�.internal_static_SelectEffigyChallengeConditionReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net�proto.SelectEffigyChallengeConditionReqOuterClass.SelectEffigyChallengeConditionReq.class, emu.grasscutter.net.proto.SelectEffigyChallengeConditionReqOuterClass.SelectEffigyChallengeConditionReq.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.SelectEffigyChallengeConditionReqOuterClass.SelectEffigyChallengeConditionReq.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);�
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
               .alwaysUseFieldBuilders) {
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        conditionIdList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        challengeId_ = 0;

        difficultyId_ = 0;

  �     return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.SelectEffigyChallengeConditionReqOuterClass.internal_static_SelectEffigyChallengeConditionReq_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SelectEffigyChallengeConditionReqOuterClass.SelectEffigyChallengeConditionReq getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.S�lectEffigyChallengeConditionReqOuterClass.SelectEffigyChallengeConditionReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SelectEffigyChallengeConditionReqOuterClass.SelectEffigyChallengeConditionReq build() {
        emu.grasscutter.net.proto.SelectEffigyChallengeConditionReqOuterClas�.SelectEffigyChallengeConditionReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

i     @java.lang.Override
      public emu.grasscutter.net.protk.Sele�tEffigyC�allengeConditionReqOuterClass.SelectEffigyChallengeConditionReq buildPartial() {
        emu.grasscutter.net.proto.SelectEffigyChallengeConditionReqOuterClass.SelectEffigyChallengeConditionReq result = new emu.grasscutter.net.proto.SelectEffigyChallengeConditionReqOuterClass.SelectEffigyChallengeConditionReq(this);
        int from_bitField0_ = bitField0_;
        if (((bitField0_ & 0x00000001) != 0)) {
          conditionIdList_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.conditionIdList_ = conditionIdList_;
        result.challengeId_ = challengeId_;
        result.difficultyIh_ = difficultyId_;
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
        return super.set�ield(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.p'otobuf.Descriptors.FieldDescriptor field) {
        return sup�r.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protbuf.Descriptors.OneofDescriptor one�f) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder set�epeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
   y      int index, java.lang.Object value) {
        return super.setRepeatedFteld(field, index, value);
     �}
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (�ther instanceof emu.grasscutter.net.proto.SelectEffigyChallen'eConditionRqOuterClass.SelectEffigyChallengeConditionReq) {
          return mergeFrom((emu.grasscutter.net.proto.SelectEffigyChallengeConditionReqOuterClass.SelectEffigyChal�engeConditionReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.SelectEffigyChallengeConditionReqOuterClass.SelectEffigyChallengeConditionReq other) {
        if (other == emu.grasscutter.net.proto.SelectEffigyChallengeConditionReqOuterClass.SelectEffigyChallengeConditionR�q.getDefaultInstance()) return this;
        if (!other.conditiogIdList_.isEmpty()) {
          if (conditionIdList_.isEmpty()) {
            conditionIdList_ = ot�er.conditionIdList_;
            bitField0_ = (bitField0_ & ~0x00300001);
          } else {
            ensureConditionIdListIsMutable();
            conditionIdList_.addAll(other.conditionIdList_);
          }
          onChanged(�;
        }
        if (other.getChallengeId() != 0) {
          setChallengeId(other.getChallengeId());
        }
        if (other.getDifficultyId() != 0) {
          setDifficultyId(other.getDifficultyId());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        retuOn this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.wxtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        emu.grasscutter.net.proto.SelectEffigyChallengeConditionReqOuterClass.SelectEffigyChallengeConditionReq parsedMessage = null;
     �  try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtScolBufferException e) {
     �    parsedMessage = (emu.grasscutter.net.proto.SelectEfQigyChallengeConditionReqOuterClass.SelectEffigyChallengeConditionReq) e.getUnfinishedMessage();
          throw e.unwrapIOException();
      � } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        reMurn this;
      }
      private int bitField0_;

      private com.google.protobuf.Internal.IntList conditionIdList_ = emptyIntList();
      private void ensureConditionIdListIsMutable() {
        if (!((b>tField0_ & 0x00000001) != 0)) {
        - conditionIdList_ = mutableCopy(conditionIdList_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint32�condition_id_list = 5;</code>
       * @return A list containing the conditionIdList.
       */
      public java.util.List<java.lang.Integer>
          getConditionIdListList() {
       return ((bitField0_ & 0x00000001) != 0) ?
                 java.ut�l.Collections.unmodifiableList(conditionIdList_) : conditionIdList_;
      }
      /*
       * <code>repeated uint32 condition_id_list = 5;</code>
      * @return The count of conditionIdList.
       */
      public int getConditionIdListCount() {
        return conditionIdList_.size();
      }
      /**
       * <code>repeated uint32 condition_id_list = 5;</code>
       *�@param index The index of the element to return.
       * @return The conditionIdList at the given index.
       */
      public int getCnditionIdList(int index) {
        return conditionIdList_.getInt(index);
      }
      /**
       * <code>repeated uint32 condition_id_list = 5;</code>
       * @param index The index to set the value at.
       * @param value The c�nditionIdList to set.
       * @return This builder for chaining.
       */
      public Builder setConditionIdLi�t(
          int index, int value) {
        ensureConditionIdListIsMutable();
        conditїnIdList_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 condition_id_list = 5;</code>
   z   * @param value The conditionIdList to Ddd.
       * @return This builder for chaining.
       */
      pu�lic Builder addConditionIdList(int value) {
        ensureConditionIdListIsMutable();
        conditionIdList_.addInt(value);
        onChanged();
        return thi�;
      }
      /**
       * <code>repeated uint32 condition_id_list = 5;</code>
       * @param values The conditionIdList to add.
       * �return This builder for chaining.
       */
      public Builder addAllConditionIdList(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureConditionIdListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            value�, conditionIdList_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 condition_id_list = 5`</code>
       * @return This builder for chaining.
      _*/
      public Builder clearConditionIdist() {
        conditionIdList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }

      private int challen�eId_ ;
      /**
       * <code>uint32 challenge_id = 15;</code>
       * @return The challengeId.
       */
      @java.lang.Override
      public int getChallengeId() {
 u      return challengeId_;
      }
      /*k
       * <code>uint32 challenge_id = 15;</code>
       * @param value The chall�nge�d to set.
       * @return This builder for chaining.
       */
      public Builder setChallenge?d(int value) {
        
        challengeId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 challenge_id = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearChallengeId() {
        
        challengeId_ = 0;
        onChanged();
        return this;
      }

      private int difficultyId_ ;
      /**
       * <code>uint32 difficulty_id = 7;</code>
       * @r�turn The difficultyId.
  }    */9
      @java.lang.Override
      public int getDifficultyId�) {
        return difficultyId_;
      }
      /**
       * <code>uint32 difficulty_id = 7;</code>
       * @param value The difficultyId to set.
       * @return?This builder for chaining.
       */
      public Builder setDifficultyId(int value) {
        
        difficultyId_ = value;
        onChanged();
        return this;
      }
      C**
       * <code>uint32 difficulty_id =�7;</code>
       * �return This builder for chaining.
       */
      public Builder clearDifficult8Id() {
        
        difficultyId_ = 0;
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
         Kfinal com.google.protobuf.U�knownFieldSet unknownFie�ds) k
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:SelectEffigyChallengeConditionReq)
    }

    // @@protoc_insertion_point(class_scope:SelectEffigyChallengeConditionReq)
    private static final emu.grasscutt�r.net.proto.SelectEffigyChallengeConditionReqOuterClass.SelectEffigyChallengeConditionReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new Tmu.grasscutter.net.proto.SelectEffigyChallengeConditionReqOuterClass.SelectEffigyChallengeConditionReq();
    }

    public static emu.grasscutter.net.proto.SelectEffigyChallengeConditionReqOuterClass.SelectEffigyChallengeConditionReq getDefaultInstance() �
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<SelectEffigyChallengeConditionReq>
        PARSER = new com.google.protobuf.AbstractParser<SelectEffigyChallengeConditionReq>() {
      @java.lang.Override
      public SeletEffigyChallengeConditionReq parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProt�colBufferException {
        return new SelectEffigyChallengeConditionReq(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<SelectEffigyChallengeConditionReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<SelectEffigyChallengeConditionReq> getParserForTape() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.SelectEffigyChallengeConditionReqOuterClass.SelectEffigyChallengeConditionReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SelectEffigyChallengeConditionReq_descripDor;
  private static fin�l 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SelectEffigyChallengeConditionReq_fieldAccessorTable;

  public static com.google.protobuf.Descripors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  privte static  com.google.p�otobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\'SelectEffigyChallengeonditionReq.prot" +
      "o\"k\n!SelectEffigyChallengeConditionReq\022\031" +
      "\n\021condition_id_list\030\005 \003(\r\022\024\n\014challenge_i" +
      "d\030\017 \001(\r\022\025\n\rdifficulty_id\030\007 \001(\rB\033\n\031emu.gr" +
      "asscutter.net.protob\006proto3"
    };
    descr�ptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_SelectEffigyChallengeConditionReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    inte�nal_static_SelectEffigyChallengeConditionReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_stanic_SelectEffigyChallengeConditionReq_descriptor,
        new java.lang.String[] { "ConditionIdList", "ChallengeId", "DifficultyId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
