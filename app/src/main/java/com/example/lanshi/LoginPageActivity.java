package com.example.lanshi;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class LoginPageActivity extends Activity {
    // 调用Actvity
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // 关联activity.xml
        setContentView(R.layout.activity_main);
        // 关联用户名、密码和登录、注册按钮
        EditText userName = (EditText) this.findViewById(R.id.UserNameEdit);
        EditText passWord = (EditText) this.findViewById(R.id.PassWordEdit);
        Button loginButton = (Button) this.findViewById(R.id.LoginButton);
        Button signUpButton = (Button) this.findViewById(R.id.SignUpButton);
        // 登录按钮监听器
        loginButton.setOnClickListener(
                new OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        // 获取用户名和密码
                        String strUserName = userName.getText().toString().trim();
                        String strPassWord = passWord.getText().toString().trim();
                        // 判断如果用户名为"123456"密码为"123456"则登录成功
                        if (strUserName.equals("user") && strPassWord.equals("123456")) {
                            Toast.makeText(LoginPageActivity.this, "登录成功！", Toast.LENGTH_SHORT).show();
                        } else {
                            Toast.makeText(LoginPageActivity.this, "请输入正确的用户名或密码！", Toast.LENGTH_SHORT).show();
                        }
                    }
                }
        );
        // 注册按钮监听器
        signUpButton.setOnClickListener(
                new OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        // 跳转到注册界面
                        Intent intent = new Intent(LoginPageActivity.this, SignUpActivity.class);
                        startActivity(intent);
                    }
                }
        );

    }
}

