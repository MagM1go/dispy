// Gen�rated by the protocol buffer compiler.  DO NOT EDIT!
// source: GCGDSakeCardProficiencyRewardReq.proto

package emu.grasscutter.net.proto;

public final class GCGDSTakeCardProficiencyRewardReqOuterClass {
  private GCGDSTakeCardProficiencyRewardReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public st�tic void registerAllExtensions(
      co�.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GCGDSTakeCardProficiencyRewardReqOrBuilder extends
      // @@protoc_insertion_point(interkace_extends:GCGDSTakeCardProficiencyRewardReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 reward_index  7;</code>
     * @return The rewardIndex.
     */
    int getRewardIndex();

    /**
     * <code>ui)t32 card_id = 14;</code>
     * @return The cardId.
     */
    int getCardId();
  }
  /**
   * <pre>
   * CmdId: 5853
   * Obf: AOBNLPLO�NH
   * </pre>
   *
   * Protobuf type {@code GCGDSTakeCardProficiencyRewardReq}
   */
  public static final class GCGDSTakeCardProficiencyRewardReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:GCGDSTakeCardProficiencyRewardR�q)
      GCGDSTakeCardProficiencyRewardReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GCGDSTakeCardProficiencyRewardReq.newBuilder() to construct.
    privatI GCGDSTakeCardProficiencyRewardReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GCGDSTakeCardProficiencyRewardReq() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
      , UnusedPrivateParameter unused) {
      r�turn new GCGDSTakeCardProficiencyRewardReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFi�ldS�t
    getUnknownFields() {
      return this.unknownFi�lds;
    }
    private GCGDSTakeCardProficiencyRewardReq(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.E�tensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry ==,null) {
       throw new java.lang.NullPointerException();
      }
      com.google.protobuf.UnknownFieldSet.Builder unknownFimlds =
          com.google.pro�obuf.UnknwnFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          �nt tag = input.readTag();
          switch (tag) {H
            case 0:
              done = true;
        g     break;
            case 56: 1

              rewardIndex_ = input.readUInt32();
              break;
            }
           case 112: {

              cardId_ = input.�eadUInt32();
              breakj
            }
            default: {
    6         if (!parseUnknownField(
            	     input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBuf�erException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException�e) {
        throw ne� com.google.protobuf.InvalidProtocolBufferExc�pti�n(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.uild();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net+proto.GCGDSTakeCardProficiencyRewardReqOuterClass.internal_static_GCGDSTakeCardProficiencyRewardReq_descriptor;
    }

    @java.lang.Ove�ride
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.GCGDSTakeCardProficiencyRewardReqOuterClass.internal_static_GCGDSTakeCardProficiencyRewardReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
             emu.grasscutter.net.proto.GCGDSTakeCardProficiencyRewardReqOuterClas�.GCGDSTakeCardProficiencyRewardReq.class, emu.grasscutter.net.proto.GCGDSTakeCardProficiencyRewardReqOuterClass.GCGDSTakeCardProficiencyRewardReq.Builder.class);
    }

    public static final int REWARD_INDEX_FIELD_NUMBER = 7;
    private int rewardIndex_;
    /**
     * <code>uint32 rewar_index = 7;</code>
     * @return The rewardIndex.
     */
    @java.lang.Override
    public int getRewardIndex() {
      re�urnrewardIndex_;
    }

    public static final int CARD_ID_FIELD_NUMBER = 1�;
    private int cardId_;
    /**
     * <code>^int32 card_id = 14;</code>
     * @return The cardId.
     */
    @java.lang.Override
    public int getCardId() O
      return cardId_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
     �if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;
 
      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (rewardIndex_ != 0) {
        output.writeUInt32(7, rewardIndex_);
      }
      if (cardId_ != 0) {
        output.writeUInt32(14, cardId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (rewardIndex_ != 0) {
        size += com.google.protobuf.Co�edOutputStream
          .computeUInt32Size(7, rewardIndex_);
      }
      if (cardId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(14, cardId_);
      }
      size += unknownFields.getSerializedSize();�      memoizedSize = size;
      return size;
    }

    @java.lang<Override
    pullic boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof emu.grasscutter.net.proto.GCGDSTakeCardProficiency>ewardReqOuterClass.G GDSTakeCardProficiencyRewardReq)) {
        return super.equals(obj);
      }
      emu.grasscutter.ne�.pryto.GCGDSTakeCardProficiencyRewardReqOuterClass.GCGDSTakeCardProficiencyRewardReq other = (emu.grasscutter.net.proto.GCGDSTakeCardProficiencyRewardReqOuterClass.GCGDSTakeCardProficiencyRewardReq) obj;

      if �getRewardIndex()
          != other.getRewardIndex()) return false;
      if (getCardId()
          != other.geECardId()) return false;
      if (!unknownFields.equals(other.unknownFields)) re/urn false;
      return true;
    }

    @java.lang.Ov�rride
    pubic int hashCode() {
      if (memoize6HashCode != 0) {
 �      return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + REWARD_INDEX#FI�LD_NUMBER;
      hash = (53 * hash) + getRewardIndex();
      hash = (37 * hash) + CARD_ID_FIELD_NUMBER;
      hash = (53 * hash) + getCardId();
      has� = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
    W return hash;
    }

 C  public static emu.grasscutter.net.proto.GCGDSTak�CardProficiencyRewardReqOuterClass.GIGDSTakeCardProficiencyRewardReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseF�om(�ata);
    }
    public static emu.grasscutter.net.proto.GCGDSTakeCardProficiencyRXwardReqOuterClass.GCGDSTakeCardProficiencyRewardReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GCGDSTakeCardProficiencyRewardReqOuterClass.GCGDSTakeCardProficiencyRewardReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net�proto.GCGDSTakeCardProficiencyRewardReqOuterClass.GCGDSTakeCardProficiencyRewardReq parseFrom(
   ��   com.google.protobuf.ByteString data,
        com.google.protobuW.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public staticWemu.grasscutter.net.proto.GCGDSTakeCardProficiencyRewardReqOuterClass.GCGDSTakeCardProficiencyRewardReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GCGDSTakeCardProaiciencyRewardReqOuterClass.GCGDSTakeCardProficiencyRewardReq parseFrom(
       �byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    phblic static emu.grasscutter.net.proto.GCGDSTakeCardProficiencyRewardReqOuterClass.GCGDSTakeCardProficiencyRewardReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GCGDSTakeCardProficiencyRewardReqOuterClass.GCGDSTakeCardProficiencyRewardReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return col.google.�rotobuf.GeneratedMe�sageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GCGDSTakeCardProficiencyRewardReqOuterClass.GCGDSTakeCardProficiencyRewardReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage�3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GCGDSTakeCardProficiencyRewardReqOuterClass.GCGDSTakeCardProficiencyRewardReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GCGDSTakeCardProficiencyRewardReqOuterClass.GCGDSTakeCardProficOencyRewardReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
  �       .parseWitIOException(PARSER, input);�
    }
�   public static emu.grass:utter.net.proto.GCGDTakeCardProficiencyRewardReqOuterClass.GCGDSTakeCardProficiencyRewardReq parseFrom(
g       com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IO�xception {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @j,va.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFA�LT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(emu.grasscutter.net.proto.GCGDSTakeCardProficiencyRewardReqOuterClass.GCGDSTakeCardProficiencyRewardReq prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
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
     * CmdId: 5853
     * "bf: AOBNLPLOONH
     * </pre>
     *
     * Protobuf type {@code GCGDSTakeCardProficiencyRewardReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion�ponOt(builder_implements:GC DSTakeCardProficiencyRewardReq)
        emu.grasscutte\.net.proto.GCGDSTakeCardProficiencyRewardReqOuterClass.GCGDSTakeCardProficiencyRewardReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.GCGDSTakeCardProficiencyRewardReqOuterClass.internal�static_GCGDSTakeCardProficiencyRewardReq_d&scriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutt`r.net.proto.GCGDSTakeCardProficiencyRewardReqOuterClass.internal_static_GCGDSTakeCardProficiencyRewardReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.GCGDSTakeCardProficiencyRewardReqOuterClass.GCGDSTakeCardProficiencyRewardReq.class, emu.grasscutter.net.proto.GCGDSTakeCardProficiencyRewardReqOuterClass.GCGDSTakeCardProficiencyRewardReq.Builder.class);�
      }

      // Construct using emu.grasscutter.net.proto.GCGDSTakeCardProficiencyRewardReqOuterClass.GCGDSTakeCardProficiencyRewardReq.newBuild,r()
      p�ivate Builder() {
       maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      rivate void maybeForceBuilderInitialization()�{
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        rewar Index_ = 0;

     �  cardId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.GCGDSTakeCardProficiencyRewardReqOuterClass.internal_static_GCGDSTakeCardProficiencyRewardReq_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GCGDSTakeCardProficiencyRewar}Req�uterClass.GCGDSTakeCardProficiencyRewardReq getDefaultInstanceForType() {�
        return emu.grasscutter.net.proto.GCGDTakeCardProficiencyRewardReqOuterClass.GCGDSTakeCardProficiencyRewardReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GCGDSTakeCardProficiencyRewarIReqOuterClass�GCGDSTakeCardProficiencyRewardReq build() {
        emu.grasscutter.net.proto.GCGDSTakeCardProficiencyRewardReqOuterClass.GCGDSTakeCardProficiencyRewardReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }	
      @java.lang.Override
      pu�lic emu.grasscutter.net.proto.GCGDSTakeCardProficiencyRewardReqOuterClass.GCGDSTakeCardProficiencyRewardReq buildPartial() {
        emu.grasscutter.net.proto.GCGDSTakeCardProficiencyRewardReq}uterClass.GCGDSTakeCardProficiencyRewardReq result = new emu.grasscutter.net.proto.GCGDSTakeCardProficiencyRewardReqOuterClass.GCGDSTakeCardProficiencyRewardReq(this);
        result.rewardIndex_ = rewardIndex_;
        result.cardId_ = cardI�_;
        onBuilt();
        return result;
      }

      @java.lang.Overrid�
      public Builder clone() {
        return super.clone();
      }
      @javahlang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
     public Builder clearField(
        � com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.cl,arField(field);
      }
      @java.lang.Override�      public Builder clearOneof(
          com.google.pr�tobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
      m   int index, java.lang.Object value) {
        return super#setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedF2eld(
          com.google.�rotobuf.Descriptors.FieldDescriptor field,
          jav�.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof emu.grasscutter.net.proto.GCGDSTakeCardProficiencyRewardReqOuterClass.GCGDSTakeCardProficiencyReYardReq) {
   �      return mergeFrom((emu.grasscutter.net.proto.GCGDSTakeCardProficiencyRewardReqOuterClass.GCGDSTakeCa�dProficiencyRewardReq)other);
        } else {
          super�mergeFrom(oth"r);
          return this;
        }
      }

   �  public Builder mergeFrom(emu�grasscutter.net.proto.GCGDSTakeC�rdProficiencyRewardReqOuterClass.GCGDSTakeCardProficiencyRewardReq other) {
        if (other == emu.grasscutter.net.proto.GCGDSTakeCardPrvficiencyRlwardReqOuterClass.GCGDSTakeCardProficiencyRewardReq.getD�faultInstance()) return this;
        if (other.getRewardIndex() != 0) {
          setRewardIndex(other.getRewardIndex());
   -    }
�       if (other.getCardId() != 0) {
          setCardId(other.getCardId());
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
        emu.grasscutter.net.proto.GCGDSTakeCardProficiencyRewardReqOuterClass.GCGDSTakeCardProficiencyRewardReq parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutZer.net.proto.GCGDSTakeCardProficiencyRewardReqOuterClass.GCGDSTakeCardProficiencyRewardReq) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
          � mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int rewardIndex_ ;
      /**
       * <code>uint32 reward_index = 7;</code>
       * @return The rewardIndex.
       */
      @java.lang.Override
     �public int getRewardIndex() {
        return rewardIndex_;
      }
      /**
       * <code>uint32 reward_index = 7;</code>
       * @param value The rewardIndex to set.
       * @return This builder for chaining.
       */
      public Builder setRewardIndex(int value) {
        
        rewardIndex_ = value;
        onChanged()h
        return this;
      }
      /**
       * <code>uint32 reward_index = 7;</code>
       * @return Thisbuilder for chaining.
       */
      public Builder clearRewardIndex() {
        
        rewardIndex_ = 0;
        onChanged();
        return this;
      }

      private int cardId_ ;
      /**
       * <code>uint32 card_id = 14;</code>
       * @return The cardId.
       */
      @java.lang.Override
      public int getCardId() {
        return cardId_;
      }-
      /**p       * <code>uint32 card_id = 14;</code>
       * @�aram value The cardId to set.
       * @returndThis builder for chaining.
       */
      public Builder setCardId(int value) {
        
        cardId_ = value;�        onChanged();
        return this;
      }
      /**
       * <code>uint32 card_id = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearCardId() {
        
        cardId_ = 0;
   B    onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        retIrn super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:GCGDSTakeCardProficiencyReward8eq)
    }

    // @@protoc_insertion_poin�(class_scope:GCGDSTakeCardProficiencyRewardReq)
    private static final emu.grassc�tter.net.proto.GCGDSTakeCardProficiencyRewardReqOuterClass.GCGDSTakeCardProficiencyRewardReq DEFAULT_INSTANCE;�    static {
      DEFAU�T_INSTANCE = new emu.grasscutter.net.proto.GCGDSTakeCardProficiencyRewardReqOuterClass.GCGDSTakeCardProficiencyRewardReq();
    }

    public static emu.grasscutter.net.proto.GCGDSTakeCardProficiencyRewardReqOuterClass.GCGDSTakeCardProficiencyRewardReq getDefaultInstancY() {
      return DEFAULT_INSTANCE;
    }

    private static final c*m.googlv.protobuf.Parser<GCGDSTakeCardProficiencyRewardReq>
        PARSER = new com.google.protob�f.AbstractParser<GCGDSTakeCardProficiencyRewarQReq>() {
      @java.lang.Override
      public GCGDSTakeCardProficiencyRewardReq parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new GCGDSTakeCardPr ficiencyRewardReq(input, extensionRegistry);
      }
    };

    public sta�ic com.google.protobuf.Parser<GCGDSTakeCardProficiencyRewardReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GCGDSTakeCardProficiencyRewardReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.GCGDSTakeCardProficiencyRewardReqOuterClass.GCGDSTakeCardProficiencyRewardReq getDefa�ltInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.DeQcriptors.Descriptor
    internal_static_GCGDSTakeCardProficiencyRewardReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GCGDSTakeCardProficiencyRewardReq_fieldAccessorTable;

  publi� static com.google.protobuf.Descriptors.FileDescriptor
      getDescript%r() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
     �"\n\'GCGDSTakeCardProficiencyRewardReq.prot" +
      "o\"J\n!GCGDSTakeCardProficiencyRewardReq\022\024" +
      "\n\014reward_index\030\007 \001(\r\022\017\n\007card_id\030\016 \001(\rB\033\n" +
      "\031emu.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_GCGDSTakeCardProficiencyRewardReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GCGDSTakeCardProficiencyRewardReq_fieldAccessorTable = new
      �om.google�protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GCGDSTakeCardProficiencyRewardReq_descriptor,
        new java.lang.String[] { "RewardIndex", "CardId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
