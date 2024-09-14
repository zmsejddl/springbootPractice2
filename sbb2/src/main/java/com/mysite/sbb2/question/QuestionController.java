package com.mysite.sbb2.question;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class QuestionController {

	@GetMapping("/question/list")
	@ResponseBody
	public String list() {
		return "question list";
	}
}
