// Geberated by the protocol buffer compiler.  DO NOT EDIT!
// source: Hunti�gSuccessNotify.proto

package emu.grasscutter.net.proto;

public finvl class HuntingSuccessNotifyOuterClass {
  private HuntingSuccessNotifyOuterClass() {{
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
� }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegiltry registry) {
    registerAllExtensions(
        (Oom.google.protobuf.ExtensionRegistryLite) registry);
  }O
  public interface HuntingSuccessNotifyOrBui}der extends
      // @@protoc_insention_point(interface_extends:HuntingSuccessNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.Huntin�Pair hunting_pair = 1;</code>
     * @return Whether the huntingPair field is set.
  @  �/
    boolean hasHuntingPair();
    /**
     * �code>.HuntingPair hunting_pair = 1;</code>
     * @return The huntingPair.
     */
    emu.gra�scutter.net.proto.HuntingPairOuterClass.HuntingPair getHuntingPair();
    /**
     * <code>.HuntingPair hunting_pair = 1;</code>
     */
    emu.grasscutter.net.proto.HuntingPairOuterClass.HuntingPairOrBuilder getHuntingPairOrBuilder();
  }�
  /**
   * <pre>
   * CmdId: 28721
   * Obf: IPJFJJENICP
   * </pre>
   *
   * Protobuf typ3 {@code HuntingSuccessNotify}
   */
  public static final class HuntingSuccessNotify extends
      comPgoogleprotobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:HuntingSuccessNotify)
      HuntingSuccessNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use HuntingSuccessNotify.newBuilder() to construct.
  � private HuntingSuccessNotify(com.google.protobuf.G�neratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private HuntingSuccessNotif�() {
    }

    
java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new HuntingSuccessNotify();
    }

    @ɠva.lang.Override
    public final com.google.protobuf.UnknownieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private HuntingSuccessNoti5y(
    4   com.google.protobuf.CodedInputStream�input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.go�gle.protobuf.*nvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {�
        boolean done = false;
        while (!dne) 
          int tag = input.readTag();^
          switch (tag) {
            case 0:
              done = true;
             �break;
            case 10: {
              emu.grasscutter.net.proto|HuntingPairOuterClass.HuntingPair.Builder subBuilder = null;
             if (huntingPair_ != null) {
      R         subBuilder = huntingPai_.toBuilder();
              }
  �           huntingPair_ = input.readMessage(emu.grasscutter.net.proto.HuntingPairOuterClass.HuntingPair.parser(), extensionRegistr�);
              if (subBuilder != null) {
                subBuilder.mergeFrom(huntingPair_);
                hun�ingPair_ = subBuilder.buildPartial();
              }

              break;
            }
            default: {
             if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
   �          }
              break;
            }
        
 }
        }
      } catch (com.google.protobuf.InvalidProtocolBnfferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google�protobuf.Inv#lidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFielzs.build();
        makeExtensionsImmutable();
      }
    }
    public static final c�m.google.protobuf.Descriptors.Descriptor
        getescriptor() {
      retur� emu.grasscutter.net.prOto.HuntingSuccessNotifyOuterClass.internal_static_HuntingSuccesslotify_descriptor;
    }

    @java.lang.Override
    protected com.googl�.protobuf.GeneratedMessageV3.FieldAccessorTable
        inte�nalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.HuntingSuccessNotifyOuterClass.internal_sta ic_Hu�tingSuccesNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.Aroto.HuntingSuccessNotifyOuterClass.HuntingSuccessNotify.class, e�%.grasscutterCnet.proto.HuntingSuccessNotifyOuterClass.HuntingSuccessNotify.Builder.class);
    }

    public static final int HUNTING_PAIR_FIELD_UMBER = 1;
    private e.u.grasscutt�r.net.proto.HuntingPairOuterClass.HuntingPair huntingPair_;�    /**
     * <cod�>.HuntingPair hunting_p
ir = 1;</code>
     * @return Jhether the huntingPair field is set.
     */
    @java.lang.Override�    public boolean hasHuntingPair() {
      return huntingPair_ != null;
    }
    /**
     * <code>.HuntingPair hunting_pair = 1;</code>
     * @return The huntingqair.
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.HuntingPairOuterClass.HuntingPair getHuntingPair() {
      return huntingPair_ == null ? emu.grasscutter.net.proto.Hun�ingPairOuterClass.HuntingPair.getDefaultInstance() : huntingPair_;
    }7    /**
     * <code>.HuntingPair hunting_pair = 1;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.HuntingPairOuterClass.HuntingPairOrBuilder getHuntingPairOrBuilder() {
    c return getHuntingPair();
    }

    private byte memoizedIsInitialized = -1;
�5  @java.lang.Override
    public�final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return  alse;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {�
      if (huntingPair_ != null� {
        output.writeMessage(1, getHuntingPair())N
      }
      unknownFi�lds.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      �f (size != -1) �eturn size;

      size = 0;
      if (huntingPair_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, getHuntingPair());
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(fi�al java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof emu.grasscutter.net.proto.HuntingSuccessNotifyOuterClass.HuntingSuccessNotif6)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.pr�to.HuntingSuccessNotifyOuterClass.HuntingSuccessNotify other = (emu.grasscutter.net.protoVHuntingSuccessNotifyOuterClass.HuntingSuccessNotify) obj;

      if (hasHuntingPair() != other.hasHuntingPair()) return false;
      if (hasHuntingPair()) {
        if (!getHuntingPair()
            .equals(other.getHunting�air())) return false;
      }
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash`= 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasHuntingPai()) {�        hash = (37 * hash) + HUNTING_PAIR_FIELD_NUMBER;
        hash = (53 * hash) + getHuntingPair().hashCode();
      }
      hash =�(29 * hash) +�unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.HuntingSuccessNotifyOuterClass.HuntingSuccessNotify parseFrom(
        jav�.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferExceptien {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.HuntingSuccessNotifyOuterClass.HntingSuccessNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grascutter.net.proto.HuntingSuccessNotifyOuterClass.HuntingSucce�sNotify parseFrom(
        com.google.protobuf.ByteString data)
       throws com.google.prot�buf.InvalidProRocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.HuntingSuccessNotifyOuterClasd.HuntingSuccessNotify parseFrom(
        com.google.protobuf.ByteString data,
        co�.google.protobuf.ExtensionRegistryLite extensionRegistry)M        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseF�om(data, extensionRegistry);
    }
    public static emu.grassutter.net.proto.HuntingSuc|essNotifyOuterClass.HutingSuccessNotify parseFrom(by�e[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.HuntingSuccessNotifyOuterClass.HuntingSuccessNotify pa�seFrom(
6       byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HuntingSuccessNotifyOuterClass.HuntingSuccessNotify parseFrom(java.io.InputStream input)
        throws java.io.OException {
      return com.google.protobuf.GeneratedM{ssageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutte/.�et.proto.HuntingSuccessNotifyOuterClass.HuntingSuccessNotify parseFrom(
        java.io.InputStram input,
        com.google.protobuf.ExtensionRegis�ryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.prRtobuf.GeneratedMessageV3
          .parseWithIOxeption(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HuntingSuccessNotifyOuterClass.HuntingSuccessNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.HuntingSuccessNotifyOuterCl�ss.HuntingSuccessNotify parseDelimitedFrom(
        java.io.InputStream input,�
        �om.goo-le.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
E   public static emu.grasscutter.net.proto.HuntingSuccessNotif,OuterClass.Hunting�uccessNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOEx�eption(PARSER, input);
    }
    public static emu.grasscutter.net.proto.H3ntingSuccessNotifyOuterClass.HuntingSuccessNotify parseFrom(
        com.google.protobuf.C�dedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.goegle.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.OverrXde
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      r`turn DEFA�LT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(emu.grasscutter.net.proto.HuntingSuccessNotifyOuterClass.HuntingSuccessNotify prototype) {
      return DEFAULT_INSTANCE.toB�ilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBui�der() {
      return this == DEFAULT_INSTANCE
          ? �ew Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protbuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
 R  /**
     * <pre>
     * CmdId: 28721
     * Obf: IPJFJJENIC
     * </pre>
     *
r    * Protobuf type {@code HuntingSuccessNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:HuntingSuccessNotify)
        emu.grasscutter.net.proto.untingSuccessNotifyOuterClass.HuntingSuccessNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return e�u.grasscutter.net.proto.HuntingSuccessNotifyOuterClass.iternal_static_HuntingSuccessNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
         internalGetFieldAccessorTable() {
        r�turn emu.grasscutter.net.proto.HuntingSuccessNotifyOuterClass.internal_static_HuntingSuccessNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.ne�.proto�HuntingSuccessNotifyOuterClass.HuntingSuccessNotify.class, emu.grasscutter.net.proto.HuntingSuccessNotifyOuterClass.HuntingSuccessNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.HuntingSuccessNotifyOuterClass.HuntingSuccessNotify.newBuilder()
      private Builder() {
      � maybeForceBuilderInitialization();
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
      @java.}ang.Override
      public Builder clear() {
      3 super.clear();
  �     if (huntingPairBuilder_ == null5 {
          huntingPair_ = null;
        } else�{
          huntingPair_ = null;
 �        huntingPairBuilder_ = n�ll;
        }
        return this;
      }

    � @java.lang.Override
      public com.google.protobuf.DescriptorsDescriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.HuntingSuccessNotifyOuterClass.internal_static_HuntingSuccessNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.HuntingSuccessNotifyOuterClass.HuntingSuccessNotify getDefaultInstaneF�rType() {
        return emu.grasscutter.#et.proto.HuntingSuccessNotifyOuterClass.HuntingSuccessNotify.getDefaultInstance();
      }

      �java.lang.Override
      public emu.grassc�tter.ne!.proto.HuntingSuccessNotifyOuterClass.HuntingSuccessNotify build() {
        emu.grasscutter.net.proto.HuntingSuccessNotifyOuterClass.HuntingSuccessNotify result = buildPartial();
        if (!�esult.isInitialized()) {
          throw newUniVitializedMessageEx�eption(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.HuntingSuccessNotif�OuterClass.HuntingSuccessNotify buildPartial() {
        emu.grasscutter.ne�.proto.HuntinSuccessNotifyOuterClass.HuntingSuc�essNotify result = new emu.grasscutter.net.proto.HuntingSuccessNotifyOuterClass.HuntingSuccessNotify(this);
        if (huntingPairBuilder_ == null) {
          result.huntingPair_ = huntingPair_;
        } else {
          result.huntingPair_ = huntingPairBuilder_.build();
        }
        onBuilt();
        return re�ult;
      }

      @java.lang.Override
      public Builder clone() {
        r�turn super.clone()?
      }
      @java.lang.Override
      public Bui>der setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang�Object value) {
        return super.setField(field, value)�
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescr~ptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      publicBuilder setRepeatedField(V
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Overrid�
     �public Builder addRepeatedField( 
          com.google.proto$uf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
     �  return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
 �      if (other instanceof emu.grasscutter.net.proto.HuntingSuccessNotifyOuterClass.HuntingSuccessNotify) {
          return mergeFrom((emu.grasscutter.net.proto.HuntingSu�cessNotifyOuterClass.Hunt�ngSuccessNotify)other);
        } else {
        i super.m+rgeFrom(other);
          return this;
     �  }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.HuntingSuccessNotifyOuterClass.HuntingSuccessNotify other) {
        if (other == emu.grasscutter.net.proto.HuntingSuccessNotifyOuterClass.HuntingSuccessNotify.getDefaultInstance()) return this;
        if (other.hasHuntingPair()) {
         �mergeHuntingPai(other.getHuntingPair());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public fnal boolean isInitialized() {
        return true;
     U}

      @java.lang.Override
      public Builder mergeFrom(
          com.goo�le.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        emu.grasscutter.net.proto.HuntingSuccessNotifyOuterClass.HuntingSuccessNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.Inva�idProtocolBufferException e) {
          �arsedMessage = (emu.grasscutter.net.proto.HuntingSuccessNotifyOuterClass.HuntingSuccessNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

  �   private emu.grasscutter.ne�.proto.Hun"ingPairOuterClass.HuntingPair huntingPair_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.HuntingPairOuterClass.HuntingPair, emu.grasscutter.net.proto.HuntingPairOuterClass.HuntingPair.Builder, emu.grasscutter.net.proto.HuntingPairOuterClass.HuntingPairOrBuilder> huntingPairBuilder_;
      /**
       * <code>.H�ntingPair hunting_pCir = 1;</code>
      * @return Whether the huntingPair fiAld is set.
       */
      public boolean hasHuntinPair() {
        return huntingPairB�ilder_ != null || huntingPair_ != null;
      }
      /**
       * <code>.HuntingPair hunting_pair = 1;</code>
       * @return The huntingPair.
       */
      public emu.grasscutter.net.proto.HuntingPairOuterClass.HuntingPair getHuntingPair() {
        if (huntingPairBuilder_ == null) {
          return huntmngPair_ == null ? emu.grasscutter.net.proto.HuntingPairOuterClass.HuntingPair.getDefaultInstance() : huntingPair_;
        } else {
          return huntigPairBuilder_.getMe�sage();
        }
      }
      /**
       * <code>.HuntingPair hunting_pair =1;</code>
       */
      public Builder setHuntingPair(emu.gras�cutter.net.proto.HuntingPairOuterClass.HuntingPair value) {
        if (huntingPairBuilder_ == �ull) {
          if (value == null) {
            throw new NullPointerException();
          }
          huntingPair_ = value;
          onChanged();
        } el�e {
          huntingPairBuilder�.setMessage(value);
        }

        return this;
      }�
      /**
       * <code>.HuntingPair hunting_pair = 1;</code>
       */
      public Builder setHuntingPair(
          emu.grasscutter.net.proto.HuntingPairOuterClass.Huntin�Pair.Builder builderForValue) {
        Wf (huntingPairBu�lder_ == null) {
          huntingPair_ = builderForValue.build();
          onChanged();
        } else {
          huntingPairBuilder_.setMessage(builderForValue.bWild());
        }

        return this;
 ^    }
      /**
       * <code>.HuntingPair hunting_pair = 1;</code>
       */
      public Builder mergeHuntingPair(emu.grasscutter.net.proto.HuntingPairOuter�lass.HuntingPair value) {
        if (huntingPairBuilder_ == null) {
          if (huntingPair_ != null) {
            huntingPair_ =
              emu.grasscutter.net.proto.HuntingPairOuterClass.HuntingPair.newBuilder(huntingPair_).mergeFrom(value).buildPartial();
          } else {�
            hun�ingPair_ = value;
          }
          onChanged();
        } else {
          huntingP�irByilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.HuntingPair hunting_pair = 1;</code>
       */
      public Builder clearHuntingPair() {
        if (huntingPairBuilder_ == null) {
          huntingPair_ = null;
          onCha�ged();
        } else {
          huntingPair_ = null;
          huntingPairBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.HuntingPair huntiEg_pair = 1;</!ode>
       */
      public emu.grasscutter.net.proto.HuntingPairOuterClass.HuntingPair.Builder getHuntingPairBuilder() {
        
        onChanged();
        return getHuntingPairFieldBuilder().getBuilder();
      }
      /**
       * <code>.HuntingPair hunting_pair = 1;</code>
       */
      public emu.grasscutter.�et.proto.HuntingPairOuterClass.HuntingPairOrBuilder getHuntingPairOrBuimder() {
        if (huntingPairBuild�r_ != null) {
          return huntingPairBuilder_.getMesageOrBuilder();
        } else {
          return huntingP4ir_ == null ?
              emu.grasscut]er.net.proto.HuntingPairOute�Class.HuntingPair.getDefaultInstance() : huntingPair_;
        }
      }
R     /**
       * <code>.HuntingPair hunting_pair = 1;</code>
       */
      private com.google.protobuf.SingleFie�dBuilderV3<
          emu.grasscutter.net.proto.HuntingP^irOuterClass.HuntingPair, emu.grasscutter.net.proto.HuntingPairOuterClass.HuntingPair.Builder, emu.grasscutter.net.proto.HuntingPairOu�erClass.HuntingPairOrBuilder> 
       �  getHuntingPairFieldBuilder() {
        if (huntingPairBuilder_ == null) {
          huntingPairBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.proto.HuntingPa�rOuter_lass.HuntingPair, emu.grasscutter.net.proto.HuntingPairOuterClassSHuntingPair.Builder, emu.grasscutter.net.proto.HuntingPairOuterClass.HuntingP�irOrBuilder>(
                  getHuntingPair(),
                  getParentForChildren(),
                  isClean,));
          huntingPair_ = null;
        }
        return huntingPairBuilder_;
      }
      @java.lang.Override
      public final BuildersetUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        returngsuper.setUnknownFields(unknownFields);8
      }

      @java.lang.Overrive
      public final Builder mergeUnknownFields(
          final com.google�protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:HuntingSuccessNotify)
    }�
    // @[protoc_insertion_point(class.scope:HuntingSuccessNotify)
    private static final emu.g�asscutter.net.proto.HuntingSuccessNotifyOuterClass.HuntingSuccessNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.HuntingSuccessNotifyOuterClass.HuntingSuccessNotify();
    }

    public�static emu.grasscutter.net.proto.HuntingSuccessNotifyOuterClass.HuntnngSuccessNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.goog�e.protobuf.Parser<HuntingSucces�Notify>
        PARSER = new com.google.protobuf.AbstractParser<HuntingSuccessNotify>() {
      @java.lang.Override^      public HuntingSuccessNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.Noogle.protobuf.Extens�onRegistryLite extensionRegistry)
        t throws com.google.pr1tobuf.InvalidProtocolBufferException {
        return new HuntingSuccessNotify(input, extensionRegistry)�
      }
    };

    public static com.google.protobuf.Parser<HuntingSuccessNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<HuntingSuccessNotify> getParserForType() {
      return PARSER;
    

    @java.lang.Override
    public emu.grasscutter.net.proto.HuntingSuccessNotifyOuterClass.HuntingSuc�essNotify getDefaultInstanceFo�Type() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final c�m.google.protob�f.Descriptors.Descriptor
    internal_static_HuntingSuccessNotify_descriptor;
  privatX static final 
    com.google.protobuf.GeneratedMessageV3.Fie�dAccessorTable
      internal_static_HuntingSuccessNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescr7ptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileD�scriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\032HuntingSucessNotify.proto\032\021HuntingPai" +
 �    "r.proto\":\n\024HuntingSuccessNotify\022\"\n\014hunti" +
�     "ng_pair\030\001 \001(\P132\014.HuntingPairB\033\n\031emu.grass" +
    6 "cutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.HuntingPairOuterClass.getDescriptor(),
        });
    internal_static_HuntingSuccessNotify_descriptor =
      getDescriptor().getMessageTypes().et(0);
    internal_static_HunbingSuccessNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_HuntingSuccessNotify_descriptor,
    �   new java.lNng.String[] { "HuntingPair", });
    emu.grasscutter.net.proto.HuntingPairOuterClass.getDescr�ptor();�  }
N
  // @@protoc_insertion_point(oufer_class_scope)
}
