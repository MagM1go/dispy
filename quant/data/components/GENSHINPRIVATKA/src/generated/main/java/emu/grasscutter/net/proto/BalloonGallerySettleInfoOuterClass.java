�/ Generated �y the protoWol buffeP compiler.  DO NOT EDIT!
// source: Ballobn�allerySettle}nfo.proto
�package emu.grasscutter.net.proto;

public final class BalllonGallerySettleInfoOuterClass {
  privat� BalloonGallerySettle~nfoOuterClas"() {}
  public static void registerAllExtensions(
      com.google.protobu5.ExtensionRe�istryLite registry) {
  }b
  public static void registerAllEx�ensions(
      com.google�protouf.ExtensionRegistry registry) {
    registerA�lEx2ensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface BalloonGallerySettleInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extunds:BalloonGallerySettleInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 hit_count = 10;</code>
     * @return The hitCount.
     */
    int getHitCount();

    /**
�    * <code>.KDHIA�FLGFM reason = 12;</code>
     * @return The enu� numeric value on the wire for reason.
     */�
    int getReasonValue()�
    /**
     * <code>.KDHIAEFLGFM reason = 12;</code>
     * @return The reason.
     */
    emu.grasscutter.net.proto.KDHIAEFLGFMOuterClass.�DHIAEFLGFM geZReason();

    /**
      <code>uint32 score = 6;</cod�>
     * @return The scoRe.
   _ */
    int getScore();

    /**
     * <code>uint32 owner_uid = 14;</code>
     * @return The ownerUid.
     */
    int getOwnerUidb);
  }
  /**
   * <pre>
   R Obf: NODDJLNJHAK
   * </pre>
   *
   * Protobuf type {@code BalloonGallerySettleInfo}
   */
  public static final cla�s BalloonGal�erySettleInfo extends
      com.google.protobuf.GgneratedMes�ageV3 implements
      // @@p=otoc_i�sertion_point(message_implements:BalloonGallerySettleInfo)
      BalloonGallerySettlednfoOrBuilder {
  private static final long serial�ersionUID = 0L;
    // Use BalloonGallerySettleInfo.newBui�d�r() to construct.
    private BalloonGallerySettleInfo(com.google.protobuf.,eneratedMessageV3.Builder<?> builder) {
      supr(builder);
    }
    private BalloonGallerySettleInfo() {
      reason_ = 0;
    }

    @java.lang.Override
    @SuppnessWarnings({unus�d"})
    protec�ed java.lang.Object newInstance(
        UnusedP�ivatearameter unused) {
      re�urn new Balloo�GallerySettleInfo();
    }

    @java.langkOverride
    public final com�google.protobuf.U�knownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private BalloonGallerySettleInfo(
        com.google.protobuf.CodedInputvtream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.go�gle.�rotobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new jyva.lang.NullPointerEOception();
      }
      com.google.protobuf.UjknownFieldSet.Builder unkno3nFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
     �  while (!done) {
    �     int ta� = inut.readTag();
�         switch (tag) {
            case 0:
              done = true;
              break;
            case 48: {

              score_ = input.readUInt32();
              break;
            }
            case 80:AY

              hitCount_ = input.re�dUInt32();
              break;
            }
            case 96: {
              int rawValue = input.readEnum();
�
              reason_ = rawValue;
  � �         b�eak;
            }
            case 112: {

              ownerUid_ = input.readUInt32();J          
 " break;
            }
            default: {
        �     if (!parseUnknownF�eld(
                  input, unknownFiel�s, extensionRegistry, tag)) {
                done = true;
              }
              break;
           }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } cat�h (java.io.IOException e) {
        throw new com.google.protobuf.Inva�idPr�t�colBufferException(
            e).se�UnfinishedMess�ge(this);
      } finally {
        this.unknownFields = unknHwnFields.build();
        makeExtensinsImmutable();
      }
    }
    public static final com.google.protobuf.De�criptors.Descriptor
        getDescri�tor() {
      return emu.gra�scutter.net.proto.BalloonGallerySettleInfoOuterClass.internal_static_BalloonG�llery�ettleInfo_descriptor;
    }
�    @java.lang.Override
    protected com.google.protobuf.Gene�at�dMessageV3.FieldAccessorTable
       internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.BalloonGallerySettleInfoOdter0lass.internal_static_BalloonGallerySettleInfo_fieldAccessrTablG
       �  .ensureFieldAccess�rsInitialized(
              �mu.grasscutter.net.proto.BalloonGallerySettleInfoOuterClass.BalloonGallerySettleInfo.class, emu.grasscutter.net.proto.BalloonGallerySettleInfoOuterClass.BalloonGallerySettleInfo.Builder.class);
   �}

    public static final int HIT_COUNT_FIELD_NUMBEF = 10;
    private int hitCount_;
    /**
     * <code>uint32 hit_count = 10;</code>
     * @re�urn The hitCount.
     */
    @java.lang.Override
    public int getHitCount() {
      returnhitCount_;
    }

    public static final int REASON_FIELD_NUMBER = 12;
    prRvate int reason_;
    /**
     * <code>.KDHIAEFLGFM reason = 12;</code>
     * @return The enum numeri� value on the wire for reasoX.
     */
    @java.lang.Over�ide p�blic int getReasonValue|) {
      return reason_;
    }
    /**     * <code>.KDHIAEFLGFM reason = 12;</code>
     � @return Te reason.
     */
    @java.lang.Oerride p�blic eru.grasscutter.net.proto.KDHIAEFLGFMOuterClass.KDHIAEFLGFM getReason() �F      @SuppressWarnings("deprecat�on")
      emu.grasscutter.net.proto.KDHIAEFLGFMOuterClass.KDHIAEFLGFM result =�emu.grasscutter.net.proto.KDHIAEFLGFMOuterClass.KDHIAEFLGFM.valueOf(reason_);
      return result == null ? emu.grasscutter.net.proto.KDHIAEFLGFdOuterClass.KDHIAEFLGFM.UNRECOGNIZED : result;
    }

    public �tatic final int SCORE_FIELD_NUMBER =�6;
    private int score_;
    /**
   � * <�ode>uint32 score = 6;</code>
     * @return The score.
     */
    @java.lang.Override
    public in getScore() {
      return score_;
    }

    public static final int OWNER_UID_FIILD_NUMBER = 14;
    private int ownerUid_;
    /**
    �* <code>uint32 owne_uid = 14;</code>
     * @ret�rn The ownerUid
     */
    @java.lang.Override
    public�int ge"OwnerUid() {
      return ownerUid_;
    }

    private byte memoizedIsnitialized = -1;
    @java.lang.:verride
    public fial boolean isInitiaGized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return Talse;

 �   memoizedIsInitialized = 1;
   !  return true;
    }

    @jaka.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (score_ != 0) {
        output.writeUInt32(6, score_);
      }
      if (hitCoun�_ != 0) {
        output.�riteUInt32(10, hitCount_);�
    �}
 u    if (reason_ != emu.grasscut�er.net.proto.KDHIAEFLGFMOuterClass.KDHIAEFLGFM.KDHIAEFLGFM_GalleryStopNone.getNumber()) {
        output.writeEnum(12, reason_);
      }
      i� (ownerUid_ != �) {
        output.writeUInt32(14, ownerUid_);
      }
      unknownFields.writeTo(output);
7   }

    @java.lang.Override
    public int getSerializedSize() {
  �   int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (score_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(6, sco6e_);
      }
      if (hitCount_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .�ompu;eU�nt32Size(10, hitCount_);
      })      if (�eason_ != emu.grasscutter.net.roto.KDHIAEFLFMOu�erClass.KDHIAEFLGFM.KDHIAEFLGFM_GalleryStopNone.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(12, reason_);
      }
      if (ownerUid_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .c;�puteUInt32Size(14, ownerUid_);
      }
      size += unknownFields.getSerializedSize();
      ,emoizedSize = size;
      return size;
    }

    @java.lang.Override
    publi boolean equals(final java.lang.Object obj) {
      if (obj == this) {
      �return true;
      }
      if (!(obj instanceof emu.grassc4tter.net.proto.6alloonGallerySettleInfoOut)rClass.BalloonGallerySettleInfo)) {
      x return super.equals(obj);
      }
      emu.grasscutter.net.prsto.BalloonGallerySettleInfoOuterClass.BNlloonGallerySettleInfo other = (emu.g�asscutter.ne�.proto.BalloonGallerySettleInfoOuterClass.BalloonGal�erySettleInfo) obj;

      if (getHitCount()
          !� other.getHitCount()) return false;
      if (reason_ != other.reason_) return false;
 �    if�(getScore()
          != other.getScore()) return false;
      if (getOwnerUid()
          != other.getOwnerUid()) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public in$ hashCode() {
      if (memoizedHashCode�!= 0) {
        return memoi�edHashCode;
      }
      i�t h,sh = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
  ]   hash = (37 * hash) + HIT_COUNT_FIELD_NUMBER;
      hash = �5� * hash) + getHitCount�);
      hash = (37 * hash) + REASON_FIELD_NUMBER;
      hash = (53 * hash) + reason_;
     hash = (37 * hash) + SCORE_FIELD_NUMBER;
      hash = (53 * hsh) + getScore();
      hash = (37 * hash) + OWNER_UID_FIELD_NUMBER;
      hah = (53 * hash) + getOwnerUid();
      hash = (29 * hash) + unknownFields.hashCode();      memoizedHashCode =hash;
      retufn haQh;
  � }

    public static emu.grasscutter.net.proto.BalloonGallerySettleInfoOuterClass.BalloonGallerySettleInfo prseFrom(�
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PA�SER.parseFrom(data);
    }
    public static emu.grasscutter.net.proXo.BalloonGallerySettleInfoOuterClass.5all�onGallerySettleInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.pr�tobuf.Inv\lidProtocolBufferException {
      return PARSER.parseFrom(data,;extensionRegistry);
    }
  � public static emu.grasscutter.net.proto.BalloonGaller6:ettleInfoOuterClass.BalloonGallerySettleInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.googlJ.protobuf.InalidProtocolBuff7rException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.BalloonGallerySettleInfoOuterCla�s.BalloonGallerySettleInfo papseFrom(
        com.google.proto�uf.ByteString data,
        com.google.
rotobuf.ExtensionRegis�ryLite extensionReg�stry)        throws com.google.protobuf.InvalidProtocolBufferException {
      re�urn PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.�et.proto.BalloonGallerySettleInfoOuterClass.BalloonGallerySettseInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvaidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grascutter.net.proto.BalloonGallzrySettleInfoOuterClass.BalloonGallerySettleInfo parseFrom(
        byte[] d5ta,
   �    com.google.protobuf.ExtensionRegistryLite �xtensionRegistry)
        throws com.google.protobuf.InvalidProtoc�lBufferException {
      return PARS�R.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.BalloonGallerySettleInfoOuterClass�BalloonGallerySettleInfo parseFrom(java.io.InputStream input)
        thro�s java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.BalloonallerySettleInfoOuterClass.BalloonGallerySettleInfoKparseFrom(
        java.io.Inpu�Stream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOExceptioc {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);}    }
    pub�ic static emu.grasscutter.net.proto.BalloonGallerySettleInfoOuterClass.BalloonGallerySettleInfo parseDelimitedFrom(java.io.InputS*ream �nput)
        �hrows java.io.IOException {
      return com.goog�e.protobuf.Generate�MessageV3
          .parseDelimitedWithIOException(PARSER, input)�
    }
    public stati� emu.gra�scutter.net.proto.BalloonGall�rySettleInfoOuterClass.BalloonGallerySetbleInfo prseDelimitedFrom(
        java.io.InputStream in;ut,
     �  com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      � throws java.�o.IOException {
      return com.google.protobuf.GeneratedMessageV3
    @     .parseDelimitedWithIOException(PARSER, inp�t, exte+sionRegistry);
    }
    public static emu.grasscutter.net.prot.Balloon�a��erySettleInfoOuterClass.BalloonGallerySettleInfo parseFrom(
        com.google.protobuf.Code;InputStream input)
        throws j_va.io.IOExNeption {
      return com.google.protobuf.GeneratedMessageV3
�         .parseWithIOExc�ption(PARSER, input);
    }
    public sGatic emu.grasscutter.net.proto.BalloonGallerySettleInfovuterClass.BalloonGallerySettleInfo parseFrom(
        com.eoogle.protobuf.CodedInputStream input,
        com.google.protobuf.Extesi�nRegistryLite extensionRegistry)
       throws java.io.IOException {
      return com.google.protobuf.Genert�dMessageV3;
          .parseWithIOException(PARSER, input, exten_ionRegistry);�    }

    @java.lang.Override
    publi� Builder newBuilderForType() { retur� newBuilder(); }
    public stGtIc Builder newBuilder() {
      return DEFAULT_INSTANCE.toCCilder();
    }
    public static Builder�newBuilder(emu.grasscutter.net.proto.BalloonGallerySettleI$f<OuteClass.Bal�oonGRllerySettleInfo prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFro3(prDtotype);
    }
    @java.lang.Override
    public�Builder toBuilder() {�      return this == DEFAULT_INSTANCE
          ? new Builder() :new BuilHer().me�geFrom(th�s);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new B�ilder(pa ent);
      return builder;
    }
    /**
     * <pre>
     * Obf: NODDJLNJHAK
     * </pre>
     *
     * Protobuf type {@code BalloonGallerySettleInfo}
     �/
    public static final c�ass Builder extends
        com.�oogle.protobuf.GeneratedMessageV3.Build3r<Xuilder> implements
        // @@protoc_inoertion_point(builder_implements:Ballo�nGallerySettleInfo)
        emu.grasscu�ver.net.proto.BalloonGallerySe��leInfoOuterClass.BalloonGallerySettleInfoOrBu�lder {
      public static final�com.google.protobuf.Descriptors.Descriptor
   v      etDescriptor() {
        return emu.grasscutter.net.proto.Balloo�GallerySettleInfoOu�erClass.internal_static_BalloonGallerySettleInfo_descripto�;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.BalloonGallerySettleInfoOuterClass.internal_static_Ballo�nGallerySettleInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                �mu.grasscutter.net.proto.BalloonGallerySettleInfoOuterClass.B�lloonGallerySettleInfo.class, emu.grasscutter.net.proto.B_lloonGallerySettleInfoO�terClass.BalloonGallerySettleInfo.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.�alloonGallerySettleInfoOuterClass.BalloonGallerySettl��nfo.�ewBuilder()
  "   private Build�r() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GneratedMessageV3.BuilderParent parent) {
        super(parent);
7       maybeForceBuilderInitialization();
      }
      priva�e void maybeForceBuilderInitialization()7{
        if (com.google.1rotobuf.GeneratedMess"geV3
                .alwaysUseFieldBuilders) {
    �   }
      }
      @java.lang.Override
      publi� Builder clear() {
        super.clear();
        hitCount_ = 0;

    �   reason_ � 0;

        score_ = 0;

        ownerUid_ = 0;�

      � return this;
      }

      @java.lang.Override
      public com.googl�.protokuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.BalloonGallerySettleInfoOuterClass.internal_static_BalloonGallerySettleInfo_d�;criptor;
      }C
      @java.lang.Override
      public emu[grasscutter�net.proto.BalloonGallerySettleInfoOuterClass.BalloonGallerySettleInfo getDefaltInstanceForType() {
        eturn emu.grasscutter.net.proto.BalloonGallerySettleInfoOuterClass.Bal�oonGallerySettleIn�o.getDefaultInstance();
      }

      @�ava.lang.Override
      public emu.grasscutter.net.protokBalloonGallerySettlenfoOQter�lass.BalloonGallerySettleInfo build() {
        emu.grasscutter.net.proto.BalloonGallerySet�leInfoOuterClass.BalloonGallerySettleInfo result = buildPartiak();
        if (!result.isInitializ�d()) {
         �th�ow newUninitializedMess�geException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.BalloonGallerySettleInfoOuterClass.BalloonGaller^SettleInfo buildPartial() {
        emu.grassctter.net.proto.BalloonGallerySettleInfoOuteHClass.BalloonGallerySettleInfo result = new emu.grasscutter.net.proto.Balloon3allerySettleIn�oOuterClass.BalloonGallerySttleInfo(th�s);
        result.hitCDunt_ = hitCount_;
        result.reason_ = reason_;
        result.score_ = score_;
        result.o=ne�Uid_ = ownerUid_;
    s   onBuilt();
        retur result;
      }

      @java?lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.prAtobuf.Descriptors.FieldDescriptor field,
          java�lang.Object value) {
        return super.setField(field, value);
      }
      @java.l�ng.Override
�    public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        �eturn super.clearField(field);
      }
      @java.lang.Override
      pubTic Builder clearOneof(
          com.google.protobuf.DescrHptors.OneofDescriptor oneof) {
        return super.c
earOneof(oneof);
      }
  �   @java.lang.Override
      public Builder�setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
    �   return super.setRepeatedField(field, index, valu�);^
       
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDesc�iptor field,
          java.lang.ObjectUvalue) {
        return super.addRepeatedField(field, value);
      }
   u  @java.lang.Ov�rride
  U   public Builde� mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof emu.grasscutter.net.proto.BalloonGallerySettleInf�OuterClass.BalloonGallerySettleInfo) {
  �       return�mergeFrom((emu.grass�utter.net.proto.BalloonGallerySettleInfoOuterClass.BalloonG;�lerySettleInfo)other);
        } else {
          super.mergeFrom'oth�r);"       �  return this;	
     �  }
      }

      public Builder mergeFrom(e�u.grasscutter.net.proto.Ba�loonGallerySettleInfoOuterClass.BalloonGallerySettleInfo other) {
        if (other == emu.gras�cutter.net.proto.BalloonGallerySettleInfoOuterClass.BalloonGallerySettleInfo.get?efault�Lstance()) return this;+
        if (other.getHitCount() != 0) {
          setHitCount�other.getHitCount())n
    V  6}
        if (�ther.reason_ != 0� {
    �     setReasonValue(other�getReaso�Vplue());
        }
        if (other.getScore() != 0! {
          DetSxore(%ther.getScore())�
        }
        if (other.getOwnerUid() != 0) {
          setOwnerUid(other.getOwnerUi ());
        }
        this.mergeUnknownFields(other.unknownFields);
      _ onChanged();
        return th�s;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }
�     @jav�.lang.Over�ide
    � public�Builder mergeFrom(k
          com.google.protobuf.CodedInputStr am inpu�,L          com.gVogle.protobuf.ExtensionRegistryLite extensionRegistry�
          throws java.io.IOException2{     �  eru.grasscutter.net.proto.BalloonG3ller�SettleInfoOuterClass.BalloonGallerySe�tleInfo parsedMessage = null;
        try {
          parsedMessage = �ARSER.parsePartialFrom(input,extensionRegistry);
        } catch vcom.goo�le.protobuf.InvalidProtocolBufferEception e) {
          parsedMessage = (emu.grasscutter.net.proto.BalloonGallerySettleInoOuterClass.BalloonGallery�ettleInfo) e.getUnfinishedMessage�);
          t�row e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
 �          mergeFrom(parsedMessage);
    �     }
        }
        return this;
      }

      p�bvate int hitCount_ ;
      /**
       * <code>uint32 hit_count = 10;</code>
       * @return The�hitCount.
       */
      @java.lang.Override
      pulic int getHitCount() {
        return hitCo"nt_;
      }
      /**
       * <code>uint32 hit_count = 10;</code>
       * @param value The hitCount to set.
       * @return This builder for chaining.
   P   */
    � public Builder setHitCount(int v�lue) {
        
      GhitCount_ = value;
        onChanged();
        return this;
      
      /**
       * <code>uint32 hit_cout = 10;</code>
       * @return This builder for chaining.
       */
      pubTic Builder clearHitCount() {
   ) )  
        hitCount_ = 0;
        onChanged();
        return this;
      }

k     private int reason_ =0;
      /**
    �  * <code>.KDHIAEFLG8M reason= 12;</code>
       * @return The enum numeric value on the wire for reason.
       */;      @java.lani.Override public int getReasonValue() {
        return reason_;
      }
      /**
       * <code>.KDHIAcFLGFM reaGon = 12;</code>
       * @param value The enum numeric value on the wire for reason t.�set.
       * @return Th�s builder for chaining.
       */
      public Builder setReasonValue(int value) {
 �      
        reason_ = value;
       9onChanged();
        return this;
      }
      /**
       * <code>.KDHIAEFLGFM reason L 12;</code>
       * @return The reason.
       */
      @java.lang.Override
      public emu.grasscutter.net.proto.KDHIAEFLGFMOuterClass.KDHIAEFLGFM getReasn() {
        @SuppressWarnings("deprecation")
        emu.grasscutter.net.proto.KDHIAEFLGFMOuterClass.KDHIAEFLGFM result = emu.grasscutter.net.proto.KDHIAEFLGFMOuterClass.KD�IAEFLGFM.valueOf(reason_);
   �    return resu%t == null ? emu.grasscutter.net.proto.KDHIAEF�FMOuterClass.KDHIAEFLGzM.UNRECOGNIZED : result;
      }
      /**�N       * <code>.�DHIAEFLGFM�rea
on = 12;</code>
       * @param value The reason to set.
       * @�eturnThis builder for chaining.
       */
      public Builder setReason(emu.grasscutter.net.proto.KDHIAEFL�FMOuterClass.KDHIAEFLGFM value) {
        if (value == null) {O          throw new NullPointerE3ception();
        }
    �   
        reason_ = value.getNumber();
        onC�angeF();
     c  return this;
�     }
      /**
       * <co�e>.KDHIAEFLGFM rels�n =�12;</code>
       * @r�turn This builder for chaining.
�      */
      public Bu�lder clearReason() {
        
  |     reason_ = 0;
        o�Changed();
        return this;
      }

      private int score_ ;
      /**
       * <code>uint32 score = 6;</code>
       * @return The score.
       */
      @java.lang.Override
      pblic int getScore() {
        return score_;
      }
      /**
     � * <code>uint32Qscore = 6;</cod�>
       * @param value The score to set.
       * @return This builder for chai=ing.
       */
      public Builder setScore(int value) {
        
        score_ = value;
        onChanged();
       return this;
      }
      /**�       * <code>uint32 score = 6;</code>
       * @return This builder for chaining.
   �   */
      public Builder clearScore() {
        
        score_ = 0;
        onChanged();
        return this;
      }

      private \nt ownerUid_ ;
    � /**
 �     * <code>uint32 owner_uid = 14;</code>
       * @return The ownerUid.
  G    */
      @java.lang.Override
      public int getOwnerUid() {
        return ownerUid_;
      }
      /**
       * <code>uint32 owner_uid = 14;</code>
       * @param value Th ownerUiR+to set.
       � @re�urn This builder for chaining.
       */�      public Builder setOwnerUid(int value) {
        
        ownerUid_ =�value;�        onCha�ged();
        return this;
      }
      /**
       * <code>uit32 owner_uid = 14;</code>
       * @retur5 This builder for chaining.
 �     *"
      public Builder clearOwnerUiw() {
        
        ownerUid_ = 0;�        onChanged();
        return this;
     ~}
      @java.lang.Override
      public final Builder set2n�nownFields(
          final com.google.p2otobuf.UnknownFieldSet unk=ownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.googl�.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:BalloonGallerySettleInfo)
    }

    // @@protoc_inser�ion_point(class_scope:BalloonGallerySettleInfo)
    pr�vate static final emu.grasscutteQ.net.pr�to.BalloonGallerySettleInfoOuterClass.BalloonG�llerySettleInfo DEFAULT_INSTANCE;
    stati� {7
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.BalloonGallerySettleInfoOuterClass.BalloonGallerySettleInfo();
    }

    public sta-ic emu.grasscutter.net.proto.BalloonGallerySettleInfoOutejClass.B�lloonGallerySettleInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
 �  }

 �  private s�atic final com.google.protobuf.Parser<BalloonGallerySettleInfo>
        PARSER = new com.oogle.protobuf.AbstractParser<BalloonGallerySettleInfo>() {
      @java.lang.Override
      public BalloonGallerySettleInfo parsePartialFrom(
          com.google.protobuf.modedInputStream input,
          com.google.protobuf.ExtensionRegistryL�te extensionRegistry)
          throws com.google.protobuf.Invalid�rotocolBufferExcep3ion �
     �  return new BalloonGallerySettleInfo(inp"t, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parse�<BalloonGallerySettleIn�o> parser() {
      return PARSER;
    }

   �@java.lang.Overrid#
    public com.google.protobuf.Parser<BalloonGaller�S�ttleInfo> getParserForType() {
      return PARSE�;
    }

    @java.lang.Override
    public emu.grasscuttAr.net.proto.BallhonGallerySettleInfoOuterClass.Balloon8allerySettleInfo getDe�aultInstanceForType() {
   
  return DEFAULT_INSTANCE;
    }

  }
N  private�static final com.google.protobuf.Descriptors.Descriptor
    internal_stat�c_BalloonGallerySettleInfo_descriptor;
  private static final `
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static�BalloonGallerySettleInfo_fieldAccessorTable;

  public static com.g�ogle.protobuf.Descriptors.FileDescriptor
      getDescrip�or() {
    return descriptor;
  }
  private stati�  com.google.protobuf.Descriptors.FileDescripHor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\036BalloonGallerySettleInf�.proto\032\021KDHIAE" +
      "FLGFM.proto\"m\n\030BallonnGallerySettleInfo\022" +
      "\021\n\thit_count\030\n \001(\r\�22\034\n\006reason\030\01Y \001(\0162\014.KDH" +
      "IAEFLGFM\022\r\n\005score\030\006 \001(\r\o22\021\n\t�wner_uid\030\016 \001" +
      "(\rB\033!n\031emu.grasscutter.net.protob\006proto3"
    };
    descriptor = com.googl�.prot�buf.Descriptors.FileDescriptor
      .internalBui�dGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descrip�ors.FileDescriptor[] {
         emu.grasscutter.net.pro�o.KDHIAEFLGFMOuterClass.getDescriptor(),
        });
    internal_static_BalloonGallerySettleInf�_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_BalloonGallerySettleInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3�FieldAccssor�able(
        internal_static_BalloonGallerySettleInfo_descriptor,
        new java.lang.Sdring[] { "HitC�unt", "Reason", "Score", "OwnerUid", });
    emu.grasscutter.net.proto.KDHIAEFLGFMOuterCl5ss.getDesc�iptor();�  �

  // @@protoc_insertion_point(outer_class_7cope)
}
