package team.bug.chat.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import team.bug.chat.itemUtils.AlertDialog;
import team.bug.chat.itemUtils.StageManage;
import team.bug.chat.model.Sign;

import javax.xml.ws.WebServiceException;
import java.io.IOException;

public class SignUp {

    @FXML
    private TextField nickname;
    @FXML
    private Button bt_signup;
    @FXML
    private TextField username_reg;
    @FXML
    private TextField password_reg;

    @FXML
    public void onClick_signUp() throws IOException {
        Sign sign = new Sign();
        AlertDialog alertDialog = new AlertDialog();
        try {
            int regReturn = sign.signUp(nickname.getText(),username_reg.getText(), password_reg.getText());
            if (regReturn == 1){
                alertDialog.ErrorInformationDialog("该用户已存在！");
            }else if (regReturn == 2){
                alertDialog.CorrectInformationDialog("注册成功!");
                StageManage stageManage = new StageManage();
                stageManage.createnewstage("Login.fxml","登录");
                stageManage.closecurrentstage(bt_signup);
            } else if (regReturn == 3){
                alertDialog.ErrorInformationDialog("服务器异常!");
            }
        }catch (WebServiceException e){
            alertDialog.ErrorInformationDialog("无法连接服务器，请联系管理员！");
        }
    }
}
