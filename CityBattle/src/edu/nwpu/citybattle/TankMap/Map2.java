package edu.nwpu.citybattle.TankMap;

/**
 * 存放第二关地图
 * @author 86180
 *
 */
public class Map2 {
	//红色墙
		public static int[][] wall = {
//			     1,2,3,4,5,6,7,8,9,10, 11, 12, 13, 14 15, 16, 17,  18, 19,  20,  21, 22,  23,  24, 25,  26,  27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56
	/*1*/		{0,0,0,0,0,0,0,0,0,0,  0,  0,   0, 0,  0,  0,  0,  0,   0,   0,  0,   0,  0,   0,  0,   0,   0,  0,  0,  0,  0,  0,  0,  0,  0,   0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0},
	/*2*/       {0,0,0,0,0,0,0,0,0,0,  0,  0,   0, 0,  0,  0,  0,  0,   0,   0,  0,   0,  0,   0,  0,   0,   0,  0,  0,  0,  0,  0,  0,  0,  0,   0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0},
	/*3*/       {0,0,0,0,0,0,0,0,0,0,  0,  0,   0, 0,  0,  0,  0,  0,   0,   0,  0,   0,  0,   0,  0,   0,   0,  0,  0,  0,  0,  0,  0,  0,  0,   0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0},
	/*4*/       {0,0,1,1,0,0,0,0,0,0,  0,  0,   0, 0,  0,  0,  0,  0,   0,   0,  0,   0,  0,   0,  0,   0,   0,  0,  0,  0,  0,  0,  0,  0,  0,   0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0},
	/*5*/       {0,0,1,1,0,0,0,0,0,0,  0,  0,   0, 0,  0,  0,  0,  0,   0,   0,  0,   0,  0,   0,  0,   0,   0,  0,  0,  0,  0,  0,  0,  0,  0,   0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0},
	/*6*/       {0,0,1,1,0,0,0,0,0,0,  0,  0,   0, 0,  0,  0,  0,  0,   0,   0,  0,   1,  1,   0,  0,   0,   0,  0,  0,  0,  0,  0,  0,  0,  0,   0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0},
	/*7*/       {0,0,1,1,0,0,0,0,0,0,  0,  0,   0, 0,  0,  0,  0,  0,   0,   0,  0,   1,  1,   0,  0,   0,   0,  0,  0,  0,  0,  0,  0,  0,  0,   0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0},
	/*8*/       {0,0,1,1,0,0,0,0,0,0,  0,  0,   0, 0,  0,  0,  0,  0,   0,   0,  0,   1,  1,   0,  0,   0,   0,  0,  0,  0,  0,  0,  0,  0,  0,   0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0},
	/*9*/       {0,0,1,1,0,0,0,0,0,0,  0,  0,   0, 0,  0,  0,  0,  0,   0,   0,  0,   1,  1,   0,  0,   0,   0,  0,  0,  0,  0,  0,  0,  0,  0,   0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0},
	/*10*/      {0,0,1,1,0,0,0,0,0,0,  0,  0,   0, 0,  0,  0,  0,  0,   0,   0,  0,   1,  1,   0,  0,   0,   0,  0,  0,  0,  0,  0,  0,  0,  0,   0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0},
	/*11*/		{0,0,1,1,0,0,0,0,0,0,  0,  0,   0, 0,  0,  0,  0,  0,   0,   0,  0,   1,  1,   0,  0,   0,   0,  0,  0,  1,  1,  1,  1,  0,  0,   0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0},
	/*12*/      {0,0,1,1,0,0,0,0,0,0,  0,  0,   0, 0,  0,  0,  0,  0,   0,   0,  0,   0,  0,   0,  0,   0,   0,  0,  0,  1,  1,  1,  1,  0,  0,   0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0},
	/*13*/      {0,0,1,1,0,0,0,0,0,0,  0,  1,   1, 0,  0,  0,  0,  0,   0,   0,  0,   0,  0,   0,  0,   0,   0,  0,  0,  0,  0,  1,  1,  0,  0,   0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0},
	/*14*/      {0,0,0,0,0,0,0,0,0,0,  0,  1,   1, 0,  0,  0,  0,  0,   0,   0,  0,   0,  0,   0,  0,   0,   0,  0,  0,  0,  0,  1,  1,  0,  0,   0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0},
	/*15*/      {0,0,0,0,0,0,0,0,0,0,  0,  0,   0, 0,  0,  0,  0,  0,   0,   0,  0,   0,  0,   0,  0,   0,   0,  0,  0,  0,  0,  0,  0,  0,  0,   0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0},
	/*16*/      {0,0,0,0,0,0,0,0,1,1,  1,  1,   1, 1,  1,  1,  1,  1,   1,   1,  1,   1,  1,   0,  0,   0,   0,  0,  0,  0,  0,  0,  0,  0,  0,   0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0},
	/*17*/      {0,0,0,0,0,0,0,0,1,1,  1,  1,   1, 1,  1,  1,  1,  1,   1,   1,  1,   1,  1,   0,  0,   0,   0,  0,  0,  0,  0,  0,  0,  0,  0,   0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0},
	/*18*/      {0,0,0,0,0,0,0,0,0,0,  0,  0,   0, 0,  0,  0,  0,  0,   0,   0,  0,   0,  0,   0,  0,   0,   0,  0,  0,  0,  0,  0,  0,  0,  0,   0,  0,  0,  0,  0,  1,  1,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0},
	/*19*/      {0,0,0,0,0,0,0,0,0,0,  0,  0,   0, 0,  0,  0,  0,  0,   0,   0,  0,   0,  0,   0,  0,   0,   0,  0,  0,  0,  0,  0,  0,  0,  0,   0,  0,  0,  0,  0,  1,  1,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0},
	/*20*/      {0,0,0,0,0,0,0,0,0,0,  0,  0,   0, 0,  0,  0,  0,  0,   0,   0,  0,   0,  0,   0,  0,   0,   0,  0,  0,  0,  0,  0,  0,  0,  0,   0,  0,  0,  0,  0,  1,  1,  0,  0,  0,  0,  1,  1,  0,  0,  0,  0,  0,  0,  0,  0},
	/*21*/		{0,0,0,0,0,0,0,0,0,0,  0,  0,   0, 0,  0,  0,  0,  0,   0,   0,  0,   0,  0,   0,  0,   0,   0,  0,  0,  0,  0,  0,  0,  0,  0,   0,  0,  0,  0,  0,  1,  1,  0,  0,  0,  0,  1,  1,  0,  0,  0,  0,  0,  0,  0,  0},
	/*22*/      {0,0,0,0,0,0,0,0,0,0,  0,  0,   0, 0,  0,  0,  0,  0,   0,   0,  0,   0,  0,   0,  0,   0,   0,  0,  0,  0,  0,  0,  0,  0,  0,   0,  0,  0,  0,  0,  1,  1,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0},
	/*23*/      {0,0,0,0,0,0,0,0,0,0,  0,  0,   0, 0,  0,  0,  0,  0,   0,   0,  0,   0,  0,   0,  0,   0,   0,  0,  0,  0,  0,  0,  0,  0,  0,   0,  0,  0,  0,  0,  1,  1,  1,  1,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0},
	/*24*/      {0,0,0,0,0,0,0,0,0,1,  1,  1,   1, 1,  1,  1,  1,  1,   1,   1,  1,   1,  1,   1,  1,   1,   1,  0,  0,  0,  0,  0,  0,  0,  0,   0,  0,  0,  0,  0,  1,  1,  1,  1,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0},
	/*25*/      {0,0,0,0,0,0,0,0,0,1,  1,  1,   1, 1,  1,  1,  1,  1,   1,   1,  1,   1,  1,   1,  1,   1,   1,  0,  0,  0,  0,  0,  0,  0,  0,   0,  0,  0,  0,  0,  1,  1,  1,  1,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0},
	/*26*/      {0,0,0,0,0,0,0,0,0,0,  0,  0,   0, 0,  0,  0,  0,  0,   0,   0,  0,   0,  0,   0,  0,   0,   0,  0,  0,  0,  0,  0,  0,  0,  0,   0,  0,  0,  0,  0,  1,  1,  1,  1,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0},
	/*27*/      {0,0,0,0,0,0,0,0,0,0,  0,  0,   0, 0,  0,  0,  0,  0,   0,   0,  0,   0,  0,   0,  0,   0,   0,  0,  0,  0,  0,  0,  0,  0,  0,   0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0},
	/*28*/      {0,0,0,0,0,0,0,0,0,0,  0,  0,   0, 0,  0,  0,  0,  0,   0,   0,  0,   0,  0,   0,  0,   0,   0,  0,  0,  0,  0,  0,  0,  0,  0,   0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0},
	/*29*/      {0,0,0,0,0,0,0,0,0,0,  0,  0,   0, 0,  0,  0,  0,  0,   0,   0,  0,   0,  0,   0,  0,   0,   0,  0,  0,  0,  0,  0,  0,  0,  0,   0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0},
	/*30*/      {0,0,0,0,0,0,0,0,0,0,  0,  0,   0, 0,  0,  0,  0,  0,   0,   0,  0,   0,  0,   0,  0,   0,   0,  0,  0,  0,  0,  0,  0,  0,  0,   0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0},
	/*31*/		{0,0,0,0,0,0,0,0,0,0,  0,  0,   0, 0,  0,  0,  0,  0,   0,   0,  0,   0,  0,   0,  0,   0,   0,  0,  0,  0,  0,  0,  0,  0,  0,   0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0},
	/*32*/      {0,0,0,0,0,0,0,0,0,0,  0,  0,   0, 0,  0,  0,  0,  0,   0,   0,  0,   0,  0,   0,  0,   0,   0,  0,  0,  0,  0,  0,  0,  0,  0,   0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0},
	/*33*/      {0,0,0,0,0,0,0,0,0,0,  0,  0,   0, 0,  0,  0,  0,  0,   0,   0,  0,   0,  0,   0,  0,   0,   0,  0,  0,  0,  0,  0,  0,  0,  0,   0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0},
	/*34*/      {0,0,0,0,0,0,0,0,0,0,  0,  0,   0, 0,  0,  0,  0,  0,   0,   0,  0,   0,  0,   0,  0,   0,   0,  0,  0,  0,  0,  0,  0,  0,  0,   0,  1,  1,  1,  1,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0},
	/*35*/      {0,0,0,0,0,0,0,0,0,0,  0,  0,   0, 0,  0,  0,  0,  0,   0,   0,  0,   0,  0,   0,  0,   0,   0,  0,  0,  0,  0,  0,  0,  0,  0,   0,  1,  1,  1,  1,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0},
	/*36*/      {0,0,0,0,0,0,0,0,0,0,  0,  0,   0, 0,  0,  0,  0,  0,   0,   0,  0,   0,  0,   0,  0,   0,   0,  0,  0,  0,  0,  0,  0,  0,  0,   0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0},
	/*37*/      {0,0,0,0,0,0,0,0,0,0,  0,  0,   0, 0,  0,  0,  0,  0,   0,   0,  0,   0,  0,   0,  1,   1,   1,  1,  1,  1,  0,  0,  0,  0,  0,   0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0},
	/*38*/      {0,0,0,0,0,0,0,0,0,0,  0,  0,   0, 0,  0,  0,  0,  0,   0,   0,  0,   0,  0,   0,  1,   1,   1,  1,  1,  1,  0,  0,  0,  0,  0,   0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0},
	/*39*/      {0,0,0,0,0,0,0,0,0,0,  0,  0,   0, 0,  0,  0,  0,  0,   0,   0,  0,   0,  0,   0,  1,   1,   0,  0,  1,  1,  0,  0,  0,  0,  0,   0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0},
	/*40*/      {0,0,0,0,0,0,0,0,0,0,  0,  0,   0, 0,  0,  0,  0,  0,   0,   0,  0,   0,  0,   0,  1,   1,   0,  0,  1,  1,  0,  0,  0,  0,  0,   0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0},
		};
		
		//灰色墙
		public static int[][] ironwall = {
//			     1,2,3,4,5,6,7,8,9,10, 11, 12, 13, 14 15, 16, 17,  18, 19,  20,  21, 22,  23,  24, 25,  26,  27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56
	/*1*/		{0,0,0,0,0,0,0,0,0,0,  0,  0,   0, 0,  0,  0,  0,  0,   0,   0,  0,   0,  0,   0,  0,   0,   0,  0,  0,  0,  0,  0,  0,  0,  0,   0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0},
	/*2*/       {0,0,0,0,0,0,0,0,0,0,  0,  0,   0, 0,  0,  0,  0,  0,   0,   0,  0,   0,  0,   0,  0,   0,   0,  0,  0,  0,  0,  0,  0,  0,  0,   0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0},
	/*3*/       {0,0,0,0,0,0,0,0,0,0,  0,  0,   0, 0,  0,  0,  0,  0,   0,   0,  0,   0,  0,   0,  0,   0,   0,  0,  0,  0,  0,  0,  0,  0,  0,   0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0},
	/*4*/       {0,0,0,0,0,0,0,0,0,0,  0,  0,   0, 0,  0,  0,  0,  0,   0,   0,  0,   0,  0,   0,  0,   0,   0,  0,  0,  0,  0,  0,  0,  0,  0,   0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0},
	/*5*/       {0,0,0,0,0,0,0,0,0,0,  0,  0,   0, 0,  0,  0,  0,  0,   0,   0,  0,   0,  0,   0,  0,   0,   0,  0,  0,  0,  0,  0,  0,  0,  0,   0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0},
	/*6*/       {0,0,0,0,0,0,1,1,1,1,  1,  1,   0, 0,  0,  0,  0,  0,   0,   1,  1,   0,  0,   1,  1,   1,   1,  0,  0,  0,  0,  0,  0,  0,  0,   0,  0,  0,  1,  1,  0,  0,  0,  1,  1,  1,  1,  1,  0,  0,  0,  0,  0,  0,  0,  0},
	/*7*/       {0,0,0,0,0,0,1,1,1,1,  1,  1,   0, 0,  0,  0,  0,  0,   0,   1,  1,   0,  0,   1,  1,   1,   1,  0,  0,  0,  0,  0,  0,  0,  0,   0,  0,  0,  1,  1,  0,  0,  0,  1,  1,  1,  1,  1,  0,  0,  0,  0,  0,  0,  0,  0},
	/*8*/       {0,0,0,0,0,0,0,0,0,0,  0,  0,   0, 0,  0,  0,  0,  0,   0,   0,  0,   0,  0,   0,  0,   0,   0,  0,  0,  0,  0,  0,  0,  0,  0,   0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0},
	/*9*/       {0,0,0,0,0,0,0,0,0,0,  0,  0,   0, 0,  0,  0,  0,  0,   0,   0,  0,   0,  0,   0,  0,   0,   0,  0,  0,  0,  0,  0,  0,  0,  0,   0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0},
	/*10*/      {0,0,0,0,0,0,0,0,0,0,  0,  0,   0, 0,  0,  0,  0,  0,   0,   0,  0,   0,  0,   0,  0,   0,   0,  0,  0,  0,  0,  0,  0,  0,  0,   0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0},
	/*11*/		{0,0,0,0,0,0,0,0,0,1,  1,  0,   0, 0,  0,  0,  0,  0,   0,   1,  1,   0,  0,   1,  1,   0,   0,  0,  0,  0,  0,  0,  0,  0,  0,   0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  1,  1},
	/*12*/      {0,0,0,0,0,0,0,0,0,1,  1,  0,   0, 0,  0,  0,  0,  0,   0,   1,  1,   0,  0,   1,  1,   0,   0,  0,  0,  0,  0,  0,  0,  0,  0,   0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  1,  1},
	/*13*/      {0,0,0,0,0,0,0,0,0,0,  0,  0,   0, 0,  0,  0,  0,  0,   0,   0,  0,   0,  0,   0,  0,   0,   0,  0,  0,  0,  0,  0,  0,  0,  0,   0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  1,  1},
	/*14*/      {0,0,0,0,0,0,0,0,0,0,  0,  0,   0, 0,  0,  0,  0,  0,   0,   0,  0,   0,  0,   0,  0,   0,   0,  0,  0,  0,  0,  0,  0,  0,  0,   0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  1,  1,  0,  0,  0,  0,  0,  0,  1,  1},
	/*15*/      {0,0,0,0,0,0,0,0,0,0,  0,  0,   0, 0,  0,  0,  0,  0,   0,   0,  0,   0,  0,   0,  0,   0,   0,  0,  0,  0,  0,  0,  0,  0,  0,   0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  1,  1,  0,  0,  0,  0,  0,  0,  1,  1},
	/*16*/      {0,0,0,0,0,0,0,0,0,0,  0,  0,   0, 0,  0,  0,  0,  0,   0,   0,  0,   0,  0,   0,  0,   0,   0,  0,  0,  0,  0,  0,  0,  0,  0,   0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  1,  1,  0,  0,  0,  0,  0,  0,  1,  1},
	/*17*/      {0,0,0,0,0,0,0,0,0,0,  0,  0,   0, 0,  0,  0,  0,  0,   0,   0,  0,   0,  0,   0,  0,   0,   0,  0,  0,  0,  0,  0,  0,  1,  1,   0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  1,  1,  0,  0,  0,  0,  0,  0,  1,  1},
	/*18*/      {0,0,1,1,0,0,0,0,0,0,  0,  0,   0, 0,  0,  0,  0,  0,   0,   0,  0,   0,  0,   0,  0,   0,   0,  0,  0,  0,  0,  0,  0,  1,  1,   0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  1,  1,  0,  0,  0,  0,  0,  0,  1,  1},
	/*19*/      {0,0,1,1,0,0,0,0,0,0,  0,  0,   0, 0,  0,  0,  0,  0,   0,   0,  0,   0,  0,   0,  0,   0,   0,  0,  0,  0,  0,  0,  0,  0,  0,   0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  1,  1,  0,  0,  0,  0,  0,  0,  1,  1},
	/*20*/      {0,0,0,0,0,0,0,0,0,0,  0,  0,   0, 0,  0,  0,  0,  0,   0,   0,  0,   0,  0,   0,  0,   0,   0,  0,  0,  0,  0,  0,  0,  0,  0,   0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  1,  1},
	/*21*/		{0,0,0,0,0,0,0,0,0,0,  0,  0,   0, 0,  0,  0,  0,  0,   0,   0,  0,   0,  0,   0,  0,   0,   0,  0,  0,  0,  0,  0,  0,  0,  0,   0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  1,  1},
	/*22*/      {0,0,0,0,0,0,0,0,0,0,  0,  0,   0, 0,  0,  0,  0,  0,   0,   0,  0,   0,  0,   0,  0,   0,   0,  0,  0,  0,  0,  0,  0,  0,  0,   0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  1,  1},
	/*23*/      {0,0,0,0,0,0,0,0,0,0,  0,  0,   0, 0,  0,  0,  0,  0,   0,   0,  0,   0,  0,   0,  0,   0,   0,  0,  0,  0,  0,  0,  0,  0,  0,   0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  1,  1},
	/*24*/      {0,0,0,0,0,0,0,0,0,0,  0,  0,   0, 0,  0,  0,  0,  0,   0,   0,  0,   0,  0,   0,  0,   0,   0,  0,  0,  0,  0,  0,  0,  0,  0,   0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  1,  1},
	/*25*/      {0,0,0,0,0,0,0,0,0,0,  0,  0,   0, 0,  0,  0,  0,  0,   0,   0,  0,   0,  0,   0,  0,   0,   0,  0,  0,  0,  0,  0,  0,  0,  0,   0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  1,  1},
	/*26*/      {0,0,0,0,0,0,0,0,0,0,  0,  0,   0, 0,  0,  0,  0,  0,   0,   0,  0,   0,  0,   0,  0,   0,   0,  0,  0,  0,  0,  0,  0,  0,  0,   0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  1,  1,  0,  0,  0,  0,  0,  0,  1,  1},
	/*27*/      {0,0,0,0,0,0,0,0,0,0,  0,  0,   0, 0,  0,  0,  0,  0,   0,   0,  0,   0,  0,   0,  0,   0,   0,  0,  0,  0,  0,  0,  0,  0,  0,   0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  1,  1,  0,  0,  0,  0,  0,  0,  1,  1},
	/*28*/      {0,0,0,0,0,0,0,0,0,0,  0,  0,   0, 0,  0,  0,  0,  0,   0,   1,  1,   0,  0,   0,  0,   0,   0,  1,  1,  0,  0,  0,  0,  0,  0,   0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  1,  1},
	/*29*/      {0,0,0,0,0,0,0,0,0,0,  0,  0,   0, 0,  0,  0,  0,  0,   0,   1,  1,   0,  0,   0,  0,   0,   0,  1,  1,  0,  0,  0,  0,  0,  0,   0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  1,  1},
	/*30*/      {0,0,0,0,0,0,0,0,0,0,  0,  0,   0, 0,  0,  1,  1,  1,   1,   1,  1,   0,  0,   0,  0,   0,   0,  0,  0,  0,  0,  0,  0,  0,  0,   0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  1,  1},
	/*31*/		{0,0,0,0,0,0,0,0,0,0,  0,  0,   0, 0,  0,  1,  1,  1,   1,   1,  1,   0,  0,   0,  0,   0,   0,  0,  0,  0,  0,  0,  0,  0,  0,   0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  1,  1},
	/*32*/      {0,0,0,0,0,0,0,0,0,0,  0,  0,   0, 0,  0,  0,  0,  0,   0,   1,  1,   0,  0,   0,  0,   0,   0,  0,  0,  0,  0,  0,  0,  0,  0,   0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  1,  1},
	/*33*/      {0,0,0,0,0,0,0,0,0,0,  0,  0,   0, 0,  0,  0,  0,  0,   0,   1,  1,   0,  0,   0,  0,   0,   0,  0,  0,  0,  0,  0,  0,  0,  0,   0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  1,  1},
	/*34*/      {0,0,0,0,0,0,1,1,0,0,  0,  0,   0, 0,  0,  0,  0,  0,   0,   0,  0,   1,  1,   1,  1,   1,   1,  1,  1,  1,  1,  1,  1,  1,  0,   0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  1,  1},
	/*35*/      {0,0,0,0,0,0,1,1,0,0,  0,  0,   0, 0,  0,  0,  0,  0,   0,   0,  0,   1,  1,   1,  1,   1,   1,  1,  1,  1,  1,  1,  1,  1,  0,   0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  1,  1},
	/*36*/      {0,0,0,0,0,0,0,0,0,0,  0,  0,   0, 0,  0,  0,  0,  0,   0,   0,  0,   0,  0,   0,  0,   0,   0,  0,  0,  0,  0,  0,  0,  0,  0,   0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0},
	/*37*/      {0,0,0,0,0,0,0,0,0,0,  0,  0,   0, 0,  0,  0,  0,  0,   0,   0,  0,   0,  0,   0,  0,   0,   0,  0,  0,  0,  0,  0,  0,  0,  0,   0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0},
	/*38*/      {0,0,0,0,0,0,0,0,0,0,  0,  0,   0, 0,  0,  0,  0,  0,   0,   0,  0,   0,  0,   0,  0,   0,   0,  0,  0,  0,  0,  0,  0,  0,  0,   0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0},
	/*39*/      {0,0,0,0,0,0,0,0,0,0,  0,  0,   0, 0,  0,  0,  0,  0,   0,   0,  0,   0,  0,   0,  0,   0,   0,  0,  0,  0,  0,  0,  0,  0,  0,   0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0},
	/*40*/      {0,0,0,0,0,0,0,0,0,0,  0,  0,   0, 0,  0,  0,  0,  0,   0,   0,  0,   0,  0,   0,  0,   0,   0,  0,  0,  0,  0,  0,  0,  0,  0,   0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0},
		};
		
		//草
		public static int[][] grass = {
//			     1,2,3,4,5,6,7,8,9,10, 11, 12, 13, 14 15, 16, 17,  18, 19,  20,  21, 22,  23,  24, 25,  26,  27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56
	/*1*/		{0,0,0,0,0,0,0,0,0,0,  0,  0,   0, 0,  0,  0,  0,  0,   0,   0,  0,   0,  0,   0,  0,   0,   0,  0,  0,  0,  0,  0,  0,  0,  0,   0,  0,  0,  1,  1,  1,  1,  1,  1,  1,  1,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0},
	/*2*/       {0,0,0,0,0,0,0,0,0,0,  0,  0,   0, 0,  0,  0,  0,  0,   0,   0,  0,   0,  0,   0,  0,   0,   0,  0,  0,  0,  0,  0,  0,  0,  0,   0,  0,  0,  1,  1,  1,  1,  1,  1,  1,  1,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0},
	/*3*/       {0,0,0,0,0,0,0,0,0,0,  0,  0,   0, 0,  0,  0,  0,  0,   0,   0,  0,   0,  0,   0,  0,   0,   0,  0,  0,  0,  0,  0,  0,  0,  0,   0,  0,  0,  1,  1,  1,  1,  1,  1,  1,  1,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0},
	/*4*/       {0,0,0,0,0,0,0,0,0,0,  0,  0,   0, 0,  0,  0,  0,  0,   0,   0,  0,   0,  0,   0,  0,   0,   0,  0,  0,  0,  0,  0,  0,  0,  0,   0,  0,  0,  1,  1,  1,  1,  1,  1,  1,  1,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0},
	/*5*/       {0,0,0,0,0,0,0,0,0,0,  0,  0,   0, 0,  0,  0,  0,  0,   0,   0,  0,   0,  0,   0,  0,   0,   0,  0,  0,  0,  0,  0,  0,  0,  0,   0,  0,  0,  1,  1,  1,  1,  1,  1,  1,  1,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0},
	/*6*/       {0,0,0,0,0,0,0,0,0,0,  0,  0,   0, 0,  0,  0,  0,  0,   0,   0,  0,   0,  0,   0,  0,   0,   0,  0,  0,  0,  0,  0,  0,  0,  0,   0,  0,  0,  0,  0,  1,  1,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0},
	/*7*/       {0,0,0,0,0,0,0,0,0,0,  0,  0,   0, 0,  0,  0,  0,  0,   0,   0,  0,   0,  0,   0,  0,   0,   0,  0,  0,  0,  0,  0,  0,  0,  0,   0,  0,  0,  0,  0,  1,  1,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0},
	/*8*/       {0,0,0,0,0,0,0,0,0,0,  0,  0,   0, 0,  0,  0,  0,  0,   0,   0,  0,   0,  0,   0,  0,   1,   1,  0,  0,  0,  0,  0,  0,  0,  0,   0,  0,  0,  1,  1,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0},
	/*9*/       {0,0,0,0,0,0,0,0,0,0,  0,  0,   0, 0,  0,  0,  0,  0,   0,   0,  0,   0,  0,   0,  0,   1,   1,  0,  0,  0,  0,  0,  0,  0,  0,   0,  0,  0,  1,  1,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0},
	/*10*/      {0,0,0,0,0,0,0,0,0,0,  0,  0,   0, 0,  0,  0,  0,  0,   0,   0,  0,   0,  0,   0,  0,   1,   1,  0,  0,  0,  0,  0,  0,  1,  1,   1,  1,  0,  1,  1,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0},
	/*11*/		{0,0,0,0,0,0,0,0,0,0,  0,  0,   0, 0,  0,  0,  0,  0,   0,   0,  0,   0,  0,   0,  0,   1,   1,  0,  0,  0,  0,  0,  0,  1,  1,   1,  1,  0,  1,  1,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0},
	/*12*/      {0,0,0,0,0,0,0,0,0,0,  0,  0,   0, 0,  0,  0,  0,  0,   0,   0,  0,   0,  0,   0,  0,   1,   1,  0,  0,  0,  0,  0,  0,  0,  0,   0,  0,  0,  1,  1,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0},
	/*13*/      {0,0,0,0,0,0,0,0,0,1,  1,  0,   0, 0,  0,  0,  0,  0,   0,   0,  0,   0,  0,   0,  0,   1,   1,  0,  0,  1,  1,  0,  0,  0,  0,   0,  0,  0,  1,  1,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0},
	/*14*/      {0,0,0,0,0,0,0,0,0,1,  1,  0,   0, 0,  0,  0,  0,  0,   0,   0,  0,   0,  0,   0,  0,   1,   1,  0,  0,  1,  1,  0,  0,  0,  0,   0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0},
	/*15*/      {0,0,0,0,0,0,0,0,0,0,  0,  0,   0, 0,  0,  0,  0,  0,   0,   0,  0,   0,  0,   0,  0,   1,   1,  0,  0,  1,  1,  0,  0,  0,  0,   0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0},
	/*16*/      {0,0,0,0,0,0,0,0,0,0,  0,  0,   0, 0,  0,  0,  0,  0,   0,   0,  0,   0,  0,   0,  0,   0,   0,  0,  0,  1,  1,  0,  0,  0,  0,   0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0},
	/*17*/      {0,0,0,0,0,0,0,0,0,0,  0,  0,   0, 0,  0,  0,  0,  0,   0,   0,  0,   0,  0,   0,  0,   0,   0,  0,  0,  1,  1,  0,  0,  0,  0,   0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0},
	/*18*/      {0,0,0,0,0,0,0,0,0,0,  0,  0,   0, 0,  0,  1,  1,  0,   0,   0,  0,   0,  0,   0,  0,   1,   1,  0,  0,  1,  1,  0,  0,  0,  0,   0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0},
	/*19*/      {0,0,0,0,0,0,0,0,0,0,  0,  0,   0, 0,  0,  1,  1,  0,   0,   0,  0,   0,  0,   0,  0,   1,   1,  0,  0,  0,  0,  1,  1,  0,  0,   0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0},
	/*20*/      {0,0,0,0,0,0,0,0,0,0,  0,  0,   0, 0,  0,  1,  1,  0,   0,   1,  1,   0,  0,   0,  0,   0,   0,  0,  0,  0,  0,  1,  1,  0,  0,   0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0},
	/*21*/		{0,0,0,0,0,0,0,0,0,0,  0,  0,   0, 0,  0,  1,  1,  0,   0,   1,  1,   0,  0,   0,  0,   0,   0,  0,  0,  0,  0,  0,  0,  0,  0,   0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0},
	/*22*/      {0,0,0,0,0,0,0,0,0,0,  0,  0,   0, 0,  0,  1,  1,  0,   0,   1,  1,   0,  0,   0,  0,   1,   1,  0,  0,  0,  0,  0,  0,  0,  0,   0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0},
	/*23*/      {0,0,0,0,0,0,0,0,0,0,  0,  0,   0, 0,  0,  1,  1,  0,   0,   1,  1,   0,  0,   0,  0,   1,   1,  0,  0,  0,  0,  0,  0,  0,  0,   0,  0,  0,  1,  1,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0},
	/*24*/      {0,0,1,1,0,0,0,0,0,0,  0,  0,   0, 0,  0,  0,  0,  0,   0,   0,  0,   0,  0,   0,  0,   0,   0,  0,  0,  0,  0,  0,  0,  0,  0,   0,  0,  0,  1,  1,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0},
	/*25*/      {0,0,1,1,0,0,0,0,0,0,  0,  0,   0, 0,  0,  0,  0,  0,   0,   0,  0,   0,  0,   0,  0,   0,   0,  0,  0,  0,  0,  0,  0,  0,  0,   0,  0,  0,  1,  1,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0},
	/*26*/      {0,0,1,1,0,0,0,0,0,0,  0,  0,   0, 0,  0,  0,  0,  0,   0,   0,  0,   0,  0,   0,  0,   0,   0,  0,  0,  0,  0,  0,  0,  0,  0,   0,  0,  0,  1,  1,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0},
	/*27*/      {0,0,1,1,0,0,0,0,0,0,  0,  0,   0, 0,  0,  0,  0,  0,   0,   0,  0,   0,  0,   0,  0,   0,   0,  0,  0,  0,  0,  0,  0,  0,  0,   0,  0,  0,  1,  1,  0,  0,  1,  1,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0},
	/*28*/      {0,0,0,0,0,0,0,0,0,0,  0,  0,   0, 0,  0,  0,  0,  0,   0,   0,  0,   0,  0,   0,  0,   0,   0,  0,  0,  0,  0,  0,  0,  0,  0,   0,  0,  0,  1,  1,  0,  0,  1,  1,  0,  0,  1,  1,  0,  0,  0,  0,  0,  0,  0,  0},
	/*29*/      {0,0,0,0,0,0,0,0,0,0,  0,  0,   0, 0,  0,  0,  0,  0,   0,   0,  0,   0,  0,   0,  0,   0,   0,  0,  0,  0,  0,  0,  0,  0,  0,   0,  0,  0,  0,  0,  1,  1,  1,  1,  0,  0,  1,  1,  0,  0,  0,  0,  0,  0,  0,  0},
	/*30*/      {0,0,0,0,0,0,0,0,0,0,  0,  0,   0, 0,  0,  0,  0,  0,   0,   0,  0,   0,  0,   0,  0,   0,   0,  0,  0,  0,  0,  1,  1,  0,  0,   0,  0,  0,  0,  0,  1,  1,  1,  1,  0,  0,  1,  1,  0,  0,  0,  0,  0,  0,  0,  0},
	/*31*/		{0,0,0,0,0,0,0,0,0,0,  0,  0,   0, 0,  0,  0,  0,  0,   0,   0,  0,   0,  0,   0,  0,   0,   0,  0,  0,  0,  0,  1,  1,  0,  0,   0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  1,  1,  0,  0,  0,  0,  0,  0,  0,  0},
	/*32*/      {0,0,0,0,0,0,0,0,0,0,  0,  0,   0, 0,  0,  0,  0,  0,   0,   0,  0,   0,  0,   0,  0,   0,   0,  0,  0,  0,  0,  1,  1,  0,  0,   0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0},
	/*33*/      {0,0,0,0,0,0,0,0,0,0,  0,  0,   0, 0,  0,  0,  0,  0,   0,   0,  0,   0,  0,   0,  0,   0,   0,  0,  0,  0,  0,  1,  1,  0,  0,   0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0},
	/*34*/      {0,0,0,0,0,0,0,0,0,0,  0,  0,   0, 0,  0,  0,  0,  0,   0,   0,  0,   0,  0,   0,  0,   0,   0,  0,  0,  0,  0,  0,  0,  0,  1,   1,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0},
	/*35*/      {0,0,0,0,0,0,0,0,0,0,  0,  0,   0, 0,  0,  0,  0,  0,   0,   0,  0,   0,  0,   0,  0,   0,   0,  0,  0,  0,  0,  0,  0,  0,  1,   1,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0},
	/*36*/      {0,0,0,0,0,0,1,1,0,0,  0,  0,   0, 0,  0,  0,  0,  0,   0,   0,  0,   0,  0,   0,  0,   0,   0,  0,  0,  0,  0,  0,  0,  0,  1,   1,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0},
	/*37*/      {0,0,0,0,0,0,1,1,0,0,  0,  0,   0, 0,  0,  0,  0,  0,   0,   0,  0,   0,  0,   0,  0,   0,   0,  0,  0,  0,  1,  1,  1,  1,  1,   1,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0},
	/*38*/      {0,0,0,0,0,0,1,1,0,0,  0,  0,   0, 0,  0,  0,  0,  0,   0,   0,  0,   0,  0,   0,  0,   0,   0,  0,  0,  0,  1,  1,  1,  1,  1,   1,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0},
	/*39*/      {0,1,1,1,1,1,1,1,0,0,  0,  0,   0, 0,  0,  0,  0,  0,   0,   0,  0,   0,  0,   0,  0,   0,   0,  0,  0,  0,  0,  0,  0,  0,  1,   1,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0},
	/*40*/      {0,1,1,1,1,1,1,1,0,0,  0,  0,   0, 0,  0,  0,  0,  0,   0,   0,  0,   0,  0,   0,  0,   0,   0,  0,  0,  0,  0,  0,  0,  0,  1,   1,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0},
		};
		
		//水
		public static int[][] water = {
//			     1,2,3,4,5,6,7,8,9,10, 11, 12, 13, 14 15, 16, 17,  18, 19,  20,  21, 22,  23,  24, 25,  26,  27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56
	/*1*/		{0,0,0,0,0,0,0,0,0,0,  0,  0,   0, 0,  0,  0,  0,  0,   0,   0,  0,   0,  0,   0,  0,   0,   0,  0,  0,  0,  0,  0,  0,  0,  0,   0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0},
	/*2*/       {0,0,0,0,0,0,0,0,0,0,  0,  0,   0, 0,  0,  0,  0,  0,   0,   0,  0,   0,  0,   0,  0,   0,   0,  0,  0,  0,  0,  0,  0,  0,  0,   0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0},
	/*3*/       {0,0,0,0,0,0,0,0,0,0,  0,  0,   0, 0,  0,  0,  0,  0,   0,   0,  0,   0,  0,   0,  0,   0,   0,  0,  0,  0,  0,  0,  0,  0,  0,   0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0},
	/*4*/       {0,0,0,0,0,0,0,0,0,0,  0,  0,   0, 0,  0,  0,  0,  0,   0,   0,  0,   0,  0,   0,  0,   0,   0,  0,  0,  0,  0,  0,  0,  0,  0,   0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0},
	/*5*/       {0,0,0,0,0,0,0,0,0,0,  0,  0,   0, 0,  0,  0,  0,  0,   0,   0,  0,   0,  0,   0,  0,   0,   0,  0,  0,  0,  0,  0,  0,  0,  0,   0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0},
	/*6*/       {0,0,0,0,0,0,0,0,0,0,  0,  0,   0, 0,  0,  0,  0,  0,   0,   0,  0,   0,  0,   0,  0,   0,   0,  0,  0,  0,  0,  0,  0,  0,  0,   0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0},
	/*7*/       {0,0,0,0,0,0,0,0,0,0,  0,  0,   0, 0,  0,  0,  0,  0,   0,   0,  0,   0,  0,   0,  0,   0,   0,  0,  0,  0,  0,  0,  0,  0,  0,   0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0},
	/*8*/       {0,0,0,0,0,0,0,0,0,0,  0,  0,   0, 0,  0,  0,  0,  0,   0,   0,  0,   0,  0,   0,  0,   0,   0,  0,  0,  0,  0,  0,  0,  0,  0,   0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0},
	/*9*/       {0,0,0,0,0,0,0,0,0,0,  0,  0,   0, 0,  0,  0,  0,  0,   0,   0,  0,   0,  0,   0,  0,   0,   0,  0,  0,  0,  0,  0,  0,  0,  0,   0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0},
	/*10*/      {0,0,0,0,0,0,0,0,0,0,  0,  0,   0, 0,  0,  0,  0,  0,   0,   0,  0,   0,  0,   0,  0,   0,   0,  0,  0,  0,  0,  0,  0,  0,  0,   0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0},
	/*11*/		{0,0,0,0,0,0,0,0,0,0,  0,  0,   0, 0,  0,  0,  0,  0,   0,   0,  0,   0,  0,   0,  0,   0,   0,  0,  0,  0,  0,  0,  0,  0,  0,   0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0},
	/*12*/      {0,0,0,0,0,0,0,0,0,0,  0,  0,   0, 0,  0,  0,  0,  0,   0,   0,  0,   0,  0,   0,  0,   0,   0,  0,  0,  0,  0,  0,  0,  0,  0,   0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0},
	/*13*/      {0,0,0,0,0,0,0,0,0,0,  0,  0,   0, 0,  0,  0,  0,  0,   0,   0,  0,   0,  0,   0,  0,   0,   0,  0,  0,  0,  0,  0,  0,  0,  0,   0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0},
	/*14*/      {0,0,1,1,0,0,0,0,0,0,  0,  0,   0, 0,  0,  0,  0,  0,   0,   0,  0,   0,  0,   0,  0,   0,   0,  0,  0,  0,  0,  0,  0,  0,  0,   0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0},
	/*15*/      {0,0,1,1,0,0,0,0,0,0,  0,  0,   0, 0,  0,  0,  0,  0,   0,   0,  0,   0,  0,   0,  0,   0,   0,  0,  0,  0,  0,  0,  0,  0,  0,   0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0},
	/*16*/      {0,0,1,1,0,0,0,0,0,0,  0,  0,   0, 0,  0,  0,  0,  0,   0,   0,  0,   0,  0,   0,  0,   0,   0,  0,  0,  0,  0,  0,  0,  0,  0,   0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0},
	/*17*/      {0,0,1,1,0,0,0,0,0,0,  0,  0,   0, 0,  0,  0,  0,  0,   0,   0,  0,   0,  0,   0,  0,   0,   0,  0,  0,  0,  0,  0,  0,  0,  0,   0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0},
	/*18*/      {0,0,0,0,0,0,0,0,0,0,  0,  0,   0, 0,  0,  0,  0,  0,   0,   0,  0,   0,  0,   0,  0,   0,   0,  0,  0,  0,  0,  0,  0,  0,  0,   0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0},
	/*19*/      {0,0,0,0,0,0,0,0,0,0,  0,  0,   0, 0,  0,  0,  0,  0,   0,   0,  0,   0,  0,   0,  0,   0,   0,  0,  0,  0,  0,  0,  0,  0,  0,   0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0},
	/*20*/      {0,0,1,1,0,0,0,0,0,0,  0,  0,   0, 0,  0,  0,  0,  0,   0,   0,  0,   0,  0,   0,  0,   0,   0,  0,  0,  0,  0,  0,  0,  0,  0,   0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0},
	/*21*/		{0,0,1,1,0,0,0,0,0,0,  0,  0,   0, 0,  0,  0,  0,  0,   0,   0,  0,   0,  0,   0,  0,   0,   0,  0,  0,  0,  0,  0,  0,  0,  0,   0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0},
	/*22*/      {0,0,1,1,0,0,0,0,0,0,  0,  0,   0, 0,  0,  0,  0,  0,   0,   0,  0,   0,  0,   0,  0,   0,   0,  0,  0,  0,  0,  0,  0,  0,  0,   0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  1,  1,  0,  0,  0,  0,  0,  0,  0,  0},
	/*23*/      {0,0,1,1,0,0,0,0,0,0,  0,  0,   0, 0,  0,  0,  0,  0,   0,   0,  0,   0,  0,   0,  0,   0,   0,  0,  0,  0,  0,  0,  0,  0,  0,   0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  1,  1,  0,  0,  0,  0,  0,  0,  0,  0},
	/*24*/      {0,0,0,0,0,0,0,0,0,0,  0,  0,   0, 0,  0,  0,  0,  0,   0,   0,  0,   0,  0,   0,  0,   0,   0,  0,  0,  0,  0,  0,  0,  0,  0,   0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  1,  1,  0,  0,  0,  0,  0,  0,  0,  0},
	/*25*/      {0,0,0,0,0,0,0,0,0,0,  0,  0,   0, 0,  0,  0,  0,  0,   0,   0,  0,   0,  0,   0,  0,   0,   0,  0,  0,  0,  0,  0,  0,  0,  0,   0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  1,  1,  0,  0,  0,  0,  0,  0,  0,  0},
	/*26*/      {0,0,0,0,0,0,0,0,0,0,  0,  0,   0, 0,  0,  0,  0,  0,   0,   0,  0,   0,  0,   0,  0,   0,   0,  0,  0,  0,  0,  0,  0,  0,  0,   0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0},
	/*27*/      {0,0,0,0,0,0,0,0,0,0,  0,  0,   0, 0,  0,  0,  0,  0,   0,   0,  0,   0,  0,   0,  0,   0,   0,  0,  0,  0,  0,  0,  0,  0,  0,   0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0},
	/*28*/      {0,0,0,0,0,0,0,0,0,0,  0,  0,   0, 0,  0,  0,  0,  0,   0,   0,  0,   0,  0,   0,  0,   0,   0,  0,  0,  0,  0,  0,  0,  0,  0,   0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0},
	/*29*/      {0,0,0,0,0,0,0,0,0,0,  0,  0,   0, 0,  0,  0,  0,  0,   0,   0,  0,   0,  0,   0,  0,   0,   0,  0,  0,  0,  0,  0,  0,  0,  0,   0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0},
	/*30*/      {0,0,0,0,0,0,0,0,0,0,  0,  0,   0, 0,  0,  0,  0,  0,   0,   0,  0,   0,  0,   0,  0,   0,   0,  0,  0,  0,  0,  0,  0,  0,  0,   0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0},
	/*31*/		{0,0,0,0,0,0,0,0,0,0,  0,  0,   0, 0,  0,  0,  0,  0,   0,   0,  0,   0,  0,   0,  0,   0,   0,  0,  0,  0,  0,  0,  0,  0,  0,   0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0},
	/*32*/      {0,0,0,0,0,0,0,0,0,0,  0,  0,   0, 0,  0,  0,  0,  0,   0,   0,  0,   0,  0,   0,  0,   0,   0,  0,  0,  0,  0,  0,  0,  0,  0,   0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0},
	/*33*/      {0,0,0,0,0,0,0,0,0,0,  0,  0,   0, 0,  0,  0,  0,  0,   0,   0,  0,   0,  0,   0,  0,   0,   0,  0,  0,  0,  0,  0,  0,  0,  0,   0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0},
	/*34*/      {0,0,0,0,0,0,0,0,0,0,  0,  0,   0, 0,  0,  0,  0,  0,   0,   0,  0,   0,  0,   0,  0,   0,   0,  0,  0,  0,  0,  0,  0,  0,  0,   0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0},
	/*35*/      {0,0,0,0,0,0,0,0,0,0,  0,  0,   0, 0,  0,  0,  0,  0,   0,   0,  0,   0,  0,   0,  0,   0,   0,  0,  0,  0,  0,  0,  0,  0,  0,   0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0},
	/*36*/      {0,0,0,0,0,0,0,0,0,0,  0,  0,   0, 0,  0,  0,  0,  0,   0,   0,  0,   0,  0,   0,  0,   0,   0,  0,  0,  0,  0,  0,  0,  0,  0,   0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0},
	/*37*/      {0,0,0,0,0,0,0,0,0,0,  0,  0,   0, 0,  0,  0,  0,  0,   0,   0,  0,   0,  0,   0,  0,   0,   0,  0,  0,  0,  0,  0,  0,  0,  0,   0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0},
	/*38*/      {0,0,0,0,0,0,0,0,0,0,  0,  0,   0, 0,  0,  0,  0,  0,   0,   0,  0,   0,  0,   0,  0,   0,   0,  0,  0,  0,  0,  0,  0,  0,  0,   0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0},
	/*39*/      {0,0,0,0,0,0,0,0,0,0,  0,  0,   0, 0,  0,  0,  0,  0,   0,   0,  0,   0,  0,   0,  0,   0,   0,  0,  0,  0,  1,  1,  0,  0,  0,   0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0},
	/*40*/      {0,0,0,0,0,0,0,0,0,0,  0,  0,   0, 0,  0,  0,  0,  0,   0,   0,  0,   0,  0,   0,  0,   0,   0,  0,  0,  0,  1,  1,  0,  0,  0,   0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0},
		};


}
