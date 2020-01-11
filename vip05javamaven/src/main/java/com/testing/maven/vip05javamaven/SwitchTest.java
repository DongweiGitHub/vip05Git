package com.testing.maven.vip05javamaven;

import java.util.Scanner;

public class SwitchTest {

	public static void main1(String[] args) {
		// TODO Auto-generated method stub
		// 读取人数
		Scanner input = new Scanner(System.in);
		System.out.println("请输入人数：");
		int people = input.nextInt();
		// 基于人数，判断接下来做什么，类似if else if 只不过用的是取值的方法
		switch (people) {
		// 表示people取值为10的时候所做的事情
		case 10:
			System.out.println("打篮球去");
			// break表示这个场景的操作结束了，不再执行后面的操作
			break;
		case 5:
			System.out.println("玩游戏去");
			break;
		case 4:
			System.out.println("打麻将去");
			break;
		case 2:
			System.out.println("看电影去");
			break;
		// 默认执行的操作，不满足上面的取值时,default规范放在最后，default可以不写break;
		default:
			System.out.println("不知道干什么");
			break;
		}

	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入天气");
		String weather = input.nextLine();
		switch (weather) {
		//多个条件执行相同的操作时。
		case "晴天":
		case "多云":
		case "下雪":
			System.out.println("出去玩");
			break;
		case "下雨":
			System.out.println("吃巧克力");
			break;
		default:
			System.out.println("宅家里");

		}

	}

}
