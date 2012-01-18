/*
Contributors: Nilesh
Last-Edit: 1/18/12 13:15 by Nilesh
Description: pseudo-code of actual main file
*/
class 2012 extends robotBase{
	final int WIDTH, HEIGHT, LENGTH;
	int x,y,balls, angle;
	Gyro gyro;
	Jaguar pickup, shooter;
	Ultrasonic front, left, right, backLeft, backRight, back;
	Encoder left, right, turret;
	Touch ball1,ball2,ball3;
	Joystick turret, drive;
	Drivetrain drivetrain;
	Acceleromete accel;
	
	autonomous(){
		initPos();
		score(2);
	}

	teleop(){
		updatePos();
		if(turretJoystickTrigger){
			score(balls);
		}
		drive();
	}

	initPos(){
		//compute angle
		drive(-50);
		sleep(300);
		drive(0);
		while(backLeft != backRight){
			if(backLeft > backRight)
				turnLeft;
			else
				turnRight;
		}
		angle = 0;
		
		//y
		y = 27 - backRight - LENGTH;
		
		
		//x
		while(right+left+WIDTH != 27){
			drive(-50);
		}
		x=right;
		
	}
	
	updatePos(){
		
	}
}

