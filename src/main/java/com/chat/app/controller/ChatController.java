package com.chat.app.controller;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.chat.app.model.ChatMessage;

@Controller
public class ChatController {
	@MessageMapping("/sendMessage")
	@SendTo("/topic/messages")
  public ChatMessage send(ChatMessage message)
  {
	  return message;
  }

	@GetMapping
	public String chat() {
		return "chat";
	}


}
