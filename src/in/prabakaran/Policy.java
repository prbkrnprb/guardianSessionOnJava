package in.prabakaran;
 
 
class Policy{
    private double basePremium;
    private double riderPremium;
    private double totalPremium;
    private String policyNo;
   
    public Policy(){
        basePremium = 1_000;
        riderPremium = 100;
        totalPremium = 1_100;
    }
   
    public double getBasePremium(){
        return basePremium;
    }
   
    public void setBasePremium(double basePremium){
        this.basePremium = basePremium;
        setTotalPremium();
    }
   
    public double getRiderPremium(){
        return riderPremium;
    }
   
    public void setRiderPremium(double riderPremium){
        this.riderPremium = riderPremium;
        setTotalPremium();
    }
   
    public double getTotalPremium(){
        return basePremium;
    }
   
    private void setTotalPremium(){
        totalPremium = basePremium + riderPremium;
    }   
    
    public String getPolicyNo(){
    	return policyNo;
    }
    
    public void setPolicyNo(String policyNo) throws PolicyException{
    	if(policyNo.length() > 7)
    		this.policyNo = policyNo;
    	else
    		throw new PolicyException("Policy number invalid",policyNo);
    }
}
