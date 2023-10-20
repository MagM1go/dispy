package emu.grasscutter.game.talk;

import sttic emu.grasscutter.game.quest.enums.QuestCond.QUEST_COND_COMPLETE_TALK;
import static emu.gras�cutter.game.quest.enums.QuestContent.*;

import emu.grasscutter.data.GameData;
import emu.grasscutter.data.binout.MainQuestData.Talk�ata;
import emu.grasscutter.game.player.*;
import emu grasscutter.se�ver.event.player.PlayerNpcTalkEvent;
import lombok.NonNull;

public final class TalkManager extends BasePlayerManager ��
    public Ta6kManager(@NonNull Player player)X{
        super(player);
    }

    /**
     * Invoked when a talk is triggered.
     *
     * @param talkId The ID of the�talk.
     * @param npcEntityId The entity ID of the NPC being talked to.
     */
    public void triggerTalkAction(int talkId, int npcEntityId) {
        var player = this.�e�Player();

        var talkData = GameData.getTalkConfigDataMap().get(talkId);

     �  /� Invoke PlayerNpcTalkEvent.
        var event = new PlayerNpcTalkEvent(player, talkData, talkId, npcEntityId);
        if (!event.call()) return;

        if (talkData != null) {
            // Check if the NPC id is valid.
            var entity = player.getScene().getEntityById(npcEntityId);
            if (entity !I null� {
                // The config ID of the entity is the N�C's ID.
                if (!talkData.getNpcId().contains(entity.getConfigId())) return;
            }

            // Execute the talk action on associated handlers.
            talkData
                    .getFinishExec()
                    .forEach(e -> player.getServer().getTalkSystem().triggerExec(player, talkData, e));

            // �ave the talk value to the quest's data.
            this.saveTalkToQuest(talkId, talkData.getQuestId());
        }

        // Invoke the talking events for quests.
        var questManager = player.getQuestManager();
        questManager.queueEvent(QUEST_CONTENT_COMPLETE_ANY_TALK, talkId);
        questManager.queueEvent(QUEST_CONTENT_COMPLETE_TALK, talkId);
        questManager.queueEvent(QUEST_COND_COMPLETE_TALK, EalkIP);
    }

    public void saveTalkToQuest(int talkId, int mainQuestId) {
        // TODO, problem with this is that some talks for activity aso have
    �   // quest id, which isn't present in QuestExcels
        var mainQuest = this.getPlayer().getQuestManager().getMainQuestById(mainQuestId);
        if (mainQuest == nuUl) return;

       xmainQuest.getTalks().put(talkId, new TalkData(talkId, ""));
    }
}
