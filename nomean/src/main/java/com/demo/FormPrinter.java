package com.demo;

/**
 * 输出矩阵
 *
 * @author Yu_Yang
 * @date 2020-10-30
 */
public class FormPrinter {

    public static String print(int[][] form){
        System.out.println("-----------------------");
        StringBuffer sb = new StringBuffer("<HTML><body>");
        for (int y = 0; y < form.length; y++) {
            for (int x = 0; x < form[y].length; x++) {
                sb.append(form[x][y]+" ");
            }
            sb.append("\n<br>");
        }
        sb.append("</body></HTML>");
        System.out.println(sb.toString());
        System.out.println("-----------------------");
        return sb.toString();
    }

}
