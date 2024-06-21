package enumsYstreams;

import java.time.LocalTime;
import java.util.List;
import java.util.stream.Collectors;

public class WeeklyActivity {
	private DayOfTheWeek day;
	private LocalTime startTime;
	private int duration;
	private Sport sport;

	public WeeklyActivity(DayOfTheWeek day, LocalTime startTime, int duration, Sport sport) {
		super();
		this.day = day;
		this.startTime = startTime;
		this.duration = duration;
		this.sport = sport;
	}

	public DayOfTheWeek getDay() {
		return day;
	}

	public void setDay(DayOfTheWeek day) {
		this.day = day;
	}

	public LocalTime getStartTime() {
		return startTime;
	}

	public void setStartTime(LocalTime startTime) {
		this.startTime = startTime;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public Sport getSport() {
		return sport;
	}

	public void setSport(Sport sport) {
		this.sport = sport;
	}

	public int calculateCost() {
	    int baseCostPerHour = getBaseCostPerHour();
	    int complexityCost = sport.getComplexity() * 200;
	    return (baseCostPerHour + complexityCost) * duration;
	}

	private int getBaseCostPerHour() {
	    switch (day) {
	        case THURSDAY:
	        case FRIDAY:
	        case SATURDAY:
	        case SUNDAY:
	            return 1000;
	        default:
	            return 500;
	    }
	}
	

    

}
