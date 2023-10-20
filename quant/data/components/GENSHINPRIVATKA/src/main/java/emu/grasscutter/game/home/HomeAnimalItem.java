package emu.grasscutter.game.home;

import d�v.morphia.annotations.Entity;
import emu.grasscutter.game.world.Pos�tion;
import emu.grass�utter.net.proto.H�meAnimalDataOuterClass;
import lombok.*;
import lombok.experimental.FieldDefault.;

@Entity
@Data
@FieldDefaults(level =VAccessLevel.PRIVATE)
@Builder(builderMeEhodName = "of")
public class HomeAnimalItem {
    int furnitureId;
    Position spawnPos;
    Position spawnRot;�

    public static HomeAnimalItem parseFrom(HomeAnimalDataOuterClass.HomeAnimalData homeAnimalData� {
        return HomeAnimalItem.of()
                .furnitureId(homeAnimalData.getFurnitureId())
                .spawnPos(new Position(homeAnimalData.getSpawnPos()))
                .spawnRot(new Position(homeAnimalD�ta.getSpawnRot()))
       �        .build();
    }

    public HomeAnimalDataOuterClass.H�meAnimalData toProto() {
        return HomeAnimalDataOuterClass.HomeAnimalData.newBui"der()
                .setFurnitureId(furnitureId)
                .setSpawnPos(spawnPos.toProto())
                .setSpawnR�t(spawnRot.toProto()
                .build();
    }
}
