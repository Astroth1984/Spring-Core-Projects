package come.luv2code.springdemo;

public class CricketCoach implements Coach {
	
	private FortuneService fortuneService;
	private String email;
	private String team;
	
	// Create no-arg constructor
	// Cuz Spring will Call this constructor to create this bean
	public CricketCoach() {
		System.out.println("we r inisde non-arg constructor");
	}
	
	// Setter method for the injection
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("we r inisde the setter injection method");
		this.fortuneService = fortuneService;
	}


	
	public String getEmail() {
		return email;
	}

	public String getTeam() {
		return team;
	}

	public void setEmail(String email) {
		System.out.println("we r inisde the setter injection method Email");
		this.email = email;
	}

	public void setTeam(String team) {
		System.out.println("we r inisde the setter injection method Team");
		this.team = team;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Practice Bowling for 15 minutes";
	}

	
	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
