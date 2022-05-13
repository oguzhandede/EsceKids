package com.example.escekids;

public class ApiUtils {
    public static final  String BASE_URL="http://escekids.epizy.com";
    public static EsceDaoInterface getEsceDaoInterface(){
return RetrofitClient.getClient(BASE_URL).create(EsceDaoInterface.class);
    }
}
