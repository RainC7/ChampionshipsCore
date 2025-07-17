
package ink.ziip.championshipscore.command.schedule;

import ink.ziip.championshipscore.command.BaseMainCommand;

public class ScheduleMainCommand extends BaseMainCommand {
    public ScheduleMainCommand() {
        super("schedule");
        addSubCommand(new ScheduleListSubCommand());
        addSubCommand(new ScheduleAnalysisSubCommand());
        addSubCommand(new ScheduleHistorySubCommand());
    }
}
