// Code snippet #1
boolean isUserAuthorized = user.isSuperAdmin();
if (!isUserAuthorized) {
    isUserAuthorized = isUserAdminOfEntity1();
}
if (!isUserAuthorized) {
    isUserAuthorized = isUserAdminOfEntity2();
}
if (!isUserAuthorized) {
    throw new AccessDeniedException("Authenticated user is not admin ");
}



// Code snippet #2
switch (kafkaStreams.state()) {
                case RUNNING: {
                    if (kafkaStreams.state().isRunning()) {
                        countDownLatch.countDown();
                    }
                }
                break;


    
// Code snippet #3
//JSONObject input;
String givenName = input.get("propName") != null ? (String)input.get("propName") : null;



// Code snippet #4
public class Main {
    public static void main(String[] args) {
        try {
            //code goes here
        } catch (Exception e) {
            System.exit(0);
        }
    }
}
    
    

// Code snippet #5
private static int alphabetToNumber(String letter) {
    String s = letter.toLowerCase();
    if (s.equals("a")) {
        return 1;
    } else if (s.equals("b")) {
        return 2;
    } else if (s.equals("c")) {
        return 3;
    } else if (s.equals("d")) {
        return 4;
    } else if (s.equals("e")) {
        return 5;
    } else if (s.equals("f")) {
        return 6;
    } else if (s.equals("g")) {
        return 7;
    } else if (s.equals("h")) {
        return 8;
    } else if (s.equals("i")) {
        return 9;
    } else if (s.equals("j")) {
        return 10;
    } else if (s.equals("k")) {
        return 11;
    } else if (s.equals("l")) {
        return 12;
    } else if (s.equals("m")) {
        return 13;
    } else if (s.equals("n")) {
        return 14;
    } else if (s.equals("o")) {
        return 15;
    } else if (s.equals("p")) {
        return 16;
    } else if (s.equals("q")) {
        return 17;
    } else if (s.equals("r")) {
        return 18;
    } else if (s.equals("s")) {
        return 19;
    } else if (s.equals("t")) {
        return 20;
    } else if (s.equals("u")) {
        return 21;
    } else if (s.equals("v")) {
        return 22;
    } else if (s.equals("w")) {
        return 23;
    } else if (s.equals("x")) {
        return 24;
    } else if (s.equals("y")) {
        return 25;
    } else if (s.equals("z")) {
        return 26;
    } else {
        return 0;
    }
}



// Code snippet #6
private boolean check_if_valid_login(Login login) {
    boolean validLogin = false;
    if (login.isValid(login)) {
        validLogin = true;
    }
    
    if (!(login.isValid(login) == true)) {
        validLogin = false;
    }
    
    return validLogin ? true : false;
}
