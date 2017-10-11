package in.prabakaran;

public class MainClass {
	public static void main(String args[]){
		Policy policy = new Policy();
		policy.setBasePremium(2_000);
		policy.setRiderPremium(1_000);
		policy.setPolicyNo("L000000");
		System.out.println(policy.getTotalPremium());
	}
}
