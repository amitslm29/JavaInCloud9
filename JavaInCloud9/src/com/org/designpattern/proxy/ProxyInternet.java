package com.org.designpattern.proxy;

import java.util.ArrayList;
import java.util.List;

public class ProxyInternet implements Internet {
	
	private Internet internet = new RealInternet();
    private static List<String> bannedSites;    
    
    static
    { 
        bannedSites = new ArrayList<String>(); 
        bannedSites.add("abc.com"); 
        bannedSites.add("def.com"); 
        bannedSites.add("ijk.com"); 
        bannedSites.add("lnm.com"); 
    } 

	@Override
	public void connect(String serverHost) throws Exception {
		if(bannedSites.contains(serverHost.toLowerCase())) { 
            throw new Exception("Access Denied !!!"); 
        } 
        internet.connect(serverHost); 
	}
}
