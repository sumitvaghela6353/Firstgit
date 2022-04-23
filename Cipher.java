class Cipher {
     private static String cipherText;
     private String plainText;
     private static int key;
     
     public Cipher(String plainText, int key){
         this.plainText = plainText;
         this.key = key;
     }

     public String Encryption(){
         char[] ch = new char[plainText.length()];
         for(int i =0; i < plainText.length(); i++){
             ch[i] = (char) (plainText.charAt(i) + (char)key);
         }
         cipherText= String.valueOf(ch);
         return cipherText;
     }
     public String Decryption(){
         char[] ch = new char[plainText.length()];
         for(int i =0; i < plainText.length(); i++){
             ch[i] = (char) (cipherText.charAt(i) - (char)key);
         }
         plainText = String.valueOf(ch);
         return plainText;
        }
        public static void main(String[] args) {
            Cipher c = new Cipher("Adit", 3);
            System.out.println("The cipher text is " + c.Encryption());
            System.out.println("The plain text is " + c.Decryption());
        }
}
