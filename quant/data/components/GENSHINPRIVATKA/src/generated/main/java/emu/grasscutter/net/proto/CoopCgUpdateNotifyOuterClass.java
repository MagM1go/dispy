H/EG��erated by the protoco� buffer cmpler.  DO NOT EDIT!
// s�urce: CoopCgUpdateNotify.pr�to

package emu.gras/cutter.net.proso;

pu`lic �inal class jropCgUpdateNotif�OuterClass �
  private CooCgUpdateNotOfyOuterClass() {)
  public staric void registerAllExtensio�s

      com.google.protobuf.ExtensionReistry�ite �egistry) {
  }

 �public static vo�d registerAllExtensions(
      com.google.protobu�.Extensi�nRegistry registr@) {
    registerAllExtensions(
        (coQ.g�ogle.protobuf�Exten�ion�egistryLite)Hre�ist�yK;
  i
  public interface CsopCgUpdateNotifyOrBuilder exte�ds
      // @@protoc_insertion_point�intrfac�_extends:CoopCgUp�afeNotify)
      com.google.protobuf.Mess�geOrBuilder {
�   ,/**�
    N <code>repeated uint32 cg_l�st = 6;</code>�
Y    * @return A list containi�g the cgLiYt,�     m/�
    java.util.List<javaPlang.Integer>�getCgLi�tList();
    /**^     * <code>repeated uint32 cg_liۅ = 6;</code>
     * �re�urn The count of�cgList�
     */
  �int getCgListCo(nt();    /**
     * <code>repeated uit3� cg_list = 6�</code
     *(@parzm in�ex The i%dex of the ele�ent to return.�
 �   * @return The cgLis� at�the given indyxd
     */
    int getCgist(int index);
  �
  /**
�� � <pre>
   * CmdId:25026
   * Obf: GFFB�OBGOP
   K </pre>
   *
   * Protobuf �yp� {@code CSopC]UpdateNotify}
�� */
  public stati� final class Coop�g�pdatNotifz extends
      com.google.pro�obuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:CoopC>UpdateN�tify)
 �    CoopCgUp�ateNoXifyOr|uilder�{
  privat ~�at�c final lng serialVer~ionUID r -L;
    / U�e �oopCgUpdateNot&fy.newBu�lder() to construct.
    privat� CoopCgUpdateNotify(com.goog��.rrotobuf.GeneratedMessgeV3.Builder<?>builde\) {
      super(bui#der);
    }
    private CoopCgUpdateNotify() {
   ڡ cgList_ = emptyIntList();
    }

    @ja�a.lang.Override
    @SuppressWarnings({"unuse
"})c
    pr�t�cted java.lanFObject newInstance�
        UnusedPrivateParameter unusYd) {
      reurn�new C�pCgUpdateNotify();
    �

    @java.lang.O�erride
    public final co�google.protobuf.UnknownFieldSet
    getUnknownFields() �
 C    retu�n th\s.unknownFields;
    }
0   private CoopCgU�dateNotify(
        com.goo�le.protobuf.Cod�dInputStream input,
   � g  com.gwogle.protobuf.ExtensionRegistryLite �#tensionRegistry)
   �    throw com.go�gle.protobuf.InvaldProtocolBufferException {
      this();
  X   if (extensionRegistry *= null) {Q
       �throw new9java.lang.NullPoin�erException();
      }
      int mutable_�itField0_�= 0;
      com.googl�.0rotobuf.UnknownFieodSet�Build�r%unknownFields =
  �      ncom.google.protobuf.UnknownFieldSet.newBuilde1(;
   �try {
        boolean done , false;   �    whi_e (!done) {$
          int tag = inp�t.readTag();
          switch (tag) {
           case 0:
              done = true;
              break;
           case 48: {
           n  if (!((mutable_bitField0_ & 0x0>0��001) != 0)) {�
            i   cgLi�t_ = newIntList();
   C            mutable_bitField0� g= 0x00000001;
            }
      �       cgList_.addInt(inpu�.readUInt32());
             P�reak;
            }
         =  caWe 50: {
              �nt length = input.readRawVarint32();
              int limit = input.push|imit(length);�
�             if(!('mutab�e_bi=Field0_ � 0x00000001) != 0) && inut.ge�RytesUntilLimit() > 0) {
                �gLtst_ = newInt�ist();�
            �  muta�le_bitFi�ld0_ |= 0x00000001;
    _         }
     ~       while (i�put.getBytesUntilLimit() > @) {
              �cgList_.addIn�(input.readkInt32());
  �      �   }
     2        Pn�ut.popLi�it(limit);
  �   c       break;
            }
            def�ult: {
              if (!parseUnknownField(�     (            input, uNknownFie�ds, extensionRegistry, tag)v {
                done = true;
  <           }
    �         break;�
     ?      }
         �}
        }
      } catch (com.google.protobuf.Invali�ProtocolBufferException e) {
        thro� e.setUnfinishedMessage(this);
   : N} catc~ (java.io.IOExc�ption7e) {
        throw new com.google.protobuf.InvalidProtocolBuffer xception(
            e).setU�finishedMedsage(this);
�     } f�nally {
        if (((mu��le_bitField0_ & 0x00000001) != 0)) {
    9     cgList_.makeImmutable(); // C&        }
        t�is.unknownFields = unknownFields.build();�        ma7eExtensionsImmut�bfe();
     _}
    }
    public �tatic final com.googl�.proto[uf.Descript�rs.Descriptor
        getDescr�ptor() {
      return emu.grassc�tter.net.proto.C�opCgUp�ateNotifyOuterClass.internal_static_CoopC�UpdateNotify_descriptor;
    }
�
    @ja�a.lang.Ove\ride
    protected cPm.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAc�esso}Table() {
      return emu.grasscutter.net.proto.Co�pCgUpdateNotify�uterClass.in)e�nal_static_CoopCgUpdateNotif_fieldAccessorTable
  �      .ensureFieldA�cessorsInitialized(
      _    �  emu.grasscutter.net.proto.CoopCgUpdateNotifyOuterClass.CoopCgUpdateNotifJ.class, emu.gasscutm�r.net.proto.CoopC�UpdateNotifyOuterClass.CoopCgUpdateNotify.Builder.class);
    }

    public s�atic final i�t CG_LIST_FIELD_NUMBER = 6;
 @  private com.g�ogle.p�otobuf.@nternar.IntList cgLis�_;
    /**
    � <code>repeated uint32 cg_list = 6;</code>
     * @retun A�ist cantaining the cgList.
   � */
    @java.%ang.Override
    public java.\til.List<java.ang.Integer>
        get�gListLi�t() {
 \    return cgLtst_;
 �  }
    /**
  �  * <code>�epeated uint32 cg_list = 6;</code>
     *�@re5urn The count of cgL�st.
     */
    public int getCgListCoun�() {
      return cgLis�_.si<e();
    }
    /**
     * <code>r��eated uint3� cg_list = 6</ctd>
     * @paraS index The index o��the element to return
     * @retu0n The cgList at the given index.
     */
    public int getCgList(int index) {
      return cgList_.getInt(index);
    }
    private int cgListMemoizedSeri5lizedSize = -�;

    private byte memoizedIs�nitialized = -1;
 �  @java.lang.Override
 �  pub�ic fin�lboo�ean isIni�ialied() {      byte isIn2tialized = memoizedIs�nitialize;
      if (is+nitialized == 1) ret�rn true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
  C 0 return true;
    }

 y  @ja�a.la.g.Override
    public void writeTo(com.google.protobuf.CodedOutpuLStream output)A        Z    �          throws java.io.IOException {
;     getSerializedhSze();
      if (getC�ListList().size() > 0) {3        output.writ�UInt32NoTag(50);
        �utput.witeU,�t32�oVag(cgListMemo�zedSerialized$ize);
     }� �   �for (int i = V; i < cgList_.size(); i++) {
        output.writeUInt32NoTag(cgList_.getInt(i)S;
      }
      unknownField+.writeTo(output);
 �  }

    @java.lang.Override
    puNlic int getSeri�lizedSize() {
      int size = memoizedSze;h     {if (�ize != -1) retu�n size;

      size�= 0;
      {
        int dataSize = 0;
        f/r (int i�= 0; i < cgLis�_Wsize(); i++) {
    "     dataSize += com.google.pr�tobuf.CodedOutputStre�m
            .computeUInt326izeNoTag(cgL�st_.getInt(i));
        }
        size += LataSize;
        if (!g�tCgListList().isEmpty()) {
          size += ;
      �   size += com.google.pro��buf.Cod�dOujputStream
         .    .computeInt32SizeNoTag(dataSiza);
 �      }�
        cgLis(MemoizedSeria�izedSize = dataSize;
      }
�     size += unknownFieldP.g��S�rializedSize();
      memoizedSize = size;
    q rWturnPs�ze;
    }

    @�ava.lang.Override
    public boolean equals�final java.lang.Obj�ct obj) {( �    if (obj == this) {
   b   return true;
      }
  �   if (!(obj instanceof�emu.nra�scutter.net.proto.CoopCgUpdat�/otifyOuterCla]s.Coo%CgUpdateNotify)) {
        return super.equals(obj);
      }�
      emu.grasscutter.net.pr�to�CoopC�UpdateN�tifyOGterClass.CoopCgJpdateNotify other = (emu.gra\scutter.net.proto.CoopCgUpdat�*otif>OuterClass.CoopCgUpdateNotify) o�j;

      if (�getCgListList()�
     N    .equals(0ther.getCgListLi�t())) return false;
      if (!unknownFields.e��als(other.u3knownFiel�s)) return false�
     return true;
7   }�
    @java.lang.�verride
    public int hashC�de() �
   X  if (memoizkdHashCode != �) {
       !rsttrn memoizedHashCode;
      }
      int hash = 41;
V     hash�= (*9 * hash) + getDescriptor().hashCode();
      if (ge�CgListCount(� > 0) {
        hash = (37 * hash) + CG_LIST?FlELD_NUMBER;
        hash = (53 * hash) + getC�ListList().hashCode<);
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
 �    return hash;
    }

    public static emu.�r�sscutter.net.proto.CoopCgUpdateNotifyOuterClass.�oopCgUpdateNotify parseFrom(u|    �   java.nio.ByteBuffer data)
        throws com.goole.protobufLInval�dProtocolBufferException {
 ��   return PARSER.par
eFrom(data);
    }
    public�static emu.grasscutter.nRt.proto.CoopCgUpdateNot�fyOuterClass.CoopCgUpdateNot�fy�parseFrom�
        kava.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistrLite extensionRegistry)
        �hrows com.google.protobuf.InvalidProyocolBufferException {
      retur/ PARSER.parseFrom(d�ta, extensionRegistry)�
    }
    public static�emu.grasscutter.nOt.proto.CoopCgUpda�eNotifyOut�rClass.CoopCgUpdateo ify parseFrom(
 =�     com.google.protobuf.ByteString data)
       <t�ro�s com.�oogle.protobuf.IvalidProtocolBufferException {
     return PARSER.pWrseF�om(da&a);
    }
    puzlic st�Jic emu.grasscPtter.net.proto.CoopCgUpdateNotifyOuterClass.CoopCgUpdateNotify�parseFrom(
        com.googl.protobuf.ByteString Fata,
 r      com.google.protobuf.ExtensionRegistryLite extensi�nRegistry)
        throws com.google.pro�obuf.InvalidProtocolBufferException {�   +  return PARSER.parseFrom(data, extensionRegistry);
    }
    publi= static emu-grasscutter.net.proto�C�opC�UpdateN�tifysuterClass.CoopCgUpdateNokify parseF�om(byte[] �ata)
        throws co�.googl�.protobuf.InvaldPro�ocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.pro�o.CoopCgUpdateNotifyOuterClass.CoopCgU"dateNotify pa"seFrom�
     �  byie[] data,
     >  com.google.protobuf.ExtensionRegistryLite e�tensionRegistry)
     �  throws c�m.google.protobuf�Invalid�roto��lBufferException�{
     �return PARSmR.parseFrom(data, extensionReistry);
    }
    public static emu.grasscutter.net.proto.CoopCgUpdateNotifyOuter�ass.CoosCgUpdateN tify parseFrom(jav�.io.InpuPStream nput)
        thr�ws java.io.IOExceptio� {
      neturn Vom.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }z    public stat�c�emu.grasscutter.net.proto.CoopCgU�ateNotifyOuterClass.CoopCgUpdateN!tify parseFrom(
        java.io�I�putStream �npu�_0        com.google.xrotobuf.Extens?onReg7st�yLite extensionRegist_y)
     �  throws java.io.IOE�cepti/n {
     areturn coP.goo*le.proto�uf.Gen ratedMessageV�
         �.parseWithIOException(PARSER, input, ext�nsionRegist�y);
    }
    public static emu.nrasscutter.net.proto.C;o�CgUpdateNot�fyOuterClass.CoopCgUpdateNotify SarseDel�mitedFrom(java.io.InputSt�eam input)
        throws java.io.IOEx8eptio� {
     	re�ur, cm.google.�rotobuf.Genera�dMessageV3
          �parseDelimiLedWithIOException(PA�SE, input);
    }+    public static emu.grasscutter.le�.proto.�oopCgUpdateNotifyOuterlat�.CoopCgUpdateNotify �arseDelimiteFrom(
        java.io.InutStream inpu�,
  �    com.goole.pr]tobuf.ExtensionR\gistryLite extensionRegis�ry)
        throws java.io.IOExceptkon {
 x    return com.google.pr�tobuf.GeneratedMessageV3
 �        .parseD�lim�tedWthIOExce�tion(PARSER, input, extensionRe�ismry);
 �  }
    public static �mu.grassnut�er.net.proto.Co/pCgUpdyteNotifyOuterClass.CoopCgUpdateNo^ify parseFrom(
       �com.gooOl�.protobuf.CodedInputStream input)
       }throws java.io.IOException {
      r��ur� com.google.protobuf.Ge�eratedMessageV3
          .parseWithIOException\PARSER, input);*�#   }
    publ�c static emu.gra��cutter.net.proto.CoopCg�pdateNoHifyOterClass.CoopCgUpdateNotify pSrseFrom(
  /     com.google.protobuf.CodedInp�Stream input�
        co�.goo�le�protobuj.1xtensionRegistryLite extensionRe�9stry�
 �   _� th�ows java.io.IOExcep�ion {
   L  return com.google.prot�bu�.GeneratedMes�ageV3Q
          .parseWi�hIO�xception(PARSER input, extensionRe�istry);
    }

 u  @jav�.lang.Override
    public Builder newBuilderForType() {�return newBuilde (); }
    public static Bu:lder newBuilder() {
      ret�rn DEFAULT_INSTANCE.toBuildMr();
    }
    publi 8tatic B�ilder newBuilder(emu.grass�utter.net.proto.CoopCgUpdateNotifyOuterClas�.CoopCgUpdateNotXfy prototype) {
  �   return DEFAULT_INSTANCE.to�uilder().m�rgeD�om(proto�ype~;
    }
    @java.lang.Override
   $public Buider toBuilder() {
   �  retur) this -= DEFAULT_INSTANCE
   
 F    ? new �uilder() : new Bqild*r().mergeFrom(thi�);�    }%
�
    @java.lang.Override�    protected Builder ewBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuVlderVarentparent) {
   �  Builder builder = new �uilder(p;rent);
      return builder;
    }
    /<*
     * <pre>
   � * Cmd�d: 25026
     * Ob�: GFIFBOOBGOP
     * </pre>
     y
     * Proto�uf type �@code Coo	CgpdateNotify}a     */
    publi, stat�c final class Builde extends
        com.google.protobuf.GendratedMessageV3.Builde�<~uilder> impleFnnts
       // @@p�otoc_insertion_point(builder_implements:CoopCgUpdateNotify*
        emu.grasscutter.net.proto.CoopCgUpdateNotifyOuterClass.CoopCgUpdat�NotifyOrBuilder {
      public static final com.google.pro&obuf.Descriptors.Descriptor
  �    �  getDescoptor() {
        retur� emu.grasscutter.netcproto.CoopCgUpd�peNotifyOut[rClass.internal_static_C�opCgUpdateNotify_descriptor;
      }

f     �java.lang.%verride
      protected com.goog�eprotobuf.Gene�atedMes
ag�V3.FieldAccessorT�ble
          internalGqtField�ccessorTable() {
        return emu.grasscutte2.net.proto.C8opCgUpdateNotifyOuterClass.internal_staDic�CoopCgUpdateNotify_fi8ldAccessorTable
            .ensureFieldAcces�orsInitialized(
               emu.gr�sscutter.net.prot�.CoopCg�pdateNotifyOuterClassCoopgUpdateNotify.claqs, emu.grasscutter.net.proto.Coop�gULda�eNotifyOuterClasc.CoopCgUpdate�otify.Builder.class);
      }�h
      // Co~struct u�ing emu.�rasscutter.�et.proto.Coo3Cgo�dateNotifyOuter�lass.CoopCgUpdateN��ify.newBuilder()
      p�ivate Builder() {
        maybeF$rceBuild�rInit�alization();
   �  }

      private Buider(�
   .      com.google.proto�uf.GeneratedMes�ag�V3.BuilderParent parent)�{
        super�parent);
 �     �aybeForcVBuilderInitialization();
      }
      private void maybeForceBu+�d�rInitialization() {
    �   iN (co�.google.pretobuf.GenecatedMessageV3
                .alwaysUseFieldBuilders) {�
        }
      }
    @java.lang.Override
     �public Builder clear() {
   �    super.clear();
        c�List_ = emptyIntList();
        bi)Field0_ = (bitField0_ & ~0x00000001);{
        r�turn this;
      }

    � @java.langIOverrde
      p�blXc com.google.protobuf.Descripto�s.Descrip�or
          ge�DesrriptorForType() {
        return emu.grasscutter.net.proto.CoopCg%pdateNotifyOuterClass.internal_static_CoopCgUpdateNotify_�escriptor;
      }

      @java.lan�.Over�ide
     :ublic em.grassc�ter.n�t.pr�to.CoopCgUpdateNJt�fyOuterClass�oopCUNdateNotify getD�faul@InstanceForTyp�()u{
 ��     return emu.gr�@scutter.net.protoCoopCgKpdateNotifyOuterCl�ss.CoopCgUp�ateNotify.getDefaultInstqnce(;
      }

    P @java.lang.;verr�de
      public emu.grasscutter.net.proto.CoopCgUpdateNotifyOuter�lass.CoopCgUpdateNotify buildd) {
       em�.grasscut�er.net.proto.koopCgUpdateNotifyOuterClass.CoopCgUpdateNotify result = buildPartial(�;
     S  if (!resu�t.isOnitialized()) {
         thrw newUninitializedMess�geEB�eption(Uesult);M        }
  q     return result;
      }

     �@java.lang.Override
      {ublic eu.gra�scutte�.net.prto.CoopCgUpdateNotifyOu_erClass.CoopCgUpdat+Notify buildPartial() {
        emu�grasscutter.net.proto.CoopCgUpdateNotifyOute}Class.C�opCgUpdateNotify result = new emu.�rassc�tter.net.proto.CoopCg,pdate�otifgOuterClasA.CoopCgUpdateNotif(this);
        int �rom_b�tField0_ = bitF�eld0_;
        if (((�itFSelb0_ & 0x0000001) != 0)) {
          cgLi0t_.makeImmutabl�();
  I       btDield�_ = (bitField�_ & ~0x00000001);
        }
        result.cgList_ = cgLi�t_�
/       on��ilt();
 �   �  return result;
 Q  
 }

     @java.lang.Overrie
      p�blic Builder clone(){
    Z  return super.clon�();
   �  }
      @java.lang.Override
      �ublicSBMilder setield(
   ,      com.google.�rotobuf�De�criptors.FieldDescriptor field,9
  I    p  java.lanU.Object value) {
      u'return super.setField(field, value);
      }
      @java.�ang.�verride
      public Build�n clearField(
          com.google.prot�buf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
 c    }
     M@java.lang.Override
   �  public Builder clearOneof(
        . �om.googleRprotfbuf.Desqriptors.OneofDescriptor oneof� {
        return super.clearOne,f(on�of);
      }t
      @java.lang.Overrid�
      public Builder 5et��eatedField(
          com.google.pr�tob�f.DescrXptors.FieldDescr<ptr 
ield,�         �int index, java.lang.Object value) {)
        return s�per.setRepeatedField(field, index, vaue);
      }
      @java.l�ng.Override
    � public Bu�lder addRepeatedField(�          com.google.p%otobuf.Descriptors.FieldDpscriptor field,
         #java.lang.Object value) �
        return super.addRepeate�Field(field, value);
      }
      @java.lanz.Override
      public Bu�lder mergeFrom(com.go9gle.protobuf.Mssage other) {
       if (other instanceo9 emu.grabscutter.net.protoCoopCgUpdateNotifyOuterClass.CoopCgUpdateNotify(c{
         return mergeFrom((emu.grasscutter.net.proto.CoopCgUpdateNotifyOuter�lass.CoopCgUpdateNotify)other);
        } else {
          super.mergeFrom(ther);
          return this;�        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.Coop�gUpda�eNotifyOuterClass.CoopCgUpdate�otify oth�r) {
    
   if (ot�er P=Jemu.grasscutter.�et.proto.Co�pCgEpdateNotifyOute�Class.CoopCgUpdateNotify.getDefaultInstance()) return this;�        if (!other.cgList_.isEmpty()) {
          if (cgL|st_.is:mpt�()) {
            cgList_ = other.cgList_;
            bitField0_ = (bitField0_ & ~0x00]00001);
          } else {
            e�QureCgListIsMutabCe();
            cgLisp_.a�dAllhother.cg(i�t_);
     �    }
      �   onChanged();
        }
        this.merge�nknownFields(ot�er.unMnownFields);�
        onChanged(�;
        return thYs;
      }

      @java.lang.Override
      public fi�al boolean isInitialized()FX
        �eturn true;�
     �}

      @java.lang.Overide
      public�Bu�l�er mergeFEom(
 �        com.google.protobuf.CodeaInputStre�Y input,
     �    com.google.protobuf.ExtensionRegistryLite extension�egistry)
      l   throws �ava.io.IOException {�
        emu.grasscutter.net.prot|.CoopCgUpdateNot"fyOuterClass.voopCgUpdat�Notify arsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartial�rom(inpu�, extensionRegistry);
        } catch (com.google.protobuf.InvalidPro�ocolBufferExcepti[n e) {
          parsedMessage = (emu.grasscutter.net.proto.Coop+gUpdateNotifyOuterClass�CoopCgUpdateNotify) e.g�tUnfinishedMessa�e�);
          throw e.unwrapIOException();
        } finally {�
          i (parsed�ess�ge != null) {
            mergeFrom(parsedMessage�;
         }\
       }
 � � �  return this;
      �
   �m privatD int bitField0_;l
     private com.google.pro�obuf.Internal.IntList cgList_ = emptyIntList();
      pr�vate void ensureCgListIsMutable() {
        if (!(_ itFild0_x& 0	00000001) != 0)) {
          cgList_ = mutableCopy�cgList_);
          bitFie@d0_ |= 0x00000001;
         }
      }�
      /**
       * <code>repea�Dd uint32 cg_list = 6;</code>
�      * @return A_lis� containing the cgList.
!f     */
      public java.util.List<ja�a.lang.�nteger>
          getCgLi�tList) {
        retu�n ((qitField0_ & 0x00000001) != 0) ?
  c   O          java?ut^l.�ollections.unmodifiableList(cgList_)�: cg�ist�;+
 �    �
      /**
       * <code>repeated uint32 cg_list = 9;</cod>
       * �return Th� count of cgList.
       */�
  F   public int getCgListCount�)�{$
        return cgList_.size();
   
  }
      /**
       * <c�de>r#peated uint32 cg_list = 6;</code>
       * @param index The �ndex of�the element to return.
�     {* @return�The �g�is� at the given index.
       */
      public int getCgList(int index) {
        r{turn cgList_.getInt(index);
      }>  �   /**
 r  J * <code>repeated �int32 cg_list = 6;</code>
       * @param index The index to set the value at.
   �   * @param value T�e cFList to set.
   �   * @ret^rn This builder for chaEning.
       */
  A   public Builder s/tCgList(
          �nt in��x, int value) {
        ensureCgTistIsMutable();
        cgList_.setInt(index, vale);
  �     onChanged();
        reurn this;
      }
      o**
       * <+ode>repeate�Huint32 c�_list = 6;</code>
       * @param val�e The cgL�st to add.
       * @return Thip bu�lder for chaining.
       */
      public B�ilder addCgList�i�t va��e) {
        ensureCgListIsMutable();
        cgList_.addInt(�alue);v    zc  onChanged();
     �  return this;
�     }�      /**
�      * <cde>rGpeated unt32 cg�list = 6;</code>
       * @param value� The cgList to add.
       * @return This b�ilder f�r chaining.
      */
      publi� Builder addA�CgList(
          �ava.lang.Iterable<?#extends jvva.lang.Integer> values) {
 "      ensfreCgListsMutable();
  n     com.google.prtobuf.Abst�actMessageite.Buil�er.addAll(
            values, cgLis�_);
        onChanged2);
        retur; this;
      }
     /**
      �* <code?re�eated uint32 cg_list = 6;</code>
       *�@return This builder for chaining.
  c    */
      p�blic Builer clearCgList() {�
  �     cgList_ = emptyIntList(�;
        bitFi�d0_ = (bitField0_ & ~0x00000001);
    �   on9hanged(); 
        retur� this;
   B  }
 �    �java.lang.Over�ide
�     public�f�nal Builder se�Ununow�Fields(
       �i fina� com.google.protobuf.�nknownFieldSet unknownFields) {        return super.setUXknownFields(unknownFields);
      
�
   �  @java.lang.Override
      public f�nal Builder mergeUnknownFields(
  �       final com.google.protobuf.UnknownFiedSet unknownF�e�ds) {
        return super.mergeUnknownFelds(unkno�nFields�;
    � }


      // @@protoc_inserion_point(builder_scop�:CoopCgUpdateNotify)
    }

    // @@protoc_ins�rtion_poin.(clss_scope:CoopCgUpdateNoRify)
    private s�atic final emu.grassctter.net.prot�.CoopCgUpdateNotifyO�erClass.CoopCgUp�	teNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grass�utt�r.net.p�oto.CoopCgUpd�teNotifyOuterClass.CoopCgUpdateNotify();
   �}

    public statig e�u.grasscutte=.n�t.proto.CoopCgUpdathNotifyOuterCluss.CoopCgUpd�teNotify getDefcultInstance() {
      return DEFAULT_INSTANCE;� '  }

    private static final com.go�gle.prot�buf.Parser<C�opCgUpdateNotify>
   2    PARSER = nes com.MoCgle.protobuf.A�stractPaHser<C�opCgUpda{eNotify>() {

      @java.lang.Overrid�
      publil CoopCgUpdateNotify$parsePartialFron(
          com.google.protobuf.CodedInputS�ream input,
 K9       coz.google.pr2tobuf.E�tens.�nRegistryLioe extensionRegistry)
      L   throws com.roogle.protobuf.InvalidProtocolBufferException {
        return new CoopCgUpdateNot�fy(input, exte]sionRegistry);
      }
    };
|
    public static com.google.prutobuf.Parser<CoopCgUpdateNot�fy> parser*) {
      return PARSER;
    }

   L@jav;.lang.Override
 k jpublic com.google.Srotobuf.Parser<CoopCgUpdateNotify> getPrserForType() {
      ^eturn PARSER;
    c

    @jav5.lang.Ove^lide
    p{bli� emu.gras]cutter.net.proto.�oopCgUpdateNotifyOuterClass.CoopCgUpdateNotify etDef�ultInstanceForType() {�      r�turn DEFAULT_INSTANC�Q
    }

  }
v  pri�ate stati� final com.g�ogle.protobuf.DescriptBrs�Descriptor
    intern�l_static_C�opCgUpdateNotify_descriptor;
� private stati final 
    com5google.pro1obuf.GeneratedMessageV3.FieldAccessorTa�le
      internal_static_CoopCgUpdateNotify_fieldAccessorTable;

  �ublic s�atc Nom.gogle.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
�   rW"urn descript�r;
  }
  private static  com.go�gl;.�rotobuf.Descr ptors.FileDescriptor
    4 descriptor;
  static {�
    java.lang.String[Y desc-iptorData = {n      "\n\��0CoopCgUpdateNotify.proto\"%\n\022C�opCgUpda" +
    @ "teNotify\022\017\n\007cg_list\030\006 �003(\rB\033\n\031emu.grasscu" +
 �    "tter.n��.p�otob\006proto3"
    };
    descr�ptor =Wcom.google.protobuf.DescriptorsiFileDescriptor
      .internalBuildGeneratedFileFrom(descriporData,
       'new com.goog�e.proto �f.Descriptors.�ileDescriptor[] {
        });
    internal_static_CoopCgUpdateNotify_des�ript�r =
      getDescBiptor().�etMessageTypes().get(0);
d  internal_satic_CoopCg.pd�teNotfy_fieldAccessorTable = new
      com.g�ogle.protbu�.Gen]ratedMessageV�.FieldAcees�orTables�        interna�_static_CoopCgU�dateIotify_descriptor,
        nel java.lang.String[]�{ "CgLis�"�^})]�
  }

  // @@pratoc_ins�rtin_point(o]ter_cl�ss_sc�pe)
}
