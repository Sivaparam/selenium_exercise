package jan14;

public class TestRunner {
	
	public void runInpatient() {
		MRSInpatientPage objInpatient = new MRSInpatientPage();
		objInpatient.launchBrowser();
		objInpatient.loginInfo();
		objInpatient.selectInpatient();
		objInpatient.loginClick();
		objInpatient.selectPatientRec();
		objInpatient.selectActiveVisit();
		objInpatient.selectRegisterPat();
		objInpatient.selectVitals();
		objInpatient.selectAppointment();
		objInpatient.selectReport();
		objInpatient.selectData();
		objInpatient.selectMetadata();
		objInpatient.selectAdmin();
		objInpatient.logout();
		objInpatient.closeBrowser();
	}

	public void runIsolation() {
		MRSIsolationPage objIsolation = new MRSIsolationPage();
		objIsolation.launchBrowser();
		objIsolation.loginInfo();
		objIsolation.testIsolation();
		objIsolation.loginClick();
		objIsolation.selectPatientRec();
		objIsolation.selectActiveVisit();
		objIsolation.selectRegisterPat();
		objIsolation.selectVitals();
		objIsolation.selectAppointment();
		objIsolation.selectReport();
		objIsolation.selectData();
		objIsolation.selectMetadata();
		objIsolation.selectAdmin();
		objIsolation.logout();
		objIsolation.closeBrowser();
	}

	public void runLaboratory() {
		MRSLaboratoryPage objLaboratory = new MRSLaboratoryPage();
		objLaboratory.launchBrowser();
		objLaboratory.loginInfo();
		objLaboratory.testLaboratory();
		objLaboratory.loginClick();
		objLaboratory.selectPatientRec();
		objLaboratory.selectActiveVisit();
		objLaboratory.selectRegisterPat();
		objLaboratory.selectVitals();
		objLaboratory.selectAppointment();
		objLaboratory.selectReport();
		objLaboratory.selectData();
		objLaboratory.selectMetadata();
		objLaboratory.selectAdmin();
		objLaboratory.logout();
		objLaboratory.closeBrowser();
	}

	public void runOutpatient() {
		MRSOutpatientPage objOutpatient = new MRSOutpatientPage();
		objOutpatient.launchBrowser();
		objOutpatient.loginInfo();
		objOutpatient.testOutpatient();
		objOutpatient.loginClick();
		objOutpatient.selectPatientRec();
		objOutpatient.selectActiveVisit();
		objOutpatient.selectRegisterPat();
		objOutpatient.selectVitals();
		objOutpatient.selectAppointment();
		objOutpatient.selectReport();
		objOutpatient.selectData();
		objOutpatient.selectMetadata();
		objOutpatient.selectAdmin();
		objOutpatient.logout();
		objOutpatient.closeBrowser();

	}

	public void runPharmacy() {
		MRSPharmacyPage objPharmacy = new MRSPharmacyPage();
		objPharmacy.launchBrowser();
		objPharmacy.loginInfo();
		objPharmacy.testPharmacy();
		objPharmacy.loginClick();
		objPharmacy.selectPatientRec();
		objPharmacy.selectActiveVisit();
		objPharmacy.selectRegisterPat();
		objPharmacy.selectVitals();
		objPharmacy.selectAppointment();
		objPharmacy.selectReport();
		objPharmacy.selectData();
		objPharmacy.selectMetadata();
		objPharmacy.selectAdmin();
		objPharmacy.logout();
		objPharmacy.closeBrowser();
	}

	public void runRegistration() {
		MRSRegistrationPage objRegistration = new MRSRegistrationPage();
		objRegistration.launchBrowser();
		objRegistration.loginInfo();
		objRegistration.testRegistrationDesk();
		objRegistration.loginClick();
		objRegistration.selectPatientRec();
		objRegistration.selectActiveVisit();
		objRegistration.selectRegisterPat();
		objRegistration.selectVitals();
		objRegistration.selectAppointment();
		objRegistration.selectReport();
		objRegistration.selectData();
		objRegistration.selectMetadata();
		objRegistration.selectAdmin();
		objRegistration.logout();
		objRegistration.closeBrowser();
	}

	public static void main(String[] args) {
		TestRunner obj1 = new TestRunner();
		obj1.runInpatient();
		obj1.runIsolation();
		obj1.runLaboratory();
		obj1.runOutpatient();
		obj1.runPharmacy();
		obj1.runRegistration();

	}

}
