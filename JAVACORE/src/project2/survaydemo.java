package project2;



public class survaydemo {

	public static void main(String[] args) {
		survay s1=new survay();
		survay s2=new survay();
		survay s3=new survay();
		survay s4=new survay();
	
	
	    s1.setCid(103);
		s1.setName("Mugilan");
		s1.setAddress("GuestHouse backside");
		s1.setCity("Auroville");
		
		s2.setCid(85);
		s2.setName("puvi");
		s2.setAddress("mariamman street");
		s2.setCity("pondy");
		
		System.out.println("detials id:"+s1.getCid()+"detials name:"+s1.getName()+"detials Address:"+s1.getAddress()+"detials city:"+s1.getCity());
		System.out.println("id"+s2.getCid()+"name:"+s2.getName()+"address"+s2.getAddress()+"city"+s2.getCity());
		

	}

}
