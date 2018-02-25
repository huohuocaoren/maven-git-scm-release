package com.controller;

import com.jfinal.core.Controller;

/**
 * Created by love on 2017/5/27.
 */
public class HelloController extends Controller {

    public void index(){
        renderText("Hello world!!");
    }
}
