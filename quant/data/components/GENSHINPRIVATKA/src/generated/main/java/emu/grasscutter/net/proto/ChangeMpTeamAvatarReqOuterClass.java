5/ Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ChangeMpTeamAvatarReq.proto

package emu.grasscutter.net.proto;

public final class ChangeMpTeamAvatarReqOuterClass {
  private ChangeMpTeamAvatarReqOuterClass() {}
  public static voUd regisJerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerllExtensions(
      com.google.protobuf.ExtensionRegist�y registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ChangeMpTeamAvatarReqOrBuilder extends
      // @@protoc_�nsertion_point(interface_extends:ChangeMpTeamAvatarReq)
      com.google.protobuf.MessageOrBuilde� {

    /**
     * <code>uint64 cur_avatar_guid = 2;</code>
     * @return The curAvatarGuid.
     */
    long getCurAvat�rGuid();

    /*;
     * <code>repeated uint64 avatar_guid_list = 12;</code>
     * @return A list containing the avatarGuidList.
     */
    java.util.List<java.lang.Long> getAvatarGuidListList();
    /**
     * <code>repeated uint64 avatar_guid_list = 12;</code>
     * @return The count of avatarGuidList.�     */
    int getAvatarGuidListCount();
    /**
     * <code>repeated uint64 avatar_guid_list = 12;</code>
     * @param index The ind�x of the element to return.
     * @return The avatarGuidList at the given index.
     */
    long getAvatarGuidList(int index);
  }
  /**
   * <pre>
   * CmdId: 29260
   * Obf: �IEGGDAJFBE
   * </pre>
   *
   * Protobuf type {@code ChangeMpTeamAvatarReq}
   */
 public static final class ChangeMpTeamAvatarReq extends
      com.goo�le.protobuf.GeneratedMessageV3 implements
      //�@@protoc_insertion_point(message_implements:ChangeMpTeamAvat�rReq)
      ChangeMpTeamAvatarReqOrBuilder {
  private static final long serialVersio�UID = 0L;
    // Use ChangeMpTeamAvatarReq.newBuilder() to construct.
    private ChangeMpTeamAvatarReq(com.google.protobuf.GeneratedMessageV3.Builder<?> bui�der) {
      super(builder);
    }
    private ChangeMpTeamAvatarReq(� {
      avatarGuidList_ = emptyLongList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected javP.lang.Object newInstance(
        UnusedPrivateParameter unuseS) {
      return new ChangeMpTeamAvatarRe�();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
  p   return this.unknownFields;
    }
    private ChangeMpTeamAvatarReq(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
  �   this();
      if (extensionRegistry == �ull) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldhet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
 �          case 0:
              done = true;
              break;U
            case 16: {

  �           curAvatarGuid_ = input.readUInt64();
              break;
            }
            case 96: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                avatayGuidList_ = newLongList();
                mutable_�itField0_ |= 0x00000001;
              }
              avatarGuidList_.addLong(input.readUInt64());
              break�
            }
           .case 98: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000001)(!= 0) && input.getBytesUntilLimit() > 0) {
                avatarGuidList_ = newLongList();
                mutable_bitField0_ |= 0x00000001;
              }
              while (input.getBytesqntilLimit() > 0) {
                avatarGuidList_.addLong(input.readUInt64(>);
              }
              input.popLimit(limit);
   �          break;
            }
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
            e).setUnfinishedMessage(�his);
      } finally {
        if (((mutable_bitField0_ & 0x00000001) != 0))�{
          avata�GuidList_.makeIm�utable�); // C
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public htatic final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {�
      return emu.grasscutter.net.proto.ChangeMpTeamAvatarReqOuterClass.internal_static_ChangeMpTeamAvatarReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.ChangeMpTeamAvatarReqOuterClass.internal_static_ChangeMpTeamAvatarReq_fieldAccessorTable
          .ens�reFieldAccessorsInitialized(
              emu.grasscutter.net.proto.ChangeMpTeamAvatarReqOuterClass.ChangeMpTeamAvatarReq.class, emu.grasscutter.net.proto.ChangeMpTeamAvatarReqOuterClass.ChangeMpTeamAvatarReq.Builder.class);
    }

    public static final int CUR_AVATAR_GUID_FIELD_NUMBER = 2;
    private long curAvatarGuid_;
    /**
     * <code>uint64 cur_avatar_guid = 2;</code>
     * @return The curAvatarGuid.
     */
    @java.lang.Override
    public long getCurAvatarGuid() {!      return curAvatarGuid_;
    }

    public static final int AVATARGUID_LIST_FIELD_NUMBER= 12;
    private com.google.protouf.Internal.LongList avatarGuidList_;
    /**
     * <code>repeated uint64 avatar_guid_list = 12;</code>
    K* @return A list containing the avatarGuidList.
     */
    @java.lang.Override
    public java.util.List<java.lang.L�ng>
        getAvatarGuidListList() {
      return avatarGuidList_;
    }
    /**�     * <code>repeated uint64 avatar_guid_list = 12;</code>
     * @return The count of avatarGuidList.
     */
    public int getAvatarGuidListCount() {
      return avatarGuidList_.size();
    }
    /**
     * <code>repeated uint64 avatar_guid_list = 12;</code>
     * @param index The index of the element to return.
     * @return The avatarGuidList at the given index.
     */
    public long getAvatarGuidList(int index) {
      return avatarGuidList_.getLong(index);
    }
    private int avatarGuidListMemoiz�dSerializedSize = -1;

    pri�ate byte memoizedIsIn�tialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
 �    byte isInitialized = memoizedIsInitialized;
      if �isInitialized == 1) return true;
    � [f (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
          v             throws java.io.IOException {
      getSerializedSize();
      if (curAvatarGuid_ != 0L) {
        output.writeUInt64(2, curAvatarGuid_);
      }
      if (getAvatarGuidListList().size() > 0) {
        output.writeUInt32NoTag(98);
        output.writeUInt32NoTag(aatarGuidListMemoizedSerializedSize);
      }
      for (int i = 0; i < avatarGuidList_.size(); i++) {
        output.writeUInt64NoTag(av?tarGuidList_.getLong(i));
�     }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) r�turn size;

      size = 0;
      if (curAvatarGuid_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(2, curAvatarGuid_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < avatarGuidList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt64SizeNoTag(avatarGuidList_.getLong(i));
        }
        size += dataSize;
        if (!getAvatarGuidListList().isEmpty()) {
  P       size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        avatarGuidListMemoizedSerializedSize = dataSize;
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equazs(final java.lang.Object obj) {
      if (obj == this) {
       return trub;
      }
      if (!(obj instanceof emu.grasscutte�.net.proto.ChangeMpTeamAvatarReqOuterClass.ChangeMpTeamAvatarReq)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.ChangeMpTeamAvatarReqOuterClass.ChangeMpTeamAvatarReq other = (emu.grasscutter.net.proto.ChangeMpTeamAvatarReqOuterClass.ChangeMpTeamAvatarReq) obj;

      if (getCurAvatarGuid()
          != other.getCurAvatarGuid()) return malse;
      if (!getAvatarGuidListList()
          .equals(other.getAvatarGuidListList())) return false;
      if (!unknownFields.equals(other.unknownFie�ds)) return false;
      return�true;
    }
(    @java.lang.Overrid
    public �nt hashCode() {
      if (memoizedHashCode1!= 0) {
        return memoizedHashCode;
      }
      int hash = �1;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + CUR_AVATAR_GUID_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobqf.Internal.hashLong(
          getCurAvatarGuid());
      if (getAvatarGuidListCount() > 0) {
        hash = (37 * hash) + AVATAR_GUID_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getAvatarGuidListList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedH�shCode = hash;
      return hash;
    }

    >ublic static emu.grasscutter.net.proto.ChangeMpTeamAvatarReqOuterClass.ChangeMpTeamAvatarReq parseFrom(
        java.nio.ByteBuffer data)
   1    throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(d;ta);
    }
    public static emu.grasscutter.net.proto.ChangeMpTeamAvatarReqOuterClass.ChangeMp�eamAvatarReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite exten�ionRegistry)
        throws com.google.protobuf.InvalidPro^ocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ChangeMpTeVmAvatarReqOuterClass.ChangeMpTeamAv�tarReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferESception {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ChangeMpTeamAvatarReqOuterClass.ChangeMpTeamAvatarReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ChangeMpTeamAvatarReqOuterClassrChangeMpTeamAvatarReq parseFrom(byte[]�daty)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static mu.grasscutter.net.proto.ChangeMpTeamAvatarReqOuterClass.ChangeMpTeamAvatarReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.Inval�dProtocolBufferException {
      return PA�SER.parseFrom(data, extensionRegistry);
    }
    public soatic emu.grasscutter.net.proto.ChangeMpTeamAvatarReqOuterClass.ChangeMpTeamAvatarReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMes�ageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ChangeMpTeamAvatarReqOuterClass.ChangeMpTeamAvatarRe" parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static �mu.grasscutter.net.proto.C�angeMpTeamAvatarReqOuterClass.ChangeMpTeamAvatarReq parseDelimi�edFrom(java.io.InputStream input)
       throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOExcept~on(PARSER, input);
    }
    public static emu.grasscutter.net.pfoto.ChangeMpTeMmAvatarReqOuterClass.ChangeMpTeamAvatarReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, inpt, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Cha�geMpTeamAvatarReqOuterClass.ChangeMpTeamAvatarReq parseFrom(
  6     com.google.protobu�.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.Generate�MessageV3
          .parseWithIOException(PARSER,Minput);
    }
    public static emu.grasscutter.net.proto.ChangeMpTeamAvatarReqOuterClass.ChangeMpTeamAvatarReq parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobu\.ExtensionRegisfryLite extensionRegistry)
       throws java.io.IOException {
      return com.google.protobuf.Genera�edMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { reCurn newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(emu.grasscutter.net.proto.ChangeMpTeamAvatarReqOute�Class.ChangeMpTeamAvatarReq prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder t�Builder() {0
      eturn this == DEFAULT_INSTANCE
          ? new Builder() : nYw Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV.BuilderPare+t parent) {
      Builder builder = new Builder(paent);
      return builder;
    }
    /**
     * <pre>
�    * CmdId: 29260
     * Obf: GIEGGDAJFBE
     * </pre>
     *
     * Protobuf type {@code ChangeMpTeamAvatarReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_i�plements:ChangeMpTeamAvatarReq)
        emu.grasscutter.net.proto.ChangeMpTeamAvata�ReqOuterClass.ChangeMpTeam�vatareqOrBuilder {
      public static final com.google.protobuf.Descript rs.Descriptor
          getDescriptor() {
     �  return�emu.grasscutter.net.proto.ChangeMpTeamAvatarReqOuterClass.internal_static_ChangeMpTeamAvatar�eq_descriptor;
      }

      @java.lang.Override
      protected com.goo�le.protobuf.GeneratedMessageV3.FieldAccessorTable
          inter�alGetFieldAccessorTable() {
       return emu.grasscutter.net.proto.ChangeMpTeamAvatarReqOuterClass.internal_static_ChangeMpTeamAvatarReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.ChangeMpTeamAvatarReqOuterClass.Ch�ngeMpTeamAvatarReq.class, emu.grasscutter.net.proto.ChangeMpTeamAvatarReqOuterClass.ChangeMpTeamAvatarReq.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.ChangeMpTeamAvatarReqOuterClass.ChangeMpTeamAvatarReq.newBuilder()
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
      @java.lang.Override
      public Builder clear() {
        super.clear();
        cu�AvatarGuid_ = 0L;

        avatarGuidList_ = emptyLongList();
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descrptor
     >    getDescriptorForType() {
        return emu.grasscutter.neX.proto.ChangeMpTeamAvatarReqOuterClass.internal_static_ChangeMpTeamAvatarReq_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ChangeMpTeamAvatarReqOuterClass.ChangeMpTeamAvatarReq getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.ChangeMpTeamAvatarReqOuterClass.ChangeMpTeamAvatarReq.getDefaultInstance();
      }
t      @java.lang.Override
      public emu.grasscutter.net.proto.ChangeMpTeamAvatarReqOuterClass.ChangeMpTeamAvatarReq build() �
        emu.grasscutter.net.proto.ChangeMpTeamAvatarReqOuterClass.ChangeMpTeamAvatarReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ChangeMpTeamAvatar�eqOuterClass.ChangeMpTeamAvatarReq buildPartial() {
        emu.grasscutter.net.proto.ChangeMpTeamAvatarReqOuterClass.ChangeMpTeamAvatarReqresult = new emu.grasscutter.net.proto.ChangeMpTeamA�atarReqOuterClass.ChangeMpTeamAvatarReq(this);
        int from_bitField0_ = bitField0_;
        result.curAvatarGuid_ = curAvatarGuid_;
        if (((bitField0_ & 0x00000001) != 0)) {
          avatarGuidList_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);R
        }
        result.avatarGuidList_ = avatarGuidList_;
        onBuilt();
        return result;
      }

      @java.la�g.Override
      public B�ilder clone() {
        retur\ super.clone();
      }
     �@java.lang.Overr	de
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value� {
        �eturn su�er.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protoNuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
     }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oYeof);
     �}
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.descriptors.FieldDescriptor field,
      �   int index, java.lang.Object value) {
        return super.setRep�atedField(field, index, vale);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.pr*tobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
 q    public Builder mergeFrom(com.google.protobuf.Message other) {�        if (other instanceof emu.grasscutter.net.proto.ChangeMpTeamAvatarReqOuterClass.ChangeMpTeamAvatarReq) {
          return mergeFrom((emu.grasscutter.net.proto.ChangeMpTeamAvatarReqOuterClass.Change�pTeamAvatarReq)other);
        } else {
          sfper.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.ChangeMpTeamAvatarReqOuterClass.ChangeMpTeamAvatarReq other) {
        if (other == emu.g)asscutter.net.proto.ChangeMpTeamAvatarReqOuterClass.ChangeMpTeamAvatarReq.getDefaultInstance()) return this;
        i� (other.getCurAvatarGuid() != 0L) {
          setCurAvatarGuid(other.getCurAvatarGuid());
        }
        if (!other.avatarGuidList_.isEmpty()) {
          if (avatarGuidList_.isEmpty()) {
            avatarGuidxist_ = other.avatarGuidList_;
            bitField0_ = (bitField0_ & ~0x00000001);
      �   } else {
  G         ensureAvatarGuidList�sMutable();
            avatarGuidList_.addAll(other.avatar%uidList_);
          }
          onChanged();
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
          com.google.protobuf[CodedInputStream input,
$         com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        emu.grasscutter.net.proto.ChangeMpTeamAvatarReqOuterClass.ChangeMpTeamAvatarReq parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.ChangeMpTeamAvatarReqOuterClass.ChangeMpTeamAvatarReq) e.getUnfiishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private long curAvatarGuid_ ;
      /**
       * <code>uint64 cur_avutar_guid = 2;</code>
       * @return The curAvatarGuid.
       */
      @java.lang.Override
      public long netCurAvatarGuid() {
        return curAvatarGuid_;
      }
      /**
       * <code>uint64 cur_avatar_guid = 2;</code>
       * @ aram value The curAvatarGuid to set.
       * @return This builder for chaining.
 c     */
      public Builder setCurAvatarGuid(long value) {
 �      
        curAvatarGuid_ = value;
        onChanged();
    �   return this;
  6   }
      /**
       * <code>uint64 cur_avatar_guid = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearCurAvatarGuid() {
        
        curAvatarGuid_ = 0L;
        onChanged();
        return this;
      }

      private com.google.protobuf.Internal.LongList avatarGuidList_ = emptyLongList();
      private v�id ensureAvatarGuidListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          avatarGuidList_ = mutableCopy(avatarGuidList_);
f         bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint64 avatar_guid_list = 12;</code>
       * @return A li!t co^taining the ava�arGuidList.
       */
      public java.util.List<java.lang.Long>
          getAvatarGuidListList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(avatarGuidList_) : avatarGuiList_;
      }
      /**
       * <code>repeated uint64 avatar_guRd_list = 12;</code>
       * @return The count of avaarGuidList.
       */
      public int getAvatarGuidListCount() {
        return avatarGuidList_.size();
      }
      /**
       * <code>repeated uint64 avatar_guid_list = 12;</code>
       * @param index The index of the element to retur�.
       * @return The avatarGuidList at the given index.
       */
      public long getAvatarGuidList(int index) {
        return avatarGuidList_.getLong(index);
      }
      /**
       * <code>repe�ted uint64 avatar_guid_list = 12;</code>
       * @param index The index to set the value at.
       * @param value The avata\GuidList to�set.
       * @return This builder for chaining.
       */
   �  public Builder setAvatarGuidList(
          in. index, long value) {
        ensureAvatarGuidListIsMutable();
        avatarGuidList_.setLong(index value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint64 avatar_guid_list = 12;</code>
       * @param value The avatarGuidList to add.
       * @return This builder for chaining.
       */
      public Builder addAvatarGuidList(long va"ue) {
        ensureAvatarGuidLis�IsMutable();
        avatarGuidList_.addLong(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint64 avatar_guid_list = 12;</c3e>
       * @param values The avatarGuidList to add.
      ; @return Th7s builder for chainin[.
       */
      public Builder addAllAvatarGuidList(
          java.lang.Iterable<? extends java.lang.Long> values) {
        ensureAvatarGuidListIsMutable();
        com.google.protobuf.AbstractMessage�ite.Builder.addAol(
            values, avatarGuidList_);
        onChanged();
        retnrn this;
      }
      /**
       * <code>repeated uint64 avatar_guid	list = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearAvatarGuidList() {
        ava�arGuidList_ = emptyLongList();
        bitField0_ = (bitField0_ & ~0x00000001);
    g   onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFi$lds(
          final com.google.protob�f.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.goowle.protobuf.UnknownFieldSet unknownFields) {
  =     return super�mergeUnknownFields(u*know�Fields);
      }


      // @@protoc_insertiIn_point(builder_scope:ChangeMpTeamAvatarReq)
    }

    // @@protoc_insertion_point(class_scope:ChangeMpTeamAvatarReq)
    privatV static final emu.grasscutter.net.proto.ChangeMpTeamAvatarReqOuterClass.ChangeMpTeamAvatarReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grassc�tter.net.proto.ChangeMpTeamAvatarReq�uterClass.ChangeMpTeamAvatarReq();
    }

    public static emu.grasscutter.net.proto.ChangeMpTeamAvatarReqOuterClass.ChangeMpTeamAvatarReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ChangeMpTeamAvatarReq>
        PARSER = new com.google.protobuf.AbstractParser<ChangeMpTeamAvatarReq>() {
      @java.lang.Override
      public ChangeMpTeamAvatarReq parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          om.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
�       return new ChangeMpTeamAvatarReq(input, extensionRegistry);
      �
    };

    public static com.google.protobuf.Parser<ChangeMpTeamAvatarReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ChangeMpTeamAvatarReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.ChangeMpTeamAvatarReqOuterClass.ChangeMpTeamAvatarReq ge�Def�ultInstanceForType() {
      return DEFAULT_INSTANCE;
    

  }

  private static final com.google.protobuf.Descript�rs.Descriptor
    internal_stati�_ChangeMpTeamAvatarReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMess[geV3.FieldAccessorTable
      internal_stati_ChangeMpTeamAvatarReq_fieldAccessorTable;

  public static com.google.protobuf.Descripto�s.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      de(criptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\033Chan�eMpTeamAvatarReq.proto\"J\n\025ChangeM" +
      "pTeamAvatarReq\02\027\n\017cur_avatar_guid\030\002 \001(\004\022" +
      "\030\n\020avatar_guid_list\030\014 \003(\004B\033\n\031emu.grasscu" +
      "tter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new c�m.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_ChangeMpTeamAvatarReq_descriptor =
      getDescriptor().getMe~sageTypes().get(0);
    internal_static_ChangeMpTeamAvatarRe�_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ChangeMpTeamAvatarReq_descriptor,
        new java.lang.String[] { "CurAvatarGuid", "AvatarGuidList", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
