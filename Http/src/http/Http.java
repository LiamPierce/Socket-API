/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package http;

import INET.IAddress;
import INET.Site;
import SocketApi.Listeners.Listener;
import SocketApi.Listeners.WebserverListener;
import static java.lang.System.exit;
import java.util.Arrays;
/**
 *
 * @author DeadMansMarch
 */
public class Http {

    
    public static void main(String[] args) {
        IAddress Local = new IAddress("localhost",8090);
        Site k = new Site();
        k.addFile("/default.html", "<!DOCTYPE HTML> <html> <head> <title> jello </title> </head> <body> </body> </html>");
        k.addFile("/favicon.ico","       (     (                Ä                      ˇÑ                                                                                                                                              ˇˇ  ˛?  ¸  ¸  ˛?  ˛?  ˛?  ˛?  ˛?  ˛?  ¯        á  ˇˇ  ");
        try{
            WebserverListener Main = new WebserverListener(Local);
            Main.loadSite(k);
            Main.Activate(true);
            System.out.println("Activated.");
        }catch(Exception E){
            System.out.println("Error Initializing : " + E.getMessage());
            exit(1);
        }
    }
    
}
