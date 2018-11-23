package com.mycompany.testbase;

import org.junit.BeforeClass;
import io.restassured.RestAssured;

public class ApiBaseClass {
    protected String accessToken = "YWMtwctjrDdpEeiUVFMzbuFOOgAAAawGFURKWLb9qb0sObyJzKYAL9QG4PlO4z0";
    long start = System.currentTimeMillis();
    long end = System.currentTimeMillis();
	@BeforeClass
	public static void init(){
	RestAssured.baseURI = "http://api.sample.com:5000/";
	
	}			
	
}
