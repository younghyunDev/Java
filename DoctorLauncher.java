
public class DoctorLauncher {
public static void main(String[] args) {
	//create an object
	Doctor doctor = new Doctor();
	FamilyDoctor fdoctor= new FamilyDoctor();
	Surgeon sdoctor =new Surgeon();
	
	//Initialize the instance variable
	doctor.workAtHospital=false;
	fdoctor.workAtHospital=false;
	sdoctor.workAtHospital=false;
	
	//print instance variable
	System.out.println("Doctor: "+doctor.workAtHospital);
	System.out.println("FamilyDoctor: "+fdoctor.workAtHospital);
	System.out.println("Surgeon: "+sdoctor.workAtHospital);
	
	
	//execute each method
	doctor.treatPatient();
	fdoctor.treatPatient();
	fdoctor.giveAdvice();
	fdoctor.makeHouseCall();
	sdoctor.treatPatient();
}
}
