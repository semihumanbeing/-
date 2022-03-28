package myutil;

public class MyArrayList {

	Object[] data;

	// data �迭�� ������ ���ϴ� �޼���

	public int size() {
		return (data == null) ? 0 : data.length;
	}

	public void add(Object ob) {

		// �⺻���� +1
		Object[] im = new Object[this.size() + 1];
		// ���������� -> im�迭�� �ű��
		for (int i = 0; i < size(); i++) {
			im[i] = data[i];
		}

		// im�迭 ������ĭ�� �߰������� �ֱ�
		im[size()] = ob;

		// im �迭 = �����迭 + 1
		data = im;
	}

	public Object get(int index) throws Exception {

		// �ȵǴ� ����
		if (index < 0 || index >= size()) {
			String message = String.format("������ 0~%d ", index);
			throw new Exception(message);
		}
		return data[index];
	}

	public void remove(int index) throws Exception {
		if (index < 0 || index >= size()) {
			String message = String.format("������ 0~%d ", index);
			throw new Exception(message);
		}
		// �����Ͱ� 1���� �������
		if (size() == 1) {
			data = null;
			return;
		}

		// ���� �����ͺ��� 1�� ���� ����
		Object[] im = new Object[size() - 1];

		for (int i = 0; i < im.length; i++) {
			if (i < index) { // ������ index���� ������ �״�� ����
				im[i] = data[i];
			} else {
				im[i] = data[i + 1];
			}
			
		}
		data = im;

	}
}
