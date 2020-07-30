package step4;
public class Ex22_1 {
	public static void main(String[] args) {
		String nameData = "";
		nameData+=	"100001/이만수";nameData += "\n";		
		nameData += "100002/이영희";nameData += "\n";
		nameData += "100003/유재석";nameData += "\n";
		nameData += "100004/박명수";nameData += "\n";
		nameData += "100005/최여정";nameData += "\n";
		nameData += "100006/박병욱";
		
		String  moneyData = "";
		moneyData += "100001/600";moneyData += "\n";	
		moneyData += "100003/7000";moneyData += "\n";		
		moneyData += "100001/100";moneyData += "\n";		
		moneyData += "100002/400";moneyData += "\n";		
		moneyData += "100001/600";moneyData += "\n";		
		moneyData += "100004/900";moneyData += "\n";		
		moneyData += "100001/130";moneyData += "\n";		
		moneyData += "100003/200";moneyData += "\n";		
		moneyData += "100002/700";moneyData += "\n";	
		moneyData += "100002/900";moneyData += "\n";
		moneyData += "100004/800";
		
		// 문제) moneyData 와 nameData 를 조합해서 아래와같이 만들어보세요
		String userData = "";
		String arr[] = nameData.split("\n");
		String user[][] = new String[arr.length][2];
		
		for(int i = 0; i<arr.length; i++) {
			user[i][0] = arr[i].substring(0, 6);
			user[i][1] = arr[i].substring(7);
		}
		
		String ar[] = moneyData.split("\n");
		String money[][] = new String[ar.length][2];
		
		for(int i = 0; i<ar.length; i++) {
			money[i][0] = ar[i].substring(0, 6);
			money[i][1] = ar[i].substring(7);
			
		}
		
		for(int i = 0; i<ar.length; i++) {
			userData += money[i][0]; userData += "/";
			
			for(int j = 0; j<arr.length; j++) {
				if(money[i][0].equals(user[j][0])) {
					userData += user[j][1]; userData += "/";
				}
			}
			userData += money[i][1]; userData += "\n";
		}
		
		System.out.println(userData);

		/*
		 * 100001/이만수/600
		 * 100003/유재석/7000
		 * 100001/이만수/100
		 * 100002/이영희/400
		 * 100001/이만수/600
		 * 100004/박명수/900
		 * 100001/이만수/130
		 * 100003/유재석/200
		 * 100002/이영희/700
		 * 100002/이영희/900
		 * 100004/박명수/800
		 */
	
	}
}
