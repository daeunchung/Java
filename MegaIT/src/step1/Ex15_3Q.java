package step1;
// # �ݺ��� �⺻���� [2�ܰ�]
public class Ex15_3Q {
	public static void main(String[] args) {
		int i = 1;
		int sum = 0;
		
		// ����1) 1~5������ �� ���
		// ���� 1) 15
		while(i <= 5) {
			sum += i;
			System.out.print(sum + " ");
			i++;
		}
		System.out.println();
		
		
		// ����2) 1~10���� �ݺ��� 3�̸� 7�̻� ���
		// ����2) 1, 2, 7, 8, 9, 10

		i = 1;
		while(i < 11) {
			if(i < 3 || i >= 7) {
				System.out.print(i + " ");
			}
			i++;
		}
		System.out.println();
		
		
		// ����3) ����2�� ���ǿ� �´� ������ �� ���
		// ����3) 37

		sum = 0;
		i = 1;
		while(i < 11) {
			if(i < 3 || i >= 7) {
				sum += i;
			}
			i++;
		}
		System.out.println("sum = " + sum);
		
		
		// ����4) ����2�� ���ǿ� �´� ������ ���� ���
		// ����4) 6
		int count = 0;
		i = 1;
		while(i < 11) {
			if(i < 3 || i >= 7) {
				count += 1;
			}
			i++;
		}
		System.out.println("count = " + count);
	}

}
