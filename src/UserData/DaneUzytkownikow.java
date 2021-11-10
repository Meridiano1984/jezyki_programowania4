package UserData;

import javax.swing.*;
import java.awt.*;
import java.util.HashMap;

public class DaneUzytkownikow {

    HashMap<String,String> daneUzytkownikow;

    public DaneUzytkownikow() {
        this.daneUzytkownikow = inicjalizacjaDanychUzytkownikow();
    }

    private HashMap<String,String> inicjalizacjaDanychUzytkownikow(){

        //KLUCZEM JEST LOGIN
        HashMap<String,String> noweDaneUzytkownikow = new HashMap<String, String>();

        noweDaneUzytkownikow.put("nowyLogin1","Hasło1");
        noweDaneUzytkownikow.put("nowyLogin2","Hasło1");
        noweDaneUzytkownikow.put("nowyLogin3","Hasło1");
        noweDaneUzytkownikow.put("nowyLogin4","Hasło1");
        noweDaneUzytkownikow.put("nowyLogin5","Hasło1");
        noweDaneUzytkownikow.put("nowyLogin6","Hasło1");
        noweDaneUzytkownikow.put("nowyLogin7","Hasło1");
        noweDaneUzytkownikow.put("nowyLogin8","Hasło1");
        noweDaneUzytkownikow.put("nowyLogin9","Hasło1");
        noweDaneUzytkownikow.put("nowyLogin10","Hasło1");
        noweDaneUzytkownikow.put("ala","ola");

        return  noweDaneUzytkownikow;
    }

    public static Color czyTakiuzytkownikIstnieje(JTextField userJTextField, JPasswordField passwordField){
        DaneUzytkownikow daneUzytkownikow = new DaneUzytkownikow();
        String user = userJTextField.getText();
        String password = new String(passwordField.getPassword());
        System.out.println(user + " haslo : " + password);
        if(daneUzytkownikow.daneUzytkownikow.containsKey(user) && daneUzytkownikow.daneUzytkownikow.containsValue(password)) return Color.GREEN;
        else if(daneUzytkownikow.daneUzytkownikow.containsValue(password) || daneUzytkownikow.daneUzytkownikow.containsKey(user)) return Color.ORANGE;
        else return Color.RED;
    }
}
