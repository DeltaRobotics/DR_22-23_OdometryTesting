package org.firstinspires.ftc.teamcode;


import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.util.ElapsedTime;

import java.util.ArrayList;
import java.util.List;


@TeleOp(name="j_Test")
//@Disabled

public class junctionTest extends LinearOpMode
{

    List<String> junctionList = new ArrayList<String>();

    String[] tempArray = new String[junctionList.size()];

    boolean backPressed = false;

    @Override
    public void runOpMode() throws InterruptedException
    {

        waitForStart();



        while (opModeIsActive())
        {

            telemetry.update();
            sleep(20);

            if(gamepad1.a && !junctionList.contains("junction_1()")){
                junctionList.add("junction_1()");
            }
            else if(gamepad1.b && !junctionList.contains("junction_3()")) {
                junctionList.add("junction_3()");
            }
            else if(gamepad1.x && !junctionList.contains("junction_7()")){
                junctionList.add("junction_7()");
            }
            else if(gamepad1.y && !junctionList.contains("junction_9()")){
                junctionList.add("junction_9()");
            }
            else if(gamepad1.dpad_up && !junctionList.contains("junction_2()")){
                junctionList.add("junction_2()");
            }
            else if(gamepad1.dpad_right && !junctionList.contains("junction_6()")){
                junctionList.add("junction_6()");
            }
            else if(gamepad1.dpad_down && !junctionList.contains("junction_8()")){
                junctionList.add("junction_8()");
            }
            else if(gamepad1.dpad_left && !junctionList.contains("junction_4()")){
                junctionList.add("junction_4()");
            }
            else if(gamepad1.left_bumper && !junctionList.contains("junction_5()")){
                junctionList.add("junction_5()");
            }
            else if(gamepad1.back && !backPressed){
                junctionList.remove(junctionList.size() - 1);
                backPressed = true;
            }
            else if(!gamepad1.back) {
                backPressed = false;
            }

            for(int i = 0; i<junctionList.size(); i++){
                telemetry.addLine("junctions" + tempArray[i]);
            }
            telemetry.update();

        }
    }
}
