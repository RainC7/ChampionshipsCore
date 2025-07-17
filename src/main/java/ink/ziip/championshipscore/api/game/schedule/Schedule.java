
package ink.ziip.championshipscore.api.game.schedule;

import ink.ziip.championshipscore.api.object.game.GameTypeEnum;
import ink.ziip.championshipscore.api.team.ChampionshipTeam;
import lombok.Data;

@Data
public class Schedule {
    private int id;
    private ChampionshipTeam team1;
    private ChampionshipTeam team2;
    private GameTypeEnum gameType;
    private String area;
    private double predictedWinRate;
}
