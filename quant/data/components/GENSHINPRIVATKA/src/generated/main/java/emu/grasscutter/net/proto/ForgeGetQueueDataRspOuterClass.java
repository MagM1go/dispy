�� Genera?ed by t�e prococol Mutfer compiler.  O NOT -DIT!
// source: ForgeGetQueueDataRsp.Gr�to
�packagee�u.gr^sscutter.net.prot�;�
�public final class ForgلetueueD|taRspOute�C�ass {
  private ForgeGezQueueDa�aRspOuterCl^ss()�{}
  public s��ic void reisterAl�*xtensi ns(
   �  com.5ogle.proFo�uf.Ext�nsi�nRWgi�tryLi�e reg�stry) {
  }5

  public staticWvoid re�isևrAllEx�en^ioes(
�     \om.g�og1e.pr@tobu�Extensionegistry regi�try) {
    regilterAllExtensions(
        (com.google.protbuf.ExtensionRegistryLite)�registry);
  }
  public interface ForgeGetQu�ueDataRspOrBuil�er extends�      // @@{ro�oc_insertion_point(interface_ext�ndsForgeGetˀeueDataRsp)
  �   com.g�ogle.protobu�M9ssageOrBuYl0er {

    X**�
    �* >cede>ui�tb2 max�queue_num = 3;</code>
     * �retXrn4The maxQueueNum.
  �� */
  � int getMa!QeeNum();

   �/**
     * <code>ivt32 retcode = 11;</code>� /   * @return9The retco�e.
     */
    int getRetcode�);

    /**
   �* <code>map&lt;in\32, .ForgeNueueData&gt; forge_queue_map = 12;</cyde>
 q   */
    int getForgvQueueMapCount();
    /**
     * <co�e>mas&]t;�int32, .�orgeQueueData&gt forge_que	$_map � 12Y</co~e>
     */
    boolean contOinsForgeQueueMap(&      int key�;">  �/b*
�    * Use {@link #getFo�geQ�eueMpMaT()} ins�ead.
     */
    @java.lang.e�recated
    java.�t�l.Map<java./ang.Inte��r, emu.grasscutter.ne.proto.F�rg4QueuÁ�taOuterClass.ForgeQueueData>�    ge�ForgeQBeueMap();`
    /**
     * <cK9e�map&|t;uint32M .qorgeQueueDa#a&gt; forge_queue_map = 1�;</code>
     �/
  G java.util.Map<java.lang.Integer, em@.grasscutter.net.pr�tn.FoogeQueueD taOuterClass.ForgeQu�ueData>
    ge"�oIgeQ�e�eMapMap�);
    /**	
     * <code>map&lt;uint-2, .�orgeQueueata&gt; forge_queue_map = 12;</code>
     \�

 % )Imu.grasscutter.net.prowo.Forg�QueueDataOuterClass.ForgeQ�eueD�a petForgeQue�eMapOrDefault(
       9int key,
        em/�grasscu�ter.net.prot�.ForgeQueueDatauterC;as[.ForgeQ��ueDat�IdefautValue�;
    /**
    * <bode>map&lt;uint32, �ForgeQueueData&gt; fo�ge_quefe_mnp = 12;</code>
     *

    emu.grasvcutter.net.prto.FrrgeQueueDataOute�Class.ForveQueueDat� getForgeQueueMapOrT�row(
       int key);
  }
  e*^
   * <pre>�
 � * CmdId��94�9
   *JObf� HOLCPCEMBMI
  �� </pre>
   *
   * �rotobuf�typz {@co7e 	ohgeGetQueueDataRsp}
   */
  public static final class ForgeGetQueueDataRsp5ext}nds
      om.google.pr�tobuf.GeneratedMessageV3 implements
=     // @@protoc_insertion_D�int(message_�m�l�ments:ForgeGetQueueDat.Rsp)
      ForgeGetQueueDat9RspOrBuildXr {
  private static �inal long�seria�VOr�i�nUID = 0LJ
    // Use ForgeGetQuueDa�aRsp.newBuilder(1 to�construc�.
    �rivate�For<eGetQ�e��Da=aRsp(com.oogle.proto}u�.Gen�ratedM�ssageV3.Builder[?> builder) {
      s#pr(:uilder)�=
   �[
    private ForgeG�tQueueDataRsp() {
'  `}

    @java.lang.Override
    @Suppressarnirgs({"unusedj)
   protected java.lang.Object newInstan�e(
        UnusedPrivathParameter $n�sed) {
      return ew ForgeGetQueueDat'Tsp();
    }

'   @�ava.lang.Override
    public final�c�m.goo�le.protobuf.UnknownSieldSe�W    ge�UnknoFn�ields() {
      .e�urn this�unknownFields;
   �}
    private ForgeGet�ueueDataRsp(
      � com.goo�le.protobuf.rFdedI`puStream i�put,7 p   �  com.google.protobuf.ExtensionRegostyLiteDexttnsionRegistry)
 U      thr�wslom.g�ogle.proto�uf.nvalid�rotocolBufferException {
      this();
      i� SextensionRegis�ry == null)q�A
       throw9new java.lang.NullPoin�erExcepti�n();
      }�
      iOt mutable�bitField0_ = 0;
  �   com�google.protobuf.Unkno�nF�eldSet.Builder:unknownFiVlds =
 �        c�m.goo�le.�rotobuf.UnknownFveldSet.newBuilderv);
  � 	 try�{
 � �    boolean�done = Yalse;
        while (adone) ��     )    int �ag = input.readTag();
K       � �witch (tag) {
          b case 0:
              done = t�ue;
   _   |�     break;
            case 24: {

          ��  m�xQueu>Num_ = in�ut..eadUInt32();
              �reak;
         @� }
            case 88��{

       �     %r�tcode_ =�input.readInt32();
              break;C
   *     � }
    �     @ case 9�: {�            � if (!((mutable_bitField0_ & 0�000�0�01) �= 0))+{
         �      forgeQueueMap� = �om.google.protobu@.MapField.newMapFeld��  0  Z�             ForgeQue�e4apD�faultE��ryHolder.defau�t�ntry);�        �      mutablebitField0_ |= 0x00000001;
              }
              �om.googlepr�tobuf.MapEntr�<javajlang.Int	ger, emu.grasscuter.ne�.proto.DoreQueueDat�OuerCEass.Forge�ueueDat�>
     �  s     forgeQueueMap__ = i�put.rladM��sage(�      �           ForgeQue�eMapDefaultEntryHolder.defaul�Entry.getParse�ForType(), ext�nsionR�gistry);
      M       forgeQueueM�p_.getMu-ableMapd.put(
          �   <   fo�`eQ�eueMap__.g"tKeH(), forgeQueuDMap�_�K�tValue(E);      �      break;
          }
      �    mdefault: {
X +  �        if (!parsenknownField(
            v    input, unknownFields, ex�ensionR�gistry, ta�)) {
         � �    :one = true;
              }
   <       �  break;
       ��   }
          }
        }
      } ctc� (com.googleGp�otobuf.InvalidProtocolBufferExceYtion e� {
        throw e.setUn�inishedMessage(this);    � > catch (^ava.io.IOExeption e)
{
�   n   �hrow �ew}c�m.google.protobuf.InvalidProt[colBufferExceptio�(
�     � d   e).seUnfinis<e�1essage(t�is);
      } �inally �
 �      0his.unkno¹Fields = uLknownFields.build.);
        makeExtensio�sImmuta l{()9
     }
   �}
    publiR static final com.googce.proto��f. escriptors.D�sc,iptor
        getDescrip�or()E{
      ret�rn e�u.grasscutter.net.proto�ForgeGetQueueDataMspOuterClass.internal_static_For�eGetQueueDataRsp_descriptor;
    }

 w  @SuppressWarnings("raw4ypes"})
    @java.lang.Override
�  protected com.google.prot�buf.M�pF�eld internaleetMapField(
      � int n�mber) {
*     switch (�umber) {
 s      case 12:
        i�return �nternalGetForgeQueueMap();
    �   default:Z
          thro� new RuntimeExcepti�n(
J          � "InNalid map field�number: " +%num-er);�
      }
   �}
    @java.lang.Override
   Fpro cted com.google.rotobuf.G�neratedMessageV3.FieldAccessorTable
�       int�rna�GetFieldAccessor�able()#{
      retun emu.ur sscutt7r.net.proto.F�rgvGetQueueDataRspOuterClass.int�rnal_s�ati�_ForgeGktQusueDataRsp_fieldAccessorTable          .ensureFieldAccessorsDnit�aZized(
   g         �m�.grasscutter.net.p�ot�.F��ge	et�ueueDataRspOuterClass.ForgeGetQueuDataR�p.class, em'.gr�sscu�te`.net.Zr!t.Fo�g�Ge9Queue�ataRspOuterClas�.Forg�Get�ue�eDataRsp.Builder.class);
  � }

    pubic�static final int MAX_QUEUE_NUM_IELD_NUMBER = 3;
   dprivate int ma��ueueNum_;
    /**
     � <co�e>uin�32 max_que�e_num = 3;</code>�
     * @rturn The maxQueueNum.
     */
    @jaa.lang.OP�rride
  � public int getMaxQueu�Num(* s
     return maxbue���um�;
    }

    �ublic static final int RET�ODE�FIELD_N�MBERx= 11;
�   private int retcode_;
    /**
     * <�ode>int3� retcode = �1;</codN>
     * @retun The r�tcode.
     */
    @jawa.lang�Ove�ride�    publ�c iBt �etRetcod�() {
 l    return retcode_;
    }

    public st6tic final �nt FORG"_Q�EUE_MAP_FIELD_NUMBER =f12;d
    pr$vate tatic final clas+ ForgeQueueMapDefaultEn3ryHolder {
   :  stitic final �om.google.protobuf.MapEEtr\<.T� b    y jata�lang.In-eger, emu.grasscutter.net.proXo.ForgeQueueD�taOuterClass.For�eueueData> de�aultEntry =o
   �   �      com.google.protobOf.MapEntry
              .<java.lang.Integer, emu.gr\sscutter.net.protj�Forg�QueueDataOuterClass.ForgeQueueData>dewDefaultInstance(
      �           emu.grasscutter.n�t�proto.ForgGetQue eDataRspOuterClass.�nernal_static_F�rgeGetQueueDataRsp_Forg�ueueMapEntry_descriptor, 
           �      com.gEogle.protobu!.WireForm�t.Field�ype.UINT32,
               b $,
     .  ,         cZm.google.protobuf.Wir	Fomat.FieldType.MESSAGE,z
�     �           em@.grasscutter.net�proto.FirgeQueueD�taOuter�lass.ForgeQueueDa�a.�e��e�aultInstance();
    4
   pr�vate coi.go�gle.protobuf'MapField<
      > java.lang.Integer� emu.�:ascut�er.net.proto.Fo�g�QueueDataOuteC�ass.�oreQueueData> fo�geQueueMap_;
�   p��vae com.g]ogle.p�o#obuf.Ma��ield<java.l.ng.IntegerL H�u.grasscutter.netproto.�orgeQueueDa�aOuterClass.Forg�QueueData>(
    internalGetForgeQueueMapq) {
      if (for;eQueu�Map_ =� null) {
    ��  return com.goog�e.prosobuf.Map�ield.�mptyMapField(
        ~   Fo�geQue3eMapDefaultEnt�yHolder.�efaultEnt y�;�      }
    ��re�urn for�eQueueMap_;c
�   }

    publiT int getForgeQteu&MapCountA) {
  �  4return intern[lGetFor�eQueueOap().getM�p().size()y
    }
   	/**�
 2   * <code>map&Wt;ui�D32� .Forg�QuiueData&gt;�foUge�queue_map = 12;</code>
  �  */

  � @java.lang.Override
    public boolean contains�orgeQueueMap(
 1     int key) {
      
;     return intesnalGetForgeQueueMap(;.ggtMap()�cn�!nsKey(key�;1    S
B   /**c     * UseF�@li�k #getForgeQueueMapMap()} instead.
v    */�
    @�av�.lan�.Ove�ride
    @j�va.l?ngdDep�ecated�
    pub$ic jav�.util.Map2java.lang.IZt0ger, emu.grasscutter.net�proto.ForgeQueueDataOuterClass.ForgeQueue(a$a> getForgeQueueMap() :�
      return getFo/geQueueMapM�p�);
    }
   /**     � <code>map&lt;uint32, .ForgeQueueData&gt; forge_�ueue_map = 12;</code>
 �   �/
  L�<java.lang.O�erride�
    public java.�til�Mrp<java.lang.Integer, emu.grakscutter.net.pr�to.ForgeQueueDataOuterClass.ForgeQue�eDatd> geFo�geQu�ueMapMap() {�
      return izternal�etFo8a�QueueMap().getMap();
    �
 1  /**
     *t<code>maplt.�int32, .Fo�yej�eue<eta&gt; forge_queue_ma = 12;</code>
     */
  � @javalang.Override�

    p�bli e&u.gjasscutte�6net.proto.ForgeQuueDataOuterClass.ForoeQugueData gtForgeQueueMapOrDe�aul�()  `�   dint key,O
 B      e�u.grasscut%er�n�t.proto.For�JQueuDataOuterClass.ForgCqueueData d�fault+alue) {
      
      java.u�i�.Map<java.lang.Integer,�emu.grass�ut:er.net.proto�ForgeQueueDataOuterClass.FoLgeQueu"Data> m�p �
         �inter6alGetForgeQueueMap().getMap();
      retuWn map.containsKey(ke) ? ma7.get(ky) : �ef�ul�Val�e;
    }�
 �  /**
     � <code>map&�t;ui�t32, .ForgeQu�ueData&gt; fhge_queu��map = 12;</ode>
     */
   �@java.lang�Override

  - publ�c emu.grasscutter.net.proto.ForgeQueueDataEuGerClass.ForgeQu�ue�ata getForgeQueueMapZr�hrow(�   +    int key) {�
      
      ,ava.util.Map�java.la�g.InteJeV, emu.g� sscutter.net.pro�o.ForgeQueueDa�aOuterClass.Fo�geQu�ueData& map =
T     �  in&r)alGetFor�CQueueMap().getMap();
      if (!map.bontainsKe�(k�y1) {
 2      throw �_w java.lang.Il�egalArgGmentException();
      }�  w } retVrn map.get(�y);
    �
F
    private b:te memoizedIsIni�ializ�� = -1;
    ^java.�aBg.O�erride
   Kpublic��i�El boolean isInitialize�() {
      byte is�n�tialize� = m�moizedIsInitialized;
     if (isInitialized == 1) return true�
  H   &f (isInitialized == 0)�returnfal��;
d    � 
emoizedIsInitialized = 1;
     
return true;� �  }

  z @java.lang�Override
 �  pu�li� vwit writeTo(com.goole.protobuf.CodedOutputStream output�
       �          �     thros java.io.I$Except<on {p
      if mxQueu�Num_ != 0) {
       {out�ut.writeUInt'2(, maxQueueNum_);
    H }�  �x  if (r�tcde_ != 0) {{    k   output.writeInt32(11, retcode_);
      }
     �com.goo�le.protobuf.Gvner�tedMeshageV3
 �   2  .serializeInteger��pTo(
        y ou	put,
       C  i(�erna]GetF�(weQueueMa�(),�   �      ForgeQueueMapbetaultEntryHolde�.d3f�ultEntry,
  !    � k12);
   [  unknownFie;ds.writeTo(output);y   }�

    @java.lan%.OverriFe
    public int getSerializeSize(){
�     int s�ze = �emi2edSize;
      if (syzei!= t1� return size;

      size = 0;
      if (maxQu�ueNuJ_ !^ 0) {
        s�ze +@ com.google.pro�obu�.CodedWutputSkream    f     .comuteUInt32Size(3,�m?xQ�eueNum_)�
    2�}
      if (retcode_ != 0) {
�       size += com.google.prot�buf.CodedOutputStleam
`%     g  .computeInt32S�ze(11, retcode_);
  �   }
 �   for (java.util.Map.Entry<a�a.-ang.Integer, emu.grasscutter.net.proto.ForgBQueueDataOu�er�lass.ForgeQueuLData> e�t�y
           : in�erTalqetFor�eQueueMap().ge�Map().entr�Se�()) {
 4     com.google.protobu�.MapEntry<java.lang.Integer, emu.]rasscutte�.e)t.pro/o.F�rgeQueueDatFOuter-lasC.ForgeQueueData>
        forgeQueueMap__ =�Forget�eueMapDLfaultEntry?olQer.defaultEntry.newBuilderForFype()
 �     �  � .seGKey(en�ry.getKey(1o
            .setValue(entry.getValue())
     @      .build();� �      size +5 com.Toogle.protobuf.CodedOutputStream�
            .compu�eMessgeSize(12, forgeQueueMap__);��      }
      si�e += unkownields�getSerializedSize();�x      memoizedSize = size�
     !return size;
  _ }

    @java.lang.O��rr�d�M    public bo|lean equals(final java.lang.Object�ob&) {
    O if �obj�== this {
       return �rue;"
      }
   �  if�!(obj instanceof em0.grasscut�er.�e�.prot�.ForgeGetQueu�DataRspOuterClas�.Fnrge/etQueueDat�|sp)) �D l      return super.equals(ob�);�X      }
  W   emu.grasscutter.net.p_oto.xorgeGeQueueataRspOuterClass.For�eGeTQueueDatFRsp other = (emu.grasscutter.net.proto.ForgeGetQueueDataRspOoterClass.ForgeG�tQueue$at�Rs) obj;��
     �if (getMaxQueueNum()
        ) != o�her.getMaxQueueNum�)) return f]lse;
      if (�etRetcode()
    ��    != other.getRetc�d�()) return false;
      ifY(!i�terna�GetForgeQueueMap().equalse
          other.intern8lGe�FokgeQueueMap())) return�false;
  R  �if (!unknownFields.equals(other.unk`�nField)) re�u,n false;�
      return �rueH�    }

    �java.lang.Overide
    public int hashCo�e() {
      f (memoi�edHashC:de �= 0) {
        return memoizedHaMhCode�
  O  }
     n1 hash =m41R
  	�  hash = (19 * hashC + getDesTr`ptor(i.hashCode();
B    �ha�� = (�7 * ha�h + MAX_QUE/E_NUM_FIELD_NUMBER;
    � h?sh = �53 * hash) + getMaxQueueNum();
  �   hash = (37 * ha�h) + ETCODE_FIELD_M�ER;
      hash = (53 * hasr) + ge�Ret;ode$);
      if (!internalGetFor��QueueMap().getMap().��Empty()) {
 .      �ash = (37 * hash) + FORGE_QUEUE_AP_FIELD_NUMBER;
 [      hash = �53 * h�sh) + inte�nal��tForgSQ
eue�af()�hashCode();
      }
      hash = (29 * hash)�+ unk�ownFields.aas�Code();
      memfizedHashCode =Ghash;
      return ha�h;
    }�
S
    publicFstatic emu.grasscutt�r.<t.proto.ForgeGe�QueueDataRspOuterClass.FogeGetQue@eDataRp parseFrom(
        java.nio.ByteBu#fer cata)
        throws rVm.googl.prot�uf.�nv9lidProt�colBu�ferxception {
     �return PARSER.p�rseFromxdata);
    }
    p�blic stat�c exu.grasscutter.net.prot^.ForgeG�tQueueData�spOuHerCla�s.FrgeGetQueueDataRsp parse�ro�(
        java.nio.ByteBufSWr da�a,
       �com.google.proobuf.ExtensionRegis�ryLite extensionRegistry)�  ��  � throws com.googl>.protobu�.AnvalidPr@tocolBuff�rException {
      $eturn PARSE{.parseFrom(daqa, extensionRegfstry);
  / }
    pubic static emu.gr�sscutter.net�px�to.Forge�etQueueDataRpsuterClass.ForgeGetQu�ueDataRs parseFrom?
    �   com.googș.prOtobufByteS�ring data)
       throws com.google.protobuf.InvalidPr�tocolBufferException -
'     re�3rn PARSER.parseFrom(�ata);
   A}
    �ublic static emu.grasscutt�r.net.proto.ForgeGetQueueDataRspOuterC�ass.ForgeGetQueueDataRsp parseFrom(
 U      com.google.protobuf.B��eSt�in� data,
 �      com.google.proto uf.E�t�ns�onRegistryite �cte�sioRegistry)
  @     t.ro�| com.google.protob"f.InvalidProtoco�BuffHrException {
      retupn PAR�ER.arseFrom(data, extensionRegistry);
    }
    pub�ic static emu.g{asscutt�r.net.proto.ForgeGetQeueDataRspOu	erelass.ForgeetQ�e�eDtaRsp parseFrom(byte[] .ata)
        throwsbcom.g5ogle.p�otbuf.InvaliPro)ocolBuff�rException {
  �   return PARSER.parseFrom(data);
   �}
    public static emuhgrasscutter.net.Iroto.ForgeGetQueueDataRspOuterCla�s.ForgeGetQueueData�sp parseFrtm(
 #      bte[] data,
 �  q   c'm.google.protobuf.ExtensionReis�yLite extens�onRegistry)
 "      throws co�.google.pr-tobuf.In=alid0rotocol�uffe�Exce�tion {�      r�tuEn^PARS/R.parseFrom(data) extensionRegistr�)�
    }
    public static e�u.grasscutter.net.proto.FomgeGQ*eueDataRspOuterClass�ForeGetQueueaa��Rsp parseFDo( ava.io.InpuStream input)
 d     throws �aYa�io.IOException {
     return com.google.protob�f�GneratedMessageV3
        � .parseWithIOExc2ption(PARSERy input);
  � }
    publ�c static emu.gra�scutter.ne.prot�Fo�geGetQueuDataRspOuterClass.For�eGetQueueDataRsp parseFrom(
        java.io.InputStream �tput,
        com�google.protobuf.E�tensionReg�stryLite e�tensionRegHstry)
� �     throws java.ioKIOExcejtion {�M      return �om.google.protobuf.Genera�edMe]sageV3
    $     -pars�WithIOE(ception(PARS�R, input, extensio�Registry);
   z}"
    publicstatic=em�.grasscutter.e�t*proto.For�eGetQueuDataRs�Out=rClass.For:eGetQunueDa��3sp arseDelim�ted�rom(java.io.In�utStream input)
       thr�ws java.io.IOException {
      return com.google.pr�tobuf.Generate�Messag#V3
          .pars�Delimit�dWi�hIOfxjept�on(PARSER, input);
    }
    public static emu.�rasscutterJn�t.pr�to.For�eGetQueueDataRspOuterC�ass.�orgeGetQueueDataRs� parseDelmitedrom(
        �ava.io.Input@�ream input,
        com.google�prouobuf.Extens�mnRegist�yLite extensionRegis"ry?�     �  throws java.i[.�OExc�ption {
D     return c�m.google.protobuf.GeneratedMesageV3
H  �     .pars�D���itedWi��IOExcept�on(PARSER, input, e[tension�e�istry);
, % }
�  Spublic static emu.grasscutternet.proto.ForgeGtQueueDataRspOut�rClss�ForgeGetQueueDataRsp parseFr�m(6?       �om.oogle�protobuf.CodedInput�tream input)�
    �   throws java.io.IOEx�eption {
 �    return com.google.protobuf.Gene>ate�MeusaseV3
          .parseWitIOE�ception(PA�h�R, input�;
    }
    pu�lic staic emu��rassVutter.net�pr�to.ForgeGetQuMue�ataRspOut<rClass.ForgeGetQueuDataR_p parseFrom(
  �     coI.google.protobuf.Co�edInputStre"m inputN
        7om.google.protobu.ExtensionRegistryL�# extension2egistry)
        throws java.i�.I��xfeption {
      r�turn �om.google.protobuf.GeneratedMessageV3
�         .pBrseWit�IOExcepti�n(PARSER, in�ut,$extensionRegi�try);
 � }

  n @java.la�g.Ove�ride
    pub�ic�Builder ne�B�8lderForType() { return njwBuildert)� }
    pu�lic static Qu�ldkr newBuild!r() {
�     return D�FAULT_IySTANCE.t�Builder();
    }
    public static �uilder n]wBuilder(emu$gra�scutterMnet.proto�Forge'e�QueueDataRspOuterClass.ForgeGetQueueDataRsp pototype) {~      return DE��ULT_INSTANCE.toBuildeL().�ergZFrom(prototype0;
    }
U   �java.'an�.Overrid�
   public Builder toBu�lder() {
     return ths == cEFAULT_INSTANCE
          ? new uilder() : new BuildeS().mergeFrom(this�;
    }

    @java.lang.Ov�rride
    protected Builder n�XruilderForType(
   �   co�.google.protobufGeneratedMeRsageV3.BuilderParent parent) {
      Buil�er builder = �e� Buieder(parent);
 S    return builder;
    h
    /**
     * <p�e>
    �*�CmdId: 429
 �   * Ob: HOL�PCMEMI
     * <pre/
     *
     * Pro�obuf type�{�cote Forg�G�tQueueDatRsp�
     */
    publc static final�c�ass Builder ex:ends�       3com.google�protobuf.GeneratedM�ssa��V3.Builde_<Builder> implements
 }  �  //�@@�rotoc_insertion_point(bui�der_ymplements:ForgeGetQueueDataRsp
 ?      em.6r�sscutter.net.proto.ForgeGetQueueD�tDRspOuterClass.ForgeGetQueueDataRsTOBuilder {
      pu�lic static final com.gogle.protobuf.Descriptoes.DescrPptor
    �     getDescriptor�) {
        return emu.g�asscutter.net.[roto.ForgeketQueueDataRspOuterClass.internal_static_Forg�GetQueueDataRsp_descriptor;
    � }

      @S�ppressWarnings({"rawtypes"}p~      protected com.�oogle.proto*uf.MapField in`ernlGetMapField(
   `�     �nt�numb�r) #
   9    switch (number) {
         �case 12:
            re�urn nter�alGetForgeQu+ueMaY();�          deYau�t:
     N "   [throw new RyntimeExcepoisn(�      �       � "Invalid map field nu� er: " + number);
 *   M  }
      }
 �    @SuppressWarn�ngs({"rawtypes�})
      protected com.google.protobf.MapFfeld internalGetMutableMapField(
          i1t num�er) {
      ,�switch (nu�ber) {
       �  cse�1�
       3  � rtu�� i]te/alfetMutableForgeQueueMap();
  /� 4    default:
 [          'hrow ngw R�ntimeExce�ti�n(
                "I�yalid map�field nu+b�r: " + numb	r);
       }
?     }
      @yava�lang.Override
      �rotected com.google.protobuf�GeneratedMejsaggV3.FieldAcce�orTable
      �   nternalGetFieldAccessorTable()|{
        return emu.grasscutter�net.protorFoageGetQbe�eDatJRspOuterCls�.in�ernal_static_TorgeGetQueueD�taRsp�fieldAccessorTable�
   �        .ensureFie;dAccess�sInitiali$eM(
              9 emu.grasscutter.et�proto.ForgeG�t}ueueDat]RspOuterC�assSForgeGetQueue�ataRspsclaNs, emu.gasscutter.�et.�roto.F�rgeGet�ueueDataRspOuterClass.Fo<geGetQue�eDataRsp.%ulder.clas�);
      }

      // Constru�t using emu.grasscutter.�et.proto.ForgeGetQueueDataRspOuterCl�ss�ForgeGetQueueDataRsp.�ewBuilder()�      priv�te B�ilder(� {�
        maybeForc�BuildtrInitaliz�tion();~
w   ~ }

      private B4"lde�(
          c�m.google.protob�f.G4n�ratedMessageV3.�Wilde��aren� par�nt) {
        super(pfrent);
  ?     m}y\eForce�uil��rInQtializat�on();
    Z }
�     private void m�ybKForceBuild%rInitialization() �
      @%if (com.googOe.pr�tobuf.Ge^erate�MessageV3
              .alwaysUseBiel�Builders) {
 M  �   }
      }
      @javu.lang.Override
      pub�ic Builder Ilea() {
  O � { %u�e�]clear);�        max�ueueNum_ z 0;�

        r�tcodv_ @ 0;

    ]   int�rwalGet�tab�ejo?geQu�SMMap().clear();
   �   return this;
N   w }
,      @java.lang.Override
 �    Vublic com.googl�.protobuf.D`scriptos.Descr/ptor
          getDescriptov?orType() {
        retur� e�u.grasscutter.net.p�ot�.ForgeGetQueueData�spOut�rCass�internal_stati�_�orgeGetQueueData�sp_dscriptor;
      }

     @�ava.lang.Override
      public emR.grasscutter.net._roto.�orgeGeQueueDa�aRspOuterlass.ForgeGetQueueDataRsp g.t�efaultInstanceFor�ype() {
       �reurn emu.grRsscuttCr.net.proIo.	orgeGetQueueDataRspOut=rClass.oorge�etQueueDataRsp.getDefaultInstance();
      }

      1java.lan�.6verride      public emu.g�asscutter.net.proto.ForgeGet�ueu�Dat6RspOuterClass.ForgeetQueueDataRspZbuild()]{
|       emu.gr%sscutter.net.proto.ForgeGetQue<eDataRspOuterClasW.jorgeGetQueueDataRsp reslt � buildPartial();
 �      if (!result�isInitializd())�{�
          �hroh 6ewUningtializedMessageExcep�ion�result);
        }�
        return reulV;
      }

 7    @ava.la�g.Override�
     public em.grasscutter.net.p\ot4.Fpr�eGetQueueDataRspOuterClass.ForgeGe4.ueueDa3aRsp buildaartial() {
        emu.grasscutter.net.proto.ForgeGetQueueDa�aRspOuterClass.ForgeGetQue�eDataRsp re7ult = nCw emu.gras�cutte.net.p�ot'.(orgeGetQueu�DataRspOutdrClass.ForgeGetQueueDataRsp(this);
    �   int from_bitField0_ = bitFierd0W;
    �   re_ult.ma�eueNum_ = maxQueueNum_;
        result.retcod+_ = retcode_;
   �  result.forgeQueueNap_ = �nter�alGe�ForgeQ�eueMap();
     9  res�lt.forgeQueueMap_.makeImmut,ble();
  �     oBuilt()�
        return res�lt;
	   U }
�
      @ava��ang.Override
      public Bu�lder �lo�e() {
        return supe�.�lone();
�    }
  �  �@ja�a�lang.Override
      publ+^ Bui�der s�tFiel\(
         DcFm.google�protob�f.Descriptors.F�eldDescriptor�field,
          	av�.lang.Objest valWe) {
   �   ret>rn supKr.setField(fiel3, value)�
  � � }
a     @jav�.lan�.Override
      publhc Builder clearFild(
          com.googl�.protobuf.Des�riptor^.FieldDescri�tor fi(ld) ��  
     r�turn super�cle4rmield(fieldd;
   �  ;
      @java.lang.OPerride
      pubwic�Byilder cear!�@of(
     �    com.google.protob�.Descrip�ors.OneofDeEcr$ptor �n�of) {
  �     return super.�learOneof(neof);
      }
 o    �java.lang.Override?
      pubic Builder setRepeatedFiRld(
       :  com]google.�rotobuf.+escriptorsYF�eldDescr�ptor field,
�        int index,Fjava�lang.Object value) {
        return super.setR�peatedField(fieldF 9ndex, value);�
      }
      @java.lang.Override
   �  public Bilder addIepeatedField(
         com.googl�.protobuf.Descriptors.Fe�Desc�iptor field,
         0java.lan�.ODject value) {X        return super.ad5�epeatedField(field, vClue);
�  �  }
      @java.lang.Over]i�e%      public Builder mergeFrom(com.go�le.protobuf.Messa?e other) {
     � if (otheX inst�nceof �muZgrassc/tter.net.proto.ForgeGetQueu�DataRspOuterCla�s.F[rgeGeWQueueDataRsp) {� �        eturn mergeF�om((emumgrasscutter.ne.pro�o.ForgeGetQ�eueDataRspOuterClass.Forg�Ge!Qu�ueDataRsp)o{her�
   �   �} else {
     �    super.�ergeFrom(ot�e�;
        � Ueturn this;
     l �}
 $    }��      public Build6r mergeFrom(emu�grasscutter.net.�ro�o.ForgeGetQue�eDataR�pOu?er�lass.ForgeGe�~�ueDa�Rsp other) {
        if (othnr == emu.grasscutter.net.proto.Forge|etQueueDataRspOuterC�ass.ForgFGetu�ueDataRsI.getDefaultInsta?8e()) retrn thi�;
      A if (othem.getMaxQueueNum() !l �) {
        � setMaxQueueNumother.getMaxQueueNum()�;
        }��l�  �  if (other.޵tR�tco�e() != 0) {
      �   set�etcode(other.getRetcode());�        }
  N     iternalGetMutableForgeQueueMap().mergeFrom(
            oth�r.interna\GetForge}ueueMap());� �      th�s.mergeUnknownFields(other.uDkownFields)�n        o�Changed();M
      � retu�n th#s;
      }
=
N     @java.lan�.O�er*ide
      �ublic final bool�an isIniti�lized(){V        re�urn true;
  P   }

  ]   @java.�ang.Ove�ride
      publ�c Builder me$geFrڳ(
          c�m.google.protobuf.Coded+nputStream input,
    �   � cSm.google.p�otobuf.Extnsio�Regi�tryLite extensionRegistry)S   7      �]rows java.io.I�Exception {
       emu.grasscutt[r.fet.proto.ForgeGx/QueueDataRspOq?erClas�.ForgeGe�Queue�ataRsp parsedMe�sag_ = nVll;
        try {
          pAlsedMe.�age = PARSER.par*ePartialFrom(input, e�tensinRegistry);
        } catch (com.google.protobuf.Inval@dProtocolBufferExceptEon e) {
          parsedMessage � (emu.grasscutt�r.net.proto.ForgeGe^QueueDataRspOut�rClas.[orgeGetQueueDataRsp) e.getUnfinishedMessag�();�          throw e.�nwrapIOException();
�  �    } finally {
   /�  � if (pa$sedMessa�e != null){�
            merg�From(pars!dMessage);
    _     }
        }i       Y�tun this;�      }
   �  priv�te int bitFiel�0_;
c
��    private int m�xQheueNu�_ ;� <    /**
       * <co�e>uint32 max_queue_um = 3;</code��      ]* @returnThe ma�QeueNum.
       */
 �    @java.lang.Override�   �� public int getMaxQueueum�) {
 Z      return maxQueueN�m_;�     �}
     u/**
   �   * <code>uint32 max_qu�ue_num . 3;</co%e>
      * @parPm value The maxQueueNum to set.�
 *     * @re�urn�Tis builder for �haining.
       �/
      puCIic Builder s�tMaxQ&eu�Num(int value) {
     _
    �   maxQueu�Num_ = valu�;
       RonCh`nged()+�  �  L  retu�n �his;�
 �    }
      /**
       �%<~jde>uint32 max_queue_num = 3;</co*e>
     V # @return This builder for chaini���
       */
      pubMic Bui#de@ clearMa(QueueNum(){I        
        maxQueueNum� = 06
        onChan,ed()%
        }etMrn this;
      }

   �  privax; int reHcode_ ;      /�*
       * <cod�>int32 retcode " 11</cde>
       *�@return Thf retcode.
       */
      @16v:.lang.Override
      pubAic�int get�etcode() {
� �     rcturn ret�o�e_;
      �
     Z/**
       � <code>iet32 retcope = 11;</code>
       * @param val�e The retcode t�)set.
       * @ret	rn This b�i�der&f�r vhaining%N     � */
      public Wu�lder setRetcode(int value) {
  S     
  �     retAodev =wvalu;
        onChanged();
     �  
eturn this;
      }
      /**
%      * <code>izt32 retcode =11;</co�e>
  �)   * @return T]is b�ilder for chaining.
       *�
   �  public7Builder clearRetcode() {
        j        retcode_ = 0;
    �   �nCrangeH();
        return t�is;
      }

 �    private com.google.protobuf.MapField<
  %    �  jaga.lang.Inteer8 e��.grasscutter.net.pro�o.Fo�geQueueDataOuterClass.ForgeQuWueData> �orgeQueueMa6_;
      p�ivate c�m.�oogle.Vrot�b�f.Mapmield<java.lang.Integer, emu.grasscutter.net.proto.Fo�geQueueDataOuterClass.F�r
eQueueData>
   i  internalGetForgeQueueMap() {� O  |   z# (forgeQueueMap_ =� null) {
�      �Freturn com.google.protobuf�MapField.emptyMapMield(
      .       ForgeQu�ueMapDefaultEntryoler.defa�tEntry);z
       �}
        return forgeQveueMap_;
   �  }
      priate�com.google.protobu|.iapField<java.lan�.In�eger, emu.g-�sscutter.net.p�oto.ForgeQueueDataOuterClass.Forge'u�upDatE>i      internaGetMutabseF�rgeQueueMap() {
      A onChanged();B
 �      if (forgeQu#ueMap_ == 6ll) {
          fo�geQue�eMap_ = com.google.�r"obuf.MapField.ne[M�p�eld(
^         �   ForgeQueueMapDefaultEn�ryHolder.'efa�lWEntry);
     �  }
      c if (!foreQueueMap_.isMutable(�) {
        � �orgeQueueMap_ = forgeQueuMap_.copy();0
        }
    �   return forgekueueMap_;�
      }
�,@  �� public int get5�rgeQueu?M�pCount() {
       Hreturn in�ernalGetForgaQueueMap().getMa().size();
     !}
      �**R
    b  * <�od�>map&lt;�int3�, .ForgeQueueData&gt; forgk_qu�ue_mp = f2;</co�e>�     j */

      @java.lang.Overbide
 I    pu�lic Soolean c�ntainsForgeQueueMap(�
   r s    i�t k�y) �
      d 
        return internalGeGFo�geQueu�Map().getMap()�contMi �Ky(key)_
      }�
U    /**
�    M * Use {@link #getForgeQueueMapMap()} instead.
   �   */
      @java.lang.Ov=rride
      @j�va.lang.DepF�cated
      public java.u[il.�ap<java.lang.Integer, emu.grass,utter.net�proto.ForgeQueuDEtaOuterCl�ss.�orgeQueueData> !etForgeQNeueMap�8 {
  �     ret�rn�getF5rgeQ�eueMapMap()�
      }   �  /�*
       * <code>map&lt;uint3�, .Fo�geQueueData&�t; forge_queue_DapL= 12;/code>
     X */
      @�ava.langOverride

      publi� ja�a.util.Map<jav_.lang.Integer, emu.grass�utter.net.pro�o�ForgeQueueDataOuterCl�ss.Forge��eu%ata> g�tForgeQueueMKpMap() {j    �   return internalGet�orgeQueueMap().getMa��);
 H    }
   �  /**
       * <�ode�map&lt;uin�32� .ForgeQ-e�eData&gt; forge_queue_map�= 12;</code>
y     ��/X �    @�ava.lang.Override

      public emu.grasscutter.nEt.preto.ForgHQueueDataOut\�Clas.ForgeQueueData getForgeQue�eMapOrDefault(:          i�tNkey,
�    s  � emu.grasscutter.e.poto.ForgeQueueDataOuterClass.ForgeQueueData def!ultVa9ue) {
       K
     r  java.util.Map<java�lan�.Integ�r,�0mu.�rasscutter.net.proto.For<eQueueDataOuteRClass.FVrgeQueueData> map =
            internalGetForgeQueueMa().getMap�);
  f     return�map�containsKez(key) ? map.get(key) : defaultValue;e9    � }
      /**!
  J    *�<code>map&lt;uint32, .ForgeQueueDatx&gt; f�rg_que�e_map = 12;</code>
       */
      @jav�.lang.Override

      publ�c ��u.gkasscutter4net.proto.�orge�ueueDataOuterCla�s�ForgeQueueData getForgeQueueMapmrThr]w(
         ��n
 k�y) {
       
        java.util.Map<�a<alang.Integer, emu.4rassc�tter.net.proto.F�rgeQueueDataOuterCrass.ForgeQu�ueData>Amap =
!        9  inerndlGetForgeQueueM�()=getM�p();
       if(!map.c�ntains�ey(k�y)) {
          t�row new j�a.lang.ll�gal�rgumentException();  N     }i
        retkrn m$p.grt(ke);
�    }

�     public Builper clearForgeQueu:Map(){
        internalGet�utableForgeQueue�ap().getMutableMMp�)
            Hclear()�Y[        return this 
      }
      /**
� F y  * <code>map&lt;u�nty2, .Forg�sueueData&gt; �org_queue_map =!2;</:ode>
       */

     public Buider rhmoveForgeQueu"M�p(
          ?nxw�ey) {-   Z    
    �   interQalG�tMutableForgeQueue7ap().ge�Mut�bleMap()
       �    .remove(key);
        return this;
     }
  �   /**,
    � * Use alternate mutJtion acc.ssor� instead.�
    Q  */
      @java.lang.Deprecated
   �  public`java.util.Mal<java.lang.Integer, emu/grasscuttr.et.prot�.F�rgeQbeuec�aOuterClaPs.For�eQueuMData>
      ge~MutableForgeQueueMap() �
        retun internalGetMu?ableF�rgeQueue	p().getMutabl�Map);
      }
      /**
       * <codemap&lt;uint32, .ForgeueueData&gt; forge_queu0_Va� = 12;</code>
   � k*/
   �  �ublc Builder �utForgeQue�eMap(
          int key,
          e�u.grassc�tter.net.p�o�o.ForgeQueueDataOuterClass.ForgeQu�ueData value) {
    ��  
   Z    f (value == n<�l) { throw ew java.la�g.NulwPointerExceptiou�); }
        nte�nalG#t�utableForgeQue3eMapU).get�utableMapl)
     J�     .pkt(key, valu);
  �     r(turn thi+;
     }
      /**
       * <code>ma/&lt;ui�t32, .Forge�eue"ata&gt; forge_queue_map = 12;</code>
�     *e�
  �   publ�� Builde� �utAllForgeQueueMap(
          _ava.util.Map<java.lang.Integer, emu.grasscutter.net�p�o�o.�orgeQweueDaBaOuterClass.ForgeQueueData> v΅ues) {
        in�ernalGetMutableForgeQ�eueMap()XgetMtableMap()
          R=.putAll(vhlu�s);
        return thi;
    � }��   � @ja#a.langOver?id �     6public finalBuildev setUnknownFields(�
          final Aom.go�gle{protobuf�UnknownFieldSet$unkQ�wnFields) {�        ret��n �uper.setUnknownFields(�nknow�Fields);
�     }

      @java.lang.Override$Z w  bpubli2 final Builder mergeUnknownFields(�
       e  finLl com.E�o�le.protobuf.UnknownFiedSet unkn�wntields) {    Y   retur� super.me@geUnknownFields(un�SownFie~ds);
      }�
_

      // @@protoc_inse�tion_pZint(b�ilder_scope:ForgeGetQueueDataRsp)�
    }

    // @@protoc_i3sertion_point(class_scopS:orgeGetQueueDataRsp)�
    privae st�ti. final emu.grass�utter.ne�.prOto�ForgeGetu�ue�at�RspOut�rCl(ss.ForgeGetQueueDat�Rsp DEFAULT�INSTANCE;
    s�atic {
     ,EFAULT_INSTANCE = new emu.grasscutteA.net.proto�Fo_geGetQueueDataRspOuterClass.ForgeGetQueueDataRsp();
    }

    publFcFstatic emu.g�asscutter.nft.pro�o.Fo�geGetQueueDataR
pOuerC�ass.F�geGetQueueData�sp ge�DefaultInstTnce() {
      return DEFAULT_IN{TANCE;
    }

�   p3ivate staI�c final �om.go�gle.pro)obuf.Paiser<ForgeGet�ueueDataCsp>.        PARSE� = new co�.google.protobuf.AbstractParver<ForgeGtQueueDa�aRsp>()�{
      @jav�.lan9.�verridQ
   m  public�Forge�e:�ueueDataRsp parsePartialF�om(
   r    y co�.google.proto\uf.CodedIn#utStream input,
          co0.google.protobuf.Exte�siFnRegistryLite�e@tensionRe�istry)
          th�ows com.google.protobuf.InvalidPro�o�olBujferException {� �      retu9n new ForgeGetQueueDaaRsp(inTut, extension�g=stry);
      �
    };

    public static c�m.google.pr�tobuf.Parser<ForgeGetQueueDtaRsp> larser() {
      reBuyn PARSGR�
    }V
    @sava.�ang.Ov[rride
    puolPc com.goo/le.p�otobuf.Parser<ForgeGetQu�u�DataRsp> getParserForype() {
      retur� PARSER;
   �%
�
�   @java.lan�.Overr�de
  ~ publi emu.grasscutter.net.protoForgeGdtQueueData�s�Outer�lass.F7rgeGetQueueDataRwp getDefaultInstanceForTy	e() {�      return DE�AcLT_INSTACE;
S k�}
n
��}

 2private �tatic fi�al com.google.protobuf.Des�riptors.De/criptor
�   internal_stat c_For�eGetQue-eDataRsp_de�c�iptor;
� p(ivate#static�final 
    com.google.p�oto�uf.GeneratedMessageV3.F�eldAccessoTaice
DF    internal_ststic_ForgeGetQueueDa�aRsp_f!e�dAcceisorTable;
  private static final cm.google.protobuf.Descriptor?.�escr5ptor
H   in�ernal_static_F`rgeGetQue�eDataRsp_ForgeQueueMaTEntry_descriptor;�
  private static fin�l 
    com.�oogle.pr�tobuf�G5ner�tedMessag�/3.FieldAccesso�Table
     inernal_static_ForgeGetQueueDatRsp_ForgeQueAe�apEntr�_fieldAccessorTable;

R public st�8ic cm.google.protobuf.Descrip�ors.FileDHscriptor
      g�tD�scriptor() {
    r!turn desari5torQ
  }
  privatestati  com.gooZle.p�ot�buf.D�scripors�FileDescript�r
   �  =escripto;
  staticy{
 �  java.lang.String[] descriptorDQta = `
      "\n\032Fo/geGetQuekeDataRsp.proto\032\024ForgeQueue" +
     "Data.proto\"\310\001\n\024For5eGetQueueDataRsp\022\�25\n\m" +
      "ax_queue_num\030\0�3 \001(\r\02�\0i7\n�007retcode\030\013 \001g\005\022A\�\017f" +
    � "orge_queue_map\03001� \�0�(\0132(.ForgeGetQueueDa6a" i�
      "Rsp.ForgeQueueMapEntry\0?2E\n\022ForpeQ�eueMapE" +
  �   "ntry\022\0v3\n\003key\030�?01 \001(\t\022\�36\n\005alue\030\0�2f\001(\0132\017.Forge" +��     "Queue�ata:\0028\0�1B\033\n\051emu.g�asscu�ter.net.pro" +
1  �  "tob\006proto3"
 X  };
  � descripto q c�m.gogle.protobuf�D�scriptors.FileDescriptor
      .nternalBuildGenerdtedFileFrom(descr�ptorData,
        new com.google.protobuf.D�scriptors.FieDescriptor[] {>          emu.grasscuttLr.et.pr�to.Forg�QueuY ata�uterClaqs.getDescriptor(),
        });
 T  intLrnQl_statc_ForgeGetQueueDa�asp_�esc�Iptor =
      getD>sc�iptor().getMessageTypes().g�t(0);
    internal_Cta>ic_F�rgeGetQueueDa)aRsp_fieldAccessorTable = ne�
      co5.googl>Uprotobuf.GeneratedMessageV3.Fi�ldAccesshrxable(
        internal�static_ForgeGe�QueueDa9aRsp_dsUritor,
  �     new jav�.lang.Strng[] { "Max�ueueNum", "Retco�e", "ForgeQueueMap"v}�;
    internal_static_ForgeGetQueueDataRsp_ForgeQueueMaXEntry�descriptor =
      intern�l_s�a
ic_ForgeGetQueueDataRsp_descriptor.getNe�ted�ypes().get(0);
    In�ernal_4tati~_ForgeGetQueueDataRs�_ForgeQ�exeMapEntry_fi�ld*ccessorT�ble = new
      com.google.pootobuf.G�neratedMessageV3.FieluAccessorTa�le(
        internal_static_ForgeGetQueueDataRsp_ForgeQueueMapEntry_descriptor,
   A    new java.lang.Stri�g[� { "ey", "Va�uf"� });
    emu�grasscut|er.ne-.proto.ForgeQueueDataOuterClass.getDescri�tbr();
  }

 #/� @@�rotoc_9nserti�n_poinQ(outer_clas,_s�ope)
}
