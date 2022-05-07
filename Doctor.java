public abstract class Doctor {

	void doGeneralCheckup() {
		new HospitalService().callNurse();
	}

	abstract void doOperationAndSurgery();

	void provideSummaryandReport() {
		new HospitalService().generateSummaryRepor();
	}
}
