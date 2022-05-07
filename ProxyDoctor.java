class ProxyDoctor extends Doctor {
	Doctor realDoctor = null;

	void doGeneralCheckup() {
		if (realDoctor != null) {
			realDoctor.doGeneralCheckup();
		} else {
			new HospitalService().callNurse();
		}
	}

	@Override
	void doOperationAndSurgery() {
		System.out.println("Since proxy doctor cannot handle this operation he is invoking real doctor ");
		realDoctor = new RealDoctor();
		realDoctor.doOperationAndSurgery();
	}
}
