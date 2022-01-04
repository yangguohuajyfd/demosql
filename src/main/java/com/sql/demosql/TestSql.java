package com.sql.demosql;

import org.springframework.stereotype.Component;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

@Component
public class TestSql {

//    public static void main(String[] args) {
//
//        List<String> sqlList = new ArrayList<String>();
//        try {
//
//            InputStream sqlFileIn = new FileInputStream("E:\\伊诺凯\\终极版\\新建文件夹\\product_info.sql");
//            StringBuffer sqlSb = new StringBuffer();
//            byte[] buff = new byte[1024];
//            int byteRead = 0;
//            while ((byteRead = sqlFileIn.read(buff)) != -1) {
//                sqlSb.append(new String(buff, 0, byteRead));
//            }
//
//            // Windows 下换行是 \r\n, Linux 下是 \n
//            String[] sqlArr = sqlSb.toString()
//                    .split("(;\\s*\\r\\n)|(;\\s*\\n)");
//            System.out.println(sqlArr);
////            for (int i = 0; i < sqlArr.length; i++) {
////                String sql = sqlArr[i].replaceAll("--.*", "").trim();
////                if (!sql.equals("")) {
////                    sqlList.add(sql);
////                }
////            }
////            sqlList.forEach(System.out::println);
//            //return sqlList;
//        }catch (Exception e){
//
//        }
//    }
}
