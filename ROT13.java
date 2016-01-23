//Author: Mike Jones
// decrypts a message using the ROT13 system and diplays the translation



import java.util.Scanner;

public class ROT13{
   public static void main (String [] args){
      
      String a = Rot13("Vfnnp Nfvzbi'f Guerr Ynjf bs Ebobgvpf: ");  
      String b = Rot13("N ebobg znl abg vawher n uhzna orvat be, guebhtu vanpgvba, nyybj n uhzna orvat gb pbzr gb unez. ");     
      String c = Rot13("N ebobg zhfg borl beqref tvira vg ol uhzna orvatf rkprcg jurer fhpu beqref jbhyq pbasyvpg jvgu gur Svefg Ynj. ");
      String d = Rot13("N ebobg zhfg cebgrpg vgf bja rkvfgrapr nf ybat nf fhpu cebgrpgvba qbrf abg pbasyvpg jvgu gur Svefg be Frpbaq Ynj.");
   
      System.out.println(a);
      System.out.println(b);// divide into four statements
      System.out.println(c);
      System.out.println(d);
   
   }
   public static String Rot13(String s){
   
      StringBuilder x = new StringBuilder(s.length());//use stringbuilder method to create x
      char[] a = s.toCharArray();// empty character array
   
      for (char c : a){//fill the array
      
         if (c >= 'a' && c <= 'm') c += 13;
         
         else if (c >= 'n' && c <= 'z') c -= 13;
         
         else  if (c >= 'A' && c <= 'M') c += 13;
         
         else  if (c >= 'N' && c <= 'Z') c -= 13;
         
         x.append(c);//add to stringbuilder
         
              
      }
      return x.toString();//return as a string
            
   }
}