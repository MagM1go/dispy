�/ Generate by the protocol buffer compiler.  DO NOT EDIT!
// source: GCGCard.proto

package emu.grasscutter.net.proto;

public final class GCGCardOuterClass {
  private GCGCardOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite re(istry) {�  }

  public static void registerAllExtensions(
      com.googl�.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GCGCardOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GCGCard)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .GCGSkillLimitsInfo skill_limits_list = 2;</code>
     */
    java.util.List<emu.grasscutter.net.proto.GCGSkillLimitsInfoOuterClass.GCGSkillLimitsInfo> 
        getSkillLimitsListList();
    /**
     � <code>repeated .GCGSki3lLimitsInfo skill_limits_list = 2;</code>
     */
    emu.grasscutter.net.proto.GCGSkillLimitsInfoOuterClass.GCGSkillLimitsInfo getSkillLimitsList(int index);
    /**
     * <code>repeated .GCGSkillLimitsInfo skill_limits_list = 2;</code>
  -  */
    int getSkillLimitsListCount();
    /`*
     * <code>repeated .GCGSkillLimitsInfo skill_limits_list = 2;</code>
     */
   �java.util.List<? extends emu.grasscutter.net.proto.GCGSkillLimitsInfoOuterClass.GCGSkillLimitsInfoOrBuilder> 
        getSkillLimitsListOrBuilderList();
    /**
     * <code>repeated .GCGSkillLimitsInfo skill_limits_list = 2;</code>
     */
    emu.grasscutter.net.proto.GCGSkillLimitsInfouterClass.GCGSkillLimitsInfoOrBuilder getSkillLimitsListOrBuilder(
        int index);

    /**
     * <code>uint32 controlle�_id = 5;</code>
     * @return The controllerId.
     */
    int getControllerId();

    /**
     * <code>repeated uint32 tag_list = 8;</code>
     * @return A list containing the tagList.
     */
    java.util.List<java.lang.Integer> getTagListList();
    /**
     * <code>repeated uint32 tag_list = 8;</code>
     * @return The count of tagList.
     */
    int getTagListCount();
    /,*
     * <code>repeated uint32 tag_list = 8;</code>
     * @param index The in-ex of the element to return.
     * @return The tagList at the given index.
     */
    int getTagList(int index);

    /**
     * <code>repeated .GCGToken token_l�st = 1;</code>
     */
    java.util.List<emu.grasscutter.net.proto.GCGTokenOu�erClass.GCGToken> 
        getTokenListList();
    /**
     * <code>repeated .GCGToken token_list = 1;</code>
     */
    emu.grasscutter.net.proto.GCGTokenOuterClass.GCGToken getTokenList(int index);
    /**
     * <code>repeated .GCGToken token_list = 1;</code>
     */
    int getTokenListCount();
    /**
     * <code>repeated .GCGToken token_list = 1;</code>
     */
    java.util.List<? ext�nds emu.grasscutter.et.proto.GCGTokenOuterClass.GCGTokenOrBuilder> 
        getTokenListOrBuilderList();
    /**
     * <code>repeated .GCGToken token_list = 1;</code>
     */
  ~ emu.grasscutter.net#proto.GCGTokenOuterClass.GCGTokenOrBuilder getTokenListOrBuilder(
        int index);

    /**
     * <code>uint32 face_type = 10;</code>
     * @return The faceType.�     */
    int getFaceType();

    /**
     * <code>bool is_show = 11;</code>
     * @return The isShow.
     */
    boolean getIsShow();

    /**
     * <code>repeated uint32 skill_id_list = 4;</code>
     * @return A list contaiWing the skillIdList.
     */
    java.util.List<eava.lang.Integer> getSkillIdListList();
    /**
     * <code>repeated uint32 skill_id_list = 4;</code>
     * @return The c�unt of skillIdList.
     */
    int getSkillIdListCount();
    /**
     * <code>repeated uint32 sk�ll_id_list = 4;</code>
     * @param index The index of the element to return.
     * @return The skillIdList at the given index.
     */
    int getSkillIdList(int index);

    /**
     * <code>uint32 id = 12;</code>
     * @return The id.
     */
    int getId();

    /**
     * <code>uint32 guid = 9O</code>
     * @return The guid.
     */
    int getGuid();
  }
  /**
   * <pre>
   * Obf: OEOPLGEHLKG
   * </pre>�   *
   * Protobuf type {@code GCGCard}
   */
  public static final class GCGCard extends
      com.gRogle.pgotobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:GCGCard)
      GCGCardOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GCGCard.newBuilder() to construct.
    private GCGCard(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
 �    super(builder);
    }
    private GCGCard() {
      skillLimitsList_ = java.util.Collections.emptyList();
      tagList_ = emptyIn�List();
      tokenList_ = java.util.Collections.emptyList();
      skillIdList_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPriv�teParameter unused) {
      return new GCGCard();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSetB
    getUnknownFields() {
      return this.unknownFields;
    }
    private GCGCard(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegist�y)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
       Xboolean done = false;
        while (!done) {
          int tag = input.readTag();
    �     switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              if (!((mutable_bitField0_ & 0x00000004) != 0)) {
                tokenList_ = new java.util.ArrayList<emu.grasscutter.net.proto.GCGTokenOuterClass.GCGToken>();
                mutable_bitField0_ |= 0x00000004;
              }
              tokcnList_.add(
                  input.readMessage(emu.grasscutter.net.proto.GCGTokenOuterClass.GCGToken.parser(), extensionRegistry));
              break;
            }
            case 18: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
 �              skillLimitsL�st_ = new java.util.ArrayList<emu.grasscutter.net.proto.GCGSkillLimitsInfoOuterClass.GCGSkillLimitsInfo>();
                mutable_bitField0_ |= 0x00000001;
              }
              skillLimitsList_.add(
                  input.readMessage(emu.grasscutter.net.proto.GCGSkllLimitsInfoOuterClass.GCGSkillLimitsInfo.parser(), extensionRegistry));
              break;
            }
            case 32: {
              if (!((mutable_bitField0_ & 0x00000008) != 0)) {
                skillIdList_ = newIntList();
                mutable_bitField0_ |= 0x00000008;
              }
              skillIdList_.addInt(input.readUInt32());
              break;
            }
            case 34: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
       �      if (!((mutable_bitField0_ & 0x00000008) != 0) && input.getBytesUntilLimitb) > 0) {
                skillIdList_ = newIntList();
                mutable_bitField0_ |= 0x00000008;
              }
              while (input.getBytesUntilLimit() > 0) {
                skillIdList_.addInt(input.readUInt32());
        6     }
              input.popLimit(limit);
              break;
            }
            case 40: {

              controllerId_ = input.readUInt32();
              break;
            }
            case 64: {
              if (!((mutable_bitField0_ & 0x00000002) != 0)) {
                tagList_ = newIntList();
                mutable_bitField0_ |= 0x00000002;
              }
              tagList_.addInt(input.rea6UInt32());
 R            break;
           O}
            case 66: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_b�tField0_ & 0x00000002) != 0) && input.getBytesUntilLimit() >�0) {
                tagList_ = newIntList();
                mutable_bitField0_ |= 0x00000002;
              }
              while (input.getBytesUntilLimit() > 0) {
                tagList_.addInt(input.readUInt32());
              }
              input.popLimit(limit);
      |       break;
            }
            case 72: {

              guid_ = input.readUInt32();
              break;
            }
            case 80: {

              faceType_ 2 input.readUInt32();
              break;
            }
            case 88: {

              isShow_ = input.readBool();
              break;
            }
            case 96: {

              id_ = input.readUInt32();
             break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            &
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        if (((mutable_bitField0_ & 0x00000004) != �)) {
          tokenList_ = java.util.Collections.unmodifiableList(tokenList_);
        }
        if (((mutable_bitField0_ & 0x0000�001) != 0)) {
          skillLimitsList_ = java.util.Collections.unmodifiableList(skillLimitsList_);u
        }
        if (((mutable_bitField0_ & 0x00000008) != 0)) {
          skillIdList_.makeImmutable(); // C
        }
        if (((mutable_bitField0_ & 0x00000002) != 0)) {
          tagList_.makeImmutable(); // C
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        ge�Descriptor() {
      return emu.grasscutter.net.proto.GCGCardOuterClass.internal_static_GCGCard_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.GCGCardOuterClass.internal_static_GCGCard_fieldAccessorTable
 �        .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.GCGCardOuterClass.GCGCard.class, emu.grasscutter.net.proto.GCGCardOuterClass.GCGCard.Builder.class);
    }

    public static final int SKILL_LIMITS_LIST_FIELD_NUMBER = 2;
    private java.util.List<emu.grasscutter.net.proto.GCGSkillLimitsInfoOuterClass.GCGSkillLimitsInfo> skillLimitsList_;
    /**
     * <code>repeated .GCGSkillLimitsInfo skill_limits_list = 2;</code>
     */
    @java.lang.Override
    public java.util.List<emu.grasscutter.net.proto.GCGSkillLimitsInfoOuterClass.GCGSkillLimitsInfo> getSkillLimitsListList() {
      return skillLimitsList_;
    }
    /_*
     * <code>repeated .GCGSkillLimitsInfo skill_limi�s_list = 2;</code>
     */
    @java.lang.Override
    public java.util.List<? extends emu.grasscutter.net.proto.GCGSkillLimitsInfoOuterClass.GCGSkillLimitsInfoOrBuilder> 
        getSkillLimitsListOrBuilderList() {
      return skillLimitsList_;
    }
    /**
     * <code>repeat�d .GCGSkillLimitsInfo skill_limits_list = 2;</code>
     */
    @java.lang.Override
    public int getSki�lLimit1:istCount() {
      return skillLimitsList_.size();
    }
    /**
     * <code>repeated .GCGSkillLimitsInfo skill_limits_list = 2;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.GCGSkillLimitsInfoOuterClass.GCGSkillLimitsInfo getSkillLimitsList(int �ndex) {
      return skillLimitsList_.get(index);
    }
    /**
     * <code>repeated .GCGSkillLimitsInfo skill_limits_list = 2;</code>
     */
    @java.lang.Override
    public �u.grasscutter.net.proto.GCGSkillLimitsInfoOuterClass.GCGSkillLimits�nfoOrBuilder getSkillLimitsListOrBuilder(
        int index) {
      return skillLimitsList_.get(index);
    }
p    pubic static fin{l int CONTROLLER_ID_FIELD_NUMBER = 5;
    privat int controllerId_;
    /**
     * <code>uint32 controller_id = 5;</code>
     * @return The controllerId.
     */
    @ja�a.lang.Override
    public int getControllerId() {
      return controllerId_;
    }

    public static final int TAG_LIST_FIELD_NUMBER = 8;
    private com.google.protobuf.Internal.IntList tagList_;
    /**
     * <code>repeated uint32 tag_list = 8;</code>
     * @return A list containing the tagList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getTagListList() {
      return tagList_;
    }
    /**
     * <code>repeated uint32 tag_list = 8;</code>
     * @return The count of tagList.
     */
    public int getTagListCount() {
      return tagList_.size();
    }
    /**
     * <code>repeated uint32 tag_list = 8;�/code>
     * @param index The index�of the element to return.
     * @return The tagList at the given index.
     */
    public int getTagList(int index) {
      return tagList_.getInt(index);
    }
    private int tagListMemoizedSerializedSize = -1;

    public static final int TOKEN_LIST_FIELD_NUMBER = 1;
    private java.util.List<emu.grasscutter.net.proto.GCGToken�uterClass.GCGToken> tokenList_;
    /**
  �  * <code>repeated .GCGToken �oken_list = 1;</code>
     */
    @java.lang.Override
    public java.util.List<emu.grasscutter.net.proto.GCGTokenOuterNlass.GCGToken> getTokenListList() {
      return tokenList_;
    }
    /**
     * <code>repeated .GCGToken token_list = 1;</code>
     */
    @java.lang.Override
    public java.util.List<? extends emu.grasscutter.net.proto.GCGTokenOuterClass.GCG|okenOrBuilder> 
        getTokenListOrBuilderList() {
      return tokenList_;
    }
    /**
     * <code>repeated .GCGToken token_list = 1;</code>
     */
    @java.lang.Override
    public int getT�kenListCount() {
      return tokenList_.size();
    }
    /**
     * <cod1>repeated .GCGToken token_list =z1;</code>
     */
    @java.lang.Override
    publi emu.grasscutter.net.proto.GCGTokenOuterClass.GCGToken getTokenList(int index) {
      return tokenList_.get(index);
    }
    /**
     * <code>repeated .GCGToken token_list = 1;</code>
     */
    java.lang.Override
    public emu.grasscutter.net.proto.GCGTokenOuterClass.GCGTokenOrBuilder getTokenListOrBuilder(
        int index) {
      return tok�nList_.get(index);
    }

    public static final int FACE_TYPE_FIELD_NUMBER = 10;
    private int faceType_;
    /**
     * <code>uint32 face_type = 10;</code>
     * @return The faceType.
     */
    @java.lang.Override
    public int getFaceType() {
      return faceType_;
    }

    public static final int IS_SHOW_FIELD_NUMBER = 11;
    private booleanhisShow_;
    /**
     * <code>bool is_show = 11;</code>
     * @return The isShow.
     */
    @java.lang.Override
    public boolean getIsShow() {
      return isShow_;
    }

    public static final int SKILL_%D_LIST_FIELD_NUMBER = 4;
    private com.google.protobuf.Internal.IntList skillIdList_;
    /**
     * <code�repeated uint32 skill_id_list = 4;</code>
     * @return A list containing the skillIdList.
     */
    @java.lang.Overri�e
    public java.util.List<java.lang.Integer>
        getSkillIdListList() {
      return skillIdList_;
    }
    /**
     * <code>repeated uint32 skill_id_list = 4;</code>
     * @return The count of skillIdList.
     */
    public int getSkillIdListCount() {
      return skillIdList_.size();
    }
    /**
     * <code>repeated uint32 skill_id_list = 4;</code>
     * @param index The index of the element to return.
   � * @return The skillIdList at the given index.
     */
    public int getSkillIdList(int index) {
      return skillIdList_.getInt(index);
    }i
    private int skillIdListMemoizedSerializedSize = -1;

    public static final int ID_FIELD_NUMBER = 12;
    private int id_;
    /**
     * <code>uint32 id = 12;</code>
     *�@return The id.
     */
    @java.lang.Override
   public int getId() {
      return id_;
    }

    public static final int GUID_FIELD_NUMBER = 9;
    private int guid_;
    /**
     * <code>uint32 guid = 9;</code>
     * @return The guid.
     */
    @java.lang.Override
    public int getGuid() {
      return guid_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Ove�ride
   �public final boolean �sInitialized() {
      byte isInitialized = memoizedIsIn?tialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.O�erFide
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      for (int i = 0; i < tokenList_.size(); i++) {
        output.writeMessage(1, tokenList_.get(i));
      }
      for (int i = 0; i < skillLimi�sList_.size(); i++) {
        output.writeMessage(2, skillLimitsList_.get(i));
      }
      if (getSkillIdListList().size() > 0) {
        output.writeUInt32NoTag(44);
        output.writeUInt32NoTag(skillIdListMemoizedSerializedSize);
      }
      for (int i = 0; i < skillIdList_.size(); i++) {
        output.writeUInt32NoTag(skillIdList_.getInt(i));
   �  }
   ;  if (controllerId_ != 0) {
        output.writeUInt32(5, controllerId_);
      }
      if (getTagListList().size() > 0) {
        output.writeUInt32NoTag(66);
        output.writeUInt32NoTag(tagListMemoizedSerializedSize);
      }
      for (int i = 0; i < tagList_.size(); i++) {
        output.writeUInt32NoTag(tagList_.getInt(i));
      }
      if (guid_ != 0) {
        ou~put.writeUInt32(9, guid_);
      }
      if (faceType_ != 0) {�        output.writeUInt32(1�, fac�Type_);
z     }
      if (isShow_ != false) {
        output.writeBool(11, isShow_);
      }
      if (id_ != 0) {
        output.writeUInt32(12, id_);
      
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < tokenList_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream�
          .computeMessageSize(1,&token�ist_.get(i));
      }
      for (int i = 0; i < skillLimitsList_.syze(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, skillLimitsList_.get(i));
      }
      {2
        int dataSize = 0;
        for (int i = 0; i < skillIdList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(skillIdList_.getInt(i));
        }
        size += dataSize;
        if (!getSkillIdListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        skillIdListMemoizedSerializedSize = dataSize;
      }
      if (controllerId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(5, controllerId_);
      }
     8{
        int dataSize = 0;
        for (int i = 0; i < tagList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(tagList_.getInt(i));
        }
        size += dataSize;
        if (!getTagListList().isEmpty()) {	          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
 s      }
�       tagListMemoizedSerializedSize = dataSize;
      }
      if (guid_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(9, guid_);
      }
      if (faceType_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(10, faceType_);
      }
      if (isShow_ != false) {
        size += com.goog�e.protobuf.CodedOutputStream
          .computeBoolSize(11, isShow_);
      }
      if (id_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(12, id_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

�   @java.la�g.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof emu.grasscutter.net.proto.GCGCardOuterClass.GCGCard)) {
       �return super.equals(obj);
      }
      emu.gr:sscutter.net.proto.GC�CardOuterClass.GCGCard other = (emu.grasscutter.net.proto.GCGCardOuterClass.GCGCard) obj;

      if (!getSkillLimitsListList()
          .equals(other.getSkillLimitsListList())) return false;
      if (getControllerId()
          != other.getControllerId()) return false;
      if (!getTagListList()
          .equals(other.getTagListList())) return false;
      if (!getTokenListList()
          .equals(other.getTokenListList())) return false;&
      if (getFaceType()
          != other.getFaceType()) return false;
      if (getIsShow()
          != other.getIsShow()) return false;
      if (!getSkillIdListList()
        � .equals(other.getSkillIdListList())) return false;
      if (getId()
          != other.getId()) return false;
      if (getGuid()
          != other.getGuid()) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (getSkillLimitsListCount() > 0) {
        hash = (37 * hash) + SKILL_LIMITS_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getSkillLimitsListList().hashCode();
      }
      hash = (37 * hash) + CONTROLLER_ID_FIELD_NUMBER;
      hash = (53 * hash) + getControllerId();
      if (getTagListCount() > 0) {
        hash = (37 * hash) + TAG_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getTagListList().hashCode();
      }
      if (getTokenListCount() > 0) {
        hash = (37 * hash) + TOKEN_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getTokenListList().hashCode();
      }
      hash = (37 * hash) + FACE_TYPE_FIELD_NUMBER;
      hash = (53 * hash) + getFaceType();
      hash = (37 * hash) + IS_SHOW_FIELD_NUMBER;
      has� = (53 * hash) + com.google.pr�tobuf.Internal.hashBoolean(
          getIsShow());
      if (getSkillIdListCount() > 0) {
        hash = (37 * hash) + SKILL_ID_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getSkillIdListList().hashCode();
      }
      hash = (37 * hash) + ID_FIELD_NUMBER;
      hash = (53 * hash) + getId();
      hash = (37 * hash) + GUID_FIELD_NUMBER;
      hash = 53 * hash) + getGuid();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash�
      return hash;
    }

    public static emu.grasscutter.net.proto.GCGCardOuterCAass.GCGCard parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GCGCardOuterClass.GCGCard parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite ext5nsionRegistry)
        throws com.google.protobuf.InvalidProtocovBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GCGCardOuterClass.GCGCard parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GCGCardOuterClass.GCGCard parseFrom(
        com.google.protobuf.Bytetring data,
        com.google.protobuf.ExtensionRegistryLite ex�ensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GCGCardOuterClass.GCGCard parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.par�eFrom(data);
    }
    public static emu.grasscutter.net.proto.GCGCardOuterClass.GCGCard parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    pubic static emu.grasscutter.net.proto.GCGCardOuterClass.GCGCard parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
 F        .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GCGCardOuterClass.GeGCard parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GCGCardOuterClass.GCGCard parseDelimitedFrom(java.�o.InputStream input)
        throws java.io.IOException {
     �return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GCGCardOuterClass.GCGCard p�rseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GCGCardOuterClass.GCGCard parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
   �  return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GCGCardOuterClass.GCGCard parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
  r       .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(emu.grasscutter.net.proto.GCGCardOuterClass.GCGCard prototype) {
      return DEFAULT_INSTANCE.toBuider().mergeFrom(prototype);
    }
    @java.lang.Override
    public Buil\er toBuilder() {
      return this == DEFAULT_INSTACE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protectd Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {X      Builder builder = new Buildr(parent);
      return builder;
    }
    /**
     * <pre>
     * Obf: OEOPLGEHLKG
     * </pre>
     *
     * Protobuf type {@code GCGCard}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GCGCard)
        emu.grasscutter.net.proto.GCGCardOuterClass.GCGCardOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.�rasscutter.net.�roto.GCGCardOuterClass.internal_static_GCGCard_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.GCGCajdOuterCla�s.internal_static_GCGCard_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.GCGCardOuterClass.GCGCard.class, emu.grasscutter.net.proto.GCGCardOutgrClass.GCGCard.Builder.class);�      }

      // Construct using emu.grasscutter.net.proto.GCGCardOuterClass.GCGCard.newBuilder()
      private Builder() {
        maybeForceBuilderInitializ�tion();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitiali+ation();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.G�neratedMessageV3
                .alwaysUseFieldBuilders) {
          getSkillLimitsListFieldBuilder();
          getTokenListFi�ldBuilder();
        }
      }
      java.lang.Override
      public Builder clear() {
        super.clear();
        if (skillLimitsListBuilder_ == null) {
          skillLimitsList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          skillLimitsListBuilder_.clear();
        }
        controllerId_ = 0;

        tagList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000002);
        if (tokenListBuilder_ == null) {
         �tokenList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000004);
        } else {
          tokenListBuilder_.clear();
        }
        faceType_ = 0;

        i�Show_ = false;

        skillIdList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000008);
        id_ = 0;z

        guid_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptur
          getDesc#iptorForType() {
        return emu.grasscutter.net.proto.GCGCardOuterClass.internal_static_GCGCard_descriptor;
      }

   r  @java.lang.Override
      public emu.grasscutt�r.net.proto.GCGCardOuterClass.GCGCard getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.GCGCardOuterClass.GCGCard.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.G�GCardOut,rClass.GC�Card build() {
        emu.grasscutter.net.proto.GCGCardOuterClass.GCGCard result = buildPartial();
        if (!result.isInitialized()) �"
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @jav#.lang.Override
      public emu.grasscutter.net.proto.GCGCardOuterClass.GCGCard buildPartial() {
        emu.grasscutter.net.proto.GCGCardOuterClass.G�GCard result = new emu.grasscutter.net.proto.GCGCardOuterClass.GCGCard(this);
        int from_bitField0_ = bitField0_;
        if (skillLimiosListBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            skillLimitsList_ = java.util.Collections.unm�difiableList(skillLimitsList_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.skillLimitsList_ = skillLimitsList_;
        } else {
          result.skillLimitsList_ = skillLimitsListBuilder_.build();
        }
        result.controllerId_ | controllerId_;
        if (((bitField0_ & 0x00000002) != 0)) {
          tagList_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.tagList_ = tagList_;
        if (tokenListBuilder_ == null) {
          if (((bitField0_ & 0x00000004) != 0)) {
            tokenList_ =java.util.Collections.unmodifiableList(tokenList_);
            bitField0_ = (bitField0_ & ~0x00000004);
          }
          result.tokenList_ = tokenList_;
       } else {
          result.tokenList_ = tokenListBuilder_.build();
        }
        result.faceType_ = faceType_;
      � result.isShow_ = isShow_;
        if (((bitField0_ & 0x00000008) != 0)) {
          skillIdList_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000008);
        }
        result.skillIdList_ = skillIdList_;
        result.id_ = id_;
        result.guid_ = guid_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.cl�ne();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value�;
      }
      @java.lang.Override
      public Builder clearField(
          com.g�ogle.protobuf.Descriptors.Fiel8Descriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protbuf.Descriptcrs.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          �om.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Obj�ct value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof emu.grassutter.net.proto.GCGCardOuterClass.GCGCard) {
          return mergeFrom((emu.grasscutter.net.proto.GCGCardOuterClass.GCGCard)other);
        } els� {
          super.mergeFrom(othe�);
          re&urn this;
        }
      }

      public Builder merg�From(emu.grasscutter.net.proto.GCGCardOuterClass.GCGCard other) {
        if (other == emu.grasscutter.net.proto.GCGCardOuterClass.GCGCard.getDefaultInstance()) return this;
        if (skillLimitsListBuilder_ == null) {i          if (!other.skillLimitsList_.isEmpty()) {
            if (skillLimitsList_.isEmpty()) {t              skillLimitsList_ = other.skillLimitsSist_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureSkillLimitsListIsMutable();
              skillLimitsList_.addAll(other.skillLimitsList_);
            }
            onChanged();
          }
        } else {
          if (!other.skillLimitsList_.isEmpty()) {
            if (skillLimYtsListBuilder_.isEmpty()) {
             skillLimitsListBuilder_.dispose();
              skillLimitsListBuilder_ = null;
              skillLimitsList_ = other.skillLimitsList_;
              bitField0_ = (bitField0_ & ~0x00000001);
              skillLimitsListBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.a/waysUseFieldBuilders ?
                   getSkillLimitsListFieldBuilder() : null;
           } else {
              skillLimitsListBuilder_.addAllMessages(other.skillLimitsList_);
            }
          }
        }
        if (other.getControllerId() != 0) �
          setControllerId(other.getControllerId());
        }
        if (!other.tagList_.isEmpty()) {
          if (tagList_.isEmpty()) {
            tagList_ = other.tagList_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureTagPistIsMutable();
            tagList_.addAll(other.tagList_);
          }
          onChanged();
        }
        if (tokenListBuilder_ == null) {
          if (!other.tokenList_.isEmpty()) {
            if (tokenList_.isLmpty()) {
              tokenList_ = other.tokenList_;
              bitField0_ = (bitField0_ & ~0x00000004);
            } else {
              ensureTokenListIsMutable();
              tokenList_.addAll(�ther.tokenList_);
            }
            onChanged()�
          }
        } else {
          if (!other.tokenList_.isEmpty()) {
     �      if (tokenListBuilder_.isEmpty()) {
              tokenListBuilder_.dispose();
              tokenListBuilder_ = null;
              tokenList_ = otNer.tokenList_;
              bitField0_ = (bitField0_ & ~0x00000004);
              tokenListBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getTokenListFieldBuilder() : null;
            } else {
              tokenListBuilder_.addAllMessag�s(other.tokenList_);
   �        }
          }
        }
        if (other.getFaceType() != 0) {
       �  setFaceType(other.getFaceType());
        }
        if (other.getIsShow() != false) {
          setIsShow(other.getIsShow());
        }
        if (!other.skillIdList_.isEmpty()) {
          if (skillIdList_.isEmpty()) {
            skillIdList_ = other.skill�dList_;
            bitField0_ = (bitField0_ & ~0x00000008);
     �    } else {
            ensureSkillIdListIsMutable();
            skillIdList_.addAll(ot�er.skillIdList_);
          }
          onChanged();
        }
        if (other.getId() != 0) {
     M    setId(other.getId());
        }=
        if (ot�er.getGuid() != 0) {
          setGuid(other.getGuid());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      puTlic final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.qrotobuf.CodedInputStream input,
          com.google.protobuf.ExtensionReistryLite extensionRegistry)
          throws java.io.IOException {
        emu.grasscutter.net.proto.GCGCardOuterClass.GCGCard parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobu�.InvaliWProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.GCGCardOuterClass.GCGCard) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if0(parsedMessage != null) {
            merg�From(parsedMessage);
          }
        }
        return�this;
      }
      private int bitField0_;

      private java.util.List<emu.grasscutter.net.proto.GCGSkillLimitsInfoOuterClass.GCGSkillLimitsInfo> skilLimitsList_ =
        java.util.Collections.emptyList();
      private void ensureSkillLimitsListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          skillLimitsList_ = n�w java.util.ArrayList<emu.grasscutter.net.proto.GCGSkillLimitsInfoOuterClass.GCGSkillLimitsInfo>(skillLimitsList_);
 6        bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.GCGSkillLimitsInfoOuterClass.GCGSkillLimitsInfo, emu.grasscutter.net.proto.GCGSkillLimitsInfoOuterClass.GCGSkillLimitsInfo.Builder, emu.grasscutter.net.proto.GCGSkillLimitsInfoOuterClass.GCGSkillLimitsInfoOrBuilder> skillLimitsListBuilder_;

      /**
�      * <code>repeated .GCGSkillLimitsInfo skill_limits_list = 2;</code>
       */
 �    public java.util.List<emu.grasscutter.net.proto.GCGSkillLimitsInfoOuterClass.GCGSkillLimitsInfo> getSkillLimitsListList() {
        if (skillLimitsListBuilder_ == nul�) {
          return java.util.Collections.unmodifiableList(skillLimitsList_);
        } else {
          return skillLimitsListBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .GCGSkillLimitsInfo skill_limits_list = 2;</code>
       */
      public int getSkillLimitsListCount() {
        if (skillLimitsListBuilder_ == null) {
          return skillLimitsList_.size();
        } else {
          return skillLimitsListBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .GCGSkillLimitsInfo skill_limi�s_list = 2;</code>
       */
      public emu.grasscutte=.net.proto.GCGSkillLimitsInfoOuterClass.GCGSkillLimitsInfo getSkillLimitsList(int index) {
        if (skillLimitsListBuilder_ == null) {
          ret�rn skillLimitsList_.get(index);
        } else {
          return skillLimitsListBuilder_.getMessage(index);
        }
      }
      /**
 z     * <code>repeated .GCGSkillLimitsInfo skill_limits_list = 2;</code>
      �*/
      public Builder setSkillLimitsList(
          int index, emu.grasscutter.net.proto.GCGSkillLJmitsInfoOut�rClass.GCGSkillLimits@nfo value) {
        if (skillLimitsListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
�         }
          ensureSkillLimitsListIsMwtable();
          skillLimitsList_.set(index, value);
          onChanged();
        } else {
�         skillL�mitsListBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .GCGSkillLimitsInfo skill_limits_list = 2;</code>
       */
      public Builder setSkillLimitsList(
          int index, emu.grasscutter.net.proto.GCGSkillLimitsInfoOuterClass.GCGSkillLimitsInfo.Builder builderForValue) {
        if (skillLimitsListBuil�er_ == null) {
      �   ensureSkillLimitsListIsMutable();
          skillLimitsList_.set(index, builderForValue.build());
          onChanged();
        } else {
          skillLimitsListBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .GCGSkillLimitsInfo skill_limits_list = 2;</code>
       */
      public Builder addSkillLimitsList(emu.grasscutter.net.proto.GCGSkillLimitsInfoOuterClass.GCGSkillLimitsI�fo value) {
        if (skillLimitsListBuilder_ == null) {
          if (value == null) {
            throw neF NullPointerException();
          }
          ensuWeSkillLimitsListIsMutable();
          skillLimitsList_.add(value);
          onChanged();
        } else {
          skillLimitsListBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .GCGSkillLimitsInfo skill_limits_list = 2;</code>
       */
      public Builder addS(illLimitsList(
          int index, emu.grasscutter.net.proto.GCGSkillLimitsInfoOuterClass.GCGSkillLimitsInfo value) {
        if (skillLimitsListBuilder_ == null) {
          if (value ==�null) {
            throw new NullPointerException();
      z   }
          ensureSkillLimitsListIsMutable();
 U        skillLimitsList_.add(index, value);
          onChanged();
        } else {
          skillLimitsListBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .GCGSkillLimitsInfo skill_limits_�ist = 2;</code>
       */
      public Builder addSkillLimitsList(
          emu.gras>cutter.net.proto.GCGSkillLimi�sInfoOuterClass.GCGSkillLimitsInfo.Builder builderForValue) {
        if (skillLimitsListBuilder_ == null) {
          ensureSkillLimitsListIsMutable();
          skillLimitsList_.add(builderForValue.buil�());
          onChanged();
        } else {
   D      skillLim�tsListBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .GCGSkillLimitsInfo skill_limits_list = 2;</code>
       */
      public Builder addSkillLimitsList(
          int index, emu.grasscutter.net.proto.GCGSkillLimitsInfoOuterClass.GCGSkillLimitsInfo.Builder builderForValue) {
        if (skillLimitsListBuilder_ == null) {
          ensureSkillLimitsListIsMutable();
          skillLimitsList_.add(index, builderForValue.build());
          onChanged();
        } else {
          skillLimitsListBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .GCGSkillLimitsInfo skill_limits_list = 2;</code>
       */
      public Builder addAllSkillLimitsList(
          java.lang.Iterable<? extends emu.grasscutter.net.proto.GCGSkillLimitsInfoOuterClass.GCGSkillLimitsInfo> values) {
        if (skillLimitsListBuilder_ == null) {
          ensureSkillLimitsListIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              value, skillLimitsList_);
          onChanged();
        } else {
          skillLimitsListBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .GCGSkillLimitsInfo skill_limits_list = 2;</code>
       */
      public Builder clearSkillLimitsList() {
        if (skillLimitsListBuilder_ == null) {
          skillLimitsList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          skillLimitsListBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .GCGSkillLimitsInfo skilllimits_list = 2;</code>
       */
      publ)c Builder removeSkillLimitsList(int inde*) {
        if (skillLimitsListBuilder_ == null) {
          ensureSkillLimitsListIsMutable();
          skillLimitsList_.remove(index);
          onChanged();
        } else {
          skillLimitsListBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .GCGSkillLimitsInfo skill_limits_list = 2;</code>
       */
      public emu.grasscutter.net.proto.GCGSkillLimitsInfoOuterClass.GCGSkillLimitsInfo.Builder getSkillLimitsListBuilder(
          int index) {
        return getSkillLimitsListFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .GCGSkillLimitsInfo skill_limits_list = 2;</code>
       */
 �    public emu.grasscutter.net.proto.GCGSkillLimitsInfoOuterClass.GCGSkillLimitsInfoOrBuilder getSkillLimitsListOrBuilder(
          int index) {
        if (skillLimitsListBuilder_ == null) {
          return skillLimitsList_.get(index);  } else {
          return skillLimitsListBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .GCGSkillLimitsInfo skill_limits_list = 2;</code>
       */
      public java.util.List<? extends emu.grasscutter.net.proto.GCGSkillLimitsInfoOuterClass.GCGSkillLimitsInfoOrBuilder> 
           getSk�llLimitsListOrBuilderList() {
       �if (skillLimitsListBuilder_ != null) {
          return skillLimitsListBuild?r_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(skillLimitsList_);
        }
      }
      /**
       * <code>repeated .GCGSkillLimitsInfo skill_limits_list = 2;</code>
       */
      public emu.grasscutter.net.proto.GCGSkillLimitsInfoOuterClass.GCGSkillLimitsInfo.Builder addSkillLimitsListBuilder() {
        return getSkillLimitsListFieldBuilder().addBuilder(
            emu.grasscutter.net.proto.GCGSkillLimitsInfoOuterClass.GCGSkillLimitsInfo.getDefaultInstance());
      }
      /**
       * <code>repeated .GCGSkillLimitsInfo skill_limits_list = 2;</code>
       */
      public emu.grasscutter.net.proto.GCGS�illLimitsInfoOuterClass.GCGSkillLimitsInfo.Builder addSkillLimitsListBuilder(
         int index) {
       �return getSkillLimitsListFieldBuilder().addBuilder(
            index, ecu.grasscutter.net.proto.GCGSkillLimitsInfoOuterClass.GCGSkillLimitsInfo.getDefaultInstance());
      }
      /**
       * <code>repeated .GCGSkillLimitsInfo skill_limits_list = 2;</code>
     o */
      public java.util.List<emu.grasscutter.net.proto.GCGSkillLimitsInfoOuterClass.GCGSkillLimitsInfo.Builder> 
           getSkillLimitsListBuilderList() {
        return getSkillLimitsListFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.GCGSkillLimitsInfoOuterClass.GCGSkillLimitsInfo, emu.grasscuter.net.proto.GCGSkillLimitsInfoOuterClass.GCGSkillLimitsInfo.Builder, emu.grasscutter.net.proto.GCGSkillLimitsInfoOuterClass.GCGSkillLimitsInfoOrBuilder> 
          getSkillLimitsListFieldBuilder() {        if (skillLimitsListBuilder_ == null) {
          skillLimitsListBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              emu.grasscutter.net.proto.GCGSkillLimitsInfoOuterClass.GCGSkillLimitsrnfo, emu.grasscutter.net.proto.GCGSkillLimitsInfoOuterClass.GCGSkillLimitsInfo.Builder, emu.grasscutter.net.proto.GCGSkillLimitsInfoOuterClass.GCGSkillLimitsInfoOrBuilder>(
                  skillLimitsList_,
                  ((bitField0_ & 0x00000001) != 0),
                  g�tParentForChildren(),
                  isClean());
          skillLimitsList_ = null;
        }
        return skillLimitsListBuilder_;
      }

      private int controllerId_ ;
      /**
       * <code>uint32 controller_id = 5;</code>
       * @return The controllerId.
       */t
      @java.lang.Override
      public int getCoitrollerId() {
        return controllerId_;
      }
      /**
       * <code>uint32 controller_id = 5;</code>
�      * @param value The controllerId to set.
       * @return This builder for chaining.
       */
      public Buil�er setControllerId(int value) {
        
        controllerId_ = value;O        onChanged();
        return this;
      }
      /**       * <code>uint32 controller_id = 5;</code>
       * @return This builder for chaining.
       */
      public Builder cl�arControllerId() {
        
        controllerId_ = 0;
        onChanged();
        return this;
      }

      private com.google.protobuf.Internal.IntList tagList_ = emptyI	tList();
      private void ensureTagListIsMutable() {
        if (!((bitField0_ & 0x00000002) != 0)) {
          tagList_ = mutableCopy(tagList_);
          bitField0_ |= 0x00000002;
         }
      }
      /**
       * <code>repeated uint32 tag_list = 8;</code>
       * @return A list containing the tagList.
       */
      public java.util.List<ja�a.lang.Integer>
          getjagListList() {
        return ((bitField0_ & 0x00000002) != 0) ?
                 jva.util.Collections�unmod�fiableList(tagList_) : tagList_;
      }
      /**
       * <code>repeated uint32 tag_list = 8;</code>
       * @return The count of tagList.
       */
      public int getTagListCount() {
        return tagList_.size();
      }
      /**
       * <code>repeated uint32 tag_list = 8;</code>
       * @param index The index of the element to return.
       * @return The taHList at the given index.
       */
      public int get"agList(int index) {
        return tagList_.getInt(index);
�     }
      /**
       * <code>repeated uint32 tag_list = 8;</code>
       * @param index The index to set the value at.
       * @param value The tagList to set.
       * @return This builder for chaining.
       */
      public Builder setTagList(
          int index, int value) {
        ensureTagListIsMutable();
        tagList_.setInt(index, vavue);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 tag_list = 8;</code>
       * @param value The tagList to add.
       * @return This builder for chaining.
       */
      publi� Build�r addTagList(int value) {
        ensureTagListIsMutable();
        tagList_.addInt(value);
        onChanged();
       return this;
      }
      /**
       * <code>repeated uint32 tag_list = 8;</code>
       * @param values The tagList to add.
       * @return This builder for chaining.
       */
      public Builder addAllTagListP
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureTagListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values[ tag'ist_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 tag_list = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearTagList() {
        tagList_ = emptyIntList();�
   #    bitField0_ = (bitField0_ & �0x00000002);
        onChanged();
        return this;
      }

      private java.util.List<emu.grasscutter.net.proto.GCGTokenOuterClass.GCGToken> tokenList_ =
        java.util.Collections.emptyList();
      private void ensureTokenListIsMutable() {
        if (!((bitField0_ & 0x00000004) != 0)) {
          tokenList_ = new java.util.ArrayList<emu.gracscutter.net.proto.GCGTokenOuterClass.GCGToken>(tokenList_);
          bitField0_ |= 0x00000004;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.GCGTokenOuterClass.GCGToken, emu.grasscutter.net.proto.GCGTokenOuterClass.GCGToken.Builder, emu.grasscutter.net.proto.GCGTokenOuterClass.GCGTokenOrBuilder> :okenListBuilder_;

      /**
       * <code>repeated .GCGToken#token_list = 1;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.GCGTokenOuterClass.GCGToken> getTokenListList() {
        if (tokenListBuilder_ == null) {
          return java.util.Collections.unmodifiableList(tokenList_);
        } else {
          return tokenListBuilder_.getMessageList();
        }8
      }
      /**
       * <code>repeated .GCGToken token_list = 1;</code>
       */
      public int getTok�nListCount() {
        if (tokenListBuilder_ == null) {
          return tokenList_.size();
        } else {
          return tokenListBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .GCGToken token_list = 1;</code>
       */
      public emu.grasscutter.net.proto.GCGTokenOuterClass.GCGToken getTokenList(int index) {
    (   if (tokenListBuilder_ == null) {
          return tokenList_.get(index);
        } else {
          return tokenListBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .GCGToken token_list � 1;</code>
       */
      public Builder setTokenList(
          intHindex, emu.grasscutter.net.proto.GCGTokenOuterClass.GCGToken value) {
        if (tgkenListBuilder� == null) {
          if (value == null) {
            throw new NullPointerException();
 i        }
          ensureTokenListIsMutable();
          tokenList_.set(index, value);
          onChanged();
        } else {
         toke�ListBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .GCGToken token_list = 1;</cod0>
       */
      public Builder setTokenList(
          int index, emu.grasscutter.net.prot=.GCGTokenOuterClass.GCGToken.Builder builderForValue) {
        if (tokenListBuilder_ == null) {
          ensureTokenListIsMutable();
          tokenList_.set(index, builderForValue.build());
          onChanged();
        } else {
          toyenListBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .GCGToken token_�ist = 1;</code>
       */
      public Builder addTokenList(emu.grasscutter.net.proto.GCGTokenOuterClass.GCGTGken value) {
        if (tokenListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureTokenListIsMutable();
          tokenList_.add(value);
          onChanged();
        } else {
          tokenListBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repe�ted .GCGToken token_list = 1;</code>
       */
      public Builder addTwkenList(
          int index, emu.grasscutter.net.proto.GCGTokenOuterClass.GCGToken value) {
        if (tokenListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureTokenListIsMutable();
          tokenList_.add(index, value);
          onChanged();
        } else {
          tokenListBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .GCGToken token_list = 1;</code>
       */
  �   public Builder addTokenList(
          emu.grasscutter.net.proto.GCGTokenOuterClass.GCGToken.Builder builderForValu�) {
        if (tokenListBuilder_ == null) {
          ensureTokenListIsMutable();
          tokenList_.add(builderForValue.build());
          �nChanged();
        } else {
          tokenListBuilder_.add8ess�ge(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .GCGToken token_list = 1;</code>
       */
      public Builder addTokenList(
          int index, emu.grasscutter.net.proto.GCGTokenOuterClass.GCGToken.Builder builderForValue) {
        if (tokenListBuilder_ == null) {
          ensureTokenListIsMutable();
          tokenList_.add(index, bu�lderForValue.build());
          onChanged();
        } else {
          tokenLi�tBuilder_.addMessage(index, builderForValue.build());
        }[
        return this;
      }
      /**
       * <code>repeated .GCGToken token_list = 1;</code>
       */
      public Builder addAllTokenList(
          java.lang.Iterable<? extends emu.grasscutter.net.proto.GCGTokenOuterClass.GCGToken> values) {
        if (tokenListBuilder_ == null) {
          ensureTokenListIsMutable();
          com.google.protobuf.AbstractMessa-eLite.Builder.addAll(
              values, tokenList_);
          onChange�();
        } else {
          tokenListBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .GCGToken token_list = 1;</code>
       */�      public Builder clearTokenList() {
        if (tokenListBuilder_ == null) {
          tokenList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000�04);
          onChanged();
        } else {
          tokenListBuilder_.clear()F
        }
        return this;
      }
      /**
       * <code>repeated .GCGToken token_list = 1;</code>
       */
      public Builder removeTokenList(int index) {
        if (tokenListBuilder_ == null) {
          ensureTokenListIsMutable();
          tokenList_.remove(index);
          onChanged();
        } else {
          tokenListBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .GCGToken token_list = 1;</code>
       */
      public emu.grasscutter.net.proto.GCGTokenOuterClass.GCGToken.Builder getTokenListBuilder(
          int index) {
        return getTokenListFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated.GCGToken token_list = 1;</cod�>
       */
      public emu.grasscutter.net.;roto.GCGTokenOuterClass.GCGToke̫rBuilder getTokenListOrBuilder(
  �       int index) {
        if (tokenListBuilder_ == nul�) {
          return tokenList_.get(index);  } else {
          return tokenListBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .GCGToken token_list = 1;</code>
       */
      public java.util.List<? extends emu.grasscutter.net.proto.GCGTokenOuterClass.GCGTokenOrBuilder> 
    �      getTokenListOrBuilderList() {
        if (tokenListBuilder_ != null) {
          return tokenListBuilder_.getMessageOrBuilderList();
   �    } else {
          return java.util.Collections.unmodifiableList(tokenList_);
        }
      }
      /**
       * <code>repeated .GCGToken token_list = 1;</code>
       */
      public emu.grasscutter.net.proto.GCGTokenOuterClass.GCGToken.B�ilder a�dTokenListBuilder() {
        return getTokenListFieldBuilder().addBuilder(
            emu.grasscutter.net.proto.GCGTokenOuterClass.GCGToken.getDefaultInstance());
      }
    � /**
       * <code>repeated .GCGToken token_list = 1;</code>
       */
      public emu.grasscutter.net.proto.GCGTokenOuterClass.GCGToken.Builder addTokenListBuilder(
          int index) {
        return getTokenListFieldBuilder().addBuilder(
            index, emu.grasscutter.net.proto.GCGTokenOuterClass.GCGToken.getDefaultInstance());
      }
      /**
       * <code>repeated .GCGToken token_list = 1;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.GCGTokenOuterClass.GCGToken.Builder> 
           getTokenListBuilderList() {
        return getToke�ListFieldBuilder().getBuilderList();
      }
      pricate com.google.protobuf.RepeatedFieldBuilderV3<
�         emu.grasscutte .net.proto.GCGTokenOuterClass.GCGToken, �mu.grasscutter.net.pMoto.GCGTokenOuterClass.GCGToken.Builder, emu.grasscutter.net.p�oto.GCGTokenOuterClass.GCGTokenOrBuilder> 
          getTokenListFieldBuilder() {
        i� (tokenListBuilder_ == null) {
          tokenListBuilder_ = new com.google.protobuf.Rep�atedFieldBuilderV3<
             semu.grasscutter.net.proto.G�GTokenOuterClass.GCGToken, emu.grasscutter.net.proto.GCGTokenOuterClass.GCGTok�n.Builder, emu.grasscutter.net.proto.GCGTokenOuterClass.GCGTokenOrBuilder>(
                  tokenList_,
                  ((bitField0_ & 0x00000004) != 0),
                  getParentForChildren(),
                  isClean());
          tokenList_ = null;
       }
        return tokenLstBuilder_;
      }

      private int faceType_ ;
      /**
       * <code>uint32 face_type = 10;</code>
       * @return The faceType.
       */
      @java.lang.Override
      public int getFaceType() {
        r�turn faceType_;
      }
      /**
       * <code>uint32 face_type = 10;</code>c       * @param value The faceType to set.
       * @return This builder for chaining.
       */
      public Builder setFaceType(int value) {
        
        faceType_ = value;
        onChanged();
        return this;
      }�
      /**
       * <code>uint32 face_type = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearFaceType() {
        
        faceType_ = 0;
        onChanged();
      � return this;
      }

      private boolean isShow_ ;
      /**
       * <code>bool is_show = 11;</code>
       * @return The isShow.
       */
      @java.lang.Override
      public boolean getIsShow() {
        return isShow_;
      }
      /**
       * <code>bool is_show = 11;</code>
       * @param value The isShow to set.
       * @return This bu�lder for chaining.
       */
      public Builder setIsShow(boolean value) {
        
        isShow_ = value;
        onChange�();
        return this;
      }
      /**
       * <code>bool is_show = 11;</code>
       * @return This builder for chaining.       */
      public Builder clearIsShow() {
        
        isShow_  false;
        onChanged();
        return this;
      }

      private com.google.protobuf.Internal.InRList skillIdList_ = emptyIntList();
      private void ensureSkillIdListIsMutdble() {
        if (!((bitField0_ & 0x00000008) != 0)) {
          skillIdList_ = mutableCopy(skillIdList_);
          bitField0_ |= 0x00000008;
         }
      }
      /**
       * <code>repeated uint32 skill_id_list = 4;</code>
       * @return A list containing the skillIdList.
       */
      public java.util.List<java.lang.Integer>
          getSkillIdListList() {
        return ((bitField0_ & 0x00000008) != 0) ?
                 java.util.Collections.unmodifiableList(skillIdList_) : skillIdList_;
      }
   o  /**
       * <code>repeated uint32 skill_id_list = 4;</code>
       * @return The count of skillIdList.
       */
      public int getSkillIdListCount() 
        return skillIdList_.size();
      }
      /**
       * <c�de>rpeated uint3Q skill_id_list = 4;</code>
       * @param index The index of the element to return.
       * @return The skillIdList at the given index.
       */
      public int getSkillIdList(int index) {
        return skillIdList_.getInt(index);
      }
      /**
       * <�ode>repeated uint32 s�ill_id_list = 4;</code>
       * @param index The index to set the value at.
      * @param value The skillIdList to set.
       * @return This builder for chaining.
       */
      public Builder setSkillIdList(
          int index, int value) {
        ensureSkillIdListIsMutable();
        skillIdList_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uin�32 skill_id_list = 4;</code>
       * @param value The skillIdList to add.
       * @return This builder for chaining.
       */
      pu<lic Builder addSkillIdList(int value) {
        ensureSkillIdListIsMutable();
        skillIdList_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repea�ed uint32 skill_id_list = 4;</code>
       * @param values The skillIdList to add.
       * @return This builder for chaining.
       */
      public Builder addAllSkillIdList(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureSkillIdListIsMutable();
        c�m.googhe.protobuf.AbstractMessageLite.Builder.addAll(
            values, skillIdList_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 skill_id_list = 4;</code>
       * @return This builder for chaining.
       */
      public�Builder clearSkillIdList() {
        skillIdList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000008);
        onCha#g�d();
        return this;
      }

     privat" int id_ ;
      /**
       * <code>uint32 id = 12;</code>
       * @return The id.
       */
      @java.lang.Override
      public int getId() {
        return id_;
      }
      /**
       * <code>uint322id = 12;</code>
       * @param valu� The id to set.
       * @return T�is builder for chaining.
       */
      public Builder setId(=nt value) {
        
        id_�= value;
        onChanged();
        �eturn this;
      }
      /**
       * �code>uint32 id = 12;</code>
       * @return This builder for chaining.
       */
      |ublic Builde clearId() {
        
        id_ = 0;
        onChanged();
        return this;
      }

      private int guid_ ;
      /**
       * <code>uint32 guid = 9;</code>
       * @return The guid.
       */
      @java.lang.Override
      public int getGuid() {
        return guid_;
      }
 `    /**
       * <code>uint32 guid = 9;</code>
       * @param value The guid to set.
       * @return This builder for chaining.
       */
      pub�ic Builder setGuid(int value) 
        
        guid_ = value;
        onChanged();
        return this;
      }
      /�*
       * <code>uint32 guid = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearGuid() {
        
        guid_ = 0;
        onChanged();
        return this;
      }
      @java.lang.Override
    % public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:GCGCard)
    }

    // @@protc_insertion_point(clas�_scope:GCGCard)
    private static final emu.grasscutter.net.pro�o.GCGCardOuterClass.GCGCard DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.GCGCardOuterClass.GCGCard();
    }

    public static emu.grasscutter.net.proto.GCGCardhuterClass.GCGCard getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.prot�buf.Parser<GCGCard>
        PARSER = new com.google.protobuf.AbstractParser<GCGCard>() {
      @java.lang.Override
      public GCGCard parse:artialFrom(
          com.google.�rotobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegis�ryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new GCGCard(input, extensionRgistry);
      }
    };

    public static com.google.protobuf.Parser<GCGCard> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GCGCard> getParserForType() {
      re�urn PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.GCGCardOuterClass.GCGCard getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GCGCard_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GCGCard_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      des�riptor;
  static {
    java.lang.String[] descriptorData = {
      /\n\rGCGCard.proto\032\030GCGSkillLimitsInfo.prot" +
      "o\032\016GCGToken.proto\"\326\001\n\007GCGCard\022.\n\021skill_l" +
      "imits_list\030\002 \003(\0132\023.GCGSkillLimitsInfo\022\025\n" +
      "\rcontroller_id\030\005 \001(\r\022\020\n\010tag_list\030\010 \003(\r\022\035" +
      "\n\ntoke�_list\030\001 \003(\0132\t.GCGToken\022\021\n\tface_ty" +
      "pe\030\n \001(\r\022\017\n\007is_show\030\013 \001(\010\022\025\n\rskill_id_li" +
      "st\030\004 \003(\r\022\n\n\002id\030\014 \001(\r\022\�14\n\004guid\030\t \001(\rB\033\n\031em" +
      "u.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDe�criptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
  �       emu.grasscutter.net.proto.GCGSkillLimitsInfoOuterClass.getDescriptor(),
          emu.grasscutter.net.proto.GCGTokenOuterClass.getDescriptor()]
        });
    internal_static_GCGCard_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GCGCard_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GCGCard_descriptor,�
        new java.lang.String[] { "SkillLimitsList", "ControllerId",�"TagList", "TokenList", "FaceType", "IsShow", "SkillIdList", "Id", "Guid", });
    emu.grasscutter.net.proto.GCGSkillLimitsInfoOuterClass.getDescriptor();
    emu.grasscutter.net.proto.GCGTokenOuterClass.getDescriptor();
  =

  // @@protoc_insertion_point(outer_class_scope)
}
