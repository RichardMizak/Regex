package RegexProject;

public class NoRegex {
    public boolean validateSPZ(String text){
        if (text==null)
            return false;
        text=text.toUpperCase().trim();
        if (text.length()!=7)
            return false;
        for (int i=0;i<=1;i++){
            if (!Character.isLetter(text.charAt(i)));
            return false;
        }
        for (int i=2;i<=6;i++){
            if (!Character.isLetterOrDigit(text.charAt(i)));
            return false;
        }
        return true;
    }
    public  boolean validateID(String text){
        if (text==null)
            return false;
        text=text.toUpperCase().trim();
        if (text.length()!=8)
            return false;
        for (int i=0;i<=1;i++){
            if (!Character.isLetter(text.charAt(i)));
            return false;
        }
        for (int i=2;i<=7;i++){
            if (!Character.isDigit(text.charAt(i)));
            return false;
        }
        return true;
    }

}
