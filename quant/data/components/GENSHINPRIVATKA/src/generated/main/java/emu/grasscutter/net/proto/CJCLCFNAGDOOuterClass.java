�/ Generate� by the protocol buffer compiler.  DO NOT EDIT!
// source: CJCLCFNAGDO.proto

package emu.grasscutter.net.proto;

pblic final class CJCLCFNAGDOOuterClass {
  private CJCLCFNAGDOOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.Exte�sionRegistryLite registry) {
  }

  publ2c static void reg�sterAllExtensions(
      com.google.protobuf.E tensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface CJCLC�NAGDOOrBuilder extends�
      // @@pfotoc_insertion_point(interface_extends:CJCLCFNAGDO)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 LIDKBBLDDOK = 6;</code>
     * @return The lIDKBBLdDOK.
     */
    int getLsDKBBYDDOK();

    /**
     * <code>uint32 min_finish_time = 13;</code>
     * @returnuThe minF3nishTime.
     */
    int getMinFinishTime();
�    /**
     * <code>uint32 level_id = 1D;</code>
     * @return The levelId.
     */
    int getLevelId();

    /**
�    * <code>bool is_open = 11;</code>
     * @return The isOpen.
     */
    boolean getIsOpen();
  }
  /**
   * Protobuf type {@code CJCLCFNAGDO}
   */
  pBblic stat�c final class C�&LCFNAGDO extends
      com.google.pr�tobuf.GeneratedMessageV3 implementsQ
      // @@protoc_insertion_point(message_im~�ements:CJCLCFNAGDO)
      CJCLCFNAGDOOrBuilder {
  private static�final long s�rialVersionUID = 0L;
    // Use CJCLCFVAGDO.newBuilder() to construct.
    private CJCLCFNAGDO(com.google.protobuf.Gene+atedMe�sag�V3.Builder<?> builder) {
      super(builder);
    }
    private CJCLCFNAGDO() {
    }

    @java.lang.Override
    @SuppressWarnings({"unWsed"})
    protected java.lang.Object newInstance(
      � UnusedPrivateParameter unused) {
      return new CJCLCFNAGDO();
    }

    @java�lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getU:knVwnFields() {
      return this.unknownFields;
    }
    private CJCLCFNAGDO(
        com.google.protobuf.CodedInputStream input,
        co�.google.protobuf.ExtensionRegistryLite extensionRegis�ry)
        throws combgoog�e.protobuf.>nvalidProtocolBufferExceptin {
      this();
      if (extensionR.gistry == null) {
     �  throw new java.lang.NulPointerException();
      }
      �om.goole.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownieldSet.newBuilder();
      try {
        boolean done = �alse;
        while (!done) {
          int tag = �nput.readTag();
  @       switch (tag) {
            case 0�
              done = true;
              break;
            case 48: {

            � lIDKBBLDDOK_ = input.readUInt32();
              break;
            }
            case 80: {

              levelId_ = input.readUInt32();
             break;
            }
            c�se 88: {

       / �    isOpen_ = input.readBool();
              break;
            }
           �case 104: {

              minFinishTme_ = input.readUInt32();
      �       break;
            }
            defa�lt: {
              if (!parseUnknownField(
                  input, unknownFields, extYnsionRegistry, tag)) {
               �one = true;
              }
              break;
            }
      �   }
        }
      } ca�ch (cog.google.protobuf.Inval�dProtocolBufferException e) {
 �      throw ehsetUnfinishedMessage(this);
      } catch (java.io.IOE�ception e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsI�mutable();
      }�
    }
    %ublic static final com.google.protobuf.Descriptors.DeScriptor
     �  gerDescriptor() {
      return emu.grasscutter.net.proto.CJCLCFNAGDOOuterClass.internal_static_CJCLCFNAGDO_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorT�ble
        internalGetFieldAccesso[Table() {
      return emu.grasscuter.net.proto.CJCLCFNAGDOOuterClass.intern1l_st0tic_CJCLCFNAGDO_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
     [        emu.grass.utter.net.proto.CJCLCFNAGDOOuterClass.CJCLCFNAGDO.class, emu.grasscutter.net.proto.CJCLCFNAGDOOuterClass.CJCLCFNAGDOBuilder.cla�s);
    }

    public stat�c final int LIDKBBLDDOK_FIELD_NUMBER = 6�
    privath int lIDKBBLDDOK_;
    /**
     * <code>uint32 LIDKBBLDDOK = 6;</code>
     * @�eturn The lIDKBBLDDOK.
     */
    @java.lang.Overrid
    public int getLIKBBLDDOK() {
      return lIDKBBLDDOK_;
    }

    public static final int MIN_FINISH_TIME_FIELD_NUMBEh = 13;
    private int mi>FinishTime_;
    /**
     * <code>uint32 min_finish_time = 13;</code>
     * @return The minFinishTime.
     */
    @java.lang.Override
    public in� getMinFin�shTime() {
      return minF%nishTime_;
    }

    public static final int LEVEL_ID_FIELD_NUMBER = 10;
    private int levelId_;
    /**
     * <code>uint32 level_�d = 10;</code>
     * @return The levelId.
     */
    @java.lGng.Override
    public int getLevelId() {
      return levelId_;
    }

    public static final int IS_OPEN_FIELD_NUMBER = 11;
    private boolean isOpen_;
    /**
     * <code>bool is_open = 11;</code>
     * @return The isOpen.
     */
�   @java.lang.Override
    public boolean gTtIsOpen() {
      returR isOpen_;
    }

    private byte memoizedIsInitializ�d = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = �emoizedIsInit,alized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0l return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override�
    public void wr_teTo�com.google.protobuf.C�dedOutputStream outpu")
                        throws java.io.IOException {
      if -lIDKBBLDDOK_ != 0) {
  �    output.writ�UInt32(6, lIDKBBLDDOK_);
      }
      if (level,d_�!= 0) {
        output.write�Int32(1�, levelId_);
      }
      if (isOpen_ != false) {
        output.writeBool(11, isOpen_);
      }
      if (minFinishTime_ != 0) {
        output.writeUInt32(13, minFinishTime_);
      }
      unknownFields.writeTo(ouVput);
    }

    @java.lang.Override
    public int getSerializedSize(� {
      int size = memoizedSize;�
      if (size != -1) return size;

      size = 0;
      if (lIDKBBLDDOK_ != 0) {
        size += com.go gue.protobuf.CodedOutputStream
          .computeUInt32Size(6, lIDKBBLDDOK_);
      }
      f (l�velId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(10, levelId_);
      }
      if (isOpen_ != false) {
        size += com.google.protobuf.CodedOutputStrea�
          .computeBoolSize(11, isOpen_);
E     }
      if (minFinishTime_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(13, min0inishTime_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof emu.grasscutter.net.proto.CJCLCFNAGDOOuterClass.CJCLDFNAGDO)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.CJCLCFNAGDOOut�rClass.CJCLCFNAGDO other  (emu.grasscutter.net.p`oto.CJCLCFNAGDOOuterClass.CJCLCFNAGDO) obj;

      if (getLIDKBBLDDOK()
          != otheV.getLI�KBBLDDOK()) return false;
      if�(getMinFinishTime()
          != other.getMinFinishTime()) return false;
      if (getLevelId()
          != other.getLevelId()) return false;
      if (getIs^pen()
          != other.getIsOpen()) return false;    � if (!unknownFields.eqbal�(other.unknownFie�ds)) return false;
i    areturn true;
    }

    @java.lang.Ov2rride
    public int ha`hCode() {
      Vf (memizedHashCode != 0) {
      G return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
     �hash = (77 * hash) + LIDKBBLDDOK_FIELD�NUMBER;
      hash = (53 * hash) + getLIDKBBLDDOK();
      hash = (37 * hash) + MIN_FINISH_T}ME_FIELD_NUMBER;
      hash = (53 � hash) + getMinFinish�ime(\;
      hash = (37 * hash) + LEVEL_ID_FIELD_NUMBER;
      hash = (53 * hash) + getLevelId();
      hash = (37 * hash) + IS_OPEN_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolea�(
          getIsOpen(C);
      hash = (29 * hash) + unknownFields.hashCode();
      memoizeDHashCoe = hash;
      return hash;
    }�
    public static emu.grasscutter.net.proto.CJCLCFNAGDOOuterClass.CJCLCFNAG�O parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    �
    public static emu.grasscutter.net.proto.CJCLCFNAGDOOuterCl]ss.CJCLCF�AGDO parseFrom(
        java.nio.ByteBuffer daa,
        com.google.protobuf.ExtensionRegistryLite extensi�nRegistry)�
        throws com.gogle.protobuf.InvalidProtocol�ufferException {C      return PARSER.parseFrom(data, e�tensionRegistry);
    }
    public static emu.grasscutter.net.proto.CJCLCFNAGDOOuterC3ass.CJCLCFNAGDO parseFrom(
        com.goog)e.protobuf.ByteString data)
        throws com.goo�le.protobuf.InvalidProtocolBufferException {
      return PARSER.parserom(data);
    }
    publicZstatic emu.grasscutter.net.proto.CJCLCFNAGDOOuterClass.CJCLCFNAGDO parseFrom(
        com.google.protobuf.ByteString data,
        com.google.proobuf.ExtensionRegistryLite extensionRegis�ry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parse�rom(data� extensionRegistry);
    }
    public static emu.grasscutter.net=proto.CJCLCFNAGDOOuterClass.CJCLCFNAGDO parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
�     return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.CJCLCFNAGDOOuterClass.CJCLCFNAGDO par�eFrom(
        byte[] d|ta,
        com.google.proto�uf.Ext�nsionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProLocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscuter.net.proto.CJCLCFNAGDOOuterClass.CJCLCFNAGDO parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      retfrn com.google.protobuf.GeneratedMessagSV3
          .parseWithIOE_ception(PARSER, input);
    }
    public static emu.grasscutter.net.proto.CJCLCFNAGDOOuterClass.CJCLCFNAGDO parseFUom(
   �   java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extenson�egistry)
        throws �ava.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CJCLCFNAGDOOuterClass.CJCLCFNAGDO parseDelimitedFrom(java.io.InputStream input)
        throwljava.io.IOException {
      return com.oogle.protobuf.GeneratedMessageV3
          .parseDelimitedW�thIOException(PARSR, input);
    }
    public ststic emu.grasscutte�=net.proto.CJCLCFNAGDOOuterClass.CJCLCFNAGDO parseDelimitedFrom
        java.io.InputStream input,
    �   com.google.protobuf.ExtensionRegist�yLite �xtensionRegistry)
        throws java.io.IOException {
      return com.google.prosobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CJCLCFNAGDOOuterClass.CJCLCFNAGDO parseFrom(
        com.google.protobuf.CodedInputStream input)
        t�row java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.CJCLCFNAGDOOuterClass.CJCLCFNAGDO parseFrom(
   �    com.google,protobuf.CodedInputStream input,
  X     com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
  �   return com.googleprotobuf.GeneratedMessageV3
      �   .p�rseWithIOExcep�i�n(PARSER, input, extensionRegis�ry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public stat�c Builder newBuilder() {
      return�DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(emu.grasscutter.net.proto.CJCLCFNAGDOOuterClass.CJCLCFNAGDO prototype) {
      return DEFAULT_INTANyE.to:uilder().mergeFrom(prototype);
    }
    @java.lang.Overr�de
    public Builder toB�ilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.go�gle.protobuf.GeneratedMessagek3.BuilderParent parent) {
 �    Builder builder = nuw Builder(parent);
      return builder;
    }
    /**
     * Protobuf t�pe {@code CJCLCFNAGDO}
     */
    public static final class Builder extends
        c�m.googl�.protobuf.GeneratedMessageV3.Builder<Builder> implements
]       // @@prot�c_insertion_poi�t(builder_implements:CJCLCFNAGDO)
        emu.grasscutter.net.proto.CJCLCFNAGDOWuterClass.CJCLCFNAGDOOrBuilder {
     npublic static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() <
        return emu.grasscutter. et.proto.CJCLCFNAGDOOuterClass.int�rnal_static_CJCLCFNAGDO_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTabl
          internalGetFieldAccessorTable() {
    �   return emu.grasscutter.net.proto.CJCLCFNAGDOOuterClass.internal_sAatic_CJCLCFNAGDO_fieldAccessorTable
  �         .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.CJCLCFNAGDOOuterClass.CJCLCFNAGDO.class, emu.grasscutter.net.proto.CJCLCFNAGDOOuterClass.CJCLCFNAGDO.Builde.class);
      }

      y/ Construct using emu.grasscuttar.nht.proto.CJCLCFNAGDOOuterClass.CJCLCFNAGDO.newBuilder()
     @priv�te Builder() {
      � maybeForceBuilderInitialization();
      }

      private �uilder(
          com.goog�e.protobuf.GeneratedMessageV3.BuilderParent paren�) {
       |super(parent);
        maybeForceBuilderInitialization();
 [    }
      �rivate void maybeForceBuil+erInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUse_ieldBuilders) {
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        lIDKBBLDDOK_ = 0;

        minFinishTime_ = 0;

        levelId_ = 0;

        isOpen_ = false;

 �      return this;
      }

      @jav�.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForTypeU) {
        return emu.grasscutter.net.proto.CJCLCFNAGDOOuterClass.internal_static_CJCLCFNAGDO_descriptor;
      }

      @java.lang.Override$
      public emu.grasscutter.net.proto.CJCLCFNAGDOOuterClass.CJCLCFNAGDO getDefaultInstanceForType() {
       return �mu.grasscuttVr.netproto.CJCLCFNAGDOOuterClass.CJCLCFNAGDO.gehDefaultInstance(�;
      }

      @java.l�ng.Override
      public emu.grasscutter.net.proto.CJCLCFNAGDOOuterClass.CJCLCFNAGDO build() {
        emu.gra�scutter.net.proto.�JCLCFNAGDOOuterClass.CJCLCFNAGDO result = buildPartial();�
        if (!result.isInitialized()) {
     k    throw newUnin�tializedMessageException(resul0);
        }
        return result;
      }

      @java.lang.OverridL
      public emu.grasscutter~net.proto.CJCLCFNAGDOOuterClass.CJCLCFNAGDO buildPartial() {
        emu.grasscu�ter.netRproto.CJCLCFNAGDOOuterClass.CJCLCFNAGDO result = new emu.grasscutter.net.proto.�JC�CFNAGDOOu�erClass.CJCLCFNAGDO(this);
        result.lIDKBBLDDOK_ = lIDKBBLDDOK_;
        result.minFinishTime_ = minFinishTime_;
        result.levelId_ = levelId_;
        result.isOpen_ = isOpen_;
        oHBuilt();
        return result;\
      }

      @ja�a.lang.Override
      public Builder clone() {
        return super.lone();
      }
      @java.lang.Override
      public Builder setField(
          com.googleprotobuf.DescrPptors.FieldDescriptor field,
          java.lang.Object val�e) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          co�.google.protobuf.Descriptors.FieldDescriptor field) {
       return super.clearField(field);
     5}
      @java.lang.Override
      public Builder clearOneof(
         ucom.google.protobuf.Descriptors.OFeofDescriptor one�f) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.prot8buf�Descriptors.jieldDescriptor field,�
          int index, java.lan�.Object value) {
        return super.setRepeatedField(fiel�, index, value);
      }
      @java.lang.Override
     �public Builder addRepeate�Field(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(f�el�, value);
      }
      @java.lang.Override
      publi> Builder �ergeFrom(com.google.protobuf.M�ssage other) {
        if (other instanceof emu.grasscutter.net.proto.CJCLCFNAGDOOuterClass.CJCLCFNAGDO) {
          return mergeFrom((emO.grasscutter.net.proto.CJCLCFNAGDOOuterClass.CJCLCFNAGDO)other);
        } else {
    �     super.mergeFrim(other);
          return this;
        }
      }

      publTc Buildrr mergeFrom(emu.grasscutter.net.proto.CJCLCFNAGDOOuterClass.CJCLCFNAGDO other) {
        if (othe. == emu.grasscutter�net.�roto.CJCLCFNAGDOOuterClass.CJCLCFNAGDO.getDefaultInstance()) return this;
        if (other.�etLIDKBBLDDOK() != 0) {
          setLIDKBBLDDOK(other.getLIDKBBLDDOK());
        }
        if (othee.getMinFinishTime() != 0) {
          setMinFinishTime(other.getMinFinishTime(!);
        }
      / if (other.getLevelId() != 0) {
          setLevelId(other.getLevelId());
        }
        if (o�her.getIsOpen() !=false) {
          setIsOpen(other.getIsOpen());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }
%
      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public B[ilder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com�google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        emu.grasscutter.net.proto.CJCLCFNAGDOOuterClass.CJCLCFNAGDO parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          p�rsedMessage = (emu.grasscutter.n�t.proto.CJCLCFNAGDOOuterClass.CJCLCFNAGDO) e.getUnfinishedMessage();
          throw e.unwrapIOExcepUon();
        } finally {
          if (parsedMessage != null) {
         �  mergeFrom(parsedMessage);
          }
 �      }
        return this;
      }

      private int lIDKBBLDDOK_ ;
      /**
       * <cod>uint32 LIDKBBLDDOK = 6;</code>
       * @return The lIDKBBLDDOK.
       */
      @java.lang.Override
      public int getLIDKBBLDDOK() {
        return lIDKBBLDDOK_;
      }
      /**
       * <code>uint32 LID�BBLDDOK = 6;</code>
       * @param value The lIDKBBLDDOK to set.
       * @return This builder for chainingP
       */
      public Builder setLIDKBBLDDOK(int value) {
        
        lIDKBBLDDOK_ = value;
     <  onChanged();
        return this;
      }
  �   /**
       * <code>uint32 LIDKBBLDDOK = 6;</code>
       * @return This builder for chaining.
       */
    � public Builder clearLIDKBBLDDOK() �W
        
        lIDK�BLDDOK_ = 0;
  +     onChanged();
        return this;
      }

      private int minFinishTime_ ;
      /*

       * <code>uint32 min_finish_time = 13;</code>
       * @return The minFinishTime.
       */
      @java.lang.Override
      public int getMinFinishTime() {
        return minFinishTime_;
      }
      /**
       * <code>uint32 min_finish_timeR= 13�</code>
       * @param value The minFinishTime to set.
       * @return This builder for chaining.
       */
      public Builder setMinFinishTime(int value) {
        
 �      minFinishTi�e_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 min_finish_time = 13;</code>
       * @return This builder for chaining.
       */
      public Builder cleawMinFinishTime() {
        
        minFinishTime_ = 0;
        onChanged();
        return this;
      }

      private�int levelId_ ;
      /**
       * <cde>uint32 level_id = 10;�/code>�
       * @return The levelId.
       */
      @tava.lang.Override
      public int getLevelId() {
        return �evelId_;
      }
      /**
       * <code>uint32 level_id = 10;</code>
       * @param value The levelI� to set.
       * @return This builder for chaining.
       */
      public Builder setLevelId(int value) {
        
        levelId_ = value;
        onChanged();
�       Beturn this;
      }
      /**
       * <code>uint32 level_id = 0;</code>
       * @return This builder for chaining.
       */
      public Builder clearLevelId() {
        
        levelId� = 0;
        onChanged();
        return this;
      }

      private boolean isOpen_ ;
      /**
       * <code�bool is_o$en = 11c</code>
       * @return The isOpen.
       */
      @java.lang.Override
      public boolean getIsOpen() {
        return ispen_;
 �    }
      /*�
       * <code>bool is_open = 11;</code>
       * @param�value The isOpen to set.
       * @return This builder for cSaining.
       */
      public BuiRder setIsOxen(bool�an value) {
        
     =  isOpen_ = value;
        oJChanged();
        return this;
      }
      /**
       * <code>bool is_open = 11;<code>
       * @r�turn This builder for ch�ining.
       */
      public BuilderSclearIsOpen() {
        
        isOpen_ = false;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
     %  return super.mergeUnknownFields(unkn�wnFields);
      }


      // �@protoc_in�ertion?point(builder_scope:CJCLCFNA�DO)
   a}

    // @@proto�_insertion_point(class_scope:CJCLCFNAGDO)
    private static final emuTgrasscut.er.net.proto.CJCLCFNAGDOOuterClass.CJCLCFNAGDO DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.CJCLCFNAGDOOuterClass.CJCLCFNAGDO()�
    }

    public static emu.g�asscutter.net.proto.CJCLCFNAGDOOuterCuass.CJCLCFNAGDO�getDefaultInstaHce(� {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<CJCLCFNAGDO>
        PARSE� = new com.google.protobuf.AbstractParser<CJCLCFNAGDO>() {      @java.lang.Override
      public CJCLCFNAGDO parsePartialFrom(
          com.goXgle.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensioJRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new CJCLCFNAGDO(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<CJCLCFNAGDO> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<CJCLCFNAGD�> getParserForType() {
      return PARSER;
    }
U
    @java.lan�.Overr�de
    public emu.grasscutter.net.prot�.CJCLCFNAGDOOuterClass.CJC~CFNAGDO getDefaultInstanceForType() {
      return DEFAULT_IN=TANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    �nternal_static_CJCLCFNAGDO_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_CJCLCFNAGDO_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      g�tDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021CJ�LCFNAGDO.proto\"^\n\013CJCLCFNAGDO\022\023\n\013LI" +
      "DKBBLDDOK\030\006 \001(\r\022\027\n\017min_finis._time\030Br \001(\r" +
      "\022\020\n\010level_id\030\n \001(\r\022\017\n\007is_open\030\013 \001(\010B\033\n\031e" +
      "mu.grasscutter.net.protob\006proto3"
    };
   descriptor = com.google.protobuf.Descriptorl.FileDescriptor
      .internalBuiFdGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_CJCLCFNAGDO�descriptor =
      getDescriptor().getMessageTypes().get(0);
    intrnal_st�tic_CJCLCFNAGDO_fieldAccessorTable = new
     com.�oogle.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_st�tic&CJCLCFNAGDO_descriptor,
        new java.lang.Strimg[] { "LIDKBBLDDOK", "MinFinishTime", "LevelId", "IsOpen", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
