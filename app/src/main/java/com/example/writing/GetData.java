package com.example.writing;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

class GetData {
    //读取数据
    public  String readJsonFile(String p,String pp) {
        StringBuilder sb = new StringBuilder();
            File file;
            if(!pp.equals("")) {
                 file = new File(pp);

            }else {
                file = new File(p);
            }
            try {
            InputStream in;
            if(file.exists()) {
                in = new FileInputStream(file);

                int tempbyte;
                while ((tempbyte = in.read()) != -1) {
                    sb.append((char) tempbyte);
                }
                in.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return sb.toString();
    }
}
