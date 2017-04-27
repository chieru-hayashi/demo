package com.example;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	@RequestMapping("/")
	public String index() {
		return
				"<html>" +
				"<head>" +
				"<title>Index page</title>" +
				"</head>" +
				"<body>" +
				"<h1>Index page!</h1>" +
				"<div style=\"width: 300\">" +
				"<span style=\"width: 130; float: left; color: #CCCCCC\">&lt;&lt;</span>" +
				"<span style=\"width: 10;\">|</span>" +
				"<a href=\"/chieru\" style=\"width: 130; float: right;\">CHIeru page&nbsp;&gt;&gt;</a>" +
				"</div>" +
				"</body>" +
				"</html>";
	}

	@RequestMapping("/chieru")
	public String chieru() {
		return
				"<html>" +
				"<head>" +
				"<title>CHIeru page</title>" +
				"</head>" +
				"<body>" +
				"<h1>CHIeru page!</h1>" +
				"<div style=\"width: 300\">" +
				"<a href=\"/\" style=\"width: 130; float: left;\">&lt;&lt;&nbsp;Index page</a>" +
				"<span style=\"width: 10;\">|</span>" +
				"<a href=\"/chieru/demo\" style=\"width: 130; float: right;\">Demo page&nbsp;&gt;&gt;</a>" +
				"</div>" +
				"</body>" +
				"</html>";
	}

	@RequestMapping("/chieru/demo")
	public String demo() {
		return
				"<html>" +
				"<head>" +
				"<title>Demo page</title>" +
				"</head>" +
				"<body>" +
				"<h1>Demo page!</h1>" +
				"<div style=\"width: 300\">" +
				"<a href=\"/chieru\" style=\"width: 130; float: left;\">&lt;&lt;CHIeru page&nbsp;</a>" +
				"<span style=\"width: 10;\">|</span>" +
				"<span style=\"width: 130; float: right; color: #CCCCCC\">&gt;&gt;</span>" +
				"</div>" +
				"</body>" +
				"</html>";
	}
}
