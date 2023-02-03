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

    double speed = 1;
    double zScale = 1;



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

        odometry.goToPos(odometers, drive, -15, 5, Math.toRadians(-90), 0.5, .5, .5, Math.toRadians(1), Math.toRadians(0));
        odometry.wait(1000, odometers);//drop
        odometry.goToPos(odometers, drive, -15, 0, Math.toRadians(-90), 0.5, .5, .5, Math.toRadians(1), Math.toRadians(0));
        odometry.goToPos(odometers, drive, -50, 5, Math.toRadians(90), 0.5, .5, .5, Math.toRadians(1), Math.toRadians(0));
        odometry.goToPos(odometers, drive, -50, -20, Math.toRadians(90), 0.5, .5, .5, Math.toRadians(1), Math.toRadians(0));
        odometry.wait(1000, odometers);//grab

        odometry.goToPos(odometers, drive, -45, -20, Math.toRadians(135), 0.5, .5, .5, Math.toRadians(1), Math.toRadians(-90));
        odometry.wait(2000, odometers);//flip and place


    }

    //copy paste code from these into thing
    public void redStart(){
        odometryRobotHardware robot = new odometryRobotHardware(hardwareMap);
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

        odometry.goToPos(odometers, drive, -15, 5, Math.toRadians(-90), 0.5, .5, .5, Math.toRadians(1), Math.toRadians(0));
        odometry.wait(1000, odometers);//drop
        odometry.goToPos(odometers, drive, -15, 0, Math.toRadians(-90), 0.5, .5, .5, Math.toRadians(1), Math.toRadians(0));
        odometry.goToPos(odometers, drive, -50, 5, Math.toRadians(90), 0.5, .5, .5, Math.toRadians(1), Math.toRadians(0));
        odometry.goToPos(odometers, drive, -50, -20, Math.toRadians(90), 0.5, .5, .5, Math.toRadians(1), Math.toRadians(0));
        odometry.wait(1000, odometers);//grab
    }
    public void red4(){
        odometryRobotHardware robot = new odometryRobotHardware(hardwareMap);
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

        odometry.goToPos(odometers, drive, -50, -17, Math.toRadians(90), 0.5, .5, .5, Math.toRadians(1), Math.toRadians(-90));
        odometry.goToPos(odometers, drive, -45, -17, Math.toRadians(90), 0.5, .5, .5, Math.toRadians(1), Math.toRadians(-90));
        odometry.wait(2000, odometers);
    }

    public void blueStart(){
        odometryRobotHardware robot = new odometryRobotHardware(hardwareMap);
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

        odometry.goToPos(odometers, drive, -15, 5, Math.toRadians(90), 0.5, .5, .5, Math.toRadians(1), Math.toRadians(0));
        odometry.wait(1000, odometers);//drop
        odometry.goToPos(odometers, drive, -15, 10, Math.toRadians(90), 0.5, .5, .5, Math.toRadians(1), Math.toRadians(0));
        odometry.goToPos(odometers, drive, -50, 10, Math.toRadians(-90), 0.5, .5, .5, Math.toRadians(1), Math.toRadians(0));
        odometry.goToPos(odometers, drive, -50, -20, Math.toRadians(-90), 0.5, .5, .5, Math.toRadians(1), Math.toRadians(0));
        odometry.wait(1000, odometers);//grab
    }
}