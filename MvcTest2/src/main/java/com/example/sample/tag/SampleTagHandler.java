package com.example.sample.tag;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.TagSupport;

public class SampleTagHandler extends TagSupport {

	private String name;

	@Override
	public int doStartTag() throws JspException {
		try {
			pageContext.getOut().print("あなたが入力した名前は「" + name + "」です。");
		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			Logger.getLogger(SampleTagHandler.class.getName()).log(Level.SEVERE, null, e);
		}
		return SKIP_BODY;
	}

	@Override
	public int doEndTag() throws JspException {
		try {
			pageContext.getOut().write("こんにちは、<strong>%s</strong>さん");
		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			throw new JspException(e);
		}
		return EVAL_PAGE;
	}

	public void setName(String name) {
		this.name = name;
	}

}
