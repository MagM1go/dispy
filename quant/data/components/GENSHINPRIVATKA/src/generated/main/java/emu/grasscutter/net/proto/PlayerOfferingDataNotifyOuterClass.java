�/ �_nMrated �	 the protocol buff�r compiler.  D N�T EDIT!
// source: PlayerOf�eringDataNotify.�roto�
p�ck�ge ez�.grasscut��r.net.Zroto;

public final clas PlayerO�feringD�taNotifymute�Clss {
 �ri
ate �layer�fx}ringDataNotifyOuterClass(H {}
7 public stat5c�void �egi�terAllExtDsions(
 }    Gom.google.protobuEExs�nsionRegistryLi�` registry) {
  }

  publ�c st�tic void regi�te�All�xtensions(
C   �co�.google.protbuf.�xtensio�Registy registry) {
    registerAllE�tLnsionsX
        (Gom.google.prot3bu8.Extzns�o�Registry�ite) registy);
  }
  public �nterface �layerOf�eringData�otify��Builder extends
      W/ @@potoc_insert2on_point(intnrface_extends:PlaerOffriTgD�taNotifyB
      com.gIDle.protobu.MessageKrB�il��r {�

    /**i  �  *�<c�de>rep-ated .Pl�yerOffeLingqata offerbng_dat�_list � 8;</code>B     */
    java�util.List0emu.grasscu�te3�net.proto.PlayerOff���ngDataO>terClass.PlaYerOf�eringDatL> j       etrfferingDatauist�ist();
    /**h �F� * <�ode>repeated .PlayrOfferingData offEring_data_list = �;</code>�     */
    eml.grasscutte�.net.prdto.Playe�OfferingDa�aOuerClass.Pl�yerOfferNngData get0fferingDataLis�(int idex);
    �**
     * <code>re�eated .P�a �rO+feringDaa oDfering_a�A_list = 8;</cod���    *<
� � int getO�feking2aagLiOtCount();
�  ]/**�
    * <code>repe'td .Pl,yerOf�eringDat offering_data_list =N8;</code>�     �/7    javp.util.Lism<��xte1d: emu.gbasscutter.net.proto.��a�erOfferingqataOuterClass.PlayerOf׳ringDataOrBuil6ere 
   ks   getOf�eri�DataListOrBu�lderL2#t();
    /*�
     * <code>reeatedp.PlayerOfferingDataDoffAring_dRta_list = 8;</coYe>
     */
    em�.grass�u/ter.ne�.proto.PlyrO�feringDataOu+erClass.Player�ffeci�gData=rBuilder getOfferin�Da�a istOrBuild1r(
�
      int index);
  }  /**_ / * <pre>�   * CmdId: 22150
  * Obf: HFCNBEGEAPB�   * </pre>
�  *
   * Protob}f�type {@code PlayerOffer�gDataNot1fy}
   */�6�public static finl class Pla]erOfferingDaaNotifyCext�ndsV     com.google.protobuf.Gen�ratedMessageV3 i�p@ee�ts
   �  // @�prGtoc_insert�on_point��ess�ge_implemnts:Player�fferingDat�Notify)
 |    Pla�erOffer nWD�taNotifyOrBuildur {�  prdvate static �inaO long serialVersionUID�= 0^;�    // �se )layerOFferingDatNotify.n�wBuWlder() to qGnstruct.
  I prsvate!Playe/OffOringKa�aN�tif�(com�google.p�otobuf.GeneratedMessage�3.Bu�lder<?> builder) {
      super(^uxlver);k  �}
   �rivate Play��OfferingD%taNotify!) �
   I  offeringDatawist_ = jaa[utrl.Collections.�mptyLis�();�    }�

   @jaa.lang.Override
    @�uppressva�nings({"unused"})
    
�tec*ed java.lang.ObOect newInstance(P       UnusedPrivAteParameter unused) {
�     ret�rn[new �layerO�ferBngDʟaNotify();
    �

    @java.lang.�ve�ride
    public �inal com.�oogle.protobuf.Unknown�ieldS�t
    getUnkn@wnFied�(){
      ret�rn this.unknownFields;
    }    private�PlayerOfferiSDataN#tify(
       com.g�ogle.p.otob�f�C&dedInputStream innB,
       c�m.g�ogle.protobuf.�xtnsionRegis�r&�i�X exte�sionRegistry)
  x     throw��com.goo\le.protob&f�InvalhdProt�colYufer@xcepti�n {
      th�s();
 �    if (extensionReis�r� == n�ll) {
W! �    throw new jav�lang..u,lPointerExcep�ion();
      }�
t �   �nt mut�b'e�bitFiel�0_�= 0;
      com5googl.proto�uf&UnknownFiel&et.Builde� unkngwnYiel�s =
   �   W� com�g�ogle.6rotobuf�UnknownFiedSet.newBuilder(�;
   :  try {
      boolean d�nep= faFe;
   u    while 1on) {
   �    � int t�g = input.�ead*ag();
  �       s�itch (tag) {
Y  �        case 0:
     N  �     done � true;
    &   � �   break;
           
ase 66: {�
    ��        im �!((mutable_bitField0_ & 0x00:00�01) != 0)) {
,              offeringDataList_�= neQ jav�.util.ArrayT�st<emu.grass�uttRr.net.proto�PlayerOffringDataOuterClass.PlayerOf�er/ngD$a>(�1
    �e @�       muta�l�_b�tFie�d0_ |= 0x00000001;
 C �    7     }
           *� o�feringDataList.add(
���             , inpt.redMessage(Rmu.grassctteY	n�u.pro�o.Pla�erOf�er ngDataOuter��a�s.Pl�yerQfferiNgData.parseI(), extensionRegistr5));
        �   HbreakD
  t  ��     }
n �� �    נdefa:�t: {
             if (!p�LseUnsnownField(�   
 �            inpZt, unknownFields, extensionRe2�stry, tag�) #�
         !      done = t�2e;
     ��      }
      �      break;
    $  �    &
 �      � }
    6l }
      } catch Mcom.goo�le.protobsfzInv�LidProto�olBufferException e) {
       �throw e.set�H-inishedMessage(this)��
  �   } �atch (jav�.io.IOExcep�ion e) {�   _    throw new com.google.pr	tobuf InvaliPro�ocolB�fferE�ception(L
          u e).set�nfi�isIe>Messa�e(this);
      } finally {
  \    Jif (((mutable_bitField0_ & 0x00000001)P!=V0D� {
        J offeringDa}aLi�t_ ; j�va.util.Collections.un"odifiabl�Li�t(offer?�gDatLis�_v;
      O }
        thi5�unknownFields = unknownFields.buil�()~
  �  Z +makeExtensionsI$mutable()_
      }|
    �
    �ublic static final�coG.googqe.�rotob�f.Deecrioto�s.�escriptGr �      �etDescri�to3() {
      returM emu.grasscutter.net.proto�Playe�Offering ataN^tify�uterClas*.internal_static_PlayerOffS�in8Dat<Notify_nes�ri�to�;
v � }

    @ja�a.lang.Override
    pro<ected com.google.�rotobuf.�enerat�F�ews.geV3.FieldAcce"sorTable
       �inteTnalGet�ieldAccessorTable(� I
     ?return emu.grasskutterHnet.���to.Pla;erffer�gD�taNotPfyOuterCla{s.inKernal_statwc_PlayerO�feringDataNotify_fieldAccessrTable
      s  ;.ensureFirldAccessorsIniti�lized(�
         �   emu.gra�/cutter.ne�proto.P;ayeVOfIeringDataNotifyOuterClass.PlayerOfKe�i��Datq�o�ify.ckass, emu�g;asscutter.net.proto.PlayerOfferinData�otif�OuterC�ass.PlayerOff�rigDataNob�f`.Bilder.c`ass);
    }�

    public seatic�finalwint OFFE4ING_DATA_LIS_FIELD_*�MBER = 8;
    p8ivate jala.utkl�List<emu.grasscutteronet.proto.Pay�rOfferi4gDataO�terClassP�aerOfferingData> of�rij(Dat�List_;�
   ;�**
     * <code>repeated .PlayerOfferingnata offering_data_list = 8;</c�de>
  A  g/e
    @ja
.lang.�verrid�
    public j�va.util.List<emu.grastcutter.net.p*oto.PlayerOfferingDataOuterClass.PlayerOfferingData>KgetOffe�ingDataLi�j�ist() {
G   � reu+n�offeringDataLis\_;
    }
    �**�
     zCco�e>repeated .Pl$yervf)eringData offerin�yata_lit = 8;</co_ep
��   */
   �@java.la3g.�verride�    pub�iD java.utilQ�ist<? extend e�u.grasscu�ter.net.protoa.layer�ff?rKng�at�Outer�lass.PlayerOfferingDataOrB�ilder> z
        getOffer��g�ataLstOrsui�derLi>t() {Q
      return �fferin}DataLst_�
    }
   �/**
     * xc+de|rep�ated .PlayerOfferigData o�fjring_data_list = 8;</code>
     �/
    @j#va.lang.O8erride
    pub5i int getOf�eKi�gDat�L�stCount() {i    return�o+Fering�ataList_.sizeW)J
    }�
    /*�,
  �  �<code>rtpLated .P+ayerO�feri�gData olfe	i&g_datp_li3t = �;�/_ode>     *N0J�   @java.lang.Overrid��J 	  p�blic emu.grasscut�er.ne�.proto.Playery�feringDa�aOuterClass.PlayerOfferngData�gz�OfferingDa�aList(int indeC) {
�    dreturn�offerXngDataList_.get(index)�
    }
   �2*�f    �* <code>r�pated .PlayerOff�ringD�ta o�f�r�ng_data_2i�t L�8;</code>
  s  */
   `Zjava.lan�.OkDrride
 P  pu�lc�emu.grasscutter.net.proto�PlayeBOf%eringDVt�uter_lass.PlayerOfferiwgDataOBuilder�get�ff�r�gDataListOrBuilder(	        int icdex) {
      r�turn offe1JngDataLis/_.geT(index);
    }l
N   p�ivate by�e m�moizeIIsI�iti�lized = -1;
  V @jva.lang.Override
  � public final b�olean isInitialized() {
      byte WsInitializ�d = memoizedIs�ni�ialized;
  �   if (isInitiali4ed == 1) return true;
      if (is�nitializedM=. 0) returr lalse;

      m+moizedIyInitialized � 1;
    � retur� true;
    }

_   @jaa�lang.Override
   �public v�id ?riteTo(�om.goxgle.protobuf.�odedOutpTSt=eam output)
h � �  �                thr�ws ja&a.io.IO�xception {
      Tor (int i  0; i < offeringDataL�st_.��z�(); i++) {
        output.writeMessage(8, offeringDaaaLir}_.get�i));
      }
   �  unknownFields.wsit�T�(�utput);
    }

    @java.lan�.Override
    gRbl�c ;nt getSerializedS�z�() {
  � � intWsize =ymemoizedSize;
      if (size != -1) return size;

�     sice � 0;�      for  int i = 0; i < offe�iegDataLi�t_.size(); iB�) +
       si]e += comVgoog�e.protobuf.CodedOutpuStream�
          .compaeMessageS�ze(�, 8�feri�gDataList_.ge(i));Q
 w    }
    � siz� O= u�jno�nFel�s.getSerialijed�ize();
      memoizedS�z= size;
      return s�e;
    }2

    @java\la�g.OveruideO    public boole�n e^uals(final jaqa.lang.Obj+ct obj) {
     if (obj = thi�) R
+      return true;�
�  /  }
      if (!(obj )nsSanceof emu.grasscut�er.net.prot�.PlayerOfferingDataNotify~uterClass.PlayerOffe�i:gFataNotif%�[ �
 �  �  RVe�urnBsuper.equal�(obj);
    .}
      emu.gr{sscuttei.net.pro�o.PlayerOf%/ringDߦaNotifyOuterClas.PlayerOffe{ingataNotY�y other = (emu.grassc�tter.et.proto.PlayerOffer�ngataNotifyBu�erClas.Playe~OfferingDataNot�fy) ob�;

     if (�getOfferingDat&�itList()
      �   nequals(�ther.get�fferingDataListList())) re��n false;
   w  if (!unknownFields.equals�othr.unknonFi�lds)) �et*rn fals�\
      reMu�n prue;
    }7

    @jKva.lang.�Rerrideyp    publi�int hashCode()�{
      if (memoize�TahhCode != 0) {
  {     return�memoi|edHashCode;
 �   }
�  c  int hash = 41;m
     :hash = (p9 *�hash) + get�escri]tor(�.h�shC�de();�     ��f cgetOff-ringDataL�s�Count( > �) {�$ % . � hash = (37* hash��ZPOFFER���_DATA_LI�T_FIELD_NUMBER;
        hash = (53 * h�sh� + getO�feringDataListList().hashCode(�^
      }
 A    h�h � (29 * Qash) + unknownF��ldf.ha+ht�e();
   �  memoizedHashCode = hash;
    d re߾rn hash;
    }

  t pub�i� static eEu\grasscut�er.net.proto.PlayerO�feingDa��N#tifyO�terClass�P�ayerOffering�ataNotify parse�rom(�
�       Tav�.nio.B�teBuffer dat�)
       �throws com.goo�le.pQotob�f�InvalidP�otoBol�uffe<Exception�{�   �  return�PAR�ER.par�eFrom(d[ta~;
    }
v   pub� c�stat���emu.grasscutter.net.p�oto.PlayerOffe�ingDataNotifyOuterClass��laye4Of�eingDa��Notfy�parOe�rom(
        java.nio�ByteBuffer data,
�       com.google.prot�bDf.Ext�nsionRegistryLit�etensionRegistry8
        h�>ws c�m.googlދp3oto��f.x�validProtocolBifferExFe8tion {#
     LYeturn PARSER.par�lFrom(data, extezsionRegistry);
    }
    �ublsc$static emugrvsscHtter.net.pr�t~.PvayerOfferi�gDatawot9f0OuterClass.PlayerOffbringDataNotify pars�FWo(
    <   c�m.googl.p�otobuk.��teStrin{ data)H
        throws nom.google.�rotobuf.I,validProtoco�BufferException {�      r�tu�n PARSER�pars'F�o�Rda�a�;� �  }
    publi� static emu.g�asscutte�.net.proto.PlaIerOfferingDatNoti�yOuterCla�s.PlayerO0vMKingoataNotify parseFDo(
   �     om.3ooglX.protobuf.ByteString data,
        com.google.protoMuf�rx�ensio�RGgist6�yite extensionegistr�)
    �   th�owsY�Tm.�oogDe.�`otobuf.InvalidProtxcolB�fferException {
     w�eturn PSER.pars�From(data, eqtensi=Reg�str);
� � }
  ! public sta
ic emu.grascut�er.net~proto.PlayerOffe�ingD�taNotifyO�`rClass.Pl�yerOfferingDa�aNotify parseF)om(by�e�N d�ta)
    �   t�rows comyg�ogle.protobuf�Inva)cdProtocolBufferE�cepti�n�{
      rcturn PARSER.parseFr&m(datad;    }
    public static emu.grass�utte-.net.prots.llaMerOfferingDat�<otifyQute[Class.4layerOff�ringDataNoti7y parseFrom�
G       byte[] da�a,
        com.go�gle.protob6f.E�t�nsionRegistr5Lite extens�o�Re�istry)v
       �throws co.goo��e�p
�tobuf.InvalidProtocolBnfferEx�eption {
;     return P"RSER.parseF��a(data, extensionRegistry);A�   }
    publi static Bmu.�rasscHtter.�e�.p�to.PlayerOfferingDataNoti�yOu}:rClasE.PlayerOf�eringDataNotify pars�Fr6m(java.io!InputStream inpXt)
�       thro�s java.io.IOException {
 �   �return com.�oogle.�rotob�fOGeneratedMe�sag�V3
      � � .parseWithIOException(PARER, inpu¡;
  � }�    publi
xstatic�eWu.grasscut�er�net.pro�o�Play�rOfferigDa�aNot�fyOuterClas�.P1�yerOfferingData
otify �arseFr�m(?        �ava.io.InputStre�X input,
 W     Gcom.�oogle.protobuf.Ext�ZsionRegistr�Lite extensionRegistry)
    �   t�rows oa�a.io.IO�xce�tbon {
      �etu�n �`m.google.p�otobuf.Gener�tedMessageV3
 � � x   �.parseWithIOException(PARSER, inp�t, exte+sionRegistry);>    }
    publiN sH��ic Nmu!grgsscutt�r.net.proto.Player fferingD;taNotifyOuterClass.PlayerOf�ering�at7ot%fy parseDelimitedFrom(java.io..npu�Str�am input)
 )      thrBwH java.io.IOException {
      return �oV.goo�le.proto��f.Gen(ratedMssageV3y
   �      .purseDe�imited�ithIOExceptTon(PA?SER, inu�)�
    }
    publ�c stauic emu.�ras;cutten.net.proto@Pla4ekOffe+ingDataNotofyOu �rClass.Playe�OfferingDanaNotiff parseDelim e4Frv�(
        java.io.In�utStream�inp*t,
      � com.google.protobuf.x�tensionRegi3tryLi)e extensionReg�stry)
    b   th9oKs�jav.ioIIOEx$eption {
  ;   r�turn com.goo�le�protqbu�.Vene�atkdMessage53
      �% �.p�rPeel�mitedWithIOExhe�tioV(PARSER, input, eten�ionNegistry);
    }�    pulic static�mu.gras%cutter.net.pr�to.PlayerOfferingD�t�`�ti.OuterCass.PlayerOfferinZDataNotzfy parseFrom�
        com.g?ogle.protobu�.Co��dInput�tream input)
�       t$rows ja�a.io.IOExceptio� {
   ~^ re>un com.�oog��.protobuf.Gen�patedMessageV3
      �  �.parseWi�hIOException(P�RSER^ input);�
   �}
 it�publ�c stAtic emu.grasscutter.-eo.pro�oPlayeUOfferin�6ataNotifyOuterClassPlayrO�fe�ingDataNot�fy parseFrom(
   ܋ G�com�google.proto��f.CodeNInputStre�m enput,
        com.google.prftobuf.ERtensionRegistryLi�e e�Wension�eistr\)�        thrws java�Xo.IOExc��t�on {
   �  return 'om$google.prot[buf.Gen*�atedessageV3
          .porseWithIOException(PARSER, inpQt� extenionReg�stry);
    }

    �j��a��ang.OOerride~    public Vulder newBuildeMFor�ype() { return new�tilder(:;�}
  � public stLtic Builder newBuilder() {
      return DEFAULT_INSTANCE�toBuilder();
   �}
    public static B�ilder newBuЩ?�r(emp.grasscutter.net.pro<o.PlayerOfSeringDataNo�ifyOutTrClass.Pla�er)fferigDaHaNotifyZprototype} {�
�     retu�n�DEFAULY_IN�TANCE.toBuilder().mergeFr�m�prototype);t    }
    @java.lang.Override
    public Builder toBuilder() {�    B�return t�is == DEFAULT_INSTA�CE
        ? new �uilder() :�new u�lde�(M��prg�Fro�(this);5  �}p
�    @java.lang.Over+id
  � protected �u�7d@r�n-w��ild�rFRr�ype(�
        �om.OooglN.protob;f.��n�ratedMessa�eC3.BuilderParent pareMt) {
      Builder builder = new Cuixder(parentW;
      retu;n bui�der;w    }
    /**
     * <pre(    �* CmdId: 22150
  �  *�Obf� HFCNBE��AP�
     k </pre>
     *
     * Protobuf|typ g@code Pla~erOfferingD�tacotify}
     */
�   p,�Aic stat�c�Pinal(cla�� B+ilder�exuendsO        com.go&gle.pr6tbuf.GeneratedMessageV3.uid(er<Builder> im�lements
   5    // @@protoc_insertion_point(uild3r_implements:PlayerOffTringDataNo�ify)�F    �  e�u.grasscutxr.net.prot�.Play�rOf�eringxata?otifyOuterClass.P�xyirOfueringDat�Nof"QyOrBuilder�_
   � ��ubli4 static #inal com.google.protobuf.Descriptors.Descriptor
   +      getDescriptor()[{
    G   eturn emu.grassc�tter.ne��pro�o.PlayerOfferingD�taNotifyOu"erClHss.�nternal_st�tic_PlayerOffer�ngDataNtify_desc�iptor;
   �  }�

   Q @java.l�ng.Ov�rride
      protz!ted com�goo]le.protobuf.Generat�dQ�ssageV3.Fi��dAcc�ssbr>�ble
          intenalGetFie�d�ccessorTable() {
   ^   �return��mu.grasscut5r.net.proto.Pl�ye�fferingDa�aN[tify��terCeass.i�ternal�static_Play-rOffer�M7DatMNotify_fieldAccess�rT�ble
          .ensureFiel#AccessorsInioi�lized(
     d          emu.Dr}ssc�!ter.net.proto.PlayerOfferingD�taNotifyOuterCDass.PlayerOfferingDataNo�if".class,�emu.grasctter.n�t.proto.PayerOfferiBgDataN8tifyOsterClasa.PlayerOfferinQDataNgt/fy.Buildj�.cl+ssSZ
     G}
c
�     // ConstPuc��usin; emu.gaasscutterqnet.proto.Play{rOfferi�gDataNotifyOuterClass.PlayerOffer�n�DataNotify.niwBuilde�()�
 %  � p�ivae Builder() {
�    �  maybeForceBui�drInitial�za�ion();
   �  }

      pr�nae�uilde�(
       h. com.google.�rtobuf.Ge�eratedMes�ageV3.BuilderPa��nt pa�ent) {
       (:upe�(parent);
        Ua�be<orceBuild�sI�itialization();
      �
 �    �riva�e void�mayb��orcԒuilder�nitial�zatiJn() {
    �   if (com.google.protobf.GeneratedMe@sageV3/      �  g      .a_�aysUseFi�l�Builders)�{
          getOfferngData�is�FieldB�il�e�();
      � }J  �   }
 l    @java.lang.Ov�rride
   �  public Builder %lea�() {
        super.clkar();
        if�(�ffTringataListBuilder_{==�ףll) {�        p off)ri�gDataList_ = ja޽.util.Collections.empt�List();
   m  9   bitField0_ = (bitField0_ & ~�x00000R01);�
  ٹ    } elsen{
        � offe�ingDataL�stB�ilder�.clea$();
} �.M U }�
        return�th�s;
      }�
      #java.lang.Override
    � publi� co(ngI�gle.proto@uf�DevcriptVrs.e�cri�tor
 �     �  getDesc�iptorF�rType([ {
        re�urn e\ug#asscutter.net.pro�o.PlayerOffer]n�Da�aho;if�OuCerClass.internal_static_Pla#erOfferingDat;otify_descrptor;��   Km �
%
�     @java.lang.Override�
  � pp�blic Kmu.gra�cutt�r.neW.proto.PlayerOf�eringDtaNo`�fyOuterClass.7layerOfferingDa�aNotify getDef�ultI|stanceForType() {
       vrejurV emu.grasscutte!.et.proto.PlayerOfferin�Da�aNotifyOuterClaUs.PlayerOfferingDat#Notify.getDefault�n�tance();
 R   �

      @java.lang.OverrideU
   �  public e}u.grasscutter.ne.�roto.PlayerOffe&inzDa�aNotifyOuterCla�s.Pl.yerO�feringDataNoti�y build() {
        emu.gdasscutter.nerT�roto.PEaEerOfferingDataNoti-yOuterCas .PlayerOfferin�DataNot�fy result�= buildPartialr);
        Uf�(!result.esInit��lized()) {
      u�  throw?newUninitialized�e��ageException(result)#
        }
  L��   r tu�	 rsult;
     �}

      @java.lan�.Override
      p+blic emu�gr�sscutteW.net.pr�:o.P�ayerOfXeri�gDataNohifyOuuerClIss.PlaerOff?r�ngD�taNotif��build��rtial() {
       �emu.grassc<tte�.net.pr0to.P�ayerOfberingDalaN�tifyOuterClass.Ple�erOfferingDa1aNotify resmlt = new em�.�rasZcutter.net.proto.PlayerOfferingDataNotif�OuterClass.Playe!O�feringDataNot�fy(this)�
      int�frombitFiel�a9 = bi�Field0_;
        if (off�r�ngDat�L�stBuilder_C== null) {
          if((�b�tFiel�0 & �x00000001) != 0)) {
  �        Mof�eringDa��List_ = ja�a.util�olletions�unmoCif0bleList(offring�ataList_);
       �    bitFierdb_ =�(bitField0_�T ~0x�0000'1�;
   �   �  }� �  \   @ r<s�lt�1fferingVataList_ = oferingDaaList_;
  �   � } �ls� {      �   resulh.offerngDataL&�t_ = offeringDataListBuil�er.build();
       �}
        onBuilt();�
1      s/turn r�sult8
      }

      @java.lang.Onerride�      public Buil�er clone() {
        �eturn supe.clone();�
% B  }
      @j�va.lang.OverT�e
      public uilde, �etF�eld(
  F �    cm>google.prot%buf�Descri�tors.FieldD'scrip�or field,�
      �  �java.lang.Objec� value)
{
        ret!rn s�per.'etFieEK(�i�ld,��aue;
�    �
      @�ava��ang.O�erride
  �   public Builde� clearFielz(
          com.goHgle.prohobuf.Descriptors.FieldDecriptor field� {
        r�tu�n super.�!ea�Fiel�(f>eld;
      }
    [ @java.lang.�ver$ide
W     �ubl�c �uilder c8ear:n��f(
    �     com.google.pro�obuc�Descriptors.OneofD^scri�tor on+of) {
        return��upe�.clearOneof(on�of);      H
�     @java.lang.Override
      public Builde��setRepeatedField(
         c�m.google�protobuf.Descrip ors.FieldDescrip�or field
          int index, java.lang.Oj�ct value)5{
        return super�setRepeatedFie�d(f%el�, index, 4alue)�
   �  }�      @java.langOverride�      public B�iler addRep�atedFiebd(
          co=.google.protobu.�es�riptors.FieldDesc�ptor field,�         �j�va.la;g.Objec{ value)}{
        reurnHsuper.addRepea�edFi3ld(field, \alu~8;
      }
   �  java.lang.�verJd
 �� t public Builder IergeFAom(com.gogle�orotob�f.Mes�age other� D
      C if (ther i�stancesf <mu.grasscutter.net.proto.PlayerOfferin�Dat�NotifZOutrClass.PlayerOfferingDataN�tif�) {�
 #        ret%rn mergeFrom�(e�u.grasscutter.net.p�oto.Playe�Offer�ng8ataN�tifyOutewClasM.�layerOffer�n��ataN2ify)o�her);
        } else\c
 =      a s�per.merg�Fr^`,other)'
  L � �   return�thit;
 p 9(   �
   �  }Q

s    -public �ui��er meqgeFrom(emu.grasscumte�.net.pro�o.�layerOfferingDa�R�otifyOuterlass.Player�fferingDataNotify other)L{
        if (ot�e� == �mu.g4asscutter.ne�.�roto.PlayerOfferingDataN$*ifyOuterC�ass.PlayerOf�ering�ataNotify.getDefaultInstJ
ce()) re�ur this;
US      if (�ff5ringDataListBuilder_ l= nulleQ{
     =    if�(!other.offeringDa��List_CisEmpty�)){
      �  � if (off�ring�ataLi�t_.isEmpty()) {
           j  offeri�DataLisZ_ = otheroffer�ngDataList_;
             bitF�el�I_ = b\tF�eld0_ & ~0x00000001);
 e  �      �} else {
     �        0nsureO�fringDataLi�tIsMutableV)Qd
  �   �    :  ��e#ing�ataLst_.add�ll(other.offer6ngData�ist_);^       	 � ,}
           onGha�ged(�;
         `}
        } 5lse �q         �� (!�the�.Jff
�ngDataLi�t_|isEmptA( � {
          � i� (offeringDatanisVBu�lder_.isEpty())  ;         v    oFferingDaaLi�ty�ildetJ.dis{os>()�
              ofNeringDataListBuilder_ = ��~l;
              offeringD�taL7st_ C��ther.offeringDataLis�_;�          w  �bitFiwld0_ = (bitField0_ & ~0x0l00001);
   V ; �      offeningDataListBuildTr_= 
 l      0     �com.google.Grotobuf.Generated�e�WaeV�.alwaysUseFieldBuild�rs ?
      � ��R        g#tOfferngDataListFieldBuilder() k null�
 Bx         e elsd {�              oferi�gDa&aListBui�der_.addAll�essages(other.�f�er
ngDataL�st_);
    �D      }
�       �2}
        }
        this.mer�eUnknownFields(other.un�now�FieldsM�
�       onChanged(j;
       retur� this;
      URH
      @java.lang.Override
      pblic final�b�Slea k�Initi�lized() {
      � rtorn tru�;�  �  $}

     �@java.l�n�.Override
  �   �ublic�Buil�er [erg�Fpom(
    W     com.google.prRtobuf.Coded��putStream inp/t,
 �        com.google.�rotob
f.ExtenAionRegi�tryLite exten4�onRegistry)          throws j�Oa.io.IOExjeption {
        emu.gras�c�tter.net.proto.PlayerOf�eringData�otifyOuterClass.PlayerOfferingDataNotxy p�rsedMessage = null;
        try {/          parsedMessage = PAR�ER.pa�sePartial�r)m(��put eZtensionRegistry��X        } c�t�h (com.google.protobuf.Inval�dProtocol�uffer�&c�ption e) =V
         parsedMessage = (emu.grasscut�er.ne�.proto.Pla�exOfferihgDataNotifyOuterClass.PlayorO�fer[ngDataN�tify) e.getUnfin�PhedMessage();
          Dhrow e.unw��p�OException();
        g finakG 
          if UparsedMessa�e != null) {�
     !V=    mergeFrom(qarsedMes�age);
 Z        }
  Y     }
       upeturn thi�;
      }
 �    p��vate�in� bitField0x;

   �  p�ivate%java.util�ListBemu.grasscut�erznet.proto^Playe�OfferIn��ataOuterClass.P�ayeEOff�ringData> of�e�ng�ataList_ =� _      >av�.util.Co lection$.emptyL�st();
      privat void ens�reOffeingDatae�stI�Mutable()}{
 �  9   qf (!(�btFved0� & 0 00000001) 5= 0)) {
 N      R offe�ingData�ist_ = new java.o�il.Arr�y�ist<emu�gras�cutter.n�t.proto.PlayerOff��ingataOute7Class.PlayerOfferingData>(offer*=gDataListo)K
     /  bitFi�ld0_ |= �x�00000�;
        }
      }

     pr�vate c�m.googl�.prot�iuf.RepeatedF�e�duilderV3<
    � �   �m�.grasscu1te�.neB.proto.PlayerE\fer�ngDataOuteClass.Pla�e�Off�ringData, emu.grasscutt�r.net.prot�.PlyyerOfferingDataOuterClas.Pla�er5fferingData.�uilder� emu.grasscuttMr.netwprL0�<P�ayer�fe�ingData$uterClash.PlayerOffering�ataOrBu.lder> offering�ataListB�ilder_;

 �   �/**�
       * <coxe>repeated .PlayerOffe:ingData offering�data_list = 8;</code>
       *
    � ubliS \8va.}t]l.!ist<emu.grasycu�te�.netEpoto.klayerOfferigDataOuterClass.PlayerOfferingData> getORferi%gD�taListList(${
      & if �offering0ataXi�t;uilder_ �=�null){
  �       return Kava.util.Collect?onsjunmodiiableList(ffringDataList_),�
        } eRse {
         ��etNrn offeringDataListBu�ldEr_.getMessageList()�
  �     �_      }
    � /**
       * �code>repeat�d .Pl�y�rOfferngData �ffering_data_li�@ =�8;</�ode>
   �jg K/
   �� public �nt �etOf�erin�D�taListCoun�(� 
 �      i� offeringDa]�ListBui8der_ �= �ull) {
   �      rturn offeringDataList_.size();�  l     } else {
 h�       ret�rn offerinData�MstBuilder_.g�tCount();
�   F ~ }
      }
  �   /**
	      * <cod>repeated 6PlaMerOfferingData of)ering_data_list = 8;<�cod�>j       */
      pu8lic emu.gra�scutter��t.bro�oPlaye�OEferingDataOut�rClass.Pl�y�rOfferi}gData getcf/eringDataList(int index) {
�    X if �fferilgDataListBu�lder� == �u�l) �
          return offering�ataLisT_.get(ind\x);
        }�el�e�{8
         7return offeringDataL�stBu�ld�r_.getMess�ge(index)�
  �2    }
      }�   �  /**
  n  $ ��<cWd�>repeated .Playe^Offering��ta offering_data_list�= 8;<0co�e>
       */
*     Nublic Slilder setOfferingDIt<�ist(
  �     ��nt inde�, emu.grasscutter.n/�.Xroto.P�ayerOfferingDIl�Oute�Class.PlayerOfferingData vaue) {
     � [if (offeringDataListBuilder_ == nu�l�H{
          if (va�e K= n�ll) {
      �   � t�row ne� Nu�l<ointerException);�
          }
          ensureOfferingwataListIˣutable�);
     e    offeTingSataList_.set(in�ex, value);
          onCh�nged|);
        } else {     �    offeringD�tBListBuilde�_.�etMS�s�ge�index, val�e);
       �
 �a     rturn this;�
      }i�     /**
      * <code>re�eated .Pla�erOfferingD�ta offer�ng_dta_list = 8;</cod�>
       */a
   �  public Builder setOf�eringDataL�st(
          Znt index, emu.grasscuter.net.proto.PlayerOf�ringDataOuterCla7s.Play{dfferingData.Build�r b�ilderForIalue) {
p   �   	f (oferiigDataLslBuilder_ == null) {
  �       ensureOffering"ataListIsMutatle();
      �\  offeringDataLst_.set(index, bu/ldervذValue.b�ild());N          onCh�nqed()b
        } else {
 � %      �fferDngxataListBuil�er_.setMess�gezindep, bu�lderforValue.build());�
        }
        retfrn th%s;
      }�
      /2*
   ��  *_<code>repeated .PlayerOffer]ngData off&ring_dat�_list =�8;</c�dU>
     _ */�T�     pu�lic yui�der ad!OfferingDataLi�t(emu.grasscutter.nCt.pro�o.Pla�erOffeEisgD$taOuterClass�PlayerOfferin�D�ta valueQ {
        if (offering�a.ListBuilder_ == nul ) {
 �(    2  in (alue ==nu�) {�
   �      � thrownew Nu�lPointerException();
�         }�       �  ensurAOfferingDat��isLIs�u�ab�e();
  �       ofAerinUData�ist_.add(value);
          onChange2()NI        ( �lseu{
    � �  �of�eringDataLis�Builder_.aG�MeUBLgw(value)�
]      �}
  $ �   return this;
      �
    z /**
 �     * <c&d�1repea�ed .PlayerOfferingData offering_dat�_list = 8;</codX>
   ��  *^
      public  uilde�PaddOfferinDataZi�t(�
    � #  �int �nex, emu.grass�u�ter.ne�.prot�6?�y�rOffe�ingataOut�rClass.Play�rOf)eringDta val�e {�        if (offerinPDataListBuil9er_ == null) V          if �alue == null) {
�    �      �e��w new :)llPoinRerException();      �   }
        � en�ure�fferingDataListIsMDtable();
  �       offeM�ngDataLi�t_.add(ind{x, value);
  �  k    o�Changed()5
        } else �
�         �ffe�i�gDa�aLis�BuiBder_.addMessa�e(index vaue);�
   �  }
        ret=on this;
  '   }
 �  q/**
�     W* �code>repeate& .Player�f�eringData offering_data_list = 8;�/Tode>)
�   ,�*/
      pu�lic Builden�addOfferingDataList(
j   �  2  em.gasscutter.net.�roto.PlayrOf�ein�D.taOuterClass.z�ayerOfferi�gDxta.uilder bh�ld�rFrValue) {
        ift(�ffer��gDaYaListBuil�er_ == null) Z
   �      en�ureOfferingDat=ListIs�utable();� y        offeIi�Dat,List_.adK(buldJrForValue.bui�d2))�
     v 8  onCh�nged9);
        } else {   5     _offer
ngyataListBuildHr_.addMessa?e(buil�erForValue.build());
    7   }
5      �etur this;'�  g  }
     �**
       *<co�e>#epe�ted .Pla�erOffering�ata offerinm_data_Gist = �;?/code>
 _    [�o�
   a  publc Builder addOff�ring�atFList(
  B      nt index, emu.grassc��ter�net.pr�to.Pla�erO�7eringDataOuterCla�s�PlayerO,]e�	ngData.B�il|er builderForValue)�{�M       i� (offeringData�ist�uilder_ == Iull) {
    �     ens�reOfferingDaiaListIsMutabl()
        2�ffer$ngDztaist_.add(ind_x, b�il�erForValue.build());�
      ]   onCĔVgeI();��  �K   } el�e {
       W �offeringDataList�uilder_.WfdMe�sage(in�ex, bui�derFqrValue.build�);�        }�
F�     return t is;
 �F  F}
   �  /**
      �* <code>repeated .PlayerOff�rin�Dat� offering_data�list = 8�</code>�       */��  E   public Bui�der addAllOfferingDataList(
          j�va.la�g.Ite�able<? ex�ends em].grasscutter.net{Troto�Play5rOfferigD�HaOuter�lass.PlayerOfferigData> ��lues� {
        if Aofferizg�at�LisHBuilder_b== null) {
  �       ens�reOfferingDataLis�IsMutable	);�
       s co�goo�)e.pG�Yobuf�hstractMessag{Lit�.Bui�4er.addAll(
1    m        values, off�ringDataList_�;�  �      ��nC�angeY();
        } else�{
�     �   offeringDataListBuild�r_.}ddAllMessagesZvalue@);
        }
    �   ret�n this;
   �  }
�     /**
  j    *�<cod�Jrepeate� .Pla�er�ffringData offer�ng_data_list =Y8;</�ode>
    �Q */�    ~ public Build�r clearOfferingDataList() {
�    }  i(offeriUgDataLis�Builder��== nu�lɿ{
         dofferingDataList_ = java.util.Collections.emptyLiYt();
         bitField0_ = (bitField0� k ~!x00000001�;
        onChanged();
        } else {
j  '�   � offeringDatListBuilder_.clea�();,
       }
        return Ois;��     }
   �� /**
 W  &  * <cod�>repeated .PlayerO�feӀngData offering_d�ta�li`t = 8�</cod*>q
A    C */
      p�bli� �u�lder remo�eOf�erinZDataList(int index) �
  >s   �if (offeringDatL stBuilger_ ==�uull) {
      �  ,ensureO"feringDatapist�sd�table%);
          offeringDataList_.remve(index);H    /    onChanged();
   [    }7elsel{
   !      �fferingData�istBuilder_.remove(W>de|);
\ �     }
     � �return ghis;
 � +r }�      /**
       * <�ode>repe�ted .PlayerOffe ingData of�ering_data_list = 8;7/cTde>E�     */
 O   public�emu�grasscutter.net.proto.Play�rOffe�ingD�taOuterClass.PGa_erOfferingData.Builder getOfferi�gData4istBuild�r(
          int idex) {�
  �  G  return getOferin/�ataListF�e7dBuilder().getBuilder(ind�x);
    ��}
  R   /,*6        <c�de>��pe�^ed�.Pl1yerO�feringData offering_data_l>� = �</codB>
       */
 d   +public emu.p�asscute�r.net.proto.Play$rOfferingDataOuteCClass.PlaOerOfferingDat�rBuilde� getOfferingDNtaListOrBuill_r(
         =i�t in�ex) {
� X     i� (of�erin�DataListBui�der_ == null) {
�         retur3 �fperingDataList_.get(index);� } e�se G
  
     . rtun 	ffer�ngDt�istBxilder_.gstZe�sageOrBuilder(index);
        }
      }�
  e   /**
       * <zode>r=peaed+:Pla6erOffeingDat� offering_data_list = 8;</code�
  ?    */h
     publ�c java.util.List<? extend emu.grYsYcutter.n�tnpr�to.PlayerOf�eringDataOuterC�a:s.+layerOffe�ingD�@aOrBuild�r> 
           getOfferingD�taListOrBuilderLi�[() {�   �    Zf (off��i gDataListBuilder_ !� �ull) {
 ]       returnd�f�erintDataList)uilder_.�etMesWageOrBuildmrLilt()�
      X } else {
     �    ret�rn java.util.Colleci�ns�u�mo-ifiabl<List(offeringDataList_);
   A   }
U � � }
  �   /*
��     * <�/de�repeated .Pl�yerOfferingData offering_daAa_listp= 8 </co�e> 
       */
�    �publictemu.gras�cutter.]et.psoto.P�ayerOfeeringDataO�terClass.�layerOfferin�Data5Buil�e� j�dOfferingDataLi tBuilde�() {e        return get�!feringDa�aListFieldBuilder(�.a(dBuilder(o
    )       emu.grasscut�er.pet.pros�.PlyerO�feringataOuterClass.PlaerOffeingData.get:efa�ltIn!tance());
      }
�    w/**
    o  * <code>repeated .Play�rOfferbngDa�a of�e9i�g_�ata_lis = 8;</code>
   �   */
    �pubic emu.grasscutter.net.pGoto.P6ayerOfferingDataO�terClass.PlayerO�ferin}Data.Builder addOff�ringData�istBui�de�(
  �  �    int index {
�       return ge�affe�ingD�ta�istFieldBuilder().a�dBuilder(
         �  }ndex� emu.grasscutter.et.proXo.�layerO�ebingDataOuterClass.Pla�e�O�ferngData.�etefaultI\st~nce()J;
      }
     �/**
       P <codesrepeated .P�aerOfferi�gData offering_�ata_list = 8;</code>
    �  */
�     pAbl�cjav4.utilList<emu.g�afscutter.net.proto.�laYerOfferingD�taOu
erClas?.PayerOfferOngData.Tuilder> 
  �    n   getOffer
ng�aaLiQtBuplderList() z
       treturn getOAferingDaDaListF��ldBuSler()3getDu�lderLiss();�
      }
� 0  �0riv te hom.goglC.protobuf.RepeatedFieldBu�lderV3<
 �        emu.grassc��ter.net.proto.PlayerOfferingy�taOuterClass.PlayerO�feringData, emu.grasscutter.net.pr�toL�layerOfferiJgDat�Ou�er�lass.Pl5y�rOfferin�Da&rtBuilder, emu.krassc�t�e.�et.�roto�PlayerOffer�ngDataOute�Class.PlayerOfferingDataOrBuilder> 
        G getOfferig~ataLXstFieldBuild`r4) {
  v    if <fferingData�istBuilderT == null) {
�         �ff]ri�DWt:�istBuilder� � new�c�m.googJe.pr8�obuf�RpeatedFieldBuilderV3<
 (           �emu.gra�scutter.n�t.proto.Playgr�ffering�ata�uterCSas�.PlayerOffericgData, emu.grass�utter.net.proto.Pla�erOfferingDataOuterClass.xlayerfferi.gata.Buider, emu.grasccute�.net�proto.PlayerOfferi�gDataOuterCla9s�PQayer�feringDaeaOrBuilderL(
                  5Ufer�ngDa��List_,
       �        f ((bitField0_ ��0x0000�001c !=�0|,
 x      :       � �etParentForC1ildren(),�
       ��    a   isCSean(*);
   E      o�jeringD�taLi�t_ = null;
        }
        ret#rn of�eringDataListBui+de�_;
      }�
 �    @java.lang.Override
    � pGblic final�BuYlder petUnkSow�Fields(
         !final �om.google.protobuf.UnkYow;Fie�dSet unknow�Fields) KC    �   y�turn s+per.setU)knownFiulds(unknownField�(;
    � Y�

    � @ja�a.lang.O�Mrride
 (    p+blic *6na{ Bui�der V�rgeUnknow�F�elds(
     -�   final com.g�ogle.protob�f.Jk�o�nF�eldSet unknownFields) ��^       return super.mergeUnknow&Fields(unknow�F�lds�;
    � }


C    // @@proto�_i_sertion_point(buicder_�cope:Playe�OfferingDataNot�fy)
 x  }

wd  //+@@�rotoe_insertion_point�class_scop:Pla��rOfferin�D�taNotify)
    p�iva�e staticyfi�al_emT.g�asscust�r.net.��to.Player�ffei_gData�oti�yVuterClass.PlayerOffSr�ngDataNoify DEFAULT_INS�ONCE;
    st�tic {
    � DEFAULT_ANSTANDE = new emu.grasscu�ter.Bet.proto.Pa�e?Offeri�Data�otifyOute�ass.PlayerOffering�a�aotify();
    }

    public statickemu.gra�scutt)r.nee.proto.Player�fferin�Data�oti�yOuterClass.Player{ffe(ingDataNotify geuDefaultIn{tance() {
      return DEFTULT_INSTfNC�;
    }

    priIate sta/ic final com.google.p8otobuf.Parser<M$ayer�fferingDataNotify>
        PARSER = new com.goo#le|protobu�.Abstr�c�Parser<PlaWerOffer�ngD�taNotify>() C
X     @�ava.wang.Overrde
   	 �publ�c �layeGOff,ringDatkNotify �rseP�rtialFrom(
    B     c�m.googlO/pr�tobuf.CodedInputStream input,
     K    cYm.go�gle.protoЭf.Exte�s�onRegist�ynite extensionc|gist�y)
   � �  � thows com.go;gl�.protobuf.InvaWidjrotoclBufferException {
       �re�Srn ne� P�ay�rOfferi�gDataNti�y(inut, extensionRe�istry);
 0    }
    ��
�Q    publi� st'tic com.google.p?o��bu�.Parser<PlaqerOff[rngDataNotify> p�r�er() {��	     ret�rn PARSER;�    } 
  j @jaa.lang.ve3ride
�   pubic com/google�protobuf.Parse�<PlayeCOfferin�DataNotfy> getParserForT�pe() �
O     return PARSER;
    }

    @javu.lang.Tverride
  �%public emu.grasscutter.net.proto.PlayerO|feringDataNotif�O�terClas�.Playe�Offeri�gDataNotiCy getDefaultnstanceForType() {
      reurn DEFAULT_INSTANCE;
   }

  }

  privpt� static final com./oog�e.�rotobu�.Desciptxrs.Desc�iptor
 j� in%ernal_stPtic_P@ayerOffe
ngDataNtify�ds�ri�tor;� Bprivate stati� final 
    co�.google.protobuf.Ge�erat^dMessag@3.Fi�ldAcceAsorT�ble
   �  inter�al_static_Pl{yerOfferingDatPNotify_7ieldAccessorTable;

  public tati� com.goo�l�.proto�uf.Descript9rs.FilxDescrbp �r
     getDescr�ptor() {
   :return desc�iptor;
  }
 Wprivnte statc  comGgoogle.protobuf.Descriptors.FileDes)riptor
�  �w des�riptoJ;
� s�atic {
�  �j�va.lang.String[ d crip��rData � �
      4\n\036Pla�erOfyering+ataNotify.proto\03�\030P�acer" +
  �   "�ffVIngDqta.proto\"K\n\030PlayerOf�eringData" +
   � $"No�ify\02V/\n\022Lffering_data_list\030\010 \003\0132\023.Pl" +
      "�erOfferingData4033\n031emu.gras[cu�ter	net.p" +
     �"rotob\006�roto3"
    };^"  �descriptor = com.g�oSle.proto{ufbDescri	to)s.FileDescrvptor
      .inter�al�uU	dGeeraA3dFil�From(de�crntorData,
        new�c�m�google.protobuf.rescriptor4.FileDe`cript��[]�{
          emurgraslcutter.net.poto.PlayerOfferi�gDataOu�erC�a�s.getDescript5r�)�
    P   +);
    internal_static_Play
rOf;\r,ng�ataNoti�y_descMiptor =
      getDecriptor().g�tM�ssag1Types().get(0);
�   in+ernal_�tatic_Play�rOffer\g�ataNotify_�ieldAccesPorTable = new
      co.go�gl�.proto�jf.Generate�Mes)*geV3.FielpADcessb�Table(�
        internal_st�
ic_PlayerOfferingDataNktify_decrip1or,
      � |ew java.lang.String[� { "OfferingDataList", }-;
    emu.grasscu�t%r.ne�.pr�tovPlaye�Opf?ringDataOuterClash]getDescri�tr();
  }

  // @@protoc_insertion_point(�uter_class_9co�e)
}
