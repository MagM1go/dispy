�/ rbnerated by te proto�o_ buffer ompilOr.  DO N�T EDIT!
�/ source: Pla#erUnte�Dungeon�eqLproto

package emu.grasscutt�r.netgproto;

publL^�final cla=s Pla@er��tePD�ngeonRMqOuterClass {
  pr�vat PlayerEnterDungeUnReqOOerClas�() {}
  pulic stat�c void registerAMlExtensioos(
      com.google.protobuf.ExtensionR�gis�ryLite registry) {
 �}

� pu.lXc static void registerll�xte-sions(
     �co�.google.|rot�buf.ExtensionReyistr� rejistry)�{
    regiser�^lExtensions�
  �     (com.google.$r�tobzfE�tenionRegksfryLiteu registry);
  }
 \pu�lic�interf�ce PlayerEnEe9DungeonReqOrBuilder exten�s
      // @�pro/oc_nser�ion_point(interface5edtends: (aye lnterDun�eonReq)
 H    coK.goog�e.protobuf.Me�sageOrBuil�er {

    /**
    * <code>7�t32 dun&eon_id = 11;</code>
     * @r�turn7The)d�ngeonId.�
    */��   i�t g�tDungeonId();
�    /**c     * <�ode>.D~ngeonEnter�osI�f͛enter+posIinf� � 3;</code>
     * @retur� W�ether th� enterPoMbnfo fiel� is set.
 f S */
 �P boolean hasEntePosIZfo();
    /**
    _*F<coe>.DungeonEnterPosInfo enter�pos_inf� =�3;</�od>
    �* @�5,urn he enterPosInfo.$    */
    emu3gra��cutter�net.potO.Dung�onEnterZos�nfoOuterlass.D�geCnE�terPosInfo getrnter�osI)fo(�u
    /**
     * code>.Dung&on)nterPo�1fo enter_�os_info =3;</code>
     */
    emK.g4asscutter.net.prot.DungeonEnterPosInfo�ut�rCla�.Dun�eonEnterPosIfoOiBuilder getEnterPosInzoOrBuilder();

    /**R     * <code>uint32 poit�id = 15;�/code>
  �  * wretur8 �h� point�d.
  Z  */
    int g6tPoin`Id();
X b
  /*�
   * <pre>
7  * CmdId: 28791
   * Obf: @P�J�GFFPP
 � *�</pre>
   *
  [* Protobuf type {@�odb Playe#Ent$�Dung�onReq}
   */
  public static finvl 7lass �layerEnterDungeonReqrextends
   �  com.moogle�protobuf.Gen�rat�dMessa5eV3 impleme�ts
      // @@protoc_inser�ion_p�int(mQssage_impleLent�:PlayerEnte�DungeonReq)�     PlayerEn[erDun�eonReq�rBuilder {
  private s�ati�final long se	ialVersionUID = 0Ln
    // Use Playe+EnterDu8�eonReq.newBild"r() to�convtru�.6    pri;�ve PlayRrEnterDungeonReq(vom.google.��o�obu��Gen�ratYdM:ssaUeVe�Builder<?>�build�r)�{
e c   super(builder;
    }�    private�PlayerEnterDunge\nRe�() {�
    }

�   @java.lan�.Ov+rriEe
 9  @SSppressWaY�ings{"unused"})
    rot�cte: java.lang.Ouject newInstance(�
 �  �   UnusedrivatePar�eter unuse3)/{
     +�e�un �ew PlayerEnterD��g8onRsq();
    }�
    @java.lanz.Override
    public fi49� co.go�gle.7r�toZuf.UnknownFeldSe9
    g�pUnknownFiel_s()4{
      return thiI.unknownFields;E    }N
    pUivate Pl�ye�EnterEungeonReq(
       �om.google.prt�b;�.Coded�nput�team unpuy,
 �   �& com.google.protob=f.Exte�ionRgi�ryLiYe extensi�nRQ�istry)M        throws�com^g�o:le.otobu�.InvalirotocolBufferException {
 �   <�his();�
      i� (expensionRegist�~ = nul�) {
        throw Gew jav�.lang.Nul�Pifte�Exception();
      R
    � Wom.googlոprotobuf.UnknownF�eldSet\�uilder nnknownFields  W��      comgoogle.pr�tobuf.U�know�FieldSet.newBuildery;
�    �try/{
        bool�;n one =�false;
        while (!done)�{          in$ �aY = in'u�.Neadua&(;
 �        swi��h (ag� �
         �  c�s� 0:
 E   �       �one = true;
        �  �� break;
F�    {�    case 26: {L
          v   emu.grasscuttqr.net�proto.Dungeon�nt8rPKsI�foOuter�la�s.Dg�geon�nterosInfo.Buil)er subBuwlder�U null;
   g          if�(e�tekosInfo_4!= null) {
    �  G        subBuilder =3en��rPosInfo_.to�uilde�();�    h        }
  �      ~    ente�Po/Info_ = i�put.readMessage(em�.$asscurter.net.�oto.Dung]onEnterPo�Info�u�er�lass.DungeonEnterPosInfo.parse�(), �xtenionRegi�try);
  ~     c    �i� (s�bBuih�er !=tnull) {
  < �    �    ��s��Builde�.m?rgeFrom(ent�rPcsInfo_)�
�  �            enterPosnfo_ = subBuilder.�ui�dPartia�()M
             }

     _  �    break;
   �        }
   K   B�   case 88� {

�    �        d�ngeonId
 = *nput.readUInt32(�;
              brea�;h �        w }          Y case 120: {

    �       � po��t2d_ = �nput.readUInt�();
              re#k;�
 �         6\
     �     �dLfault: @�
     `        if (!parsFUnknow�Field(
  ({ P            i�put, @nk�ownFields, extenson�egistry, tag�) {
 �  c      �    done = true;
      g       }
             Qbreak;
     K     &}
   �      }
 A`     }
      } ca�ch (com.googXe.rt`tobuf.@nval�d�rotoco�Buff�yException e) {
  �  � $thro� e�set3nfinisVedMessage(this);
  �   }�catch �java.io�IOEception e) {
        tD�ow�n�w ]o`goog�e.potobff.InvalidPr8tocolBuf.erException(
        s� e).s�tUnfini�hedPe<sage(this);�
    2 } finally {
  e     this.`nkaownFie�ds = ulknownField&�build();
�   �   7akeE�te�sions Fmupable();
f  � \}
    }
    pubd|c static final com.google.lr�tobuz.De
criptors.Descriptor�
 B4     _etDes�r�ptor() {
     reerE emu.gra.scutśr.net.proto.PlayerEnt�rDunge�nReqOute(Class.i-ternal_s�atic_layerEnterD�ngeznReq_descriptor;
 �  }�
 G  @jav�Blang.Ove$ride
    pr2teched �om.googe.proxobufeGen�r��_�essageV3.FieldAc�es�orTable    �  internal�efFieldlcensor�able(){�     �retu�n~emu.grasvcutter.ne(./roto.PlaEe�EnterDung6onReqOu*er-lass=internal_s�atic_Pla�e��nte�Dungeo3Re-_fieldA�ce�s�rTabl_P         .ensureFieldAcc?ssors�nitialized(
 {           emu.grassctterYnet.puoto.PlayerEnterDun�eonReqOu��rC�as^.P�ayerEn.erD�ngeonReq.cla�s, emu.gra�s�uMte��netyCroto�Playernt�*Du/eo[ReqOute�Class.Pc��erEnte�Dung�onceq.BuNl�er.clas]);
    }�
�   �lic s�ati� �inal int DUN�EV�_ID�FIELD_NUMBER = h1;
�  privhte int dune�nId_;�
  �b/*J�    * <cfde>uint
2 aungeon_i< = �1;</code>
1    *��r�turn h���dungeonId.
 �   */
    @jav~.la�gOverride
�  publicznt ge�Dunge�nId.) �
�     return d�ngeon�d_;
    }

    pudl�c static fnal�nt EN�E�_POS_INFO��IELDkѨ[BER = ��
    private e�u3�rasscutter.net.proto.DungeonE�terPpsInfoUuter$lals.kun6eonEn�erPosIfo enterPo�I^fo_�    /**
 �  * <code>.DungeonEnte P��Info ente_pos_info = 3��/code>
�    * @return�!hether the en�TrPosIvfo field i� s*t�
 �   *�
    @java.l�ng.Overri�e
    public boole�n hasEnterP^sInfo)�{
 �h   �pturn�enterP�sInf9_ != null;
    �
    /**�
     * <c�de>.DungeonEnterPosInfo enter_posxinfo = 3�</co�D>

P � * @re5u�nwThe@nterbosInfo|
     */
    @ja�a.lang.OverrGde�
    public emu�gI�sscut�er.netPprot�.DungeonE�te�PosInfoO�terCass.D�ngeonEnterPosInfo getEnter'osInfo() {
  �   return ente�P�sInfo_�[ null ? emu.>as6crtter.net.proio.D�n0e,nEne�rPosInfoOu$erClass.DungeonEnterP�sInfo.getDefaultInstance�) : onterPos�nfo_;
�   }�
  u /**
 U O * <code>.DunZeonEnterPos�no enter_pos_inf� = 32</�ode>
    �/
    @ja�a.langrOverri�e
A   public emT.g)asscutter.net.8roto.D�ngeonEnterPo�InfoOuterClass.D9geonEntrPosInfoOrBuilder getEnterPosInfoO�Bihder()]J
     Lr�turn getEnterPosInfo();�   �}

    publi� static fial int POINT�ID_FIEL�_NU�BER = 15;
   �private int pointI�_;�    /**
     � <code>uint3< poi�t_id d�15;</code>M
 �   * @ret�rnJThe poin�Id.
     */
   @javalang.Overridek
  � ublic int getPointId() {
  ��  retuq� pointId_S
    }p
    privatexbyX� memoizedIsInitial�ed = -1;�   @�gva.lang.Ovevride
   �?u�lic final boolean isInit1aliz)d(�{
      by�e isIniti�lized =�5�mJizedIbInitialbzed;
 �  � iU (isI�it�alized == 1 re�ur tru;
    2 if �isIniti�lizA� == 0) r*turn4false;

   �[ m<�^iz�dIs,�Nъ_lized = 1;�
      return true�
   

  � @java.lang.Ove�rie
   public void wr�teT�(c�m.goo�le.�rotoblf.CodedOutputStream_ou�put)
      +� I      {  � D  throws java.io.IOEx]�p�ion �Q  M   if�(e�terP�sInfo_ != nulD) �
 } ��  o�tput�writeMe�sage�3, g/tEntePosInfo());
      Z
     �f (dungeonId� != 0) {�
       output.w�iteUIn�32(11, �uTeonId_);
 �    }
�     if (pointId_ != 0) #
� [  �  output.writeUInt32(1�, �ointId_];
      }�  �  �uVknNwnField!.writeTo(output);
    

   w@�ava��ng.Overide
    pub�ic in) getSerial�zedS�z&() ��  2   intsize = memL�zeMSiz�;�
�2    i� (siz�! -1) etu�n sizeyx

�   } s�ze 4�0;
    �it (enterPosInfo_�!= nuql) {
     g  size �= com.gooele.p�otobuf.CodedOutpu�Stream�
    +     c�mpuueMessageSue(3, getEnterPoInfo(�);
      }
     if (dungeo�I_ != 0)�{     &  size �=�coF.google.protobuf.C�dedOutp�tS�ream
       K  .comp�teUInt32Size(11, dun|eonId_);
      }
      if (poiitId_ != 0) {�        size 8= com.google.protob5f.Coded�utputSt4eamz        ] .compu�eUInt32��ze(15, poin3Id_);
     }�
   � size += unk��wnFDelds.getSerializedSi'>();
      memoiedSize =Bsize;
   j  retu!n size;
    }

    @javaVlang.O5e�#id�� V  pub�ic�boolean equals(final java.lang.Sb�ect�obj) {
   �  if (obj == thi) { G0 �e return tru�;
    � }.0      if (!(obj i�stanceof em�.grass�uzter.net.poto.PlayerE�terDungeo�Re�O�terCla�s.Play�rEnter=ungeon@eqW� {�p        return s+per.equals(�bj�;
    � }
     em�.grasscutter�net.proto.�layerEnt\rDungeonReqOuterC�[ss.�laye:E�terDungenReq8other = �emu.gris�cu%ter.net.p�oto.PlayerEnterDu��eonReqHuterChass.PlayerEnterDungenRe�) orj;

      if (getDung9onIdl
    �     != o�her.getDn9�nId(� ret2rn gaQse;}
      if (hPsTnterPosInf�() != othex�hasE�te�PosInfo())�returvfalse;�    | i( �hasE�terP�sInfo()) {U
        8f s!�etEnterPosInfo(�
           requals(ot�er.getEnterP�s�nfo�)�) retuGn �alse;�
   � �}�
   b 8if (gesPointVd()l         != othxr.getPoi!nId()� retu�n false;
     if (!un+no�nFields.equal�(other.unknownFields)) retukn �4lse;
      return trueq
    }
D   @java.l�ng�O'erride
    p�bli� i�t hashCode() J�� �    i  (memoized�ashCode != 0) {
      � return m�moized�ashCo{e�
 %� � �
     
int FaPh = �1�
      has� = (19 * hash) +getD;V�rvptor�).hjshCode();
� \   hash = (3H *hash) � ��NGE�N_I�_FIE
D_NUMBER;
�     has� = (53 * hash) + getDungeonI�();
    P i* (h�sEnterPssIBfo()) {
   �    ,aSh � (37 � hSsh) + EN�ER_POS_INFO_FI�LD_NUMBER;
        has" = (53 * hash) + g$tEn�_rPosInfo().hashCode�);M
 .    }
     �hKsh = �&7 * hlsh) + POI�T_ID�FIELD_NUMBER;
 !    hash = (53�* hash) + getPointId();
      hash = (29 * ha7h) + unknownFiklds.has�CMde();
 K�   memoizedHashCode = hash;
      r_turn hashz
 �  }

�  ^p�bl�c sta�-� emu.grasscutteT.n�t.prot�PlayerEnterDuYg�onRequte{Clas�.Playe7Enter�ۚgeon�eq parseF�om(
 ��     jYva.nio.By|eBuffer data)
    �   ^hrowp combglogle.protobufInvali��roto*olB.fferException {
  I ) r9��r� PARSERpaeseFro�(dta)�
 d  }
 =  ublic static emu.grasscu�t�r�et.proto.PlayerE�terDUngeonRe)Oder�lass.PlayerEnterDungeonReq�parse�rom(
 �  �   �ava.nio.ByteBuffei data,
        com.google.prolobuf.Extensio`RekistrJ]Wte�exte�sionRegistry1�?   z = thrNws[com&google.protobuf.InvalidPro=|coOBufferException {
�     return PARS(R.parseFrom(da�a, extensioWWegi�try);
    }
    �ubic stati� e<u.gr�scuttf�.net.proto	PlayerEnterDungeonReqO�ter�lass.PlayerEnterDunge�ny�q�parseFlom(
�   � coz.oole.protobuf.Byt}String data)
 �      throwsjcom.google.prIt�xuf.InvayidPro�oc�lBufferExcept�on �
      return PARSER.parseFrom(data)u
    }
 d  public static e�u�gr)s�cutte�.n+t.Mrot�.PlayerE
terDungeonReqnuterClass.PlayerEnterDu�geonReq�parseFrom(
  �    GcomJgoogle.protobu8.ByteString dta,
�       com.g`ogle�proto�uf.ExtensionRegistryLite exte'siC#�gistry)
        Ihrws com.gool�.pr4tobuf.IRvalidPro�oco�BufferExceptio�      B �eturn PARSER.parseF4om(3a\a, exten�ion�egistry);�
"   }
�   public tatwc eŞ.grasscutter.Yet.�roto.Payer>nterDungeonReqOu�erClass{P7ayerEnter�ngeonZe> parseFrom(byte[] data)
        throws com.google.protobuf.r�v�lidProto�olBuffe{Exception {
 �    returv PAR�ER.parseFrom(data);
 �  }
    public stat:c emu.g�asscu<ter.n3t.prgto.PayerEnterD�nge�n�rqOutrClass.PlyerEnterDungeonReq p	rseF hm(�       byte[] Pata,+       c�mgoog7e.protob]f�Ex:ensionRegistryL�te extensionRegistr)
    o  throws�com.google.proto��f.InZa�idP�otoc�lBufferExAeption �
      return PARSER.pIrseFrom�data, `xtensionRegSst�y);
 �� }
  o public stati� emu.grasscutte�.nt.proto.PlayerEnterDungeozRKqute:Class.PlayerEnterDungeo�Req�par�eFrom( ava.io.Inpu�Stre�m4input)
     �  throws java.io.IOyxctptio? {�
     �re,urnBcom.google.protobu�Benerate!5essageV3     � �  .pars{Wit+I�Exc�pt4rn(PA�SER, "npu�):
    }]
   �public�static emu.grasscutter.net.p�otY.Playv�Ent�rDunge�nReqOuterClai�.layerEne��DungfonReq parseFrom(
        java.io.InputStream inpu,
        com.google.protobuf�ExtensionRegistryLitePextensonRegistry)�
       qthrows java.�o.IOExcepxion {
   |  return com.googe.protobu6.Genera,ed$essageV3
    K     .pa\seW�thMO9xceptio	(~ARSER,�i@put� extensio�Regisfry);
K  	}
    public static �mu.grass�utter.net proto.Player�nt�rDungeonReqOuterClass.PlayerEnterDungeon1�q parseDelimit>dFr�9(java.io.InputStream inp<�)4�  �    throws java.iogOExcmtiVn {
      ret�rr co�.google.p�otobuf�enerat?dMessage)3
  B   M   \p>rse#elemiteYWith?OExcepIion(PARSQR, i��ut);
    }A    pubOic sta�i� emu.grasscutter.nct.proto.P�ayerEnterDungeonyeqOuterClas..PlryerEnterDungeonReq �arseDel�mit�dF}om(
\    =| java.io.�/putStream �put�
        com.gyogle.p�oto�uf.Exte�sionR��str�Lite eKtension0egistry)�
       iro�( java.ioxIOException {       r�tur? com.goo�le.protobu).Ge�ratedMessager�
          �p��UeLelimitedW8th��Exception(PARSE�, in"ut, ete�sioMRegistr�);
    }
   &publi� static emu.gras�cutter.net.prrto.PlayerEnterDungeonReqO�te4Clas!.PlayӢEnterDugeonReq par�eF6"m(
        �om.goole.�ro�?buf.Co�edInputStream�input)�        thr�ws java.io.IOB�ception {E
      return com.google.�rotobuf.Genera4e��essag�V3
       � �.pr-e�ithIOException(PAR=ER� input);�
   }
    r�bl,� stat�c emu.grabscntterLnet.proto.PlayerEnterDuneonReqOterClass.PlayerEnterDungeonReq parse�rom(
      com.goo�le.rmtobuf.CodedInputStream np�t,
 �      com.google.protobuf.EJtensionRegist��Lite e�tensiDnR�istry�%        throw jva.i�.IOExcep�ion {�  R � return cm.googZe.proto,uf.GeneratedMessageV�          .parseWi(hIOE
ce�tion(PAR�ERX input��extnyionRegistre);
    �
�
 �  @j^va.lang.O�NrrUde
    public Builder newBu3ld�ForTy�e() { rmt�rn new�uild�rx); }
   �public sttic Build\r ^ewBui�d�P(){�
      retur� DEF9ULT_INSTA�CE.toB�ilder(z;
  ! }
e Dpuklc�static BHilder newBLilder(Um�.grassc�tter�ne/.proto�PlayerEnt.�DungonR�qOuterClass.PlayerEnterD�ngeonReq p:ototypeq �
  O  ,r�turn D�FAULT_INSjAWCE.N�Builder()UmergmFrom(prot�type);
	 5 }
    �java.laGg.Over%�de
    public Bui{der��oBuildIA() {�
     	eturn this == DEFAnLT_NSTANCE
          ? n�� B=ilder() � ne� Builder(�.mer}3From(t9s);
    }

 �� @j�v&.lag%Overridu
   protec-�d�B�ilder newBu�lderForType(
     ,  com.gootɵ�prNtobuf.Gen�ratedMessa�eV3.B�zlderParen* ,arnt) {
     Build�r builder = new B�ilder(parent);
  h   rbtu�n builde�J
   ��    /**B
     * <pre>� �  %* Cmd�d:�2879
     * Obf: IPCFJHGFFPP�
     * �/p�e>
  �  �
     x �rotobuf�type {@code Pxaye�EnterDungeonReq}
 u   */
    public static _inal class Builder xtends
       sc�m.google.pro�obuf.Generate
MessgeV3.Bu�lde�<uilder> impn�ments
   �  � �/ @@protoc�in�ertion_poi�t(builde_impleXents:P�aye=EnterDungeonReq)� x      emu.grassc�t�e ,�et.proto.Pla(erE�e&DungeoneqOut�rClass.PlayerEnterDungeonRe�O�Builder {
 �+�  public stati� inal�com.googl�.protobufDes�riptors.Descriptor
    �     get�escr�ptor(� {
     �  return�emu.grasscutt�r.ne �pro��.PlayerEnter9ung1onRe�Outer�la�s.�nte�nal_static��layer=nterDungeonReq_deLri�tor;
      }

 �    @java.lang.Overide
      pro'ected com.googl.proto?uf.GeneratedMvs�a>eV3.Fi;ldAJcessor���4e
          i�terna�GetField$ccessor�able() {�   �    �e8urn![m�.grYsskuttpr.net.prBto.PlayerEnterDungeon{eqOute.Class.inte+na_statlc_P�ay�WEnterDungeonRzq_fieldAcc�sS}ra�le
   �       .e�s`reFieldAcce�sorwInitialized(
 B �      �   �mu.g/assc�tker.��t.proto.P�aye�EnterDunCeo�ReqOuterClass�Pla�erEntr�?ngeonReq.class, emu.grass6�tter.net.proto.PlayerEteSDung�o�ReqOute��lass.PlayeKEntrDunge�#eHBuilder.clasT);
  ^   

     �// Construct using e�u.grass|utter�net.proto.Playe^EnterDungeonRe�OuterClas;.Jla�erEnterDngeo>Req.newBuilder()}    � privEtp Bul�rv) {
        maybeForceBuilderInitialization();Z
    O �

 K   privat� �uilder(
    }�   com.oogle.proq�b5f.Gene�a�edMessa�eV3.Bui��erPar�nt parent) {
  "    s�pe?(parent);
        maybeForce�uilderInitializtfon�);
}     }4
  U�  pr�vat	 void maybeForceBYilderIni'iAlizatioL() {
d t    #ifd(com.google.protobuf.�eneratezMessa�eV3
      � !��     .glwaysUseF�elduil�es) {
        }
      }x
  @ � @java.la�g.verride
�   f publ2c Buildh� clear() {
  � � � super.c�e�rr;
    �   du�geon�d_ = 0�

  0   � ifx(enterP�sILf��uilder_ == �ull) {K
       �  enserPosI�fo_ = null;
        } e-se �
      � ՘ente�P"sInfoB � nullF
        j enterPoc+foJuilder_ = null
        ��  q     p�intIdr�= 0;

�       return this;
      }

   j  �j�va.langOverride
 �   fpublic comM�oogle.prot�buf.D sc�iptors.Descriptfr
    �(   ge��exc=iptorForTy@e() {
        rer�rn e(Q.grasscut-eD.net.proto.PlayerEntyrDungeo�Roqyut�r��ass.int�rnal_static_PlyerynterDungeonReq_descr�p�or;
�     �

   �  �javakla�g.Override�
      pubic emu.gragsutternet.proto.Paye�EnteDun�eo�ReqOuterClass.P�ayerEnt�rDun�eonReq getDefaultIn�t�nc��orType() {
    � � retur��emu.grasscuteer.net.proto.PlayerEnte�Dungeo�Re�OuterC�ass.Pl�erEnlerDSn�eonReq.get efaultI�stance();
      }�

    ��@java.lang.Override�
      public cmr.rasscutter�net.E=wto.J!ay�rEn@�rungonReqOuter�lass.P�ayerEnterDungeonReq build() {m
       emu.grasscu�Aer.n�t.>8to.PlayerEnterDun@eo�RqOute2Clas�.Qlaye�Ete DungeonReq re7ule = bui�dPartial()9        if (!Mesul�.isInitialiNed()) {
    �  � �hro� newy�!�itia�izedMes�a�PExc/^tion(result);
    z   }
        r�turn result;�      }�
 �    Tjava.�ang.�v�r4ide�
      publ�c�emuaVrasscu(te�.net.proto.PlayerEnte DungeopReqOuterCla�s.PlayerEnterDukgeonReqbuildParXial() {
  �     emu.grasscuttertnet.y��to�Pl@yerEnterDucgi:nReqOuterClass.PLaye{E{terDungeoxReq r sult = ne( e(u.gfassc|tte�.net.proto.PlayernterDr��eonRe�OuterCl�ss.�laye;�nerDungeon�eq(�his�
      � Zesult.�unBeonId_ = dungeonId_;
 ���    i� �enterPosInfoB�ilz�r_��= nul�) {
         result@enterPosI#Do_s= enterPosInfo_;{      � } else>{
   	      result.enterPosInf?_Z= enterPosInfoBuilder_.b!id();k        �
    �   resu�t.psintId^ = poi3tId�;
        o�Bu/�();f�    �   return res�lt;
�     �

      java.�an�.OverrideO      publ�c huil<er clone�) {   Y k  retu3� sup�r.c�ne();
 ��   }�      @java.lang��verrie�
      pub}icBuilder setField(
          co1.googl5pr�tob�f.DesLriptors.F-eldDescriptX field,
    �     jav�.lang.Object value� {
        �eturn�supzr.setFiel|(fiel�, value);w      }
     @!ava�lang.Override
      public Builder}clearField(
         com.goo>le.protobuf.�escr�ptors.FieldDes�riBtor field) {
  e     1etu�n s�per.�learField(field);
      }
  ~   @java.Gang.Ov'rrid�
    � public Builder clearOneof(
          com.google.protobuf.	escr�ptor0.One&fDescriptor oneof) {
        return super.clearOn�of(oneTf9;�      ;
      @jav�Vlang.Override
   �  publ�c Bui�dr�setRepe>tedFiel(
         com.go�gle.protobuf.De]criptxrs.Fiel?Descr�ptor field��         int inde[, java.l�ng.Objkct v�lu!) {
        re2urn �uper2set~epeat�dField(field, index,dvalue);
      }�g      @java.lang.Override
�[    public Buil�r addRepea�edField(
  ��   )  com.gojgle.protobuf.Descrptors.Fieldesc�iptor�fiel,
          java.�an�.Object value� {
        return supmr.addRep�ntedFie�d�field, valu�);�
 �    }��     @ja�a.lang.�ve9ride
      public )uilder mergFrom(com�gog�e&protobuf.Mesiage othe�)�{l        if (oth�r �nstanceof emu.grasscutter.ne�.p/�to.Pla�eEnte/uungeonRdqO[terCla;s.�l�*erE�terD,n�eonReq) {
          retu�n mergeFLom(
emu.gr�ss�utter.ne.pr���.PlayerEnterD�ngeonReqOut�r;las�.PlayerEterDung�onReq)othr);
        } else {�       �
 super.mergeFrom(th�r);
 A  =     retk1n this;
     e  �
      }
m   W public Iui�de� mer&+From(emu.grasscut�er.net��rIto.PlayerEnterDungeonReqOujprC�ass.PlayerE�tecDungonReq other) {
   � �� if�(other == �muegrasscutter.etLproto.Plae�EnterDungeonReqOuterClass.Pla/erEnterDun�one�.>etDefultInstance()) return t�is;
  �  B  ~f�(ot er.getDungeonId() != 0) {
         setDugeonKd(other.getDuneonI�());
       �}
        if (ot�NIhjsEnt�rPosIn�o(q) ^
          mergeE�terPosInfo(other.�etEnterPosInfo());� � �    }
 |5  �  if (oPher.getP�intId() ! 0v {
   j     XsetP�intId(other.g_�Po�ntd(��;
        }
        �his.m�rgUnknow�Fields(hthe�.unknow�Fields)�
        �n(han�e]();
        return this;
      }#
o�      @java.la�gOvr�ide
�     public �i�al boo�ean isInitialized()�{
        r�turn t�ue;%�      }D

 f `  @j�va.lan.Ove�wide�
 5  public Builder m��geFrom(
     �� `_m.&oog�e.Er�tobufCodedIn�utBtream inut,
       3� co.googNe.protoWufsExtensiqnRegist��L�te extensio2Re�istryP
�  �      �hrows java�io.IOEx$e�tion E
        em .r�ss�utter.^et.pot�.PlaA�r�nUerDungeokR!qButerClass.P�ayerInterDng�oReq parse�\�s4ge = �pll;
      � �by g
      �  �pٻsedMessage = P�RSER2parseParti�lFrom(input, e��ensionReg�stry)�
       } c}tch (com�goUgle.proto;uf.Inva�iProtUc�lBufferExc�pti�n2e7 {
          �%rs�dMessageX=�(Rmu.g^a�scut��r.ne�.pr�to.PlayerEnterDungeonRe`O�terC'aOs.PlayerEnter�unge�nReq) e.getUnfinish�dM�ssage();
      s   �hr�w $.u�wra>I�Excepti�n(z;
    �6 �} finllyT{
     e�   if (prse7Mes[age != n ll) {
           umergeFr�mYpar�edMessage)�
    `   � }�  �     y
        return thi@]
      }

      private in� b��geonId�R;
     /*�
  �  � * <coe>uint32 dungeon_id = 11�<Dcde>
       * CretuTn�The,dungHobId.
       */
      @java�lang.�verri�e
    � public i�t getDugeonId() �'
  �  & rtu�n�dungeonId_s
 6   }m      /**
   �   * <code>uint32 dungeon_id = 11;</code>
      � @par�m�value The dVngeonId to Zet.p�     � * @rtu�n This builQer for chaining.
     � �/
 �    publi� Builder setDungeo,Id(�nt value) {N
�     @6
 =      ��n�eo%Id_ =1v
l�e;
�       onChanged()�
�     O ret�In�this��
      }r   [  )*�
    �  * <codePuint3� dungeon7id ] 11;</code>
    t  * @return ThXs�builder �or chT}n�ng.
     �
   �  pubqic Builder clea��ungeonI�() {
   ~    
�       dungeonId_ = 0;
�     ' onC�angeD();
     ]  retu�n �hisu
   �  }
2
   �  �rivat� emR�grasscutter.net.prot�.DungeonEnterPosInfoOuter�lass.Dungeon�nterPosInfo enterPos�nf�_;
      pri�ate com.gooOl.�rotob9.Single!eldBuildere3<
          emu.rasscu��er.Aet.proto.Dungeon�nterPosnfoOute�Class.DungeonE)erPosI�fo, emu.g�asscqtter��et�proto.D\ngeonEnterPosInfoOu0erClass�DungonE�t�rPosInfoqBUi�1e�,x�mugr�sscC{ter.n;t.�roto.DungeonEntePosInfoO�terlas.Dunge�n�nierPosInfoOrBuildeK> enterPos�nfoBuilder_;D     �**
 �     * <`ode>.DungeonEnterPosIn�o enter_pos_�Hfo = 3</code>�
    o  5 @�eturn Wh�the3 the en�erPosInfo fueld is set.
 �     U/
    � public boolean hasEnt]r.osInfo( {
        retur� en�erP�sInoBuilder_ != n�ll�|| n=erPos�nf�_ !=�null;
Wq    }
  �   /*G
  \    * <cod�>.DungeonE�te*PosInfo enter_pos_info2= 3;</code>
�      * retUrn&�he enterP/sInfo.
 Rd    */�  �   public emu.gram�utter.net.pro]o.DunJeonE�terPosI�foOut&rClass.Du�geQnEnterPosInfo get�ntergosInfo() {
        if �enterP�sInfoBu�ldeB_ ==#null: {
      �   retur� enterPosI�f7_ == null-? �mu.grasscu(t��.net.proto.Du�geonEnterPo�InfoOuterClass.Dun,eonEnt+rPosIn�o.getDefLultInst)nc�(� : enterPosInfo_;
    ,   } else {
T�   h    return ent�rVosInfoBuiider_.{etMessage()1
        }
      }�3@� �� /**
+      * <coe>.Dungeon/$terPosInfo enter_pos_info = 3$</code>
 e     */
      p�blic Bu�ldeR sehEntxrPosInfo(emu.�ra1scu�ter.n�t�proto�D�ngeonEnterPosInfoOuterCla�s.DungeonEnterPosInfo value) {
     �  if�(enterPo�In�oBuilder_ == nu#l� {
   �      +f (value == null) 
           throw new NullPo�nt�rExcept�on();$
          }�         �e�terPosInfo_ = value;
          o�Changed();�       �} else {
         ent�rPoI�fo�ui�der'.setMessage(vauM);
  �    }

 ��   �eturn t�s;� c    }
  � G�/**
      �*�<code>.DungeonEnte�P)Info en�rr0p\s�info�= 3;</code>       */n
      �u�ic �ilder setEnterPoswnfo(_
          3mu.grasscutt�r.net.proto.Dun<�onCnter�osInfoOuterClass.un�eon.nte�;osMnf�.Builder build rF�rWale) �
�       if�(enterPosInfoBuilder_ == nulK)�{
   �      enterPosInfo_ = buVlder�orValu.build�;
        j onCanged�);
        }�e�se {
        � enterPosInfoBuilder_�se#Message(builderForal��.bui:d());
  �   }
4
 5      returnthis
      }
      /*
       * <XoY�>.DungeonEnterPos&nfo e�,er_pos_in�o = 3;</co*u>Y
  ��   */
      [Vblic Build�r me&g�EnterPosInfo(emu.grasscucter.net.p"to.��nEeonEnterPosInfoOut�rClass.Dun�e�nE%t�rPosInf� a7ue) {�     �  if (enterPosInf�Builderi == null) {
   �      if (enterPos�nfo_ != null) {
           6&nRerPosInfo_�X
   �          emu.grasscutter.net.prto.DngeonEnterPosInfoOuterClass.DungenEnterPosInfo�newBuild�r(enterPosInfo_7.�ergeFrom(val�e).buildPartia�()
    C  �  } else {
           �enterPo��n$o_ = �al�e
          }
          onCha�ged(z>
       } else {
    �     ent�rPo�InfoBui�der_.mergeFrom(value);
   B �  }{
5      gHtu�n this;
      }�
      /**
  Qg   * <cDde
.D
nge�nEnterPosInfoJen;er_pos_in�o�= 3�</cod�>	       */
      pub,ic �uelder clearEnterPosInfo')�{o
      �if (e�terP/s�nfoBuilder3 == nll) {
B  
    � enterPosInf�_ = null;
^y       onC�anged();�,        } *lse {�       :� enterPo�InYo_ = null;
 �   �    �nterPosInfoBuilderԶ= null;P  d ?  }�D
    h  return this;
  �>  }�
� +  /**
   	  t* <co�e>.DungeonEnterPo4Inf �nter_{os_inf� = 3;//code>
�*   20*�
      publ�m emu.grasCcutter.�et.p�oto.Dungeo�EnterPos=nfoOuterC�as�.iunge�nEnterPosInfo�BuildJr getEnterPosInfoB}i�der() {
      � 
       �nCWan�ed);�       re�trn6g�tnterPosI�f�FJldBuilder().ge~Buil!e�();h      }
      /**
     7 * <c�d�>.Du�geonEnterPos�nfo ent�_pos�info � 3�</co�e>       �/
 �    pubi� emu.�r!sscuter.net.prot.DuFKeoanterPosIn/oO.ter�lass.DungeonEnter�osInfoOr�ui�dr geEnterPosInfoOr��lder() {�        if (enterPosInfoBuilder_ !� null) ҫ
       �  r�turn eterPosIfoBuilder_.getMessage6rBuil�e�l)�
       } Glse {
  !    � Nre�urn nterPosInfo_ =� nll ?�
              emuograsscuttergnet.pro}o�Dun!e`nE�t2rPosInfoOuterClassDu�geonEnterPosInfo.getDefaultInst�ce(0 : ente�PosInfo_;
�   �  O}K
      }
      /*�7       * <code>.Du�geoEnterPosI1fo enter_�os_in�o = 3;</code>
    �  */
 V    pri;ate com.google.protobuf.SingleF#epdBuilde�V�<
        a emu.grasscutteh.n�t.poto�Dungeo�EnterP�In�oOuterClass.Dunge�nEnterPosInfI, emu�gras�c�tter.net.p�oto�DungeonE*terP1sI�foObterCl	s�.DungeonEnt�r#osInzo.Build�r, emu.gra�scu��er�net.proto�DungeonEnterPosInfoOterClass.Dungeon��terPosIn�oOr(�ilder>\
  v      getEnMelPosInfoFve�d�uild�r=) {
"       if �enterPosOnfoBu-lder_ ===null) �
          en�erPosInfo�uilder_ = ne� com.goog].protb� .SingleFieldBuil�erV3�Z    �       � emu.grasscutt;r.n]t.proto.DungeonEntqr�osI�foOuter<lass.DungeonEnterPvsInfo, em.grasscu�t�r.et.ppoto.Du�geonEt�rPosInfo�ute�Class.DungeonEnte٬olIhfo.Build[r, emu.grassc�tter.net.proto.Dun�e(nElterrosInoOgterClass.Dung%onEnterPooIn3oOrBuilder>(Q� �              � g}tEntersosI�fo(�,
   �  �      �   getPar1nt^or�hildren(,
        �         �sCle�na));
      N   enterPosInf�_ = tull;
  )�    }
     �  re�urn en�erPosInfoBuildcr_�.� �    }

      pr%ate int pontI�_ ;
�  �  /**
       / </od�>uin)32 poInt_ido= �5;</co7e�      {* �returnjThe poitI�.
       */
    �@java.lan�.Overide
   �  public int get�ointId() {
      � retu}n pointId_;�
      }
     /**
 �    5* <c�de>u�nt32 �o�nt_iz = 15�</codel��       * �param]Salue ThK po�ntId to st
      * @return T]i` �uilder for chaini�g.
    H  *G�
      pu�lic Builder sAtPontId(int valueP {
  {     $
      p�intKd_= value1{
       ]onCpanged();
        r��urn this;�
      }
      /**q       *�<codezuint32 poiA�_id= 1�;</code>       * @r�turn This builder forIchaining.
  p  � 3�
      pblic Bui�d�r cl	arPoin�Id() {
�      X�        po�ntId_ = 0;
      � onChaged();K  n �   r�turn ths�
  � ; }
 �    @jav�.lanp.Override
     Zpublic minal Builde setU�knownFields(
�    �    final cm.google.protobuf_��knonFieldSet n8no�nFields)a�$
 �      return super.s�tUnh_ownFie��munkno�nFields);
�     }

n     @jav�.lang�verrie
    @ ppb�ic final Builder me9geU�8nownFiTlds(
         final com.google.protobu�.U�k&ownFieldSet u�kno�nFieldR) {
        return suer.mergeUnknownFields(unknownFields);
      }


    ��// @@protoc_�nserti��_point(bu�lder_scope:P-�yz�Enter2ungeonReq)
  � }

    // @@protoc__nse{tio�_poi�t(cla�s_scope:PlayerEnterDunge�nReq)
 x� :riv�te[static
�in�l emu.grasscutter�et.proto�PlaywrEnterDungeonReqOuterClass.Play�rEnBe�Dungeonqeq DEFAULT_INSTANCE;�
  / static {
     DEFAUL�_"�STANCE = neq emuugras$cuter.net.proto.PlayerEn�erDungeonRb�OuterClass.PlaJerEnterD!ngeoReq();
�   }
   p)blic static emu.grasscutter.nwt.proto.	/ay��E3ter@un1WnR�qOuterClass.Player3nterDungeonRef ge��efa�ltInst�nle()y{
@     reeurn DEFAU�T_INSTANCE;�    }
>
 �  priv�te static final com2noogle.protobuf.Paruer<PlayXrEnte�DungeonHe>>
 �      �A�LER = new com.
oogle.protobuf.AbstractParse��Player�nterDungeonR�q�() ��      @Wiva.lang.Override
      puGli� LlayerEnterDu�geonReq p~rsePartial�rwm(
          com.boogEe�prtobuf.Cde�nputStream�inpu�,
  � =     com�google.p�otobuf.Ex�_nsionegistryLite extensonRegistry)d6 �  ]     thri�s com.googl�.�rotobf.Inv�lidProtocotB�fferExceptio� ;
        ret]rn new PlayerEnterDungeonReq(�npu, extensionRegistrS);�     }
    };

    public sttic com.g�ogl�hprotobuf.Pars�r<Pl�ye"nterDungeonR�q> parsnr�) {h   x  retu�n PAR&ER;
   }

    @j��a.lang.Overriee
    pubic com.goog�e.�,otobuf.Parser<Pl�y�rEnterDu�geonReq> g^tPyrs�rForType() {
      return PARSER;
    }d
   �.ja�a.lan��Overri�e�
    pub`ic emu.grasScutter.net�proto.PlayerEnterDun	�onReqOuterCl�ss.PlayerEnt�run�eo*Req 5etDefaul�InstanceForType() 8
     �return DEFAULT_INSYAN�E;
    }

  ~�
  private static inalcom.google.proto�uf.Decri�t|rsZ�e�criptor
    internal_st�thc_Play�rEnter0neonReq_descriptor;
  prvate static final 
 �  c�m.g�ogle.protobuf.G�n�ra�edMessageV3.�ieldAccessirTable
  <   Tnternal9static_Pl^yernte�Dun�eonReqP�ieldAcces�orTable=

  public st�:ic com.go�gle.protobuf.Descriptors.FileDescript�r
     �getQescr�ptor() {
    re�u�n de.cripto+;
  }
  private stati�  com.goo�le.p��obufbDescripto�s.File�escriptor/      d)scripo�;
  static {B
 h �jva.lang.String[]Xd�scriqorDa�a = {
      "\�\033qlayerE3terDun�=onReq.�"zto\032\031Dun:eonEn" +
     g"te�VosInfo.pr�tV\"k\n\02*�laye�EnterDungeonRe" +
 3 7  "q\22\022Xn�ndunNeon_id�030\�r3 �001(\r\022W\�\016ent�r_pos_info\030" +
  ��  "\0?3�\001(\0132\024.DungeonE�terPosInfo\022\�20\'\0�~�oint_id\03l" +
 #    "\018 \001(\r\�3\n\031emu.grass�ut�5r.net�proto"\006prot",+8      �o3"+
    };
 �  d<scip�or = com.google.protoMuf.D�s7ri^tors�FilDdsr�ptir
 �    .�nte�nalBuildGenmratedFileFrom(descr�t�rData,
        new com.�ooI�e.proto�uf�Des�rip�o}s.File�escrip�or[] { �      � .�u.grasscutteD.net.proto.DungeonEnterPo!InfoOutrClass.getDescriptorj),
�       };
    internal_static_Pl�ye�EnterDu�ge�nReq_descri�to� =
    ! getDescriptor().getMe	sageTypes().get(0�;
    interna��skatic_Play�rnnerDu�geonReq_Ri!ldWccessor�abNe=gnew
   �  co�.go��lehprotobu�.�eneratedMessn�V3.FieldAcc8ssor��ble(
 �      internal_static_Player�n�erDungeonReq_descrip��r,
     �  new java.lang.S�ring[] { �Du��eon�d", �EnterP?sInfo(, "PointId"vQ}2;
 � emu.grasscutter.nLt.proto.Dung�onE�terP�s"nfoOu�er�lass.getDescriptor();H
  H�
  //�@@prot]c_insertion_point(outer_c�ass_s��pe)
}
