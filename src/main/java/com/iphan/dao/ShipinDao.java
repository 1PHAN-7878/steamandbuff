package com.iphan.dao;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.iphan.pojo.Shipin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

@Component
public class ShipinDao {
    @Autowired
    public Shipin shipin;

    public ShipinDao() {
    }

    public String getShipinById(int num) throws IOException {
        String apiurl = "https://buff.163.com/api/market/goods/sell_order?game=csgo&goods_id=33961&page_num=1&sort_by=default&mode=&allow_tradable_cooldown=1&_=1709440172709";
        URL url = new URL(apiurl);
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setRequestMethod("GET");

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
        StringBuilder stringBuilder = new StringBuilder();
        String line;
        while((line = bufferedReader.readLine()) != null){
            stringBuilder.append(line);
        }

        bufferedReader.close();
        System.out.println("API响应数据");
        System.out.println(stringBuilder.toString());

        System.out.println("特定数据");
        System.out.println();

        //通过jackson转化
        ObjectMapper objectMapper = new ObjectMapper();
        try{
            JsonNode rootNode = objectMapper.readTree(stringBuilder.toString());
            //这是个item数组啊
            JsonNode priceNode = rootNode.path("data").path("items").path("0").path("price");
            JsonNode temNode = rootNode.path("data").path("items");
            Double price;
            if(temNode != null && temNode.isArray()){
//                for(JsonNode j : temNode){
//                    priceNode = j.get("price");
//                    System.out.println("price is " + priceNode.asText());
//                }
                httpURLConnection.disconnect();
                temNode.get(0).get("price");
                return String.valueOf(temNode.get(0).get("price"));
//                priceNode = temNode[0].get("peice");
//                System.out.println("这个price是" + priceNode.asText());
            }


        }catch (IOException e){
            e.printStackTrace();
        }

        httpURLConnection.disconnect();
        return "null";
    }
}
