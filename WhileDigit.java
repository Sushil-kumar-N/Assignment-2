//count the number of digits in the given number
	//1234 ---4    234---3
	//1234/10 123 12 1 0
	public static void main(String[] args) {
		int num=1009876,count=0;
		
		while(num>0) {
			num=num/10;
			count++;
					}
		System.out.println("digit Count is"+count);
		
	}
