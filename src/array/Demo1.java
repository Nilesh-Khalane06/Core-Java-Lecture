package array;



public class Demo1 {
	public static void main(String[] args) {
		int a=1;
		int b=2;
		int c=3;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		//non primitive array
		
		int[] aa= {10,12,13,41,56};
		
		System.out.println(aa[0]);
		System.out.println(aa[1]);
		System.out.println(aa[2]);
		System.out.println(aa[3]);
		System.out.println(aa[4]);
		//System.out.println(aa[5]);//it will throw exception
		
		System.out.println(aa.length);
		
		String[] arr= {"Nilesh","Khalane"};
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		
		//part 2 insertion of elements in array
		//Step 1 declaration of array (array type-int array length=)
		int[] rollNo=new int[3];
		//step 2 add element in a array
		
		rollNo[0]=12;
		rollNo[1]=12;
		rollNo[2]=12;
		//print elements
		System.out.println(rollNo[0]);
		System.out.println(rollNo[1]);
		System.out.println(rollNo[2]);
		
		String[] StudentName= new String[5];
		//insertion of elements
		StudentName[0]="Nilesh";
		StudentName[1]="Nakul";
		StudentName[2]="Chetan";
		StudentName[3]="Gopal";
		StudentName[4]="Rohit";
		//print elements
		System.out.println(StudentName[0]);
		System.out.println(StudentName[1]);
		System.out.println(StudentName[2]);
		System.out.println(StudentName[3]);
		System.out.println(StudentName[4]);
		
		
		//boolean array
		boolean[] name=new boolean[5];//boolean is store is only true or false
		//insertion element into the boolean array
		name[0]=true;
		name[1]=false;
		name[2]=true;
		//print elements
		System.out.println(name[1]);
		System.out.println(name[0]);
		System.out.println(name[2]);
		
		//double array
		double[] weight=new double[5];
		//insertion elements
		weight[0]=35;
		weight[2]=36.2;
		weight[3]=88.2;
		//print elements
		System.out.println(weight[0]);
		System.out.println(weight[2]);
		
	}
	

}
