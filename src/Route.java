import java.sql.Time;

public class Route	{
	private String Station_ID;
	private String Station_Name;
	private int Train_ID;
	private Time Arrival_Time;
	private Time Departure_Time;
	private int Distance;
	private int Stop_Number;
	public Route() { };
	public Route(String Station_ID,int Train_ID,Time Arrival_Time,Time Departure_Time,int Distance,int Stop_Number)
	{
		this.Arrival_Time=Arrival_Time;
		this.Departure_Time=Departure_Time;
		this.Station_ID=Station_ID;
		this.Distance=Distance ;
		this.Stop_Number=Stop_Number;
		this.Train_ID =Train_ID;
	}
	public String getStation_ID() {
		return Station_ID;
	}
	public void setStation_ID(String station_ID) {
		this.Station_ID = station_ID;
	}
	public String getStation_Name() {
		return Station_Name;
	}
	public void setStation_Name(String station_Name) {
		this.Station_Name = station_Name;
	}
	public int getTrain_ID() {
		return Train_ID;
	}
	public void setTrain_ID(int train_ID) {
		Train_ID = train_ID;
	}
	public Time getArrival_Time() {
		return Arrival_Time;
	}
	public void setArrival_Time(Time arrival_Time) {
		this.Arrival_Time = arrival_Time;
	}
	public Time getDeparture_Time() {
		return Departure_Time;
	}
	public void setDeparture_Time(Time departure_Time) {
		Departure_Time = departure_Time;
	}
	public int getDistance() {
		return Distance;
	}
	public void setDistance(int distance) {
		this.Distance = distance;
	}
	public int getStop_Number() {
		return Stop_Number;
	}
	public void setStop_Number(int stop_Number) {
		this.Stop_Number = stop_Number;
	}
	public String toString()
	{
		return (Train_ID + " | " + Station_ID + " | " + Arrival_Time + " | " + Departure_Time + " | " + Distance + " | " + Stop_Number);
	}
}