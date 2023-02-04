package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.util.ElapsedTime;

import org.firstinspires.ftc.teamcode.odometry.odometryMethod;
import org.firstinspires.ftc.teamcode.odometry.odometryRobotHardware;

@Autonomous(name="odometryAuto")
//@Disabled

public class odometryAuto extends LinearOpMode{


    public void runOpMode() throws InterruptedException {


        odometryRobotHardware robot = new odometryRobotHardware(hardwareMap);

        robot.motorLF.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        robot.motorLB.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        robot.motorRF.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        robot.motorRB.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);

        robot.motorLF.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        robot.motorLB.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        robot.motorRF.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        robot.motorRB.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);

        odometryMethod odometry = new odometryMethod();

        DcMotor[] odometers = new DcMotor[3];
        {
            odometers[0] = robot.leftEncoder;
            odometers[1] = robot.rightEncoder;
            odometers[2] = robot.perpendicularEncoder;
        }

        DcMotor[] drive = new DcMotor[4];
        {
            drive[0] = robot.motorRF;
            drive[1] = robot.motorRB;
            drive[2] = robot.motorLB;
            drive[3] = robot.motorLF;
        }

        waitForStart();

        redStart(odometry, odometers, drive);


    }

    //copy paste code from these into thing
    public void redStart(odometryMethod odometry, DcMotor[] odometers, DcMotor[] drive){

        odometry.goToPos(odometers, drive, -15, 5, Math.toRadians(-90), 0.5, .5, .5, Math.toRadians(1), Math.toRadians(0));
        odometry.wait(1000, odometers);//drop
        odometry.goToPos(odometers, drive, -50, 5, Math.toRadians(90), 0.5, .5, .5, Math.toRadians(1), Math.toRadians(180));
        odometry.goToPos(odometers, drive, -50, -20, Math.toRadians(90), 0.5, .5, .5, Math.toRadians(1), Math.toRadians(0));
        odometry.wait(1000, odometers);//grab

    }

    public void red4(odometryMethod odometry, DcMotor[] odometers, DcMotor[] drive){

        odometry.goToPos(odometers, drive, -45, -20, Math.toRadians(135), 0.5, .5, .5, Math.toRadians(1), Math.toRadians(-90));
        odometry.wait(2000, odometers);//flip and place

    }

    public void blueStart(odometryMethod odometry, DcMotor[] odometers, DcMotor[] drive){

        odometry.goToPos(odometers, drive, -15, 5, Math.toRadians(90), 0.5, .5, .5, Math.toRadians(1), Math.toRadians(0));
        odometry.wait(1000, odometers);//drop
        odometry.goToPos(odometers, drive, -15, 10, Math.toRadians(90), 0.5, .5, .5, Math.toRadians(1), Math.toRadians(0));
        odometry.goToPos(odometers, drive, -50, 10, Math.toRadians(-90), 0.5, .5, .5, Math.toRadians(1), Math.toRadians(0));
        odometry.goToPos(odometers, drive, -50, -20, Math.toRadians(-90), 0.5, .5, .5, Math.toRadians(1), Math.toRadians(0));
        odometry.wait(1000, odometers);//grab

    }

    public void setFSMVars(int v4bPos, int height){

    }


    //lift FSM method

    //start lift method
    //inputs of v4b pos, height, junction height
    //set positions accordingly and set lift state to lift
    //call this method before loops for lift FSM
}