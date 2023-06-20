package com.xworkz.constructor.runner;

import com.xworkz.constructor.things.Telegram;

public class TelegramRunner {
	public static void main(String args[]) {
		Telegram telegram=new Telegram();
		telegram.chat();
		telegram.download();
		telegram.upload();
		telegram.customize();
		telegram.delete();
	}

}
