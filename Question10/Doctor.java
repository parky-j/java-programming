import java.time.LocalDateTime;

public class Doctor{
	private int doctorID;
	private String doctorName;
	
	public Doctor(int doctorID, String doctorName){
		this.doctorID = doctorID;
		this.doctorName = doctorName;
	}

	public int getDoctorID(){
		return doctorID;
	}
	public String getDoctorName(){
		return doctorName;
	}
	
	public String toString(){
		return "Doctor name: " + doctorName + " id: " + doctorID;
	}
}