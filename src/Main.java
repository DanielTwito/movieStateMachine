import Manger.File;
import Manger.SystemManager;
import Requests.RequestRegion;
import UserStatus.UserStatusRegion;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);

        System.out.println("Hello, this is the system menu.\nFor each event please choose the correspond number\n" +
                "  1- internetOn();\n" +
                "  2- turnOn();\n" +
                "  3- turnOff();\n" +
                "  4- downloadError();\n" +
                "  5- internetOff();\n" +
                "  6- resume();\n" +
                "  7- errorFixed();\n" +
                "  8- movieOn();\n" +
                "  9- downloadAborted();\n" +
                "  10- restartMovie();\n" +
                "  11- holdMovie();\n" +
                "  12- fileRequest(File file);\n"+
                "  13- movieOff\n");

        SystemManager mng=new SystemManager(1000);

        while (true) {
            String input = myObj.nextLine();
            int in = Integer.parseInt(input);;
            switch (in) {
                case 1:
                    mng.internetOn();
                    break;
                case 2:
                    mng.turnOn();
                    break;
                case 3:
                    mng.turnOff();
                    break;
                case 4:
                    mng.downloadError();
                    break;
                case 5:
                    mng.internetOff();
                    break;
                case 6:
                    mng.resume();
                    break;
                case 7:
                    mng.errorFixed();
                    break;
                case 8:
                    mng.movieOn();
                    break;
                case 9:
                    mng.downloadAborted();
                    break;
                case 10:
                    mng.restartMovie();
                    break;
                case 11:
                    mng.holdMovie();
                    break;
                case 12:
                    Scanner scanner = new Scanner(System.in);
                    System.out.println("Pleas enter you file name");
                    String name = scanner.nextLine();
                    System.out.println("Pleas enter you file size");
                    String size = scanner.nextLine();
                    mng.fileRequest(new File(name, Integer.parseInt(size)));
                    break;
                case 13:
                    mng.movieOff();
                    break;
            }
        }

    }
}
