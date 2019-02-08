package com.SAPTOOL.utils;//package com.SAPTOOL.utils;
//
//import org.openqa.grid.common.GridRole;
//import org.openqa.grid.common.RegistrationRequest;
//import org.openqa.grid.internal.utils.GridHubConfiguration;
//import org.openqa.grid.internal.utils.SelfRegisteringRemote;
//import org.openqa.grid.web.Hub;
//
//public class SeleniumHubNode {
//    private static SelfRegisteringRemote remote;
//    private static Hub hub;
//
//    public void abc() throws Exception{
//        GridHubConfiguration config = new GridHubConfiguration();
//        config.setHost("localhost");
//        hub = new Hub(config);
//        hub.start();
//        System.out.println("1");
//        RegistrationRequest req = new RegistrationRequest();
//        req.setRole(GridRole.NODE);
//        req.loadFromJSON("NodeFfConfig.json");
//
//        remote = new SelfRegisteringRemote(req); // this line is throwing
//
//        remote.startRemoteServer();
//        remote.startRegistrationProcess();
//
//        remote.stopRemoteServer();
//        hub.stop();
//}
