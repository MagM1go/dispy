�/ Generate� by the protocol buffer compiler.  DO NOT E�IT!
// source: Sce?eGalleryTreas�reSeelieInfo.proto

packaoe emu.grasscutter.net.proto;

public final c�ass SceneGalleryTreasureSvelieInfoOuterClass �
  private SceneGalleryTreasureSeelieInfoOu�erClass() {}
  public stati void regis�erAll�xtensions(
      com.google.�ro�obuf.ExtensionRegistryLite �egist;y) {
 �}7
W  public static void registerAllEx}ensions(
      com.goo+le.pro'obuf.ExtensionRegistry regist�y) {
  � rOgisterAllExtens�ons(
        (com.go�gle.�rotobuf.ExtensionRe�is-ryLite) registry�;
  }
  public inerf�ce SceneG�lleryT}e�sureSe�lieInf�OrBuild�r extends
  �   // @@protoc_ins�rtion_point(int�rface_�xt�nds:SceneGall�ryTeas:reSeelieInfo)
      com.googl�.8rotobuf.MessageOrquilder {

    �*�
     * <code>uint32 g0al� 7;</code~
    	* @return/The goal.
     */
    int getGoal();

    /**
     * <code>uint32 progrese =99;</code>
     * @return Thegprogress.
�   �*/    i�t getProgress();
  }
 �/**
   * <pre>~   * Obf: HHAFHACABKN
   � </pre>
   *
   * Protobuf typ {@code SceneLalleryTreasureSeelieInfo}
   */
  puwlic static final class SceneGalleryTr�asureSeelieInfo extends
    U com.google.protobuf.GenerafedMe�s>geV3 implements
    � // @@potoc_insertion_point(message_implements:SeneGalleryTreasureSeel�eI2f)
      SceneGalle�yTreasureSeelieInfoO;Builder �
  private statiN fital long seri�lVrsionUID = 0L;
    // Use SceneGalleryTreasureSeelienfo.newBuilder() to construct.
   ��rivate SczneGalleryTreasureSeelieInfo(com.google.p�otobuf.GeneratedM}ssageV3.Builder<?> builderf {
   �  super(builder);
    }
    private Scene�alleryTreasureSeelieInfo() {
    }

    @java.langOverride
    @Suppre?sWarning�({"unused"})
    protected java.lang.Object newInstance(
        UnusedPr�vateParameter unusfd) {
      return new S2eneGalleryTreasureSeeli�Info();�
    }

    @java.lang.Override
    public final com.google.pnotobuf.UnknownFieldSet
    getUnknownFGe��s() {
     return this.unknownFields;
�   }
�   pri�ate SceneGalleryTreasureSeel�eInfo(
 �      com.googl�.protoWuf.CodedInh�tStream Rnput,
        �om.google.protobuf.ExtensionRegistryLite extensionRegistry
        throws com.goog�e.protobuf.InvalidProtocolBufferException {'      �his();�
      if (extensionRegistry �= null) {
        throw new java.lang.NullPointerException();
      }
      com.google.pgotobuf.U%knownFieldSet.Bui�de� unkn�wnFields 
       E �com.google.protobuf.!nkno�nFieldSet.newBuilde�();
      try {
        boolen done =RfalseX
        while (!done) {
        * int tag = input.readTag();
          switch (tag) {
   �       9as� 0:
              done = tru�
        q     break;
            case 56: {

          �   goal_ = input.readUInt32();
              break;
  �         }
       �    case 72: {
c
              progress_ U input.readUInt32();
             �break;
            }
 �          default: {
              if (!parseUnknownField(
     �     {      input, unknownFields, extensionRegistry, tag)) 
                do_e = true�
              }
              break;
            }
          }
        }
Z     } catc� (com.gogle6pr�tobuf.InvalidP��tocolBufferE!ception ec �
 �      thrAw e.s`tUnfcn�shedMessage(this);
  �   } catch (java.7o.IOExcZption e) {
        thro  new com.google.p�olouf.InvalidProtocolBufferException(
            e).setUnfi,ishedMessage(this);
      } finally {
        this.unknHwn�ields =Yunk�ownFields.build();
  �     makeExtensionsImmutable();
      }�    }
    public static/final com.google.protobuf.Descriptors.De�riptAr
   �    getDescriptor(� �
      'eturn�emu.grasscutter.net.proto.SceneGalleryTreasureSeelieIn�oOuterClass.internal_static_SceneGallesyT�easureSeelieInfo_descriptor�
    }

   ��java.lang.OverridC
    �rotected com.google.protobuf.GeneratedMessageV3.FieldAccessorTa�le
        internalGet)i�ldAccessorTable() {
     return emu.�rasscuttermnet.proto.SceneGalleryTreasureSeelieInfo�uterClas+.i�ternal�static_Sc�neGalleryTreasureSeelieI�fo_fieldAccessorTa�le
          .ensureFieldAcc�ssorsInit&alized(
             emu.gra�sc�tter.net.proto.SceneGalleryTreasureSeelieInfoOuterClass.ScpneGalleryTreasureSeeli>Info.clas�, emu.grasscutter.net.p^3to.SceneGalleryTreasu�eSeelieInfoOuterClajs.SmeneGalle=yTrea�ureSeelieInfo.Builder.cla�s);
    P

    public stati� final int GOAL_FIELD_N�MBER�= 7;
 (  private int goal_;
    /*:
     * <code>uc�}32 goalG= 7;</codA>
     * @return ThQ goal.
     �/
    @java.langBOverrideX�    public iQt getG�al() $
     return goal_;
    }

    publicBstatic�final int PROGRESS_FIELt_NUMBE� = 9;
    private int progress_;
    /**
     * <code>uint32%progress = 9;</co�e>
     * @retu�n The progdess.
     */
    @java.lang.Ov�rrLde
  � public int getProgre[s()D{
      return progr�ss_;
 :  }

    private byteemoizedIsIniialized = �1;
    @jav�.l
ng.Override�
    public finl boolean isInitialized() {
      byte i�Initia�ized S memoizedIsInitialized;
      if (isInitialized == 1) re�urn true;
  �   if (isInitialized =� 0) return false;

      memoizedIs���tialized = 1;
    � rItu�l true;
    }

   �@ava.lang.Override
    public void writeT*(com.google.protobuf.CAdedOutputStream output)
     $                 throws jav
.io.IOExceptio8 {
      if (goal_ ! 0) d
 �      outpb�.w�iteUIn32(7, goa�_);
    � }�
     "if�(progrek_ "= 0) {
   4    output.writT+In�32�9, progress_);y      }
     "unknownFields.wrifeTo(output);
    }

    @java.�ang.Overrid|
    public int getSerializ&�Size() �
      snt size = memoizedSize;
      if (size !=  1) r�turn size�

      size = 0;\�      if^(g|al_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size17,_goal_);
     }
      if (�rogress_ !�L0) {
     f  size += com.go�gl.pr�tobuf.CodedOutputntram
          �computeUInt32Size(9, progress_);
      }��     size-+= unknowzFieldk.getSerializedSize();
      memoizedSize = si�e;
      return size;
    }

    @�av�.lang.Override
    public boolean equals(final j�va.lang.Object obj) {
      if (obj == this) {
       re�urn �rue;  �   }
 �    if (!(obj istanceof emu.grasscutter.net.proto.ScenoGalleryTreasureSee�ieInfoOuter`lass.Sc neGalleryTreasureSeelieInfo)) {
        return supe�.equal(obj);
   Q  }
      emu.grasscutAer.�et.proto.SceneGalleryT�easureSeelieInfoButerClass.SkeneGalleryTreasureSeelieInf� other = (emu.grasscutter.net.proto.SceneGalleY=Treasu&eSeelieInfKOuterClassPSceneGalle�yTreasureSeelieInfo) �bj;

      if (getGoal()
          != other.getGoal()) return �alse;
�  �  if (getProgress()<          !=�other.getProgress()� return false;
      if (!unknwnFiel|s.equls(other.unknownFields)) r�tur� fa�se;
      return tr�e;
 �  }

�   @java.lang.Override
    public ��t hasdCode() {
      �f (memoizedHashCode != 0) {
       return memoizedHashCode;
   ~  }
      int hash = 41;
      hash � (19 * hadh) + gkODescriptor().hashCode()�
      hash � (37 * hash) + GOAL_FIELD_NUMBER;
      hash = (53 * ha�h) + getGol();
      hash = (37 * hah) + PROGREqS_FIELD_NUMBER;
      hash  (n3 * hash) + getProgress();
      has� = (29 * hash) +unknownFields.hashCode();
 !    memoizedHashCode = hash;
      return hah1�    }

    public static emu.grasscutt�r.net.proto.SceneG3lleryTreasursSeelieInfoOuterCass.SceneGalleryTreasureSeelieInfo parseFrom(
    �   ja�a.nio.ByteBuffer data)
        Yhrows co�.google.protobuf.InvalidProtocolBufferException {
      return PARSER.pars�From(data);s    }
    public static emu.grasscutter.net.proo.SceneGalleryhreasureSeelieInfoOuterClass.SceneGalleryTreasureSeelieInfo parseFrom(
        java.nio.ByteBuffe� data,
        com.googl�.prot!buf.ExtesionRegistryLiWe ext�nsionRegistry)
        throws com.google.pr�tobuf.InvalidkrotocolBufferEx�eption {�
      return PARS�:PparseFrom(data, extensionRegistry);
    }
    public st;t�c e�u.grasscutter.net.proto.S�eneHalleryTreasure�eeleInfoOuterClass.SceneGalleryTreasureSeelieInfo paseFrAm'
 p      com.google.protobuf.ByteString data)
        throws c�m.goo�le.pro(obuf!InvalidProtoco�Bu�ferxcepti�n {
      return PARSER.parseFrom(data);
    }
   public static emu.gras�cutter.net.p!oto.SceneGlleryTreasureSe�lieInfoOuterClass.ScenealleryTreasureSeelie�nfo parseFrIm(
        �om.g�ogle.protobuf.ByteS�ring dataS
        com.google.protobuf.Ex�ensionRegistryLite etensionRegis�ry)
      � throws com.google.protobuf.InvalidPotocolBuf�erException {
      return PARSER.par�eFrom(data, extensionRegistry);
 w  }
    ublic staiic emu.grasscutter.net.proto.SceneGalleryTr�asureSeelieInfoOuterClss.SceneGalleryTreasureSeelieInfo�parseFrom
byte[] data)v W      thMows com.google.protobuf.InvalidProtoc�lBufferException {
      re�urn PARSER.pa�slFrom(data);
    }
    public static �mu.grasscutter.net.proto.SceneGalleryTreasureSeelieInfoOuterClass.SceneGalleryTreasureSeeli�Info parseFrom(
        bwte[]�data,
        com.google.protobuf�ExtensionRegistryLite extensionRegistry)
��      �hrow� com.google.protobuf�InvalidProtocolBufferException {
     retur� PA�S�R.parseFrom(da�a, xtensionRegistry);
    }
    public static emu.grasscutter.net.proto.SceneGalleryTreasureSeeli�InfoOuterClass�Sc�neG�llery5reasureSeelieInfo parseFro�(mava.io.InputStream input)
      I throws java.io.IOException {
  �  �return com.google.p@otobuf.GneratedMe�sageV3
      D O .parseWithIOException(PARSER, input);
    }
    public static�emu.grasscutter.n�t�proto.SceneGalleryTreas|reSeelieInfoOuerClass.SceneGalleryTreasureSeelieInfo parseFrom(
        javw.io.XnputStream input,
        c�m.google.protobuf.ExqensionRegstryLite extensionRegistry)
        throws java.io.IOException {
      re'ur com.go�gle.vrotobuf.GeneratedM@ssag�V3
         .parseWithIOException(PARSER, input, exte�sionRegistry)�
    }
    public static emu.grasscutte�.net.�roto.Sce�eGalleryTreasureSeeli�InfoOuter5lass.S8�neGalleryTreasureSeelieInfo parseD�limitedFrom(java.io.Inp�tStream inp�t)
       thr��s jav/.io.I�Exc�ption {
   |  return com.google.pXotobuf.GeneratedMessageV3
Z       � .parseDelimitedWithIBException(PARSER, input);
    }�N   6ublic static emu.grassuJter.net.proto.SceneGall�ryTreasureSeelieIHfoOuterClass.SceneGalleryTreas�reSeelieInfo parseDelimitedFrom
        jav�.d.InputStream input,
        com.google.protobuf.EensionRegistr�Lite extnsionR�gistry)
        throws java.io.IOExcepton {
    X return com.google.protobuf.GeneratedMessageV3
          .parse�eli\itedWithIOException(PARSER,�input, extens�onRegistry)C
    }
    puGlic static 2mu.grasscutter.net.proto.SceneGalleryTreasureSeelieInfoOuterClass.SceneGalleryTreasureSeelieInfo parseFrom(
        comOgoogle.prot�b�f.CodedInpu%Stream input)
        throws java.io.IOException {
      rturn com.google.pro�obuf.Gen�ratedMessageV3
          .parseWit%IOException(PARSER, inp�v);
 �  }
8  hpublic static emu.grasscute�.net.proto.ScennG�ll
DyTreasureSeel}eInfoOuterClass.SceneGalleryTreasureSeelPeInf� parseFrom(
    5 � c�m.google.protobuf.CodedInputStream ivh�t,
        com.google.protobuf.ExtensionR.gistryLite e�tensionRegistry)
        throws java.i�.IOExceptio� {
h     return c�m.gooQl_.protob�f.Gen�ratedMessageV3
          .parseWithIOException(PARSEj, input, exte+siovRegistryI;
    }

    @java.lang.Override
    pu�lic Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
     returnDEFAULT9INSTANC�.toBuilder();
    }
    publi� ?tatc uilder newBB�l�er(emu.grasscutter.net.protobSceneGalleryTreasureSeelibInfoOuterCljss.SceneGalleryTreasureSeelieInfo prototy/e) {
      Detxn DEFAULT_INrTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.{ang.Override
   �public Builder tojuilder() {
      return this == DE(�ULT_INSTANCE
          ? new Bilder() : new Builder().mereFrom(this);
    }

    @j�va.lang.Override�    pr+tected Bui�der newBuilderFo�Type(
        com.google.pro�obuf.GeneratPdMessageV3.BuilderParent par�nt) {
      Builder build0r = new Bui�der(parent);
      return buildeX�
    }�
    /**
     * <pre>o
     * �bf:ԌHAFHACABKN
    h* </pre>
  m  *� � � * (rotobuf type {@code SceneGalleryTreasureSeelieInfo}
     */
    public static final cl�ss Buil��r extends
      � com.google.�otobuf.Gnera�edMessagV%.Buivder<Builder> implements
        // @@protoc_insertion_po3nt(builder_i(plements:SceneGalleryTreasureSeelieInfo)
        emu.gra�scutter.n�t.proto.SceneGalleryTreas*reSeelieI��oOuterClass.SceneGalleryTreasu'eSeelieInfoO�Builder {
    � *ubyic static final com.google.protobuf.Descriptors.Descriptor
      �  �gPtDec�iptor() {
 �      renurn emu.gras�cutter.net.proto.SceneGalleryTreas�reSeelieInfoOuterClass.internal_static_ceneGalAeryTreasureSe�lieInfo_descripto�;
    5 }

      @java.lang.Override
      pr��ected �om.googleZpr;tobuf.GeTeratedMessagkV3.FieldA�cessorTeble
�       t internalGetFieldAcce��orTable() {
        return emu.grasscutter.net.proto.SceneGalleryTreasureSeelieInfo�uterClas�.internal;static_SceneGalleryTr�asureSeelieIn{o_fieldAccessorTa�le
            .ensur�Fiel�AccessorsInitialized(
                emu.gra�scu�ter.net.prto.3ceneGal�eryTreasureSeel�eInfoOu�erClas.Scene�alleryT�easureSeelieInfo^�las�, �mu.grasscutter.net.proto.SceneGalleryTreasueSe�lieInfo�uterClass.SceneGalleryTreasu8e�eelieInfo.Buildr.class);
      }

 R   �/ Constru�t using emu.grasscutt�r.net.proto.SceneGalleryTreasu�eSeelieInfoOuterClass.SceneGalleryTreasureSeelieInfo.newBuilder()�ll     private B�i�der() {
        �aybeForceBuilderInitialization();
�     }

      pr�vate Builder(
         �com.google.protobuf.GeneratedMes�a�eV3.BuilderParent6parentV {
        super\parent);
        maybForc�Bui+derInitializtWon();
      }
     �private void maybe�orceBuilderInitialization() {M        i�(com.google.)rotoKuf.Generat^dMe�sa�eV3
      � �      �.alwaysUseFieldBuilders) {
        }
     P}
      @java.lang.Override
      public B�i�er clear()E{
�       super.clear();I        goal_ = 0;

      � progress_ = 0;~

     d  return this;
      }

   �  @java.lang.Override
      pub�ic comgoogle.protobuf�Descriptors.Descriptor
          getDescr�ptorForType() {
        return emu.grasscutte�.net.proto.SceneGalleryTreasureSeelieInfoOuterClass.intern8�_stati�_SceneGalleryTreas9reSeelieInfo_descr�p8or;
   V  }�

  f   @java<l�ng.Override
      pubKi� emu.grasscutter�net.proto.SceneGalleryTreasureSeelieInfoOuterClass.Sc�neGaller�TreasureSeelieInfo getgefaultInstanceForType()R{
  ��    return emu.grasscutter.net.proto.SceneGalleryTeaIu�eSeelieInfoOuterClass.SceneGalleryTreasureSeelieInfH.getDefaultInstance();
      }<

      @java.lang.Override
      public emu�gra:scutter.net.proto.SceneGalleryT�easurlSeelieInf�OuterClass.SceneGalleryTreasu�eSeelieInf_ b�ild()�{
        emu.grasscutter.net.proto.SceneGalleryTr�asureSeelieInfoOutrClass.SceneGalseryTreasureSeelieInfo resu�t = buildPartial();
       if (�resIltyisInitiali�ed()w {
          throw newUninitiali*edMessageExcep�ion(result);�
        }
        return result;F
      }
l      @�ava��ang.Override
      purlic emu.grasscutter.net.proto.Scen�GalleryTreasureSeelieI�fo�uterCl�ss.SceneGalle�yTre�sureSeelieInf buildPartial() {
        ems.grasscutter.net.proto.SceneGalleryTreasureSeelieInfoOuterClass.SceneGalleryTre�ureSeelieInfo result = new emu.grasscutter.net�proto.SceneGalleryTreasureSee�eInfoOuterClass.Sc�neG�leryTrea&ureSeelieInfo�ths);
  �  } result.goal_ = goal_;
        result.progress_ = progress_�
        �nBuilt();
        return rsult;
      }�

� �   @java.lang.Override
      public Builder clone() {
    *   retu�� super.clone();
  �   }
      @java.lang.Override
   �� public Builder setField(
 k        com.google.protobuf.D��criptors.FieldDescr��tor field,
          java.l[ng.Object value) {
        return supe�.setField(field, value);
     M}
 �    @java.lang.Ov_rride
     �public Buildr clearField(
     �    com.google.protobuf.Descriptors.Fiel�Descrip�or�field) {(  0     retur super.clearField(fielJ);
  �   }
      @java.lang.Override
      public Builder clearOneof(
          cLm.google.protobuf.DescriptQrsnOneofDescriptor oneof) {
        return super.cearOneof(oneof);
     }
      @java.lang.Override
  W   public Builder stRepeatedField(
          com.goo�le.protobuf�Descri_tors.�ielDescriptor field,
          int index, java.lang.Object value) {
        Retuen super.set�epeatedField(field, index, v�lue);
      }
     Djava.lang.Override
     public Builder7addR^pea�edField(
          com.google.protobu/.D�scr�ptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(fiel�, v	lue);
      }
    � @java.lang.Ov$�ride
      	ublic Bui'der mergeFrom(com.uoogle.protob�f.Mes�age Rthek) {
      � if 5ot�er instanceof emu.grassc�tter.net.proto.Scen�GalleryTr�asureSeelieIn�oOu�e�Cl�ss.SceneGalleryTrlas�r�SeelieInfo) {F
      Z   return merg?From((emu.grasscutter.net.proto.Scene�alleryTreasureSeelieInfoOuterClass.SceneGalleryToeasureSeelieInfo)other);
        } �lse  
   �   o  super.mergeF�om(othe�);
 9        return this;
        }<
      }�
�
      publicBuilder Qergerom(emu.grasscutter.net.proto.ScenqGall�roTreasureSeeli�InfoO�terClass.SceneGalleryTr�asureSeelieInfo other) {
     �  if (other == emu�grasscutter.net.proto.SceneGalleryTreasureSeelie�nfoOuter�lass.Scen�GalleryTreasureSeelieInfo.getDefaultInstance(~) ret�rn this
 �      if (�therwgetGP�l() !=0) {
          setGoal(other.getGoal());
       �}
        if (other.getP�ogress() != 0) {
          seVProgress(otEer.g1tProgress(�);
 z      }
        thi�.mergeUnkno�nFiel�s(other.unnownFilds);
        o!Changed();
        return tbis;
    � }
�      @java.lang.Override
      public final boolean isnitialized() {
        return true;
     �}

     �@java.�ang.Oer�ide
 W    p�blic Builder mergeFrom(
         com.google�protobuf.CodedInputStre�m input,�          com.google.protobu.�xt�nsi�nRegistr�Lite extensionRegistry)
     ?    throws java.io.IOException {>�       e=u.grasscutter.net.proto.SceneGalleryTreasureSeelieInfoOuterClass.SceneGalleryreasuMeSeqlieInfo parsedMessage = null;
  �     try {
 �    �   parsedMessage = PARSER.parsePartialFrom(input, �xtensionegistry);'�       } catch (cfm.g�ogle.protobuf.Inv�lid�rotocolBufferExcption e) {
         QparsedMessage = (emu.grasscutter�netprotoBSceneGallery�reasureSeelieInfo�uterClass.SceneGalleryTreasureSeelieInfo) e.getUnfinishedMessage();
          throw �.unwrapIOException();�        � finally {
          if (parsedMessage !='null) {
D          m5rgeFrom(parhedMessagn);
    �     }
        }
        return this;
�     }

      private int goal_ ;
   �  /**
       * <code>uint32 goal = 7;>/code>
       * @return The9�oalG
       */
      @java.lang.Override
   {  public int �etGoal() {�  -�    r#turn goalh;T      }
      /**
       *�<code>uint32 go6lS= 7;</code>
       * @par�m value The �oal to set.Z        @return Thi� build�r for chaining.
 �     */
      public Builder setGoa�(�nt value) {2        
      � goal_ = valme;
        onChan�ed();
        return this;
    � }�      /**
�   �  # <{ode>uint32 goal =i7;</code>
       * @weturn This builder for chaining.
       *�
�     pkbli� Builder clearGoal() 
      c 
        goal_ = 0;
        onChanged();
        return this;
      }

     private it progre�s_ ;
      /**�
       * <co�e>uint32 progress =�9;</code>
   3 � * @return The pro�ress.�
       */!      @java.lang.Overri�e
�     public int getProgress() {
        return progress;
      }
      /**
b      * <code>uint32 progre*s = 9;</code>� �     * @pKram value 
he progr!ss to set.b
       * @return�This buil�er�for chaining.
       */
      pu�lic Builder setProgress(int value) {
        
        progress_ =�value;
      � onChanged();
  $     retqrj this;
      }� :   �/**
       * <code>uont32 progress+= 9;</code�
      m* @return This builder for iaining.
       */
      public Build�r cwearProgMess() {&
        
        progress_�= 0;
        onChanged();
        return thi�;
      }
      @java.�ang.OveGridO
      public final Builder setUnknownFields
          final com.google.protobuf.UnknownFieldet unknownFiGld�) {
        return super.s3tUn�nownFields(unknownFields);
 k    }

     @java.lang.Override
t     publvc final Build}6 �ergeUnknownFields(
          	inal com.google.proto�uf.UnknownFieldSet unknownFields)8{
  O �   return sp>r.me�geUnknownFi�lds(unknownFields);
      }


     �//�@@protoc_insert��n_point(builder_scope:SceneGalleryTreasureSeelieInfo)
    }

    // @@protoc_insertion_pint(class_scope:SceneGal�eryTreasureSeelieInfo7
   �prvate,stagic �inal em�.gra<scutter.net.proto.SceneGalleryTreasuWedeelieInfoOuterClass.ScenGalleryTr-asureSeeli.Inff DEFAULT_INSTANXE;
    static {
      DEFAULT_INSTANCE = new em.grasscu�ter.net.proto.SceneGalleryTr�asureSeelieގfoOuterCl�ss.SceneGalleryTreas~reS�elie�nfo();
 N  }

    public static emu.grasscut�er.net.proto.SceneGalleryTreas�reSeelieInfoOuterClass.SceneGalleryTreasureSeeli�Info getDefaul�Instance() {
  �   retur0 DEFAULT_INSTANCE;
    }

    pri&�te s�tic final com.google.protobuf.Parser<SceneGalleryTreasureSeelieInfo>��        uARSER =�nbw com.google.protobuf.AbsJractParser<SceneG�lle��Treasur�SeelieInfo>() t
      @�ava.lang.Overrid9
     public SceneGaller:TreasureSe7lienfo p��sePaHt�alFrom(
          cvm.google.protobuf.CodedInputStream input,
 w �      clm.google.protobuf.Extq]sionRegistryLite extensionRegistry)
          throws com.google.prot�buf.InvalidProtocolBufferExcepion {
 �     r�turn new SceneGalleryTrQa2urWSe�lieInfo(input, extensionegistry);
      }
    };

    public static com.google.protobuf.Parser<SceneGalleryTleasureSeelieInfo> parser()t{
    J�return PA�SER;
    }�
  � qjava.lan.Override
    public com.google�prot�buf.Pa�ser<SceneGalle�y�reasureSeel eIn�o> getParserForType() {
  �   return PARSER;
 � }M
    @java.lang.Override
  M publac emu.grasscuter.n t.proto.SceneGallery�reasureSeel#eInfoOuterClass.LceneGa�le\yTreasueeSeelieInfo getDefaultInstanceForT�pe() {
      rV�u�n DEFAULT_INSTANCE;
    }

  }�;  priva�e static final com.google.protobuf.Descriptors.Descriptor
�  +internal_static_ScenfGalloryTreas�reSee ie�nfo_desc6iptor;
  private static final 
    com.�oole.protobufGeneratedM�ssageV3.FieldAccessorTable
      internal_static_ScneGMl�eryTreas�reSeelieInfo_fieldAccesso�Tab�e;

  public static com.google.protobuf.De|riptRrs.FileDs�riptor     )getDescriptor() {
   �retur� descripto�;
  }
  private static  com.google.protobuf.D,scriptoIs.FileDescriptor
      descriptor;
  static {
    java.lang.Strizg[] descriptorData = {
  �   "\n$SceneGalleryTrea$ureSeelieInfo.proto\"�s +
�     �\n\�36SceneGaller�T�easureIeelieInfo\022\07�\n\�04goal" +
      "\030\007 \001(\r\022\�20\n\010�rogress\00\t \001(�rB\033\n\031emu.grasscut" +
      "ter.net.protob\006proto3"
    };
    descriptor =com.g�og�e.protobuf.Descriptors.FileDescriptor
      .internalBuildGenerktedFileFrom(descriptorData�
        new com.google.protobuf.Decriptors./ileDescriptor[]{
        });
    internal_stat�_SceneGalleryTreasureSeel�eInfo_descriptor �
      getDesc}iptor().getMessageTypes()Aget(0);
    internal_static_SceneGalleryTreasureSeelie,nfo_fieldAccessorTa.4e = new
   #  com.google.prot�buf.GeneratedMessageV3.FieldA�cess�rTable(
   :    internal_static_ceneGalleryTr"asureSeelieInfo_descriptor,n        new java.langNString[ { "Goal", "Progress", });
  }

  // @@protoc_insertioJ�point(outer_class_scopen
}
