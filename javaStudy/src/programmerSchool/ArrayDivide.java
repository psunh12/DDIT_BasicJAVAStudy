package programmerSchool;

import java.util.Arrays;

/*
 * ���� �迭 numbers�� ���� num1, num2�� �Ű������� �־��� ��,
 * numbers�� num1�� ° �ε������� num2��° �ε������� �ڸ� ���� �迭�� return �ϵ���
 * solution �Լ��� �ϼ��غ�����.
 */

public class ArrayDivide {
    public int[] solution(int[] numbers, int num1, int num2) {
    	  int[] answer = new int[numbers.length];
    	  
    	  answer=Arrays.copyOfRange(numbers,num1,num2+1);
    	  
    	  return answer;
    }
}