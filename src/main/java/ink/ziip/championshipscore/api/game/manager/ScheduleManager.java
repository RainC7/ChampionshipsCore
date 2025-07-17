
package ink.ziip.championshipscore.api.game.manager;

import ink.ziip.championshipscore.ChampionshipsCore;
import ink.ziip.championshipscore.api.BaseManager;
import ink.ziip.championshipscore.api.game.schedule.Schedule;
import ink.ziip.championshipscore.api.game.schedule.ScheduleAnalysis;
import ink.ziip.championshipscore.api.team.ChampionshipTeam;

import java.util.List;

public class ScheduleManager extends BaseManager {
    public ScheduleManager(ChampionshipsCore plugin) {
        super(plugin);
    }

    @Override
    public void load() {

    }

    @Override
    public void unload() {

    }

    public List<Schedule> getFutureSchedules() {
        return null;
    }

    public ScheduleAnalysis getScheduleAnalysis(int scheduleId) {
        return null;
    }

    public List<Schedule> getScheduleHistory() {
        return null;
    }
}
