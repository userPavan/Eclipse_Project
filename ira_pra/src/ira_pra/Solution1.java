package ira_pra;


import java.util.Scanner;

public class Solution1 extends Phone {
	

	public Solution1(int phoneId, String os, String brand, int price) {
		super(phoneId, os, brand, price);
		
	}
	
	static int findPriceForGivenBrand(Phone[] obj1,String bran) {
		/*findPriceForGivenBrand method: 
		 * This method will take two input parameters 
		 * - array of Phone objects and string parameter brand. 
		 * The method will return the sum of the price attribute 
		 * from phone objects for the brand passed as parameter. 
		 * If no phones with the given brand is present in the array of phone objects,
		 *  then the method should return 0.*/
		int sum=0;
		for(int i=0;i<obj1.length;i++) {
			if(obj1[i].getBrand().equalsIgnoreCase(bran)) {
				sum=sum+obj1[i].getPrice();
			}
			else {
				return 0;
			}
		}
		return sum;
	}
	
	static Object getPhoneIdBasedOnOs(Phone[] obj1,String Os) {
		/*    public static Phone getPhoneIdBasedOnOs(Phone[] phones, String os)
      {
          Phone temp = null;
          for(int i = 0;i<phones.length;i++){
              if(phones[i].getOS().equalsIgnoreCase(os) && phones[i].getPrice()>=50000){
                  temp = phones[i];
                  return temp;
              }
          }
          return temp;
      }
}*/
		//ArrayList<Phone> obj2=new ArrayList<Phone>();
		//<Phone> obj3=new ArrayList<Phone>();
		Phone temp = null;
		for(int i=0;i<obj1.length;i++) {
			if(obj1[i].getOs().equalsIgnoreCase(Os)&&obj1[i].getPrice()>=50000) {
				temp=obj1[i];
				return temp;
			}
			
		}
		return temp;
	}
	

	public static void main(String[] args) {
		
		
		Scanner obj=new Scanner(System.in);
		Phone[] obj1=new Phone[4];
		for(int i=0;i<obj1.length;i++)
		{
			int phoneId=obj.nextInt();
			//obj.nextLine();
			String os=obj.next();
			//obj.nextLine();
			String brand=obj.next();
			int price=obj.nextInt();
			
			obj1[i]=new Phone(phoneId,os,brand,price);
		}
		obj.close();
		//obj.nextLine();
		String bran=obj.next();
		//obj.nextLine();
		String Os=obj.next();
		
		int ans1=findPriceForGivenBrand(obj1,bran);
		if(ans1==0) {
			System.out.println("The given Brand is not available");
		}
		else {
			System.out.println(ans1);
		}
		
		Phone ans2= (Phone) getPhoneIdBasedOnOs(obj1,Os);
		if(ans2!=null) 
		{
			System.out.println(ans2.getPhoneId());
			
		}
		else 
		{
			System.out.println("No phones are available with specified os and price range");
		}
		
		

	}

}
