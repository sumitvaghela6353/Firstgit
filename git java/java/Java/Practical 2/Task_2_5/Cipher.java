class Cipher{
	//Field
	private String plainText;
	private String cipherText;
	private int key;
	
	//methods
	public Cipher(String plainText, int key){
			this.plainText = plainText;
			this.key = key;
	}
	
	public String encryption(){
		char[] ch = new char[plainText.length()];
		for(int i=0; i<plainText.length(); i++){
			ch[i] = plainText.charAt(i) + (char)key;
		}
		cipherText.valueOf(ch);  
		return cipherText;
	}
		
	public String decryption(){
		char ch[] = new char[plainText.length()];
		for(int i=0; i<plainText.length(); i++){
			ch[i] = cipherText.charAt(i) - (char)key;
		}
		plainText.valueOf(ch);
		return plainText;
	}
}