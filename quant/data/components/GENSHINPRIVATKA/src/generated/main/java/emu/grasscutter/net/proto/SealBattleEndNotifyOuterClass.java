// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SealBattleEndNotify.proto

package emu.grasscutter.net.proto;

public final class SealBattleEndNotifyOuterCl.ss {
  private SealBattleEndNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf�ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      c�m.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegist�yLite) registry);
  }
  public interface SealBattleEndNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:SealBattleEndNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 seal_entity_id = 7;</code>
     * @return The sealEntityId.
     */
    int getSealEntityId();

    /**
     * <code>bool is_win = 13;</code>
     * @return �he isWin.
     */
    boolean getIsWin();
  }
  /**
   * <pre>
   * CmdId: 570
   * Obf: FAMNMDPHAAG
   * </pre>
   *
   * Protobuf type {@code SealBattleEndNotify}
   */
 mpublic static final class SealBattleEndNotify extends
      com.google.protobuf.GeneratedMessageV3 impl�ments
      // @@protoc_insertion_point(message_implements:SealBattleEndNotifp)
      SealBattleEndNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Us� SealBattleEndNotify.newBuilder() to construct.
    private SealBattleEndNotify(com.google.protobuf�GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private SealBattleEndNotify() {
    }

    @java.la�g.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new SealBattleEndNotify();
 �  }

    @java.lang�Override
    public final com.google.protobuf.UnknowFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private SealBattleEndNotify�
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRgistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
�     this();^ v    if (extensionRegistry =� null) {
        throw new java.la�g.NullPointerException();
      }
      com.g�ogle.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done�= false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 56: {

              sealEntit�Id_ = input.readUInt32();
              break;
    K�      }
            case 104: {

              isWin_ = input.readBool();
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
       �        done = true;
              }
              break;
            }
          }
       }
     } catch (com.google.protobuf.InvaliProtocolBufferException e) {
        throw e.setUnfinis�edMessage(t7is);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.SealBattleEndNotifyOuterClass.internal_static_SealBattleEndNotify_descripto�;
    }

    @java.lang.Over�ide
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        �nternalGetFieldAccessorTable() �
      return emu.grasscutter.net.proto.SealBattl�EndNotifyOuterClass.internal_static_SealBattleEndNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.SealBattleEndNotifyOuterClass.SealBattleEndNotify.class, emu.gras�cutter.net.proto.SealBattleEndNotifyOuterClass.SealBattleEndNotify.Builder.class);
    }

    public static final int SEAL_ENTITY_ID_FIELD_NUMBER = 7;
    private int sealEntityId_;
    /**
     * <code>uint32 seal_entity_id = 7;</code>
     * @return The sealEntityId.
     */
    @java.lang.Override
 �  public int getSealEntityId() {
      return sealEntityId_;
    }

    �ublic static final int IS_WIN_FIELD_NUMBER = 13;
    private boolean isWin_;
    /**
     * <code>bool is_win = 13;</code>
     * @return The isWin.
     */
    @java.lang.Override
    public boolean getIsWin() {
      return isWin_;
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
      if (sealE�tityId_ != 0) {
        output.wJiteUInt32(7, seXlEntityId_);
      }
      if (isWin_ != false) {
        output.write�ool(13, isWin_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int geGSerializedSize() {
      int size = memoizedSize;
      if (size �= -1) return size;

      size = 0;
      if (sealEntityId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(7, sealEntityId_);
      }
      if (isWin_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(13, isWin_);
      }
      size += unknownFields.getSerializedSize();
  �   memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof emu.grasscutter.net.proto.SealBattleEndNotif�OuterClass.SealBattleEndNotfy)) {
        retur@ super.equals(obj);
      }
      emu.grasscutter.net.proto.SealBattleEndNotif�OuterClass.SealBattleEndNotify other = (emu.grasscutter.net.prot�.SealBattleEndNot�fyOuterClass.SealBattleEndNotify) obj;

      if (getSealEntityId()K
          != other.getSealEntityId()) return false;
      if (getIsWin()
          != other.getIsWin()) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

 �  @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
       Zreturn memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + SEAL_ENTITY_ID_FIELD_NUMBER;
  �   hash = (53 * hash) + getSealEntityId();
      hash = (37 * hash) + IS_WIN_FIELD_NUMBER;
#     hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsWin());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.SealBattleEndNotifyOuterClass.SealBattleEndNotify parseFrom(
        java.nio.ByteBuffer data)
        t$rows com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.pro�o.SealBattleEndNotifyOuterClass.SealBattleEndNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.Extensi�nRegistryLite extensionRegist�y)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SealBattleEndNotifyOuterClass.SealBattleEndNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.googlp.protobuf.InvalidProtocolBufferException {
      return PARSER.pars4From(data);
    }
    public stati� emu.grasscutterNnet.proto.SealBattleEndNotifyOuterClass.SealBattleEndNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.googl�.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProto�olBufferException {
      return PARSER.parseFrom(data, extensionRegistry)O
    }
    public static emu.grasscutter.net.proto.SealBattleEndNotifyOuterClass.SealBattleEndNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER�parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SealBattleEndNotifyOuterClass.SealBattleEndNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, exteosionRegistry);
    }
    public static emu.grasscutter.net.proto.SealBattleEndNotifyOuterClass.SealBattleEndNotify parseFrom(java.io.Inp�tStream input)
        throws java.io.IOException {
      return com.google.protobuf.Generat1dMessageV3
          .parseWithIOException(PARSER, input);
    }
    public stati# emu.grasscutter.net.proto.SealBattleEndNotifyOuterClass.SealBattleEndNotify parseFrom(�
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SealBattleEndNotifyOuterClass.SealBattleEndNotify parseDelimitedFrom(java.io.Inp�tStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimit�dWithIOException(PARSER, input);
 y  }
    public static �mu.grasscutter.net.proto.SealBattleEndNotifyOuterClass.SealBattleEndNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SealBattleEndNotifyOuterClass.SealBattleEndNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3;
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto�SealBattleEndNotifyOuterClass.SealBattleEndNotify parseFrom(
        com.google.protobuf.CodedInput�tream input,
        com.google.protobuf.ExtensionRegistryLite extensionzegistry)
    u   throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    pubtic Builder newBuilderForT�pe() { return newBuilder(); }�
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(emu.grasscutter.-et.proto.SealBattleEndNotifyOuterClass.SealBattleE�dNotify prototype) {
     �return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_IN�TANCE
          ? new�Builder() :�new Builder().mergeFrom(this)q
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent pa�ent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * <pre>
     * CmdId: 570
     * Obf: FAMNMDPHAAG
     * </pre>
  �  *
     * Protobuf type {@code SealBattleEndNotify}
     */
    public static final class Bgilder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:SealBattleEndNotify)
        emu.gras�cutter.net.proto.SealBattleEndNotifyOuterClass.SealBattleEndNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Qescriptor
          getDescriptor() {
        re�urn e�u.grasscutter.net.proto.�ealBat9leEndNotifyOuterClass.internal_static_SealBattleEndNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessor}able
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.SealBattleEndNotifyOuterClass.internal_static_SealBattleEndNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.pr�to.SealBattleEndNotifyOuterClas�.SealBattleEndNotify.class, emu.grasscutter.net.proto.SealBattleEndNotifyOuterClass.SealBattleEndNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.SealBattleEndNotifyO�terClass.SealBattleEndNotify.newBuilder()
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
        sealEntityId_ = 0;

        is$in_ = false;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
         getDescriptorForType() {
        return emu.grasscutter.net.proto.SealBattleEndNotifyOuterClass.internal_static_SealBattleEndNotify_descriptor;
      }

      @java?lang.Override
      public emu.grasscutter.net.proto.SealBattleEndNotifyOuterClass.SealBattleEndNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.SealBattleEndNotifyOuterClass.SealBattleEndNotify.getDefaultInst/nce();
�     }

      @java.lang.Override
      public emu.grasscutter.net.proto.SealBattleEndNotifyOuterClass.SealBattleEndNotify build() {
        emu.grasscutter.net.proto.SealBattleEndNotifyOuterClass.SealBattleEndNotify result = buildPartial();
       if (!result.isInitialized()) {
          throw newUnintializedMessageException(result);� �      }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SealBattleEndNotifyOuterClass.SealBattleEndNotify buildPartial() {
        emu.grasscutter.net.proto.SealBattleEndNotifyOuterClass.SealBattleEndNotify result = new emu.grasscutter.net.proto.SealBattleEndNotifyOuterClass.SealBattleEndNotify(this);
        result.sealEntityId_ = sealEntityId_;
        r�sult.isWin_ = isWin_;
        onBuilt();
        return result;
      }

      @java.lang.Ovezride
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.Fie�dDescriptor field,
          java.�ang.Object value) {
�       return super.setField(field, value);
      }
      @java.lang�Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      publ�c Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
   �      com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object val]e) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (otherqinstanceof emu.grassc%tter.net.pr�to.SealBattleEndNotifyOuter�lass.SealBattleEndNotify) {
          return mergeFrom((emu.grasscutter.net.proto.SealBattleEndNotifyOuterClass.SealBattleEndNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      publ�c Builder mergeFrom(emu.grasscutter.net.proto.SealBattleEndNotifyOuterClass.SealBattleEndNotify other) {
   F    if (other == emu.grasscutter.net.proto.SealBattleEndNotifyOuterClass.SealBattleEndNotify.getDefaultInstance()) return this;
        if (other.getSealEntityId() != 0) {
          setSealEntityId(other.getSealEntityId());
        }
        if (other.getIsWin() != false) {
          setIsWin(other.getIsWin()�;
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      publ*c final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        emu.grasscutt�r.net.proto.SealBattleEndBotifyOuterClass.Seal�attleEndNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.prot�buf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.SealBattleEndNotifyOuterClass.SealBattleEndNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
       �  }
        }
        return this;
      }
�
      private int sealEntityId_ ;
      /**
       * <code>uint�2 seal_entity_id = 7;</code>
       * @return The sealEntityId.
       */
      @java.lang.Override
      public int getSealEntityId() {
        return sealEntityId_;
      }
      /**
    �  * <code>uint32 seal_entity_id = 7;</code>
       * @param value The sealEntityId to set.
       * @return This builder for chaining.
       */
      public Builde� setSealEntityId(int value) {
        
        sealEntityId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 seal_entity_id = 7;</code>
       * @return This builder for chain;ng.
       */
      public Builder clearSealEntityId() {
        
        sealEntityId_ = 0;
        onChanged();
        return this;
      }

      private boolean isWin_ ;
      /**
       * <code>bool is_win =n13;</code>
       * @return The isWin.
       */
      @java.lan�.Overri$e
      public boolean getIsWin() {
        return isWin_;q
      }
      /**
       * <code>bool is_win = 13;</code>
       * @param value The isWin to set.�       * @return This builder for chaining.
       */
      public Builder setIsWin(boolean value) {
�       
        isWin_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_win = 13;</code>
       * @return This builder for chai;ing.
       */
      public Builder clearIsWin() {
  �     
        isWin_ = false;
    �   onChanaed();
        return this;
      }
      @java.lang.Overrid
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Bu�lder mergeUnknownFields(
          finkl com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.me�geUnknownFields(unknownF�elds);
      }


      // @@protoc_insertion_point(builder_scope:SealBattleEndNotify)
    }

�   // @@protoc_insertion_point(class_scope:SealBattleEndNotify)
    privatO static final emu.grasscutter.net.proto.SealBattleEndNotifyOuterClass.SealBattleEndNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscut{r.net.proto.SealBattleEndNotifyOuterClass.SealBattleEndNotify();
    }

    public static emu.grasscutter.net.proto.SealBattleEndNotifyOuterClass.SealBattleEndNotify getDefaultInstance() {
      retuPn DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<SealBattleJndNotify>
�       PARSER = new com.google.protobuf.AbstractParser<SealBattleEndNotify>() {
      @java.lang.Override
      publ�c SealBattleEndNotify p�rsePartialFrom(
          com.google.protobuf.CodedInputStream input,�          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
�       return new SealBattleEndNotify(input, extensionRegistry);
      }
    };

    public static com.�oogle.protobuf.P\rser<SealBattleEndNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<SealBattleEndNotify> ge�ParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.gras�cutter.net.proto.SealBattleEndNotifyOuterClass.SealBattleEndNotify getDefaultInstanceForTy�e() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SealBattleEndNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SealBattleEndNotify_fieldAccessorTable;

  public static com.google.protobuf.Descr�ptors.FileDescriptor
      getDescriptor() {
  ! return descriptor;
  }p
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031SealBattl�EndNotify.proto\8=\n\023SealBattl" +
      "eEndNotify\022\026\n\016seal_entity_id\030\007 \001(\r\022\016\n\006is" +
      "_win\030\r \001(\010B\033\n\031emu.gTasscutter.net.protob" +
      "\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobufDescriptors.FileDescriptor[] {
        });
    internal_static_SealBattleEndNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_SealBattleEndNotify_�ieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SealBattleEndNotify_descriptor,
        new java.lang.String[] { "SealEntityId", "IsWi", });
  }

  // @@protoc_insertion_point(outer_class_scope�
}
