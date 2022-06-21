import java.util.Scanner;

public class SubstitutionCipher implements MessageEncoder, MessageDecoder {

	private int move;

	SubstitutionCipher(int shift) {

		this.move = shift;

	}

	@Override
	public String encode(String plainText) {

		char[] arr = plainText.toCharArray();
		for (int i = 0; i < arr.length; i++) {

			arr[i] = (char) (arr[i] + move);

		}
		String encoded = new String(arr);
		return encoded;
	}

	@Override
	public String decode(String cipherText) {
		
		char[] arr2 = cipherText.toCharArray();
		for (int i = 0; i < arr2.length; i++) {

			arr2[i] = (char) (arr2[i] - move);

		}

		String decoded = new String(arr2);
		return decoded;
	}

}
