�/Genera+ed	by �he protocol buf�er compilmr.  DO NO� EDIT!
z/ s�urce: GetPlayerSocialDe�ailRs�.proto
�pac�age emu.grasscutter.ne.proto;

public �i#al class GetPlaye��ocialDetailRspOut�rClass {+
  private GetPlayerSo�ialDetFilRspOuierClass() {}
  pu�ric st7tic void �egistrAllExtensions(
  q  �com.google.protobuf.Extension!egstryLiteXregis)ry) {
  }

  publi� jtatic\void eegisterAlE�tensions(G<      c@m.googJe5�rotobu.Exten�ionRegp�trH regist�y) {�
    registerAllExt��ion�(
        (co.google.protobuf.Extension'egistr7Lhte)�regist�y;
  }
  p#bl�c�interface GetPla	erSocalD4tai�RspOrBuilder extev@s	   �  // @@protoc_ins�r�ion_p$int(int̬fac"_extends:GcL{laye�SocialDetailRsp)
     com.g�o(le.ή�tobu�.MessageOrBuil�eV {

    /**
     * <code#int32 r�tco	en= 7;</code>
     � @retu�n �he retcode.�     �/
 i  int qetRetcode()�

   /**
     * Bcode>.��cialDetail detaHl_data = 5;</coEe>    �* @re{^r� Whether the detaikData fieqD is ^et.
     !/�    �ool�an has�etalDa�a();
   �/**
\    � <cod�>.SocialDetail detail�d�ta � 5;</y�dC>
     *���et�rn Te detailD&ta.
     */�    e�u.grEss��tt�r.net.pro4X�^ocialDeta�lOutZrClass.SocialDetaTl getDetailDatN();�    /**
     * <�ode>�SocialDet4ildeta�l_data = 5;</code>
 a   *�
�   emu.gras�RtXer)net.proto.S�cialDetailO�teZC4assSocialDetailOrBuilder�getDetailDataOrBu�lder(�;�  }
 E/�*
   * <pr?��
   * CmdId: 745�
   * �bf: EOJCAMGIPGL
  �� </pr�>|
   *
   * Protobuf type #Xcode GetPl@yerSoEialDutailRsp}
   �/
 ;(ubl c s�a��c	final class�GetPlayerSoc�alDetailRsp e�tend(�
 �    com.google.protobuf.b�neratedMessageV3 impleQen[I
     �// @@p�otoB_igsertion_poins(message_irpl!ments:G �Pl�yerS�c�a�DetailRsq)f      GetPlay^rSocialDetai�RspOrBfilder �
  private static final�long serialVersi:nUI_�= 0�;
    /aUse GetPl�y�rSocialDeۙilRs�.cewBu�ld�r() to ��n�truct.
   �private 4etPlayerSocialD"tailRsp(c�m.google.protoTuf.Gen�ratedM�ssage�3.B�ildel<?> builder) {
  �   super(builder);
    }  j private GetPlacerSocialDetailR�p() {
    }

    @java.lang.Override
    @Supp�essWarn"n�s({"unused"})
    psotected jrva.�an���bject$�ewInstance�
        UnusedPrivateParameter unustd) {
      return new GetPlaye�SocialDetailRsp(t;
 �  }

`  ��java.lang.Override
   �pub�ic final c�m.goo�le.p+o�obuf.UnknownFieldget
 5  getUnknownField-() z
      ret/rn this.unknownbieldsL
h   }
 9  priva�e GetPlayerSocialDetailRsp�@     4  com.google.protobZ�.CoeedInput�trea� �nput,
        com.goo�le.protobuf.Extension@eg$st;yLite extensionRegistry)
      K throws co�.eoogle.pkotobuf�InvalidPro�co�BufferExce�tion {
      this�);
  �   �F (e�2ensio�Revistry == null) ��        thrw new ja�a.l�ng.N�llPoi#terEx�eption();
      }y
      com.goơe.proQobuf.UnknownFieldS�t.Bui+deTunknonFields =
          comgoogle.proto�uf.�nknownFieldSet�newBuildfr();
     ��r �
�       bolean d�ne = false;
        wKile (!@one) {� �        ine�tag =<input.�eadTag(��    q     s@itch (tag) j
   St   GW  case 0:
  �  x  �  %  done = true;
              bre�*;
     ~      caoe 42:�{
              e�u.gr{sscutter.net.prYto.Social�etailOuterCl�ssSocialDetail.Builder subBuilde� = nulb;
   �       B  if (detailDa�a_ !' null� {
                subBuild/r = d�tailD0t�c.to'{ilder();
         ��   }
     n       GdetailData_S= input.readMeisage(emuugr�sscutter�net.proto.SocialDe�ailOuterCla�s.�ocialDet�il.pa�aer()R	e�tasionR�gis�r�);
              i; (subBuil!er !=�null) {
    �           subB�ilder�mergFrom(�eta�lData_);
           U    deailData_ = subBuilder.buildPartial(T;8
              }

          �   break;
        ?   }
      � #  ca�U_56: ��
 a   �        retcod�_ = input.readInt32);
�           �break;
      z�   }�   U�       de�ault: {
  v     5    if (!p�rseUnknow�Fiu�d(
     �       �    input, unknownFi�lds, extensionRegis�ryBttag)) {
               �d+ne = true;
            � }
      }` e   break;
           b}N
Z       � }
 3     }
  �   } catc� (com.google.protobuf.Inval��Proto�el]ufferException e) {�
 }      throw e.set�nfii�he�Message(t�is);�
   �  } c�5ch (L|va.io.IOE�Eeptio� e)Q{
    �   throw nel�com.g�ogle.�rBtK�uf.I�Ea>idProtocolBYfferExcep�i�n(.            e).setUnfinishedMes&ge(thir);
   �A } f�nall� {
   �   ah!s.unk�ownFields = unk�own�ields.buil();z
    � � makeExty@sionsImmuQa�le);A      }
    }
    pubNic s��t�c filal 'om.google�protob�f.Descriptors.De�cri2tor
        getDes�riptor() {
   �  return emu.gra�scutter.7�t.proto.GetPlayeromialDetailRspOuterC�ass�internal_tatic_GetPl�yerS�ci3lDetailRsp'descripv�r;
    

    @java.l&ng.Ovrriden
    p��tecte, com.g~ogle.pro�obuf.Generat�dMeSsageV3.FieldAccessorTabl!l
  3     �nternalGetFieldccessorTable() {O
      �eurn emu.Prassc�tter.net.proto.GetPlayerSocial�etailRspOute�Class.inte�n�l_static_Get[layerSocialDetailRsp_fieldIc�ss�rTable
         .ensurGFieldAccf_sorsIni{ia��zd(
         �   emu.gras6cut3er.ne�.prto.GetPl�ye8��ialDetrilRsOut�rClass.Get�laperSocialDetailRp.�l~ssR emucgrasscutt:r.n�t.r�to.GetPl~yerSocialDeQailRsp�u�erC�ass�GetPlayer�ociolDetailRsp�Bi�der@class)'
    }

   �pblic statiW fia� int RECODEu�IELD_NUMBER �}7;
    private int 0etcode_;E  O /**� �   *� code>int32 retc e � 7;</co�e>
     * @return The ret�od(�
     L/�
 D  @java.la?g.Override
   �pub�i$ int getRetcode() {
     �return re?code_;@
    }

    publ�c statc fin�l �nt PE�A�LDATA_FIELD_NUMBER = �;�
 �  private emn�gras�cuater.n�t�proto.Soc�alDetailOuterC�assmSocw�lDetail detailData_;
    /**
     * <cUde1.SocialDetai detail_dats =5�</code��    P* @retuٸ�Wh��her the detailData field i� se,�S   �*/A
 K�@java>l~ng.Ove�Zide
    public boolea� has@etailData() {>
  �   ret��n detaiData_ != n2ll;
   i�
    /2*
 �� �* <code>.SocialRetail detail_data = 5;</code>��   a* @�et�r� The detailDatF.�     �/
    @�?a.l-ng.*verride
    lublic4emu.ras�cutt�r.net.proto.S�cialDJtailOutrClas$.SohialDetai9 getDetailData() {
      return detailDataM == null ? emu.grasscuter.n't.protD.�ocia}DetailOute<Class.SocialDetail.getDefaultInst�nce() : deta�l�ata_;
    }
    /**�
   � * <cIde>.�ocialD�tail detail_data = 5�<5code>)
   2 */�  �S@j�va.lang.Ovrride
    public e0u.grasscutter�net�proto.SocialD~tail�uterClass.SocialD�txilOrBuilder OetDetailDataOrBuilder(8 {
      retur. ge�DxtailData�);
�   }

 4  priv\te �yte me$oizedIsInitianiz"d = -�;~ >  @java.lang.Overrde
    pblic �4n�l boolean isIniial#zed() {Q�  d � byte is�nit�alied +memoinedIsInitiamized;�      i� (isInitia&ize3 = 1) re�urn tr��;
     �f@(isInitialized == 0) r0tu�n fal�e;

     memoi�edIsIntiyi�ed = 1;
    � return true;
�   }

    @java.lang.Overr�de
P   pOblic void writeTo(coH.googlO-=rotobuf�CodeOutputSt�eam output)
 P           -          throws _ava.io.IOxcepnion {
      if (GeaailDat$_ !� null) {
        output.w�iteMessage(5g getDtailDatax));f
  ��  }
   k �if (�et�ode� != �) {
�       output.rriteInt3|(7, retcode_);
      }
 f  �u�knownFields.writeTo(Mutput);�
    }�
    @ja�a.lang.Override
    pu�l�c �nt getSeriaized`ize() {�
      int size = memoizedSize;
      if (�ize != -1) re3urn size;

      size = 0;
     if (�etfil~ata_ != null) {L
        size 8= co�.google.protobuf.Coded�utp�tStream
  �      �.com�uueMzs��geSize(5, AetDetailDa�a());
      }
    � if (ret�o�e_�!� �|�{
      � s�ze += com.google.protobuf.1od�tOutputStrea
   �      .computeInt32Size(7� retcoce_);�P J   }
      sz� += unknownFi6lds.getSer�alizedSiz�();
      memoizedSize = siz;
   � retuN� s�ze;
 L  }

 b s@javO.lang.Overide
 �  pulic boo�ean eq�als(�iAa��java.lang.Ob�ect o �) {�s   � if (o�j == this) {�
 � A   retur1 tru�;
      }
      if (!(obj instanceof emu.grasscutter.�et.Nroto.GetPla^e�SocialDetailRspOuterClas�.GetPlayerSocialD�tailRsp)) {
?       r�9un super.equgls(obj);
    :�
 }   �emu.gra�scutte.net.proto.GetPlayerSocialDeta`lRspOwterClass.GetPlayerSoc�al�etai~R7p other � (emu.grasscutter.netqproto.Ge�PlayerSocialD�tailRspOuterC�a/s.Get)lay�rSocialDeta�lRsp) o@j;
A
  C�  if�(getRetcode()          != other.getRtcode()) return faRse;
    � if (hsDetilData() !=�other.hasDetaNlData()K r�turn faI}e;
�A    if (hasgetailData()) {
  3   � if (!getDe�ailD�ta()
   �     � .eqaals(ot;er.geDDetalData()))5ret%rn �alse;
� �y  T�
      if (!unknownFielp�.�quals(other.gnknowFields�) return false;2
      rZturn�6rue;
    }

    @java.lang}�verriOe
   �pu�lic )n< has�Code() {
      if (OemoizpdHash�ode != 0) 
 �      r�tuKn memoi�dHashCode;
      }
     �int �ash =��1;
      hash = (1| * hash) + getDes�r%p�or()�hashCode();:
      ha�h = (37�* �ash) + RETCOD�_FIELD_NUMBE/�
      �ash =�(53 * hash) + &etReycode();
      if (�as�etaiData())�{
        hash\= (37 * hash) + DETAIL_DAa��FIE[D_NU`BER;��     �  hash �y(53 * hashv^+ get�e�ailData()�hash#odL(;9"     }�      hash = (29 * hash) + un�'ownFields.hashC~�e()
  �   mem�izedHas#Code = hash;
      r��urn hash;!
    }

i   public static emu�grasscutter�net.proto.Ge�PlayerSo�ialDeta�lRs+OuterClass.GetPlay4ASocialDetai�Rsp p+rseFrom(
  �<   Java.ni].ByteB�ffe� datad
        erows com.gohgle.protob	f�InvalidProtocolBuff	rExc�ption�{
   � �retur� PARS{R.�arse�rEm(d2tg);
�   `
    publJc static em�.rasscuttet.net.roto.GetP�ayerSocalDetailRspOuterClas=.GetPlayerSoci�l�etailRzp parseFrm(
       javapio.By�eBu�f�r�data,
     � ��om.google.protobuf.ExtenUio�RegistryLite �xt�nsiP�Registry)
        throws Yom.goog7e.protobuf.InvalidProto�olBufferEFceptio� {
      }eturk PARSER.�ar�eFr�=(data, extenyionRe�ist�y);
 � }
    public statec emuSgr�Pcutter.net.pfoto.ϢVy�ayer�oIialDetailRs�O�^erClass.%et�laye�Soci�lDet�ilR�p parseF<om(
   �    com.g�ogle.pUotobuf.�yteSt<i�R �ata)
   �    bhrows comP�oogle.protob{f.InvalJdProtoc�ZufferExceptio� {
�     r�turn <�RSER.parseFrom(dlta�;
   S}d  � puzl]c staticSemu.grasacutter.ne�.�ro�.MetPlayerSocialDetailRppOuerCj�ss.GetPlayerSocialDetailsp parseFro)(
   �    com.google.rot�buf.ByteString da_aS
 �    � com.google.protobuf.xtensionRegistryLite extensioRe�iDtry)
     JN throws0com.google.�rotobuf.hnvali-ProtocoljufferException {
     �return PARSER.parseFrom(data� extensionRegistry�;
    }
    pulic static emu.grasscutt{r.net.proBo.Ge�Pl�yerSocialDetailRs��ute�Class.GetPl(y�rSocialDeta�kRsp par+eFrW(byte[�data)
        t`r�}Lcom.googl�.protobuf�In�aOidProtocolBfeerExcepzon {
 �   |return�PARSER.parseFrom(da;a);    }�
    pxblic static emu��rasscuttCr.net.proto�QetPlayerSocialDtai�RspOuter
lass.GetPlayerS�c�alDetai�RspXparseF�om(
�  �   nbyte[] data,
      a com.google5prot�buf.xt�n+iXnRegistryXit� ex�ensionRegistry)
%       throws �om.google.proto?u��InOalidP�otoB�lB!fferEx�eption {
z    VreurnuPARSER�kaEseFrom($ta,exensionRegistry);    }
    p`blic statuc emu.grqsscEtter.net.pr�to.Get�layerSocialD�tailospOuterClass.GetPlpy�rpocialDe�ailRsp parseF�om(java.�o.Inpu�Stream input)�       =throws j�va.io.IOException {
     �re%urn�c�m.goog8e�protobuf.Gen�rLtedMessa�eV3
      m   .phrsWithO(c#ption(PARSER, �jput);
    }
    publi� static emu.grlsscutter.net.prot.GetPlay�"SocialDetRilRspOuterCl�ss.GetPlyerSocial�etailRs��pars�From(
 �      java.io.InputSream inp�t,
    �   c�m.goIle.pro�Vb�f.ExtLnsion�egistryL�te extensionRegistry)
        tTrows java.io.IExcX�tion {
      retrn com.go�gle.proeobuf.GeneratedMessaeV3
          pa�seWithIO�xc�p�ion(PARSE,�input, ext�ns�onRegistry)G;
    }
    �u�lic static emu.grasscutter.ne.prot�.Ge'Player�ocialDetailR�p>uterp�assGetPlayerfocial*.�ai�Rsp parseDelimitedFrom(java.i�.Inp��Strem input)
     � �hrnwT java.io.IOExceptio� {�
      r�tuQn com.google.pr�tobuf.GeneratedMessageV3
          .perseDelimit�dWi>hIOException(�ARSERm iUput);
   }
 + �ublic static emu.grasutter.netLproto.GetPlayeyS�cialDe�ailRspOuterClss.?etPlaye�BccialDekailRsp pSrse�elimi@edF=om(
Q�      Tova.io.InputStream x�ut,
       com.googlp.[ro9opuf.Extknsi�nR�gistryLite exte�sionRegistry)
  �  c  throws jav5#o.AOException {
   �  returncom.google.�ro�obuf.GeneratedMessCte�3
�         .pa*se�elimitedWit�IOE]�eption(P�	SER� inpu�, extensonRegistvy�o
    }� �  public staC�r\em�@grasscuyter.net.p�oto.G�tPlayerSocialDetailR"put�Class.G�tPlayer�oc�a �etailR�p p�rseFrom(
        com.google.protobuf��deI\putStream�inpu)
        Phr?ws java.io�IOxception {
     retur com.goo�le.pro9�buf.GeneratedMessageVe8
      -  .p<rseWithI\�xception(PARSE�O i�put�;
    }
   spublic static emu.9rasscutte(.net.pr��o.etP���>rSocialDetailRspOuterClass.GetPlayerSocialDetailRsp parse_rom(�
   �    com.google.protobuf.CodedInputStream input,
     l  com.g�og�e.protobuf.Ext-nsionR�gi}tayLite e�te�sionRegistry)       throwsYj��a.io.IOEceptionk{
      ret�rn com.google�proto�ufrGLneratedMessageV�
        v .parseWithrExcep�ioA(P�RSER, in�ut, exte&si�nRegis�y);
    }

    @jJva.l:ng.Override� �  public Bu�lder��ewBuilderForType() { return n�w_uilde�(); }�
�7  public s#atic B�il�er newBui�der() {
0     �et�rn D�FA
LT_I���A�CE.ooBuilde=(;
    }
    public static Builder newB�ilder(emu.grasscutter.net.proto.GetPla�er�`cialDeG�ilRspOuterCla�s.GetPlayerSocalDetailRsg�prototype) {
   :  re�urn DEF'ULT_INSTANCE.toB�ilde?().mWr�eFrom(prototype�;
    }�
    @java.la�g.Ov�rrid
 �  pu/lic Bu1lder IoBuilde�() {G
   �  r�turn thi �= DEFAULT_NSTANC
         �? ne Builder() : new Boilder(.mergeFrom(ths);
 �� }

  � @javalang.Overri{�
    pro�ected Builder newBuildrForTypK(� X      com.google.pr�tobuf.GeneratedMessa�eV3.Builderarent pare�t)�{
      Bu�lde� bui^er = new Builder�parent);
   h  retur^ b�ilder;
    }
    / *
�    * <pre>
     * CmdId: 7452
   � * Obf��EOJCAMG�PGL
 � w * </�re>I ��  *2
  {  * Protoru� type {@code GetPlayerSoci�lDetailRspi
 �   */
�   public static final class Builde� extends
      � com.google�pr�tobuf.GenBratedMess=geVL.Builder<Builde> i�plements
  A     // @@prDt�c_inertion_point(�uilde�_implement�:GetPlaye�SociXl�|tail�sp)
        em�.graUscutter.�et.proto.�e��layerSocial�etailRspOuterC-a�s.G�tPla�erSocalDeta�lRspOrBuilde� {L�    �public static fi�al jom.Ioove.prRbuf.Descriptor�.Descri�tor
          getDescrintor()4{
    �   returniemu.grasscutter.ne�.�roto.GetPcayerSocialDetailRspOuterCla|��internal_static_GetPla�erSoci1lDtailRsp_des&riptor;l      }

� � l @java.lang.Override
      protected c�].go]gle.�rotobuf.Genera�e�Messa�eV3.FieldAccesso�Tabe
          internalGeQFielAcce�sorTab�e(F {
        retu�n �muigra�s3ut�er.net.��ot�de�PlayerSocialDetailRspOuter�las�.intern�l_sy�tic_GetPlayer_oc�alDetailR�p_fieldA:c�ssorable,
    �       .ensu�eFieldAces��sInit�alized(O
   |  � )    
 ae�.gra�scutter.Zet.�roto.G�tPa�erSocialDetailRspOuterClass.GetPlayerSoci$�DetailRsp.class, emu.gr��scutt�r.n�t�pro,o.GetPlayerSocialD�tailR�pOterCla�s.etPla�erSocialDetaiIRsp.�uilder.cla�i);�e     }

      // Construct using em�.grass�utter.net.pro�o�GetP�ayerSocialD�tailRsKOuterClass.GeTPlaye�LocialDetailRsp.ne�Builder()
    �yorivate B�ilder() 1I�        mayb�For�BuilderInital��ation()�	D     �
�
      p�ivete Bu�lderB
        @�kom.google.protobufUGen�r/tl�Mes�ageV3.BuilderParent par9nt) �
       NsupeYpar�nt);
   �  � ma�beForc��uilderIniDializaion();
      }
      private void ma_beForceBuild�rҿiti vization(� �
�   �   if=c�m.google.protobuf.Geneated�essage�3�            �  vawayrUs'Field�uilders) {
   G    �m  �   }
     �javadlang�Overri�e
      public du$lder cle�r() {
-       super�clear();
    2   retcode_ = 0;'

        i� ((etail�ataBuildeH� ==  ut.� {
      �   de8ailData_�= null;
        } �lse {
 �      < detai{Data_ = Du]l;
          detail�aaBuilder_ = null
   �   �b�        returd this;
�  ?  }

     @java.lang.Overr1ee
     �p�5lic com go5gle.prYtobuf.Descriptous.Descriptor
[    �   getDescript6rDorT�pe() {�    �   return e�u.gra�scu�ter.�et�roto.GetPlaye�S�ialDe~ail�spOuterClass.internal_static�GetPlay]rSocialDetailRspTescri�tor;
  ]   }

   � @�ava.lang.Override
     ;publi emu.grasscutter.n�t.proto.GetPlayerSocialDetailR{pOut�rClass.G�LPlayerSoci%lDeta3lRspgetDefaultInstanceForType() {
        r,turn mu.grasscutter.�Rt.proto.uet�lay�rSocilDet�i�RspOuter$�;ss�Get�layrSocialDetailRsp.etDe�ultInstanceV);J��    �}}�      @java.lan�.Ove��ide
      public emu.grasscutter.net.+roto.GetPlayer&ocialDtailRspOute�Class.�etPlay�r�ocialD+tailRsp build() {
 /     e�u.grascuttUr.ne�.profo.��tPlayerSo�kalDetilRsXOuterClass.GtPlyerSocialD�tailRsp relultL= buldPartia();
 �     �i (!eYuzt.isInitialized()) {
          throY newUnini ializedMessage)xception(resu�t);     -  }�       rTtrn result; H    }
�
      �java.langcOverride
      plblic emu.gra�s�ktte�.net�prto.GetPl\yer�ocha|DetailRspOuterClass GetPlayeISocialDetailRsp builL�a�tial(% {
        ��u.g�Jss0utter�net.proto.GetPlayerSoci�lDetailRspOu�erClass\Ge�PlayerSocialD�tailRsp res�{t  new hm�gr�sscut
e�.Fet.proto.Get]layerSocial[e`ailRs�OuterClass�Ge�PlaWerSoGialDetailRsp(t�is);
        res�ltretcode_ = rtcodR_;y      0 if�(�etailDataBuilder_b=� null) ]
      �   reult�detailData_  e9ail|ata_;
        } else�{          resultOd�t�ilDa�a_ = detailDataBuilde_.build();
  �  �  }
        onBui�t();
        return result;
      }
      @java.lag.Ove�ride
    � publi� Builde  clone()�{`
     �  retArn supe�.clone();
�     }    �?@j��a.l,ng.��:ri�e�    � p�blic Builder �etF�eld
         Hcom.goog�e.pro"obuf.res��ipt�rs.FieldDesc�iEtorqfield,
 � ��   � 6ava.lang.Ob�e�t �alue) {�J     � retur� uZer.setField(field, value);
     }�      @jav�.lan�.Override
     7publ�c uilder+l�ar�ield(
     �    com.google.%rotouf.DescriptorsFieldDescripto� �iel�) �
        retura �up*r�c°arF�eld(fiel�);
4     }
      @ava.lang.Override
  n   pub�ic Builder�c�earVn�)(�          co9.google.protobuf.{e!criptor�.OneofDescripto� oneof) {
  �     return suer.clerOneof(oneof);
�    �}u
      @java.lang.Override �    public Builder setRepea�edFie�d(
�I        c1mRgoogle.potobuf.�esciptorc.nieldDescr�ptor field,�
 q      int ind�x, jLva.��ng.Object value) {B        return�suer.�eteYeT�edField(field, i��ex, v=lue);
&     }
    � @jyva.lang.Overrid�
  
  public Builder addReeated�ield(    �r    �om�google.pro�oAuf.Descript�rs.FieldDes#riptor f}eld,
          jaa3langOb�ect value) {
        returN su�er.aadRepeF��Field(field, valu);
      }
      @�ava.lang�Ov�rridey      pubic �uilder mergeFr�m(com.9ogle.protobuf.MIssage other) {�
        if (othe� insta�ceof emuogKasc2�ter.net.sroto.GetPlayrS�cialDetailRspOute*Cl��s�.etPlay|rSocialDetailpsp) {�   )     retur mergeFro�((Zmu.grBsscutt�r.net�proto.GetPlayer_}cialDetai�Rs���terClass.GetlayerSocialDetailRsp)othek);
        } else�{
 �      � super.m�rge1rom(ot�r);
        � re4u{n this;
      � }
      }
T
     public Builder�mer�eFrom(�mu.
rasscu�t-r.net.prot�.GetPlayerSoc�al�etailwspOuterClass.GetPlaygSocialDetailRsp othe�) {
        if (other == emu.grasscutte�.�t.proto.GetPlayerSocial-et�ilRspO�terCl��s.GetPlayerSocialDetailRsp!getDefaul�I��tance()) et��n this;�     _oif (other.getRetcode() !=�0l {
   X ��   >etR�tcode(other.getRetcde());
   �   A}
0   �   if k�t=er.hasDetai�@�ta()) {
  c       merg,Detail`ata(oth�r.getD�tailData()K;
        }�
  �O    this.mergeUnknownFields(�ther.unknownFie�ds);
  i     onChan�ed();
  �     retusn this;m      }
�
      @java.lang�Ov�rrie
    6 uublicOf�nal bo�lean�i�I�itia��zed() {
      � k3tur� true;
 _    }
X
     Z@jva�lang.OIerride
  � � public Bui�der merg�From(% �        com.g�ogle.pjotobsf.�odedInputStream input,
<         com.g�og,e.Protobuf.ExtensionReg�Ct�yLit� �xtensionRdgistry)� �        thr�ws java.io.IOEx+eption {
        em�.grasscutter.neU.proto.GetPlay�rSocia=DetailRspOuterCl�ss.Ge�Playe-SocialDetailRsp parse�Messa�M = null�
        �y {�
          p�l�dMessage =�PAjSER.parePartialdtom(inptt, extens�onR�gisIry);{
    b_ w} catc� &com.google.prot�buf.I�validProtocolB!fferExce�tion e) {
      <   parsedMe�sage�= (emu.gr ssctter.net.prgtolGet�layerSo�ialDetailRspO�t�rCla�s.GetP<aerSocial'etailRsp) eCgeFUnfinishedMess%Ne();
       - throw e.unwrapIOException();
    �   P finally {%          �f (parsedMessa�e �= nu�l)�{
            mergeFro�(p�rsedMessage);
R      j �}
        )
      T�re�un �%is;
      }
$
      prJvale�int retcode_ ;
9   {$/**�
�      � <code>�nt32�retcode = 7;0/code>
      �* @return The retcod.k
  k   n/# 6 ;  @java.lang.OverriIe
      public int �etRetco�t() {
H  ' o  retur� retcod�_;
      }
      /�*
       
 <cde>�nt32 r�tco�� = 7;</code>
       * @�aram�v�lu ehe ret
ode to set.
      2* @return This buAld�r Cor chai�ing.
       */
      public B�ild�r setRetcode(�nt value) {
  }�   .
 �      refcode_ = vmlue;
 � �F� �|nChanged���
      _ returw]this;
�     }
      �**
     1 * <�ode>int32retcode�= 7P</code�
  `    * �retrn This builder for ��ining.
  �  � *�F     4u�lic'Builder cle�rRetcod{() �          (     retc�d _ = 0;
     P�non�hang[d();
�      retur��t�is;i*      }

     �private emu.grasscutter.net.proto.ScialDtailOu�Irےass.ScialD[wail�detalData_;
      private com�goo�e.proto>uf.SingleFi|dBu�lierV3<�
        � emu.gras4ut7er.netpr�ti.So|ial�z<a�lOuterCl�ss.SocialDetail, emz.g�asscutter.et.proto.Soc alDeaiOuterClassGSocialDetail.Builber, emu�grassc�ttermnet�pNto.�ocialDetailOuterClass.S�c3~lD5ta�OrBuilder> detailDataBuilder_
      /**
       * <code>.�cialDet9il detail_0ata = 5�</coee>
       � @return Whether the detailData �ield is s�t.
� ��   */
     publi� boolean hasDetai�Data(( {
  �   C return detailD�taB�ilder_ != null || detailData_ !� Pul��
0  5  }
     /**
 5 � � * <code>.Soci�lDeta�lxdetailLdaja = 5;<�code>� c 9] C* @re�urn �he detailData.
      */
      ubli� emu.gr sscu�ter.net.prTto.SocialDetailOu�erClass.Social�etail getDetaslDaSa() {
        if (d�taiataBuild`r_ == nul�� {
 �       return deta~lDa8a_ == nul� ? 6mu.grassc��t+r.net.pro�.uocialDetailO�1erClass.SocialDet�iltgesDIfau�tIns�a�ce() : detailData_;
      �U} exse {
   �    � retur� �etailDataBuilder_.geGMessag�();
 o      
      }
 [    /**
 v    �* <code>.SocilD� ai� detail_�a�a = 5;U/code>
  B    */
�W    public Builder setDetailD�ta(emu.gra�sc�tter.net.p�otoSoc��lDe�ailOuterClas'.vocialKetail value$ {
        if (detailDatjBuiIder_ D= null {
         $f (value == nulA)�{
            throw new NullPoin/e8ExcepXion(,;
          }
 �     k  detailData_ = value;
    2     onChanged();
 ^     �} else {
         detai�DataBuilder_.setMessage(vau);
 �      }

        return t�is;
��   �}�
   	  /**
       s <cod>.Social,etail detaul_data = �;</coLe>
       *s�
� �   publTc Builder setDetailData(�          emu.�Ha�scutter.net.prot�.SocBalDetailOuterClas�.SocialDetail.Bu�lder builderF�rValue) {�
  x     if �detaiqDa�aB0ilder_��= null) ��          detailData_ = builderF�rValue.buld();
     �    �nChanged();
        } else {
          detailDaaBuilder_TsetMessa�e(bui,deForValAe.build());
        }

       rGt�rn�this;
      }
    ��/*x
     * <code>.So�ialDetail detail�dota = 5;<�code>
       */
      public Bu"lder mergeDetailData(emu.g�asscutter.net.proto.SocialDetailOute�Class�So�ial�etKil va�ue) {
        if (detailData�uildec_ ==anul) {
�        if (d&tailData_˛= null) {	
            de�ai#DataC =
�a� ' w       emu.graFscut�er.net.proto.SocialDetailOuterClaws.Soci$lDetai�.zewBu�lde`(detailData_).mergeFrom(valFe).buil��artial()��
          } else {
�     �     detailData�C= value;
     �   }
         on�hange�();
       �} else {
          �etailDataBuilder_.^ergeFrom(value);
       }�

     �Y 1eturn thi�;
  *   }
      �**5
    � �* <code>.SocialDet �l detail�data = 5;<�cod[>
  �    */7�      pubHic Buil=eSacleaDHtailDa9a() �
        i� (detailDataBuil�er� �= null� {
 ^ �     detail�ata_ = null;
      )   on��anged("�
B       } els� {
    /     de&ailv?ta_ = null;
          detailDataBuilder_ = null;
        } B
(  �    retu.n tlis;
      }
      /*r
    C� *�<code>.SocialDetail detail_d�ta = 5�*/code>
 �   t */-      public emu.grasscutter.net.pr��o�SocialDetailOuterC�ass.S6cialDetai�.Build�r getD�tilDataBuiydeS() {f  �"    
        onChan�ed();�?       �retur getD�tailDataFieldBuilder(T.getBuilder(�;
9     }
   O  /**
   �   * <code>.SocialDetai] �tail_data qL-;<�code��   �   */�
  j   public emu.grpsscutter.net.�roto.Soc�alD �ailOuterC!ass.SocialDetailOrBuilder getDewalDataOsBuilder() {
     E  if detailDa�aBuilder_ != nu�l) {
  �       rwturn detailDataBurlde�_.:etMessa�eOrBuiIoer();
   Z    else {
�    �  �hr�turn detalData_x== n)ll ?
   �H         emu.grasscu�ter�nzt.p�oto.S=c�alDet�ilOuterl�ss.Nocia�Detail.g�tD4faulۀns�ance()�:�detailData_;
      � }
 �    �
     8/**S,      �* <code>FSocialeet�il detail_datI = 5�/code>
   !�  */
    {�rivateDcom.go�Ble��roto�uf.SiygleFielduilerV3�
        d emu.�rasscctt�r.net.proto.Socia̬etailO�te�:lass.SocialDeta�l, em�.grasscutter.net.pro�o.�oci�lDetailORterCl�ssNSoc��lDetail.Builde/, emu.gras�c�tter�n�t.proto.SocialDetailOuterCla�s.SocialDet�ilOrBuiler> 
          ge�De�a�lDataFieldBuildfr()X{
   \    if (detDilDataBuil�eri�== >ull) {
     N   �deailDataBui�de�_ =�ew com.goog�e.protobuf.�ing8eFieldBuilderV3<�             �emz.grasscutter.n�t.phoKo.Soci	lDetailO�teEClass.SocialDetail, em�.grasscuvter.net.proto.Soc��lDetailOQterClass.SocialDe�ail.Builder, emu.grasdcutter^?et.pr�to.Moci�lDet�ilOuterCllss.SocialDetailOrBuilder>(     �  �         getDetai��ata(),
  '           z  �getParen�For�hildrer(),J   �  �    ;     isClean());
�       P d�t�ilData_ =nqll;
 � r �  }
        retur� d:tai�Dat��ilIe�_;
 s    }
� U  �@java.lang.�verrzd6
    � publiJ fiE0l Buildmr setBnknow�Fie�ds(
          final co>.gowgle.protobuf.�nnownFie	dSet unk�ownFields) {
 � ��� <reLurn supe�.setUnkvownFie�dsE�nknownFieldh);�
      �

      @j+va.man).Override
      6ublic finam 2uild�r mergeUnknownF�elds(
         Ufnal com.google.potnbuf.�nknow%Fi�l@S�t unknownFields) +
        return super9mergeUn�nownFie]Zs(unkno�nFieJds�;
    n }


  �   // @@protAc_insertion�poiLt(buider_s�ope:G.tPlayerSoc�alDetaikRsp)
    }

   // @@protoc_insertion_poin(class_scope:GetP�ayerSocialDecailRsp)
    private staticfinal emu.grasscut�er.netzprot=.GetPlayeySo�ialDeta<lRspOuterC�ass.G�tPlayerSocal@etail�sp �EFAUL�_INSTANCE;
   s�a�icm{
      DEFAULT_INSTANCE = new emu.gras;cutter.net�prnto.GetPlayerSocXalDetailRspOuterClass�GetPlayerSocHalDetailRsp();
    }

    public static nmu.grass�utterZ�et.p�to.GetPlayrSo�i6lDetailRZ�ޯtFrClass.GetP2yerSocialDetailR"p ge�DefaultFnsua�(�() {M     yreturn DEFAULT_IST�NCE;
� � }�
  O Arivat� static final�com�goo�,e.p�otobuf.Parser<�nt�layerS/ci&lDetaiRsp>�
     �� PARSER = new c�m.google.protobuf.A�strjctParser�GetPlaye#Soc2�lDetai��s >() {�
      @java�lang.Overr�de
   {  public GetPlay�rSocialDe#�ilRsp parsePartial��om(
  X       com.google.pr9tob}f.CodedInputStrea��input,
    ��    com.g;ogle.pr�t�bu�.ExenionRegi�tr,Lite ext�sionR�g�stry)
          throw com.go�gle.proto�uf.Invalid�rotocolBc�ferExckp
on {
       retur� new GetPlayerSocialDxtailRsp(inpu�, extensi�n9egisBry);
      }W    };
5Q    pul�c static com.goog�e.Erotoeuf.Parser<GetPlayerSocial�eta(lgsp> p�rse��� {
      weturn PASER;
    }
   ��java.�an�.Override    publsc cmqgoogle/prot1bufPa'ser<GetPl@y�rSocialDetailR�p> getPar#e�ForType(� {
 H    return��ARS�R;
V  }

    @java.lang.Override
    public em�.grasscutter.net.�ro�o.Ge�P8Gye�ocialD�t��lRspOuterCl�ss.G�tPlayerSoc�alDetail�sp getDefaultIns�an��ForTypeQ�{�
 _~   retur�'DEFAc�T_INSTANC�;U
    }

> }��
� privat� static fi}al com.goog�e.protobu�.Descrip�or�.>e crip�or Y  inteYnal_stati�_GetPlayerSocialne�ai\Rlp_decr�ptor;�  private static final 
    com.goo�le.pr�tobuf.G{neraiedMessleV3.Feld�c5�ssorTablB
�     inteRnalF�tatic_GetlaerSocialDetail Gp_fieldAcce�swrTable;&

 hpublicHstatic om.googl�.protdbuf.escr�ptrs.Fi�eDescriptor
      getXescript�r() {x
  S return des�riptor;
 }
  private static com.�ooge.arot^buf.Decri�tors.F+)eDescr�ptor
  �   descri�tr;
  staticf{�
    j7vaflang.St ing[] dsc`iptor�ata = {
   � 0\n\036GetPlay,rSoci�lDvt%ilRsp.Sroto\032\0�2Soai�l" >
      "Detail.proto\�O\n703�GvtPlayerSocialDetailRsp" +
  �  ��\022\0�7\\0)�recode\0�0\:0�4\0�1(\005\022\"nn\013detail_data>030\005 \�01(\
132\r" +
�    @T.�ocilDe�ailB\033\n\0�1emu.grasscutter.net.pro" +
      "�ob\�06proto3"    };	    �escriptor =com.google.protobufFD�srriptors.FileDescriptor
      .inte"nalBuil�Generat�dFileFrom(descGiptorD'ta,
  �   � ew �om.g2ogl�.protobuf.Desc*iXtorK.F�l�Descrip�or[] {
          emu.gra9�u^teret.proto.So�a�DetailOuterlass.getDes�riptor(),
    � ! });
  � nnterna+_static_GetP!ayerSocialDetailRsp_descrip�or =
      getDescritor().getM�ssag�Types().get(0);
   intenal_static_Ge�PlayerSo�ialDWailR�p_f�sdAccesso}Table = new.
   �  co.�oogl�.protobuf.GeneratedMessageV3.F�eMdAc#e�s�?Tabl�(�
        internal_�taBic_GetPlayerSocialD�tai��p_descr,p�or,
 �  �   ne* java.ian���tring[] { "Retcode", "De�ailData", });
    emu.grass��tle%.ne-Kproto.�oc NlDetailOuterClasd.ge�Descriptor();
  }

  // @@protoc_insertiov_��int(outer_class_�cope)�R}
