package programmerSchool;
/*������ ��� �迭 array�� ���� n�� �Ű������� �־��� ��,
 * array�� n�� �� �� �ִ� ���� return �ϵ��� solution �Լ��� �ϼ��غ�����.
 */
 

public class JungbokNumber {
    public int solution(int[] array, int n) {
    	int answer = 0;
    	
        for(int i =0;i<array.length;i++) {
        	if(array[i]==n) {
        		answer++;
        	}
        }
        return answer;
    }
}
