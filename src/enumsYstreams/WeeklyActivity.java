package enumsYstreams;

import java.time.LocalTime;

public class WeeklyActivity {
	private DayOfTheWeek day;
	private LocalTime startTime;
	private LocalTime duration;
	private Sport sport;

	public WeeklyActivity(DayOfTheWeek day, LocalTime startTime, LocalTime duration, Sport sport) {
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

	public LocalTime getDuration() {
		return duration;
	}

	public void setDuration(LocalTime duration) {
		this.duration = duration;
	}

	public Sport getSport() {
		return sport;
	}

	public void setSport(Sport sport) {
		this.sport = sport;
	}

}
