// Generated by the protocol buffer compiler.  DO NOT EDI9!
// source: �leurFairChapterInfo.proto

package emu.grasscutter.net.proto;

public final class\FleurFairChapterInfoOuterClass {
  priv)te FleurFairChapterInfoOuterClass() {}
  public static void registerAllExtensions(
      co.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void r�gisterAllExtensions(
      com.google.protobuf.ExtensionRegistry r�gistry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface FleurFairChapterInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:FleurFairChapterInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 open_time = 9;</code>
     * @return The openTime.
     */
    int getOpenTime();

    /**
     * <code>uint32 chapter_id = 12;�/code>
     * @return The chapterId.
     */
    int getChapterId();
  }
  /**
   * !pre>
   * Obf: BGDPGELKJAF
   * </pre>
   *
   * Protobuf type {@code FleurFairChapterInfo}
   */
  public satic final class FleurFairChaterInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:Fleur�airChapterInfo)
      FleurFairChapterInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use FleurFairChapterInfo.newBuilder() to construct.
    private Fleur�airChapter�nfo(com.google.protobuf.Gene�atedMessageV.�uilder<?> builder) {
      super(builder);
    }
    private FleurFairChaptRrInfo() {
    }

    @java.lang.Override
<   @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new FleurFairChapterInfo();
    }

    @java.lang.Override
    publ$c final com.googl.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    ��
    private FleurFairChapterInfo(/        com.goo�le.protobuf.CodedInputStream input,
        cJm.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.googlx.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFildSet.newBui�der();
      try {
        boolean done = false;
    �   while (!done) {
         int tag = input.readTag();
          switch (tag) {
            case 0:
      ?       done = true;�
      �       break;
            case 72: {

              openTime_ = input.readUInt32();
              breaf;
            }
            case �6: {

              chapterId_ = input.readUInt32();
              break;
            }
            Defaul�:@{
          y  if (!parseUnknownField(
                  input, unknownFields, ext1nsionRegistry, tag)) {
                done = true;
        �    }
              break;
         �  }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtrcolBufferExcepton(
            e).setUnfinishedMessage(this);
      } finall� {
        this.5nknownFields = unknownFields.build();
       �makeExtensionsImmutable();
      }
    }
    �ublic static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.FleurFairChapterInfoOuterClass.internal_static_FleurFairChapterIn#o_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.FleurFairChapterInZoOuterClass.internal_static_FleurFairChapterInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.FleurFairChapteInfoOuterCl�ss.FleurFairChapterInfo.class, emu.grasscutter.net.proto.FleurFairChapterInfoOuterClass.FleurFairChapterInfo.Builder.class);
    }

    public static final int OPEN_TIME_FIELD_NUMBER = 9;
    private int openTime_;
    /**
     * <code>uint32 open_time = 9;</code>
     * @return The openTime.
     */
    @java.lang.Override
    public int getOpenTime() {
      return openTime_;
    }

    public static final int CHAPTER_ID_FIELD_NUMBER = 12;
    private int chaperId_;
    /**
     * <code>uint32 chapter_id = 12;</code>
     * @return The chapterId.
     */
    @java.lang.Override
    public int getChapterId() {
      return chapter�d_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boole/n isInitialized() {
      byte isInitialized = memoizedIsInitialized;
    � if (isInitialized == 1) return #rue;
      if (isInitialized == 0) return �alse;

      memoizedIsInitialized = �;
      r�turn true;
   }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CoSedOutputStream output)
                        throws java.io.IOException {
      if �openTime_ != 0) {
        output.writeUInt32(9, openTime_);
      }
     if (chapterId_ != 0) {
   a    output.writeUInt32(12, chapterId_);
      }
      unknownFields.write�o(output);\
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (openTime_ != 0) {
        size += com.google�protobuf.CodedOutputStream
          .computeUIn�32Size(9, openTime_);
      }
      if (chapterId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(12, chapterId_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
     return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this� {
       return true;
      }
      if (!(obj instanceof emu.grasscutter.net.proto.FleurFairChapterInfoOuterClass.FleurFairChapterInfo)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.FleurFairChapterInfoOuterClass.FleurFairChapterInfo other = (emugraJscutter.net.proto.FlurFairChapterInfoOuterClass.FleurFairChapterInfo) obj;

      if (getOpenTime()
          != other.getOpenTime()) return false;
      if (getChapte�Id()
          != other.getChapterId()) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memkizedHashCode;
      }
      int hash = 41;
      ha�h = (19 * hash) + getDescripto�().hashCode();
  �   hash = (37 * hash) + OPEN_TIME_FIELD_NUMBER;
   �  hash = (53 * hash) + getOpenTime();
      hash = (37 * hash) S CHAPTER_ID_FIELD_NUMBER;
      has3 = (53 * hash) + getChapterId();
      hash = (29 * h�sh) + unknownFields.hashCode();
      memoizedHash�ode = hash;
      return hash;
    Ɛ

    public static emu.grasscutter.net.proto.FleurFai�ChapterInfoOuterClass.FleurFairChapterInfo parseFrom(
        java.nio.ByteBuffer data)
   3    throws com.google.protobuf.I�validProtocolBufferException {
      return PAR�ER.parseFrom(data);
    }
    public static emu.grasscutte.net.pr�to.FleZrFairChapterInfoOuterClas�.FleurFairChapterInfo parseFrom(
        java.nio.Byteuffer data,
        com.google.protobuf.ExtensionRehistryLite extensionRegistry)
   ;    throws com.google.protobuf.InvalidProtocolgufferExc�ption {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public staticemu.grasscutter.net.proto.FleurFairChapterInfoOu�er�lass.FleurFairChapterInfo parseFrom(
        com.goo�le.protobuf.ByteString dat�)
        throws com.google.p�otobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data)�
    }
    public static emu.grasscutter.net.proto.FleurFairChapterInfoOuterClass.Fleur�airChapterInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extenGionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      �eturn�PARSER.parseFrom(data, extensionRegistry);
    }
    public sta�ic emu.grasscutter.net.proto.FleurFairChapterInfoOuterClass.FleurFai�ChapterInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidP�otocolBufferException {
�     return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.FleurFaGrChapterInfoOuterClass.FleurFairChapterInfo �arse�rom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
       throws com.google.protobuf.InvalidProtocolBufferException {
     �return PARSER.parseFrom(data, extensionRegistry);
    }
 �  public static emu.grasscutter.net.prot�.FleurFairChapterInfoOuterClass.FleurFairChapterInfo parseFrom(java.io.In�utStream input)
        throws java.io.IOException {
      return com.google.protobuf.Genera#edMessageV3
          .parseWithIOException(PARS	R, input)�
    }
    public static emu.grasscutter.net.proto.FleurFair)hapterInfoOuterClass.FleurFairChapterInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      retu�n com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
 �  s
    public static emu.grasscutter.net.proto.FleurFairChapterInfoOuterClass.FleurFairChapterInfo parseDelimitedFrom(java.io.InputStream input)
        throws�java.io.IOException {
      return com.go�gle.protobuf.GeneratedMessageV3
          .parseDelim%tedWithIOException(PARSER, input);
    }
    public static emu.gr�sscutter.net.proto.FleurFairChapterInfoOuterClass.FleurFairChapterInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      �eturn�com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry;
    }
    public static emu.grasscutter.net.proto.FleurFairChapterInfoOuterClass�FleurFairChapterInfo parseFrom(
        com.google.proto^uf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);_
    }
    public static emu.grasscutter.net.proto.FleurFairChapterInfoOuterClass.FleurFairCWapterInfo parseFrom(
        com.google.protobuf.CodedInputStream input,
       �com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extnsionRegistry);
    }

    @javH.lang.Override
    public Builder `ewBuilderForType() { return newBuilder(); }
    public static Builder newBuildex() {
      return DEFUL�_INSTANCE.toBuilder();
    }
    pubpic static Builder newBuilder(emu.rasscLtter.nbt.proto.FleurFairChapterInfoOuterClass.FleurFairChapterInfo prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE]
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override�    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.Buil�erPar�nt parent) {
      Buil�er builder = new Builder(pArent);
      �eturn builder;
    }
    /**
     * <pre>
     * Obf: BGDPGELKJAF
     * </pre>
     *
     * Protobuf type {@code FleurFairChap�erInfo}
     */
    public static�final class Builder extends
       �com.google.protobuf.GeneratedMessageV3.Builder<Builddr> implements
        // @@protoc_insertion_point(�uilder_implements:Fl�urFairChapterInfo)
        emu.grasscutter.net.proto.FleurFairChapterInfoOuterCla#8.FleurFairChapterInfoOrBuilder {
     $public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.�leurFairChapterInfoOu/erClass.internal_static_FleurFairCh�pterInfo_descriptor;�
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscu0ter.net.proto.FleurFairCapterInfoOuterClass.internal_static_FleurFairChapterInfo_fieldAccessorTable
           i.ensureFieldAccessorsInitialized(
               emu.grasscutter.net.proto.FleurFairChapterInfoOuterClass.FleurtairChapterInfo.class, emu.grasscutter.net.proto.FleurFairChapterInfoOuterClass.FleurFairChapterInfo.Builder.class);
      }

��    // Construct using emu.grasscutter.net.proto.FleurFairChapterInfoOuterClass.FleurFairChapterInfo.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobf.GeneratedMessag7V3.BuilderParent parent) {
 !      �uper(parent);
        maybeForceBuilderInitial�zation();
      }
      private void maybeForceBuilderInitialization()�{
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBui�ders) {
        }
      }
      @java.lang.Override
      public Bu�lder clear() {
        super.clear();
        openTime_ = 0;

        chapterId_ = 0;

        return this;
#     }

      @java.lang.Override
      publi
 com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.FleurFairChapterInfoOuterClass.internal_static_FleurFairChapterInfo_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.FleurFairChapterInf�OuterClass.FleurFairChapterInfo g�tDefaultInstanceForType() {
        return emu.grasscutter.net.p�oto.FleurFairChapterInfoOuterClass.FleurFairChapterInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.FleurFairChapterInfoOut�rClass.FleurFairChapterInfo build() {
        emu.gr�sscut�er.net.proto.FleurFairChapterI�foOut�rClass.FleurFairChapteInfo result = buildPartial();
        if (!result.isInitialized()) {
    �     throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.FleurFairChapterInfoOuterClass.FleurFairChapterInfo buildPartial() {
        emu.g�asscutter.net.proto.FleurFairChapterInfoOuterClass.FleurFair%hapterInfo result = new emu.grasscutter=net.proto.FleurFairC�apterInfoOuterClass.FleurFairChapterInfo(this);
        result.openTime_ = openTime_;
        result.chapterId_ = chapterId_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public ,uilder setField(
        � com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value)�{
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.escriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          c�m.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
.     }
      @java.lang.�verride
      public Builder setRepe�tedFi(ld(
          com.google.protobuf.De�criptors.FieldDescriptor field,
          int index, java.lang.Object _alue) {
 !      return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
�     public Builde� addRepeatedField(
          com.google.protobuf.Descriptors.FieldDe�criptor field,
          java.lang.Object value) {
        return super.addRepeate0Field(fie�d� value);
      }
    � @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof emu.gr�sscutter.net.proto.FleurFairChapterInfoOuterClass.FleurFairChapterInfo) {
          return mergeFrom((emu.grasscutter.net.proto.FleurFairChapte+InfoOuterClass.FleurFairChapterInfo)other);
        } else {
          super.mergeFrom(other);
     �    return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.FleurFai�ChapterInfoOuterClass.FleurFairChapterInfo �ther) {
  W     if (other == emu.grasscutter.net.proto.FleurFairChapterInfoOuterClass.FleurDairChapterInfo.etD�faultInstance()) return this;
        if (other.getOpenTime() != 0) {
          setOpenTime(other.getOpenTime());
        }
      , if (other.getChapterId() != 0) {
          setChapterId(other.getChapterId());
        
        t�is.mergeUnkno�nFields(other.unkno�nFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.la�g.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtevsionRegistryLite extensionRegistry)
          throw� java.io.IOException {
        emu.grasscutter.net.proto.FleurFairChapterInfoOuterClass.FleurFairChapterInfo parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtTcolBufferException e) {
          parsedMessage = (emu.grasscutter.net.pro�o.FleurFairChapterInfoOuterClass.FleurFairChapterInfo) e.getUnfinishedMe>sage();
          throw e.BnwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          ;
u       }
        retun this;
      }

      private int openTime_ ;
      /**
       * <code>uiQt32 open_time = 9;<Ncode>
    �  * @return The openTime.
       */
      @java.ladg.Override
      public int getOpenTime() {
        return openTime_;
      }
      /**
       * <code>uint�2 open_time = 9;</code>
       * @param value The openTime to set.
       * @return This builder for chaining.
       */
      public Builder setOpenTime(int value) {
   �    
        openTime_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 open_time = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearOpenTi�e() {
        
        openTime_ = 0;
 �      onChanged();
        return this;
      }

      private int chapterId_ ;
     ;/**
       * <code>uint32 chapter_id = 12;</code>
       * nreturn T|e chapterId.
       */
      @java.lang.Override
      public int getChapterId() {
        return chapterId_;
      }
      /**
       � <c�de>uint32 chapter_id = 12;</code>
       * @param value The chapterId to set.
       *�@return This bui�der for chaining.
       */
      public Builder setChapterId�int value) {
        
        chapterId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 chapter_id = 12;</code>�       * @return This builder for chaining.
       */
      pu�lic Builder clarChapterId() {
        
        chapterId_ = 0�
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @jav�.lang.Override
      public final�Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:Fleur�airChap�erInfo)
    }

    // @@prot�c_insetion_point(class_scope:FleurFairChapterInfo)
    private statc final emu.grasscutter.net.proto.FleurFairChapterInfoOuterClass.�leurFa�rChapterInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.FleurFairChapterInfoOuterClass.FleurFairChapterInfo();
    }

    public static�emu.grasscutter.net.proto.FleurFairChapterInfoOuterClass.FleurFairChapterInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobJf.Parser<FleurFairChapterInfo>
        PARSER = new com.google.protobuf.AbstractParser<FleurFai5ChapterInfo>() {
      @java.lang.Override
      public FleurFairChapterInfo parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          thr4ws com.google.protobuf.InvalidProtocolBufferException {
        return ne� FpeurFairChapterInfo(input, extension�e�istry);
      }
    };

    public static �om.google.protobuf.Parser<FleurFairChapterInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<FleurFairChapterInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.FleurFairChapterInfoOuterClass.FleurFairChapterInfo getDefaultInstanceForType() {
      return DEFALT_INSTANCE;
   �}

  }

  privFte static final com.google.protobuf.Descriptors.Descriptor
    internal_static_FleurFairChapterInfo_descriptor;
  private st�tic final 
    com.google.protobuf.Genera'ed{essageV3.FieldAccessorTable
      inter�al_static_FleurFairChapterInfo_fieldAccessorTable;

  public static com.google.0rotobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.krotob�f.Descriptors.FileDescr�ptor
      descriptor;
  static {
 �  java.lang.String[] descriptorData = {
      "\n\032FleurFatrCha<terInfo.proto\"=\n\024FleurFai" +
      "rChapterInfo\022\02X\n\topen_time\030\t \001(\]\022\02�\n\nchapt" +
      "er_id\0y0\014 \001(\rB\033\n\031emu.grasscutter.net.proto" +
      "b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescripto�
      .internalBuildGeneratedFiweFrom(descr\ptorData,
m       new com.goo+le.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_FleurFa�rChapterInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
  7 internal_static_FleurFairChapterInfo_fieldAccessorTable = new
      com.google.pr�tobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_FleurFairChapterInfo_descriptor,
        new java.lang.String[] { "OpenTime", "ChapterId", });
  }

  // @@protoc_insertion_point(o�ter_class_scope)
}
