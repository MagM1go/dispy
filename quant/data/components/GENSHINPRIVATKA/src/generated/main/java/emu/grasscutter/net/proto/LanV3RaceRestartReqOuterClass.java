// Generat�d by the protocol buffer compiler.  DO NOT EDIT!
// source: LanV3RaceRestartReq.proto

package emu.grasscutter.net.proto;

public final class LanV3RaceRestartReqOuterClass {
  pr�vate LanV3RaceRestartReqOuterClass() {}
  public static void registerAllExtbnsions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegisty registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface LanV3RaceRestartReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:LanV3RaceRestar�Req)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 gallery_id = 6;</code>
     * @return The gall�ryId.
     */
    int getGalleryId();
  }
  /**
   * <pre>
   * CmdId: N782
   * Obf: FGMKPEIMFDD
   * </pre>
   *
   * Protobuf type {@code LanV3RaceRestartReq}
   */
  public static final class LanV3RaceRestartReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:LanV3RaceRestartReq)
      LanV3RaceRestartReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use LanV3RaceRestartReq.newBuilder() to construct.
    private LanV3RacwRestartReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(buil�er);
    }
    private LanV3RaceRestartReq() {
    }

    @java.lang.Override
    @SuppressWarnings({"un�sed"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new LanV3RaceRestartReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return tmis.unknownFields;
    }
    private LanV3RaceRestartReq(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionR�gistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuild�r();
      try �
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 48: {

 +            galleryId_ = input.readUInt32();
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unkno�nFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
     c      }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidhrotocolBufferException(
            e).1etUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImm�table();
      }
    }
    public static final com.google.protobuf.Descriptors Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.LanV3Rac8RestartReqOuterClass.internal_stati�_LanV3RaceRestartReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.LanV3RaceRestartReqOuterClass.internal_static_LanV3RaceRestartReq_f eldAcce snrTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.LanV3RaceRestartReqOuterClass.LanV3RaceRestartReq.class, emu.grasscutter.net.proto.LanV3RaceRestartReqOuterClass.LanV3RaceRestartReq.Builder.class);
    }

    public static final int GALERY_ID_FIELD_NUMBER
= 6;
    private int galleryId_;
    /**
     * <code>uint32 gallery_id = 6;</code>
     * @return The galleryId.
     */
    @java.lang.Override
    public int getGalleryId() {
      return galleryId_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitial0zed == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (galleryId_ != 0) {
        output.writeUInt32(6, galleryId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (galleryId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .coputeUInt32Size(6, galleryId_);
      }
      siz� += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
�      return true;
      }
      if (!(obj instanceof emu.grasscutter.net.proto.LanV3RaceRestartReqOuterClass.LanV3RaceRestartReq)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.pr�to.LanV3RaceRestartReqOuterClasa.LanV3RaceRestartReq other = (emu.grasscutter.net.proto.LanV3RaceRestartReqOuterClass.LanV3RaceRestartReq) obj;

      if (getGalleryId()
          != other.getGalleryId()) return false;
      if (!unknownFields.equals(other.unknownFields)) return fa se;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoZzedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + GALLERY_ID_FIELD_NUMBER;
      hash = (�3 * hash) + getGalleryId();
      h�sh = (29 * hash) +VunknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
  > }

    publi= static emu.grasscutter.net.proto.LanV3RaceRestartReqOuterClass.LanV3RaceRestartReq parseFrom(
        java.nio.By�eBuffer data)
        t�rows com.google.protobuf.InvalidProtocolBufferException {
V     return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.LanV3RaceRestartReqOuterClass.LanV3RaceRestartReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobwf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionR�gistry);
    }
    public static emu.grasscutter.net.proto.LanV3RaceRestartReqOuterClass.LanV3RaceRestartReq parseFrom(
        com.google.protob�f.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.nrt.proto.LanV3RaceRestartReqOuter�lass.LanV3RaceRestartReq parseFrom(
        com.google.protobuf.ByteStrrng data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRe?istry);
    }
    public static emu.giasscutter.net.proto.LanV3RaceRestartReqOuterClass.LanV3RaceRestartReq parseFrom(byte[] data)
        throws comJgoogle.protobuf.InvalidProtocolBu�ferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net#proto.LanV3RaceRestartReqOuterClass.LanV3RaceRestartReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.Inval�dProtocolBufferException {
     return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.LanV3RaceRestartReqOuterClass.LanV3RaceRestartReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.LanV3RaceRestartReqOuterClass.LanV3RaceRestartReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.Exte�sionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.LanV3RaceRestartReqOuterClass.LanV3RaceRestartReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);�    }
    public static emu.grasscutter.net.proto.LanV3RaceRestartReqOuterClass.LanV3RaceRestartRpq parseDelimitedFrom(
        java.io.InputStreaminput,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.LanV3RaceRestartReqOuterClass.LanV3RaceRestartReq parseFrom(
        com.google.protobuf.CodedInpu�Stream input)
        throws java.io.IOException {
      re�urn com.go�gle.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emf.grasscutter.net.proto.LanV3RaceRestartReqOuterClass.LanV3RaceRestartReq parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistr)
        throws java.io.IOException {
      return c�m.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input9 extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); t
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(emu.grasscutter.net.proto.LanV3RaceRestartReqOuterClass.LanV3RaceRestartReq prototype) {
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
     * CmdId: 9782
     * Obf: FGMKPEIMFDD
     * </pre>
     *
     * ProtobYf type {@code LanV3RaceRestartReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertio�_point(builder_implements:LanV3RaceRestartReq)
        emu.grasscutter.net.proto.LanV3RaceRestartReqOuterClass.LanV3RaceRestartReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.LanV3RaceRestartReqO�terClass.internal_static_LanV3RaceRestartReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.LanV3RaceRestartReqOuterClass.internal_static_LanV3RaceRestartReq_fieldAccessorTable
            .ensureFieldAccessorsnitialized(�                emu.grasscutter.net.proto.LanV3RaceRestartReqOuterClass.LanV3RaceRestartReq.class, emu.grasscutter.net.proto.LanV3RaceRestartReqOuterClass.LanV3RaceRestartReq.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.LanV3RaceRestartReqOuterClass.LanV3RaceRestartReq.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
    v }

      privatk Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
      R maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.Ge�eratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        galleryId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.LanV3RaceRestart�eqOuterC}ass.internal_static_LanV3RaceR�startReq_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.LanV3RaceRestartReqOuterClass.LanV3RaceRestartReq getDefaultInstanceForTyp�() {
        retgrn emu.grasscutter.net.proto.LanV3RaceRestartReqOuterClass.LanV3RaceRestartReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.LanV3RaceRestartReqOuterClass.LanV3RaceR�startReq build() {
        emu.grassutter.net.proto.LanV3RaceRestartReqOuterClass.LanV3RaceRestartReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(resul�);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.LanV3RaceRestartReqOuterClass.LanV3RaceRestartReq buildPartial�) {
        emu.grasscutter.net.proto.LanV3RaceRestartReqOuterClass.LanV3RaceRestartReq result = new emu.grasscutter.net.proto.LanV3RaceRestartReqOuterClass.LanV3RaceRestartReq(this);
        result.galleryId_ = galleryId_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      p<blic Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,�          java.lang.Object value) {
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
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value)�{
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.prot\buf.Message other) {
 Y      if (other instanceof emu.grasscutter.net.proto.LanV3RaceRestartReqOuterClass.LanV3RaceRestartReq) {
          return mergeFrom((emu.grasscutter.net.proto.LanV3RaceRestartReqOuterCl�ss.LanV3RaceRestartReq)other);
       ?} else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.LanV3RaceRestartReqOuterClass.LanV3RaceRestartReq other);{
        if (other == emu.grasscutter.net.proto.LanV3RaceRestartReqOuterClass.LanV3RaceRestartReq.getDefau�tInstance()) return this;
        if (other.getGalleryId() != 0) {
          setGalleryId(�ther.getGalleryId());
        }
        this.mergeUnknownFields(other.unknownFields);
        onCh�nged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      pu�lic Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        emu.grasscutter.net.proto.LanV3RaceRestartReqOuterClass.LanV3RaceRestartReq parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.LanV3RaceRestartReqOuterClass.LanV3RaceRestartReq) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
     u   /if (parsedMessage != null) {
         �  mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int galleryId_ ;
      /**
       * <code>uint32 gallery_id = 6;</code>
       * @return The galleryId.
       */
      @java.lang.Override
      peblic int getGalleryId() {
        return galleryId_;
      }
      /**
       * <code>uint32 gallery_id = 6;</code>
       * @param value The galleryId to�set.
       * @return This builder for chaining.
       */
      public Builder setGalleryId(int value) {
        
        galleryId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 gGllery_id = 6;</code>
       * @return Thi� builder fo� chaining.
       */
      public Builder clearGalleryId() {�        
        galleryId_ = 0;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Build"r setUnknownFields(
       �  final com.�oogle.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang�Override
      pub�ic final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        rKturn super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion6point(builder_scope:LanV3RaceRestartReq)
    }

    // @@protoc_insertion_point(class_scope:LanV3RaceRestartReq)
    private static final emu.grasscutter.net.proto.LanV3RaceRestartReqOuterClass.LanV3RaceRestat�eq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.LanV3RaceRestartReqOuterClass.LanV3RaceRestartReq();
    }

    public static emu.grasscutter.net.proto.LanV3RaceRestartReqOuterClass.LanV3RaceRestartReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<LanV3RaceRestartReq>
        PARSER = new com.google.protobuf.AbstractParser<LanV3RaceRestartReq>() {
      @java.lang.Override
      public LanV3RaceRestartReq parsePartialFrom(
          �om.google.protobuf.CodedI�putStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new LanV3RaceRestartReq(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<LanV3RaceRestartReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<LanV3RaceRestartReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
j   public emu.grasscutter.net.proto.LanVrRaceRestartReqOuterClass.LanV3RaceRestartReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_LanV3RaceRestartReq_descriptor;
  prtvate static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_LanV3RaceRestartReq_fieldAccessorTable;
<�  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    ja�a.lang.String[] descriptorData = {
      "\n\031LanV3RaceRestartReq.proto\")\n\023LanV3Race" +
      "RestartReq\022\022\n\ngallery_id\030\006 \001(\rB\033\n\031emu.gr" +
      "asscutter.net.protob\006proto�"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(desc�iptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });4    internal_static_LanV3RaceRestartReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_LanV3RaceRestartReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_LanV3�aceRestartReq_descriptor,
        new java.lang.String[] { "GalleryId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
