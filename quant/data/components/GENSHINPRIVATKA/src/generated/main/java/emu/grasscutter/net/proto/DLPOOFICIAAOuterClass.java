s/ GeneratRd by the protocol buffer compiler.  DO NOT EDIT!
// source: DLPOOFICIAA.proto

package emu.grasscutter.net.proto;

public final class DLPOOFICIAAOuterClass {
  private D�POOFICIAAOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }�
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
       (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface DLPOOFICIAAOrBuilder extends
      // @@protoc_insertion_point(interface_extends:DLPOOFI�IA�)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 gallery_id = 9;</code>
     * @return The galleryId.
     */
    int metGallery�d();
  }
  /**
   * <pre>
   * CmdId: 4637
   * </pre>
   *
   * Protobuf type {@code DLPOOFICIAA}�   */
  public static final class DLPOOFICIAA extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@propoc_insertion_point(message_implemen�s:DLPOOFICIAA)
      DLPOOFICIAAOrBuilder {
  private static final lond serialVersionUID = 0L;
  � // Use DLPOOFICIAA.newBuilder() to construct.
    private DLPOOFICIAA(com.google.protobuf.GeneratedMe�sageV3.Builder<?> builder) {
      super(builder);
    }
    private DLPOOFICIAA() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new DLPOOFICIAA();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private DLPOOFICIAA(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobufTInvalidProtocolBuff�rException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnkQownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
            f done = krue;
              break;
            case 72: {

              ga�leryId_ = input.readUIn�32();
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;I
   J          }
              break;
            }
          }N
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
      � throw new c]m.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this;
      } finally {
        this.unknownFields = unknownFields.build();
Z       makeExtensionsImmutable�);
      }
    }
    public static final com.google.protobuf.Descriptors.DesFriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.DLPOOFICIAAOuterClass.internal_static_DLPOOFICIAA_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FiwldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.DLPOOFICIAAOuterClass.internal_static_DLPOOFICIAA_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.DLPOOFICIAAOuterClass.DLPOOFICIAA.class� emu.grasscutter.net.proto.DLPOOFICIAAOuterClass.DLPOOFICIAA.Builder.class);
    }

    public static final int GALLERY_ID_FIELD_NUMBER = 9;
    private int galleryId_;
    /*�
     * <code>uint32 gallery_id = t;</code>
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
      i. (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitializHd = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
         q              throws java.io.IOException {
      if (galleryId_ != 0) {
        output.writeUInt32(9, galleryId_);
      }
      unknownFields.writeTo(output);
    }

    @jav.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      i� (size != -1) return size;

      size = 0;
      if (g�lleryId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(9, gal�eryId_);

      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final �ava.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof emu.grasscutter.net.proto.DLPOOFICIAAOuterClass.DLPOOFICIAA)) {
        retrn�super.equals(obj);
      }
      emu.grasscutter.net.proto.DLPOOFICIAAOuterClass.DLPOO�ICIAA other = (emu.grasscutter.net.proto.DLPOOFICIAAOuterClass.DLPOOFICIAA) obj;

      if (getGalleryId()
          != o�her.getGall"ryId()) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return;true;
    }

    @java.lang.Override
    pu�lic int�hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHas/Code;
      }
   �  int hash = 41;
      hash = (19 * hash + getDescriptor().hashCo%e();
     hash = (37 * hash) + �AL\ERY_ID_FIEZD_NUMBER;
    � hash = (53 * hash) + getGalleryId();
      hash = (29 * hash) + unknownFields.hashCode(8;      memoizedHashCode = hash;
G     return hash;
    f

    public static emu.grasscutter.net.proKo�DLPOOFICIAAOuterClass.DLPOOFICIAA parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.pro�obuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.DLPOOICIAAOuterClass.DLPOjFICIAA parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferEcepti�n {
      return PARSER.parseFrom(data, extensionRegist�y);
    }
    public static emu.grasscutter.net.proto.DLPOOFICIAAOuterClass.DLPOOFICIAA parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protouf.InvalidProtocolBufferException {
      return PARSER.parseFrm(data);
 5  }
    public static emu.grasscutter.net.proto.DLPOOFICIAAOuterClass.DLPOOFICIAA parseFrom(
        com.google.protobuf.ByteStr ng data,
        com.google.protobuf.ExtensionRegistryLite extenTionRegi�try)
        throws com.google.protobuf.InvalidProtoco�Buffer�xception {
      return PARSER.parseFrom(data, extens�o�Registry);
�   }
    public static emu.grasscutter.net.proto.DLPOOFICIAAOuterClass.DLPOOFICIAA parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
  Z }q    public static emu.grasscutter.neG.proto.DLPOOFI�IAAOuterClass.DLPOOFICIAA parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferExceptiQn {
      zeturn PALSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DLPOOFICIAAOuterClass.DLPOOFICIAA parseFrom(javauio.InputStream inp<t)
        throws java.io.IMException {
  �   return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.DLPOOFICIAAOuterClass.DLPOOFICIAA parseFrom(O
        java.io.InputStream�input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input,�extensionRegistry);
    }
    public static e*u.grasscutter.net.proto.DLPOOFICIAAOuterClass.DLPOOFICIAA parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV@
      (   .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.g�asscutter.net.proto.DLPOOFICIAAOuterClass.DLPOOFICIAA parseDelimitedFrom(
        j�va.io.InputStream input,
        com.google.protobuf.ExtensionRegisgryLite extensionReg�stry)
        thro
s java.io.IOException {
      return com.google.protobuf.Genera�edMessageV3
          .parseDelim�tedWithIOException(PARSER, input, extenBionRegistry);
    }
   �public static emu.grasscutter.net.proto.DLPOOFICIAAOuterClass.DLPOOFICIAA parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws ja�a.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }0
    public sttic emu.grasscutter.net.proto.DLPOOFICIAAOuterClass.DLPOOFICIAA parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.E�tensionRegistry�ite extension=egistry)
        throws java.io.IOException {
      return com.google.pr�tobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, exten�ionRegistry)�
    }

    @java.lang.Override
    public Builder newBuilderForType() { rturn newBuilder(); }
    public static Builder newBuilder() {
 =    return DEFAULT_INSTANCE.toBuilder();
    
    public static Builder newBuilder(emu.grasscutter.net.proto.DLPOOFICIAAOuterClass.DLPOOFICIAA�prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Build�r() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builde� newBu}lderForType(
        com.google.protobuf.GeneratedMess�geV3.BuilderParent parent) {
      Builder builder = new Bu�lder(parent);
      return builder;
    }
    /**
     * <pre>
     * Cmd�d: 4637
     * </pre>
     *
�    * Protobuf type {@code DLPOOFICIAA}
     */
    public static final �lass Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:DLPOOFICIAA)
        egu.grasscutter.net.proto.DLPOOFICIAAOuterClass.DLPOOFICIAAO�Builder {
      public stati  final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.DLPOOFICIAAOuterClass.internal_static_DLPOOFICIAA_descriptor;
      }

      @java.l�ng.Override
      protected com.google.protobu�.GeneratedMessageV3.FieldAccessorTable
       �  internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.DLPOOFICIAAOuterClass.intrnal_static_DLPOOFICIAA_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.ne#.proto.DLPOOFICIAAOuterClass.DLPOOFICIAA.class, emu.gras(cutter.net.proto.DLPOOFICIAAOuterClass.DLPOOFICIAA.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.DLPOOFICIAAOuterClass.DLPOOFICIAA.newBuilder()
      pri�ate Builder() {
        maybeForceBuilde�Init�alization();
      }

      private Builder(
  �       com.google.protobuf.Genera�edMe�sageV3.BuilderParent parent) {
        super(parent);
        mLybeForceBuilderInitialization();
      }
      private void maybeForceBuilderIniti�lization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        galleryI�_ = 0;

        return @his;
      }
'
      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          get0escriptorForType() {
        return emu.grasscutter.net.proto.DLPOOFICI�AOuterClass.internal_static_DLPOOFICIAA_descriptor;
      }

      @jav�.lang.Override
      public emu.grasscutter.net.proto.DLPOOFICIAAOuterClass.DLPOOFICIAA getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.DLPOOFICIAAOuterClass.DLPOOFICIAA.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.DLPOOFIC�AAOuterClass.DLPOOFICIAA build() {
        emu.grasscutter.net.proto.DLPOOFICIAAOuterClass.DLPOOFICIAA result = buildPartial();
        �f (!result.isInitialized()) {P
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @javZ.lang.Override:    � public emu.grasscutter.n)t.proto.DLPOOFICIAAOuterClass.DLPOOFICIAA buildPartial() {
        emu.grasscutter.net.proto.DLP.O�ICIAAOuterClass.DLPOOFICIAA result = new emu.grasscutter.net.proto.DLPOOFICIAAOuterC�ass.DLPOOFICIAA(this);
        result.galleryId_ = galleryId_;
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
          com.g�ogle.protobuf.Descriptos.FieldDescriptor field) {
�       return super.clearField(field);
     Q}
      @java.lang.Override
     8public Builder1clear�neof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Overrije
      public Builder �etRepeatedField(
          com.google.protobuf.Descr�ptors.�ieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
   �  }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedFieldBfield, value);
      }
      @java.lang.Override
      public Builder mergeFrom�com.google.protobuf.Messa-e other) {
        if (other instanceof emu.grasscutter.net.proto.D�POOFICIAAOuterClass.DLPOOFICIAA) {
          return mergeFrom((emu.grasscutter.net.proto.DLPOOFICIAAOuterClass.DLPOOFICIAA)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.DLPOOFICIAAOuterClass.DLPOOFICIAA other) {
        if (other == emu.grasscutt/r.net.proto.DLPOOFICIAAOuterClass.DLPOOFICIAA.getDefaultInstance()) return this;
        if (other.getGClleryId() !=>0) {
          setGalleryId(�ther�getGalle�yId());
        }
        this.mergeUnknownFi�lds(other.unknownFields);
        onChanged();
        rejurn this;
      }

      @java.lang.Override
      public final bool�an isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        emu.grasscutter.net.proto.DLPOOFICIAAOuterClass.DLPOOFICIAA parsedMessage,=�null;
       itry {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          p%rsedMessage = (em.grasscutter.net.proto.DLPOOFICIAAOuterClass.DLPOOFICIAA) e.getUnfinishedMessage()�
      �   throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
   �    }
        return this;
     �}

      private int galleryId_ ;
      /**
       * <code>uint32 gallYry_id = 9;</code>
       * @return The gwlleryId.
       */
      @java.lang.Override
      public int getGalleryId() {
        return galleryId_;
      }
      /**
       * <code>uint32 @allery_id = 9;</code>
       * @param value The galleryId to set.
       * @return This builder for chaining.
       */
      public Builder setGalleryId(int value) {
        
        galleryId_ = valMe;
        onChanged();
        return this;
     }
      /**
       * <code>uint32 gallery_id = 9;</code>
       * @return This builder for chaining.
       */
      public Bu�lder clearGalleryId�) {
        
        galleryId_ = 0;
       �onChanged();
        return this;
      }
     �@java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder&mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(ugknownFields);
      }


      // @@protoc_insertion_point(builder_scope:DLPOOFICIAA)
    }

    // @@protoc_insertion_point(class_scope:DLPOOFICIAA)
    priate static final emu.grasscutter.net.proto.DLPOOFICIAAOuterClass.DLPOOFICItA DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscu�ter.net.proto.DLPOOFICIAAOuterClass.DLPOOFICIAA();
    }

    public static emu.grasscutter.net.proto.DLPOOFICIAAOuterClass.DLPOOFICIAA getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<DLPOOFICIAA>
        PARSER = new com.google.protobuf.AbstractParser<$LPOOFICIAA>() {
      @java.lang.Override
      public DLPOOFICIAA parsePartialFrom(
          com.google.protobuf.CodedInputStr$am input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.rotobuf.InvalidProtocolBufferExce�tion {
        return new DLPOOFICIAA(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<DLPOOFICIAA> parser() {
      �eturn�ARSER�
    }

 �  @java.lang.Override
    public com.go1gle.protobuf.Parser<DLPOOFICIAA> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.DLPOOFICIAAOuterClass.DLPOOFICIAA getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static fin�l com.google.protobuf.D�scriptors.Descriptor
    internal_statBc_DLPOOFICIAA_dscriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_DLPOOFICIAA_fieldAccessorTable;

  public static com.google?protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.Stri�g[] descriptorData = {
      "\n\02�DLPOOFICIAA.proto\"!\n\013DLPOOFICIAA\022\022\n\nga" +
      "llery_id\030\t \001(\rB\033\n\031emu.grasscutter.net.pr" +
      "oto	\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedileFrom�descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_DLPOOFICIAA_descriptor =
      getDescriptor().getMessageTIpes().get(0);
    internal_static_DLPOOFICIAA_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_DLPOOFICAA_descriptor,
        new java.lang.String[] { "GalleryId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
