/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.lib.code;

import static spark.Spark.get;

/**
 *
 * @author luisibarra
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        get("/hello", (req, res) -> "<div style=\"text-align:center\">\n" +
"    <h2>Hello World</h2><br><img src=\"https://static.javatpoint.com/core/images/java-logo1.png\">\n" +
"</div>");
        
    }
    
}
