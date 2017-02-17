package com.example.qiancheng.myagricultural.util;

import android.content.Context;
import android.text.TextUtils;

import com.example.qiancheng.myagricultural.Contants;
import com.example.qiancheng.myagricultural.bean.User;

/**
 * Created by hl on 2017/2/13.
 */

public class UserLocalData {

    public static void putUser(Context context, User user){


        String user_json =  JSONUtil.toJSON(user);
        PreferencesUtils.putString(context, Contants.USER_JSON,user_json);

    }


    public static User getUser(Context context){

        String user_json= PreferencesUtils.getString(context,Contants.USER_JSON);
        if(!TextUtils.isEmpty(user_json)){

            return  JSONUtil.fromJson(user_json,User.class);
        }
        return  null;
    }


    public static void clearUser(Context context){

        PreferencesUtils.putString(context, Contants.USER_JSON,"");

    }


}
