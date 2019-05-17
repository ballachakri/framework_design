package com.cath.project;

import java.util.Collections;

public class String_Practice
{

    char arr[]={ 'c','h','a','k','r','a','v','a','r','t','h','y'};

    String str="chakravarthy balla srinivasa";

    public static void main (String[] args) {

        String_Practice obj=new String_Practice ();
        obj.rev ();

    }

    public void rev()
    {

        System.out.println (" char array : "+arr);

         for(int i=arr.length-1;i>=0;i--)
         {

             System.out.print ( arr[i] + " ");
         }


    }
}
