import java.util.*;

public class Test02{
    public static void main(String[] args){
		String str = "ͳ��һ���ַ����ַ����е�����λ��";
		Scanner scanner = new Scanner(System.in);
		System.out.print("������Ҫ���ҵ��ַ���");
		String content = scanner.next();
		char first = content.charAt(0);
		// �������� ������� ƥ���ַ���λ��
		byte[] pos = {};
		// charAt()����
		for(int i=0; i<str.length(); i++){
			char c = str.charAt(i);
			//��c�������ַ����Ƚ�
			if(c == first){
				//��������
				pos = Arrays.copyOf(pos,pos.length+1);
				pos[pos.length-1] = (byte)i;
			}
		}
		System.out.print(Arrays.toString(pos));
	}
}