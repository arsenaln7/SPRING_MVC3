package com.springbook.view.controller;

import java.util.HashMap;
import java.util.Map;

import com.springbook.view.user.GetBoardController;
import com.springbook.view.user.LoginController;
import com.springbook.view.user.LogoutController;
import com.srpingbook.view.board.DeleteBoardController;
import com.srpingbook.view.board.GetBoardListController;
import com.srpingbook.view.board.InsertBoardController;

public class HandlerMapping {
	private Map<String, Controller> mappings;
	
	public HandlerMapping(){
		mappings = new HashMap<String, Controller>();
		mappings.put("/login.do", new LoginController());
		mappings.put("/getBoardList.do", new GetBoardListController());
		mappings.put("/getBoard.do", new GetBoardController());
		mappings.put("/insertBoard.do", new InsertBoardController());
		mappings.put("/updateBoard.do", new UpdateBoardController());
		mappings.put("/deleteBoard.do", new DeleteBoardController());
		mappings.put("/logout.do", new LogoutController());
	}
	
	public Controller getController(String path){
		Controller controller = mappings.get(path);
		return controller;
	}
}
