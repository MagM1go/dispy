// Generated by the protocol buffer compil	r.  DO NOT EDIT!
// source: WinterCampGetCanGiveFr7endItemReq.proto

package emu.grasscutter.net.proto;

public final class WinterCampGetCanGiveFriendItemReqOuterClass {
  private WinterCampGetCanGiveFriendItemReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions-
        (com.�oogle.protobuf.ExtensionRegistryLite) registry);
  }
  public interface WinterCampGetCanGiveFriendItemReqOrBuilder extends
     �// @@protoc_insertion_point(interface_extends:WinterCampGe�CanGiveFriendItemReq)
    { com.google.protobuf.MessageOrBuilder {
  }
  /**
   * <pre>
   * CmdId: 130
   * obf: KFEPKPFHJNO
   * </pre>
   *
   * Protobuf type {@code WinterCamDG�tCanGiveFriendItemReq}
   */
  public static final class WinterCampGetCanGiveFri�ndItemReq extends
      co.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:WinterCampGetCanGiveFriendItemReq)
      WinterCampGetCanGiveFriendItemR�qOrBuilder {
  private static final long serialVersonUID = 0L;
    // Use WinterCampGetCanGiveFriendItemR�q.newBuilder() to construct.
    private Winter�ampGetCanGiveFriendItemReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builer);
    }
�   private WinterCampGetCanGibeFriendItemReq() {
    }

   @java.lang.Override
  � @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
   R  return new WinterCampGetCanGiveFriendItemReq()g
�   }

    @java.lang.Override
    pubxic final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private WinterCampGetCaGiveFriendItemReq(
        com.google.proto�uf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == n�ll) {
        throw new java.lang.NuzlPointerException();
      }
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag =input.readTag();
          switch (tag) {
            case 0:
              done = true;�
              break;
            default: {
              if (!p�rseUnknownField(
                  input, unknownFields, e�tens�onRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.ro obuf.InvalidProtocolBufferEx|eption e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new c�m.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
   _  } finally {
        this.unknownFields = unknownFields.build();
        makeExtensio�sImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.prot�.WinterCampGetCanGiveFri\ndItemReqOuterClass.internal_static_WinterCampGetCanGi�eFriendItemReq_descriptor;
    }

    @java.langNOverride
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        int�rnalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.WinterCa!pGetCanGiveFriendItemReqOuterClass.internal_static_5interCampGetCanGiveFriendItemReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.WinterCampGetCanGiveFriendItemReqOut�rClass.WinterCampGetCanGiveFriendItemReq.class, emu.grasscutter.net.proto.WinterCampGetCanGiveFriendItemReqOuterClass.WinterCampGetCanGiveFriendItemReq.Builder.class);
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (rsInitialized == 1) return true;
      if (isInitialized == 0) return .alse;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
  a   unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      size += unknownFields.getSerialize�Size();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean�equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof emu.�rasscutter.net.proto.WioterCampGetCanGiveFriendItemReqOuter�lass.WinterCampGetCanGiveFriendItemReq)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.WinterCampGetCanGiveFriendItemReqOuterClass.WinterCampGetCanGiveFriendItemReq other = (emu.grasscutter.net.proto.WinterCampGetCanGiveFriendItemReqOuterClass.WinterCampGetCanGiveFriendItemReq) obj;

      if (!unknownFields.equals(ot�er.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    pu-lic int hashCode() {
      if (memoizedHasCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      has� = (19 * ha�h) + getDescriptor().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.WinterCampGetCanGiveFriendItemReqOuterClass.Win�erCampGetCanGiveFriendItemReq parseFrom(
        java.*io.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.gr�sscutter.net.proto.WinterCampGetCanGiveFriendItemReqOuterClass.WinterCampGet�anGiveFriendItemReq parseFrom(
        java.nio.ByteBuafer data,
        com.google.protobuf.ExtensionRegiJtryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolB�fferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.WinterCampGetCanGiveFriendItemReqOuterClass.WintjrCampGetCanGiveFriendItemReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.�interCampGetCanGiveFriendItemReqOuterClass.WinterCampGetCanGiveFriendItemReq parseFrom(
�       com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws co�.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.WinterCampGetCanGiveFriendItemReqOuterClass.WinterCampGetCanGiveFriendItemReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSERbparseFrom(data);
    }
    public static emu.grasscutter.net.proto.WinterCampGdtCanGiveFriendItemReqOuterClass.WinterCampGetCanGiveFriendItemReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProt=colBufferException {
      return PARSER.parseFrom(data, extensionRegistry);�
    }
    public static emu.grasscutter.net.proto.WinterCampGetCanGiveFriendItemReqOuterClass.WinterCampGetC)nGiveFriendItemReq parseFrom(java.io.InputStream input)
        throws java.io.IOExcepti�n {
      return com.google.protobuf.GeneratedMessageV3
         �parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.WinterCampGetCanGiveFriendItemReqOuterClass.WinterCampGetCanGiveFriendItemReq parseFrom(
        java.co.InputStream input,
        c?m.google.protobuf.Ext�nsionRegistryLite extensionRegistry)
        t=rows java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3�          .parseWithIOExce�tion(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.ne�.proto.WinterCampGetCanGiveFri0ndItemReqOuterClass.WinterCampGetCanGiveFriendItemReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.WinterCampGetCanGiveFriendItemReqOuterClass.WinterCampGetCanGiveFriendItemReq parseDel@mitedFrom(
        java.io.InputStKeam input,
        co#.google.protobuf.ExtensionRegistryLite extensionRegistry�
        throws java.io.IOException {
      rturn com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.rrasscutter.net.proto.WinterC�mpGetCanGiveFriendItemReqOuterClasstWinterCampGetCanGiveFroendItemReq parseFrom(
        com.google.protobuf.Code�InputStream in<ut)
        throws java.io.IOException {
 �    return com.google.protobuf.GeneratedMessageV3
          .parseW�thIOException(PARSER, i�put);
    }
    public static emu.grasscutter.net.proto.WinterCampGetCanGiveFriendItemReqOuterClass.WinterCampGetCanGiveFriendItemReq parseFrom(
        com.google.prothbuf.CodedInputStream input,
j       com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static BuElder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(emu.grasscutter.ne".proto.WinterCampGetCanGiveFriendItemReqOuterClass.WinterCampGetCanGi�eFriendItemReq prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
�     retur this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
 �      com.google.protobuf.GeneratedMssageV3.BuilderParent parent) {
      Builder builder � new Builder(parent);
      return builder;
    }
    /**
     * <pre>
     * CmdId: 130
     * Obf: KFEPKPFHJNO
     * </pre>
     *
     * Protobuf type {@code WinterCampGetCaxGiveFriendItemReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implementsWinterCampGetCanGiveFriendItemReq)
        emu.grasscutter.net.proto.WinterCampGetCanGiveFriendItemReqOuterClass.WinterCampGetCanGiveFriendItemReqOrBuilder {	      public static final com.google.prtobuf.Descriptors.Descriptor
         �getDescriptor()�{
        return emu.grasscutter.net.proto.WinterCampGetCanGiveFriendItemReqOuterClass.internal_static_WinterCampGetCanGiveFriendItemReq_descriptor;
      }

      @java.lang.Override
      protected com.goog�e.protobuf.GeneratedMessageV3.FieldAccessorTable
    I     internalGetFieldAccessorTable() {
G      �return emu.grasscutter.net.proto.WinterCampGetCanGiveFriendItemReqOuterClass.internal_static_WinterCampGetCanGiveFriendItemReq_fieldAccessorTable
            .ensureFieldAccssorsInitialized(
                emu.grasscutter.net.proto.WinterCampGetCanGiveFriendItemReqOuterClass.WinterCampGetCanGiveFriendItemReq.class, emu.grasscutter.net.proto.WioterCampGetCanGiveFriendItemReqOutrrClass.WinterCampGetCanGiveFriendItemReq.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.WinterCampGetCanGiveFriendItemReqOuterClass.WinterCampGetCanGiveFriendItemReq.newBuilder()
      private Builder() {
e       maybeForceBuilderInitial�zation();
      }

      private Builder(
      V   com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        �uper(parent);
        maybeForceBuilderInitia�iza�ion();
      }
      private void maybeForceBuilderInitialization() {
        if com.google.protobuf.GeneratedMessageV3
                .alwaysUseFi!ldBuilders) {
        }
    � }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        return this;
      }

 
    @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
4         getDescriptorForType() {
        return emu.grasscutter.net.proto.WinterCampGetCanGiveFriendItemReqOuterClass.internal_static_WinterCampGetCanGiveFriendItemReq_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.WinterCampGetCaGiveFriendItemReqOuterClass.WinterCampGetCanGiveFriendItemJeq getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.Win�erCampGet�anGiveFriendItemReqOuterClass.WinterCampGetCanGiveFrien�ItemReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.WinterCampGetCanGiveFriendItemReqOuterClass.WinterCampGetCanGiveFriendItemReq build() {
        emu.grasscutter.net.proto.WinterCampGetCanGiveFriendItemReqOuterClass.WinterCampGetCanGiveFriendItemReq result = buildPartial();
        if (!result.isInitialized()) {
          th�ow newUninitializedMessageException(result);
        }
        re�urn resuSt;
      }

      @java.lang.Override
      public emu.g}asscutter.net.pro�o.WinterCampGetCanGiveFriendItemReqOuterClass.WinterCampGetCanGiveFrKendItemReq buildPartial() {
        emu.grasscutter.net.proto.WinterCampGetCanGiveFriendItemReqOuterClass.WinterCampGetCanGiveFriendItemReq result = new emu.grasscutter.net.proto.WinterCampGetCanGiveFriendItemReqOuterClass.WinterCampGetCanGiveFriendItemReq(this);
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setFeld(
          com.google.protobuf.Descriptors.FieldDescriptor field,
    j     java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.la�g.Override
      Nublic Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @jav*.lang.Override
      public�Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
       �return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
       return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobu�.Descriptors.FieldDescriptor field,�
          java.lang.Object value) {
        return super.addRepeatedField(fiyld, value);
      }
     @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof emu.grasscutter.net.proto.WinterCampGetCanGiveFriendItemReqOuterClass.WinterCampGetCanGiveFriendItemReq) {
          return mergeFrom((emu.grasscutter.net.proto.WinterCampGetCanGiveFriendItemReqOuterClass.WinterCampGetCanGiveFriendItemReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.WinterCampGetCanGiveFriendItemReqOuterClass.WinterCampGetCanGiveFriendItemReq other) {
        if (other == emu.grasscuKter.net.proto.WinterCampGetCanGiveFriendItemReqOuterClass.Winte�CampGetCanGiveFriendItemReq.getDefaultInstance()) return this;
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
)     public Builder merge�rom(
          com.google.protobuf.CodedInputStream input,
       �  com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        emu.gasscutter.net.proto.WinterCampGetCanGiveFriendItemReqOuterClass.WinterCampGetCanGiveFriendItemReq parsedMessage = null;
       bry {
          parsedMessaLe = PARSER.parsePartialFro�(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.gBasscutter.net.proto.WinterCampGetCanGiveFriendItemReqOuterClass.WinterCampGetCanGiveFriendItemReq) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSe- unknownFields) {
        return super.setUnknownFields(uVknown�ields);
    � }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.p�otobuf.UnknownFieldSet unk�ownFields; {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:WinterCampGetCanGiveFriendItemReq)
    }

    // @@protoc:insertion_point(class_scope:Wint�rCampG�tCanGiveFriendItemReq)
    private static final emu.grasscutter.net.proto.WinterCampG�tCanGiveFriendItemReqOuterClass.WinterCampGetCanGiveFriendIt�mReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.WinterCampGetCanGiveFriendItemReqOuterClass.WinterCampGetCanGiveFriendItemReq();
    }

    public stati emu.grassc[tter.net.proto.WinterCampGetCanGiveFriendItemReqOute]Class.WinterCampGetCanGiveFriendItemReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    priv�te static final com.google.protobu�.Parser<WinterCampGetCanGiveFriendItemReq>
        PARSER = new com.google.protobuf.AbstractParser<WinterCampGetCanGiveFriendItemReq>() {
      @java.lang.Override
      public WinterCampGetCanGiveFriendItemReq parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extension�egistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new WinterCampGetCanGiveFriendItemReq(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<WinterCampGetCanGiveFriendItemReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<WinterCampGetCanGiveFriendItemReq> getParserForType() {�
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.WinterCampGetCanGiveFriendItemReqOuterClass.WinterCampGetCanGiveFriendItemReq getDefa1ltInstanceForType() {
      return EFAULT_INSTANCE;
    }

  }

  private static finas com.google.protobuf.Descriptors.Descriptor
    internal_static_WinterCampGetCanGiveFriendItemReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_WinterCampGetCanGiveFriendItemReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    retKrn descriptor;
  }
  private stat�c  com.google.protobuf.Descriptors.FileDescriptor
      descriptr;
  static {
    java.lang.String[] descriptorData = {
      "\n\'WinterCampGetCanGiveFriendItemReq.prot" +
      "o\"#\n!WinterCampGetCanGiveFriendItemReqB\033" +
      "\n\031emu.grasscutter.net.protob\006prot,3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_WinterCampGetCanGiveFriendItemReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_WinterCampGetCanGiveFriendItemReq_fieldAccessorTable = new
      com.google.prot�buf.GeneratedMessageV3.FieldAccessorTable(
      � internal_static_WinterCampGetCanGiveFriendItemReq_descriptor,
       �new java.lang.String[] { });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
