package com.testing.maven.vip05javamaven;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Map;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

public class IpJson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String IpJson="{\"status\":\"0\",\"t\":\"1577505074046\",\"set_cache_time\":\"\",\"data\":[{\"location\":\"����\",\"titlecont\":\"IP��ַ��ѯ\",\"origip\":\"3.3.3.3\",\"origipquery\":\"3.3.3.3\",\"showlamp\":\"1\",\"showLikeShare\":1,\"shareImage\":1,\"ExtendedLocation\":\"\",\"OriginQuery\":\"3.3.3.3\",\"tplt\":\"ip\",\"resourceid\":\"6006\",\"fetchkey\":\"3.3.3.3\",\"appinfo\":\"\",\"role_id\":0,\"disp_type\":0}]}";
     JSONObject ipjsonob=JSON.parseObject(IpJson);
     System.out.println(ipjsonob.get("t"));
     Map<String,Object> ipMap=new HashMap<String,Object>();
     for(String key:ipjsonob.keySet()) {
    	 ipMap.put(key, ipjsonob.get(key));
     }
     System.out.println(ipMap);
//   fastjsonֱ��ת��
     Map<String,Object> deMap=(Map<String,Object>)JSON.parse(IpJson);
     System.out.println("ֱ��ת��ΪMap�Ľ����"+deMap);
     System.out.println(deMap.get("t"));
     //Mapƴ��Ϊjson�ַ���
     
     String JsonStr="{";
     for(java.util.Map.Entry<String, Object> en:ipMap.entrySet()) {
    	 if(en.getValue() instanceof String) {
    		 JsonStr+="\""+en.getKey()+"\":\""+en.getValue()+"\",";
    	 }else {
    		 JsonStr+="\""+en.getKey()+"\":"+en.getValue()+",";
    	 }
     }
     System.out.println(JsonStr);
     JsonStr=JsonStr.substring(0, JsonStr.length()-1);
     JsonStr+="}";
     System.out.println(JsonStr);
     String reJson=JSON.toJSONString(ipMap);
     System.out.println(reJson);
	}
	

	}


