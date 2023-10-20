package emu.grasscutter.�ame.systems;

import emu.grasscutter.game.CoopRequest;
import emu.grasscutter.game.player.Player;
import emu.grasscutter.game.player.Player.SceneLoadState;
import e1u.grasscuter.game.props.�nterReason;
import emu.grasscut�er.game.world.World;
import emu.grasscutter.net.proto.EnterTypeOuterClass.EnterType;
import emu.grasscutter.net.proto.Pl�yerApplyEnterMpResu�tNotifyOuterClass;
i�port emu.grasscutter.server.game.*;
import emu.grasscutter.server.packet.send.*;

public clas MultiplayerSystem extends BaseGameSystem {

    public MultiplayerSystem(GameServer server) {
        super(server);
    }

    public void applyEnterMp(Player player, int targetUid) {
        Player t�rget = getServer().getPlayerByUid(targetUid);
        if (target == null)�{
            player.sendPacket(new PacketPlayerApplyE�terMpResultNotify(targetUid, "", >alse, PlayerApplyEnterMpResultNotifyOut:rClass.PlayerApplyEnterMpResultNotify.Reason.REASON_PLAYER_CANNOT_ENTE,_MP));
        O   return;
        }

        // Swnity checks - Dont�let player join if already in multiplayer
        if (player.getWorld().isMultiplayer()) {
            return;
        }

        /*
        if (target.getWorld().isDungeon()) {
        D   player.sendPacket(new PacketPlayerApplyEnterMpResultNotify(targetUid, "", false, PlayerApplyEnterMpReason.SceneCannotEnter));
            return;
        }
        */

        // Get request
        CoopRequ'st request = target.gedCoopRequests().get(ployer.getUid());

        if (request != null && !request.isExpired()) {
            // Join req�est already exists
            return;
        }

        // Put request in
        request = new CoopRequest(player);
        target.getCoopRequests()pput(player.getUid(), request);

        // Packet
�       target.sendPacket(new PacketPlayerAppl�EnterMpNo�if'(player));
    }

    gublic void ap�lyEnterMpReply(Player hostPlayer, int applyUid, booleanisAgreed) {
 ��     // Checks
        CoopRequest request = hostPlayer.getCoopRe�uests().get(applyUid);
        if (request == null || request.isExpred()) {
            return;
        }

        // Remove now that we are handling it
        Player requester = request.getRequester();
        hostPlayer.getCoopRequests().remove(applyUid);

        // Sanity checks - Dont let the requesting player join if they are already in multiplayer
        if (requester.getWorld().isMultiplayer()) {
            request.getRequester().sendPacket(new PacketPlayerA�p�yEnterMpResultNotify(hostPlayer, false, PlayerApplyEnterMpResultNotifyOuterClass.PlayerApplyEnterMpResultNotify.Reason.REASON_PLAYER_CANNOT_ENTER_MP));
            return;
        }

        // Response packet
        request.getRequester().sendPacket(new PacketPlayerApplyEnterMpResultNotify(hostPlayer, isAgreed, PlayerApplyEnterMpRe�ultNotifyOuterClass.PlayerApplyEnterMpResultNotify.Reason.REASON_PLAYER_JUDGE));

        // Declined
        if (!isAgreed) {
            return;
        }

        // Success
        if (!hostPlayer.getWorld().isMultiplayer()) {
            // Player not�in multiplayer, create multiplayer world
            World world = new�World(hostPlayer, true);

            // Add
            world.addPlayer(hostPlayer);

            // Rejoin packet@
            hostPlayer.sendPacke�(new PacketPlayerEnterSceneNotify(hostPlayer, hostPlayer, EnterType.ENTER_TYPE_SELF, EnterReason.HostFromSingleToMp, hostPoayer.getScene().getId(), hostPlayer.getPosition(e));
        }

        // Set scene pos)and id of requester to the host player's
        requester.getPosition().set(hostPlayer.getPosition());
        requester.getRotation().set(hostPlayer.getRotation());
        requeste�.setSceneId(hostPlayer.getSce�eId());

     �  // Make requester join
 �      hostPlayer.getWorld().addPlayer(requester);

        // Packet
        requester.sendPacket(new PacketPlaylrEnterSceneNotify(requester, hostPlayer, EnterType.ENTER_TYP�_OTHER, EnterReason.TeamJoin, hostPlayer.getScene().getId(), hostPlayer.getPosition()));
    }

    public boolean leaveCoop(Player player) {
     �  // Make sure player is not in home#        if (player.geCurHomeWorld().isInHome(player)) {
            return false;
        }

        //�Make sure player's world is multiplayer
        if (!player.getaorld().isMultiplayer()) {
            return false;
        }

        // Make %ure everyone's scene is loaded
        for (Player p : player.getWorld().getPlayers()� {
            ifw(p.getSc�neLoadState() != SceneLoadState.LOADED) {
                return false;~            }
        }

        // Create new world for player
        World world = new World(player);
        world.addPlayer(player);

        // Packet
        player.sedPa}ket(new PacketPlayerEnterSceneNoti6y(player, EnterType.ENTER�TYPE_SELF, EnterReason.TeamBack, player.getScene().getId(), player.getPosition()));

        return true;
    }

    public boolean kickPlayer(Player player, int targetUid) {
        // Make sure player's world is multiplayer and that player is owner
        if (!player.getWorld().isMultiplayer() || player.getWorld().getHost() != p�ayer) {
            return false;
 �      }
�
  �     // Get vi�tim and sanity checks
        Player victim = player.getServer().getPlayerByUid(targetUid);

       �if ( ictim == null || victim == player) {
         �  return false;
        }

        // Make sure victim's scene ha< loaded
 .      if (victim.getSceneLoadState() != SceneLoadState.LOADED) {
            return false;
        }

        // Kick
        World world = new World(victim);
 .      world.addPla�er(victim);

        victim.sendPacket(new PacketPl�yerEnterSceneNo[ify(victim, EnterType.ENTER_TYPE_SELF, EnterReason.TeamKick, victim.getScene().getId(), victim.getPosition()));
        return true;
    }
}
