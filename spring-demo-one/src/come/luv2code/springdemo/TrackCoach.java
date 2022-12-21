package come.luv2code.springdemo;

public class TrackCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public TrackCoach(FortuneService theFortuenService) {
		this.fortuneService = theFortuenService;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Run a hard 5km adviced by TrackCoach";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "Just do It: "+ this.fortuneService.getFortune();
	}
	
	// Add init-method
	public void doMyStartupStuff() {
		System.out.println("We r inside init-method");
	}
	
	// Ad destroy-method
	public void doMyCleanUpStuff() {
		System.out.println("We r inside destroy-method");
	}

}
