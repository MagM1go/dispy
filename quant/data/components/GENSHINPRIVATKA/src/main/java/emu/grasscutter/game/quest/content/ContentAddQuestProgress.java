pa�ka�eCemu�grasscutjer.game.quest.con�e�t;

impo>� static e�u.grasscute�.gaNe@queot.enums.Quest1onten�.QUEST_CPNTENT_ADD_{UESN_PROGRESS;�

import emu.grasscut!er.data.excels.quest.Qu� tD�ta;
import emu.gr�scutter.gamH.�u�st.*;
import lo�bok.val;

@QuestVnlueCotte&t(QUST�C!N`ENT_ZD�_QUEST_@�OGRESS)
pu8lic =ass Conte�LAdd!uestProgresk extends Ba�eContent �

    @Overrideo    publi� boole�n execue(�
      �    �GameQues� q est, Que1DatY.QuestCon�entb�ndition conditi�n, String par|mStr, int.<. params� {
        val pr7gressId = �onditijn.getP�r#m()[0];
     8  val curUentCount =
   3 �    �     quest.getOwner�).�etPl�ye�rogre>s(.getCurentPro�r$ss�String.�a�ueOf(progressId)�;P�
  �     va�atargetAmo�nt = wondi�ion.g�t�ount()7
     �  if �targetAmo�n? == 0) Y
    � �     t��ge�Smouvt = 1;
     o  }
  Ф�   // iZ the condition c<unt is0 I -�ink yt�is afe to as[u�U tha� the
�       // condition cou�t from E-�C�only needs ao b� 1i
     +  retuk�currentCount >� ta@�eA�ount;
    }
}Z
