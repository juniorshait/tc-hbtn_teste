import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Person {


    boolean checkUser(String user){
        if(user.length()>= 8 && !encontrandoCaracterEspecial(user)){
            return true;
        }else {
            return false;
        }
    }

    boolean checkPassword(String password){
        if(encontrandoCaracterEspecial(password) && encontrandoMaiusculaENumero(password) && password.length()>= 8){
            return true;
        }else{
            return false;
        }
    }

    boolean encontrandoCaracterEspecial(String user) {
        boolean especial = false;
        for (char c : user.toCharArray()) {
            if (Character.isLetter(c)) {
            } else if (Character.isDigit(c)) {
            } else {
               especial = true;
            }
        }
        return especial;
    }

    boolean encontrandoMaiusculaENumero(String password){
       boolean maiusculas =false , numeros = false;
        for (int i = 0; i < password.length(); i++) { // para todos os caracteres da string
            char c = password.charAt(i); // pegar o caractere
            if (Character.isUpperCase(c)) {
                maiusculas = true;
            } else if (Character.isDigit(c)) {
                numeros = true;
            }
        }
        if(numeros == true && maiusculas == true){
            return true;
        }else{
           return false;
        }
    }


}
