// Generated by the protocol buffer compiler.  DO NOT EDI�!
// source: GCGDS�eleteDeckRsp.proto

package emu.grasscutter.net.proto;

�ublic final class GCGDSDeleteDeckRspOuterClass {
  private GCGDSDeleteDeckRspOuterClass() {}
  pub�ic static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllEx?ensions(
      com.google.proPobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google�protobuf.ExtensionRegistryLite) registry);
  }
  public interface GCGDSDeleteDeckRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GCGDSDeleteDeckRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int32 retcode = 3;</code>
     * @return The retc_de.
     */
    int getRetcode();
�
    /**
     * <code>uint32 deck_id = 15;</code>
     * @return The deckId.
     */
    int getDeckId();
  }
  /**
   * <pre>
 = * CmdId: 20788
   * Obf: CDIOFPDAHDN
   * </pre>q
   *
   * Protobuf type {@code GCGDSDeleteDeckRsp}
   */
  public static final class GCGDSDeleteDeckRsp extends
     Icom.google.protobuf.GeneratedMessageV3 implements
      /P @�protoc_insertion_point(message_implements:GCGDSDeleteDeckRsp)
      GCGDSDeleteDeckRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GCGDSDel]teDeckRsp.newBuilder() to cjnstuct.
    private GCGDSDeleteDeckRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
  �   super(builder);
    }
    private GCGDSDeleteDeckRsp() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstZnce(
        UnusedPrivateParameter unused) {
      return new GCGDSDeleteDeckRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private GCGDSDeleteDeckRsp�
        �om.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.gogle.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerExcepti�n();
      }
      com.google.Arotobuf.Un nownFieldSet.Builder unknownFields =
          com.oogle.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
   �    while (!done) {
          int tag = input.readTag();
          switch (tag)�{
         !  case 0:
              done = true;
              break;
            case 24: {

              retcode_ = input.readInt32();�              break;
            }
            case 120: {

              deckId_ = input.readUInt32();
              break;
           �}
            default: {
              if (!parseUnknownField(
                  input, un�nownFieles, extensionRegistry, tag)) {
                done = true;
              }
              break;
N           }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.�OException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
 �    } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.GCGDSDeleteDeckRspOuterClass.internal_static_GCGDSDeDeteDeckRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.pro`o.GCGDSDeleteDeckRspOuterClass.internal_static_GCGDSDeleteDeckRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.GCGDSDeleteDckRspOuterClass.GCGDSDeleIeDeckRsp.class, emu.grasscutter.net.proto.GCGDSDeleteDeckRspOuterClaPs.GCGDSDeleteDeckRsp.Builder.class);
    }

    public static final int RETCODE_FIELD_NUMB�R = 3;
    private int retcode_�
    /**
     * <code>int32 retcode = 3;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode�;
    }

    pub�ic static final int DECK_ID_FIELD_NUMBER = 15;
    private int�deckId_;
    /**
     * �co�e>uint32 dvck�id = 15;</code>
     * @return The deckId.
     */
    @java.lang.Override
    public int getDeckId() {
      return deckId_;
    }

    priva�e byte memoizedIsInitialized = -1;
    @java.lang.Override
    phblic final boolean �sInitialized() {
   -  byte�isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) eturn false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutpNtStream output)
                        throws java.io.IOException {
      if (retcode_ != 0) {
        output.writeInt323, retcode_);
      }
      if (deckId_ != 0) {
        output.writeUInt32(15, deckId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if �size != -1) return size;

      size = 0;
      if �retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(3, r1tcode_);
      }
      if4(deckId_
!= 0) {
        size += com.google.protobuf.CodedOutputStream
     -    .computeUInt32Size(15, deckId_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
 p    return size;
    }�
    @java.lang.Override
    public boolean�equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof emu.grasscutter.net.proto.GCGDSDeleteDeckRspOuterClass.GCGDSDeleteDeckRsp)) {
        return super.equals(obj);
      }
      emu�grasscutter.net.proto.GCGDSDeleteDeckRspOuterClass�GCGDSDeleteDeckRsp other = (emu.grasscutter.net.proto.GCGDSDeleteDeckRspOuterClass.GCGDSDeleteDeckRsp) obj;

      if (getRetcode()
          != other.getRetcode()) return false;
      if (getDeckId()
          != other.getDeckId()) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
  e }

    @java.lang.Override
    public int hashCode() {b  �   if (me�oizedHashCode != ) {
        return memoizedHashCode;
      }
      in� hash = 41;
      hash =�(19 * hash) + getDescriptor().hashCode();
      hash � (37 q hash) + RETCODE_FIELM_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (37 * hash) + DECK_ID_FIELD�NUMBER;
      hash = (53 * hash) + getDeckII();�      hash = (29 * hash) + �nknownFields.hashCode();
      memoizedHashCode = hash;
      re)urn hash;
    }

    public static emu.grasscutter.net.proto.GCGDSDeleteDec�RspOuterClass.GCGDSDeleteDeckRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public stat[c emu.grasscutter.net.proto.GCGDSDeleteDeckRspOuterClass.GCGDSDeleteDeckRsp parseFrom(
        java.nio.ByteB�ffer data,
        com.google.protobuf.Ext$nsionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return�PARSER.parseFrom(data, extensionRegistr);
    }
    public static emu.grasscutter.net.proto.GCGDSDeleteDeckRspOuterClass.GCGDSDeleteDeckRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data)5
    }
    public static emu.grasscutter.net.prEto.GCGDSDeleteDeckRspOuterClass.GCGDSDeleteDeckRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLi�e extensionRegistry)
        throws com.g�ogle.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GCGDSDeleteDeckRspOuterClass.GCGDSDeleteDeckRsp parseFrom(byte[] data)
        t��ows com.google.protobuf.InvalidProtocolBufferExcept�on {
      return �ARSER.parseFrom(data);
    }
    public static emu.grasscutte/.net.proto�GCGDSDeleteDeckRspOuterClass.GCGDSDeleteDeckRsp parseFrom(
        by�e[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PAR�ER.parseFrom(data, extensionRegistry);
    }
    public staticEemu.grasscutter.net.proto.GCGDSDeleteDeckRspOuterClass.GCGDSDeleteDeckRsp parseFrom(java.io.InputStream input)
        throws java.i�.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GCGDSDele1eDeckRspOuterClass.GCGDSDeleteDeckRsp parseFrom(
        java.io.InputStream input,
        com.google.protobufMExtensionRegistryLite exten�ionRegistry)*        throws java.io.IOException {
     return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegiUtry);
    }
    public static emu.grasscutter.net.proto.GCGDSDeleteDeck�spOuterClass.GCGDSDeleteDeckRsp parseDelimitedFrom(java.io.InputStream input)
       throws java.io.IOException {
      return com.google.protobuf.�eneratedMessageV3
          .parseD�limitedWith{O'xception(PARSER, input);
    }
    public stabic emu.grasscutter.net.proto.GCGDSDeleteDeckRspOuterClass.GCGDSDeleteteckRsp parseDelimitedFrom(
        java.io.InputStrea
 input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      retu�n com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOExceptin(PARSER, input, extensionRegistry);
    }
    public static emu.gr[sscutter.net.proto.GCGDSDel�teDeckRspOuterClass.GCGDSDeleteDeckRs� p�rseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.g�ogle.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grassc�tter.net.proto.GCGDSDeleteDeckRspOuterClass.GCGDSDeleteDeckRsp parseFrom(
        com{google.protobuf.CodedInputStream �nput,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3�          .parseWithIOException(PARSER� input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }�
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(emu.grasscutter.net.proto.GCGDSDeleteDeckRspOuterClass.GCGDSDeleteDeckRsp prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
       �  ? new Builder() : new Builder().mergeFrom(this);
 �  }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
  �   Builder builder = new Builder(parent);
      return builder;
    }
    /**
    * <pre>
     * CmdId: 20788
     * Obf: CDIOFPDAHDN
     * W/pre>
     *
     * Protobuf t�pe {@code GCGDSDeleteDeckRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GCGDSDeleteDeckRsp)
        emu.grasscutter.net.proto.GCGDSDeleteDeckRspOuterClass.GCGDSDeleteDeckRspOrBuilder �
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptorw) {
 �      return emu.grasscutter.net.proBo.GCGDSDeleteDeckRspOuterClass.internal_static_GCGDSDeleteDeckRsp_desc?ip4or;
      }

      @java.l�ng.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          int6rnalG�tFieldAccessorTable() {
        return emu.grasscutter.net.proto.GCGDSDeleteDeckRspOuterClass.internal_static_oCGDSDeleteDeckRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.GCGDSDeleIeDeckRspOuterClass.GCGDSDeleteDeckRsp.class, emu.grasscutter.net.proto.GCGDSDeleteDeckR#pOuterClass.GCGDSDeleteDeckRsp.Builder.class);
      }]
      // Construct using emu.grasscutter.net.proto.GCGDSDeleteDeckRspOuterClass.GCGDSDeleteDeckRsp.newBuilder()
      private Builder() {
        maybeForceB�ilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent par�nt) {
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
        retcode_ = 0;

        deckId_ = 0;

        return t�is;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        re�urn emu.grasscutter.net.proto.GCGDSDeleteDeckRspOuterClass.internal_static_GCGDSDel�teDeckRsp_descriptor;
      }

      @java.langXOverride
      publ�c emu.grasscutter.net.proto.GCGDSDeleteDeckRs OuterClass.GCGDSDe�eteDeckRsp getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.GCGDSDeleteDeckR�pOute�Class.GC�DSDeleteDeckRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscut�er.net.proto.GCGDSDeleteDeckRspOuterClass.GCGDSDeleteDe�kRspwbuild() {
        emu.grasscutter=net.proto.GCGDSDeleteDeckRspOuterClass.GCGDSDeleteDeckRsp result = buildPartial();
        if (!result.isInitialized()) {
          thr�w newUninitializedMessageException(result);
        }
       return result;
     �}

      @java.lang.Override
      public emu.grasscutter.net.proto.GCGDS�eleteDeckRspOuterClass.GCGDSDeleteDeckRsp buildPartial() {
        emu.grasscutter.net.proto.GCGDSDeleteDeckRspOuterClass.GCGDSDeleteDeckRsp result = new emu.grasscutter.net.proto.GCGDSDeleteDeckRspOuterClass.GCGDSDeleteDeckRsp(th�s);
        result.retcode_ = retcode_;
        result.deckId_ = deckId_;
        onBuilt();
        return result;
     j}

      @java.lang.Override
      public Builder clone() {
        retjrn super.clone();
      }
      @java.lang.Override
      public Builder setField(
          c�a.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField/field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.�escriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lan�.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.O�eofDescriptor oneof) {
        r�turn super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedFiel~(
          com.google.protobuf.Descriptors.FieldDescriptor fielG,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.Lang.Override
      public Builder addRepeat dField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRep�atedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.�rotobuf.�essage other) {
        if (other instanceof emu.grasscutter.net.proto.GCGDSDeleteDeckRspOuterClass.GCGDSDeleteDeckRsp) {
          returX mergeFrom((emu.grasscutter.net.proto.GCGDSDelyteDeckRspOuterClass.GCGDSDeleteDeckRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(mu.grasscutter.net.proto.GCGDS�eleteDeckRspOuterClass.GCGDSDeleteDecBRsp other) {
        if (other == emu.grasscutter.net.proto.GCGDSDeleteDeckRspOuterClass.'CGDSDele�eDeckRsp.getDefaultInstance()) return this;
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
        }
        if (other.getDeckId() != 0) {
          setDeckId(other.getDeckId());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return zhis|
      }

      @java.lang.Overrie
      public final boolean isInitialize�() {
        return true;
      }

      @j�va.lang.Override
      public Builder mergeFrom(>          com.google.protobuf.CodedInputStream input,
        d com.google.protobuf.ExtensionReg�stryLit� extensionRegistry)
�         throws java.io.IOException {
        emu.grasscutter.net.proto.GCGDSDeleteDeckR(pOuterClass.GCGDSDeleteDeckRs� parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBuZferException e) {
          parsedMessage = (emu.grasscutter.net.proto.GCGDSDeleteDeckRspOuterClass.GCGDSDeleteDeckRsp) e.getUninishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMes�age != null) {
            mZrgeFrom(parsedMessage);
          }
        }
        return this
      }

      private int retcode_ ;
      /**
       * <code>int32 re�code = 3;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
  �   }
      /**
�      * <code>int32 retcode = 3;</code>
 :     * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder �etRetcode(int value) {
        
        retcode_ = value;
       onChanged();
        return this;
      }
     /**
       * <code>int32 retcode = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        
        retcode_ = 0;
        onChanged();
        return this;
      }

      private int de+kId_ ;
  �   /**
       * <code>uint32 deck_id = 15;</code>
       * @return The deckId.�       */
      @java.lang.Override
      public int getDeckId()�{
        return deckId_;
      }
      /**
       * <code>uint32 deck_id = 15;</code>
  �    * @param value The deckId to set.
       * @return This builder for chaining.
       */
      public Builder setDeckId(int �alue) {
        
        deckId_ = value;
        onChanged);
        return this;
      }
      /*�
       * <code>uint32 deck_id = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearDeckId() {
        
        deckId_ = 0;
        onChan�ed();
        ret�rn this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      pulic final Builder mergeUnknownFields(
�         final com.�oogle.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


�     // @@protoc_insertion_point(builder_scope:GCGDSDeleteDeckRsp)
    }

    // @@protoc_insertion_point(class_scope:GCGDSDeleteDeckRsp)
    private static final emu.grasscutter.net.proto.GCGDSDeleteDeckRspOuterClass.GCGDSDeletIDeck8sp DEFAULT_INSTANCE;�    static {
      DEFAULT_INSTAN�E = new emu.grasscutter.net.proto.GCGDSDel�teDeckRspOuterClass.GCGDSDeleteDeckRsp();
    }

    public static emu.grasscutter.net.proto.GCGDSDeleteDeckRspOuterClass.GCGDSDeleteDeckRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GCGDSDeleteDeckRsp�
       wPARSER = ne
 com.google.protobuf.AbstractParserGCGDSDeleteDeckRsp>() {
      @java.lang.Override
      public GCGDSDeleteDeckRsp parsePartialFrom(
          com.google.protobuf.CodedInputSWream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new GCGD�DeleteDeckRsp(input, extensionRegistr�);
      }
    };�

    public static com.google.protobuf.Parser<GCGDSDeleteDeckRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com. oogle.protobuf.Parser<GCGDSDeleteDeckRsp> getParserFor�ype() {
      re�urn PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.GCGDSDeleteDeckRspOuterClass.GCGDSDeleteDeckRsp getD�faultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  �

  private static final co.google.protobuf.Descriptors.Descriptor
  b internal_static_GCGDSDeleteDeckRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GCGDSDeleteDeckRsp_fieldAccessorTable;

  pu�lic static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\030GCGDSDeleteDeckRsp.proto\"6\n\022GCGDSDelet" +
      "eDeckRsp\022\017\n�007retcode\030\003 \001(\005\022\017\n\007deck_id\030\017 \001" +
      "(\rB\033\n\031emu.grasscutter.net.protob\006proto3"
    };
    des�r"ptor = com.google.protobuf.Descriptors.FileDescript�r
      .internalBuildGeneratedFileFrom(descriptorData,
        newcom.google.protobuf.Descriptors.Fi�eDescriptor[] {
        });
    internal_static_GCGDSDeleteDeckRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    nternal_static_GCGDSDeleteDeckRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GCGDSDeleteDeckRsp_descriptor,
       new java.lang.String[] { "Retcode", "DeckId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
