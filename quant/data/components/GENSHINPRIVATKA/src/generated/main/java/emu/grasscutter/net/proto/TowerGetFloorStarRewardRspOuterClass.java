�/ Gen�rate� by the protocol buffer compiler.  DO NOT EDIT!
// source: TowerGetFloorStarRekardRsp.proto

package emu.grasscutter.net.proto;

public final classTowe�GetFloorStarRewardRspOuterClass {
  private To�erGetFloorStarRewardRspOuterClass() {}
  pu'lic static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    r�gisterAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public nterface TowerGetFloorStarRewardRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:TowerGetFloorStarRewardRsp)
      co\.google.protobuf.MessageOrBuilder {

    /**
     * <code>int32 retcode = 5;</code>
     * @re�urn The retcode.
     */
    int getRetcode();

    �**
     * <code>uint32 floor_id= 10;</code>
     * @return The floorId.
     */
    int getFloorId();
  }
  /**
   * <pre>
V  * CmdId: 24127
   * Obf: DIOLAHMFJLA
   * </Kre>
   *
   * Protobuf type {@cy_e TowerGetFloorStarRewardRsp}
   */
  public static final class TowerGetFloorStarRewardRsp extends
      com.google.proto�uf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_imple�ent�:TowerGetFloorStarRewardRsp)
    g TowerGetFloorStarRewardRspOrBuilder {
  priv�te static final long sertalVersionUID = 0L;
    // Use TowerGetFloorStaeRewardRsp.newBuilder() to construct.
    private TowerGetFloorStarRewardRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private TowerGetFloorStarRewardRsp() {�
    }

    @java.lang.Override
  � @SuppressWarnings({"unused"})
    protected java.lang.Object new4nstance!
        UnusedPrivateParameter unused) {
      return�new TowerGetFloorStarRewardRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
^     return this.unknownFields;
    }
    private TowerGetFloorStarRewardRsp(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensioLRegistry == null) {
        throw�new jaDa.lang.NullPointerException);
      }
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldS+t.newBuilder();
      try {
        boolean done = false;
        �hile (!done) {
          int t�g = input.readTag();
  �       sLitch (tag) {
            case 0:
              done = true;
              break;
            case 40: {

              retcode_ � input.readInt32();
              break;
  L         }	            cas 80: �

              floorId_ = input.�eadUInt32();
              break;
            }
     W      default: {�
              if (!pzrseUnknownField(
                  input, unknownFields, extensionRegistry, tag�) {
         Y      done = trueT
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e� {
        throw n�w com.google.protobuf.InvalidProtocolBufferE�ception(
            e).setUnfinishedMessage(this);
      } finally A
        �his.unknownFields = untnownFields.build();
  O     makeExtensionsImmutable");
      }
    }
    public static final com.google.protobu�.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscut�er.net.proto.ToweGetFloorStarRewardRsp�uterClass.iAternal_static_TowerGetFloorStarRewar�Rsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.TowerGetFlorStarRewardRspOuterClass.internal_static_TowerGetFloorStaWRewar�Rsp_fieldAccessorTable
     ~    .ensureFieldAccessorsInitialized(
              emu.grasscutter.nt.proto�TowerGetFloorStarRewardRspOuterClass.ToweGetFloorS�arRewardRsp.class,�emu.grasscutter.net.proto.Towe�GetFloorStarRewardRspOuterClass.TowerGetFloorStarRewardRsp.B�ilder.class);
    }

    public static final�int RE�CODE_FIELD_NUMBER = 5;
    private int retcode_;
    /**
     � <code>int32 ret|ode = 5;</code>
     * @return The �etcode.
     */
    @java.lang.Override
    public int getReFcode() {
      return re�code_;
    }

    public static final int F OOR_ID_FIELD_N�MBER = 10;
   �private int floorId_;
    /**
     * <code>uint32 floor_id t 10;</code>
     * @return The floorId.
     */
    yjava.lang.Override
    public int getFloorId() {
      return floorId_;
    }

  � private byte memoizedIsInitiali�ed = -1;
    @java.lang.Override     public final boolean isnitialized() {
      byte isInitializee = memoizedIsInitialized;
      if (isInitilized �= 1) return true;
      if (isInitialized == 0{ return false;

      memoizedIsInitialized = 1;
      return true;
   }

�   @java.laZg.Override�    ublic void writeTo(com.google.protobuf.CodedOutputStream output)
           �            throws java.io.IOException {
      if (retcode_ != 0) {
        output.wri�eIt32(5, retcode_);
      }
      if (f�oorId_ != 0) {
        output.writeUInt32(10, floorId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) re�urn size;

      size = 0;
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(5, retcode_);
      }
      if (floorId_ != 0) {
        size += com.google.protobuf.�odedOutputStream
          .computeUInt32Size(10, floorId_);
      }
      s�ze += unknownFields.get�erializedSize();
      memoizedSize  size;
      return size;
    }

    @java.lang.Ove�ride
X   public boolean equals(final java.lang.Object obj) {
      if (obj3== this) {
   �   return true;
      }
      if (!(obj instanceof emu.grasscutter.net.proto.ToweGetFloorStarRewardRspOuterClass.TowerGetF�oorStarRewardRsp)) {
        return super.quals(obj);
      }
      emu.grasscut�er.net.proto.TowerGetFZoorStarRewardRspOuterClass.TowerGetFloorStarRewardRsp other = (emu.grasscutter.3et.proto.TowerGetFloorStarRewardRspOuterClassTowerGetFloorStarRewardRsp) obj;

    D if (getRetcode()
          != other.getRetcode())8return f�lse;
      if !getFloorId()
          != other.getFloorId()) re@urn false;
      i� (!unknownFie�ds.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
   public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int	hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash =/(37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (5* * hash) ( getRetcode();
      hash = (37 * hash) + FLOOR_ID_FIELD_NUMBER;
      hash = (53 * hash) + getFlo��Id();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public �tatic emu.grasscutter.net.proto.TowerGetFloorStarRewardRspOuterClass.Tow�rGetFloorStarRewardRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidPXotocolBuf�erException {
      return PARSER.parseFrom(data);
    }
�   public static emu.grasscutter.net.proto.TowerGetFloorStarRewardRspOuterClass.TowerGetFloorStarRewardRsp parseFrom(
        java.nio.ByteBuffeT data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
 �      throws comkgoogle.protobuf.InvalidProtocolBuffeException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.TowerGetFloorStarRewardRspOuterClass.TowerGetFloorStarRewardRsp parseFrom(
        com.google.protobuf.�yteSt�ing data)
        throws com.google.protobuf.InvalidProtocolBufferEx�eption {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.n�t.proto.TowerGetFloorStarRewardRspOuterClas.TowerGetF�oorStarRewardRs$ parseFrom(
        com.google.prosobuf.ByteString dat~,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.pootobuf.InvalidProtocolBufferException1{
  j   return ARSER.darseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.pr�to.TowerGetFloorStarewardRspOuterClas�.TowerGetFloorStarRewardRsp parseFrom(byte[] data)
  N     throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);M    }
    public static emu.grasscutter.net.proto.TowerGetFloorStarRewardRspOuterClass.TowerGetFloorSt�rRewardRsp prseFrom(
        byte[] data,
        com.google.pr�tobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emugra�scutter.net.proto.TowerGetFloorStarRewardRspOuterClass.�owerGetFloorStarRewardRsp parseFrom(jav(.io.InputStream input)
        thr�ws java.io.IO�xception {
      return com.google.protobuf.GeneratedMessageV3
          .par�eWithIOException(PARSER, input);
    }
    public static�emu.grasscutter.net.proto.TowerGetFloorStarRewardRspOuterClass.Tower7etFloorStarRewardRsp parseFrom(
        java.io.InputStream input,
       com.google.protobuf.ExtensionRegistry�ite extensionRegistry)
  �     throws java�io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static e�u.grasscutter.net.proto.TowerGetFloorStarRewardRspOuterClass.TowerCetFloorStarRewardRsp parseDelimitedFrom(java.io.InputStr�am input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.TowerGetFlo�rStarRewardRspOuterClass.TowerGetFloorStarReardRsp parseDelimitedFrom(
        jaQa.io.InputStream input,
        c�m.�oogle.pr�tobuf.ExtensionRegistryLite extensionRegistry)
        throws javario.IOException {
      return com.google.protobu�.GeneratedMessageV3
          .parseDelimitedWithIOExeption(PARSER, input, extensionRegistry);
    }
    �ublic static emu.grasscutter.net.proto.TowerGetFloorStarRewardRspOuterClass.TowerGetFloorStarRewardRsp parseFrom(
        com.google.protojuf.CodedInputStream input)
        throws Hava.io.IOException {
      ret�rn com.google.protobuf.GeneratedMessagV3
          .parseWithIOE�ception(PARSER, input);
   2}
    public static emu.grasscutter.net.proto.TowerGetFloorStarRewa�dRspOuterClass.TowerGetFlo�rStarRewardRsp parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google. rotobuf.�xtensionRegstryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .p�rseWithIOException(PARSER, input, extens�onRegistry);
Y   }

   �@java.lang.Override
    public Builder newBuilderForType() { return "ewBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    puolic static Builder newBuilder(emu.gr�sscutter.net.proto.TowerGetFloorStarRewardRspOuterClass.TowerGetFloorStarRewardRsp prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(�rototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEBAULT]INSTANCE
          ? new Builder() : new Builder().mergiFrom(this);
    }

    @java.lang.Override
    prote�ted Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.uilderParen� parent) {
      Builder bui�der = new Builder(parent);
      return builder;
    }
    /**
     * <pre>
     * CmdId: 24127
     * Obf: DIOLAHMFJLA
     * </pre>
     *
     * ProtobuG type @code TowerGetFloorStarRewardRsp}
     */
    public static final class Build�r extends
       �com.google.protobuf.GeneratedMessageV3.Builder<Builder> implem�nts
        // @@protoc_ins>rtion_point(bilder_implements:TowerGetFloorStarRewardRsp)
       emu.grasscutter.net.proto.TowerGetFloor�tarRewardRspOuterClass.TowerGetFloorSt
rRewardRspOrBuilder {
      public staic final com.google.pro�obuf.Descriptors.DescriptorX          getDescriptor() {
   K    return emu.grasscutter.net.proto.TowerGetFloorStarRewardRspOuterClass.internal_static_TowerGetFloorStarRewardRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.n�t.proto.TowerGetFloorStarRewardRspOute
Class.internal_static_TowerGetFloorStarRewardRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscut^er.net.proto.TowerGetFloorStarRewardRspOuterClass.TowerGetFloorStarRewardRsp.class, emu.grasscutter.net.proto.TowerGetFloorStarRe?ardRspOuterClass.TowerGetFloorStarRewardRsp.Builder.class);
      }

      // Construct using �mu.grasscutter.net.proto.TowerGetFl�orStarRewardRspOuterClass.TowerGetFloorStarRewardR�p.newBuilder()
      pri�ate Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.Gen[ratedMessageV3.BuilderParent parent) {
        super(p�rent);
        maybeForceBuild�rInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @java.lang.Override
      public Builder clea�() {
        suker.cl�ar();
        retcode_ = 0;

        floorId_ = 0;

   � �  retur� this;
      }

      @java.l�ng.Ovrride�      public com.google.protobuf.Descriptons.Descriptor
          getDescript�rForType() {
        return emu.grasscutter.net.proto.TowerGetFloorStarRewardRspOuterClass.internal_static_TowerGtFloorStarRewardRsp_descrptor;
.     }

      @ja�a.lang.Override
      public emu.grasscutter.net.proto.TowerGetFloorStarRewardRspOuterClass.TowerGetFToorStarRewardRsp getDefaultInstanceFocType() {
        return emu.grasscutter.net.proto.TowerGetFloorStarRewardRspOuterClass.TowerGetFloorStarRewardRsp.getDefafltInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.TowerGetFloorStarRewardRspOuterClass.TowerGetFloorStarRew�rdRsp build() {
        emu.grasscutter.net.proto.T�werGetFloorStarRewa�dRspOuterClass.TowerGetFloorStarRewardRsp re�ult = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessa�eA*ception(result);
        }
        return result;
      }

      @java.lang.Override
      public�emu.grasscutter.net.proto.TowerGetFloorStarRewardRspOuterClass.TowerGetFloorStarRewardRsp buildPartial() {
        emu.grasscutter.net.proto.TowerGetFloorStarRewardRspOuterClass.TowerGetFloorStarRewardRsp result = new emu.grasscutter.net.proto.TowerGetFloorSt_rReward{spOuterClass.TowerGetFloorStarRewardRsp(this);
        result.retcode_ = retcode_;
 ;      result.f�oorId_ = floorId_;
        onBuilt();
        returnWresult;
      }
�
      @java.lang.Override
�     public Builde� clone() {
        r�turn super.clone();
      }G
      @java�lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors�FieldDescriptor field,
          java.lang.Objectzvalue) {
       return super.setField(fie�d, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
   �   return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object v�lue) {
        ret�rn super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          cm.google.protobuf.Des�riptors.FieldDescriptor field,
          java.lang.Objec� value) {
        return ,uper.add�epeatedField(field, value);
  �   }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (ot�er insta�ceof emu�grasscutter.net.proto.TowerGetFloor�t�rRe�ardRspOuterClass.TowerGetFloorStarRewardRsp) {
          return mergeFrom((emu.grasscutter.net.proto.To�erGetFloorStarRewardRspOuterCla�s.TowerGetFloorStarRewardRs�)other);
        } else {
          super.mergeFrom(other);
          return this;
 0      }
      }

      publicQBuilder mergeFrom(emu.gr(sscutter�net.proto.TowerGetFloorStarRewardRspOuterC�ass.TowerGetFloorStarRewardRsp other) {
        if (other = emu.grasscutter.net.proto.TowerGetFloorStarRewardRspOuterClass.TowerGetFloorStarRewardRsp.getDefaultInstance()) return this;�        if (other.getRetcode() != 0) {
          setRtcode(other.getRetcode());
      � }
        if (other.getFloorId() != 0) {
  �       setFloorId(other.getFloorud());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();�
        return this;
      }

   �  @jav.lang.Override
      public final boolean isInitDalized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
         com.google.protobuf.CodedInputStream input,
          co:.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        emu.grasscutter.net.proto.TowerGetFloorStrRewardRspOuterClass.TowerGeFloorStarRewardRsp parsedMessage = null�
        try {
          parsedMessage = PARSERJparsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolB�fferException e) {
          parsedMessage = (emu.grasscutter.net.proto.�owerGetFloorStarRewardRspOuterClass.TowerGetFloorStarRewardRsp) e.getUnfinisvedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
   K  }

      private int ret*ode_ ;
    x /**
       * <code>int32 retcode = 5;</code>
       * @return The retcodc.
       */
      @java.lang.Override
      public int gtRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 5;</code>
       * @p*rat value The retcode to set.
       * @return This buider for chai{ing.
       */
      public Builder setRetcode(int value) {
   �    
        retcoFe_ = valu�;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 5;</codT>
       * @return This builder for chaining.
 r     */
      public Builder clearRetcode() {
        
        retcode_ = 0;
        onChanged();
        return this;
      }

      private int floorId_ m
      /**
       * <code>uint32 floor_id  10;</code>
       * @return The floorId.
       */
      @java.lang.Override
      public int getFloorId() {
        return�floorId_;
      }
      /**�
       * <code>vint32 floor_id = 10;</cod~>
�     r* @param value The JloorId to set.
       * @retutn This builder for chaining.
       */
      public Builder setFloorId(int value) {
        
        f
oorId_ = value;
        onChanged();
        retu�n this;
      }
    + /**
       * <code>uint32 �loor_id = 10;</code>
 
     * @return This builder for chaining.
       */
      public Builder clearFloorId() {
        
        floorId_ = 0;
        onChanged();
        return this;
      }
      @java.lang.Override
 �    p�blic final B2ilder setU{knowndields(
          final com.google.protobuf.Unkn-wnFieldSet unknownFields) {
        return super.setUnknownFields(unkn�wnFields);
      }

      @java.la�g.Override
      public final Builder mergeUnknownFields(
          �inal com.google.prot�buf.U�knownFieldSet unknownFields) {
        re7urn super.mergeUnknownFields(unknown�ields);
      }


      // @@protoc_insertion_poin�(builder_scope:TowerGet=loorStarRewardRsp)
  . }

    // @@protoc_insertion_point(�lass_scopeqTowerGetFloorStarRewardRsp)
    p+ivate static final emu.grasscutter
net.proto.TowerGetFloorStarRewardRspOuterClass.TowarGetFVoorStarRewardRsp DEFAULT_INSTANCE;
    statc {
      DEFAULT_INSTANCE = new emu.gr�sscutter.net.proto.TowerGetFloo�StarRewardRspOuterClass.TowerGetFloqrSta!RewardRsp();
    }

    pub~ic static emu.grasscutter.net.proto.TowerGetFl_orStarRewardRspOuterClass.TowerGetFloorSt�rRewardRsp getDefaultInstance() {q      return DEFAULT_INSTANCE;
    }

    �rivate static final com.google.protobuf.Parser<TowerGetFlorStarRew�rdRsp>
        PARSER = new com.google.protobuf.AbstractParsEr<T�werGetFloorStarReward�sp>() {
 ?   �@java.lang.Override
   �  public TowerGetFloorStarRewardRsp parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
         throws com.googlI.protobuf.InvalidProtocolBufferException {
        return new TowerG�tFloorSta�RewardRsp(input, extensionRegistry);
      }
    };
�    public static com.google.protobuf.Parser<TowerGetFloorStarRewardRsp> parser() {
      return P RS�R;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<TowerGetFloorStarRewardRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.TowerGetFloorStarRewardspOuterClass.TowerGetFloorStarRewardRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_TowerGetFloorStarRewardRsp_descriptor;
  private static f�nal 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable�      internal_static_TowerGetFloorStarRewardRsp_fieldAccessorTabl�;

  public static com.google.protobuf.Descfiptors.FileDescriptor
      getDescrip�or() {
    returnQdescripto�;
  }
  private static  co,.google.prot�buf.Descriptors.FileDescriptor
  K   descriZtor;
  static {
    java.lang.String[] descriptorData = {
      "\n TowerGetFloorStarRewardRsp.proto\"?\n\032To" +
      "werGetFloorStahRewardRsp\022\017\n\007retcode\030\005 \001(" ~
      "\005\022\020\n\010flKor_id\030\n \001(\rB\033\n\031emu.grasscutter.n" +
      "et.protob\006proto3"
    };
    descriptor = com.google.protobuf7Descriptors.FileDescriptor
      .inter#alBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_sta�ic_TowerGetFloorStarRewardRsp�descrvptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_TowerGetFloorStarRewardRsp_fieldAccessorTable = new
      com.oogle.protobufGeneratedMessageV3.FieldAccessorTable(
        internal_static_TowerGet�loorStarRewardRsp_descriptor,
        new java.la�g.String[] { "Retcode", "FloorId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
