package enumsYstreams;

import java.util.List;
import java.util.stream.Collectors;

public class Municipality {
	private List<WeeklyActivity> listOFWeeklyActivity;

	public Municipality(List<WeeklyActivity> listOFWeeklyActivity) {
		super();
		this.listOFWeeklyActivity = listOFWeeklyActivity;
	}

	public List<WeeklyActivity> getListOFWeeklyActivity() {
		return listOFWeeklyActivity;
	}

	public void setListOFWeeklyActivity(List<WeeklyActivity> listOFWeeklyActivity) {
		this.listOFWeeklyActivity = listOFWeeklyActivity;
	}
	
    public static List<WeeklyActivity> getSoccerActivities(List<WeeklyActivity> activities) {
        return activities.stream()
                .filter(activity -> activity.getSport() == Sport.SOCCER)
                .collect(Collectors.toList());
    }
    
    public List<WeeklyActivity> getActivitiesOfComplexity(int complexity) {
        return listOFWeeklyActivity.stream()
                .filter(activity -> activity.getSport().getComplexity() == complexity)
                .collect(Collectors.toList());
    }

	
}
