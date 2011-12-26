package controllers;

import play.*;
import play.mvc.*;

import java.util.*;

import models.*;

public class Application extends Controller {

    public static void index() {
    	System.out.println("Got a request for index.html");
    	render();
    }

}