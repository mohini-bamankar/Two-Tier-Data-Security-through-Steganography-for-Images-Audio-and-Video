/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 *
 * @author welcome
 */
public class DBDriver 
{
    public Statement createConnection()
    {
        Statement st=null;
        
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/two_tier_security_steaganography","root","root");
             st=conn.createStatement();
         
        }
        catch(Exception ex)
        {
            System.out.println("Exception is: "+ex);
        }
        return st;
    }
}
