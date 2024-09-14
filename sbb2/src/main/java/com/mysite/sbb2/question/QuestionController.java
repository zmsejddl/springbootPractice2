package com.mysite.sbb2.question;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class QuestionController {

	@GetMapping("/question/list")
	public String list() {
		return "question_list";
	}
}
