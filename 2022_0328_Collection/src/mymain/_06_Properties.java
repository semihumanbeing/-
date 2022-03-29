package mymain;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class _06_Properties {

	public static void main(String[] args) throws IOException {
		/*
		 * Map & Properties 
		 * 1. ��� ����� �����ϴ�.(Key, value) ���·� ��ü�� ������ 
		 * 2. Map�� ��ü�� ��������Ҷ� �ַ� ����ϰ� Properties �� ���ڿ��� �Ӽ��� ������ �� �ַ� ����Ѵ�.
		 */
		
		// Properties: �Ӽ��� ��������ϴ� ��ü (DB��������)
		Properties prop = new Properties();
		
		// ���� �����ϴ� 2���� ���
		prop.put("driver", "oracle.jdbc.driver.OracleDriver");
		prop.setProperty("url", "jdbc.oracle.this:@localhost:1521:xe");
		prop.setProperty("userName", "scott");
		prop.setProperty("password", "tiger");
		
		// �� �о����
		String driver = prop.getProperty("driver");
		System.out.printf("driver: %s\n",driver);
		
		try {
			// ���Ϸκ��� db���������� �о����
			Properties dbProp = new Properties();
			FileReader fr = new FileReader("db.properties");
			dbProp.load(fr);
			
			//�� �Ӽ��� �о����
			String driver1 = dbProp.getProperty("driver");
			String url = dbProp.getProperty("url");
			String username = dbProp.getProperty("username");
			String password = dbProp.getProperty("password");
			
			System.out.println("���Ϸκ��� �о�� db����");
			System.out.printf("driver = %s\n", driver1);
			System.out.printf("url = %s\n", url);
			System.out.printf("username = %s\n", username);
			System.out.printf("password = %s\n", password);
			
			//���ϴݱ�
			fr.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
