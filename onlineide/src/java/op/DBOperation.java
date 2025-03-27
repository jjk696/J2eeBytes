/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package op;

import beans.Login;
import beans.message;
import connection.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author gurjot
 */
public class DBOperation {
    Connection con=DBConnection.dbConnect();
    
    public boolean getRegister(Login lg)
    {
        boolean b=false;
        try
        {
            PreparedStatement ps=con.prepareStatement("insert into login(username,password,email,phone,fname,lname,nation,dob)values(?,?,?,?,?,?,?,?)");
            ps.setString(1, lg.getUsername());
            ps.setString(2, lg.getPassword());
            ps.setString(3,lg.getEmail());
            ps.setString(4, lg.getPhone());
            ps.setString(5, lg.getFname());
            ps.setString(6, lg.getLname());
            ps.setString(7, lg.getNation());
            ps.setString(8,lg.getDob());
            int i=ps.executeUpdate();
            if(i>0)
            {
                b=true;
            }
        }catch(Exception e)
        {
            System.out.println("Exception in getRegister():"+e);
        }
        return b;
    }
    public boolean isValidUser(Login lg){
        boolean f=false;
          try
        {
            PreparedStatement ps=con.prepareStatement("select  * from login where username=? and password=?");
            ps.setString(1, lg.getUsername());
            ps.setString(2, lg.getPassword());
            ResultSet rs=ps.executeQuery();
            if(rs.next())
            {
                f=true;
            }
        }catch(Exception e)
        {
            System.out.println("Exception in isValidUser():"+e);
        }
        return f;
    }
    
    public Login getProfile(String username)
    {
        Login lg=new Login();
        //System.out.println(username);
        try
        {
            PreparedStatement ps=con.prepareStatement("select * from login where username=?");
            ps.setString(1, username);
            ResultSet rs=ps.executeQuery();
            if(rs.next())
            {
                lg.setUsername(rs.getString("username"));
                lg.setPassword(rs.getString("password"));
                lg.setEmail(rs.getString("email"));
                lg.setPhone(rs.getString("phone"));
                lg.setFname(rs.getString("fname"));
                lg.setLname(rs.getString("lname"));
                lg.setNation(rs.getString("nation"));
                lg.setDob(rs.getString("dob"));
                lg.setPath(rs.getString("path"));
            }
        }catch(Exception e)
        {
            System.out.println("Exception in getProfile():"+e);
        }
        return lg;
    }
    public boolean changePasswod(Login lg){
        boolean b=false;
        try{
            PreparedStatement ps=con.prepareStatement("update login set password=? where password=? and username=?");
            ps.setString(1,lg.getNewpwd());
            ps.setString(2, lg.getPassword());
            ps.setString(3, lg.getUsername());
            int i=ps.executeUpdate();
            if(i>0)
            {
                b=true;
            }
        }catch(Exception e){
            System.out.println("Exception in changePassword():"+e);
        }
        return b;
    }
    public boolean editProfile(Login lg){
        boolean a=false;
        try{
            PreparedStatement ps=con.prepareStatement("update login set fname=?,lname=?,email=?,phone=?,nation=?,dob=? where username=? ");
              ps.setString(1,lg.getFname());
            ps.setString(2, lg.getLname());
            ps.setString(3, lg.getEmail());
            ps.setString(4, lg.getPhone());
            ps.setString(5, lg.getNation());
            ps.setString(6, lg.getDob());
            ps.setString(7, lg.getUsername());
            int i=ps.executeUpdate();
            if(i>0){
                a=true;
            }
        }catch(Exception e){
            System.out.println("Exception in editprofile():"+e);
        }
        return a;
    }

    public boolean updateProfilePic(String username, String pic_path) {
       boolean f=false;
       try{
           PreparedStatement ps=con.prepareStatement("update login set path=? where username=?");
           ps.setString(1, pic_path);
           ps.setString(2, username);
           int i=ps.executeUpdate();
           if(i>0){
               f=true;
           }
       }catch(Exception e){
           System.out.println("Exception in updateprofilepic(),,,,,,,,,,"+e);
       }
       return f;
    }
      public String updateProfilePics(String username) {
       String path="";
       try{
           PreparedStatement ps=con.prepareStatement("select path from login where username=?");
           ps.setString(1, username);
          
           ResultSet rs=ps.executeQuery();
           if(rs.next()){
               path=rs.getString(1);
           }
       }catch(Exception e){
           System.out.println("Exception in updateprofilepics(),,,,,,,,,,"+e);
       }
       return path;
       
    }
     public ArrayList userList(String user){
        ArrayList al=new ArrayList();
        try{
            PreparedStatement ps=con.prepareStatement("select * from login where username!=?");
            ps.setString(1, user);
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                Login lg=new Login();
                lg.setUsername(rs.getString("username"));
                lg.setEmail(rs.getString("email"));
                lg.setPhone(rs.getString("phone"));
                lg.setFname(rs.getString("fname"));
                lg.setLname(rs.getString("lname"));
                lg.setNation(rs.getString("nation"));
                lg.setDob(rs.getString("dob"));
                lg.setPath(rs.getString("path"));
                al.add(lg);
            }
        }catch(Exception e){
            System.out.println("Exception in userlist------"+e);
        }
        return al;
     }
     public void insertMsg(message msg){
         try{
           PreparedStatement ps=con.prepareStatement("insert into message(sender,reciever,msg,date,time)values(?,?,?,?,?)");
           ps.setString(1,msg.getSender());
           ps.setString(2, msg.getReciver());
           ps.setString(3, msg.getMsg());
           ps.setString(4,msg.getDate());
           ps.setString(5, msg.getTime());
           int i=ps.executeUpdate();
           if(i>0){
               
           }
         }catch(Exception e){
             System.out.println("Exception in insertMsg()______"+e);
         }
     }
     public ArrayList extractMsg(String sender,String reciver){
         ArrayList al=new ArrayList();
         Connection con1=DBConnection.dbConnect();
         try{
             PreparedStatement ps=con1.prepareStatement("select * from message where sender=? and reciever=? or reciever=? and sender=?");
             ps.setString(1,sender);
             ps.setString(2, reciver);
             ps.setString(3, sender);
             ps.setString(4, reciver);
             ResultSet rs=ps.executeQuery();
             while(rs.next()){
                 message m=new message();
                 m.setSender(rs.getString("sender"));
                 m.setReciver(rs.getString("reciever"));
                 m.setMsg(rs.getString("msg"));
                 m.setDate(rs.getString("date"));
                 m.setTime(rs.getString("time"));
                 al.add(m);
             }
         }catch(Exception e){
             System.out.println("Exception in extractMsg()--------"+e);
         }
         return al;
     }
}
