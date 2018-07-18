package com.djl.demo;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.text.ParseException;

/**
 * Created by dongjunliang on 2018-6-21.
 */
public class ConstructQuery {

    public static String constructQuery(String table, String[] fieldNames) {
        if (fieldNames == null) {
            throw new IllegalArgumentException("Field may not be null");
        }
        StringBuilder query = new StringBuilder();
        StringBuilder values = new StringBuilder();
        query.append("replace into ").append(table);
        for (int i=0; i<fieldNames.length; i++) {
            if (i==0) {
                query.append("(");
            }
            values.append("?");
            query.append(fieldNames[i]);
            if (i!= fieldNames.length-1) {
                values.append(",");
                query.append(",");
            } else {
                query.append(")");
                query.append(" values ");
                query.append(" (");
                query.append(values);
                query.append(") ");
            }
        }
        return query.toString();
    }

    public static void main(String[] args) throws ParseException {
//        String[] fields = {"aaa", "bbb", "ccc"};
//        System.out.println(constructQuery("xxx", fields));
//        int i=1;
//        System.out.println(i++);
//        System.out.println(i++);
//        BigDecimal a = new BigDecimal("10%".split("%")[0]);
//        System.out.println(a);
        NumberFormat format = NumberFormat.getPercentInstance();
        Number number = format.parse("12.12%");
        BigDecimal decimal = new BigDecimal(number.toString());
        System.out.println(decimal);
    }
}
