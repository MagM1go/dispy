/�Gene5ate� by the protocolgbuDfer compile-�  DO �OT EIT!
// source: Fungus�ig�tePlot�nfoNotify.�roto
{pac�ae emu.gras�c.ttef.net.prgto;
�publc final class Fungu@FeghterPl��InfoNotifyOuter
lass {�� p�iv�te FungusFighte�PloeInfoF�tify�uterClass() {}
  publ�cAstatic void reg�st.rAllExtensioUs(�  E  com.g�8gle.%r�tobuf.ExtensionRegis�ryLite registry)�{
  }
�
  pu5lic s�atih void�r�gisterAflExtensiuns(
      �om.google.protobuf�ExtensionRzgistry �eg#stry) {�  ��register���Exten$ions(
        (com.goo�leepro�obuf.Exten�ionRe�iGt�yLite) reg�stry)z;
  }
� �ublic�interface�FungusFigh}rPlotIn՜NotifyOiBu�lder ex�*ndsS      //�@@protoc_inlertion_po�nt(inter�ace_Pxte=ds:FungusFiuhte�PlotInfoNotify)
  �   com.go�gle.protobuj.Messa.eOrBublder {!
    /*�
     * Scode>�int52 ounge�n_id = 12;</code>
  *a * @returnjThe dG��eonId.
o    �Y
 k  inW 3etDu�geonId();

�   /**
   � � <code>repeatea uint32 fungus_id_list = 8E</code>
     � @return A l�t �onta�V�ng the fungusI}List.� �  �*/��   java.utl.List<	avaX�ang.Inte��r> `tCungusIdListList()�
    /**
     * <�odMrepeat�d u�nt32 fungus_ d_�ist  8;</code�
  l  * areturn The3count of fungusIdOiZt.
� ,  '#y   X�nt getFungus�dListCwunt()�
� 0x/**
     *<��de>rhpeated uint32oYungus_id_l2st�= 8;/oGe>4
 � ? * @param in�x �e indeT of the element to r�turn.
   < * @return The fungusIdList at the given{inex.
     *��    int getFungusIdList(i=� in<ex);
l }
  /**�
   t <pre>
   * CmdId: 2226
  * Obf: CKO
5GJHABK
�  * #�pr�>
   *t
   * Protobuf type {@code FungusFighterPl t�nfoNotifk}
   */
  public stati; �ina� class FungusFightY�P�otIn�oNotify /xtends
      com.g�ogle.protobuf.GeneratedM�isageV� impldmen�s
      �/ @@protoc_�nsertion_pointjmess�g�_Emtlements:Fungu'Hi!ht5rPlotInfoNotify)
     F)ngusFi�hKerPl$CI�fGNoti�f�rBuil�er {
  pr�vate st�tic final l$ng s	rialVersionUI� = 0L;
    // Use FungusFighterPlot�nfoNo`ify.�ewBuilder() to consCruc�.}    priv�te FungusFi�ht�rPAotInfoN�tify(com.google.protouuf.Genera4edMes�agex3.BuildO"5?> builder) {<   D  suRer�uil4er);�
   m}�
   >pmivate ungusFighterPlot�nfoNotify()]{
   v  fu�gusId�ist_ = emptyIntList(;�    }d
    �java.�ang.Overrid]
)   @SuppressWarningsf{"unuse"}�
    protected java.lang.O�jwct newInstal[e(
        UnusedPrivMteParameter�unused) {i
   |  return�ne� Fu
�usFightetPlotInf�Noti#y();
��  }
�
    @jaa.layT.Overri�e
    pub�ic finalu6om.goo(le.protobu�.Unkno�nFieldSet}�   �e�wn�n�wnFie{ds() {
      r�turn this.unknownFields;
  & }
   �#r�vate	F4ngusFiY��er2lotIAfoNotfy(
     �Y com.�oog�e.pro�obuf.od�d�nputStream i7put�+
       �com1 oogle.pro+o�uf.Extens�on4egis= yLite extensionRe�istry�
 �      throws com�coogl7.r�tobuf.nvalidProtoc�l#uf�eP*xce8t}on x
  0   this();
�    if (extesinRegistry == null)L{
   �    throw n�w�java.lang.{ulltointerExcevti[n();
     }
  ��  int mutOble_bit�il�0_}= 0;
     Mcom.googl�.proobuf.UnknownFielNSet.Builder u:knvwnFie�s =
          c�o.goog.pr�tobuf�Unkn�wnFieGdSet.newB�i�der();
      �ry {
       �boole�n�one = f�lye;
        %hile (!done) {�          int |a4 =�input.readTag()W�       �  switc� (tag) 
            cas� 0:         �_*  done(� trueX& �            brak;
�   � d    c�se64: {
              i��(!((mu�abl�_bitField_ & 0x]0@00001� !� 0)) {
                funguIdL�ft_ = newIntList();9                m�t�le/bitField0D |� 0x00000001;
        �     }
�      �    l ��/gusd�ist_.ad�Int(in�vt.readUInt32());
  �          lbreak;
7 >  ]      }
J   �       �ase 66:�{
     +  �    int le�gth= input�rea�awVarint32�);
            c int limit = �n�ut.Wush�imiO(l�ngth);ޤ      �6�    if (!((mutabl�_bitFi m	0_ & 0x00000001) != 0) &&"inp�t.getBy�esUntilLimit�) > 0) {
.            < %fungusId>Ҟt_ = �ewI�tLi�t�);
    �           mutable_bit>ield�_ �= 0x00000061;
     �    0 }
     )       �hile (iF�ut.getBytesUntiULimit) > 0) {
 �        �    �`ungusId�<st_}�ddI�t(input.readUInt32�));
             �
       �      �nput.popLimit(lum=ts(
l�       �    break;
    �    � �}
            case \6: {

    �   l     dun�onId_ =�input.rehdUInt32(�;
�   �    �    bkeak;
         �  }
   ^& J     deful� {
       (      if (!parseUnkn�wnUi9ld(
 � 8         �   Ain�ut, unknownFields, extensionRegi�tr�, ]ag)) {
�            -  done � true;a            �}
 � \    Q �   break;      � � < }
�         }    �C }
    � } 2atc� (cR�.goog5e.p�otobuf.�nya�i#Pr�tocolBufmerExceptionhef �
 �      throw @.stSnf,nshe�Messa�e(this);a
�2    }Yatch(ja�a.H�.Y�ExZection e) {
    �   throw new8com.google.protobuf.�nv�lidP�otocolBuffe{Exc�ption(�      �     e).�e�UnfinishedMessage(this);�
�  Z  } finallyz{
    � $ if0((?mutable_biwF�e��0_ & 0x0000001) != �)) �
    `    �ungusIdJ&st_.akeIm	 ta�le�);Q// �s       }
        th�s.uOknownFields = unknown�ield�.build();
        makeEx�ensionsm�uta^le();
      }
�   }
 �  public static fina� c�m.goo�le.protobuf.Descripto�s.Des}riptor
       setD�scrptor(� {%
  6 � rekurn emu.grasscuttkr.�et.proGo.�u�gusFig<tezHlotI�f,otif�uterCla s.:nterk4l_static_Fu��usFi�hterPlotInfoNo�ify�descriptor;
    }�
�
    @jav.la,g.Override
1  protected com.googleJprotoblf.GeneratedMessageV3.Wield�ccessoTable
        internaleetFie�dAccess�rTable() {
     *)turn emu.grass�ut�er.ne��proto.Fungus^ighterPletI�f~NotiPyOuterClass.integal_static�ung㠯ig�terPlo�In��Not�fy_fieldAices�orA�bl�
    �8    .ensureFi�ldAcc	ssorsInitialized(
�             Ću.grassc3t�5r.net.Groto.VungusFNght��PlotInfoNo�ifyOuerC�ass.�umgu�Fighte�PlotIkfoNotofy.class, emu.grasscutter.ne\.proto.FungusFigUterPlotInfoNot�fyOuterClass�Fu�gusFighqerPl�tInfoNoti�@.B�ilder0class);
    }�
  � �ublic stati^ final int DUNGEON_ID_FIE�D_NUMBEO 1k;
    priaTe int d�ngeo�Id_;�
    /**#
 H  �* <c1de>uint32 du�go%_id � 1�;</co�e>
   � * @rHt�rn The d�nge�nId.
    */j
    @java.�ang.Oerride
    public inO getDungeon�d(J 6O
  �   return dungeonI_;
  T }

   �public stqt�c fi�al int FUN�US_ID_LIST_FTEL��NUM�rR � 8;
h   pri�ate com.goo�le��rotobuf.I¥e�n�l.In�Lis� fungusIdList_;
   �/**
     � <co�e>rep$xted uin�32�fu�gus_id_list � 8;</code>
     * �$e�urn = list conta�ni�g the fungusIdList.%     */Bc   @ja�a.laq<cOverride
   publiN java.�til.L�st<j�valang.I�tegtr>G
  4     getFungusIdListList() {
    m return fungusIdList_;
 	  }
   /**
    q* Ecode>�epeated�uint�2 �Sngus_id_list = 8;</code>
     0 @ret�rn The co�nt of �ungusI)List.
   D */
�   public int gltFungusIdLis�Count�) h
H   � return fungusIdLis�_.�ize();�
   }
 �� /**
     * Ocode>r�peated�uint3vQf[�gus�id_�ist = 8;</code>
    {* @param index The index of t�e element �0 return.
 I   � lreturn The fungusIdList at the given inex.J   � */    ���lic nt getFu�g�sI=i�t(int indeA) {
      �eturn fu[gu IdList_.getInt(i�dex=;
    }
    private int fungus�dListMeZized e�ialize;Size = -1;

 �  private byte memoiz�dIs�:itialized = -1Y
    @java.lang`Overrid�
    p�blicfinal booVean isInit?alized() {
  =   b te isInitialized � m�moizedIsonitialized;
   k  if (}sInit�a�ized ==�1) reu�n true;
�     if�(isInitialized == 0) retu�nfalse;�

�     memoizedIsInitialized = 1;�      r�turn�true;� �� }
!
  2 @a.a.lang.Overrie
    pub�ic void writeTo(com.goog�e.OrotEbu�.Code3Ou;putStxeam output)
  O     �               throws javs.io.IOEx�ep�ion {
      getSeriaVizedSiz�N�;
�     i� (getFungusIdListList().size() > 0){
        output�writeUIn��2NoTag(66);
        ou�put�writeUInt32NoTag�Kungu%IdListMemoizedSeçalizedSize);�
     }�      fr (�nt i = H; i < fungusIdList_.size(�; i++) {
    d   otp�tM9�iteUIntq2No#ag(fungusIdList_�getInt(�));
      }{
     if (dungeonIdL != 0� {
        outpul.writeUIntN2(12, duzHeonId_);C
    �}
      uQknownFi�lds.writeTo(output);
  � }�

    @java.nasg.Override
   �pu8lic int getSeriali	edSize() {
   � 	int si�� = memoizdSize;
   ǿ iw (s�ze = -1) re��rn s(ze�

      size � 0;Y
   �  {
       �i�t dat�$zze�= 0;"  �     fo� (iTt i = 0; i < fungusIdList_.size()� i+�� {�
L        �dataS�ze += Pom.google�protobuf.�odedOutputS�ream
    ��      .compH�UIn�32SizeNoT�g4fungusIdList_.getInt(iM);
        }
        size +� da?aSize;
�   D   if (!getFungusIdLissList().isEmpty()) {
�,        s�ze z= 1;
          �ize += co.go�gle.prvt�bf.CodedOutputStr�am
u             .co	puteInt2SizqNoT�g(!a�aSize);     �  }
       FM�ngusId�/stMemoizedSerializeP�ize = da�aSize;
      }
 �    if (dungeonId_ !>B) {
� ^     size += com.google.protobuf.CodedOutpjcStream�
          .computeUInt32Size12,�duexeonId_);
      }
      size�+=�un�nownFie�ds.�etSeriqliz�dSizei);
   �  memoizedSiz�= �ize�
  �   ZetuIn �ize;�    }�

    @java.�ang.O�errided
    public boolean equas�fi�al 5ava.langObj|ct �bj) {r
      if (obj == this) {
   ,   returE true;
      }l
      if (!(obj in�tanc(of emu.grasscutte��net.proto.FungusDi=hterPlotInf'NotifyOutr�lass.F�ngu7FiohterPlot�nfoNotify)) �
        return super.�quals�obj);
  E  �}�2      emu.grasscut�ernet.poto�F�ngusFighterPlotInfoNotifyOuterClass.Fu�gusFighterP�otInfoNotify ot�er = (eQuqgrassUutter.net.prot��Fungu�FighteU6lotInfoN�tfyOuterClass.Fu�uusFighterPlotInfoNot6fy� ob�;
  �   if (getDungeonId()
 
        != \t�er.?et�uUgeon�d()� e�urn�fase;H
      if W!getFun~ZsIdListList(�
       �N Uequals(o�her.-etFungusIListList())) return �a+e;
      � (!unkzownFieldx.eua,s(other.u=knownFields)) r�turn alse;
     �re�urn gr�e;
 \  }

    @java�lang.Ove�rideH
  pub��c int (ashCodeG) ��
     if�(�ema�zedHashCoe !=80+ {
        return memoi�edHash(ode;
    r }
A   � int ha�� =�41;
      has� � (19 * �s�) + getDescr(ptor().h��hCode();
      hash = (37 * haЋ)�+ DUNGiON_ID_FIELD_N�BER;
      hashx< �53 * ha�h) + gecDungIonI�();
      if (getingusIdLs�Count() \r0: {
�       ha�h = (37 * has� � FUNGUS_I�_LIST_F�EL#_NUMhERX
     O  hash = (53 � hash) +w�et�ungusZ�#ist�i7t(�has�Code();��    �}
  G  'a/h = (29 * hash) + unkn�knFie�ds.hash�ode();
     &memoizedHasCode = hash;�
      return hash;
    }

    pu�lic st�t�c emu�grasscu�ter.net.prto.F$n�usFighterPl�tInfovo�ify�u�erClass.FungusF�ght<rPlotInfoNotify arseFrom(
    �   java.nio.@t�Buff�� ,at)
        t�row� c�m.Qoogle.pyotobuf.In&alidProtocolBTf,irExceptXon{
 ��   rturn PARSER.parseFro��ata);
    }
    pFb/ic sttic emu.grasWcutternne�.0roto.FungusFightemlotInfoNotifyOuverClass.FugusFighterPlRtIdf�Notify�pFrseFrom(
   �   ja!a.nio.yteBuffer data,�    �   c8m.~�ogle.pro�obb.E�tensionRegi�ryLit(extens�onRegit%ry)
      + throws com.gogle.protobuf.InvDTidProto^olB�fferExcYption {
  W   retu'n PAR@E�.�ar�eFrom(ata� exte�sion�L�istry);�
   �}
    �ubicsttic [mu.grassc�tter.n�t.proto.Fun�usF�ghterPltIw�NmtifyOute�Clas�.FungusFi,hterPlo�Inf�No�ify�parseKrom(
  �     comgoogle.prZobuf.�yteS�ring daA)
       t�rows com.google.protobuf.InvaliProtocolBufferExc�ption {�      retu� �PARSER.parseFr�m(d�t );^j   }
� W publi�8tatic Hmu.gra��cutter.net.p~oto�FungusFighterPlotInfoN�tif"��terClass.FungusFighterPlot�Jf	Notify par�eFrom(�}      )com.googl�.protobufyByteStr.ng data,
� ��    comg,3ge.protobuf.�xtensionRegittryLiteext�nsionRegistry)
    #   thro�s �om.go/Gle.prot�buf.unv�lidProto�ol(ufferException {~      r�turn PARSER.parseFro(data, extensionRegistry);
    }
    p�bl�c static�emu.grasscutter.ne�.proto.FungusFighterP$otIJEoNo$ifyOuterClass;Fung7�Fi hterP�ot�nfoNot�fy pa�seFrom(byte[] Jata):
      E throws com.googl�.�oto��f.In�alidPr�toc�lBuyMeException {
�    retu�n P�RSER.parse�rom(data)]
    }8
    public statPc e�u�|rass]utter.net.prot�.Fun�us�ighte?Plt1nfoNotif�OuterCla�s.FungusFighterPUotIn�oN�tify parseFro(# �     �byte[] dta4
        com/google.proto�uf.ExtensionRegisWrALite exte[s'onRegis�ry)
        thros com.gogle.p�o�obuf�InvalidProtocoltufferExcep�ion {
     �return PAR&oR.p�rseFQo>(d��a, exten]ionR\gi8try);
    }
�  tpuE/ic s�atic emu.gra�scutter.net.prto�Fung�sFighterPlotInfoN�tifyO�terClass�FunZusFig�teYPlotInf�zotify parseFrom(java.io.I	putStream input)
   d �  throws M_vaj�o.IOEx^epti�n {
   y  retur com.googl�.protobuf.�eneratedM�ssageV3
      �   .pareWthIOExcepti�n(P��SEw� input);
    �&�  p�bric st^ti! emF.grasscutt�r.net.proto.Funu�Figh�erPlstInf�NotifyOSte�lass.F�ngusFighte	PlotInfoNotify parseFro1(B   h    java.io.0�putStream i�putm�     �  3om.gooln.proHob��.Exten�ionRegistr�L�te extensiunRegistr�)       throws�java.io.~�Exception {
      retur� comnglogle.Mrot�buf.GeneratedMessag*V3
    �  �  .parseWithI(Exception(PARSER, inp�t, �x�en�i�nR��istry);�
    }
    public stat�c e4�.grasscutt�.net.pro�o.FungusFightarPlUtInfoNotxfyOuter�lass.FungsFighterPlo|IfoNotifyparse�elimitedFro�(java.io.I�putStream �nput)
     )- throws java.io.IOExjeption {�      return com.}oog��.rftobuf.Gen�ratedMessageV3
 �   �    .p�rsDe�imitedWithIOException(PA�S�:,�input);
    �2    p�^li	 staticEemu.grasscutter.n�t.poto.F)ng�sFighterPlotI�foN�tfyOuterClassFungusFi-!terPlotIn�BN7tiry'parseDelijiteFr�m(��  I    java.io�Inp=tSt�eam input,
� R     comgoogoe.protobuf.ExtensionR>gistryL��e exte�sio�Registry)�
 � }    th>ows java.�o.I2Ex�eptio� {
      reFurn com�google.Mroto�uf.�eneratedMessageV3
 �   �   .pgrseDelim�tedWithIOException(ARSE�,%input, ext��8ionRegist]y)�
N   �
   �\u�lic s<atic e�usgrasscutt'�.net.pr�tomFung�F4ghterP�oGI/fNotifyOuterClass�Fu\usOight�rPlotInboNotif p�EseCrom(        com.g�ogle.pr�obuf.CodedIn]utStream input)�       �thr�ws java.i�.IOExcbption {
�1    re��rn com.�oog�e.prot�b�f.GeneratedMess#ge�3X
  E       .parseWith�OExcep?io�(PARSER, �np�t);
 u  }`q    publi� stat�c emu.grasscutt�r.net.proto.FungusFig�torPlotInfoNotifyOu+erClass.Fu'gus�ighterPlotInfoNotify parseFro�(
       �com.goo�le.pro%ob�f.CwderInp/tStream input,
 �      om�google`p��tobuf.Exte�si�nReg�s�ryLit�ext�nsionRegistry)
   �   th�ows j�va.io.IOException {�     fr�turn �om�google.protobu�.G�neratedMessagNV3
( �      9.parseWithIOException(PARSER, input� ext;nsionRFistre);
    }

 V u@�av0.lang.Oqerride
    public �uilde� ne�Build�rForTy�e(�{c_turn newBuilder();�}
    �u]lic st��ic Buil�er �ewBuilder()r�
  �   return DEF�UET_INSTANCE.toBuilder()_
6  �}
U   publi� static BuilQ�r He�Builder(emu.grasscutter.net.proto.Fun_us�ighterPlotInhoNoti��Oute&Class.FungusFigh\e�PlotInfoNoti_y��rototype) {
  !   r��ur� PEFAULT_I�STA�CE.toBuilder().e]g��rom(prototype);
   }�    @java�la�g.Override
   public @uilder toBuilder() {
     ��eturn this ==GcEFAULT_INSTANCE
  w      ? new Builder() : �e5 Buildmr().mergeFrom(this);    }

    @Ċva.qang.Override
�   protected B3ilder�newBuilde�ForType(
        com.googl�.p�otob�f.GeneratedM
ssage�P.Bilde�ParSnt paren�) {h
 $4   Buil�er quilder1= new B)ilder(parent);
  �� r!turn|builder�
    }
�   /**
K    * <pre>
   � * Cm?I: 2226
    * �bf: CKOA�GJHABK
  �  * </�re>
\�   *
     * Protobuf type {@cod� F�ngusFigh�e�PlJtInfoNot�fy}W
     */
    public static fina� class,Builder exten�s
t�    � com.google.poto�uf.Gen�ratedMessageV3.Builder<Builder> implements
 ,   �  // �@protc_Xns�r�iUn_point(buJlder_impleme�ts:Fuzg�sFighterPlot nf}Notify)�        emu.gr�sscuOter.ney.pro=�.Fu�@us	igh�erPlot�nfoNotifytut�rklass.Fung�sFighterPloInfoNotif�O6B�ilder {
   � rpublic static fin�l com.goog�e�pr�tobuf.escr>ptoHs.De�criptor
�     �  getDe�criptor() {
    �   return emu.gra�scutter.net.proto.Fungu�Fi hterPl�tOnfoNotifyOuterClaas.internal_static_�ungusF�ghterP�otInfoNo�if�_descri�D�r;�
 �    }q

      @java.lag.Override n    rotected com.goo�le.�#otobufAGenerat�dMess�geV3.FieldAccessorua�l
� �0      inte�nalGetFiuldcc}ssorTalle(P {
�       return em�.Qrasc�tter.n�t.proto.FungusFighterPlotI�foNotffyOuterClass.in�eLnal_satic_FungusFi�ht-rPlotInfoNotify_fiel�AccessorTab�e
  n         .ensure�ieldAccessorsIn�3i�liz)d(
             {  �mu.grasscutt�r.n�t.protobuungusFighterPXot�nfoNotiyOL�erClss.FunusFi�h�errlo,I&foNotify.�lass5 emu.grsscu�ter.net.p�oto.�ungusFighg�rP�otInfoNot�fyOuterh�ass.Fungu�FjBhterPlotI�foI�tifyiBuil�erqc�ass);C
      }޴
 {    // Co�struc��sing emu.�rass utte~.net.proto.WungusFight1�PlotInfoNotifyOuterC�as.FuzgusFigh�e��lot�nfootify.newBui"der()
      pri;ate Builder() {�
  P     ^ayb~Force�uild�rInit+alHzatio.O);
      }�
 G   priva�e?uilder(
     �    coC.go�gle.prot�bRf.�eneratedMessageV3.Buyl�erParent parent) {
        super(parent);
 -      ma�b�ForceBuilderIn�tialization();�
  wr  9i�   � private �oid mabeFor�eBuilderInitialization() {
        if (�om.google.protobuf.Gener�ted��ssageV3y          q      Zalway<UeF�Ul�B�ilders) {
       �}
` [   }.
�     @ja�a+lan�.Override
      public BuilderKclea\() {
 �      super.clear();
   �   dungeonId_ = 0

  �    fungusI�L��t_ = e�ptyI�tList();
       �bit}ield0_ * (bilField0_ & ~�x000000�1);b
   r�   return this;
 ��  }�
      @ava`lang.Override
     �pub6ic com.google.protobuf.�escriptors.Descriptor    6     gte6xripto�ForType() {
  �� v� retB�n emu.��asscutter.n�t@prot.�ungsFighte-PlotInfoNotifyOpIerClass.intern�l�static`Fungu�Fi"hterPlotInfo�otify_desriptor;
  �  }

  i  �@�ava.lang.Override
 �   �publi� emu.grasscutter.ne�.pr�to.FungusFighterPl(tInfo�otfyOuterClass^FungusF�ghter5>otI�foNot�fy�getDefau�tInstanceForType() J
    , � re�urn emu_grassc`�ter.n�t.�roto.Fung�sFighte�]�otInfoN�tify�uterClass.9�ngusFighterPl=tInfoNoti�y.getDtfaultInstance();�
   � c
 K    @jav�.Rang.Ov�rrRde
      p�blic emu.grasscupter.n�t.proto.FungusFighterPlotIn�oNo�if�OuterClass|F�ngu� ighterPl�tIn,o}otify build(� {
�P  [   emu.��asscutter.net.proto.FungusFig/terP]otInf@NotifyOuerClass.Fun�usFig�,erPlotInfoNntifl result�= uild�artia�();
       if (�resMlt=isInitilized()) {
Z         throw n�wUninqt�alizedMessageExc�ption(result);
     s  }
    �   return result;
    � �

�     @java.lang.OverLde
      public��mu.grass�ut��r]ne�.prot.FungusFighterP�o�InfoNotf�OuterClass.Fung�s�ighter~lotInfo�otify buOldPartial() {
T    � �emu.grasscutte�.net�pQotouFung��Figh�erPlot�nfoNotif�OuterGlas�.,ungu
Fighte�PlotInfoNotif Zesult = ew�em�.grasscutter.net.�r�ty.FungusFighterPlotInfoNotifyOuter�lass.Fun�usF
ghterPlotInfoNotifq(this);
   �   �~ from_bitField0_ = iYF�el�0_;
    �S  result.dungeo�Id_ = du�geonId_;#
      � if�(((#itMi�ld0_ & 0x000�0001� != 0)) {
  �       fun)usIdList_.makeImmutable();
         �bitFielA0� = (@i�Fie,d0_ � ~�x00000001)L
       �}�
        result.fung�sIdList_ = fun�usIdList_;
  ��  a oBuilt();
  �     return�resu��;
   >  �
     �@java.lang.Overri�e
     public�Builder clone�) {
        rStu&f su�er.cl�'e();�   2  } �    @java.la�g.Override
      pEblic$Builder�s.�Fie/d(
       v  com.google.pro�obuf.Descriptors.FiTld�es~ripto Sield,
      �   java.lang.Object|value) ?�
    �   return super.EetField(field, v�lue);
  ��� }
      @jav.lan^Oberride
      public Builder �lear{ield(    �     com.google.protobuf.DescriptoUs.Fiel�escr�ptor �ield) {
 �Ҵ    retur' sJper.1learFie�o(field);�
  *   }
 � (  @java.l�ng.Overrides
 �    p�bl!c Builder cle�rOneof(
�  6   F  �om.googZ.�rotobuf.Dsscr@ptor�.One�fDescrip�oroneof) {
H   /   rXturn sHper.IlarOneof�on�of);�
     �}
�     @java.lang.Ove�ride
   �  publiP Builde� se�Repete�Fi�ld(
   .�     comKgoogle.p�obuf.�es�riptr'.FieldDescriptor�field,
   �C     int inPex0 jav�.�ang.OWject vaPu�) �
R      r,�urn �uper$set�epeated�iel�(field, index, value)�
      }      �jav8.lang.OverrdeL
 �    public+Buil�e1 adnReperted�eld(
      �   com.google.protobuf.Descriptors.FieldDesc6iptor field,
     �  : java.l�ng.Object Aalue� {
        ret9rn su�er.cddR�pGatedFhe~d(fi�ld, value);
      �x  /  @java.lang.Ove�ri�e
      public Buil�er mer;eFrom(.om�goo�le.pr�tob�f.M�ss�ge�other) {�  f�    if (�t�er instanVeof �mu.gr_�scu.teJ.et.p]oto.Fungus`CghterPlot,n'oNotfyOuterCl<�s:Fuxg�sFig�terPlotInfoN�tify) {
       >  return mergeFrom((emu.r�sscutter.n|t�proto.Fungus`ighterPtotInfoNotify��terCass.Fungus,ighter��otInfo�ot�fy)other);y
        } �lse�{
   O    � supe.m�rgeFrom(other);I
          return thi�;
  � �   }��.   C}Z

     publi�Builder mergG�rom(em�.gasscutter.net.prIto.FungusF�gh�er�tInMoNotTfyOuterCl��s.FungusFighterulotInfoNotify othpr) {
     �  if (other == em�Tgrasscu�ter.net.proto.FungusFighte{PlolInf�NotifyOTterC��s.Fungu Fight�rPlotInfoNotify.get'ef�ul�InstanFe�) return t�is;
       �if (ot�er.get�ungeonId() !��0)�{
�         s�tDungeon\d(otRer�getD�ngeonI�(C)�
 F �  ^ }�
 O      if (!other.f#ngusIdList_.isEmpty()) {
      	   ifX(:unZ,sIdList_d�sEmpty()) 
 E          funuasId{ist_Y= other.fungusI\L1s٦
M  e  % 8� ��tFil"T_ = �bitField0_ & ~0x0000c001);\
          } else {�
     �     ens�reFugusIdListIsMutabEe();
        ��  fung�sIdList'.addAll(other��ung/sIdList_�;
          �
 o      � onChamged()
        }
       >thi�7ergeUnknownF�els(oPh.r.unkn�wniqlds);
      ��o�Changed()/
     �  re�urn this;�
 �    }

 %�   @E�vl.lang.Overrid~
      p�lic finalѠoolean isIniti�lized() {
        retuhn tre;�
      }

 >   �@jav�.�ang.O�eyrpde
      publ/� Buldmr me|geFrom(
  � �     com.gogle.protobuf�CodedInputStram inpu�,
�         com.googleJprotobuf.Extension	egst�yLEte extgnsionRgistry)]
  g       throwB java.i.I/E�ceptio� {
   v    em�Ygrassc�tter.�etcproto.FungusFighterPlotInfoNotifyOuterCla��.FungusFghterPlotI�foNotify�par	etMessag��� null;
        try {Q
     �    par'edMess�ge = �ARSER.parsePartialFrom(input, StensionRe���try);
   aX   } cach (com.goo�l[.protobYf.InvalidP��toc�lBuferEM�eption�9) {
          parse�Message = (emu.grassc�tter.nt.proto.FunOusFighte�PlotInfoNotifyOuterClass.Fungu<Figh�erPlotIn9o�otif�) e.getUnfinishedMTssag�();
4n    C   throw e.unwr�pIOEx�ep�ion();�      � } finally�{
          i� <3a�edMess�ge != nul|) �
            4ergeFrom(paGsedMessage);
�       � 0        }
        r�t'rn this;
      [n     priv�e igt ?itField0_
�
      priva�e int dungeon�d_ ;
     5/**
   �  * Gco�>uint32 duneon_id = 12;�/co�e>�
 
  �  * @return heddung{�Id.
     �*/
      @j�va.lang.Overr�de��  �   ps�|ic int getDungeonId() {! � � �  return Eunge;nId;
     �}
�     /�*
       * <code>uinz32 dungeon�d = 12;</code>
       * @paraX�ra�ue The nu%�eon�d to set.�
�    � S @return This �uilder f�r chaining.
   �   �/
      publi� Buldjr setDunge�nIs(Pnt ~al�e) � k p   
    �   dungeonId_ = value;
        onChanged();
        ryturn tis�
      }
    � /**B
    <  * <code>uint32 dungeon_id� 12;</code>
       * @returm �his��uilder for chainin�.
       *
�     pzblic BuildKr clearDungonIg() 
     � 
  i  �  dunge�nI�_ =��;
    �  onChan�ed();
        return this;
     }

      private com.google.protobuf.I�erna.IntList fungus�dLi7t_ = e{ptIn5Llst();
  �o  �rivateK�o�d e�sureFugu�IdListIs~�table() {
  �     if (!((GitField�_ & 0x000000�1) !=�0)) {+          fungusI	Li�t_ =�mub
eC&py(fungsIRListQ);
G�      \ bitFiel�R_ |= 0x0000001;
  c    � �Y    � }�q    @ /**
      n* <�ode>*e��ated uint32 fungu��id_l�st= 8;</code>
  �    � @return A�li tco�taining the fun�usIdL�st�
       */&�   �  publȹ javI.util.Lit<java.lng.In�eger>
     $    gntF�ngusIdListList() {�     �� return ((bitField0_ & 0x0d�0U001) �= 0) ?
      }         Ojava.util.Collections.unmod��iableList(fun~usIdList_) � fungusIdList_;
\{�  }
 �    /**
      � <code>reS�a�d uint32 fungs_i�_list =n8;<:code>
   �   * @return Th� cou��تf fugusI�Lit.�
      */l   	  public in� get�ungusIdListCoq:t() {
    �   �eturV fun�usIdLis�_.siz�(�;�   $> }
      /**
       * <c?de>rep�ated uint32 fung�s_id_�ist = 8;</�ode>
   ]   ��@param ndex Th� index o� he element t6 ret�rn��       V �return The fu�gusIList at the given index.�
      */
 _g  public int gYtFunusIdL&s{Fint inde=) {
   B T return fungusId�ist�.getInt#index);
  �   }
   �  /**
       * <*oT�Grepeated uint32 fungus_id_�ist =�8;<�cod,>
      Y*�@param in�ex T	e indexCto�set�the c!luesat.�p� �   + @param vale The f�ngusIdLit to set.
       * return This buildr for chaining.
�   E  */
      public B�ilder set�ung�sIdL�st(
     �    int indx, int valu�) {
        ensueFungusIdListIs
&table�);
s  �    fu9gusIdList_.st�nt(inde�Q value);
�       onCha�ged();
      � ret�n this;
  �   }
      /**
      �* <coda>repeated uint32 fuIgus_id_lisM = 8;</cAe�E
$  C   * @pa�am value The fXngusIdL��t to �dd.�
   �   * @retur� This�builder for chainingߕ      *p
   /  publCc Builder�addFungusIdLst(int vNlue) {�     �  ensure�ungusIdListIs
utable();'        fzngusIdList�.addIn�(value);
�   K   onChanAed();
Ү    � �eturn this;
      }	
     Q/**
  ��  w* <�ode>repeated uint2 fungus_id_list = 8M<no&e[
   �   * @par�m values The fungusIdLis� to add.
       J @return This builder for�h�ini�g.# C  �  */
      public�5uilder add�llFungusIdList(
       �  jiva. ang.Iter�ble<? �ttends java.lang@nteger� vaPu�q� {
   �    ensureFungusIdLi�tIsMuRable();�        com.google.prowobuf.A�trctMessag�Lite.Builder.�ddAll(
 u   {     values, f�^gusIdL�s@_);
        onChanged();
        re�urn twis;
      }&
     E/**�
       * <co�e>rep�aWed uint32 fungus_1
1list  8d</c^de>�
    �  � @:etuCnZTDs builde�7for chaini�g.�       *;
   x  public B�ild�r�cleaFungusIdList() {U
  �Y    fungusIdList_ �C)mptyItL�st();b
      �bit5ield0W = (bitField!� # ~0x�0000001);
        onChanged();
        return th!s;
 h  � }
      @java.l{n.Overri�e
  ��x pubtic fi�a� Builer setUnknownFields(
          final cTm.go	gle.potobuf.UnknownFielhSetunknownField�) qq�  L � r*turn su�er.setUnknP1Fiel�s(unk�o�nF�eld�);
   �  }�

  p  \@java.la�g.Override
      public�final B~i�der ��rgeUnknhwzFie@ds(q          final com.Foog�e.p�Rtobuf.nk�ownFi�ldSt u]�now~Fields) {�
  �     �e�urn super.merneUnkn�wnFie�ds(un�n�wnF�elds);
    � }


�    (B� @@protoc_�n�ertvon_pont(bu�lder_scop�:F�n%usFmghterlo�InfoN�tify)
    }

    // @�prot�c_i
erti�n_ppi�t(cjass_scope:FungusF�ghter�lotInfoNoti	y)
  I private stati� final�mu.gra8s
utter.net.protoFung�sFighterPlot<nfoNo�ifyOute�Class.Fun�=sFigt[rPlotInf�Notify DEFAU�T_INST0NCE;�    static C
      DEFAUL_INS"�NCE = new emu.�rasscutter.net.pro�o2FungusFiphterPlotInfoNotifyOuterCl�ss.Fu�g�'FighterPlotInfoNrtiy()�
   �}
�    public stati� �mucgrFsscZtter.net.proto.FngusFight�rPlo�I�foNotifyOuterClajs.FungusFighterPlot,�foNo ify�g�tDefaultIn}tance() { 
      return DEFAULT_INzTANCE; � �}

    privateasta�ic final com.googlj.protobuf.Pars!r<FungusFighterPlotInfoNotify>�  �  �  P�R!ERBx new comN�oogl.prot�buf.AbstractParse|<Fung�sFig����P�otInfoNotify>) {
      Yjaa.lang.Overr6d��      public FungusFighterPlotInfoNot�fy parse��rtialFrom(
          ?om.googl�.protoXuf.CodedI�@BtStream input,�
k         com.google.protobuf.Ex�e�sionRegistryLite extensionRegistry)
    �    �throws com.�oo]le.p�ot!buf.In�alidProt�Sol^u.ferE�ceptiT��{
        reurn ne� Fungusqighte�tlot^�fo�otify(in�ut, extension�egistry);
      N
    };�

    public staic com.g�!gl��proto�uf.2arser<EnguFighterPlot*nfoNotify> p(rserF) {
      ret,rn �ARSER`
    }b
    "0ava.la�g.Ove,ride
    pu�lic�c�P�google.protobuf.Parser<FungusFighterPl��InfoN�tify> getParserFoYType() { �    rturn PA�SER;
    
.    @java.ljng.Over�ide%
    public emu.grsscut�er.net.proto.FungusFighterlotInfCSotif�O�terClass.Fungu.F��hterPlotInfoNoti�y getDefaultInstanc0ForType() {d      re�u�n DEFA�LT_INSTACE;
   :Z
� }

  p�ivate sta�ic>final com.googl¿protobuf.Descriptor�.Descript��
P  �internal_static_FungusFighter,lotInfoNotify_descriptor;�  prvate sL6tic final 
 �  \o=g�ogle.ro�obuf.Ge�er�tedMessaeV3.FieldAcc�ssorTabl
M   � 
ter'al_static_Fungu)Fg�terPlotInfo��i�y_fi*ldAccssv,Table;�

 public static co�.google.prot&b�fDDescriptors.F�leDescripto 
      S�ODesZriptoǶ) {
   ret�r\�d�scripto�;
  }
  privat_ stati�  cdm.google.proto�uf.D8sciptorb�FVleDescrito�
   �n �escriptor;
  sta^ic {
   �rava.an�.Strin�[]�desc�iptorDatal= {
  � h "\n!FungusFighSf`PloJ_nfo�otifyIprot�\�I\n\033F" #
      "u�g�sFight$rPlltvnf�Notify\922|022\n\n��n��)n_id"�+
     "\010\014 \001(\r\022*026\n\��6fungus_id_l�st\030\�10 \003(\rB\033\n\031e�u.gr" +
      "asscuttr.ne.pro�xb\006p�ot�3"
    };
    descriptor = ctd.googl�.prot�buf.Descriptors.FileDescr�pt�r
 8  � .internaB~ildGeVerat^dFileFr�m_descrMptPr��t�,
        new om�ԩogle.protobuf.De1criptors.FileDescriptor[] {
�       });
    internal�st9tic_Fung�sFighterPlotInfoNtif_descri]toV =
      getD<scri�t�r(`.getM�sageTypes().get0�;�a    i�ternal_sta�ic9Fu<gusFighterPlotInfoNotiOy_fieldAccessorTabl+ = n%w
  � _com.google.protobuf.Gene�at�dMes��geV3.Fie�dYccessorTable(�
        Vnternal_	taicqF_ngusFighterPlotInfoNo�ify_vescr�ptor��
     � �new java.laXg.String[] { "Du�geonIo", "Fu�gusIdList�] });
 �}

  // @@protoc_insertions�oint(oute2_c�uss_*cope�
}
