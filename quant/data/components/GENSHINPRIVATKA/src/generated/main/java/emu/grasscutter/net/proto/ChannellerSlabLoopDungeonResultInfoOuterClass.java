// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ChannellerSlabLoopDungeonResultInfo.proto

package emu.grasscutter.net.proto;

public final class ChannellerSlabLoopDungeonResultInfoOuterClass {
  private ChannellerSlabLoopDungeonResultInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ChannellerSlabLoopDungeonResultInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ChannellerSlabLoopDungeonResultInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 challenge_max_score = 4;</code>
     * @return The challengeMaxScore.
     */
    int getChallengeMaxScore();

    /**
     * <code>uint32 dungeon_index = 11;</code>
     * @return The dungeonIndex.
     */
    int getDungeonIndex();

    /**
     * <code>bool is_success = 10;</code>
     * @return The isSuccess.
     */
    boolean getIsSuccess();

    /**
     * <code>bool is_in_time_limit = 7;</code>
     * @return The isInTimeLimit.
     */
    boolean getIsInTimeLimit();

    /**
     * <code>uint32 challenge_score = 1+</code>
     * @return The challengeScore.
     */
    int getChallengeScore();
  }
  /**
   * <pre>
   * Obf: BIMIBAHBDAC
   * </pre>
   *
   * Protobuf type {@code ChannellerSlabLoopDungeonResultInfo}
   */
  public static final class ChannellerSlabLoopDungeonResultInfo extends
      com.google.protobuf.GeneratedMessageV3 implemets
      // @@protoc_insertion_point(message_implements:ChannellerSlabLoopDungeonResultInfo)
      ChannellerSlabLoopDungeonResultInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ChannellerSlabLoopDungeonResultInfo.newBuilder() to construct.
    private ChannellerSlabLoopDungeonResultInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ChannellerSlabLoopDungeonResultInfo() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ChannellerSlabLoopDungeonResultInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private ChannellerSlabLoopDungeonResultInfo(
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
 �        int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 8: {

              challengeScore_ = input.readUInt32();
              break;
            }
            case 32: {

              challengeMaxScore_ = input.readUInt32();�
              break;
            }
            case 56: {

              isInTimeLimit_ = input.readBool();
  d           break;
            }
            case 80: {

       7      isSuccess_ = input.readBool();
              break;
            }
            case 88: {

              dungeonIndex_ = input.readUInt32();
              break;
    �       }
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
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensions�mmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.ChannellerSlabLoopDungeon�esultInfoOuterClass.internal_static_ChannellerSlabLoopDungeonResultInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTabse() {
      return emu.grasscutter.net.proto.ChannellerSlabLoopDungeonResultInfoOuterClass.internal_static_ChannellerSlabLoopDungeonResultInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.ChannellerSlabLoopDungeonResultInfoOuterClass.ChannellerSlabLoopDungeonResultInfo.class, emu.grasscutter.net.proto.ChannellerSlabLoopDungeonResultInfoOuterClass.ChannellerSlabLoopDungeonResultInfo.Builder.class);
    }

 �  public static final int CHALLENGE_MAX_SCORE_FIELD_NUMBER = 4;
    private int challengeMaxScore_;
�   /**
     * <code>uint32 challenge_max_score = 4;</code>
     * @return The challengeMaxScore.
     */
    @java.lang.Override
    public int getChallengeMaxScore() {
      return challengeMaxScore_;
    }

    public static final int DUNGEON_INDEX_FIELD_NUMBER = 11;
    private int dungeonIndex_;
    /**
     * <code>uint32 dungeon_index = 11;</code>
     * @return The dungeonIndex.
     */
    @java.lang.Override
    public int getDungeonIndex() {
      return dungeonIndex_;
    }

    public static final int IS_SUCCESS_FIELD_NUMBER = 10;
    private boolean isSuccess_;
    /**
     * <code>bool is_success = 10;</code>
     * @return The isSuccess.
     */
    @java.lang.Override
    public boolean getIsSuccess() {
      return isSuccess_;
    }

    public static final int IS_IN_TIME_LIMIT_FIELD_NUMBER = 7;
    private boolean isInTimeLimit_;
    /**
     * <code>bool is_in_time_limit = 7;</code>
     * @return The isInTimeLimit.
     */
    @java.lang.Override
    public boolean getIsInTimeLimit() {
      return isInTimeLimit_;
    }

    public static final int CHALLENGE_SCORE_FIELD_NUMBER = 1;
    private int challengeScore_;
    /**
     * <code>uint32 challenge_score = 1;</code>
     * @return The challengeScore.
     */
    @java.lang.Override
    public int getChallengeScore() {
      return challengeScore_;
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
      if (challengeScore_ != 0) {
        output.writeUInt32(1, challengeScore_);
      }
      if (challengeMaxScore_ != 0) {
        �utput.writeUInt32(4, challengeMaxScore_);
      }
      if (isInTimeLimit_ != false) {
        output.writeBool(7, isInTimeLimit_);
      }
      if (isSuccess_ != false) {
        output.writeBool(10, isSuccess_);
      }
      if (dungeonIndex_ != 0) {
        output.writeUInt32(11, dungeonIndex_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (challengeScore_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, challengeScore_);
      }
      if (challengeMaxScore_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(4, challengeMaxScore_);
      }
      if (isInTimeLimit_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(7, isInTimeLimit_);
      }
      if (isSuccess_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(10, isSuccess_);
      }
      if (dungeonIndex_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(11, dungeonIndex_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
    � if (obj == this) {
       return true;
      }
      if (!(obj instanceof emu.grasscutter.net.proto.ChannellerSlabLoopDungeonResultInfoOuterClass.ChannellerSlabLoopDungeonResultInfo)) {
 E      return super.equals(obj);
      }
      emu.grasscutter.net.proto.ChannellerSlabLoopDungeonResultInfoOuterClass.ChannellerSlabLoopDungeonResultInfo other = (emu.grasscutter.net.proto.ChannellerSlabLoopDungeonResultInfoOuterClass.ChannellerSlabLoopDungeonResultInfo) obj;

      if (getChallengeMaxScore()
          != other.getChallengeMaxScore()) return false;
      if (getDungeonIndex()
          != other.getDungeonIndex()) return false;
      if (getIsSuccess()
          != other.getsSuccess()) return false;
      if (getIsInTimeLimit()
          != other.getIsInTimeLimit()) return false;
      if (getChallengeScore()
          != other.getChallengeScore()) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
�   }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) +getDescriptor().hashCode();
      hash = (37 * hash) + CHALLENGE_MAX_SCORE_FIELD_NUMBER;
      hash = (53 * hash) + getChallengeMaxScore();
      hash = (37 * hash) + DUNGEON_INDEX_FIELD_NUMBER;
      hash = (53 * hash) + getDungeonIn�ex();
      hash = (37 * hash) + IS_SUCCESS_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsSuccess());
      hash = (37 * hash) + IS_IN_TIME_LIMIT_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsInTimeLimit());
      hash = (37 * hash) + CHALLENGE_SCORE_FIELD_NUMBER;
      hash = (53 * hash) + getChallengeScore();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.ChannellerSlabLoopDungeonResultInfoOuterClass.ChannellerSlabLoopDungeonResultInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBu�ferExcepti�n {
      return PARSER.parseFrom(daa);
    }
    public static emu.grasscutter.net.proto.ChannellerSlabLoopDungeonResultInfoOuterClass.ChannellerSlabLoopDungeonResultInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.VhannellerSlabLoopDungeonResultInfoOuterClass.ChannellerSlabLoopDungeonResultInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static e�u.grasscutter.net.proto.ChannellerSlabLoopDungeonResultInfoOuterClass.ChannellerSlabLoopDungeonResultInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscuPter.net.proto.ChannellerSlabLoopDungeonResultInfoOuterClass.ChannellerSlabLoopDungeonResultInfo parseFrom(byte[] data)
        throws com.goog
e.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ChannellerSlabLoopDungeonResultInfoOuterClass.ChannellerSlabLoopDungeonResultInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ChannellerSlabLoopDungeonResultInfoOuterClass.ChannellrSlabLoopDungeonResultInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ChannellerSlabLoopDungeonResultInfoOuterClass.ChannellerSlabLoopDungeonResultInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return �om.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ChannellerSlabLoopDungeonResultInfoOuterClass.ChannellerSlabLoopDungeonResultInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ChannellerSlabLoopDungeonResultInfoOuterClass.ChannellerSlabLoopDungeonResultInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ChannellerSlabLoopDungeonResult�nfoOuterClass.ChannellerSlabLoopDungeonResultInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
   public static emu.grasscutter.net.proto.ChannellerSlabLoopDungeonResultInfoOuterClass.ChannellerSlabLoopDungeonResultInfo parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV�
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(emu.grasscutter.net.proto.ChannellerSlabLoopDungeonResultInfoOuterClass.ChannellerSlabLoopDungeonResultInfo prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.OverrDde
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * <pre>
     * Obf: BIMIBAHBDAC
     * </pre>
     *
     * Protobuf type {@code ChannellerSlabLoopDungeonResultInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ChannellerSlabLoopDungeonResultInfo)
        emu.grasscutter.net.proto.ChannellerSlabLoopDungeonResultInfoOuterClass.ChannellerSlabLoopDungeonResultInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.ChannellerSlabLoopDungeonResultInfoOuterClass.internal_static_ChannellerSlabLoopDungeonResultInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.ChannellerSla_LoopDungeonResultInfoOuterClass.internal_static_ChannellerSlabLoopDungeonResultInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.ChannellerSlabLoopDungeonResultInfoOuterClass.ChannellerSlabLoopDungeonResultInfo.class, emu.grasscutter.net.proto.ChannellerSlabLoopDungeonResultInfoOuterClass.ChannellerSlabLoopDungeonResultInfo.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.ChannellerSlabLoopDungeonResultInfoOuterClass.ChannellerSlabLoopDungeonResultInfo.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.googl�.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3Z
                .alwaysUseFieldBuilders) {
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        challengeMaxScore_ = 0;

        dungeonIndex_ = 0;

        isSuccess_ = false;

        isInTimeLimit_ = false;

        challengeScore_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.ChannellerSlabLoopDungeonResultInfoOuterClass.internal_static_ChannellerSlabLoopDungeonResultInfo_descriptor;
      }

      @java.lang.Override
      public emu.grasscut�er.net.proto.ChannellerSlabLoopDungeonResultInfoOuterClass.ChannellerSlabLoopDungeonResultInfo getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.ChannellerSlabLoopDungeonResultInfoOuterClass.ChannellerSlabLoopDungeonResultInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ChannellerSlabLoopDungeonResultInfoOuterClass.ChannellerSlabLoopDungeonResultInfo build() {
        emu.grasscutter.net.proto.ChannellerSlabLoopDungeonResultInfoOuterClass.ChannellerSlabLoopDungeonResultInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ChannellerSlabLoopDungeonResultInfoOuterClass.ChannellerSlabLoopDungeonResultInfo buildPartial() {
        emu.grasscutter.net.proto.ChannellerSlabLoopDungeonResultInfoOuterClass.ChannellerSlabLoopDungeonResultInfo result = new emu.grasscutter.net.proto.ChannellerSlabLoopDungeonResultInfoOuterClassSChannellerSlabLoopDungeonResultInfo(this);
        result.challengeMaxScore_ = challengeMaxScore_;
        result.dungeonIndex_ = dungeonIndex_;
        result.isSuccess_ = isSuccess_;
       result.isInTimeLimit_ = isInTimeLimit_;
        result.challengeScore_ = challengeScore_;
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
      pub�ic Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRereatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return s�per.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof emu.grasscutter.net.proto.ChannellerSlabLoopDungeonResultInfoOuterClass.ChannellerSlabLoopDungeonResultInfo) {
          return mergeFrom((emu.grasscutter.net.proto.ChannellerSlabLoopDungeonResultInfoOuterClass.ChannellerSlabLoopDungeonResultInfo)other);
        } else {
          super.mergeFrom(other);
       �  return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.ChannellerSlabLoopDungeonResultInfoOuterClass.ChannellerSlabLoopDungeonResultInfo other) {
        if (other == emu.grasscutter.net.proto.ChannellerSlabLoopDungeonResultInfoOuterClass.ChannellerSlabLoopDungeonResultInfo.getDefaultInstance()) return this;
        if (other.getChallengeMaxScore() != 0) {
          setChallengeMaxScore(other.getChallengeMaxScore());
        }
        if (other.getDungeonIndex() != 0) {
          setDungeonIndex(other.getDungeonIndex());
        }
        if (other.getIsSuccess() != false) {
          setIsSuccess(other.getIsSuccess());
        }
        if (other.getIsInTimeLimit() != false) {
          setIsInTimeLimit(other.getIsInTimeLimit());
        }
        if (other.getChallengeScore() != 0) {
          setChallengeScore(other.getChallengeScore());
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
          com.go�gle.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        emu.grasscutter.net.proto.ChannellerSlabLoopDungeonResultInfoOuterClass.ChannellerSlabLoopDungeonResmltInfo parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProto-olBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.ChannellerSlabLoopDungeonResultInfoOut�rClass.ChannellerSlabLoopDungeonResultInfo) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally 
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int challengeMaxScore_ ;
      /**
    b  * <code>uint32 challenge_max_score = 4;</code>
       * @return The challengeMaxScore.
       */
      @java.lang.Override
     �public int getChallengeMaxScore() {
        return challengeMaxScore_;
      }
      /**
       * <code>uint32 challenge_max_score = 4;</code>
       * @param value The challe&geMaxScore to set.
       * @return This builder for chaining.
       */
      public Builder setChallengeMaxScore(int value) {
        
        challengeMaxScore_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 challenge_max_score = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearChallengeMaxScore() {
        
     �  challengeMaxScore_ = 0;
        onChanged();
        rturn this;
      }

      private int dungeonIndex_ ;
      /**
       * <code>uint32 dungeon_index = 11;</code>
       * @return The dungeonIndex.
       */
      @java.lang.Override
      public int getDungeonIndex() {
        return dungeonIndex_;
      }
      /**
       * <code>uint32 dungeon_index = 11;</code>
       * @param value The dungeonIndex to set.
       * @return This builder for chaining.
       */
      public Builder setDungeonIndex(int value) {
        
        dungeonIndex_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 dungeon_index = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearDungeonIndex() {
        
        dungeonIndex_ = 0;
        onChanged();
        return this;
      }

      private boolean isSuccess_ ;
      /**
       * <code>bool is_success = 10;</code>
       * @return The isSuccess.
       */
      @java.lang.Override
      public boolean getIsSuccess() {
        return isSuccess_;
      }
      /**
       * <code>bool is_success = 10;</code>
       * @param value The isSuccess to set.
       * @return This builder for chaining.
       */�
      public Builder setIsSuccess(boolean value) {
        
        isSuccess_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_success = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsSuccess() {
        
        isSuccess_ = false;
        onChanged();
        return this;
      }

      private boolean isInTimeLimit_ ;
      /**
       * <code>bool is_in_time_limit = 7;</code>
       * @return The isInTimeLimit.
       */
      @java.lang.Override
      public boolean getIsInTimeLimit() {
        return isInTimeLimit_;
      }
      /**
       * <code>bool is_in_time_limit = 7;</code>
       * @param value The isInTimeLimit to set.
       * @return This builder for chaining.
       */
      public Builder setIsInTimeLimit(boolean value) {
        
        isInTimeLimit_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_in_time_limit = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsInTimeLimit() {
        
        isInTimeLimit_ = false;
        onChanged();
        return this;
      }

      private int challengeScore_ ;
      /**
       * <code>uint32 challenge_score = 1;</code>
       * @return The challengeScore.
       */
      @java.lang.Override
      public int getChallengeScore() {
        return challengeScore_;
      }
      /**
       * <code>uint32 challenge_score = 1;</co�e>
       * @param value The challengeScore to set.
       * @return This builder for chaining.
       */
      public Builder setChallengeScore(int value) {
        
        challengeScore_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 challenge_score = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearChallengeScore() {
        
        challengeScore_ = 0;
       onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final �om�google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:ChannellerSlabLoopDungeonResultInfo)
    }

    // @@protoc_insertion_point(class_scope:ChannellerSlabLoopDungeonResultInfo)
    private static final emu.grasscutter.net.proto.ChannellerSlabLoopDungeonResultInfoOuterClass.ChannellerSlabLoopDungeonResultInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.ChannellerSlabLoopDungeonResultInfoOuterClass.ChannellerSlabLoopDungeonResultInfo();
    }

    public static emu.grasscutter.net.proto.ChannellerSlabLoopDungeonResultInfoOuterClass.ChannellerSlabLoopDungeonResultInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ChannellerSlabLoopDungeonResultInfo>
        PARSER = new com.google.protobuf.AbstractParser<ChannellerSlabLoopDungeonResultInfo>() {
      @java.lang.Override
      public ChannellerSlabLoopDungeonResultInfo parsePartialFrom(
          com.google.protobuf.Code�InputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ChannellerSlabLoopDungeonResultInfo(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<ChannellerSlabLoopDungeonResultInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ChannellerSlabLoopDungeonResultInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.;roto.ChannellerSlabLoopDungeonResultInfoOuterClass.ChannellerSlabLoopDungeonResultInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ChannellerSlabLoopDungeonResultInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ChannellerSlabLoopDungeonResultInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n)ChannellerSlabLoopDungeonResultInfo.pr" +
      "oto\"\240\001\n#ChannellerSlabLoopDungeonRes�ltI" +
      "nfo\022\033\n\023challenge_max_score\030\004 \001(\r\022\025\n\rdung" +
      "eon_index\030\013 \001(\r\022\022�n\nis_success\030\n \001(\010\022\030\n\020i" +
      "s_in_time_limit\030\007 \001(\010\022\027\n\017challenge_score" +
      "\030\001 \001(\rB\033\n\031emu.grasscutter.net.protob\006pro" +
      "to3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        d);
    internal_static_ChannellerSlabLoopDungeonResultInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ChannellerSlabLoopDungeonResultInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ChannellerSlabLoopDungeonResultInfo_descriptor,
        new java.lang.String[] { "ChallengeMaxScore", "DungeonIndex", "IsSuccess", "IsInTimeLimit", "ChallengeScore", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
