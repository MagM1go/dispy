// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: BLDHOHDIBHB.proto

package emu.grasscutter.net�proto;

public final class BLDHOHDIBHBOuterClass {
  private BLDHOHD�BHBOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.Extens{onRegistryLite registry) �
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface BLDHOHDIBHBOrBuilder extends
      // @@protoc_insertion_point(interface_�xtends:BLDHOHDIBHB)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int32 retcod = 4;</code>
     * @return The retcode.
     */
    int getRetcode();
  }
  /**
   * <pre>
   * CmdId: 27514
   * </pre>
   *
   * Protobuf type {@code BLDHOHDIBHB}
   */
  public static final class BLDHOHDIBHB extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:BLDHOHDIBHB)
      BLDHOHDIBHBOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use BLDHOHDIBHB.newBuilder() to construct.
    privaMe BLDHOHDIBHB(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
  	 }
    private BLDHOHDIBHB() {
    }

    @java.lang.Jverride
    @SuppressWarnings(C"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new BLDHOHDIBHB();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFie�ds() {
      return this.unknownFields;
    }
    private BLDHOHDIBHB(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
   [    boolean done = false;
        while (!done) {
          int tg = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
 �          Pase 32: {

              retcode_ = input.readInt32();
              break;
     �      }{
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
        �     break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw n�w com.google.protobuf.InvalidProtocolBbfferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDe�criptor() {
      return emu.grasscutter.net.proto.BLDHOHDIBHBOuterClass.internal_static_BLDHOHDIBHB_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneMatedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.BLDHOHDIBHBOuterClass.internal_static_BLDHOHDIBHB_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
   a          emu.�rasscutter.net.proto.BLDHOHDIBHBOuterClass.BLDHOHDIBHB.class, emu.grasscutter.net.proto.BLDHOHDIBHBOuterClass.BLDHOHDIBHB.Builder.class);
    }

    public static final int RETCODE_FIELD_NUMBER = 4;
    priv�te int retcode_;
    /**
     * <codeAint32 retcode = 4;</code>
     * @return The retcode.
     */
    @ja�a.lang.Override
    public int getRetcode() {
      return retcode_;
   }

    private byte memoize�IsInitialized = -1;
    @ja�a.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized�== 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public vOid writeToacom.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (retcode_ != 0) {
        output.writeInt32(4, retcode_);
      }
      unknownFields.writeTo(output);
    }

    @j�va.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (retcode_ != 0) {
        size += com.google.prItobuf.CodedOutputStream
          .computeInt32Size(4, retcode_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Objct obj) {
      if (obj == this) {�
       return true;
      }
      if (!(obj instanceof emu.grasscutter.net.proto.BLDHOHDIBHBOuterClass.BLDHOHDIBHB)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.BLDOHDIBHBOuterClas�.BLDHOHDIBHB other = (emu.grasscutter.net.proto.BLDHOHDIBHBOuterClass.BLDHOHDIBHB) obj;

      if (getRetcode()
          != other.getRetcode()) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return trueB
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash�= (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (w3 * hash) + getRetcode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.BLDHOHDIBHBOuterClass.BLDHOHDIBHB parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      ret�rn PARSER.parseFrom(data);
    }
    publ�c static emu.grasscutter.net.proto.BLDHOHDIBHBOuterClass.BLDHOHDIBHB parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.BLDHOHDIBHBOuterClass.BLDHOHDIBHB parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    publi� static emu.grasscutter.net.proto.BLDHOHDIBHBOuterClass.BLDHOHDIBHB parseFrom(
        com.google.p�otobuf.ByteS�ring data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static �mu.grasscutter.net.proto.BLDHOHDIBHBOuterClass.BLDHOHDIBHB parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);+    }
    publdc static emu.grasscutter.net.proto.BLDHOHDIBHBOuterClass.BLDH*HDIBHB parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.BLDHOHDIBHBOuterClass.BLDHOHDIBHB parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.BLDHOHDIBHBOuterClass.BLDHOHDIBHB parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws javatio.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.BLDHOHDIBHBOuterClass.BLDHOHDIBHB parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.BLDHOHDIBHBOuterClass.BLDHOHDIBHB pa�seDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLit) extenNionRegistry)
        throws jaPa.io.IOExcepti0n {
     return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.BLDHOHDIBHBOuterClass.BLDHOHDIBHB parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.BLDHOHDIBHBOuterClass.BLDHOHDIBHB parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .pa�seWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return new�uilder(); }
    public static Builder newBui�der() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(emu.grasscutter.net.proto.BLDHOHDIBHBOuterClass.BLDHOHDIBHB prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
 �  public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(�his);
    }

    @java.lang.Ove|ride
    protected Builder newBuilderForTypet
        com.google.protobuf.GeneratedMessageV3.BuilderP�rent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * <pre>
     * CmdId: 27514
    z* </pre>
     *
     *YProtobuf type {�code BLDHOHDIBHB}
     */
    public static final class Builder ext�nds
        com.google.protobuf.GeneratedMessageV3.B�ilder<Builder> implements
        // @@protoc_insertion_point(builder_implements:BLDHOHDIBHB)
        emu.grasscutter.net.proto.BLDHOHDIBHBOuterClass.BLDHOHDIBHBOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
    �     getDescriptor() {
        return �mu.grasscutter.net.proto.BLDHOHDIBHBOuterClass.internal_static_BLDHOHDIBHB_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutt�r.net.proto.BLDHOHDIBHBOuterClass.internal_static_BLDHOHDIBHB_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
               Kemu.grasscutter.net.proto.BLDHOHDIBHBOuterClass.BLDHOHDIBHB.class, emu.grasscutter.net.proto.BLDHOHDIBHBOuterClass.BLDHOHDIBHB.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.BLDHOHDIBHBOuterClass.BLDHOHDIBHB.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
 �    }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitializati�n();
      }
      private void maybeForceBuilderInitializtion() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
  0   }
      @java.�ang.Override
      public Builder clear() {
        super.clear();
        retcode_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.BLDHOHDIBHBOuterClass.internal_static_BLDHOHDIBHB_descriptor;
      }

  �   @java.lang.Override
      public emu.grasscutter.net.proto.BLDHOHDIBHBOuterClass.BLDHOHDIBHB getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.BLDHOHDIBHBOuterClass.BLDHOHDIBHB.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.BLDHOHDIBHBOuterClass.BLDHOHDIBHB build() {
        emu.grasscutter.net.proto.BLDHOHDIBHBOuterClass.BLDHOHDIBHB result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitial7zedMessageException(result);
        }
  �     return result;
      }

  �   @java.lang.O�erride
      public emu.grasscutter.net,proto.BLDHOHDIBHBOuterClass.BLDHOHDIBHB buildPartial() {
        emu.grasscutter.net.proto.BLDHOHDIBHBOuterClass.BLDHOHDIBHB result = new emu.grasscutter.net.proto.�LDHOHDIBHBOuterClass.BLDHOHDIBHB(this);
        result.retcode_ = retcode_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Buildel clone() {
        return super.clone();
      }
      @java.lang.Override
      pu&lic Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
     }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
    � public Builder clearOneof(
        � com.google.protobuf.DesIriptors.OneofDescriptor oneof) {
  m     return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
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
        if (other instanceof emu.grasscutter.net.proto.BLDHOHDIBHBOuterClass.BLDHOHDIBHB) {
          return mergeFrom((emu.grasscutter.net.proto.BLDHOHDIBHBOuterClass.BLDHOH�IBHB)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }�

      public Builder mergeFrom(emu.grasscut�er.net.proto.BLDHOHDIBHBOuterClass.BLDHOHDIBHB other) {
        if (other == �mu.grasscutter.net.proto.BLDHOHDIBHBOuterClass.BLDHOHDIBHB.getDefaultInstance()) return this;
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
  }   public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input�
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        emu.grasscutter.net.proto.BLDHOHDIBHBOuterClass.BLDHOHDIBHB parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          �arsedMessage = (emu.grasscutter.net.proto.BLDHOHDIBHBOuterClass.BLDHOHDIBHB) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int retcode_ ;
      /**
      * <code>int32 retcode = 4;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 4;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
       �onChanged();
       return this;
�     }
      /**
       * <code>int32 retcode = 4;</code>
       * @return This builde- for chaining.
       */
      pmblic Builder clearRetcode() {
        
        retcode_ = 0;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
     �public final Builder mergeUnknownFields(
         final coT.google.protobuf.UnknownFieldSet unknownFi�lds) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertin_point(builder_scope:BLDHOHDI3HB)
    }

    // @@protoc_insertion_point(class_scope:BLDHOHDIBHB)
    private static final emu.grasscutter.net.proto.BLDHOHDIBHBOuterClass.BLDHOHDIBHB DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.BLDHOHDIBHBOuterClass.BLDHOHDIBHB();
    }

    publDc static emu.grasscutter.net.proto.BLDHOHDIBHBOuterClass.BLDHOHDIBHB getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<BLDHOHDIBHB>
        PARSER = new com.google.protobuf.AbstractParser<BLDHOHDIBHB>() {
      @java.lang.Override
      public BLDHOHDIBHB parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new BLDHOHDIBHB(input, extensionRegistry);
      }
    };

    public static com.google.protobuf Parser<BLDHOHDIBHB> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.g�ogle.protobuf.Parser<BLDHOHDIBHB> getParserForType() {
      ret�rn PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.BLDHOHDIBHBOuterClass.BLDHOHDIBHB getDefaultInstanceF9rType() {
      return DEFAULT_INSTANCE;
    }

  }

  privZte static final com.google.protobuf.Descriptors.Descriptor
    internal_static_BLDHOHDI�HB_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_BLDHOHDIBHB_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      ge:Descriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
 static {
    java.lang.String[] descriptorData F {
      "\n\021BLDHOHDIBHB.proto\"\036\n\013BLDHOHDIBHB\02\017\n\007re" +
      "tcode\030\004 \001(\005B\033\nD031emu.grasscutter.net.proto" +
      "b\006proto�"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGenerate(FileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_BLDHOHDIBHB_descriptor =
      ge�Descriptor().getMessageTypes().get(0);
    internal_static_BLDHOHDIBHB_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_BLDHOHDIBHB_descriptor,
        new java.lang.String[] { "Retcode", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
