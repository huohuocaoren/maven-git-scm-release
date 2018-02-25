package com.config;

import com.controller.HelloController;
import com.jfinal.config.*;
import com.jfinal.template.Engine;

/**
 * Created by love on 2017/5/27.
 */
public class DemoConfig extends JFinalConfig{

    public void configConstant(Constants constants) {
        constants.setDevMode(true);
    }

    public void configRoute(Routes routes){
        routes.add("/hello",HelloController.class);
    }
    public void configEngine(Engine engine){}
    public void configPlugin(Plugins plugins){}
    public void configInterceptor(Interceptors interceptors){}
    public void configHandler(Handlers handlers){}
}
