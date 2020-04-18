package src.model;


import org.mindrot.jbcrypt.BCrypt;

public class Passworld {
    private String passworld;
    private String salt = BCrypt.gensalt();


    public void setPassworld(String passworld) {
        checkPassworld(passworld);
    }

    public String getPassworld() {
        return passworld;
    }

    private void checkPassworld(String passworld){
        if(passworld.length() > 9)
        {
            int countDigit = 0;
            int countAlph = 0;
            for(int i = 0; i < passworld.length(); i++)
            {
                if( isLetter(passworld.charAt(i)) == true )
                {
                    countAlph++;
                }
                if( isNumeric(passworld.charAt(i)) == true )
                {
                    countDigit++;
                }

            }
            if(countAlph > 1 && countDigit > 2)
            {
                System.out.println("Passworld is Valid");
                this.passworld = BCrypt.hashpw (passworld, this.salt);
            }
            else System.out.println("Passworld is  not Valid");
        }
        else System.out.println("Passworld is  not Valid");
    }
    private boolean isNumeric(char ch) {

        return (ch >= '0' && ch <= '9');
    }

    private boolean isLetter(char ch) {
        ch = Character.toUpperCase(ch);
        return (ch >= 'A' && ch <= 'Z');
    }

    public String getSalt() {
        return salt;
    }

    public Passworld(String passworld) {
        this.passworld = passworld;
    }
}
